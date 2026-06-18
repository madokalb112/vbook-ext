package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cm7 {
    public static final cm7 a;
    public static final cm7 b;
    public static final cm7 c;
    public static final cm7 d;
    public static final cm7 e;
    public static final cm7 f;
    public static final cm7 s;
    public static final cm7 t;
    public static final cm7 u;
    public static final /* synthetic */ cm7[] v;

    static {
        cm7 cm7Var = new cm7("TonalSpot", 0);
        a = cm7Var;
        cm7 cm7Var2 = new cm7("Neutral", 1);
        b = cm7Var2;
        cm7 cm7Var3 = new cm7("Vibrant", 2);
        c = cm7Var3;
        cm7 cm7Var4 = new cm7("Expressive", 3);
        d = cm7Var4;
        cm7 cm7Var5 = new cm7("Rainbow", 4);
        e = cm7Var5;
        cm7 cm7Var6 = new cm7("FruitSalad", 5);
        f = cm7Var6;
        cm7 cm7Var7 = new cm7("Monochrome", 6);
        s = cm7Var7;
        cm7 cm7Var8 = new cm7("Fidelity", 7);
        t = cm7Var8;
        cm7 cm7Var9 = new cm7("Content", 8);
        u = cm7Var9;
        v = new cm7[]{cm7Var, cm7Var2, cm7Var3, cm7Var4, cm7Var5, cm7Var6, cm7Var7, cm7Var8, cm7Var9};
    }

    public static cm7 valueOf(String str) {
        return (cm7) Enum.valueOf(cm7.class, str);
    }

    public static cm7[] values() {
        return (cm7[]) v.clone();
    }
}
