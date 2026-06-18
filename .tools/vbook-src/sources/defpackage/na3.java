package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class na3 implements ib4 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ vx1 b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ wq5 d;

    public /* synthetic */ na3(vx1 vx1Var, wq5 wq5Var, a07 a07Var) {
        this.b = vx1Var;
        this.d = wq5Var;
        this.c = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        wq5 wq5Var = this.d;
        a07 a07Var = this.c;
        heb hebVar = heb.a;
        vx1 vx1Var = this.b;
        switch (i) {
            case 0:
                ah1.J(vx1Var, null, null, new hl2(this.d, this.c, "", null, 7), 3);
                break;
            case 1:
                fz1.J(vx1Var, a07Var, wq5Var, 0);
                break;
            default:
                fz1.J(vx1Var, a07Var, wq5Var, gc1.S((List) a07Var.getValue()));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ na3(vx1 vx1Var, a07 a07Var, wq5 wq5Var) {
        this.b = vx1Var;
        this.c = a07Var;
        this.d = wq5Var;
    }

    public /* synthetic */ na3(a07 a07Var, vx1 vx1Var, wq5 wq5Var) {
        this.c = a07Var;
        this.b = vx1Var;
        this.d = wq5Var;
    }
}
