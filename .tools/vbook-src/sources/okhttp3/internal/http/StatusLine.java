package okhttp3.internal.http;

import defpackage.iw9;
import java.net.ProtocolException;
import okhttp3.Protocol;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class StatusLine {
    public final Protocol a;
    public final int b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
        public static StatusLine a(String str) throws ProtocolException {
            int i;
            String strSubstring;
            boolean zK = iw9.K(str, "HTTP/1.", false);
            Protocol protocol = Protocol.HTTP_1_0;
            Protocol protocol2 = Protocol.HTTP_1_1;
            if (zK) {
                i = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt != 0) {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    protocol = protocol2;
                }
            } else if (iw9.K(str, "ICY ", false)) {
                i = 4;
            } else {
                if (!iw9.K(str, "SOURCETABLE ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                i = 12;
                protocol = protocol2;
            }
            int i2 = i + 3;
            if (str.length() < i2) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            Integer numL = iw9.L(10, str.substring(i, i2));
            if (numL == null) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iIntValue = numL.intValue();
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new StatusLine(protocol, iIntValue, strSubstring);
        }
    }

    public StatusLine(Protocol protocol, int i, String str) {
        protocol.getClass();
        str.getClass();
        this.a = protocol;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        return sb.toString();
    }
}
