package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class qw1 {
    public static final d6a a = new d6a(new dh1(9));

    public static int a(int i, boolean z) {
        int i2 = ((i - 1) % 12) + 1;
        if (i2 != 1) {
            return i2 != 2 ? (i2 == 3 || i2 == 5 || i2 == 10 || i2 == 12 || i2 == 7 || i2 == 8) ? 31 : 30 : z ? 29 : 28;
        }
        return 31;
    }

    public static boolean b(int i) {
        if (i % 4 == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }
}
