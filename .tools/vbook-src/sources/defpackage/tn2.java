package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tn2 implements qa8 {
    public static final zk4 b;
    public static final tn2 c;
    public static final tn2 d;
    public static final tn2 e;
    public static final tn2 f;
    public static final tn2 s;
    public static final tn2 t;
    public static final /* synthetic */ tn2[] u;
    public static final /* synthetic */ le3 v;
    public final int a;

    static {
        tn2 tn2Var = new tn2("LDPI", 0, 120);
        c = tn2Var;
        tn2 tn2Var2 = new tn2("MDPI", 1, 160);
        d = tn2Var2;
        tn2 tn2Var3 = new tn2("HDPI", 2, 240);
        e = tn2Var3;
        tn2 tn2Var4 = new tn2("XHDPI", 3, 320);
        f = tn2Var4;
        tn2 tn2Var5 = new tn2("XXHDPI", 4, 480);
        s = tn2Var5;
        tn2 tn2Var6 = new tn2("XXXHDPI", 5, 640);
        t = tn2Var6;
        tn2[] tn2VarArr = {tn2Var, tn2Var2, tn2Var3, tn2Var4, tn2Var5, tn2Var6};
        u = tn2VarArr;
        v = new le3(tn2VarArr);
        b = new zk4(22);
    }

    public tn2(String str, int i, int i2) {
        this.a = i2;
    }

    public static tn2 valueOf(String str) {
        return (tn2) Enum.valueOf(tn2.class, str);
    }

    public static tn2[] values() {
        return (tn2[]) u.clone();
    }
}
