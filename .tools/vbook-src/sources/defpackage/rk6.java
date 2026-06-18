package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class rk6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ Set d;

    public /* synthetic */ rk6(Set set, kb4 kb4Var, Set set2, int i) {
        this.a = i;
        this.b = set;
        this.c = kb4Var;
        this.d = set2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        Object pm8Var;
        f36 f36Var;
        int i = this.a;
        Object obj4 = vl1.a;
        lu6 lu6Var = lu6.a;
        heb hebVar = heb.a;
        Set<String> set = this.d;
        kb4 kb4Var = this.c;
        Set set2 = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c44) obj).getClass();
                if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strK = wn9.K((pv9) vt9.D.getValue(), dd4Var);
                    boolean zIsEmpty = set2.isEmpty();
                    boolean zF = dd4Var.f(kb4Var);
                    Object objQ = dd4Var.Q();
                    Object obj5 = objQ;
                    if (zF || objQ == obj4) {
                        tk6 tk6Var = new tk6(0, kb4Var);
                        dd4Var.p0(tk6Var);
                        obj5 = tk6Var;
                    }
                    rw1.B(0, (ib4) obj5, dd4Var, null, null, null, strK, zIsEmpty);
                    List listR = wm9.r((hv9) rv.c.getValue(), dd4Var);
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Number) it.next()).intValue();
                        if (iIntValue2 > 0) {
                            dd4Var.f0(827925952);
                            String str = (String) fc1.A0(iIntValue2 - 1, listR);
                            String str2 = str == null ? "" : str;
                            boolean zContains = set2.contains(Integer.valueOf(iIntValue2));
                            boolean zF2 = dd4Var.f(kb4Var) | dd4Var.d(iIntValue2);
                            Object objQ2 = dd4Var.Q();
                            Object obj6 = objQ2;
                            if (zF2 || objQ2 == obj4) {
                                bk0 bk0Var = new bk0(kb4Var, iIntValue2, 4);
                                dd4Var.p0(bk0Var);
                                obj6 = bk0Var;
                            }
                            rw1.B(0, (ib4) obj6, dd4Var, null, null, null, str2, zContains);
                            dd4Var.q(false);
                        } else {
                            dd4Var.f0(828288249);
                            dd4Var.q(false);
                        }
                    }
                } else {
                    dd4Var.Y();
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c44) obj).getClass();
                if (dd4Var2.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strK2 = wn9.K((pv9) vt9.D.getValue(), dd4Var2);
                    boolean zIsEmpty2 = set2.isEmpty();
                    boolean zF3 = dd4Var2.f(kb4Var);
                    Object objQ3 = dd4Var2.Q();
                    Object obj7 = objQ3;
                    if (zF3 || objQ3 == obj4) {
                        b41 b41Var = new b41(29, kb4Var);
                        dd4Var2.p0(b41Var);
                        obj7 = b41Var;
                    }
                    rw1.B(0, (ib4) obj7, dd4Var2, null, null, null, strK2, zIsEmpty2);
                    for (String str3 : set) {
                        boolean zF4 = dd4Var2.f(str3);
                        Object objQ4 = dd4Var2.Q();
                        if (zF4 || objQ4 == obj4) {
                            str3.getClass();
                            String strI = iw9.I(bw9.B0(str3).toString(), '_', '-');
                            if (strI.length() == 0 || strI.equalsIgnoreCase("und")) {
                                strI = null;
                            }
                            if (strI == null) {
                                f36Var = null;
                            } else {
                                try {
                                    pm8Var = new f36(tw1.n(strI));
                                } catch (Throwable th) {
                                    pm8Var = new pm8(th);
                                }
                                boolean z = pm8Var instanceof pm8;
                                Object obj8 = pm8Var;
                                if (z) {
                                    obj8 = null;
                                }
                                f36Var = (f36) obj8;
                            }
                            String strA = f36Var != null ? f36Var.a() : null;
                            if (strA == null) {
                                strA = "";
                            }
                            objQ4 = strA.length() == 0 ? str3 : strA;
                            dd4Var2.p0(objQ4);
                        }
                        String str4 = (String) objQ4;
                        boolean zContains2 = set2.contains(str3);
                        boolean zF5 = dd4Var2.f(kb4Var) | dd4Var2.f(str3);
                        Object objQ5 = dd4Var2.Q();
                        if (zF5 || objQ5 == obj4) {
                            objQ5 = new sk6(1, kb4Var, str3);
                            dd4Var2.p0(objQ5);
                        }
                        rw1.B(0, (ib4) objQ5, dd4Var2, null, null, null, str4, zContains2);
                    }
                } else {
                    dd4Var2.Y();
                }
                break;
            case 2:
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((c44) obj).getClass();
                if (dd4Var3.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String strK3 = wn9.K((pv9) vt9.D.getValue(), dd4Var3);
                    boolean zIsEmpty3 = set2.isEmpty();
                    boolean zF6 = dd4Var3.f(kb4Var);
                    Object objQ6 = dd4Var3.Q();
                    Object obj9 = objQ6;
                    if (zF6 || objQ6 == obj4) {
                        b41 b41Var2 = new b41(28, kb4Var);
                        dd4Var3.p0(b41Var2);
                        obj9 = b41Var2;
                    }
                    rw1.B(0, (ib4) obj9, dd4Var3, null, null, null, strK3, zIsEmpty3);
                    for (String str5 : set) {
                        boolean zContains3 = set2.contains(str5);
                        boolean zF7 = dd4Var3.f(kb4Var) | dd4Var3.f(str5);
                        Object objQ7 = dd4Var3.Q();
                        if (zF7 || objQ7 == obj4) {
                            objQ7 = new sk6(0, kb4Var, str5);
                            dd4Var3.p0(objQ7);
                        }
                        rw1.B(0, (ib4) objQ7, dd4Var3, null, null, null, str5, zContains3);
                    }
                } else {
                    dd4Var3.Y();
                }
                break;
            case 3:
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var4.V(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    yn2.b(gjb.m0(tg9.f(lu6Var, 1.0f), 14.0f, 12.0f), new mv(8.0f, true, new gp(5)), new mv(8.0f, true, new gp(5)), (wf0) null, 0, 0, jf0.G(-1909888079, new rk6(set2, kb4Var, set, z ? 1 : 0), dd4Var4), dd4Var4, 1573302);
                } else {
                    dd4Var4.Y();
                }
                break;
            case 4:
                dd4 dd4Var5 = (dd4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var5.V(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    yn2.b(gjb.m0(tg9.f(lu6Var, 1.0f), 14.0f, 12.0f), new mv(8.0f, true, new gp(5)), new mv(8.0f, true, new gp(5)), (wf0) null, 0, 0, jf0.G(437850920, new rk6(set2, kb4Var, set, i2), dd4Var5), dd4Var5, 1573302);
                } else {
                    dd4Var5.Y();
                }
                break;
            default:
                dd4 dd4Var6 = (dd4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var6.V(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    yn2.b(gjb.m0(tg9.f(lu6Var, 1.0f), 14.0f, 12.0f), new mv(8.0f, true, new gp(5)), new mv(8.0f, true, new gp(5)), (wf0) null, 0, 0, jf0.G(1703921705, new rk6(set2, kb4Var, set, 2), dd4Var6), dd4Var6, 1573302);
                } else {
                    dd4Var6.Y();
                }
                break;
        }
        return hebVar;
    }
}
