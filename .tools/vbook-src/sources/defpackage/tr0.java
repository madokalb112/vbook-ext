package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tr0 {
    public static final tr0 a;
    public static final /* synthetic */ tr0[] b;

    /* JADX INFO: Fake field, exist only in values array */
    tr0 EF0;

    static {
        tr0 tr0Var = new tr0("DEBUG", 0);
        tr0 tr0Var2 = new tr0("RELEASE", 1);
        a = tr0Var2;
        b = new tr0[]{tr0Var, tr0Var2};
    }

    public static tr0 valueOf(String str) {
        return (tr0) Enum.valueOf(tr0.class, str);
    }

    public static tr0[] values() {
        return (tr0[]) b.clone();
    }
}
