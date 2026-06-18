package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class om3 {
    public static final om3 a;
    public static final om3 b;
    public static final om3 c;
    public static final om3 d;
    public static final om3 e;
    public static final om3 f;
    public static final om3 s;
    public static final om3 t;
    public static final /* synthetic */ om3[] u;

    static {
        om3 om3Var = new om3("Preparing", 0);
        a = om3Var;
        om3 om3Var2 = new om3("BuildingContent", 1);
        b = om3Var2;
        om3 om3Var3 = new om3("WritingFiles", 2);
        c = om3Var3;
        om3 om3Var4 = new om3("Zipping", 3);
        d = om3Var4;
        om3 om3Var5 = new om3("Saving", 4);
        e = om3Var5;
        om3 om3Var6 = new om3("Cleaning", 5);
        f = om3Var6;
        om3 om3Var7 = new om3("Completed", 6);
        s = om3Var7;
        om3 om3Var8 = new om3("Failed", 7);
        t = om3Var8;
        u = new om3[]{om3Var, om3Var2, om3Var3, om3Var4, om3Var5, om3Var6, om3Var7, om3Var8};
    }

    public static om3 valueOf(String str) {
        return (om3) Enum.valueOf(om3.class, str);
    }

    public static om3[] values() {
        return (om3[]) u.clone();
    }
}
