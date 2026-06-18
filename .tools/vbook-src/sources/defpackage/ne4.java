package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ne4 {
    public static final ne4 a;
    public static final ne4 b;
    public static final ne4 c;
    public static final /* synthetic */ ne4[] d;

    static {
        ne4 ne4Var = new ne4("None", 0);
        a = ne4Var;
        ne4 ne4Var2 = new ne4("Brightness", 1);
        b = ne4Var2;
        ne4 ne4Var3 = new ne4("Volume", 2);
        c = ne4Var3;
        d = new ne4[]{ne4Var, ne4Var2, ne4Var3};
    }

    public static ne4 valueOf(String str) {
        return (ne4) Enum.valueOf(ne4.class, str);
    }

    public static ne4[] values() {
        return (ne4[]) d.clone();
    }
}
