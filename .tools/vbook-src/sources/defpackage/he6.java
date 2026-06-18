package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class he6 {
    public static final he6 a;
    public static final he6 b;
    public static final he6 c;
    public static final /* synthetic */ he6[] d;

    static {
        he6 he6Var = new he6("NO", 0);
        a = he6Var;
        he6 he6Var2 = new he6("NOTICE", 1);
        b = he6Var2;
        he6 he6Var3 = new he6("SILENT", 2);
        c = he6Var3;
        d = new he6[]{he6Var, he6Var2, he6Var3};
    }

    public static he6 valueOf(String str) {
        return (he6) Enum.valueOf(he6.class, str);
    }

    public static he6[] values() {
        return (he6[]) d.clone();
    }
}
