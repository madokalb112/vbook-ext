package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b2b {
    public static final ix7 a;
    public static final b2b b;
    public static final b2b c;
    public static final /* synthetic */ b2b[] d;

    static {
        b2b b2bVar = new b2b("Native", 0);
        b = b2bVar;
        b2b b2bVar2 = new b2b("WebView", 1);
        c = b2bVar2;
        d = new b2b[]{b2bVar, b2bVar2};
        a = new ix7(5);
    }

    public static b2b valueOf(String str) {
        return (b2b) Enum.valueOf(b2b.class, str);
    }

    public static b2b[] values() {
        return (b2b[]) d.clone();
    }
}
