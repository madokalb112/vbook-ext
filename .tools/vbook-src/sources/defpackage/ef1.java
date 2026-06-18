package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ef1 {
    public static final ef1 a;
    public static final ef1 b;
    public static final ef1 c;
    public static final ef1 d;
    public static final ef1 e;
    public static final ef1 f;
    public static final /* synthetic */ ef1[] s;

    static {
        ef1 ef1Var = new ef1("Idle", 0);
        a = ef1Var;
        ef1 ef1Var2 = new ef1("Running", 1);
        b = ef1Var2;
        ef1 ef1Var3 = new ef1("Paused", 2);
        c = ef1Var3;
        ef1 ef1Var4 = new ef1("Canceled", 3);
        d = ef1Var4;
        ef1 ef1Var5 = new ef1("Completed", 4);
        e = ef1Var5;
        ef1 ef1Var6 = new ef1("Failed", 5);
        f = ef1Var6;
        s = new ef1[]{ef1Var, ef1Var2, ef1Var3, ef1Var4, ef1Var5, ef1Var6};
    }

    public static ef1 valueOf(String str) {
        return (ef1) Enum.valueOf(ef1.class, str);
    }

    public static ef1[] values() {
        return (ef1[]) s.clone();
    }
}
