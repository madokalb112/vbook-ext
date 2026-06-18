package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ez4 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vx1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ez4(boolean z, vx1 vx1Var, m8 m8Var, a07 a07Var) {
        this.a = 4;
        this.c = z;
        this.b = vx1Var;
        this.e = m8Var;
        this.d = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj = this.e;
        vx1 vx1Var = this.b;
        switch (i) {
            case 0:
                ah1.J(vx1Var, null, null, new pz4(this.c, this.d, (a07) obj, null, 2), 3);
                break;
            case 1:
                ah1.J(vx1Var, null, null, new pz4(this.c, this.d, (a07) obj, null, 3), 3);
                break;
            case 2:
                ah1.J(vx1Var, null, null, new pz4(this.c, this.d, (a07) obj, null, 4), 3);
                break;
            case 3:
                ah1.J(vx1Var, null, null, new pz4(this.c, this.d, (a07) obj, null, 5), 3);
                break;
            default:
                m8 m8Var = (m8) obj;
                if (!this.c) {
                    this.d.setValue(Boolean.TRUE);
                } else {
                    ah1.J(vx1Var, null, null, new dp6(m8Var, null, 2), 3);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ez4(vx1 vx1Var, boolean z, a07 a07Var, a07 a07Var2, int i) {
        this.a = i;
        this.b = vx1Var;
        this.c = z;
        this.d = a07Var;
        this.e = a07Var2;
    }
}
