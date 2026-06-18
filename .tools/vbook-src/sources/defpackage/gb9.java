package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gb9 {
    public static final gb9 a;
    public static final gb9 b;
    public static final gb9 c;
    public static final /* synthetic */ gb9[] d;

    static {
        gb9 gb9Var = new gb9("START", 0);
        a = gb9Var;
        gb9 gb9Var2 = new gb9("STOP", 1);
        b = gb9Var2;
        gb9 gb9Var3 = new gb9("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = gb9Var3;
        d = new gb9[]{gb9Var, gb9Var2, gb9Var3};
    }

    public static gb9 valueOf(String str) {
        return (gb9) Enum.valueOf(gb9.class, str);
    }

    public static gb9[] values() {
        return (gb9[]) d.clone();
    }
}
