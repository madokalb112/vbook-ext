package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u83 {
    public static final rt8 h = qu1.k0(new kx1(17, (byte) 0), new gq2(22));
    public final cn7 a;
    public final cn7 b;
    public final cn7 c;
    public final cn7 d;
    public final cn7 e;
    public final cn7 f;
    public final cn7 g = dk9.x(Boolean.FALSE);

    public u83(boolean z, String str, String str2, boolean z2, boolean z3, boolean z4) {
        this.a = dk9.x(Boolean.valueOf(z));
        this.b = dk9.x(str);
        this.c = dk9.x(str2);
        this.d = dk9.x(Boolean.valueOf(z2));
        this.e = dk9.x(Boolean.valueOf(z4));
        this.f = dk9.x(Boolean.valueOf(z3));
    }

    public final String a() {
        return (String) this.c.getValue();
    }

    public final void b() {
        this.a.setValue(Boolean.FALSE);
        this.b.setValue("");
        c("");
        this.e.setValue(Boolean.TRUE);
    }

    public final void c(String str) {
        this.c.setValue(str);
    }

    public final void d(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.b.setValue(str);
        c(str2);
        this.e.setValue(Boolean.valueOf(z));
        this.d.setValue(Boolean.valueOf(z2));
        this.g.setValue(Boolean.valueOf(str.length() == 0));
        this.a.setValue(Boolean.TRUE);
    }
}
