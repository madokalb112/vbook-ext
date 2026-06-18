package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class hub implements AutoCloseable {
    public final /* synthetic */ jub a;
    public final /* synthetic */ lub b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hub(jub jubVar, lub lubVar, Object obj) {
        this.a = jubVar;
        this.b = lubVar;
        this.c = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        jub jubVar = this.a;
        int i = jubVar.c - 1;
        jubVar.c = i;
        if (!jubVar.d || i > 0) {
            return;
        }
        ((kub) this.b.f.getValue()).g(this.c);
    }
}
