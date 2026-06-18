package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hz9 implements ow4 {
    public volatile boolean a = false;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final LinkedBlockingQueue c = new LinkedBlockingQueue();

    @Override // defpackage.ow4
    public final synchronized k46 a(String str) {
        gz9 gz9Var;
        gz9Var = (gz9) this.b.get(str);
        if (gz9Var == null) {
            gz9Var = new gz9(str, this.c, this.a);
            this.b.put(str, gz9Var);
        }
        return gz9Var;
    }
}
