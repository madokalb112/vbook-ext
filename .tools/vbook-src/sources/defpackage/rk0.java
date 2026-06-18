package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rk0 extends qtb {
    public yd5 C;
    public final String c;
    public final aw5 d;
    public final ou2 e;
    public final dp2 f;
    public final qp3 s;
    public final ly8 t;
    public final xg6 u;
    public boolean z;
    public final fr9 v = gr9.a(new jk0(true, "", false, true, lc3.a));
    public final fr9 w = gr9.a(new kk0(false, false, null, null, ""));
    public final pp1 x = new pp1();
    public String y = "";
    public boolean A = true;
    public final LinkedHashMap B = new LinkedHashMap();

    public rk0(String str, aw5 aw5Var, ou2 ou2Var, dp2 dp2Var, qp3 qp3Var, ly8 ly8Var, xg6 xg6Var) {
        this.c = str;
        this.d = aw5Var;
        this.e = ou2Var;
        this.f = dp2Var;
        this.s = qp3Var;
        this.t = ly8Var;
        this.u = xg6Var;
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new rf(this, null, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.rk0 r10, java.lang.String r11, java.lang.String r12, defpackage.kt1 r13) {
        /*
            java.util.LinkedHashMap r1 = r10.B
            boolean r0 = r13 instanceof defpackage.pk0
            if (r0 == 0) goto L15
            r0 = r13
            pk0 r0 = (defpackage.pk0) r0
            int r2 = r0.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.e = r2
            goto L1a
        L15:
            pk0 r0 = new pk0
            r0.<init>(r10, r13)
        L1a:
            java.lang.Object r13 = r0.c
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L32
            xm3 r11 = r0.b
            java.lang.String r12 = r0.a
            defpackage.e11.e0(r13)     // Catch: java.lang.Throwable -> L2d
            r4 = r11
            r11 = r12
            goto L6b
        L2d:
            r0 = move-exception
            r13 = r0
            r4 = r11
            r11 = r12
            goto L75
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            r10 = 0
            return r10
        L39:
            defpackage.e11.e0(r13)
            java.lang.Object r13 = r1.get(r11)
            r4 = r13
            xm3 r4 = (defpackage.xm3) r4
            if (r4 != 0) goto L46
            goto Laa
        L46:
            r8 = 0
            r9 = 44
            r5 = 1
            r6 = 0
            r7 = 0
            xm3 r13 = defpackage.xm3.a(r4, r5, r6, r7, r8, r9)
            r1.put(r11, r13)
            r10.l()
            ou2 r13 = r10.e     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = ""
            r0.a = r11     // Catch: java.lang.Throwable -> L6f
            r0.b = r4     // Catch: java.lang.Throwable -> L6f
            r0.e = r3     // Catch: java.lang.Throwable -> L6f
            uu2 r13 = (defpackage.uu2) r13     // Catch: java.lang.Throwable -> L72
            java.lang.Object r13 = r13.a(r11, r12, r2, r0)     // Catch: java.lang.Throwable -> L72
            xx1 r12 = defpackage.xx1.a
            if (r13 != r12) goto L6b
            return r12
        L6b:
            sk0 r13 = (defpackage.sk0) r13     // Catch: java.lang.Throwable -> L6f
        L6d:
            r2 = r4
            goto L7c
        L6f:
            r0 = move-exception
            r13 = r0
            goto L75
        L72:
            r0 = move-exception
            r12 = r0
            r13 = r12
        L75:
            pm8 r12 = new pm8
            r12.<init>(r13)
            r13 = r12
            goto L6d
        L7c:
            boolean r12 = r13 instanceof defpackage.pm8
            if (r12 != 0) goto L94
            r12 = r13
            sk0 r12 = (defpackage.sk0) r12
            java.util.ArrayList r6 = r12.a
            r5 = 0
            r7 = 12
            r3 = 0
            r4 = 0
            xm3 r12 = defpackage.xm3.a(r2, r3, r4, r5, r6, r7)
            r1.put(r11, r12)
            r10.l()
        L94:
            java.lang.Throwable r12 = defpackage.qm8.a(r13)
            if (r12 == 0) goto Laa
            r6 = 0
            r7 = 60
            r3 = 0
            r4 = 1
            r5 = 0
            xm3 r12 = defpackage.xm3.a(r2, r3, r4, r5, r6, r7)
            r1.put(r11, r12)
            r10.l()
        Laa:
            heb r10 = defpackage.heb.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk0.j(rk0, java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    public final void k(String str) {
        String str2;
        str.getClass();
        if (str.equals(this.y)) {
            return;
        }
        this.y = str;
        fr9 fr9Var = this.v;
        if (fr9Var != null) {
            while (true) {
                Object value = fr9Var.getValue();
                str2 = str;
                if (fr9Var.j(value, jk0.a((jk0) value, true, str2, false, false, null, 28))) {
                    break;
                } else {
                    str = str2;
                }
            }
        } else {
            str2 = str;
        }
        yd5 yd5Var = this.C;
        jt1 jt1Var = null;
        if (yd5Var != null) {
            yd5Var.cancel(null);
        }
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        this.C = g(za1VarA, nh2.c, new mk0(this, str2, jt1Var, 1));
    }

    public final void l() {
        Object value;
        jk0 jk0Var;
        ArrayList arrayList;
        fr9 fr9Var = this.v;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
                jk0Var = (jk0) value;
                Collection collectionValues = this.B.values();
                collectionValues.getClass();
                arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    xm3 xm3Var = (xm3) obj;
                    boolean z = this.A;
                    boolean z2 = this.z;
                    boolean z3 = true;
                    if (z) {
                        z3 = z2 ? false : false;
                    } else if (!z2) {
                        z3 = xm3Var.d.q;
                    }
                    if (z3) {
                        arrayList.add(obj);
                    }
                }
            } while (!fr9Var.j(value, jk0.a(jk0Var, false, null, false, false, arrayList, 15)));
        }
    }
}
