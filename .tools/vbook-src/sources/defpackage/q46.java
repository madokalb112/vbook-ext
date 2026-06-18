package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q46 {
    public static final q46 a;
    public static final q46 b;
    public static final /* synthetic */ q46[] c;

    static {
        q46 q46Var = new q46("Default", 0);
        a = q46Var;
        q46 q46Var2 = new q46("OkHttp", 1);
        b = q46Var2;
        c = new q46[]{q46Var, q46Var2};
    }

    public static q46 valueOf(String str) {
        return (q46) Enum.valueOf(q46.class, str);
    }

    public static q46[] values() {
        return (q46[]) c.clone();
    }
}
