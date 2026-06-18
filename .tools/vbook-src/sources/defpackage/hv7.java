package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hv7 {
    public static final hv7 a;
    public static final hv7 b;
    public static final hv7 c;
    public static final hv7 d;
    public static final hv7 e;
    public static final hv7 f;
    public static final hv7 s;
    public static final /* synthetic */ hv7[] t;

    static {
        hv7 hv7Var = new hv7("LOADING", 0);
        a = hv7Var;
        hv7 hv7Var2 = new hv7("READY", 1);
        b = hv7Var2;
        hv7 hv7Var3 = new hv7("PAUSED", 2);
        c = hv7Var3;
        hv7 hv7Var4 = new hv7("PLAYING", 3);
        d = hv7Var4;
        hv7 hv7Var5 = new hv7("PAUSED_BUFFERING", 4);
        e = hv7Var5;
        hv7 hv7Var6 = new hv7("FINISHED", 5);
        f = hv7Var6;
        hv7 hv7Var7 = new hv7("ERROR", 6);
        s = hv7Var7;
        t = new hv7[]{hv7Var, hv7Var2, hv7Var3, hv7Var4, hv7Var5, hv7Var6, hv7Var7};
    }

    public static hv7 valueOf(String str) {
        return (hv7) Enum.valueOf(hv7.class, str);
    }

    public static hv7[] values() {
        return (hv7[]) t.clone();
    }
}
