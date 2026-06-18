package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fm3 {
    public static final fm3 a;
    public static final fm3 b;
    public static final fm3 c;
    public static final fm3 d;
    public static final fm3 e;
    public static final /* synthetic */ fm3[] f;

    static {
        fm3 fm3Var = new fm3("Preparing", 0);
        a = fm3Var;
        fm3 fm3Var2 = new fm3("Exporting", 1);
        b = fm3Var2;
        fm3 fm3Var3 = new fm3("Zipping", 2);
        c = fm3Var3;
        fm3 fm3Var4 = new fm3("Cleaning", 3);
        d = fm3Var4;
        fm3 fm3Var5 = new fm3("Completed", 4);
        e = fm3Var5;
        f = new fm3[]{fm3Var, fm3Var2, fm3Var3, fm3Var4, fm3Var5};
    }

    public static fm3 valueOf(String str) {
        return (fm3) Enum.valueOf(fm3.class, str);
    }

    public static fm3[] values() {
        return (fm3[]) f.clone();
    }
}
