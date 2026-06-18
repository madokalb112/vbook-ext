package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ek5 {
    public static final fn1 a;

    static {
        new yu5(new ua5(14));
        new yu5(new ua5(15));
        a = new fn1(new ua5(16));
        new yu5(new ua5(17));
    }

    public static final ev8 a(dd4 dd4Var) {
        fn1 fn1Var = a;
        try {
            wk1 wk1Var = (wk1) dd4Var.j(fn1Var);
            if (wk1Var.b == null) {
                wk1Var.b = wk1Var.a.invoke();
            }
            Object obj = wk1Var.b;
            if (obj != null) {
                return (ev8) obj;
            }
            throw new IllegalStateException("Can't retrieve Koin context value. Ensure Koin is properly initialized with startKoin() or KoinApplication.");
        } catch (Exception e) {
            wk1 wk1Var2 = (wk1) dd4Var.j(fn1Var);
            Object objInvoke = wk1Var2.a.invoke();
            wk1Var2.b = objInvoke;
            ev8 ev8Var = (ev8) objInvoke;
            if (ev8Var != null) {
                return ev8Var;
            }
            mn5.n(e, "Can't get Koin scope due to error: ");
            return null;
        }
    }
}
