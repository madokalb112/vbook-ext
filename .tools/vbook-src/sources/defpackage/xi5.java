package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xi5 {
    public static final d6a a = new d6a(new ua5(11));
    public static final d6a b;
    public static final js8 c;
    public static final wi5 d;

    static {
        d6a d6aVar = new d6a(new ua5(12));
        b = d6aVar;
        c = new js8(26);
        wi5 wi5Var = wi5.a;
        d = wi5Var;
        if (!((Boolean) d6aVar.getValue()).booleanValue()) {
            System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "warn");
        }
        d = wi5Var;
    }

    public static void a(String str, Throwable th) {
        if (d.ordinal() <= 2) {
            c.getClass();
            if (((Boolean) b.getValue()).booleanValue()) {
                Log.w("KavaRef", String.valueOf(str), th);
            } else {
                ((k46) a.getValue()).f(String.valueOf(str), th);
            }
        }
    }
}
