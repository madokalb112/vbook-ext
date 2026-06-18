package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uq7 {
    public static final uq7 a;
    public static final uq7 b;
    public static final uq7 c;
    public static final uq7 d;
    public static final uq7 e;
    public static final /* synthetic */ uq7[] f;

    static {
        uq7 uq7Var = new uq7("VietPhrase", 0);
        a = uq7Var;
        uq7 uq7Var2 = new uq7("Name", 1);
        b = uq7Var2;
        uq7 uq7Var3 = new uq7("PhienAm", 2);
        c = uq7Var3;
        uq7 uq7Var4 = new uq7("Pronouns", 3);
        d = uq7Var4;
        uq7 uq7Var5 = new uq7("LuatNhan", 4);
        e = uq7Var5;
        f = new uq7[]{uq7Var, uq7Var2, uq7Var3, uq7Var4, uq7Var5};
    }

    public static uq7 valueOf(String str) {
        return (uq7) Enum.valueOf(uq7.class, str);
    }

    public static uq7[] values() {
        return (uq7[]) f.clone();
    }
}
