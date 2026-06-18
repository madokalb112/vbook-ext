package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dv2 implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv2 b;

    public /* synthetic */ dv2(jv2 jv2Var, int i) {
        this.a = i;
        this.b = jv2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.vm3 r6, defpackage.jt1 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.gv2
            if (r0 == 0) goto L13
            r0 = r7
            gv2 r0 = (defpackage.gv2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            gv2 r0 = new gv2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            jv2 r5 = r5.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            fr9 r6 = r0.b
            vm3 r0 = r0.a
            defpackage.e11.e0(r7)
            goto L4e
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r3
        L32:
            defpackage.e11.e0(r7)
            fr9 r7 = r5.D
            f4b r1 = r5.L
            r0.a = r6
            r0.b = r7
            r0.e = r2
            j4b r1 = (defpackage.j4b) r1
            java.lang.Integer r0 = r1.h()
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r4 = r0
            r0 = r6
            r6 = r7
            r7 = r4
        L4e:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 != r2) goto L5b
            if (r0 == 0) goto L5b
            java.lang.String r7 = r0.h
            goto L5c
        L5b:
            r7 = r3
        L5c:
            r6.k(r7)
            fr9 r5 = r5.x
            if (r0 == 0) goto L66
            java.util.Map r6 = r0.r
            goto L67
        L66:
            r6 = r3
        L67:
            if (r6 != 0) goto L6b
            mc3 r6 = defpackage.mc3.a
        L6b:
            r5.getClass()
            r5.l(r3, r6)
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv2.a(vm3, jt1):java.lang.Object");
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        Object value;
        Object value2;
        switch (this.a) {
            case 0:
                i7b i7bVar = (i7b) obj;
                Object obj2 = i7bVar.a;
                Object obj3 = i7bVar.b;
                ac9 ac9Var = (ac9) i7bVar.c;
                List list = (List) obj3;
                ((Number) obj2).longValue();
                boolean zIsEmpty = list.isEmpty();
                fr9 fr9Var = this.b.M;
                if (zIsEmpty) {
                    if (fr9Var != null) {
                        do {
                            value = fr9Var.getValue();
                        } while (!fr9Var.j(value, lz5.a((lz5) value, 0L, false, false, null, false, ac9Var.b, ac9Var.c, false, null, list, 413)));
                    }
                } else if (fr9Var != null) {
                    do {
                        value2 = fr9Var.getValue();
                    } while (!fr9Var.j(value2, lz5.a((lz5) value2, 0L, false, false, null, false, ac9Var.b, ac9Var.c, false, null, list, 413)));
                }
                return heb.a;
            default:
                return a((vm3) obj, jt1Var);
        }
    }
}
