package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class id1 {
    public static final g83 a;
    public static final id1 b;
    public static final id1 c;
    public static final id1 d;
    public static final /* synthetic */ id1[] e;

    static {
        id1 id1Var = new id1("SPEC_2021", 0);
        c = id1Var;
        id1 id1Var2 = new id1("SPEC_2025", 1);
        d = id1Var2;
        e = new id1[]{id1Var, id1Var2};
        a = new g83(18);
        b = id1Var;
    }

    public static id1 valueOf(String str) {
        return (id1) Enum.valueOf(id1.class, str);
    }

    public static id1[] values() {
        return (id1[]) e.clone();
    }
}
