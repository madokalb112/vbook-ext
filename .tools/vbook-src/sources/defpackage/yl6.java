package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class yl6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vx1 b;
    public final /* synthetic */ st5 c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ a07 e;
    public final /* synthetic */ br9 f;

    public /* synthetic */ yl6(vx1 vx1Var, st5 st5Var, a07 a07Var, a07 a07Var2, br9 br9Var, int i) {
        this.a = i;
        this.b = vx1Var;
        this.c = st5Var;
        this.d = a07Var;
        this.e = a07Var2;
        this.f = br9Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj4 = vl1.a;
        lu6 lu6Var = lu6.a;
        br9 br9Var = this.f;
        int i2 = 0;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                rp8 rp8Var = tp8.a;
                ou6 ou6VarW = t96.w(lu6Var, rp8Var);
                final vx1 vx1Var = this.b;
                boolean zH = dd4Var.h(vx1Var);
                final st5 st5Var = this.c;
                boolean zF = zH | dd4Var.f(st5Var);
                Object objQ = dd4Var.Q();
                if (zF || objQ == obj4) {
                    final int i3 = 0;
                    final a07 a07Var = this.d;
                    final a07 a07Var2 = this.e;
                    objQ = new ib4() { // from class: km6
                        @Override // defpackage.ib4
                        public final Object invoke() {
                            int i4 = i3;
                            heb hebVar2 = heb.a;
                            st5 st5Var2 = st5Var;
                            a07 a07Var3 = a07Var2;
                            vx1 vx1Var2 = vx1Var;
                            a07 a07Var4 = a07Var;
                            switch (i4) {
                                case 0:
                                    vm7.u(vx1Var2, a07Var3, st5Var2, ((Number) a07Var4.getValue()).intValue());
                                    break;
                                default:
                                    p7c.N(vx1Var2, a07Var3, st5Var2, ((Number) a07Var4.getValue()).intValue());
                                    break;
                            }
                            return hebVar2;
                        }
                    };
                    dd4Var.p0(objQ);
                }
                j1a.a(fw.J(null, (ib4) objQ, ou6VarW, false, 15), rp8Var, dd1.g(((q96) dd4Var.j(s96.a)).a, 6.0f), 0L, 2.0f, 6.0f, (wm0) null, jf0.G(339025951, new lm6(br9Var, i2), dd4Var), dd4Var, 12804096, 72);
                break;
            default:
                dd4 dd4Var2 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                rp8 rp8Var2 = tp8.a;
                ou6 ou6VarW2 = t96.w(lu6Var, rp8Var2);
                final vx1 vx1Var2 = this.b;
                boolean zH2 = dd4Var2.h(vx1Var2);
                final st5 st5Var2 = this.c;
                boolean zF2 = zH2 | dd4Var2.f(st5Var2);
                Object objQ2 = dd4Var2.Q();
                if (zF2 || objQ2 == obj4) {
                    final int i4 = 1;
                    final a07 a07Var3 = this.d;
                    final a07 a07Var4 = this.e;
                    objQ2 = new ib4() { // from class: km6
                        @Override // defpackage.ib4
                        public final Object invoke() {
                            int i42 = i4;
                            heb hebVar2 = heb.a;
                            st5 st5Var22 = st5Var2;
                            a07 a07Var32 = a07Var4;
                            vx1 vx1Var22 = vx1Var2;
                            a07 a07Var42 = a07Var3;
                            switch (i42) {
                                case 0:
                                    vm7.u(vx1Var22, a07Var32, st5Var22, ((Number) a07Var42.getValue()).intValue());
                                    break;
                                default:
                                    p7c.N(vx1Var22, a07Var32, st5Var22, ((Number) a07Var42.getValue()).intValue());
                                    break;
                            }
                            return hebVar2;
                        }
                    };
                    dd4Var2.p0(objQ2);
                }
                j1a.a(fw.J(null, (ib4) objQ2, ou6VarW2, false, 15), rp8Var2, dd1.g(((q96) dd4Var2.j(s96.a)).a, 6.0f), 0L, 2.0f, 6.0f, (wm0) null, jf0.G(366792886, new lm6(br9Var, 1), dd4Var2), dd4Var2, 12804096, 72);
                break;
        }
        return hebVar;
    }
}
