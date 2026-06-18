package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class j8 extends c1 {
    public static final sdc c;
    public static final vt5 d = new vt5(j8.class);
    public volatile Set a;
    public volatile int b;

    static {
        Throwable th;
        sdc i8Var;
        try {
            i8Var = new h8(AtomicReferenceFieldUpdater.newUpdater(j8.class, Set.class, "a"), AtomicIntegerFieldUpdater.newUpdater(j8.class, "b"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            i8Var = new i8();
        }
        c = i8Var;
        if (th != null) {
            d.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
