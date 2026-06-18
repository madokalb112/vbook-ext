package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sx8 {
    public static final sx8 a;
    public static final sx8 b;
    public static final /* synthetic */ sx8[] c;

    static {
        sx8 sx8Var = new sx8("Start", 0);
        a = sx8Var;
        sx8 sx8Var2 = new sx8("End", 1);
        b = sx8Var2;
        c = new sx8[]{sx8Var, sx8Var2};
    }

    public static sx8 valueOf(String str) {
        return (sx8) Enum.valueOf(sx8.class, str);
    }

    public static sx8[] values() {
        return (sx8[]) c.clone();
    }
}
