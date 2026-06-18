package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o9a {
    public static final o9a a;
    public static final o9a b;
    public static final o9a c;
    public static final o9a d;
    public static final /* synthetic */ o9a[] e;

    static {
        o9a o9aVar = new o9a("Left", 0);
        a = o9aVar;
        o9a o9aVar2 = new o9a("Right", 1);
        b = o9aVar2;
        o9a o9aVar3 = new o9a("Center", 2);
        c = o9aVar3;
        o9a o9aVar4 = new o9a("None", 3);
        d = o9aVar4;
        e = new o9a[]{o9aVar, o9aVar2, o9aVar3, o9aVar4};
    }

    public static o9a valueOf(String str) {
        return (o9a) Enum.valueOf(o9a.class, str);
    }

    public static o9a[] values() {
        return (o9a[]) e.clone();
    }
}
