package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kn2 {
    public static final rt8 e = qu1.k0(new kx1(8, (byte) 0), new oc2(21));
    public final cn7 a;
    public final cn7 b;
    public final cn7 c;
    public final cn7 d = dk9.x(Boolean.FALSE);

    public kn2(String str, boolean z, boolean z2) {
        this.a = dk9.x(Boolean.valueOf(z));
        this.b = dk9.x(str);
        this.c = dk9.x(Boolean.valueOf(z2));
    }

    public static void a(kn2 kn2Var, String str) {
        kn2Var.getClass();
        kn2Var.b.setValue(str);
        kn2Var.c.setValue(false);
        kn2Var.d.setValue(false);
        kn2Var.a.setValue(Boolean.TRUE);
    }
}
