package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rh7 {
    public static final rh7 a;
    public static final rh7 b;
    public static final /* synthetic */ rh7[] c;

    static {
        rh7 rh7Var = new rh7("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        a = rh7Var;
        rh7 rh7Var2 = new rh7("DROP_WORK_REQUEST", 1);
        b = rh7Var2;
        c = new rh7[]{rh7Var, rh7Var2};
    }

    public static rh7 valueOf(String str) {
        return (rh7) Enum.valueOf(rh7.class, str);
    }

    public static rh7[] values() {
        return (rh7[]) c.clone();
    }
}
