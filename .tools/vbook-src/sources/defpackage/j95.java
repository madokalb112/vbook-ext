package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j95 {
    public static final j95 a;
    public static final j95 b;
    public static final j95 c;
    public static final j95 d;
    public static final /* synthetic */ j95[] e;

    static {
        j95 j95Var = new j95("Loading", 0);
        a = j95Var;
        j95 j95Var2 = new j95("Detail", 1);
        b = j95Var2;
        j95 j95Var3 = new j95("Error", 2);
        c = j95Var3;
        j95 j95Var4 = new j95("Installing", 3);
        d = j95Var4;
        e = new j95[]{j95Var, j95Var2, j95Var3, j95Var4};
    }

    public static j95 valueOf(String str) {
        return (j95) Enum.valueOf(j95.class, str);
    }

    public static j95[] values() {
        return (j95[]) e.clone();
    }
}
