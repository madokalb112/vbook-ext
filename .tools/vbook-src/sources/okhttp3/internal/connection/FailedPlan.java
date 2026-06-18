package okhttp3.internal.connection;

import okhttp3.internal.connection.RoutePlanner;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class FailedPlan implements RoutePlanner.Plan {
    public final RoutePlanner.ConnectResult a;

    public FailedPlan(Throwable th) {
        this.a = new RoutePlanner.ConnectResult(this, null, th, 2);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final boolean a() {
        return false;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.Plan b() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RealConnection d() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult e() {
        return this.a;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult g() {
        return this.a;
    }
}
