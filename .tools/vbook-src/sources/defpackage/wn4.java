package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class wn4 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zk7 b;
    public final /* synthetic */ vx1 c;

    public /* synthetic */ wn4(vx1 vx1Var, zk7 zk7Var) {
        this.a = 0;
        this.c = vx1Var;
        this.b = zk7Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        vx1 vx1Var = this.c;
        zk7 zk7Var = this.b;
        switch (i) {
            case 0:
                ah1.J(vx1Var, null, null, new do4(0, null, zk7Var), 3);
                return heb.a;
            case 1:
                if (zk7Var.b()) {
                    ah1.J(vx1Var, null, null, new do4(1, null, zk7Var), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                if (zk7Var.c()) {
                    ah1.J(vx1Var, null, null, new do4(2, null, zk7Var), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                if (zk7Var.b()) {
                    ah1.J(vx1Var, null, null, new do4(1, null, zk7Var), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (zk7Var.c()) {
                    ah1.J(vx1Var, null, null, new do4(2, null, zk7Var), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ wn4(int i, vx1 vx1Var, zk7 zk7Var) {
        this.a = i;
        this.b = zk7Var;
        this.c = vx1Var;
    }
}
