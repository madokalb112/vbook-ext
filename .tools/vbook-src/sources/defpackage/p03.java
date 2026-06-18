package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p03 {
    public static final p03 a;
    public static final p03 b;
    public static final p03 c;
    public static final /* synthetic */ p03[] d;

    static {
        p03 p03Var = new p03("None", 0);
        a = p03Var;
        p03 p03Var2 = new p03("Left", 1);
        b = p03Var2;
        p03 p03Var3 = new p03("Right", 2);
        c = p03Var3;
        d = new p03[]{p03Var, p03Var2, p03Var3};
    }

    public static p03 valueOf(String str) {
        return (p03) Enum.valueOf(p03.class, str);
    }

    public static p03[] values() {
        return (p03[]) d.clone();
    }
}
