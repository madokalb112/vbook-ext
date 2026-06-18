package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ux8 {
    public static final ux8 a;
    public static final ux8 b;
    public static final /* synthetic */ ux8[] c;

    /* JADX INFO: Fake field, exist only in values array */
    ux8 EF0;

    static {
        ux8 ux8Var = new ux8("Full", 0);
        ux8 ux8Var2 = new ux8("Thumb", 1);
        a = ux8Var2;
        ux8 ux8Var3 = new ux8("Disabled", 2);
        b = ux8Var3;
        c = new ux8[]{ux8Var, ux8Var2, ux8Var3};
    }

    public static ux8 valueOf(String str) {
        return (ux8) Enum.valueOf(ux8.class, str);
    }

    public static ux8[] values() {
        return (ux8[]) c.clone();
    }
}
