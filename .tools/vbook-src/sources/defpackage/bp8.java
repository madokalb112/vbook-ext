package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bp8 {
    public static final bp8 a;
    public static final bp8 b;
    public static final bp8 c;
    public static final /* synthetic */ bp8[] d;

    static {
        bp8 bp8Var = new bp8("AUTOMATIC", 0);
        a = bp8Var;
        bp8 bp8Var2 = new bp8("TRUNCATE", 1);
        b = bp8Var2;
        bp8 bp8Var3 = new bp8("WRITE_AHEAD_LOGGING", 2);
        c = bp8Var3;
        d = new bp8[]{bp8Var, bp8Var2, bp8Var3};
    }

    public static bp8 valueOf(String str) {
        return (bp8) Enum.valueOf(bp8.class, str);
    }

    public static bp8[] values() {
        return (bp8[]) d.clone();
    }
}
