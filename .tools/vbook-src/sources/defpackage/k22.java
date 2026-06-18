package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k22 {
    public static final k22 a;
    public static final k22 b;
    public static final k22 c;
    public static final /* synthetic */ k22[] d;

    static {
        k22 k22Var = new k22("None", 0);
        a = k22Var;
        k22 k22Var2 = new k22("Cancelled", 1);
        b = k22Var2;
        k22 k22Var3 = new k22("Redirected", 2);
        c = k22Var3;
        d = new k22[]{k22Var, k22Var2, k22Var3, new k22("RedirectCancelled", 3)};
    }

    public static k22 valueOf(String str) {
        return (k22) Enum.valueOf(k22.class, str);
    }

    public static k22[] values() {
        return (k22[]) d.clone();
    }
}
