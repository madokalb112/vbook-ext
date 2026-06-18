package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c00 {
    public static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(c00.class, "a");
    public volatile long a;

    public final String toString() {
        return String.valueOf(this.a);
    }
}
