package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zt8 {
    public static final zt8 a;
    public static final zt8 b;
    public static final zt8 c;
    public static final zt8 d;
    public static final zt8 e;
    public static final /* synthetic */ zt8[] f;

    static {
        zt8 zt8Var = new zt8("TopBar", 0);
        a = zt8Var;
        zt8 zt8Var2 = new zt8("MainContent", 1);
        b = zt8Var2;
        zt8 zt8Var3 = new zt8("Snackbar", 2);
        c = zt8Var3;
        zt8 zt8Var4 = new zt8("Fab", 3);
        d = zt8Var4;
        zt8 zt8Var5 = new zt8("BottomBar", 4);
        e = zt8Var5;
        f = new zt8[]{zt8Var, zt8Var2, zt8Var3, zt8Var4, zt8Var5};
    }

    public static zt8 valueOf(String str) {
        return (zt8) Enum.valueOf(zt8.class, str);
    }

    public static zt8[] values() {
        return (zt8[]) f.clone();
    }
}
