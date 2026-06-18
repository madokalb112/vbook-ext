package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ti5 {
    public static final ti5 a;
    public static final /* synthetic */ ti5[] b;

    static {
        ti5 ti5Var = new ti5("INVARIANT", 0);
        a = ti5Var;
        b = new ti5[]{ti5Var, new ti5("IN", 1), new ti5("OUT", 2)};
    }

    public static ti5 valueOf(String str) {
        return (ti5) Enum.valueOf(ti5.class, str);
    }

    public static ti5[] values() {
        return (ti5[]) b.clone();
    }
}
