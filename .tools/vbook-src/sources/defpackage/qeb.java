package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qeb extends nx1 {
    public static final qeb c = new qeb();

    @Override // defpackage.nx1
    public final void A(jx1 jx1Var, Runnable runnable) {
        aj2.d.c.q(runnable, true, false);
    }

    @Override // defpackage.nx1
    public final void N(jx1 jx1Var, Runnable runnable) {
        aj2.d.c.q(runnable, true, true);
    }

    @Override // defpackage.nx1
    public final nx1 e0(int i) {
        qx1.r(i);
        return i >= haa.d ? this : super.e0(i);
    }

    @Override // defpackage.nx1
    public final String toString() {
        return "Dispatchers.IO";
    }
}
