package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g04 implements bh8 {
    public final li a;

    public g04(li liVar) {
        this.a = liVar;
    }

    @Override // defpackage.bh8
    public final Bitmap Z(ja5 ja5Var, int i) throws Exception {
        int i2;
        Bitmap bitmapCreateBitmap;
        ja5 ja5Var2 = ja5Var;
        int i3 = ja5Var2.d;
        int i4 = ja5Var2.c;
        int i5 = ja5Var2.b;
        int i6 = ja5Var2.a;
        li liVar = this.a;
        long j = liVar.o0().a;
        int i7 = iw9.D(liVar.o0().b, "image/webp", true) ? i < 1 ? 1 : i : 0;
        if (i7 > 0) {
            int i8 = i6 - i7;
            if (i8 < 0) {
                i8 = 0;
            }
            int i9 = i5 - i7;
            if (i9 < 0) {
                i9 = 0;
            }
            int i10 = i4 + i7;
            int i11 = oa5.c;
            i2 = 1;
            int i12 = (int) (j >> 32);
            if (i10 > i12) {
                i10 = i12;
            }
            int i13 = i3 + i7;
            int i14 = (int) (j & 4294967295L);
            if (i13 > i14) {
                i13 = i14;
            }
            ja5Var2 = new ja5(i8, i9, i10, i13);
        } else {
            i2 = 1;
        }
        Bitmap bitmapZ = liVar.Z(ja5Var2, i);
        int i15 = i2;
        int iMax = Math.max(i15, (((i4 - i6) + i) - 1) / i);
        int iMax2 = Math.max(i15, (((i3 - i5) + i) - i15) / i);
        if (i7 > 0) {
            int i16 = (i6 - ja5Var2.a) / i;
            int i17 = (i5 - ja5Var2.b) / i;
            int width = bitmapZ.getWidth() - i16;
            if (width > iMax) {
                width = iMax;
            }
            int height = bitmapZ.getHeight() - i17;
            if (height > iMax2) {
                height = iMax2;
            }
            if (i16 > 0 || i17 > 0 || width != bitmapZ.getWidth() || height != bitmapZ.getHeight()) {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapZ, i16, i17, width, height);
                bitmapCreateBitmap2.getClass();
                if (bitmapCreateBitmap2 != bitmapZ) {
                    bitmapZ.recycle();
                }
                bitmapZ = bitmapCreateBitmap2;
            }
        }
        if (bitmapZ.getWidth() == iMax && bitmapZ.getHeight() == iMax2) {
            bitmapZ.prepareToDraw();
            return bitmapZ;
        }
        if (bitmapZ.getWidth() >= iMax && bitmapZ.getHeight() >= iMax2) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapZ, 0, 0, iMax, iMax2);
        } else if (bitmapZ.getWidth() == iMax && bitmapZ.getHeight() == iMax2) {
            bitmapCreateBitmap = bitmapZ;
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint(2);
            paint.setFilterBitmap(false);
            paint.setAntiAlias(false);
            canvas.drawBitmap(bitmapZ, 0.0f, 0.0f, paint);
            if (bitmapZ.getWidth() < iMax) {
                canvas.drawBitmap(bitmapZ, new Rect(bitmapZ.getWidth() - 1, 0, bitmapZ.getWidth(), bitmapZ.getHeight()), new Rect(bitmapZ.getWidth(), 0, iMax, bitmapZ.getHeight()), paint);
            }
            if (bitmapZ.getHeight() < iMax2) {
                canvas.drawBitmap(bitmapZ, new Rect(0, bitmapZ.getHeight() - 1, Math.min(bitmapZ.getWidth(), iMax), bitmapZ.getHeight()), new Rect(0, bitmapZ.getHeight(), Math.min(bitmapZ.getWidth(), iMax), iMax2), paint);
            }
            if (bitmapZ.getWidth() < iMax && bitmapZ.getHeight() < iMax2) {
                canvas.drawBitmap(bitmapZ, new Rect(bitmapZ.getWidth() - 1, bitmapZ.getHeight() - 1, bitmapZ.getWidth(), bitmapZ.getHeight()), new Rect(bitmapZ.getWidth(), bitmapZ.getHeight(), iMax, iMax2), paint);
            }
        }
        bitmapCreateBitmap.getClass();
        if (bitmapCreateBitmap != bitmapZ) {
            bitmapZ.recycle();
        }
        bitmapCreateBitmap.prepareToDraw();
        return bitmapCreateBitmap;
    }

    @Override // defpackage.bh8
    public final bh8 c() {
        return new g04((li) this.a.c());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g04)) {
            return false;
        }
        return this.a.equals(((g04) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.bh8
    public final void j() throws Throwable {
        this.a.j();
    }

    @Override // defpackage.bh8
    public final q05 o0() {
        return this.a.o0();
    }

    public final String toString() {
        return "FixedSizeRegionDecoder(" + this.a + ")";
    }
}
