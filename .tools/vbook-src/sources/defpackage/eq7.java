package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class eq7 {
    public static final eq7 a;
    public static final /* synthetic */ eq7[] b;
    public static final /* synthetic */ le3 c;

    static {
        eq7 eq7Var = new eq7("SUCCESS", 0);
        a = eq7Var;
        eq7[] eq7VarArr = {eq7Var, new eq7("WRONG_PASSWORD", 1), new eq7("PDF_ERROR", 2), new eq7("LOADING_ERROR", 3), new eq7("UNKNOWN", 4)};
        b = eq7VarArr;
        c = new le3(eq7VarArr);
    }

    public static eq7 valueOf(String str) {
        return (eq7) Enum.valueOf(eq7.class, str);
    }

    public static eq7[] values() {
        return (eq7[]) b.clone();
    }
}
