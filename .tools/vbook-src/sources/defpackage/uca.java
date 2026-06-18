package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uca implements rca {
    public final long a;
    public final /* synthetic */ vca b;

    public uca(vca vcaVar, long j) {
        this.b = vcaVar;
        this.a = j;
    }

    @Override // defpackage.rca
    public final qca Z() {
        return uj9.h(this.b);
    }

    @Override // defpackage.rca
    public final long i(ym5 ym5Var) {
        ym5 ym5Var2 = (ym5) this.b.D.getValue();
        if (ym5Var2 != null) {
            return ym5Var.M(ym5Var2, this.a);
        }
        t75.d("Tried to open context menu before the anchor was placed.");
        if2.c();
        return 0L;
    }

    @Override // defpackage.rca
    public final kf8 n(ym5 ym5Var) {
        return rw1.w(i(ym5Var), 0L);
    }
}
