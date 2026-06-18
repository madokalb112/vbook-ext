package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x16 implements p0, f3 {
    public final nu a;

    public x16(nu nuVar) {
        this.a = nuVar;
    }

    @Override // defpackage.p0
    public final nu b() {
        return this.a;
    }

    @Override // defpackage.f3
    public final void e(r84 r84Var) {
        this.a.c(r84Var);
    }

    @Override // defpackage.p0
    public final p0 h() {
        return new x16(new nu(0, false));
    }
}
