package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class i91 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ a07 c;

    public /* synthetic */ i91(a07 a07Var, a07 a07Var2, int i) {
        this.a = i;
        this.b = a07Var;
        this.c = a07Var2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.c;
        a07 a07Var2 = this.b;
        switch (i) {
            case 0:
                a07Var2.setValue(xp4.a((xp4) a07Var2.getValue(), 0.0f, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), 0.0f, 9));
                ((kb4) a07Var.getValue()).invoke((xp4) a07Var2.getValue());
                break;
            case 1:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    lu6 lu6Var = lu6.a;
                    ou6 ou6VarH = xv5.h(lu6Var, 4.0f, dd4Var, lu6Var, 1.0f);
                    eq8 eq8VarA = dq8.a(new mv(12.0f, true, new gp(5)), bv4.w, dd4Var, 6);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarH);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(ll1.f, dd4Var, eq8VarA);
                    un9.s(ll1.e, dd4Var, lr7VarL);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL0);
                    String strK = wn9.K((pv9) eu9.n0.getValue(), dd4Var);
                    String str = (String) a07Var2.getValue();
                    if (1.0f <= 0.0d) {
                        o75.a("invalid weight; must be greater than zero");
                    }
                    bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    boolean zF = dd4Var.f(a07Var2);
                    Object objQ = dd4Var.Q();
                    Object obj3 = vl1.a;
                    if (zF || objQ == obj3) {
                        objQ = new wf3(a07Var2, 10);
                        dd4Var.p0(objQ);
                    }
                    tw1.a(strK, str, bp5Var, (kb4) objQ, dd4Var, 0);
                    String strK2 = wn9.K((pv9) eu9.o0.getValue(), dd4Var);
                    String str2 = (String) a07Var.getValue();
                    if (1.0f <= 0.0d) {
                        o75.a("invalid weight; must be greater than zero");
                    }
                    bp5 bp5Var2 = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    boolean zF2 = dd4Var.f(a07Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj3) {
                        objQ2 = new wf3(a07Var, 11);
                        dd4Var.p0(objQ2);
                    }
                    tw1.a(strK2, str2, bp5Var2, (kb4) objQ2, dd4Var, 0);
                    dd4Var.q(true);
                }
                break;
            case 2:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                a07Var2.setValue(str3);
                a07Var.setValue(str4);
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                Boolean bool2 = (Boolean) obj2;
                bool2.getClass();
                a07Var2.setValue(bool);
                a07Var.setValue(bool2);
                break;
            case 4:
                String str5 = (String) obj;
                String str6 = (String) obj2;
                str5.getClass();
                str6.getClass();
                a07Var2.setValue(str5);
                a07Var.setValue(str6);
                break;
            default:
                String str7 = (String) obj;
                String str8 = (String) obj2;
                str7.getClass();
                str8.getClass();
                a07Var2.setValue(str7);
                a07Var.setValue(str8);
                break;
        }
        return hebVar;
    }
}
