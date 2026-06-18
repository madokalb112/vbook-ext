package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class pg2 {
    public static final im2 a;

    static {
        String property;
        im2 im2Var;
        int i = f7a.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            aj2 aj2Var = rw2.a;
            fj4 fj4Var = r76.a;
            fj4 fj4Var2 = fj4Var.f;
            im2Var = fj4Var;
            if (fj4Var == null) {
                im2Var = og2.x;
            }
        } else {
            im2Var = og2.x;
        }
        a = im2Var;
    }
}
