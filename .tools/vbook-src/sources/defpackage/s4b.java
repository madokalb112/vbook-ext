package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s4b extends qtb {
    public boolean A;
    public List B;
    public List C;
    public List D;
    public final String c;
    public final String d;
    public final aw5 e;
    public final qp3 f;
    public final f4b s;
    public final fr9 t;
    public final t07 u;
    public v5b v;
    public String w;
    public String x;
    public String y;
    public int z;

    public s4b(String str, String str2, aw5 aw5Var, qp3 qp3Var, f4b f4bVar) {
        this.c = str;
        this.d = str2;
        this.e = aw5Var;
        this.f = qp3Var;
        this.s = f4bVar;
        lc3 lc3Var = lc3.a;
        this.t = gr9.a(new k4b(true, "", "", "", false, "", "", 0, lc3Var, lc3Var, lc3Var));
        this.u = u07.a();
        this.w = "";
        this.x = "";
        this.y = "";
        this.B = lc3Var;
        this.C = lc3Var;
        this.D = lc3Var;
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new yl0(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.s4b r4, java.lang.String r5, defpackage.kt1 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.n4b
            if (r0 == 0) goto L13
            r0 = r6
            n4b r0 = (defpackage.n4b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            n4b r0 = new n4b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            t07 r5 = r0.b
            java.lang.String r0 = r0.a
            defpackage.e11.e0(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r3
        L32:
            defpackage.e11.e0(r6)
            t07 r6 = r4.u
            r0.a = r5
            r0.b = r6
            r0.e = r2
            java.lang.Object r0 = r6.p(r0)
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L46
            return r1
        L46:
            v5b r0 = r4.v     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L64
            f4b r0 = r4.s     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = r4.c     // Catch: java.lang.Throwable -> L62
            j4b r0 = (defpackage.j4b) r0     // Catch: java.lang.Throwable -> L62
            r0.getClass()     // Catch: java.lang.Throwable -> L62
            r5.getClass()     // Catch: java.lang.Throwable -> L62
            r1.getClass()     // Catch: java.lang.Throwable -> L62
            x5b r0 = r0.c     // Catch: java.lang.Throwable -> L62
            v5b r0 = r0.d(r5, r1)     // Catch: java.lang.Throwable -> L62
            r4.v = r0     // Catch: java.lang.Throwable -> L62
            goto L64
        L62:
            r4 = move-exception
            goto L68
        L64:
            r6.q(r3)
            return r0
        L68:
            r6.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s4b.j(s4b, java.lang.String, kt1):java.lang.Object");
    }

    public final void d() {
        if (this.v != null) {
            String str = this.w;
            j4b j4bVar = (j4b) this.s;
            j4bVar.getClass();
            str.getClass();
            String str2 = this.c;
            str2.getClass();
            j4bVar.c.a(str, str2);
        }
    }
}
