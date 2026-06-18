package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g23 {
    public static final g23 a;
    public static final g23 b;
    public static final g23 c;
    public static final /* synthetic */ g23[] d;

    static {
        g23 g23Var = new g23("Start", 0);
        a = g23Var;
        g23 g23Var2 = new g23("Center", 1);
        b = g23Var2;
        g23 g23Var3 = new g23("End", 2);
        c = g23Var3;
        d = new g23[]{g23Var, g23Var2, g23Var3};
    }

    public static g23 valueOf(String str) {
        return (g23) Enum.valueOf(g23.class, str);
    }

    public static g23[] values() {
        return (g23[]) d.clone();
    }
}
