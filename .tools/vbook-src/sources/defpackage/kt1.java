package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class kt1 extends vc0 {
    private final jx1 _context;
    private transient jt1 intercepted;

    public kt1(jt1 jt1Var) {
        this(jt1Var, jt1Var != null ? jt1Var.getContext() : null);
    }

    @Override // defpackage.jt1
    public jx1 getContext() {
        jx1 jx1Var = this._context;
        jx1Var.getClass();
        return jx1Var;
    }

    public final jt1 intercepted() {
        jt1 jt1VarE = this.intercepted;
        if (jt1VarE == null) {
            lt1 lt1Var = (lt1) getContext().get(g83.d);
            jt1VarE = lt1Var != null ? lt1Var.E(this) : this;
            this.intercepted = jt1VarE;
        }
        return jt1VarE;
    }

    @Override // defpackage.vc0
    public void releaseIntercepted() {
        jt1 jt1Var = this.intercepted;
        if (jt1Var != null && jt1Var != this) {
            hx1 hx1Var = getContext().get(g83.d);
            hx1Var.getClass();
            ((lt1) hx1Var).K0(jt1Var);
        }
        this.intercepted = di1.b;
    }

    public kt1(jt1 jt1Var, jx1 jx1Var) {
        super(jt1Var);
        this._context = jx1Var;
    }
}
