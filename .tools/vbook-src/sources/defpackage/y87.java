package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y87 {
    public static final y87 a;
    public static final /* synthetic */ y87[] b;

    static {
        y87 y87Var = new y87("Local", 0);
        a = y87Var;
        b = new y87[]{y87Var, new y87("Server", 1)};
    }

    public static y87 valueOf(String str) {
        return (y87) Enum.valueOf(y87.class, str);
    }

    public static y87[] values() {
        return (y87[]) b.clone();
    }
}
