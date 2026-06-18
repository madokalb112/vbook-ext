package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nw8 {
    public static final nw8 a;
    public static final /* synthetic */ nw8[] b;

    static {
        nw8 nw8Var = new nw8("SWAP", 0);
        a = nw8Var;
        b = new nw8[]{nw8Var, new nw8("INSERT", 1)};
    }

    public static nw8 valueOf(String str) {
        return (nw8) Enum.valueOf(nw8.class, str);
    }

    public static nw8[] values() {
        return (nw8[]) b.clone();
    }
}
