package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ud2 {
    public static final ud2 a;
    public static final ud2 b;
    public static final ud2 c;
    public static final /* synthetic */ ud2[] d;

    static {
        ud2 ud2Var = new ud2("WHITESPACE_SEPARATED", 0);
        a = ud2Var;
        ud2 ud2Var2 = new ud2("ARRAY_WRAPPED", 1);
        b = ud2Var2;
        ud2 ud2Var3 = new ud2("AUTO_DETECT", 2);
        c = ud2Var3;
        d = new ud2[]{ud2Var, ud2Var2, ud2Var3};
    }

    public static ud2 valueOf(String str) {
        return (ud2) Enum.valueOf(ud2.class, str);
    }

    public static ud2[] values() {
        return (ud2[]) d.clone();
    }
}
