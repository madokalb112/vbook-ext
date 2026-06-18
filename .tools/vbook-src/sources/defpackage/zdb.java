package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zdb extends tm3 {
    public final long a;
    public final long b;
    public final hh c;

    public zdb(long j) {
        long jX = wn9.x(1);
        this.a = j;
        this.b = jX;
        this.c = mh.a();
    }

    @Override // defpackage.tm3
    public final l32 a(qha qhaVar) {
        qhaVar.getClass();
        bp bpVar = qhaVar.a.a;
        return new l32(this, bpVar.e(0, bpVar.b.length(), "underline_span"), qhaVar, 2);
    }
}
