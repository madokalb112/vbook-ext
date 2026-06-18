package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ar0 {
    public static final ar0 a;
    public static final ar0 b;
    public static final ar0 c;
    public static final /* synthetic */ ar0[] d;

    static {
        ar0 ar0Var = new ar0("SUSPEND", 0);
        a = ar0Var;
        ar0 ar0Var2 = new ar0("DROP_OLDEST", 1);
        b = ar0Var2;
        ar0 ar0Var3 = new ar0("DROP_LATEST", 2);
        c = ar0Var3;
        d = new ar0[]{ar0Var, ar0Var2, ar0Var3};
    }

    public static ar0 valueOf(String str) {
        return (ar0) Enum.valueOf(ar0.class, str);
    }

    public static ar0[] values() {
        return (ar0[]) d.clone();
    }
}
