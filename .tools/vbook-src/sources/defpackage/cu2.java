package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class cu2 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ cu2(int i, kb4 kb4Var, boolean z) {
        this.a = 0;
        this.b = kb4Var;
        this.d = z;
        this.c = i;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        int i2 = 2;
        heb hebVar = heb.a;
        boolean z = this.d;
        int i3 = this.c;
        kb4 kb4Var = this.b;
        switch (i) {
            case 0:
                if (z) {
                    i3++;
                }
                kb4Var.invoke(Integer.valueOf(i3));
                break;
            case 1:
                if (i3 == 0 ? z : i3 == 2) {
                    i2 = 1;
                }
                kb4Var.invoke(Integer.valueOf(i2));
                break;
            default:
                if (i3 == 0 ? z : i3 == 2) {
                    i2 = 1;
                }
                kb4Var.invoke(Integer.valueOf(i2));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ cu2(int i, int i2, kb4 kb4Var, boolean z) {
        this.a = i2;
        this.b = kb4Var;
        this.c = i;
        this.d = z;
    }
}
