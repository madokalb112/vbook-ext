package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jx7 {
    public static final ix7 a;
    public static final /* synthetic */ jx7[] b;
    public static final /* synthetic */ le3 c;

    static {
        jx7[] jx7VarArr = {new jx7("ZERO", 0), new jx7("ONE", 1), new jx7("TWO", 2), new jx7("FEW", 3), new jx7("MANY", 4), new jx7("OTHER", 5)};
        b = jx7VarArr;
        c = new le3(jx7VarArr);
        a = new ix7(0);
    }

    public static jx7 valueOf(String str) {
        return (jx7) Enum.valueOf(jx7.class, str);
    }

    public static jx7[] values() {
        return (jx7[]) b.clone();
    }
}
