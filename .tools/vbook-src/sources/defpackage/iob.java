package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class iob implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ zob c;

    public /* synthetic */ iob(kb4 kb4Var, zob zobVar, int i) {
        this.a = i;
        this.b = kb4Var;
        this.c = zobVar;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        zob zobVar = this.c;
        kb4 kb4Var = this.b;
        Integer num = (Integer) obj;
        num.getClass();
        switch (i) {
            case 0:
                kb4Var.invoke(num);
                zobVar.e(3000L);
                break;
            default:
                kb4Var.invoke(num);
                zobVar.e(3000L);
                break;
        }
        return hebVar;
    }
}
