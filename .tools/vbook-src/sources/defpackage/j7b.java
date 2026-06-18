package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j7b implements oi5 {
    public final oi5 a;
    public final oi5 b;
    public final oi5 c;
    public final p39 d = fx1.x("kotlin.Triple", new m39[0], new nx9(this, 12));

    public j7b(oi5 oi5Var, oi5 oi5Var2, oi5 oi5Var3) {
        this.a = oi5Var;
        this.b = oi5Var2;
        this.c = oi5Var3;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        i7b i7bVar = (i7b) obj;
        i7bVar.getClass();
        p39 p39Var = this.d;
        md2 md2VarV = md2Var.v(p39Var);
        md2VarV.V(p39Var, 0, this.a, i7bVar.a);
        md2VarV.V(p39Var, 1, this.b, i7bVar.b);
        md2VarV.V(p39Var, 2, this.c, i7bVar.c);
        md2VarV.a0(p39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        p39 p39Var = this.d;
        am1 am1VarT = yd2Var.t(p39Var);
        Object obj = gc1.C;
        Object objQ = obj;
        Object objQ2 = objQ;
        Object objQ3 = objQ2;
        while (true) {
            int iF = am1VarT.f(p39Var);
            if (iF == -1) {
                am1VarT.n(p39Var);
                if (objQ == obj) {
                    throw new u39("Element 'first' is missing");
                }
                if (objQ2 == obj) {
                    throw new u39("Element 'second' is missing");
                }
                if (objQ3 != obj) {
                    return new i7b(objQ, objQ2, objQ3);
                }
                throw new u39("Element 'third' is missing");
            }
            if (iF == 0) {
                objQ = am1VarT.q(p39Var, 0, this.a, null);
            } else if (iF == 1) {
                objQ2 = am1VarT.q(p39Var, 1, this.b, null);
            } else {
                if (iF != 2) {
                    throw new u39(dx1.f(iF, "Unexpected index "));
                }
                objQ3 = am1VarT.q(p39Var, 2, this.c, null);
            }
        }
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return this.d;
    }
}
