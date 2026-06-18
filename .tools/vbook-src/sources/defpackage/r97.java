package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class r97 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s97 b;

    public /* synthetic */ r97(s97 s97Var, int i) {
        this.a = i;
        this.b = s97Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        s97 s97Var = this.b;
        switch (i) {
            case 0:
                kj1 kj1Var = (kj1) obj;
                kj1Var.getClass();
                kj1Var.a(new oi(9), ug8.a(cha.class));
                kj1Var.c(new n26(s97Var, 1), ug8.a(cha.class));
                return heb.a;
            default:
                ux5 ux5Var = (ux5) obj;
                ux5Var.getClass();
                s97Var.k();
                return new lb0(ux5Var, s97Var, 14);
        }
    }
}
