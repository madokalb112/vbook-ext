package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class y27 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y27(float f, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, int i) {
        this.b = f;
        this.c = ou6Var;
        this.d = kb4Var;
        this.e = kb4Var2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ah1.J((vx1) obj5, null, null, new z27(fFloatValue, this.b, (iz8) obj4, (mu8) obj3, null), 3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                vo1.E(this.b, (ou6) obj5, (kb4) obj4, (kb4) obj3, (dd4) obj, iX0);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ y27(vx1 vx1Var, float f, iz8 iz8Var, mu8 mu8Var) {
        this.c = vx1Var;
        this.b = f;
        this.d = iz8Var;
        this.e = mu8Var;
    }
}
