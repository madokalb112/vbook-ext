package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lb9 {
    public static final lb9 a;
    public static final lb9 b;
    public static final lb9 c;
    public static final /* synthetic */ lb9[] d;

    static {
        lb9 lb9Var = new lb9("Hidden", 0);
        a = lb9Var;
        lb9 lb9Var2 = new lb9("Expanded", 1);
        b = lb9Var2;
        lb9 lb9Var3 = new lb9("PartiallyExpanded", 2);
        c = lb9Var3;
        d = new lb9[]{lb9Var, lb9Var2, lb9Var3};
    }

    public static lb9 valueOf(String str) {
        return (lb9) Enum.valueOf(lb9.class, str);
    }

    public static lb9[] values() {
        return (lb9[]) d.clone();
    }
}
