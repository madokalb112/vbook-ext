package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w62 implements oi5 {
    public static final w62 a = new w62();
    public static final o28 b = fx1.m("kotlinx.datetime.DatePeriod/ISO", m28.k);

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        v62 v62Var = (v62) obj;
        v62Var.getClass();
        md2Var.Y(v62Var.toString());
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }

    @Override // defpackage.oi5
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final v62 c(yd2 yd2Var) {
        e72 e72Var = f72.Companion;
        String strS = yd2Var.s();
        e72Var.getClass();
        f72 f72VarA = e72.a(strS);
        if (f72VarA instanceof v62) {
            return (v62) f72VarA;
        }
        throw new u39(f72VarA + " is not a date-based period");
    }
}
