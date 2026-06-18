package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class mob implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mob(int i, a07 a07Var, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((kb4) obj2).invoke(Long.valueOf((long) ((Number) a07Var.getValue()).floatValue()));
                ((ib4) obj).invoke();
                break;
            default:
                ah1.J((vx1) obj2, null, null, new do6((n7c) obj, a07Var, null, 1), 3);
                break;
        }
        return hebVar;
    }
}
