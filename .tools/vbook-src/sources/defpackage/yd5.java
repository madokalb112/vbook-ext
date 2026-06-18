package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface yd5 extends hx1 {
    p71 attachChild(s71 s71Var);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    a39 getChildren();

    ax2 invokeOnCompletion(kb4 kb4Var);

    ax2 invokeOnCompletion(boolean z, boolean z2, kb4 kb4Var);

    boolean isActive();

    boolean isCancelled();

    Object join(jt1 jt1Var);

    boolean start();
}
