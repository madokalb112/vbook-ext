package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ok6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ a07 c;

    public /* synthetic */ ok6(List list, a07 a07Var, int i) {
        this.a = i;
        this.b = list;
        this.c = a07Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj4 = vl1.a;
        int i2 = 0;
        a07 a07Var = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c44) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    int size = list.size();
                    while (i2 < size) {
                        xg5 xg5Var = (xg5) list.get(i2);
                        boolean zEquals = xg5Var.b().equals((String) a07Var.getValue());
                        String strB = xg5Var.b();
                        boolean zH = dd4Var.h(xg5Var);
                        Object objQ = dd4Var.Q();
                        if (zH || objQ == obj4) {
                            objQ = new vf6(13, xg5Var, a07Var);
                            dd4Var.p0(objQ);
                        }
                        fz1.C(0, (ib4) objQ, dd4Var, null, null, null, strB, zEquals);
                        i2++;
                    }
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c44) obj).getClass();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    int size2 = list.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        String str = (String) list.get(i3);
                        boolean z = ((Number) a07Var.getValue()).intValue() == i3;
                        boolean zD = dd4Var2.d(i3);
                        Object objQ2 = dd4Var2.Q();
                        if (zD || objQ2 == obj4) {
                            objQ2 = new ii6(i3, a07Var, 1);
                            dd4Var2.p0(objQ2);
                        }
                        fz1.C(0, (ib4) objQ2, dd4Var2, null, null, null, str, z);
                        i3++;
                    }
                }
                break;
            case 2:
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c44) obj).getClass();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    dd4Var3.Y();
                } else {
                    int size3 = list.size();
                    while (i2 < size3) {
                        oz0 oz0Var = (oz0) list.get(i2);
                        boolean zF = dd4Var3.f((List) a07Var.getValue()) | dd4Var3.f(oz0Var);
                        Object objQ3 = dd4Var3.Q();
                        if (zF || objQ3 == obj4) {
                            objQ3 = Boolean.valueOf(((List) a07Var.getValue()).contains(oz0Var.a));
                            dd4Var3.p0(objQ3);
                        }
                        boolean zBooleanValue = ((Boolean) objQ3).booleanValue();
                        String str2 = oz0Var.b;
                        boolean zF2 = dd4Var3.f(a07Var) | dd4Var3.g(zBooleanValue) | dd4Var3.h(oz0Var);
                        Object objQ4 = dd4Var3.Q();
                        if (zF2 || objQ4 == obj4) {
                            objQ4 = new no(zBooleanValue, oz0Var, a07Var, 2);
                            dd4Var3.p0(objQ4);
                        }
                        fz1.C(0, (ib4) objQ4, dd4Var3, null, null, null, str2, zBooleanValue);
                        i2++;
                    }
                }
                break;
            default:
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((c44) obj).getClass();
                if (!dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    dd4Var4.Y();
                } else {
                    int size4 = list.size();
                    int i4 = 0;
                    while (i4 < size4) {
                        String str3 = (String) list.get(i4);
                        boolean z2 = ((Number) a07Var.getValue()).intValue() == i4;
                        boolean zD2 = dd4Var4.d(i4);
                        Object objQ5 = dd4Var4.Q();
                        if (zD2 || objQ5 == obj4) {
                            objQ5 = new ii6(i4, a07Var, 2);
                            dd4Var4.p0(objQ5);
                        }
                        fz1.C(0, (ib4) objQ5, dd4Var4, null, null, null, str3, z2);
                        i4++;
                    }
                }
                break;
        }
        return hebVar;
    }
}
