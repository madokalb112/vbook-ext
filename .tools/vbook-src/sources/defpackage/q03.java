package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q03 {
    public static final q03 a;
    public static final q03 b;
    public static final q03 c;
    public static final q03 d;
    public static final /* synthetic */ q03[] e;

    static {
        q03 q03Var = new q03("Up", 0);
        a = q03Var;
        q03 q03Var2 = new q03("Drag", 1);
        b = q03Var2;
        q03 q03Var3 = new q03("Timeout", 2);
        c = q03Var3;
        q03 q03Var4 = new q03("Cancel", 3);
        d = q03Var4;
        e = new q03[]{q03Var, q03Var2, q03Var3, q03Var4};
    }

    public static q03 valueOf(String str) {
        return (q03) Enum.valueOf(q03.class, str);
    }

    public static q03[] values() {
        return (q03[]) e.clone();
    }
}
