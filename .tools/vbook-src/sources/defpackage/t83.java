package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t83 {
    public static final rt8 g = qu1.k0(new kx1(16, (byte) 0), new gq2(21));
    public final cn7 a;
    public final cn7 b;
    public final cn7 c;
    public final cn7 d;
    public final cn7 e;
    public final cn7 f = dk9.x(Boolean.FALSE);

    public t83(String str, String str2, String str3, String str4, boolean z) {
        this.a = dk9.x(Boolean.valueOf(z));
        this.b = dk9.x(str);
        this.c = dk9.x(str2);
        this.d = dk9.x(str3);
        this.e = dk9.x(str4);
    }

    public final void a(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }

    public final void b(String str, String str2, String str3, String str4) {
        tw2.A(str, str2, str3, str4);
        this.b.setValue(str);
        this.c.setValue(str2);
        this.d.setValue(str3);
        this.e.setValue(str4);
        this.f.setValue(Boolean.valueOf(str2.length() == 0));
        a(true);
    }
}
