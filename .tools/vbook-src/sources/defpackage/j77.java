package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j77 extends n0 implements yd5 {
    public static final j77 b = new j77(s00.s);

    @Override // defpackage.yd5
    public final p71 attachChild(s71 s71Var) {
        return l77.a;
    }

    @Override // defpackage.yd5
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.yd5
    public final a39 getChildren() {
        return rc3.a;
    }

    @Override // defpackage.yd5
    public final ax2 invokeOnCompletion(kb4 kb4Var) {
        return l77.a;
    }

    @Override // defpackage.yd5
    public final boolean isActive() {
        return true;
    }

    @Override // defpackage.yd5
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.yd5
    public final Object join(jt1 jt1Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.yd5
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.yd5
    public final ax2 invokeOnCompletion(boolean z, boolean z2, kb4 kb4Var) {
        return l77.a;
    }

    @Override // defpackage.yd5
    public final void cancel(CancellationException cancellationException) {
    }
}
