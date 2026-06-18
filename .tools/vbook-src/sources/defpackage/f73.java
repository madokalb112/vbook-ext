package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f73 {
    public static final js8 a;
    public static final f73 b;
    public static final f73 c;
    public static final f73 d;
    public static final /* synthetic */ f73[] e;

    static {
        f73 f73Var = new f73("PHONE", 0);
        c = f73Var;
        f73 f73Var2 = new f73("WATCH", 1);
        d = f73Var2;
        e = new f73[]{f73Var, f73Var2};
        a = new js8(22);
        b = f73Var;
    }

    public static f73 valueOf(String str) {
        return (f73) Enum.valueOf(f73.class, str);
    }

    public static f73[] values() {
        return (f73[]) e.clone();
    }
}
