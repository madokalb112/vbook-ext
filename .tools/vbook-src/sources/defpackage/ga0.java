package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ga0 implements vx0 {
    public final fa0[] a;

    public ga0(fa0[] fa0VarArr) {
        this.a = fa0VarArr;
    }

    @Override // defpackage.vx0
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (fa0 fa0Var : this.a) {
            ax2 ax2Var = fa0Var.u;
            if (ax2Var == null) {
                lc5.i0("handle");
                throw null;
            }
            ax2Var.a();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
