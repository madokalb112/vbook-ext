package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.os.Build;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class li implements bh8 {
    public final ty9 a;
    public final s25 b;
    public final d6a c;
    public BufferedInputStream d;
    public BitmapRegionDecoder e;
    public final d6a f;

    public li(ty9 ty9Var, s25 s25Var, q05 q05Var) {
        ty9Var.getClass();
        s25Var.getClass();
        this.a = ty9Var;
        this.b = s25Var;
        this.c = new d6a(new ub(this, 4));
        this.f = new d6a(new y6(2, q05Var, this));
    }

    @Override // defpackage.bh8
    public final Bitmap Z(ja5 ja5Var, int i) throws Exception {
        j();
        String lowerCase = o0().b.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        options.inPreferredConfig = (lowerCase.equals("image/webp") || lowerCase.equals("image/png")) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        BitmapRegionDecoder bitmapRegionDecoder = this.e;
        bitmapRegionDecoder.getClass();
        d6a d6aVar = this.c;
        ja5 ja5VarB = ((yi3) d6aVar.getValue()).b(ja5Var, o0().a);
        Rect rect = new Rect(ja5VarB.a, ja5VarB.b, ja5VarB.c, ja5VarB.d);
        int width = bitmapRegionDecoder.getWidth();
        int height = bitmapRegionDecoder.getHeight();
        if (width <= 0 || height <= 0) {
            gp.k(xv5.o("Invalid decoder size: ", width, height, "x"));
            return null;
        }
        int i2 = width - 1;
        int iQ = wx1.Q(rect.left, 0, i2);
        int i3 = height - 1;
        int iQ2 = wx1.Q(rect.top, 0, i3);
        int iQ3 = wx1.Q(rect.right, iQ + 1, width);
        int iQ4 = wx1.Q(rect.bottom, iQ2 + 1, height);
        if (iQ3 <= iQ) {
            if (i2 < 0) {
                i2 = 0;
            }
            iQ = i2;
        } else {
            width = iQ3;
        }
        if (iQ4 <= iQ2) {
            iQ2 = i3 >= 0 ? i3 : 0;
        } else {
            height = iQ4;
        }
        Bitmap bitmapDecodeRegion = bitmapRegionDecoder.decodeRegion(new Rect(iQ, iQ2, width, height), options);
        if (bitmapDecodeRegion != null) {
            return yi3.a((yi3) d6aVar.getValue(), bitmapDecodeRegion);
        }
        throw new Exception("Invalid image. region decode return null");
    }

    @Override // defpackage.bh8
    public final bh8 c() {
        return new li(this.a, this.b, o0());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        BitmapRegionDecoder bitmapRegionDecoder = this.e;
        if (bitmapRegionDecoder != null) {
            bitmapRegionDecoder.recycle();
        }
        BufferedInputStream bufferedInputStream = this.d;
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || li.class != obj.getClass()) {
            return false;
        }
        li liVar = (li) obj;
        return lc5.Q(this.a, liVar.a) && lc5.Q(this.b, liVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.bh8
    public final void j() throws Throwable {
        Object pm8Var;
        if (this.d == null || this.e == null) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new mh0(tu1.s(this.b.a()), 3), 8192);
            this.d = bufferedInputStream;
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    pm8Var = BitmapRegionDecoder.newInstance(bufferedInputStream);
                    pm8Var.getClass();
                } else {
                    pm8Var = BitmapRegionDecoder.newInstance((InputStream) bufferedInputStream, false);
                    pm8Var.getClass();
                }
            } catch (Throwable th) {
                pm8Var = new pm8(th);
            }
            if (!(pm8Var instanceof pm8)) {
                e11.e0(pm8Var);
                this.e = (BitmapRegionDecoder) pm8Var;
                return;
            }
            try {
                bufferedInputStream.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
            Throwable thA = qm8.a(pm8Var);
            thA.getClass();
            throw thA;
        }
    }

    @Override // defpackage.bh8
    public final q05 o0() {
        return (q05) this.f.getValue();
    }

    public final String toString() {
        return "AndroidRegionDecoder(subsamplingImage=" + this.a + ", imageSource=" + this.b + ")";
    }
}
