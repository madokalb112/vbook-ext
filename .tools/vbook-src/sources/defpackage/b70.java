package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b70 {
    public long a;
    public String b;
    public pz1 c;
    public qz1 d;
    public rz1 e;
    public uz1 f;
    public byte g;

    public final c70 a() {
        String str;
        pz1 pz1Var;
        qz1 qz1Var;
        if (this.g == 1 && (str = this.b) != null && (pz1Var = this.c) != null && (qz1Var = this.d) != null) {
            return new c70(this.a, str, pz1Var, qz1Var, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        gp.j(ky0.t("Missing required properties:", sb));
        return null;
    }
}
