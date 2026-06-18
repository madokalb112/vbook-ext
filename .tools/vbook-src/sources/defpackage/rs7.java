package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rs7 {
    public static final rs7 a;
    public static final rs7 b;
    public static final rs7 c;
    public static final /* synthetic */ rs7[] d;

    static {
        rs7 rs7Var = new rs7("PrimaryLaunched", 0);
        a = rs7Var;
        rs7 rs7Var2 = new rs7("FallbackLaunched", 1);
        b = rs7Var2;
        rs7 rs7Var3 = new rs7("Cancelled", 2);
        c = rs7Var3;
        d = new rs7[]{rs7Var, rs7Var2, rs7Var3};
    }

    public static rs7 valueOf(String str) {
        return (rs7) Enum.valueOf(rs7.class, str);
    }

    public static rs7[] values() {
        return (rs7[]) d.clone();
    }
}
