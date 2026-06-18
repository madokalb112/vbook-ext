package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v9 {
    public static final v9 a;
    public static final /* synthetic */ v9[] b;

    /* JADX INFO: Fake field, exist only in values array */
    v9 EF0;

    static {
        v9 v9Var = new v9("AM", 0);
        v9 v9Var2 = new v9("PM", 1);
        a = v9Var2;
        b = new v9[]{v9Var, v9Var2};
    }

    public static v9 valueOf(String str) {
        return (v9) Enum.valueOf(v9.class, str);
    }

    public static v9[] values() {
        return (v9[]) b.clone();
    }
}
