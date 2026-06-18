package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bd1 {
    public static final bd1 a;
    public static final bd1 b;
    public static final bd1 c;
    public static final bd1 d;
    public static final bd1 e;
    public static final /* synthetic */ bd1[] f;

    /* JADX INFO: Fake field, exist only in values array */
    bd1 EF1;

    static {
        bd1 bd1Var = new bd1("Background", 0);
        bd1 bd1Var2 = new bd1("Error", 1);
        a = bd1Var2;
        bd1 bd1Var3 = new bd1("ErrorContainer", 2);
        bd1 bd1Var4 = new bd1("InverseOnSurface", 3);
        bd1 bd1Var5 = new bd1("InversePrimary", 4);
        bd1 bd1Var6 = new bd1("InverseSurface", 5);
        bd1 bd1Var7 = new bd1("OnBackground", 6);
        bd1 bd1Var8 = new bd1("OnError", 7);
        bd1 bd1Var9 = new bd1("OnErrorContainer", 8);
        bd1 bd1Var10 = new bd1("OnPrimary", 9);
        bd1 bd1Var11 = new bd1("OnPrimaryContainer", 10);
        bd1 bd1Var12 = new bd1("OnSecondary", 11);
        bd1 bd1Var13 = new bd1("OnSecondaryContainer", 12);
        bd1 bd1Var14 = new bd1("OnSurface", 13);
        b = bd1Var14;
        bd1 bd1Var15 = new bd1("OnSurfaceVariant", 14);
        c = bd1Var15;
        bd1 bd1Var16 = new bd1("OnTertiary", 15);
        bd1 bd1Var17 = new bd1("OnTertiaryContainer", 16);
        bd1 bd1Var18 = new bd1("Outline", 17);
        bd1 bd1Var19 = new bd1("OutlineVariant", 18);
        bd1 bd1Var20 = new bd1("Primary", 19);
        d = bd1Var20;
        bd1 bd1Var21 = new bd1("PrimaryContainer", 20);
        bd1 bd1Var22 = new bd1("Scrim", 21);
        bd1 bd1Var23 = new bd1("Secondary", 22);
        bd1 bd1Var24 = new bd1("SecondaryContainer", 23);
        bd1 bd1Var25 = new bd1("Surface", 24);
        bd1 bd1Var26 = new bd1("SurfaceTint", 25);
        bd1 bd1Var27 = new bd1("SurfaceVariant", 26);
        e = bd1Var27;
        f = new bd1[]{bd1Var, bd1Var2, bd1Var3, bd1Var4, bd1Var5, bd1Var6, bd1Var7, bd1Var8, bd1Var9, bd1Var10, bd1Var11, bd1Var12, bd1Var13, bd1Var14, bd1Var15, bd1Var16, bd1Var17, bd1Var18, bd1Var19, bd1Var20, bd1Var21, bd1Var22, bd1Var23, bd1Var24, bd1Var25, bd1Var26, bd1Var27, new bd1("Tertiary", 27), new bd1("TertiaryContainer", 28)};
    }

    public static bd1 valueOf(String str) {
        return (bd1) Enum.valueOf(bd1.class, str);
    }

    public static bd1[] values() {
        return (bd1[]) f.clone();
    }
}
