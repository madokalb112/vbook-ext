package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p55 {
    public static final p55 a;
    public static final p55 b;
    public static final p55 c;
    public static final p55 d;
    public static final p55 e;
    public static final /* synthetic */ p55[] f;

    static {
        p55 p55Var = new p55("Preparing", 0);
        a = p55Var;
        p55 p55Var2 = new p55("Unzipping", 1);
        b = p55Var2;
        p55 p55Var3 = new p55("Importing", 2);
        c = p55Var3;
        p55 p55Var4 = new p55("Cleaning", 3);
        d = p55Var4;
        p55 p55Var5 = new p55("Completed", 4);
        e = p55Var5;
        f = new p55[]{p55Var, p55Var2, p55Var3, p55Var4, p55Var5};
    }

    public static p55 valueOf(String str) {
        return (p55) Enum.valueOf(p55.class, str);
    }

    public static p55[] values() {
        return (p55[]) f.clone();
    }
}
