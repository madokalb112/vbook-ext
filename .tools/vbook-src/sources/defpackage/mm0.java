package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mm0 implements oi5 {
    public static final mm0 a = new mm0();
    public static final o28 b = new o28("kotlin.Boolean", m28.c);

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        md2Var.E(((Boolean) obj).booleanValue());
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        return Boolean.valueOf(yd2Var.b());
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
