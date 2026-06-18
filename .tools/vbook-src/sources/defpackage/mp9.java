package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mp9 extends tm3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final lp9 e;
    public final hh f;

    public mp9(long j) {
        long jX = wn9.x(9);
        long jX2 = wn9.x(1);
        long jX3 = wn9.x(1);
        lp9 lp9Var = lp9.b;
        lp9Var.getClass();
        this.a = j;
        this.b = jX;
        this.c = jX2;
        this.d = jX3;
        this.e = lp9Var;
        this.f = mh.a();
    }

    @Override // defpackage.tm3
    public final l32 a(qha qhaVar) {
        qhaVar.getClass();
        bp bpVar = qhaVar.a.a;
        return new l32(this, bpVar.e(0, bpVar.b.length(), "squiggly_underline_span"), qhaVar, 1);
    }
}
