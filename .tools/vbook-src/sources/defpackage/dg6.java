package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dg6 {
    public static final dg6 a;
    public static final dg6 b;
    public static final dg6 c;
    public static final dg6 d;
    public static final /* synthetic */ dg6[] e;

    static {
        dg6 dg6Var = new dg6("Top", 0);
        a = dg6Var;
        dg6 dg6Var2 = new dg6("Center", 1);
        b = dg6Var2;
        dg6 dg6Var3 = new dg6("Bottom", 2);
        c = dg6Var3;
        dg6 dg6Var4 = new dg6("Alone", 3);
        d = dg6Var4;
        e = new dg6[]{dg6Var, dg6Var2, dg6Var3, dg6Var4};
    }

    public static dg6 valueOf(String str) {
        return (dg6) Enum.valueOf(dg6.class, str);
    }

    public static dg6[] values() {
        return (dg6[]) e.clone();
    }
}
