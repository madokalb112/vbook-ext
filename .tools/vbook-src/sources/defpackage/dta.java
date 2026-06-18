package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dta implements AutoCloseable {
    public final l46 a;
    public final bh8 b;
    public boolean c;
    public final ArrayList d;
    public final Object e;
    public int f;
    public final q05 s;

    public dta(l46 l46Var, bh8 bh8Var) {
        l46Var.getClass();
        bh8Var.getClass();
        this.a = l46Var;
        this.b = bh8Var;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new Object();
        this.s = bh8Var.o0();
        arrayList.add(bh8Var);
        this.f++;
        g46 g46Var = g46.b;
        if (l46Var.a(g46Var)) {
            String str = "TileDecoder. useDecoder. regionDecoderCount=" + this.f + ". " + this.b;
            xg xgVar = l46Var.b;
            String str2 = l46Var.a;
            xgVar.getClass();
            xg.a(g46Var, str2, str);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean z;
        synchronized (this.e) {
            z = this.c;
        }
        if (z) {
            return;
        }
        this.c = true;
        l46 l46Var = this.a;
        l46Var.getClass();
        g46 g46Var = g46.b;
        if (l46Var.a(g46Var)) {
            String str = "TileDecoder. close. " + this.b;
            xg xgVar = l46Var.b;
            String str2 = l46Var.a;
            xgVar.getClass();
            xg.a(g46Var, str2, str);
        }
        synchronized (this.e) {
            try {
                ArrayList arrayList = this.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    bh8 bh8Var = (bh8) obj;
                    bh8Var.getClass();
                    try {
                        j39.t(bh8Var);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                }
                this.d.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap p(ja5 ja5Var, int i) {
        boolean z;
        bh8 bh8VarC;
        synchronized (this.e) {
            z = this.c;
        }
        if (z) {
            k27.h(this.b, "TileDecoder is closed. ");
            return null;
        }
        synchronized (this.e) {
            bh8VarC = this.d.isEmpty() ? null : (bh8) this.d.remove(0);
        }
        if (bh8VarC == null) {
            this.f++;
            l46 l46Var = this.a;
            l46Var.getClass();
            g46 g46Var = g46.b;
            if (l46Var.a(g46Var)) {
                String str = "TileDecoder. useDecoder. regionDecoderCount=" + this.f + ". " + this.b;
                xg xgVar = l46Var.b;
                String str2 = l46Var.a;
                xgVar.getClass();
                xg.a(g46Var, str2, str);
            }
            bh8VarC = this.b.c();
        }
        Bitmap bitmapZ = bh8VarC.Z(ja5Var, i);
        synchronized (this.e) {
            if (this.c) {
                try {
                    j39.t(bh8VarC);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            } else {
                this.d.add(bh8VarC);
            }
        }
        return bitmapZ;
    }

    public final String toString() {
        return "TileDecoder(" + this.b + ')';
    }
}
