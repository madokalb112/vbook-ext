package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k6a {
    public static final k6a a;
    public static final k6a b;
    public static final k6a c;
    public static final /* synthetic */ k6a[] d;

    static {
        k6a k6aVar = new k6a("All", 0);
        a = k6aVar;
        k6a k6aVar2 = new k6a("StatusBars", 1);
        b = k6aVar2;
        k6a k6aVar3 = new k6a("NavigationBars", 2);
        c = k6aVar3;
        d = new k6a[]{k6aVar, k6aVar2, k6aVar3};
    }

    public static k6a valueOf(String str) {
        return (k6a) Enum.valueOf(k6a.class, str);
    }

    public static k6a[] values() {
        return (k6a[]) d.clone();
    }
}
