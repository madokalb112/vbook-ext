package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class wnb implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zob b;

    public /* synthetic */ wnb(zob zobVar, int i) {
        this.a = i;
        this.b = zobVar;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        zob zobVar = this.b;
        switch (i) {
            case 0:
                zobVar.a.setValue(Boolean.valueOf(!zobVar.c()));
                if (zobVar.c()) {
                    zobVar.e(3000L);
                }
                break;
            case 1:
                zobVar.g.setValue(Boolean.TRUE);
                break;
            case 2:
                zobVar.g.setValue(Boolean.FALSE);
                break;
            case 3:
                zobVar.g.setValue(Boolean.TRUE);
                break;
            case 4:
                zobVar.g.setValue(Boolean.FALSE);
                break;
            default:
                zobVar.a.setValue(Boolean.valueOf(!zobVar.c()));
                if (zobVar.c()) {
                    zobVar.e(3000L);
                }
                break;
        }
        return hebVar;
    }
}
