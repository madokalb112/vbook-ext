package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tx8 {
    public static final tx8 a;
    public static final /* synthetic */ tx8[] b;

    static {
        tx8 tx8Var = new tx8("Always", 0);
        a = tx8Var;
        b = new tx8[]{tx8Var, new tx8("WhenVisible", 1)};
    }

    public static tx8 valueOf(String str) {
        return (tx8) Enum.valueOf(tx8.class, str);
    }

    public static tx8[] values() {
        return (tx8[]) b.clone();
    }
}
