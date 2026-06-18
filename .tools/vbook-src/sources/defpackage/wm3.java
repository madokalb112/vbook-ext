package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wm3 {
    public static final wm3 a;
    public static final wm3 b;
    public static final wm3 c;
    public static final /* synthetic */ wm3[] d;

    static {
        wm3 wm3Var = new wm3("Install", 0);
        a = wm3Var;
        wm3 wm3Var2 = new wm3("Delete", 1);
        b = wm3Var2;
        wm3 wm3Var3 = new wm3("Update", 2);
        c = wm3Var3;
        d = new wm3[]{wm3Var, wm3Var2, wm3Var3};
    }

    public static wm3 valueOf(String str) {
        return (wm3) Enum.valueOf(wm3.class, str);
    }

    public static wm3[] values() {
        return (wm3[]) d.clone();
    }
}
