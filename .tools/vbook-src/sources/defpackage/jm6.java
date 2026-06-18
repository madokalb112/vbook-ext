package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class jm6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ vx1 c;
    public final /* synthetic */ st5 d;

    public /* synthetic */ jm6(vx1 vx1Var, a07 a07Var, st5 st5Var, int i) {
        this.a = i;
        this.c = vx1Var;
        this.b = a07Var;
        this.d = st5Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        st5 st5Var = this.d;
        vx1 vx1Var = this.c;
        a07 a07Var = this.b;
        switch (i) {
            case 0:
                vm7.u(vx1Var, a07Var, st5Var, 0);
                break;
            case 1:
                vm7.u(vx1Var, a07Var, st5Var, gc1.S((List) a07Var.getValue()));
                break;
            case 2:
                p7c.N(vx1Var, a07Var, st5Var, 0);
                break;
            default:
                p7c.N(vx1Var, a07Var, st5Var, gc1.S((List) a07Var.getValue()));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ jm6(a07 a07Var, vx1 vx1Var, st5 st5Var, int i) {
        this.a = i;
        this.b = a07Var;
        this.c = vx1Var;
        this.d = st5Var;
    }
}
