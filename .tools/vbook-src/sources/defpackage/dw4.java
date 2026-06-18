package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class dw4 {
    public static final k46 a = n46.b("io.ktor.client.plugins.HttpTimeout");
    public static final y91 b;

    static {
        cw4 cw4Var = cw4.t;
        xl4 xl4Var = new xl4(18);
        cw4Var.getClass();
        b = new y91("HttpTimeout", cw4Var, xl4Var);
    }

    public static final SocketTimeoutException a(fx3 fx3Var, IOException iOException) {
        Object obj;
        fx3Var.getClass();
        StringBuilder sb = new StringBuilder("Socket timeout has expired [url=");
        sb.append((ngb) fx3Var.b);
        sb.append(", socket_timeout=");
        bw4 bw4Var = (bw4) fx3Var.b();
        if (bw4Var == null || (obj = bw4Var.c) == null) {
            obj = "unknown";
        }
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(dx1.k(sb, obj, "] ms"));
        socketTimeoutException.initCause(iOException);
        return socketTimeoutException;
    }
}
