package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wr9 {
    public static final wr9 a;
    public static final wr9 b;
    public static final wr9 c;
    public static final /* synthetic */ wr9[] d;

    static {
        wr9 wr9Var = new wr9("Week", 0);
        a = wr9Var;
        wr9 wr9Var2 = new wr9("Month", 1);
        b = wr9Var2;
        wr9 wr9Var3 = new wr9("Total", 2);
        c = wr9Var3;
        d = new wr9[]{wr9Var, wr9Var2, wr9Var3};
    }

    public static wr9 valueOf(String str) {
        return (wr9) Enum.valueOf(wr9.class, str);
    }

    public static wr9[] values() {
        return (wr9[]) d.clone();
    }
}
