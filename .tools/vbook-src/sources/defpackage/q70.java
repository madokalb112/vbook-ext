package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q70 {
    public s70 a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final r70 a() {
        s70 s70Var;
        String str;
        String str2;
        if (this.e == 1 && (s70Var = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new r70(s70Var, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((this.e & 1) == 0) {
            sb.append(" templateVersion");
        }
        gp.j(ky0.t("Missing required properties:", sb));
        return null;
    }
}
