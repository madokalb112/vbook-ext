package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ycb implements oi5 {
    public static final ycb a = new ycb();
    public static final m75 b = lx1.e(vd9.a, "kotlin.UShort");

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        md2Var.N(b).X(((ucb) obj).a);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        return new ucb(yd2Var.p(b).B());
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
