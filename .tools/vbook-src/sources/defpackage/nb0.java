package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class nb0 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;

    public /* synthetic */ nb0(a07 a07Var, int i) {
        this.a = i;
        this.b = a07Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        cx5 cx5Var;
        sa0 sa0Var;
        int i = this.a;
        Object obj4 = vl1.a;
        heb hebVar = heb.a;
        a07 a07Var = this.b;
        switch (i) {
            case 0:
                c37 c37Var = (c37) obj;
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var.f(c37Var) ? 4 : 2;
                }
                if (dd4Var.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                    List list = (List) a07Var.getValue();
                    boolean z = (iIntValue & 14) == 4;
                    Object objQ = dd4Var.Q();
                    if (z || objQ == obj4) {
                        objQ = new f0(c37Var, 4);
                        dd4Var.p0(objQ);
                    }
                    kb4 kb4Var = (kb4) objQ;
                    if (list instanceof RandomAccess) {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (((Boolean) kb4Var.invoke(list.get(i2))).booleanValue()) {
                                cx5Var = cx5.e;
                            }
                        }
                        cx5Var = cx5.c;
                    } else {
                        if (list == null || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((Boolean) kb4Var.invoke(it.next())).booleanValue()) {
                                    cx5Var = cx5.e;
                                }
                            }
                        }
                        cx5Var = cx5.c;
                    }
                    jv3.e(r26.a.a(vw1.M(cx5Var, dd4Var)), jf0.G(-1713684244, new ob0(c37Var, 0), dd4Var), dd4Var, 56);
                } else {
                    dd4Var.Y();
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p35 p35VarC = i25.c((m53) f53.i0.getValue(), dd4Var2, 0);
                    boolean zF = dd4Var2.f(a07Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zF || objQ2 == obj4) {
                        objQ2 = new ik(a07Var, 10);
                        dd4Var2.p0(objQ2);
                    }
                    sw1.r(p35VarC, (ou6) null, 0L, (ib4) objQ2, dd4Var2, 0, 6);
                } else {
                    dd4Var2.Y();
                }
                break;
            case 2:
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var3.V(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    p35 p35VarC2 = i25.c((m53) f53.i0.getValue(), dd4Var3, 0);
                    boolean zF2 = dd4Var3.f(a07Var);
                    Object objQ3 = dd4Var3.Q();
                    if (zF2 || objQ3 == obj4) {
                        objQ3 = new bv1(a07Var, 16);
                        dd4Var3.p0(objQ3);
                    }
                    sw1.r(p35VarC2, (ou6) null, 0L, (ib4) objQ3, dd4Var3, 0, 6);
                } else {
                    dd4Var3.Y();
                }
                break;
            case 3:
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    p35 p35VarC3 = i25.c((m53) a53.a0.getValue(), dd4Var4, 0);
                    boolean zF3 = dd4Var4.f(a07Var);
                    Object objQ4 = dd4Var4.Q();
                    if (zF3 || objQ4 == obj4) {
                        objQ4 = new zl3(a07Var, 7);
                        dd4Var4.p0(objQ4);
                    }
                    sw1.r(p35VarC3, (ou6) null, 0L, (ib4) objQ4, dd4Var4, 0, 6);
                } else {
                    dd4Var4.Y();
                }
                break;
            case 4:
                dd4 dd4Var5 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                long j = ((q96) dd4Var5.j(s96.a)).a.h;
                k14 k14Var = new k14(2.0f, jf0.E, jf0.C, jf0.D);
                boolean zF4 = dd4Var5.f(a07Var);
                Object objQ5 = dd4Var5.Q();
                if (zF4 || objQ5 == obj4) {
                    objQ5 = new zl3(a07Var, 20);
                    dd4Var5.p0(objQ5);
                }
                ww1.g((ib4) objQ5, null, null, j, 0L, k14Var, sdc.f, dd4Var5, 12582912, 86);
                break;
            case 5:
                dd4 dd4Var6 = (dd4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var6.V(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    p35 p35VarC4 = i25.c((m53) f53.i0.getValue(), dd4Var6, 0);
                    boolean zF5 = dd4Var6.f(a07Var);
                    Object objQ6 = dd4Var6.Q();
                    if (zF5 || objQ6 == obj4) {
                        objQ6 = new zl3(a07Var, 22);
                        dd4Var6.p0(objQ6);
                    }
                    sw1.r(p35VarC4, (ou6) null, 0L, (ib4) objQ6, dd4Var6, 0, 6);
                } else {
                    dd4Var6.Y();
                }
                break;
            case 6:
                dd4 dd4Var7 = (dd4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((c44) obj).getClass();
                if (dd4Var7.V(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    List listR = wm9.r((hv9) rv.b.getValue(), dd4Var7);
                    int size2 = listR.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        String str = (String) listR.get(i3);
                        boolean z2 = i3 == ((Number) a07Var.getValue()).intValue();
                        boolean zF6 = dd4Var7.f(a07Var) | dd4Var7.d(i3);
                        Object objQ7 = dd4Var7.Q();
                        if (zF6 || objQ7 == obj4) {
                            objQ7 = new ii6(i3, a07Var, 0);
                            dd4Var7.p0(objQ7);
                        }
                        fz1.C(0, (ib4) objQ7, dd4Var7, null, null, null, str, z2);
                        i3++;
                    }
                } else {
                    dd4Var7.Y();
                }
                break;
            case 7:
                dd4 dd4Var8 = (dd4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var8.V(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    nha.c(String.valueOf((int) ((Number) a07Var.getValue()).floatValue()), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var8.j(s96.a)).b.j, dd4Var8, 0, 0, 131070);
                } else {
                    dd4Var8.Y();
                }
                break;
            case 8:
                float fFloatValue = ((Float) obj2).floatValue();
                va0 va0Var = (va0) obj3;
                va0Var.getClass();
                a07Var.setValue(new nx4(((eb7) obj).a, fFloatValue, va0Var, true));
                break;
            default:
                rj1 rj1Var = vo1.b;
                dd4 dd4Var9 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                Float fValueOf = Float.valueOf(((nx4) a07Var.getValue()).b);
                int iOrdinal = ((nx4) a07Var.getValue()).c.ordinal();
                if (iOrdinal == 0) {
                    sa0Var = sa0.a;
                } else if (iOrdinal != 1) {
                    mn5.g();
                } else {
                    sa0Var = sa0.b;
                }
                rj1Var.g(fValueOf, sa0Var, dd4Var9, 0);
                break;
        }
        return hebVar;
    }
}
