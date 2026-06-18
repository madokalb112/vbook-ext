package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k07 {
    public static final k07 a;
    public static final /* synthetic */ k07[] b;

    static {
        k07 k07Var = new k07("Default", 0);
        a = k07Var;
        b = new k07[]{k07Var, new k07("UserInput", 1), new k07("PreventUserInput", 2)};
    }

    public static k07 valueOf(String str) {
        return (k07) Enum.valueOf(k07.class, str);
    }

    public static k07[] values() {
        return (k07[]) b.clone();
    }
}
