package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xdb extends nx1 {
    public static final xdb c = new xdb();

    @Override // defpackage.nx1
    public final void A(jx1 jx1Var, Runnable runnable) {
        o4c o4cVar = (o4c) jx1Var.get(o4c.c);
        if (o4cVar != null) {
            o4cVar.b = true;
        } else {
            sy3.p("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.nx1
    public final nx1 e0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.nx1
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
