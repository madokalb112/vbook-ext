package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.internal.connection.RoutePlanner;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class SequentialExchangeFinder implements ExchangeFinder {
    public final RealRoutePlanner a;

    public SequentialExchangeFinder(RealRoutePlanner realRoutePlanner) {
        this.a = realRoutePlanner;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RealConnection a() throws Throwable {
        RoutePlanner.Plan planD;
        RealRoutePlanner realRoutePlanner = this.a;
        IOException iOException = null;
        while (!realRoutePlanner.k.D) {
            try {
                planD = realRoutePlanner.d();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    i12.r(iOException, e);
                }
                if (!realRoutePlanner.a(null)) {
                    throw iOException;
                }
            }
            if (!planD.a()) {
                RoutePlanner.ConnectResult connectResultE = planD.e();
                if (connectResultE.b == null && connectResultE.c == null) {
                    connectResultE = planD.g();
                }
                RoutePlanner.Plan plan = connectResultE.b;
                Throwable th = connectResultE.c;
                if (th != null) {
                    throw th;
                }
                if (plan != null) {
                    realRoutePlanner.p.addFirst(plan);
                }
            }
            return planD.d();
        }
        sy3.m("Canceled");
        return null;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RoutePlanner b() {
        return this.a;
    }
}
