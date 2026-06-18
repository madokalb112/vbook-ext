package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kg5 extends m1 {
    public final mf5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg5(ue5 ue5Var, mf5 mf5Var, String str) {
        super(ue5Var, str);
        ue5Var.getClass();
        mf5Var.getClass();
        this.f = mf5Var;
        this.a.add("primitive");
    }

    @Override // defpackage.m1
    public final mf5 F(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f;
        }
        gp.l("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.m1
    public final mf5 T() {
        return this.f;
    }

    @Override // defpackage.am1
    public final int f(m39 m39Var) {
        m39Var.getClass();
        return 0;
    }
}
