package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface pa7 extends AutoCloseable {
    void C0(Object obj);

    Object G();

    void a();

    @Override // java.lang.AutoCloseable
    default void close() {
        a();
    }
}
