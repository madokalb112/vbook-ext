package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lg5 implements oi5 {
    public static final lg5 a = new lg5();
    public static final p39 b = fx1.A("kotlinx.serialization.json.JsonPrimitive", m28.k, new m39[0]);

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        jg5 jg5Var = (jg5) obj;
        jg5Var.getClass();
        wx1.I(md2Var);
        if (jg5Var instanceof cg5) {
            md2Var.W(dg5.a, cg5.INSTANCE);
        } else {
            md2Var.W(zf5.a, (yf5) jg5Var);
        }
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        if5 if5VarJ = wx1.J(yd2Var);
        mf5 mf5VarI = if5VarJ.i();
        if (mf5VarI instanceof jg5) {
            return (jg5) mf5VarI;
        }
        throw new kf5(ny1.E("Unexpected JSON element, expected JsonPrimitive, had " + ug8.a(mf5VarI.getClass()), null, null, if5VarJ.y().a.m ? ny1.Q(mf5VarI.toString(), -1).toString() : null, -1));
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
