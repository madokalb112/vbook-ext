package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v60 {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public gz1 g;
    public xz1 h;
    public wz1 i;
    public hz1 j;
    public List k;
    public int l;
    public byte m;

    public final w60 a() {
        String str;
        String str2;
        gz1 gz1Var;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (gz1Var = this.g) != null) {
            return new w60(str, str2, this.c, this.d, this.e, this.f, gz1Var, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        gp.j(ky0.t("Missing required properties:", sb));
        return null;
    }
}
