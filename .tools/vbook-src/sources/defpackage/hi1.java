package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hi1 {
    public static final hi1 a;
    public static final hi1 b;
    public static final hi1 c;
    public static final hi1 d;
    public static final hi1 e;
    public static final /* synthetic */ hi1[] f;

    /* JADX INFO: Fake field, exist only in values array */
    hi1 EF0;

    static {
        hi1 hi1Var = new hi1("TEXT", 0);
        hi1 hi1Var2 = new hi1("METHOD", 1);
        a = hi1Var2;
        hi1 hi1Var3 = new hi1("FUNCTION", 2);
        b = hi1Var3;
        hi1 hi1Var4 = new hi1("CONSTRUCTOR", 3);
        hi1 hi1Var5 = new hi1("FIELD", 4);
        hi1 hi1Var6 = new hi1("VARIABLE", 5);
        c = hi1Var6;
        hi1 hi1Var7 = new hi1("CLASS", 6);
        d = hi1Var7;
        hi1 hi1Var8 = new hi1("INTERFACE", 7);
        hi1 hi1Var9 = new hi1("MODULE", 8);
        hi1 hi1Var10 = new hi1("PROPERTY", 9);
        hi1 hi1Var11 = new hi1("UNIT", 10);
        hi1 hi1Var12 = new hi1("VALUE", 11);
        hi1 hi1Var13 = new hi1("ENUM", 12);
        hi1 hi1Var14 = new hi1("KEYWORD", 13);
        e = hi1Var14;
        f = new hi1[]{hi1Var, hi1Var2, hi1Var3, hi1Var4, hi1Var5, hi1Var6, hi1Var7, hi1Var8, hi1Var9, hi1Var10, hi1Var11, hi1Var12, hi1Var13, hi1Var14, new hi1("SNIPPET", 14)};
    }

    public static hi1 valueOf(String str) {
        return (hi1) Enum.valueOf(hi1.class, str);
    }

    public static hi1[] values() {
        return (hi1[]) f.clone();
    }
}
