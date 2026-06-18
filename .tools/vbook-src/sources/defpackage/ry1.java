package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ry1 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ sy1 b;

    public ry1(sy1 sy1Var, long j) {
        this.b = sy1Var;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        this.b.k.i(bundle);
        return null;
    }
}
