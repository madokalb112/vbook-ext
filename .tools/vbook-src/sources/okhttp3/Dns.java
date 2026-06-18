package okhttp3;

import defpackage.fw;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface Dns {
    public static final Dns a = new Companion.DnsSystem();

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
        public static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            public final List a(String str) throws UnknownHostException {
                str.getClass();
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    allByName.getClass();
                    return fw.O0(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }
    }

    List a(String str);
}
