package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dg5 implements oi5 {
    public static final dg5 a = new dg5();
    public static final p39 b = fx1.A("kotlinx.serialization.json.JsonNull", s39.c, new m39[0]);

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        ((cg5) obj).getClass();
        wx1.I(md2Var);
        md2Var.T();
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        wx1.J(yd2Var);
        if (yd2Var.w()) {
            throw new kf5(ny1.E("Expected 'null' literal", null, null, null, -1));
        }
        return cg5.INSTANCE;
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
