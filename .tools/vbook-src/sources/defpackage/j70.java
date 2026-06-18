package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j70 {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final k70 a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new k70(this.e, this.a, this.d, str, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        gp.j(ky0.t("Missing required properties:", sb));
        return null;
    }
}
