package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class qr6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oja b;
    public final /* synthetic */ ac4 c;
    public final /* synthetic */ kb4 d;

    public /* synthetic */ qr6(oja ojaVar, ac4 ac4Var, kb4 kb4Var, int i) {
        this.a = i;
        this.b = ojaVar;
        this.c = ac4Var;
        this.d = kb4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        Object obj4 = vl1.a;
        kb4 kb4Var = this.d;
        oja ojaVar = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    String str = ojaVar.a;
                    int i2 = ojaVar.d;
                    int i3 = ojaVar.c;
                    boolean zF = dd4Var.f(str) | dd4Var.d(i3) | dd4Var.d(i2);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj4) {
                        objQ = ojaVar.a.substring(i3, i2 + 1);
                        dd4Var.p0(objQ);
                    }
                    String str2 = (String) objQ;
                    List list = ojaVar.g;
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    ur9 ur9Var = s96.a;
                    ou6 ou6VarQ = kc5.Q(gjb.l0(fe.L(t96.w(ou6VarF, ((q96) dd4Var.j(ur9Var)).c.c), dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G), 12.0f), kc5.J(dd4Var), 14);
                    boolean zF2 = dd4Var.f(kb4Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj4) {
                        objQ2 = new ir6(5, kb4Var);
                        dd4Var.p0(objQ2);
                    }
                    sw1.u(str2, list, ou6VarQ, this.c, (ib4) objQ2, dd4Var, 0);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    String str3 = ojaVar.a;
                    int i4 = ojaVar.d;
                    int i5 = ojaVar.c;
                    boolean zF3 = dd4Var2.f(str3) | dd4Var2.d(i5) | dd4Var2.d(i4);
                    Object objQ3 = dd4Var2.Q();
                    if (zF3 || objQ3 == obj4) {
                        objQ3 = ojaVar.a.substring(i5, i4 + 1);
                        dd4Var2.p0(objQ3);
                    }
                    String str4 = (String) objQ3;
                    List list2 = ojaVar.g;
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    ur9 ur9Var2 = s96.a;
                    ou6 ou6VarQ2 = kc5.Q(gjb.l0(fe.L(t96.w(ou6VarF2, ((q96) dd4Var2.j(ur9Var2)).c.c), dd1.g(((q96) dd4Var2.j(ur9Var2)).a, 1.0f), jf0.G), 12.0f), kc5.J(dd4Var2), 14);
                    boolean zF4 = dd4Var2.f(kb4Var);
                    Object objQ4 = dd4Var2.Q();
                    if (zF4 || objQ4 == obj4) {
                        objQ4 = new ir6(4, kb4Var);
                        dd4Var2.p0(objQ4);
                    }
                    sw1.u(str4, list2, ou6VarQ2, this.c, (ib4) objQ4, dd4Var2, 0);
                }
                break;
        }
        return hebVar;
    }
}
