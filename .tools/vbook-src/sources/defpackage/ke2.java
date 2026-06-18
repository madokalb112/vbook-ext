package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ke2 {
    public static final ke2 a;
    public static final ke2 b;
    public static final /* synthetic */ ke2[] c;

    static {
        ke2 ke2Var = new ke2("View", 0);
        a = ke2Var;
        ke2 ke2Var2 = new ke2("Send", 1);
        b = ke2Var2;
        c = new ke2[]{ke2Var, ke2Var2};
    }

    public static ke2 valueOf(String str) {
        return (ke2) Enum.valueOf(ke2.class, str);
    }

    public static ke2[] values() {
        return (ke2[]) c.clone();
    }
}
