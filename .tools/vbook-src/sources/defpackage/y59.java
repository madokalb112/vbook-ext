package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y59 {
    public static final y59 a;
    public static final y59 b;
    public static final /* synthetic */ y59[] c;

    static {
        y59 y59Var = new y59("CRASHLYTICS", 0);
        a = y59Var;
        y59 y59Var2 = new y59("PERFORMANCE", 1);
        b = y59Var2;
        c = new y59[]{y59Var, y59Var2, new y59("MATT_SAYS_HI", 2)};
    }

    public static y59 valueOf(String str) {
        return (y59) Enum.valueOf(y59.class, str);
    }

    public static y59[] values() {
        return (y59[]) c.clone();
    }
}
