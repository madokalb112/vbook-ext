package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xx1 {
    public static final xx1 a;
    public static final xx1 b;
    public static final xx1 c;
    public static final /* synthetic */ xx1[] d;

    static {
        xx1 xx1Var = new xx1("COROUTINE_SUSPENDED", 0);
        a = xx1Var;
        xx1 xx1Var2 = new xx1("UNDECIDED", 1);
        b = xx1Var2;
        xx1 xx1Var3 = new xx1("RESUMED", 2);
        c = xx1Var3;
        d = new xx1[]{xx1Var, xx1Var2, xx1Var3};
    }

    public static xx1 valueOf(String str) {
        return (xx1) Enum.valueOf(xx1.class, str);
    }

    public static xx1[] values() {
        return (xx1[]) d.clone();
    }
}
