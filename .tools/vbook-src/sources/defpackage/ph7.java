package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ph7 {
    public static final wfc a;
    public static final ph7 b;
    public static final ph7 c;
    public static final /* synthetic */ ph7[] d;

    /* JADX INFO: Fake field, exist only in values array */
    ph7 EF0;

    static {
        ph7 ph7Var = new ph7("UNKNOWN", 0);
        ph7 ph7Var2 = new ph7("WASM", 1);
        ph7 ph7Var3 = new ph7("LINUX", 2);
        b = ph7Var3;
        ph7 ph7Var4 = new ph7("WINDOWS", 3);
        ph7 ph7Var5 = new ph7("ANDROID", 4);
        c = ph7Var5;
        d = new ph7[]{ph7Var, ph7Var2, ph7Var3, ph7Var4, ph7Var5, new ph7("MACOSX", 5), new ph7("IOS", 6), new ph7("TVOS", 7), new ph7("WATCHOS", 8)};
        a = new wfc(29);
    }

    public static ph7 valueOf(String str) {
        return (ph7) Enum.valueOf(ph7.class, str);
    }

    public static ph7[] values() {
        return (ph7[]) d.clone();
    }
}
