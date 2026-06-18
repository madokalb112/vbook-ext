package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class le2 {
    public static final le2 a;
    public static final /* synthetic */ le2[] b;

    static {
        le2 le2Var = new le2("Text", 0);
        a = le2Var;
        b = new le2[]{le2Var};
    }

    public static le2 valueOf(String str) {
        return (le2) Enum.valueOf(le2.class, str);
    }

    public static le2[] values() {
        return (le2[]) b.clone();
    }
}
