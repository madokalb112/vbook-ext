package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yv5 {
    public static final yv5 a;
    public static final yv5 b;
    public static final yv5 c;
    public static final yv5 d;
    public static final yv5 e;
    public static final /* synthetic */ yv5[] f;

    static {
        yv5 yv5Var = new yv5("DEBUG", 0);
        a = yv5Var;
        yv5 yv5Var2 = new yv5("INFO", 1);
        b = yv5Var2;
        yv5 yv5Var3 = new yv5("WARNING", 2);
        c = yv5Var3;
        yv5 yv5Var4 = new yv5("ERROR", 3);
        d = yv5Var4;
        yv5 yv5Var5 = new yv5("NONE", 4);
        e = yv5Var5;
        f = new yv5[]{yv5Var, yv5Var2, yv5Var3, yv5Var4, yv5Var5};
    }

    public static yv5 valueOf(String str) {
        return (yv5) Enum.valueOf(yv5.class, str);
    }

    public static yv5[] values() {
        return (yv5[]) f.clone();
    }
}
