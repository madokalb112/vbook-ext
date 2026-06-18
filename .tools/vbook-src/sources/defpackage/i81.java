package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i81 {
    public static final i81 a;
    public static final i81 b;
    public static final i81 c;
    public static final /* synthetic */ i81[] d;

    static {
        i81 i81Var = new i81("PKCS7", 0);
        a = i81Var;
        i81 i81Var2 = new i81("ZERO", 1);
        b = i81Var2;
        i81 i81Var3 = new i81("NONE", 2);
        c = i81Var3;
        d = new i81[]{i81Var, i81Var2, i81Var3};
    }

    public static i81 valueOf(String str) {
        return (i81) Enum.valueOf(i81.class, str);
    }

    public static i81[] values() {
        return (i81[]) d.clone();
    }
}
