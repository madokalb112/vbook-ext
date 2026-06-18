package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tx1 {
    public static final tx1 a;
    public static final tx1 b;
    public static final tx1 c;
    public static final tx1 d;
    public static final tx1 e;
    public static final /* synthetic */ tx1[] f;

    static {
        tx1 tx1Var = new tx1("CPU_ACQUIRED", 0);
        a = tx1Var;
        tx1 tx1Var2 = new tx1("BLOCKING", 1);
        b = tx1Var2;
        tx1 tx1Var3 = new tx1("PARKING", 2);
        c = tx1Var3;
        tx1 tx1Var4 = new tx1("DORMANT", 3);
        d = tx1Var4;
        tx1 tx1Var5 = new tx1("TERMINATED", 4);
        e = tx1Var5;
        f = new tx1[]{tx1Var, tx1Var2, tx1Var3, tx1Var4, tx1Var5};
    }

    public static tx1 valueOf(String str) {
        return (tx1) Enum.valueOf(tx1.class, str);
    }

    public static tx1[] values() {
        return (tx1[]) f.clone();
    }
}
