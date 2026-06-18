package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ro4 extends qtb {
    public final ou2 c;
    public final qp3 d;
    public final ly8 e;
    public boolean t;
    public yd5 w;
    public final fr9 f = gr9.a(new jo4(lc3.a, true, false, true));
    public String s = "";
    public boolean u = true;
    public final LinkedHashMap v = new LinkedHashMap();

    public ro4(ou2 ou2Var, qp3 qp3Var, f4b f4bVar, ly8 ly8Var) {
        this.c = ou2Var;
        this.d = qp3Var;
        this.e = ly8Var;
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new no4(this, null, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.ro4 r10, java.lang.String r11, java.lang.String r12, defpackage.kt1 r13) {
        /*
            java.util.LinkedHashMap r1 = r10.v
            boolean r0 = r13 instanceof defpackage.qo4
            if (r0 == 0) goto L15
            r0 = r13
            qo4 r0 = (defpackage.qo4) r0
            int r2 = r0.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.e = r2
            goto L1a
        L15:
            qo4 r0 = new qo4
            r0.<init>(r10, r13)
        L1a:
            java.lang.Object r13 = r0.c
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            xm3 r11 = r0.b
            java.lang.String r12 = r0.a
            defpackage.e11.e0(r13)     // Catch: java.lang.Throwable -> L2b
            goto L6a
        L2b:
            r0 = move-exception
            r13 = r0
            goto L77
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            r10 = 0
            return r10
        L35:
            defpackage.e11.e0(r13)
            java.lang.Object r13 = r1.get(r11)
            r4 = r13
            xm3 r4 = (defpackage.xm3) r4
            if (r4 != 0) goto L43
            goto Lb7
        L43:
            r8 = 0
            r9 = 44
            r5 = 1
            r6 = 0
            r7 = 0
            xm3 r13 = defpackage.xm3.a(r4, r5, r6, r7, r8, r9)
            r1.put(r11, r13)
            r10.k()
            ou2 r13 = r10.c     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = ""
            r0.a = r11     // Catch: java.lang.Throwable -> L74
            r0.b = r4     // Catch: java.lang.Throwable -> L74
            r0.e = r3     // Catch: java.lang.Throwable -> L74
            uu2 r13 = (defpackage.uu2) r13     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r13 = r13.a(r11, r12, r2, r0)     // Catch: java.lang.Throwable -> L6e
            xx1 r12 = defpackage.xx1.a
            if (r13 != r12) goto L68
            return r12
        L68:
            r12 = r11
            r11 = r4
        L6a:
            sk0 r13 = (defpackage.sk0) r13     // Catch: java.lang.Throwable -> L2b
        L6c:
            r4 = r11
            goto L7e
        L6e:
            r0 = move-exception
            r12 = r0
            r13 = r12
        L71:
            r12 = r11
            r11 = r4
            goto L77
        L74:
            r0 = move-exception
            r13 = r0
            goto L71
        L77:
            pm8 r0 = new pm8
            r0.<init>(r13)
            r13 = r0
            goto L6c
        L7e:
            boolean r11 = r13 instanceof defpackage.pm8
            if (r11 != 0) goto La1
            r11 = r13
            sk0 r11 = (defpackage.sk0) r11
            java.util.ArrayList r8 = r11.a
            java.lang.String r11 = r11.b
            int r11 = r11.length()
            if (r11 <= 0) goto L91
        L8f:
            r7 = r3
            goto L93
        L91:
            r3 = 0
            goto L8f
        L93:
            r6 = 0
            r9 = 12
            r5 = 0
            xm3 r11 = defpackage.xm3.a(r4, r5, r6, r7, r8, r9)
            r1.put(r12, r11)
            r10.k()
        La1:
            java.lang.Throwable r11 = defpackage.qm8.a(r13)
            if (r11 == 0) goto Lb7
            r8 = 0
            r9 = 60
            r5 = 0
            r6 = 1
            r7 = 0
            xm3 r11 = defpackage.xm3.a(r4, r5, r6, r7, r8, r9)
            r1.put(r12, r11)
            r10.k()
        Lb7:
            heb r10 = defpackage.heb.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro4.j(ro4, java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    public final void k() {
        Object value;
        jo4 jo4Var;
        ArrayList arrayList;
        fr9 fr9Var = this.f;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
                jo4Var = (jo4) value;
                Collection collectionValues = this.v.values();
                collectionValues.getClass();
                arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    xm3 xm3Var = (xm3) obj;
                    boolean z = this.u;
                    boolean z2 = this.t;
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
            } while (!fr9Var.j(value, jo4.a(jo4Var, false, false, false, arrayList, 7)));
        }
    }
}
