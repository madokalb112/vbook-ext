package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xu5 {
    public static final xu5 a;
    public static final xu5 b;
    public static final xu5 c;
    public static final /* synthetic */ xu5[] d;

    static {
        xu5 xu5Var = new xu5("SYNCHRONIZED", 0);
        a = xu5Var;
        xu5 xu5Var2 = new xu5("PUBLICATION", 1);
        b = xu5Var2;
        xu5 xu5Var3 = new xu5("NONE", 2);
        c = xu5Var3;
        d = new xu5[]{xu5Var, xu5Var2, xu5Var3};
    }

    public static xu5 valueOf(String str) {
        return (xu5) Enum.valueOf(xu5.class, str);
    }

    public static xu5[] values() {
        return (xu5[]) d.clone();
    }
}
