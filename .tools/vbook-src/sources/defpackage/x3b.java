package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class x3b implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ ib4 d;

    public /* synthetic */ x3b(String str, kb4 kb4Var, ib4 ib4Var, int i) {
        this.a = i;
        this.b = str;
        this.c = kb4Var;
        this.d = ib4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        fu6 fu6Var = vl1.a;
        final kb4 kb4Var = this.c;
        boolean z = false;
        final int i2 = 1;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((co0) obj).getClass();
        int i3 = iIntValue & 17;
        switch (i) {
            case 0:
                if (!dd4Var.V(iIntValue & 1, i3 != 16)) {
                    dd4Var.Y();
                } else {
                    boolean zF = dd4Var.f(kb4Var);
                    Object objQ = dd4Var.Q();
                    Object obj4 = objQ;
                    if (zF || objQ == fu6Var) {
                        final boolean z2 = z ? 1 : 0;
                        ib4 ib4Var = new ib4() { // from class: z3b
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i4 = z2;
                                heb hebVar2 = heb.a;
                                kb4 kb4Var2 = kb4Var;
                                switch (i4) {
                                    case 0:
                                        kb4Var2.invoke(Boolean.FALSE);
                                        break;
                                    default:
                                        kb4Var2.invoke(Boolean.FALSE);
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var.p0(ib4Var);
                        obj4 = ib4Var;
                    }
                    wn9.k("", this.b, (ib4) obj4, this.d, dd4Var, 384);
                }
                break;
            default:
                if (!dd4Var.V(iIntValue & 1, i3 != 16)) {
                    dd4Var.Y();
                } else {
                    boolean zF2 = dd4Var.f(kb4Var);
                    Object objQ2 = dd4Var.Q();
                    Object obj5 = objQ2;
                    if (zF2 || objQ2 == fu6Var) {
                        ib4 ib4Var2 = new ib4() { // from class: z3b
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i4 = i2;
                                heb hebVar2 = heb.a;
                                kb4 kb4Var2 = kb4Var;
                                switch (i4) {
                                    case 0:
                                        kb4Var2.invoke(Boolean.FALSE);
                                        break;
                                    default:
                                        kb4Var2.invoke(Boolean.FALSE);
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var.p0(ib4Var2);
                        obj5 = ib4Var2;
                    }
                    wn9.k("", this.b, (ib4) obj5, this.d, dd4Var, 384);
                }
                break;
        }
        return hebVar;
    }
}
