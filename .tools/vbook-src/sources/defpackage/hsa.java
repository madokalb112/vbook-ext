package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hsa implements fsa {
    public final Object a;
    public final ThreadLocal b;
    public final jsa c;

    public hsa(ty7 ty7Var, ThreadLocal threadLocal) {
        this.a = ty7Var;
        this.b = threadLocal;
        this.c = new jsa(threadLocal);
    }

    @Override // defpackage.fsa
    public final void A0(Object obj) {
        this.b.set(obj);
    }

    @Override // defpackage.jx1
    public final Object fold(Object obj, yb4 yb4Var) {
        return yb4Var.invoke(obj, this);
    }

    @Override // defpackage.jx1
    public final hx1 get(ix1 ix1Var) {
        if (this.c.equals(ix1Var)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.hx1
    public final ix1 getKey() {
        return this.c;
    }

    @Override // defpackage.fsa
    public final Object j0() {
        ThreadLocal threadLocal = this.b;
        Object obj = threadLocal.get();
        threadLocal.set(this.a);
        return obj;
    }

    @Override // defpackage.jx1
    public final jx1 minusKey(ix1 ix1Var) {
        return this.c.equals(ix1Var) ? hc3.a : this;
    }

    @Override // defpackage.jx1
    public final jx1 plus(jx1 jx1Var) {
        return gx1.T(this, jx1Var);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }
}
