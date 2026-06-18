package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lva {
    public static final long b;
    public final fq9 a;

    static {
        mc8 mc8Var = k63.b;
        o63 o63Var = o63.MILLISECONDS;
        b = lx1.A0(4000L, o63Var);
        lx1.z0(10000, o63Var);
    }

    public lva(fq9 fq9Var) {
        fq9Var.getClass();
        this.a = fq9Var;
    }

    public static void c(lva lvaVar, String str) {
        lvaVar.getClass();
        str.getClass();
        fq9 fq9Var = lvaVar.a;
        long jE = k63.e(b);
        fq9Var.getClass();
        fq9Var.b(new eq9(str, yab.b, r95.a.k().c() + jE));
    }

    public static void d(lva lvaVar, String str) {
        lvaVar.getClass();
        str.getClass();
        fq9 fq9Var = lvaVar.a;
        long jE = k63.e(b);
        fq9Var.getClass();
        fq9Var.b(new eq9(str, yab.d, r95.a.k().c() + jE));
    }

    public final void a(long j, String str) {
        str.getClass();
        long jE = k63.e(j);
        fq9 fq9Var = this.a;
        fq9Var.getClass();
        fq9Var.b(new eq9(str, yab.c, r95.a.k().c() + jE));
    }
}
