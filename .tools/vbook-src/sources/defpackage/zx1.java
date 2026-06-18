package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zx1 {
    public static final zx1 a;
    public static final zx1 b;
    public static final zx1 c;
    public static final zx1 d;
    public static final /* synthetic */ zx1[] e;

    static {
        zx1 zx1Var = new zx1("DEFAULT", 0);
        a = zx1Var;
        zx1 zx1Var2 = new zx1("LAZY", 1);
        b = zx1Var2;
        zx1 zx1Var3 = new zx1("ATOMIC", 2);
        c = zx1Var3;
        zx1 zx1Var4 = new zx1("UNDISPATCHED", 3);
        d = zx1Var4;
        e = new zx1[]{zx1Var, zx1Var2, zx1Var3, zx1Var4};
    }

    public static zx1 valueOf(String str) {
        return (zx1) Enum.valueOf(zx1.class, str);
    }

    public static zx1[] values() {
        return (zx1[]) e.clone();
    }
}
