package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class qe5 {
    public static final zy2 a = new zy2("COMPLETING_ALREADY", 6);
    public static final zy2 b = new zy2("COMPLETING_WAITING_CHILDREN", 6);
    public static final zy2 c = new zy2("COMPLETING_RETRY", 6);
    public static final zy2 d = new zy2("TOO_LATE_TO_CANCEL", 6);
    public static final zy2 e = new zy2("SEALED", 6);
    public static final cc3 f = new cc3(false);
    public static final cc3 g = new cc3(true);

    public static final Object a(Object obj) {
        t55 t55Var;
        x55 x55Var = obj instanceof x55 ? (x55) obj : null;
        return (x55Var == null || (t55Var = x55Var.a) == null) ? obj : t55Var;
    }
}
