package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jl5 extends LinkedHashMap {
    public final qd2 a;
    public final ss6 b;
    public final int c;

    public jl5(qd2 qd2Var, ss6 ss6Var) {
        super(10, 0.75f, true);
        this.a = qd2Var;
        this.b = ss6Var;
        this.c = 10;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (this.c == 0) {
            return this.a.invoke(obj);
        }
        synchronized (this) {
            Object obj2 = super.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object objInvoke = this.a.invoke(obj);
            put(obj, objInvoke);
            return objInvoke;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        entry.getClass();
        boolean z = super.size() > this.c;
        if (z) {
            this.b.invoke(entry.getValue());
        }
        return z;
    }
}
