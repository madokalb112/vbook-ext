package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class job implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zob b;

    public /* synthetic */ job(zob zobVar, int i) {
        this.a = i;
        this.b = zobVar;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        zob zobVar = this.b;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                if (!zBooleanValue) {
                    zobVar.d();
                } else {
                    zobVar.a();
                }
                break;
            case 1:
                if (!zBooleanValue) {
                    zobVar.d();
                } else {
                    zobVar.a();
                }
                break;
            case 2:
                if (!zBooleanValue) {
                    zobVar.d();
                } else {
                    zobVar.a();
                }
                break;
            default:
                if (!zBooleanValue) {
                    zobVar.d();
                } else {
                    zobVar.a();
                }
                break;
        }
        return hebVar;
    }
}
