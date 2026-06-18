package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pg5 extends m1 {
    public final we5 f;
    public final int g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg5(ue5 ue5Var, we5 we5Var) {
        super(ue5Var, null);
        ue5Var.getClass();
        this.f = we5Var;
        this.g = we5Var.a.size();
        this.h = -1;
    }

    @Override // defpackage.m1
    public final mf5 F(String str) {
        str.getClass();
        return (mf5) this.f.a.get(Integer.parseInt(str));
    }

    @Override // defpackage.m1
    public final String R(m39 m39Var, int i) {
        m39Var.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.m1
    public final mf5 T() {
        return this.f;
    }

    @Override // defpackage.am1
    public final int f(m39 m39Var) {
        m39Var.getClass();
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }
}
