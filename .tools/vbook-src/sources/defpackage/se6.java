package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class se6 implements nw0 {
    public final re6 a;

    public se6(int i) {
        this.a = new re6(i, this);
    }

    @Override // defpackage.nw0
    public final void a(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        this.a.put(obj, obj2);
    }

    public final void b() {
        this.a.evictAll();
    }

    public final Object c(Object obj) {
        obj.getClass();
        return this.a.get(obj);
    }
}
