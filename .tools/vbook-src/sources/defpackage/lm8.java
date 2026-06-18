package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lm8 {
    public static final lm8 a;
    public static final lm8 b;
    public static final lm8 c;
    public static final /* synthetic */ lm8[] d;

    static {
        lm8 lm8Var = new lm8("Replace", 0);
        a = lm8Var;
        lm8 lm8Var2 = new lm8("Merge", 1);
        b = lm8Var2;
        lm8 lm8Var3 = new lm8("Missing", 2);
        c = lm8Var3;
        d = new lm8[]{lm8Var, lm8Var2, lm8Var3};
    }

    public static lm8 valueOf(String str) {
        return (lm8) Enum.valueOf(lm8.class, str);
    }

    public static lm8[] values() {
        return (lm8[]) d.clone();
    }
}
