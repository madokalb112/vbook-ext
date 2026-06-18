package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h85 {
    public static final h85 a;
    public static final h85 b;
    public static final h85 c;
    public static final /* synthetic */ h85[] d;

    static {
        h85 h85Var = new h85("Focused", 0);
        a = h85Var;
        h85 h85Var2 = new h85("UnfocusedEmpty", 1);
        b = h85Var2;
        h85 h85Var3 = new h85("UnfocusedNotEmpty", 2);
        c = h85Var3;
        d = new h85[]{h85Var, h85Var2, h85Var3};
    }

    public static h85 valueOf(String str) {
        return (h85) Enum.valueOf(h85.class, str);
    }

    public static h85[] values() {
        return (h85[]) d.clone();
    }
}
