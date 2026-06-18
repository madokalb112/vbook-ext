package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g81 {
    public static final g81 a;
    public static final g81 b;
    public static final /* synthetic */ g81[] c;

    static {
        g81 g81Var = new g81("CBC", 0);
        a = g81Var;
        g81 g81Var2 = new g81("ECB", 1);
        b = g81Var2;
        c = new g81[]{g81Var, g81Var2};
    }

    public static g81 valueOf(String str) {
        return (g81) Enum.valueOf(g81.class, str);
    }

    public static g81[] values() {
        return (g81[]) c.clone();
    }
}
