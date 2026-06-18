package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wi5 {
    public static final wi5 a;
    public static final /* synthetic */ wi5[] b;

    /* JADX INFO: Fake field, exist only in values array */
    wi5 EF0;

    static {
        wi5 wi5Var = new wi5("DEBUG", 0);
        wi5 wi5Var2 = new wi5("INFO", 1);
        wi5 wi5Var3 = new wi5("WARN", 2);
        a = wi5Var3;
        b = new wi5[]{wi5Var, wi5Var2, wi5Var3, new wi5("ERROR", 3), new wi5("OFF", 4)};
    }

    public static wi5 valueOf(String str) {
        return (wi5) Enum.valueOf(wi5.class, str);
    }

    public static wi5[] values() {
        return (wi5[]) b.clone();
    }
}
