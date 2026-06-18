package okhttp3;

import defpackage.iw9;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");

    public static final Companion b = new Companion();
    public final String a;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
        public static Protocol a(String str) {
            if (str.equals("http/1.0")) {
                return Protocol.HTTP_1_0;
            }
            if (str.equals("http/1.1")) {
                return Protocol.HTTP_1_1;
            }
            if (str.equals("h2_prior_knowledge")) {
                return Protocol.H2_PRIOR_KNOWLEDGE;
            }
            if (str.equals("h2")) {
                return Protocol.HTTP_2;
            }
            if (str.equals("spdy/3.1")) {
                return Protocol.SPDY_3;
            }
            if (str.equals("quic")) {
                return Protocol.QUIC;
            }
            if (iw9.K(str, "h3", false)) {
                return Protocol.HTTP_3;
            }
            sy3.m("Unexpected protocol: ".concat(str));
            return null;
        }
    }

    Protocol(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
