package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pm3 {
    public static final pm3 a;
    public static final pm3 b;
    public static final pm3 c;
    public static final /* synthetic */ pm3[] d;

    static {
        pm3 pm3Var = new pm3("InProgress", 0);
        a = pm3Var;
        pm3 pm3Var2 = new pm3("Completed", 1);
        b = pm3Var2;
        pm3 pm3Var3 = new pm3("Failed", 2);
        c = pm3Var3;
        d = new pm3[]{pm3Var, pm3Var2, pm3Var3};
    }

    public static pm3 valueOf(String str) {
        return (pm3) Enum.valueOf(pm3.class, str);
    }

    public static pm3[] values() {
        return (pm3[]) d.clone();
    }
}
