package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x89 {
    public static final x89 a;
    public static final /* synthetic */ x89[] b;

    /* JADX INFO: Fake field, exist only in values array */
    x89 EF0;

    static {
        x89 x89Var = new x89("CornerExtraLarge", 0);
        x89 x89Var2 = new x89("CornerExtraLargeTop", 1);
        x89 x89Var3 = new x89("CornerExtraSmall", 2);
        x89 x89Var4 = new x89("CornerExtraSmallTop", 3);
        a = x89Var4;
        b = new x89[]{x89Var, x89Var2, x89Var3, x89Var4, new x89("CornerFull", 4), new x89("CornerLarge", 5), new x89("CornerLargeEnd", 6), new x89("CornerLargeTop", 7), new x89("CornerMedium", 8), new x89("CornerNone", 9), new x89("CornerSmall", 10)};
    }

    public static x89 valueOf(String str) {
        return (x89) Enum.valueOf(x89.class, str);
    }

    public static x89[] values() {
        return (x89[]) b.clone();
    }
}
