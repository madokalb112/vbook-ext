package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class x92 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yf1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ x92(b92 b92Var, int i, int i2, String str) {
        this.a = 2;
        this.b = b92Var;
        this.c = i;
        this.e = i2;
        this.d = str;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        String str = this.d;
        int i2 = this.e;
        int i3 = this.c;
        b92 b92Var = (b92) this.b;
        rj rjVar = (rj) obj;
        rjVar.getClass();
        switch (i) {
            case 0:
                ((mc8) b92Var.c).getClass();
                rjVar.j(0, Long.valueOf(i3));
                rjVar.g(1, str);
                ((mc8) b92Var.c).getClass();
                rjVar.j(2, Long.valueOf(i2));
                break;
            case 1:
                rjVar.l(0, Boolean.TRUE);
                ((mc8) b92Var.c).getClass();
                rjVar.j(1, Long.valueOf(i3));
                rjVar.g(2, str);
                ((mc8) b92Var.c).getClass();
                rjVar.j(3, Long.valueOf(i2));
                break;
            default:
                ((wfc) b92Var.c).getClass();
                rjVar.j(0, Long.valueOf(i3));
                ((wfc) b92Var.c).getClass();
                rjVar.j(1, Long.valueOf(i2));
                rjVar.g(2, str);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ x92(b92 b92Var, int i, String str, int i2, int i3) {
        this.a = i3;
        this.b = b92Var;
        this.c = i;
        this.d = str;
        this.e = i2;
    }
}
