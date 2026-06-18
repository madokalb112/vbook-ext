package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ug3 implements ez9, o68 {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();

    public final synchronized void a() {
        ft2 ft2Var = ft2.c;
        am7 am7Var = am7.b;
        synchronized (this) {
            try {
                if (!this.a.containsKey(s32.class)) {
                    this.a.put(s32.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(s32.class)).put(am7Var, ft2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
