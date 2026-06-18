package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class a3 {
    public b3[] a;
    public int b;
    public int c;
    public fz9 d;

    public final b3 d() {
        b3 b3VarE;
        fz9 fz9Var;
        synchronized (this) {
            try {
                b3[] b3VarArrG = this.a;
                if (b3VarArrG == null) {
                    b3VarArrG = g();
                    this.a = b3VarArrG;
                } else if (this.b >= b3VarArrG.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(b3VarArrG, b3VarArrG.length * 2);
                    this.a = (b3[]) objArrCopyOf;
                    b3VarArrG = (b3[]) objArrCopyOf;
                }
                int i = this.c;
                do {
                    b3VarE = b3VarArrG[i];
                    if (b3VarE == null) {
                        b3VarE = e();
                        b3VarArrG[i] = b3VarE;
                    }
                    i++;
                    if (i >= b3VarArrG.length) {
                        i = 0;
                    }
                } while (!b3VarE.a(this));
                this.c = i;
                this.b++;
                fz9Var = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (fz9Var != null) {
            fz9Var.w(1);
        }
        return b3VarE;
    }

    public abstract b3 e();

    public abstract b3[] g();

    public final void h(b3 b3Var) {
        fz9 fz9Var;
        int i;
        jt1[] jt1VarArrB;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                fz9Var = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                b3Var.getClass();
                jt1VarArrB = b3Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (jt1 jt1Var : jt1VarArrB) {
            if (jt1Var != null) {
                jt1Var.resumeWith(heb.a);
            }
        }
        if (fz9Var != null) {
            fz9Var.w(-1);
        }
    }

    public final fz9 i() {
        fz9 fz9Var;
        synchronized (this) {
            fz9Var = this.d;
            if (fz9Var == null) {
                int i = this.b;
                fz9Var = new fz9(1, Integer.MAX_VALUE, ar0.b);
                fz9Var.f(Integer.valueOf(i));
                this.d = fz9Var;
            }
        }
        return fz9Var;
    }
}
