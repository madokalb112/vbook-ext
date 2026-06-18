package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vx8 {
    public static final vx8 a;
    public static final vx8 b;
    public static final /* synthetic */ vx8[] c;

    static {
        vx8 vx8Var = new vx8("BACKWARD", 0);
        a = vx8Var;
        vx8 vx8Var2 = new vx8("FORWARD", 1);
        b = vx8Var2;
        c = new vx8[]{vx8Var, vx8Var2};
    }

    public static vx8 valueOf(String str) {
        return (vx8) Enum.valueOf(vx8.class, str);
    }

    public static vx8[] values() {
        return (vx8[]) c.clone();
    }
}
