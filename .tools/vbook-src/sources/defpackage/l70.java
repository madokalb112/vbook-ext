package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l70 {
    public String a;
    public int b;
    public int c;
    public boolean d;
    public byte e;

    public final m70 a() {
        String str;
        if (this.e == 7 && (str = this.a) != null) {
            return new m70(str, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        gp.j(ky0.t("Missing required properties:", sb));
        return null;
    }
}
