package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a9a {
    public static final a9a a;
    public static final a9a b;
    public static final a9a c;
    public static final /* synthetic */ a9a[] d;

    static {
        a9a a9aVar = new a9a("Tabs", 0);
        a = a9aVar;
        a9a a9aVar2 = new a9a("Divider", 1);
        b = a9aVar2;
        a9a a9aVar3 = new a9a("Indicator", 2);
        c = a9aVar3;
        d = new a9a[]{a9aVar, a9aVar2, a9aVar3};
    }

    public static a9a valueOf(String str) {
        return (a9a) Enum.valueOf(a9a.class, str);
    }

    public static a9a[] values() {
        return (a9a[]) d.clone();
    }
}
