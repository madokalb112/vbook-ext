package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w77 implements oi5 {
    public static final w77 a = new w77();
    public static final v77 b = v77.a;

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        ((Void) obj).getClass();
        throw new u39("'kotlin.Nothing' cannot be serialized");
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        throw new u39("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
