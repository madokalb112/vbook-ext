package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ck5 {
    public static final ck5 a;
    public static final ck5 b;
    public static final /* synthetic */ ck5[] c;

    static {
        ck5 ck5Var = new ck5("Singleton", 0);
        a = ck5Var;
        ck5 ck5Var2 = new ck5("Factory", 1);
        b = ck5Var2;
        c = new ck5[]{ck5Var, ck5Var2, new ck5("Scoped", 2)};
    }

    public static ck5 valueOf(String str) {
        return (ck5) Enum.valueOf(ck5.class, str);
    }

    public static ck5[] values() {
        return (ck5[]) c.clone();
    }
}
