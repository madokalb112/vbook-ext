package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q83 {
    public static final rt8 e = qu1.k0(new kx1(13, (byte) 0), new gq2(18));
    public final cn7 a;
    public final cn7 b;
    public final cn7 c;
    public final cn7 d = dk9.x(Boolean.FALSE);

    public q83(String str, String str2, boolean z) {
        this.a = dk9.x(Boolean.valueOf(z));
        this.b = dk9.x(str);
        this.c = dk9.x(str2);
    }

    public static void a(q83 q83Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        q83Var.getClass();
        str.getClass();
        str2.getClass();
        q83Var.b.setValue(str);
        q83Var.c.setValue(str2);
        q83Var.d.setValue(Boolean.valueOf(str.length() == 0));
        q83Var.a.setValue(Boolean.TRUE);
    }
}
