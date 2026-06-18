package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class kl2 {
    public static final k46 a = n46.b("io.ktor.websocket.WebSocket");
    public static final rx1 b = new rx1("ws-incoming-processor");
    public static final rx1 c = new rx1("ws-outgoing-processor");
    public static final va1 d;

    static {
        wfc wfcVar = ua1.b;
        d = new va1((short) 1000, "OK");
        String property = System.getProperty("io.ktor.websocket.outgoingChannelCapacity");
        Integer numValueOf = property != null ? Integer.valueOf(Integer.parseInt(property)) : null;
        if (numValueOf != null) {
            new j11(numValueOf.intValue());
        }
    }
}
