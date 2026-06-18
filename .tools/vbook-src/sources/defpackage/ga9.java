package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ga9 extends b3 {
    public long a;
    public ay0 b;

    @Override // defpackage.b3
    public final boolean a(a3 a3Var) {
        ea9 ea9Var = (ea9) a3Var;
        if (this.a >= 0) {
            return false;
        }
        long j = ea9Var.u;
        if (j < ea9Var.v) {
            ea9Var.v = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.b3
    public final jt1[] b(a3 a3Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((ea9) a3Var).v(j);
    }
}
