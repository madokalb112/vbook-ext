package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ah3 extends ch3 {
    public final ay0 c;
    public final /* synthetic */ eh3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah3(eh3 eh3Var, long j, ay0 ay0Var) {
        super(j);
        this.d = eh3Var;
        this.c = ay0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.E(this.d);
    }

    @Override // defpackage.ch3
    public final String toString() {
        return super.toString() + this.c;
    }
}
