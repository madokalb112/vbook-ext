package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pa9 {
    public static final pa9 a;
    public static final pa9 b;
    public static final /* synthetic */ pa9[] c;

    static {
        pa9 pa9Var = new pa9("GENERAL", 0);
        a = pa9Var;
        pa9 pa9Var2 = new pa9("FALLBACK", 1);
        b = pa9Var2;
        c = new pa9[]{pa9Var, pa9Var2};
    }

    public static pa9 valueOf(String str) {
        return (pa9) Enum.valueOf(pa9.class, str);
    }

    public static pa9[] values() {
        return (pa9[]) c.clone();
    }
}
