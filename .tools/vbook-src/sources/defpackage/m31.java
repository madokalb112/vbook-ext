package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m31 {
    public static final m31 a;
    public static final m31 b;
    public static final m31 c;
    public static final /* synthetic */ m31[] d;

    static {
        m31 m31Var = new m31("DETECTING", 0);
        a = m31Var;
        m31 m31Var2 = new m31("FOUND_IT", 1);
        b = m31Var2;
        m31 m31Var3 = new m31("NOT_ME", 2);
        c = m31Var3;
        d = new m31[]{m31Var, m31Var2, m31Var3};
    }

    public static m31 valueOf(String str) {
        return (m31) Enum.valueOf(m31.class, str);
    }

    public static m31[] values() {
        return (m31[]) d.clone();
    }
}
