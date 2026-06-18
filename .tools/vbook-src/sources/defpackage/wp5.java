package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wp5 implements lr5 {
    public final wq5 a;

    public wp5(wq5 wq5Var) {
        this.a = wq5Var;
    }

    @Override // defpackage.lr5
    public final int a() {
        return this.a.j().p;
    }

    @Override // defpackage.lr5
    public final int b() {
        return ((kq5) fc1.E0(this.a.j().m)).a;
    }

    @Override // defpackage.lr5
    public final int c() {
        int i;
        wq5 wq5Var = this.a;
        if (wq5Var.j().m.isEmpty()) {
            return 0;
        }
        jq5 jq5VarJ = wq5Var.j();
        int iG = (int) (jq5VarJ.q == lh7.a ? jq5VarJ.g() & 4294967295L : jq5VarJ.g() >> 32);
        int iB0 = vw1.b0(wq5Var.j());
        if (iB0 != 0 && (i = iG / iB0) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.lr5
    public final boolean d() {
        return !this.a.j().m.isEmpty();
    }

    @Override // defpackage.lr5
    public final int e() {
        return this.a.h();
    }
}
