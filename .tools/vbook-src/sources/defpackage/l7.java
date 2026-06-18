package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l7 {
    public static final rt8 i = qu1.k0(new k7(0), new e4(2));
    public final cn7 a;
    public final cn7 b;
    public final cn7 c;
    public final cn7 d;
    public final cn7 e;
    public final cn7 f;
    public final cn7 g;
    public final cn7 h;

    public l7(boolean z, String str, int i2, int i3, int i4, String str2, String str3, String str4) {
        this.a = dk9.x(Boolean.valueOf(z));
        this.b = dk9.x(str);
        this.c = dk9.x(Integer.valueOf(i2));
        this.d = dk9.x(Integer.valueOf(i3));
        this.e = dk9.x(Integer.valueOf(i4));
        this.f = dk9.x(str2);
        this.g = dk9.x(str3);
        this.h = dk9.x(str4);
    }

    public final String a() {
        return (String) this.h.getValue();
    }

    public final void b() {
        this.a.setValue(Boolean.FALSE);
        this.b.setValue("");
        this.c.setValue(0);
        this.d.setValue(0);
        this.e.setValue(0);
        this.f.setValue("");
        this.g.setValue("");
        this.h.setValue("");
    }

    public final void c(String str, int i2, int i3, int i4, String str2, String str3, String str4) {
        tw2.A(str, str2, str3, str4);
        this.b.setValue(str);
        this.f.setValue(str2);
        this.c.setValue(Integer.valueOf(i2));
        this.d.setValue(Integer.valueOf(i3));
        this.e.setValue(Integer.valueOf(i4));
        this.g.setValue(str3);
        this.h.setValue(str4);
        this.a.setValue(Boolean.TRUE);
    }
}
