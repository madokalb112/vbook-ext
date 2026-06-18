package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sl3 {
    public static final sl3 a;
    public static final sl3 b;
    public static final /* synthetic */ sl3[] c;

    static {
        sl3 sl3Var = new sl3("AllChapters", 0);
        a = sl3Var;
        sl3 sl3Var2 = new sl3("Custom", 1);
        b = sl3Var2;
        c = new sl3[]{sl3Var, sl3Var2};
    }

    public static sl3 valueOf(String str) {
        return (sl3) Enum.valueOf(sl3.class, str);
    }

    public static sl3[] values() {
        return (sl3[]) c.clone();
    }
}
