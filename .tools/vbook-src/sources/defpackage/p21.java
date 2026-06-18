package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class p21 {
    public static final pa7 a;

    static {
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        a = property != null ? Boolean.parseBoolean(property) : false ? new o21() : new qs0(4096, 1);
    }
}
