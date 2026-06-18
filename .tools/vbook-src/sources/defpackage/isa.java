package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class isa {
    public static final ThreadLocal a = new ThreadLocal();

    public static zg3 a() {
        ThreadLocal threadLocal = a;
        zg3 zg3Var = (zg3) threadLocal.get();
        if (zg3Var != null) {
            return zg3Var;
        }
        lh0 lh0Var = new lh0(Thread.currentThread());
        threadLocal.set(lh0Var);
        return lh0Var;
    }
}
