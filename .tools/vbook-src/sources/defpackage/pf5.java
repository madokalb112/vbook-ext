package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pf5 implements oi5 {
    public static final pf5 a = new pf5();
    public static final p39 b = fx1.z("kotlinx.serialization.json.JsonElement", gy7.d, new m39[0], new fz4(17));

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        mf5 mf5Var = (mf5) obj;
        mf5Var.getClass();
        wx1.I(md2Var);
        if (mf5Var instanceof jg5) {
            md2Var.W(lg5.a, mf5Var);
            return;
        }
        if (mf5Var instanceof fg5) {
            md2Var.W(hg5.a, mf5Var);
        } else if (mf5Var instanceof we5) {
            md2Var.W(ye5.a, mf5Var);
        } else {
            mn5.g();
        }
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        return wx1.J(yd2Var).i();
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
