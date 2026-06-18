package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class te6 implements AutoCloseable {
    public final /* synthetic */ int a;
    public final Serializable b;
    public final Object c;

    /* JADX WARN: Type inference failed for: r0v2, types: [byte[], java.io.Serializable] */
    public te6(b10 b10Var) {
        this.a = 0;
        this.b = new byte[16];
        this.c = b10Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                return;
            default:
                nc1 nc1Var = (nc1) this.c;
                String str = (String) this.b;
                s16 s16Var = (s16) nc1Var.d;
                s16Var.getClass();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) s16Var.d;
                ev8 ev8Var = (ev8) concurrentHashMap.get(str);
                if (ev8Var != null) {
                    y91 y91Var = (y91) ((nc1) s16Var.b).e;
                    y91Var.getClass();
                    n95[] n95VarArr = (n95[]) ((ConcurrentHashMap) y91Var.c).values().toArray(new n95[0]);
                    ArrayList arrayList = new ArrayList();
                    for (n95 n95Var : n95VarArr) {
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        throw j39.h(it);
                    }
                    concurrentHashMap.remove(ev8Var.b);
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return tw2.p(new StringBuilder("MemorySyncStreamBase("), ((b10) this.c).b, ')');
            default:
                return super.toString();
        }
    }

    public te6(String str, nc1 nc1Var) {
        this.a = 1;
        this.b = str;
        this.c = nc1Var;
    }

    private final void p() {
    }
}
