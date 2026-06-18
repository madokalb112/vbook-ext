package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class dob implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je4 b;
    public final /* synthetic */ ou6 c;

    public /* synthetic */ dob(je4 je4Var, ou6 ou6Var, int i, int i2) {
        this.a = i2;
        this.b = je4Var;
        this.c = ou6Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        ou6 ou6Var = this.c;
        je4 je4Var = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                vo1.n(je4Var, ou6Var, dd4Var, qu1.x0(1));
                break;
            case 1:
                vo1.m(je4Var, ou6Var, dd4Var, qu1.x0(1));
                break;
            default:
                vo1.w(je4Var, ou6Var, dd4Var, qu1.x0(1));
                break;
        }
        return hebVar;
    }
}
