package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ux0 implements vx0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ux0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vx0
    public final void a(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 1:
                ((kb4) obj).invoke(th);
                break;
            default:
                ((ax2) obj).a();
                break;
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((kb4) obj).getClass().getSimpleName() + '@' + md2.c0(this) + ']';
            default:
                return "DisposeOnCancel[" + ((ax2) obj) + ']';
        }
    }
}
