package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s09 {
    public static final s09 a;
    public static final s09 b;
    public static final s09 c;
    public static final /* synthetic */ s09[] d;

    static {
        s09 s09Var = new s09("Top", 0);
        a = s09Var;
        s09 s09Var2 = new s09("Bottom", 1);
        b = s09Var2;
        s09 s09Var3 = new s09("None", 2);
        c = s09Var3;
        d = new s09[]{s09Var, s09Var2, s09Var3};
    }

    public static s09 valueOf(String str) {
        return (s09) Enum.valueOf(s09.class, str);
    }

    public static s09[] values() {
        return (s09[]) d.clone();
    }
}
