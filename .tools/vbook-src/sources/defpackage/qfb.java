package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qfb extends IllegalArgumentException implements yv1 {
    public final na4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfb(na4 na4Var) {
        super("Unsupported frame type: " + na4Var);
        na4Var.getClass();
        this.a = na4Var;
    }

    @Override // defpackage.yv1
    public final Throwable a() {
        qfb qfbVar = new qfb(this.a);
        qfbVar.initCause(this);
        return qfbVar;
    }
}
