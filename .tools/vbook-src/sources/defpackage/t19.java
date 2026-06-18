package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t19 {
    public static final t19 a;
    public static final t19 b;
    public static final t19 c;
    public static final /* synthetic */ t19[] d;

    static {
        t19 t19Var = new t19("Idle", 0);
        a = t19Var;
        t19 t19Var2 = new t19("Dragging", 1);
        b = t19Var2;
        t19 t19Var3 = new t19("End", 2);
        c = t19Var3;
        d = new t19[]{t19Var, t19Var2, t19Var3};
    }

    public static t19 valueOf(String str) {
        return (t19) Enum.valueOf(t19.class, str);
    }

    public static t19[] values() {
        return (t19[]) d.clone();
    }
}
