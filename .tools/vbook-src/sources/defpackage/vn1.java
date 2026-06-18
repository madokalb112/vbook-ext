package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vn1 extends ir0 {
    public final ar0 D;

    public vn1(int i, ar0 ar0Var, kb4 kb4Var) {
        super(i, kb4Var);
        this.D = ar0Var;
        if (ar0Var == ar0.a) {
            so9.r(ug8.a(ir0.class).g(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        gp.k(xv5.k(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // defpackage.ir0
    public final boolean G() {
        return this.D == ar0.b;
    }

    public final Object W(Object obj, boolean z) {
        kb4 kb4Var;
        fi1 fi1VarX;
        if (this.D != ar0.c) {
            return S(obj);
        }
        Object objK = super.k(obj);
        if (!(objK instanceof x11) || (objK instanceof w11)) {
            return objK;
        }
        if (!z || (kb4Var = this.b) == null || (fi1VarX = y86.x(kb4Var, obj, null)) == null) {
            return heb.a;
        }
        throw fi1VarX;
    }

    @Override // defpackage.ir0, defpackage.w29
    public final Object g(jt1 jt1Var, Object obj) throws Throwable {
        fi1 fi1VarX;
        if (!(W(obj, true) instanceof w11)) {
            return heb.a;
        }
        kb4 kb4Var = this.b;
        if (kb4Var == null || (fi1VarX = y86.x(kb4Var, obj, null)) == null) {
            throw x();
        }
        i12.r(fi1VarX, x());
        throw fi1VarX;
    }

    @Override // defpackage.ir0, defpackage.w29
    public final Object k(Object obj) {
        return W(obj, false);
    }
}
