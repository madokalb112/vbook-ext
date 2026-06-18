package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d58 {
    public static final d58 a;
    public static final /* synthetic */ d58[] b;

    static {
        d58 d58Var = new d58("DEFAULT", 0);
        a = d58Var;
        b = new d58[]{d58Var, new d58("SIGNED", 1), new d58("FIXED", 2)};
    }

    public static d58 valueOf(String str) {
        return (d58) Enum.valueOf(d58.class, str);
    }

    public static d58[] values() {
        return (d58[]) b.clone();
    }
}
