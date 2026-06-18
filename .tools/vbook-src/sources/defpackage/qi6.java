package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class qi6 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ qi6(l7 l7Var, int i) {
        this.a = i;
        this.b = l7Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        l7 l7Var = this.b;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                l7Var.b();
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                l7Var.getClass();
                l7Var.g.setValue(str);
                break;
            default:
                gba gbaVar = (gba) obj;
                gbaVar.getClass();
                this.b.c(gbaVar.a, gbaVar.c, gbaVar.i, gbaVar.j, gbaVar.f, gbaVar.h, gbaVar.g);
                break;
        }
        return hebVar;
    }
}
