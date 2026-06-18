package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ue implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ou6 c;

    public /* synthetic */ ue(ou6 ou6Var, int i, int i2) {
        this.a = 0;
        this.c = ou6Var;
        this.b = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.b;
        ou6 ou6Var = this.c;
        dd4 dd4Var = (dd4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                xe.b(qu1.x0(1), i2, dd4Var, ou6Var);
                break;
            case 1:
                num.getClass();
                ah1.g(i2, qu1.x0(1), dd4Var, ou6Var);
                break;
            case 2:
                num.intValue();
                pn0.a(ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
            case 3:
                num.getClass();
                fe.o(i2, qu1.x0(1), dd4Var, ou6Var);
                break;
            case 4:
                num.getClass();
                qu1.s(ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
            default:
                num.getClass();
                ql9.e(ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ue(int i, int i2, int i3, ou6 ou6Var) {
        this.a = i3;
        this.b = i;
        this.c = ou6Var;
    }

    public /* synthetic */ ue(ou6 ou6Var, int i, int i2, byte b) {
        this.a = i2;
        this.c = ou6Var;
        this.b = i;
    }
}
