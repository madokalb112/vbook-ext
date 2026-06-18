package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d97 {
    public static final d97 a;
    public static final d97 b;
    public static final d97 c;
    public static final d97 d;
    public static final d97 e;
    public static final d97 f;
    public static final /* synthetic */ d97[] s;

    static {
        d97 d97Var = new d97("Idle", 0);
        a = d97Var;
        d97 d97Var2 = new d97("Running", 1);
        b = d97Var2;
        d97 d97Var3 = new d97("Paused", 2);
        c = d97Var3;
        d97 d97Var4 = new d97("Canceled", 3);
        d = d97Var4;
        d97 d97Var5 = new d97("Completed", 4);
        e = d97Var5;
        d97 d97Var6 = new d97("Failed", 5);
        f = d97Var6;
        s = new d97[]{d97Var, d97Var2, d97Var3, d97Var4, d97Var5, d97Var6};
    }

    public static d97 valueOf(String str) {
        return (d97) Enum.valueOf(d97.class, str);
    }

    public static d97[] values() {
        return (d97[]) s.clone();
    }
}
