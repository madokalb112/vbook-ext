package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class j5a implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p5a b;

    public /* synthetic */ j5a(p5a p5aVar, int i) {
        this.a = i;
        this.b = p5aVar;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        int i = this.a;
        heb hebVar = heb.a;
        p5a p5aVar = this.b;
        switch (i) {
            case 0:
                f4a f4aVar = (f4a) obj;
                f4aVar.getClass();
                za1 za1VarA = vtb.a(p5aVar);
                aj2 aj2Var = rw2.a;
                p5aVar.g(za1VarA, nh2.c, new b69(p5aVar, f4aVar, null, 16));
                break;
            case 1:
                gm3 gm3Var = (gm3) obj;
                fr9 fr9Var = p5aVar.d;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, q5a.a((q5a) value, 0L, null, null, false, false, null, gm3Var, false, null, false, false, false, false, false, 65279)));
                }
                break;
            default:
                q55 q55Var = (q55) obj;
                fr9 fr9Var2 = p5aVar.d;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, q5a.a((q5a) value2, 0L, null, null, false, false, q55Var, null, false, null, false, false, false, false, false, 65407)));
                }
                break;
        }
        return hebVar;
    }
}
