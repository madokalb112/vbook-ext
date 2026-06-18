package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hu4 {
    public static final hu4 a;
    public static final hu4 b;
    public static final hu4 c;
    public static final hu4 d;
    public static final /* synthetic */ hu4[] e;

    static {
        hu4 hu4Var = new hu4("Get", 0);
        a = hu4Var;
        hu4 hu4Var2 = new hu4("Post", 1);
        b = hu4Var2;
        hu4 hu4Var3 = new hu4("Put", 2);
        c = hu4Var3;
        hu4 hu4Var4 = new hu4("Delete", 3);
        d = hu4Var4;
        e = new hu4[]{hu4Var, hu4Var2, hu4Var3, hu4Var4};
    }

    public static hu4 valueOf(String str) {
        return (hu4) Enum.valueOf(hu4.class, str);
    }

    public static hu4[] values() {
        return (hu4[]) e.clone();
    }
}
