package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qcb implements oi5 {
    public static final qcb a = new qcb();
    public static final m75 b = lx1.e(e66.a, "kotlin.ULong");

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        md2Var.N(b).R(((mcb) obj).a);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        return new mcb(yd2Var.p(b).v());
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
