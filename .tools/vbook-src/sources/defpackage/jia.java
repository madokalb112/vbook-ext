package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class jia implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fba b;
    public final /* synthetic */ ib4 c;
    public final /* synthetic */ a07 d;

    public /* synthetic */ jia(fba fbaVar, ib4 ib4Var, a07 a07Var, int i) {
        this.a = i;
        this.b = fbaVar;
        this.c = ib4Var;
        this.d = a07Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj4 = vl1.a;
        a07 a07Var = this.d;
        ib4 ib4Var = this.c;
        fba fbaVar = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    String str = fbaVar.a;
                    String str2 = fbaVar.h;
                    Object objQ = dd4Var.Q();
                    if (objQ == obj4) {
                        objQ = new vb9(a07Var, 19);
                        dd4Var.p0(objQ);
                    }
                    ib4 ib4Var2 = (ib4) objQ;
                    boolean zF = dd4Var.f(ib4Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF || objQ2 == obj4) {
                        objQ2 = new w03(ib4Var, a07Var, 6);
                        dd4Var.p0(objQ2);
                    }
                    wn9.k(str, str2, ib4Var2, (ib4) objQ2, dd4Var, 3456);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    String str3 = fbaVar.a;
                    String str4 = fbaVar.h;
                    Object objQ3 = dd4Var2.Q();
                    if (objQ3 == obj4) {
                        objQ3 = new vb9(a07Var, 20);
                        dd4Var2.p0(objQ3);
                    }
                    ib4 ib4Var3 = (ib4) objQ3;
                    boolean zF2 = dd4Var2.f(ib4Var);
                    Object objQ4 = dd4Var2.Q();
                    if (zF2 || objQ4 == obj4) {
                        objQ4 = new w03(ib4Var, a07Var, 7);
                        dd4Var2.p0(objQ4);
                    }
                    wn9.k(str3, str4, ib4Var3, (ib4) objQ4, dd4Var2, 3456);
                }
                break;
        }
        return hebVar;
    }
}
