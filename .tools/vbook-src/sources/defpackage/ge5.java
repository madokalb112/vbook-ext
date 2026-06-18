package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ge5 extends ay0 {
    public final pe5 w;

    public ge5(jt1 jt1Var, pe5 pe5Var) {
        super(1, jt1Var);
        this.w = pe5Var;
    }

    @Override // defpackage.ay0
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // defpackage.ay0
    public final Throwable q(pe5 pe5Var) {
        Throwable thD;
        Object objH = this.w.H();
        return (!(objH instanceof ie5) || (thD = ((ie5) objH).d()) == null) ? objH instanceof ei1 ? ((ei1) objH).a : pe5Var.getCancellationException() : thD;
    }
}
