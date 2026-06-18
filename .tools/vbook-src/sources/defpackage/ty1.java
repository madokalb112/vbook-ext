package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ty1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xy1 b;
    public final /* synthetic */ k80 c;

    public /* synthetic */ ty1(xy1 xy1Var, k80 k80Var, int i) {
        this.a = i;
        this.b = xy1Var;
        this.c = k80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        k80 k80Var = this.c;
        xy1 xy1Var = this.b;
        switch (i) {
            case 0:
                xy1Var.a(k80Var);
                break;
            default:
                xy1Var.a(k80Var);
                break;
        }
    }
}
