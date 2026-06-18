package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y89 {
    public static final y89 a;
    public static final y89 b;
    public static final y89 c;
    public static final y89 d;
    public static final y89 e;
    public static final /* synthetic */ y89[] f;

    /* JADX INFO: Fake field, exist only in values array */
    y89 EF0;

    static {
        y89 y89Var = new y89("CornerExtraExtraLarge", 0);
        y89 y89Var2 = new y89("CornerExtraLarge", 1);
        a = y89Var2;
        y89 y89Var3 = new y89("CornerExtraLargeIncreased", 2);
        y89 y89Var4 = new y89("CornerExtraLargeTop", 3);
        y89 y89Var5 = new y89("CornerExtraSmall", 4);
        b = y89Var5;
        y89 y89Var6 = new y89("CornerExtraSmallTop", 5);
        y89 y89Var7 = new y89("CornerFull", 6);
        c = y89Var7;
        y89 y89Var8 = new y89("CornerLarge", 7);
        d = y89Var8;
        y89 y89Var9 = new y89("CornerLargeEnd", 8);
        y89 y89Var10 = new y89("CornerLargeIncreased", 9);
        y89 y89Var11 = new y89("CornerLargeStart", 10);
        y89 y89Var12 = new y89("CornerLargeTop", 11);
        y89 y89Var13 = new y89("CornerMedium", 12);
        e = y89Var13;
        f = new y89[]{y89Var, y89Var2, y89Var3, y89Var4, y89Var5, y89Var6, y89Var7, y89Var8, y89Var9, y89Var10, y89Var11, y89Var12, y89Var13, new y89("CornerNone", 13), new y89("CornerSmall", 14)};
    }

    public static y89 valueOf(String str) {
        return (y89) Enum.valueOf(y89.class, str);
    }

    public static y89[] values() {
        return (y89[]) f.clone();
    }
}
