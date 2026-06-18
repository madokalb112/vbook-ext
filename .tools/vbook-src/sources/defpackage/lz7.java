package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lz7 {
    public static final lz7 a;
    public static final lz7 b;
    public static final lz7 c;
    public static final /* synthetic */ lz7[] d;

    static {
        lz7 lz7Var = new lz7("Start", 0);
        a = lz7Var;
        lz7 lz7Var2 = new lz7("End", 1);
        b = lz7Var2;
        lz7 lz7Var3 = new lz7("Top", 2);
        c = lz7Var3;
        d = new lz7[]{lz7Var, lz7Var2, lz7Var3, new lz7("Bottom", 3)};
    }

    public static lz7 valueOf(String str) {
        return (lz7) Enum.valueOf(lz7.class, str);
    }

    public static lz7[] values() {
        return (lz7[]) d.clone();
    }
}
