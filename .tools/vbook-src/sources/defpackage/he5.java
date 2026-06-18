package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class he5 extends ee5 {
    public final pe5 t;
    public final ie5 u;
    public final q71 v;
    public final Object w;

    public he5(pe5 pe5Var, ie5 ie5Var, q71 q71Var, Object obj) {
        this.t = pe5Var;
        this.u = ie5Var;
        this.v = q71Var;
        this.w = obj;
    }

    @Override // defpackage.ee5
    public final boolean q() {
        return false;
    }

    @Override // defpackage.ee5
    public final void r(Throwable th) {
        q71 q71Var = this.v;
        q71 q71VarU = pe5.U(q71Var);
        pe5 pe5Var = this.t;
        ie5 ie5Var = this.u;
        Object obj = this.w;
        if (q71VarU == null || !pe5Var.n0(ie5Var, q71VarU, obj)) {
            ie5Var.a.d(new bz5(2), 2);
            q71 q71VarU2 = pe5.U(q71Var);
            if (q71VarU2 == null || !pe5Var.n0(ie5Var, q71VarU2, obj)) {
                pe5Var.m(pe5Var.y(ie5Var, obj));
            }
        }
    }
}
