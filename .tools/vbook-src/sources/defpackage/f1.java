package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract /* synthetic */ class f1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, j1 j1Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(j1Var, j, obj, obj2)) {
            if (unsafe.getObject(j1Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
