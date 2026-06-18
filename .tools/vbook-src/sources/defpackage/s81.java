package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s81 {
    public static final s81 a;
    public static final s81 b;
    public static final s81 c;
    public static final /* synthetic */ s81[] d;

    static {
        s81 s81Var = new s81("NONE", 0);
        a = s81Var;
        s81 s81Var2 = new s81("ALL_JSON_OBJECTS", 1);
        b = s81Var2;
        s81 s81Var3 = new s81("POLYMORPHIC", 2);
        c = s81Var3;
        d = new s81[]{s81Var, s81Var2, s81Var3};
    }

    public static s81 valueOf(String str) {
        return (s81) Enum.valueOf(s81.class, str);
    }

    public static s81[] values() {
        return (s81[]) d.clone();
    }
}
