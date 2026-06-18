package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ek7 {
    public static final ek7 a;
    public static final ek7 b;
    public static final /* synthetic */ ek7[] c;

    static {
        ek7 ek7Var = new ek7("Prev", 0);
        a = ek7Var;
        ek7 ek7Var2 = new ek7("Current", 1);
        ek7 ek7Var3 = new ek7("Next", 2);
        b = ek7Var3;
        c = new ek7[]{ek7Var, ek7Var2, ek7Var3};
    }

    public static ek7 valueOf(String str) {
        return (ek7) Enum.valueOf(ek7.class, str);
    }

    public static ek7[] values() {
        return (ek7[]) c.clone();
    }
}
