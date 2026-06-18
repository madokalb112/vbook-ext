package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39(with = t72.class)
public abstract class s72 {
    public static final j72 Companion = new j72();
    public static final n72 a;
    public static final p72 b;
    public static final p72 c;

    static {
        new r72(1L).b(1000).b(1000).b(1000).b(60).b(60);
        a = new n72(1);
        new n72(Math.multiplyExact(1, 7));
        b = new p72(1);
        new p72(Math.multiplyExact(1, 3));
        int iMultiplyExact = Math.multiplyExact(1, 12);
        c = new p72(iMultiplyExact);
        new p72(Math.multiplyExact(iMultiplyExact, 100));
    }

    public static String a(int i, String str) {
        if (i == 1) {
            return str;
        }
        return i + '-' + str;
    }
}
