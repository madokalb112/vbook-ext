package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class dq2 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ho2 b;
    public final /* synthetic */ wq2 c;
    public final /* synthetic */ pj7 d;
    public final /* synthetic */ kb4 e;

    public /* synthetic */ dq2(ho2 ho2Var, wq2 wq2Var, pj7 pj7Var, kb4 kb4Var, int i) {
        this.a = i;
        this.b = ho2Var;
        this.c = wq2Var;
        this.d = pj7Var;
        this.e = kb4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj4 = vl1.a;
        lu6 lu6Var = lu6.a;
        final kb4 kb4Var = this.e;
        wq2 wq2Var = this.c;
        final ho2 ho2Var = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    String str = ho2Var.b;
                    String str2 = ho2Var.d;
                    String str3 = ho2Var.e;
                    String str4 = ho2Var.c;
                    boolean z = ho2Var.m;
                    String str5 = wq2Var.b;
                    String str6 = str5 == null ? "" : str5;
                    String str7 = wq2Var.h;
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.h(ho2Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj4) {
                        final int i2 = 1;
                        objQ = new ib4() { // from class: hq2
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i3 = i2;
                                heb hebVar2 = heb.a;
                                ho2 ho2Var2 = ho2Var;
                                kb4 kb4Var2 = kb4Var;
                                switch (i3) {
                                    case 0:
                                        kb4Var2.invoke(ho2Var2.j);
                                        break;
                                    default:
                                        kb4Var2.invoke(ho2Var2.j);
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var.p0(objQ);
                    }
                    fw.j(str, str2, str3, str4, z, str6, str7, this.d, ou6VarF, (ib4) objQ, dd4Var, 100663296);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    String str8 = ho2Var.b;
                    String str9 = ho2Var.d;
                    String str10 = ho2Var.e;
                    String str11 = ho2Var.c;
                    boolean z2 = ho2Var.m;
                    String str12 = wq2Var.b;
                    String str13 = str12 == null ? "" : str12;
                    String str14 = wq2Var.h;
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    boolean zF2 = dd4Var2.f(kb4Var) | dd4Var2.h(ho2Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj4) {
                        final int i3 = 0;
                        objQ2 = new ib4() { // from class: hq2
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i32 = i3;
                                heb hebVar2 = heb.a;
                                ho2 ho2Var2 = ho2Var;
                                kb4 kb4Var2 = kb4Var;
                                switch (i32) {
                                    case 0:
                                        kb4Var2.invoke(ho2Var2.j);
                                        break;
                                    default:
                                        kb4Var2.invoke(ho2Var2.j);
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var2.p0(objQ2);
                    }
                    fw.j(str8, str9, str10, str11, z2, str13, str14, this.d, ou6VarF2, (ib4) objQ2, dd4Var2, 100663296);
                }
                break;
        }
        return hebVar;
    }
}
