package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xua extends fv8 implements Runnable {
    public final long s;

    public xua(long j, kt1 kt1Var) {
        super(kt1Var, kt1Var.getContext());
        this.s = j;
    }

    @Override // defpackage.pe5
    public final String T() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.T());
        sb.append("(timeMillis=");
        return dx1.j(sb, this.s, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        tw1.Q(this.e);
        r(new vua("Timed out waiting for " + this.s + " ms", this));
    }
}
