package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class la5 implements oi5 {
    public static final la5 a = new la5();
    public static final o28 b = new o28("kotlin.Int", m28.h);

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        md2Var.P(((Number) obj).intValue());
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        return Integer.valueOf(yd2Var.l());
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
