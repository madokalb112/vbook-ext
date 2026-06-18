package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class ae5 extends pe5 {
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae5(yd5 yd5Var) {
        super(true);
        boolean z = true;
        K(yd5Var);
        p71 p71VarG = G();
        q71 q71Var = p71VarG instanceof q71 ? (q71) p71VarG : null;
        if (q71Var == null) {
            z = false;
            break;
        }
        pe5 pe5VarP = q71Var.p();
        while (!pe5VarP.C()) {
            p71 p71VarG2 = pe5VarP.G();
            q71 q71Var2 = p71VarG2 instanceof q71 ? (q71) p71VarG2 : null;
            if (q71Var2 == null) {
                z = false;
                break;
            }
            pe5VarP = q71Var2.p();
        }
        this.e = z;
    }

    @Override // defpackage.pe5
    public final boolean C() {
        return this.e;
    }

    @Override // defpackage.pe5
    public final boolean D() {
        return true;
    }

    public final void o0() {
        Q(heb.a);
    }
}
