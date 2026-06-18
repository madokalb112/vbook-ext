package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r83 {
    public static final rt8 e = qu1.k0(new kx1(14, (byte) 0), new gq2(19));
    public final cn7 a;
    public final cn7 b;
    public final cn7 c;
    public final cn7 d = dk9.x(Boolean.FALSE);

    public r83(String str, String str2, boolean z) {
        this.a = dk9.x(Boolean.valueOf(z));
        this.b = dk9.x(str);
        this.c = dk9.x(str2);
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.b.setValue(str);
        this.c.setValue(str2);
        this.d.setValue(Boolean.valueOf(str.length() == 0));
        this.a.setValue(Boolean.TRUE);
    }
}
