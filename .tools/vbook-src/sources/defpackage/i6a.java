package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i6a {
    public static final i6a a;
    public static final i6a b;
    public static final /* synthetic */ i6a[] c;

    static {
        i6a i6aVar = new i6a("Default", 0);
        a = i6aVar;
        i6a i6aVar2 = new i6a("Immersive", 1);
        b = i6aVar2;
        c = new i6a[]{i6aVar, i6aVar2};
    }

    public static i6a valueOf(String str) {
        return (i6a) Enum.valueOf(i6a.class, str);
    }

    public static i6a[] values() {
        return (i6a[]) c.clone();
    }
}
