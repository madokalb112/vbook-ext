package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sra implements nra {
    public final qt a;
    public final fr9 b = gr9.a(null);
    public final fr9 c = gr9.a(null);
    public final fr9 d = gr9.a(null);
    public final fr9 e = gr9.a(null);
    public final fr9 f = gr9.a(null);
    public final fr9 g = gr9.a(null);
    public final fr9 h = gr9.a(null);
    public final fr9 i = gr9.a(null);
    public final fr9 j = gr9.a(null);
    public final fr9 k = gr9.a(null);
    public final fr9 l = gr9.a(null);
    public final fr9 m = gr9.a(null);
    public final fr9 n = gr9.a(null);
    public final fr9 o = gr9.a(null);
    public final fr9 p = gr9.a(null);
    public final fr9 q = gr9.a(null);
    public final fr9 r = gr9.a(null);
    public final iw0 s;

    public sra(qt qtVar) {
        this.a = qtVar;
        aj2 aj2Var = rw2.a;
        nh2 nh2Var = nh2.c;
        iw0 iw0VarB = wx1.b(nh2Var);
        this.s = iw0VarB;
        ah1.J(iw0VarB, nh2Var, null, new qoa(this, (jt1) null, 8), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(defpackage.sra r4, defpackage.kt1 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.rra
            if (r0 == 0) goto L13
            r0 = r5
            rra r0 = (defpackage.rra) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            rra r0 = new rra
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r4 = r0.b
            int r5 = r0.d
            r1 = 1
            if (r5 == 0) goto L2e
            if (r5 != r1) goto L27
            te5 r5 = r0.a
            defpackage.e11.e0(r4)
            goto L44
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r4)
            te5 r5 = defpackage.ue5.d
            r0.a = r5
            r0.d = r1
            ur9 r4 = defpackage.tl8.a
            java.lang.String r4 = "composeResources/com.reader.resources/files/theme.json"
            java.lang.Object r4 = defpackage.lf2.b(r4)
            xx1 r0 = defpackage.xx1.a
            if (r4 != r0) goto L44
            return r0
        L44:
            byte[] r4 = (byte[]) r4
            java.lang.String r4 = defpackage.iw9.z(r4)
            r5.getClass()
            wv r0 = new wv
            tv9 r1 = defpackage.tv9.a
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Object r4 = r5.a(r0, r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.gc1.M(r4, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L6a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            kra r1 = new kra
            java.lang.String r2 = "none"
            r1.<init>(r0, r0, r2)
            r5.add(r1)
            goto L6a
        L81:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sra.a(sra, kt1):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [pm8] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final List b(sra sraVar) {
        Object pm8Var;
        ?? pm8Var2;
        String str;
        qt qtVar = sraVar.a;
        String str2 = (String) qtVar.r.c(qt.T[16], qtVar);
        boolean zA0 = bw9.a0(str2);
        lc3 lc3Var = lc3.a;
        if (zA0) {
            return lc3Var;
        }
        try {
            te5 te5Var = ue5.d;
            te5Var.getClass();
            pm8Var = (List) te5Var.a(new wv(kra.Companion.serializer(), 0), str2);
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        if (qm8.a(pm8Var) != null) {
            try {
                te5 te5Var2 = ue5.d;
                te5Var2.getClass();
                Iterable<qra> iterable = (Iterable) te5Var2.a(new wv(qra.Companion.serializer(), 0), str2);
                pm8Var2 = new ArrayList(gc1.M(iterable, 10));
                for (qra qraVar : iterable) {
                    bv4 bv4Var = xr.b;
                    String str3 = qraVar.c;
                    bv4Var.getClass();
                    xr xrVarS = bv4.s(str3);
                    pm8Var2.add(new kra(qraVar.a, qraVar.b, (xrVarS != xr.c || (str = qraVar.c) == null || bw9.a0(str)) ? xrVarS.a : "image"));
                }
            } catch (Throwable th2) {
                pm8Var2 = new pm8(th2);
            }
            ?? r1 = lc3Var;
            if (!(pm8Var2 instanceof pm8)) {
                r1 = pm8Var2;
            }
            pm8Var = (List) r1;
        }
        return (List) pm8Var;
    }

    public final u31 c() {
        return new u31(this.b, 2);
    }

    public final void d(String str, String str2, xr xrVar) {
        str.getClass();
        str2.getClass();
        qt qtVar = this.a;
        da7 da7Var = qtVar.c;
        ni5[] ni5VarArr = qt.T;
        da7Var.e(ni5VarArr[1], str);
        qtVar.d.e(ni5VarArr[2], str2);
        String str3 = xrVar.a;
        qtVar.e.e(ni5VarArr[3], str3);
        kra kraVar = new kra(str, str2, str3);
        fr9 fr9Var = this.b;
        fr9Var.getClass();
        fr9Var.l(null, kraVar);
    }
}
