package okhttp3.internal.connection;

import defpackage.lc5;
import okhttp3.Address;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface RoutePlanner {

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class DefaultImpls {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public interface Plan {
        boolean a();

        Plan b();

        void cancel();

        RealConnection d();

        ConnectResult e();

        ConnectResult g();
    }

    boolean a(RealConnection realConnection);

    Address b();

    boolean c(HttpUrl httpUrl);

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class ConnectResult {
        public final Plan a;
        public final Plan b;
        public final Throwable c;

        public /* synthetic */ ConnectResult(Plan plan, ConnectPlan connectPlan, Throwable th, int i) {
            this(plan, (i & 2) != 0 ? null : connectPlan, (i & 4) != 0 ? null : th);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConnectResult)) {
                return false;
            }
            ConnectResult connectResult = (ConnectResult) obj;
            return lc5.Q(this.a, connectResult.a) && lc5.Q(this.b, connectResult.b) && lc5.Q(this.c, connectResult.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Plan plan = this.b;
            int iHashCode2 = (iHashCode + (plan == null ? 0 : plan.hashCode())) * 31;
            Throwable th = this.c;
            return iHashCode2 + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
        }

        public ConnectResult(Plan plan, Plan plan2, Throwable th) {
            this.a = plan;
            this.b = plan2;
            this.c = th;
        }
    }
}
