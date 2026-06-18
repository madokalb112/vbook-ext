package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t13 {
    public static final t13 a;
    public static final t13 b;
    public static final t13 c;
    public static final /* synthetic */ t13[] d;

    static {
        t13 t13Var = new t13("None", 0);
        a = t13Var;
        t13 t13Var2 = new t13("Downloaded", 1);
        b = t13Var2;
        t13 t13Var3 = new t13("Downloading", 2);
        c = t13Var3;
        d = new t13[]{t13Var, t13Var2, t13Var3};
    }

    public static t13 valueOf(String str) {
        return (t13) Enum.valueOf(t13.class, str);
    }

    public static t13[] values() {
        return (t13[]) d.clone();
    }
}
