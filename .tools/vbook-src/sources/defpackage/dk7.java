package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dk7 {
    public static final dk7 a;
    public static final dk7 b;
    public static final dk7 c;
    public static final /* synthetic */ dk7[] d;

    static {
        dk7 dk7Var = new dk7("None", 0);
        a = dk7Var;
        dk7 dk7Var2 = new dk7("Next", 1);
        b = dk7Var2;
        dk7 dk7Var3 = new dk7("Prev", 2);
        c = dk7Var3;
        d = new dk7[]{dk7Var, dk7Var2, dk7Var3};
    }

    public static dk7 valueOf(String str) {
        return (dk7) Enum.valueOf(dk7.class, str);
    }

    public static dk7[] values() {
        return (dk7[]) d.clone();
    }
}
