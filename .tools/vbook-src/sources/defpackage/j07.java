package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j07 {
    public static final j07 a;
    public static final j07 b;
    public static final j07 c;
    public static final /* synthetic */ j07[] d;

    static {
        j07 j07Var = new j07("Default", 0);
        a = j07Var;
        j07 j07Var2 = new j07("UserInput", 1);
        b = j07Var2;
        j07 j07Var3 = new j07("PreventUserInput", 2);
        c = j07Var3;
        d = new j07[]{j07Var, j07Var2, j07Var3};
    }

    public static j07 valueOf(String str) {
        return (j07) Enum.valueOf(j07.class, str);
    }

    public static j07[] values() {
        return (j07[]) d.clone();
    }
}
