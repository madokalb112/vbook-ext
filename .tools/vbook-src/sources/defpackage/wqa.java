package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wqa implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hra b;

    public /* synthetic */ wqa(hra hraVar, int i) {
        this.a = i;
        this.b = hraVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[LOOP:0: B:22:0x004d->B:27:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int r4, defpackage.jt1 r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof defpackage.yqa
            if (r4 == 0) goto L13
            r4 = r5
            yqa r4 = (defpackage.yqa) r4
            int r0 = r4.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.c = r0
            goto L18
        L13:
            yqa r4 = new yqa
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.a
            int r0 = r4.c
            r1 = 0
            r2 = 1
            hra r3 = r3.b
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L28
            defpackage.e11.e0(r5)
            goto L46
        L28:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r3)
            r3 = 0
            return r3
        L2f:
            defpackage.e11.e0(r5)
            boolean r5 = r3.v()
            if (r5 == 0) goto L49
            defpackage.hra.M(r3, r2)
            r4.c = r2
            java.lang.Object r4 = defpackage.hra.N(r3, r1, r4)
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L46
            return r5
        L46:
            defpackage.hra.M(r3, r1)
        L49:
            fr9 r4 = r3.a0
            if (r4 == 0) goto L5c
        L4d:
            java.lang.Object r5 = r4.getValue()
            r0 = r5
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r5 = r4.j(r5, r0)
            if (r5 == 0) goto L4d
        L5c:
            defpackage.hra.R(r3)
            heb r3 = defpackage.heb.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqa.a(int, jt1):java.lang.Object");
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        fr9 fr9Var;
        Object value6;
        int i = this.a;
        jt1 jt1Var2 = null;
        heb hebVar = heb.a;
        hra hraVar = this.b;
        switch (i) {
            case 0:
                hraVar.b0.k((List) obj);
                hraVar.g(vtb.a(hraVar), rw2.a, new vpa(hraVar, jt1Var2, i));
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fr9 fr9Var2 = hraVar.k0;
                if (fr9Var2 != null) {
                    do {
                        value = fr9Var2.getValue();
                    } while (!fr9Var2.j(value, fba.a((fba) value, null, null, null, null, null, 0, false, null, false, null, false, false, false, false, false, zBooleanValue, false, false, 458751)));
                }
                break;
            case 2:
                yd5 yd5Var = hraVar.N0;
                if (yd5Var != null) {
                    yd5Var.cancel(null);
                }
                hraVar.N0 = hraVar.g(vtb.a(hraVar), rw2.a, new vpa(hraVar, jt1Var2, 3));
                break;
            case 3:
                xl7 xl7Var = (xl7) obj;
                Object obj2 = xl7Var.a;
                List list = (List) xl7Var.b;
                List list2 = (List) obj2;
                fr9 fr9Var3 = hraVar.g0;
                if (fr9Var3 != null) {
                    do {
                        value3 = fr9Var3.getValue();
                    } while (!fr9Var3.j(value3, list2));
                }
                fr9 fr9Var4 = hraVar.h0;
                if (fr9Var4 != null) {
                    do {
                        value2 = fr9Var4.getValue();
                    } while (!fr9Var4.j(value2, list));
                }
                if (hraVar.H0) {
                    hra.O(hraVar);
                    hra.P(hraVar);
                }
                break;
            case 4:
                xl7 xl7Var2 = (xl7) obj;
                Object obj3 = xl7Var2.a;
                List list3 = (List) xl7Var2.b;
                List<ova> list4 = (List) obj3;
                int iO = y86.O(gc1.M(list3, 10));
                if (iO < 16) {
                    iO = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
                for (Object obj4 : list3) {
                    linkedHashMap.put(((c21) obj4).c, obj4);
                }
                hraVar.c0 = linkedHashMap;
                int iO2 = y86.O(gc1.M(list4, 10));
                if (iO2 < 16) {
                    iO2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iO2);
                for (Object obj5 : list4) {
                    linkedHashMap2.put(((ova) obj5).a, obj5);
                }
                hraVar.d0 = linkedHashMap2;
                int iO3 = y86.O(gc1.M(list4, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iO3 >= 16 ? iO3 : 16);
                for (ova ovaVar : list4) {
                    linkedHashMap3.put(new Integer(ovaVar.e), ovaVar.a);
                }
                hraVar.e0 = linkedHashMap3;
                fr9 fr9Var5 = hraVar.Z;
                fr9Var5.getClass();
                fr9Var5.l(null, list3);
                hra.R(hraVar);
                break;
            case 5:
                break;
            case 6:
                e8b e8bVar = (e8b) obj;
                boolean zQ = lc5.Q(hraVar.H, e8bVar.a);
                fr9 fr9Var6 = hraVar.q0;
                if (zQ) {
                    if (fr9Var6 != null) {
                        do {
                            value4 = fr9Var6.getValue();
                        } while (!fr9Var6.j(value4, aoa.a((aoa) value4, e8bVar.d, 0, 0, 0, 28)));
                    }
                } else if (fr9Var6 != null) {
                    do {
                        value5 = fr9Var6.getValue();
                    } while (!fr9Var6.j(value5, new aoa()));
                }
                break;
            default:
                f8b f8bVar = (f8b) obj;
                if (lc5.Q(f8bVar.a, hraVar.H) && (fr9Var = hraVar.q0) != null) {
                    do {
                        value6 = fr9Var.getValue();
                    } while (!fr9Var.j(value6, aoa.a((aoa) value6, false, f8bVar.b, f8bVar.c, f8bVar.d, 3)));
                }
                break;
        }
        return hebVar;
    }
}
