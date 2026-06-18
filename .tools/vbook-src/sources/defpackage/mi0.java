package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mi0 implements hu3 {
    public final /* synthetic */ int a;
    public final is4 b;

    public /* synthetic */ mi0(int i, is4 is4Var) {
        this.a = i;
        this.b = is4Var;
    }

    public final iu3 a(Object obj, gh7 gh7Var, b15 b15Var) {
        int i = this.a;
        is4 is4Var = this.b;
        switch (i) {
            case 0:
                ki0 ki0Var = (ki0) obj;
                ki0Var.getClass();
                gh7Var.getClass();
                b15Var.getClass();
                return new oi0(ki0Var, is4Var, gh7Var, new d6a(new li0(b15Var, 0)));
            default:
                uk0 uk0Var = (uk0) obj;
                uk0Var.getClass();
                gh7Var.getClass();
                b15Var.getClass();
                return new oi0(uk0Var, is4Var, gh7Var, new d6a(new li0(b15Var, 1)));
        }
    }
}
