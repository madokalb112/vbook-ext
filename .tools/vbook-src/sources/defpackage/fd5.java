package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fd5 {
    public static final fd5 a;
    public static final fd5 b;
    public static final /* synthetic */ fd5[] c;

    static {
        fd5 fd5Var = new fd5("Pressed", 0);
        a = fd5Var;
        fd5 fd5Var2 = new fd5("Idle", 1);
        b = fd5Var2;
        c = new fd5[]{fd5Var, fd5Var2};
    }

    public static fd5 valueOf(String str) {
        return (fd5) Enum.valueOf(fd5.class, str);
    }

    public static fd5[] values() {
        return (fd5[]) c.clone();
    }
}
