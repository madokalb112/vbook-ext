package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jj7 {
    public static final jj7 a;
    public static final jj7 b;
    public static final /* synthetic */ jj7[] c;

    /* JADX INFO: Fake field, exist only in values array */
    jj7 EF0;

    static {
        jj7 jj7Var = new jj7("NONE", 0);
        jj7 jj7Var2 = new jj7("ZERO", 1);
        a = jj7Var2;
        jj7 jj7Var3 = new jj7("SPACE", 2);
        b = jj7Var3;
        c = new jj7[]{jj7Var, jj7Var2, jj7Var3};
    }

    public static jj7 valueOf(String str) {
        return (jj7) Enum.valueOf(jj7.class, str);
    }

    public static jj7[] values() {
        return (jj7[]) c.clone();
    }
}
