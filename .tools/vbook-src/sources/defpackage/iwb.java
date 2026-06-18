package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class iwb {
    public static final j00 a;
    public static final j00 b;
    public static final k46 c;

    static {
        fbb fbbVarE;
        a91 a91VarA = ug8.a(List.class);
        fbb fbbVarD = null;
        try {
            fbbVarE = ug8.e(List.class, lw1.H(ug8.e(awb.class, ri5.c)));
        } catch (Throwable unused) {
            fbbVarE = null;
        }
        a = new j00("Websocket extensions", new bbb(a91VarA, fbbVarE));
        a91 a91VarA2 = ug8.a(hwb.class);
        try {
            fbbVarD = ug8.d(hwb.class);
        } catch (Throwable unused2) {
        }
        b = new j00("Websocket plugin config", new bbb(a91VarA2, fbbVarD));
        c = n46.b("io.ktor.client.plugins.websocket.WebSockets");
    }
}
