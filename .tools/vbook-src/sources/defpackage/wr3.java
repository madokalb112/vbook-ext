package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class wr3 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cs3 b;

    public /* synthetic */ wr3(cs3 cs3Var, int i) {
        this.a = i;
        this.b = cs3Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        cs3 cs3Var = this.b;
        switch (i) {
            case 0:
                return new qna(cs3Var.a, cs3Var.b, cs3Var.c);
            default:
                cs3.y(cs3Var);
                return heb.a;
        }
    }
}
