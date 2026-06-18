package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zf5 implements oi5 {
    public static final zf5 a = new zf5();
    public static final o28 b = fx1.m("kotlinx.serialization.json.JsonLiteral", m28.k);

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        yf5 yf5Var = (yf5) obj;
        yf5Var.getClass();
        String str = yf5Var.b;
        wx1.I(md2Var);
        if (yf5Var.a) {
            md2Var.Y(str);
            return;
        }
        Long lN = iw9.N(str);
        if (lN != null) {
            md2Var.R(lN.longValue());
            return;
        }
        mcb mcbVarU = tl9.u(str);
        if (mcbVarU != null) {
            md2Var.N(qcb.b).R(mcbVarU.a);
            return;
        }
        Double dW = hw9.w(str);
        if (dW != null) {
            md2Var.I(dW.doubleValue());
            return;
        }
        Boolean boolA0 = bw9.A0(str);
        if (boolA0 != null) {
            md2Var.E(boolA0.booleanValue());
        } else {
            md2Var.Y(str);
        }
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        if5 if5VarJ = wx1.J(yd2Var);
        mf5 mf5VarI = if5VarJ.i();
        if (mf5VarI instanceof yf5) {
            return (yf5) mf5VarI;
        }
        throw new kf5(ny1.E("Unexpected JSON element, expected JsonLiteral, had " + ug8.a(mf5VarI.getClass()), null, null, if5VarJ.y().a.m ? ny1.Q(mf5VarI.toString(), -1).toString() : null, -1));
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
