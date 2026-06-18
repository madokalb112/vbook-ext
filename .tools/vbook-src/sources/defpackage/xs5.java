package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xs5 implements lr5 {
    public final st5 a;

    public xs5(st5 st5Var) {
        this.a = st5Var;
    }

    @Override // defpackage.lr5
    public final int a() {
        return this.a.j().n;
    }

    @Override // defpackage.lr5
    public final int b() {
        return Math.min(a() - 1, ((ot5) fc1.E0(this.a.j().k)).a);
    }

    @Override // defpackage.lr5
    public final int c() {
        int i;
        st5 st5Var = this.a;
        if (st5Var.j().k.isEmpty()) {
            return 0;
        }
        nt5 nt5VarJ = st5Var.j();
        int iG = (int) (nt5VarJ.p == lh7.a ? nt5VarJ.g() & 4294967295L : nt5VarJ.g() >> 32);
        int iS0 = tu1.s0(st5Var.j());
        if (iS0 != 0 && (i = iG / iS0) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.lr5
    public final boolean d() {
        return !this.a.j().k.isEmpty();
    }

    @Override // defpackage.lr5
    public final int e() {
        return Math.max(0, this.a.h());
    }
}
