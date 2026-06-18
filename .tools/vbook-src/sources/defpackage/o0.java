package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class o0 {
    public abstract ax0 a();

    public abstract xv1 b();

    public final Object c(String str) {
        String str2;
        try {
            sn7 sn7Var = a().c;
            sn7Var.getClass();
            try {
                return d(sw1.X(sn7Var, str, b()));
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message == null) {
                    str2 = "The value parsed from '" + ((Object) str) + "' is invalid";
                } else {
                    str2 = message + " (when parsing '" + ((Object) str) + "')";
                }
                throw new d72(str2, e);
            }
        } catch (ln7 e2) {
            throw new d72("Failed to parse value from '" + ((Object) str) + '\'', e2);
        }
    }

    public abstract Object d(xv1 xv1Var);
}
