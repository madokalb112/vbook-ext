package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pr0 {
    public static final pr0 a;
    public static final pr0 b;
    public static final /* synthetic */ pr0[] c;

    static {
        pr0 pr0Var = new pr0("Real", 0);
        a = pr0Var;
        pr0 pr0Var2 = new pr0("Virtual", 1);
        b = pr0Var2;
        c = new pr0[]{pr0Var, pr0Var2};
    }

    public static pr0 valueOf(String str) {
        return (pr0) Enum.valueOf(pr0.class, str);
    }

    public static pr0[] values() {
        return (pr0[]) c.clone();
    }
}
