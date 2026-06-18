package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tk0 {
    public static final tk0 a;
    public static final /* synthetic */ tk0[] b;
    public static final /* synthetic */ le3 c;

    static {
        tk0 tk0Var = new tk0("Total", 0);
        a = tk0Var;
        tk0[] tk0VarArr = {tk0Var, new tk0("Read", 1), new tk0("Listen", 2)};
        b = tk0VarArr;
        c = new le3(tk0VarArr);
    }

    public static tk0 valueOf(String str) {
        return (tk0) Enum.valueOf(tk0.class, str);
    }

    public static tk0[] values() {
        return (tk0[]) b.clone();
    }
}
