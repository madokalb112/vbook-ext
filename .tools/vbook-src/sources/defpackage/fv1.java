package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fv1 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final gf6 f;
    public final int g;
    public final int h;
    public final boolean i;
    public final sgb j;
    public final long k;
    public final long l;

    public fv1(long j, String str, String str2, String str3, String str4, gf6 gf6Var, int i, int i2, boolean z, sgb sgbVar, long j2, long j3) {
        str.getClass();
        str4.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = gf6Var;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.j = sgbVar;
        this.k = j2;
        this.l = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv1)) {
            return false;
        }
        fv1 fv1Var = (fv1) obj;
        return this.a == fv1Var.a && lc5.Q(this.b, fv1Var.b) && lc5.Q(this.c, fv1Var.c) && lc5.Q(this.d, fv1Var.d) && lc5.Q(this.e, fv1Var.e) && lc5.Q(this.f, fv1Var.f) && this.g == fv1Var.g && this.h == fv1Var.h && this.i == fv1Var.i && lc5.Q(this.j, fv1Var.j) && this.k == fv1Var.k && this.l == fv1Var.l;
    }

    public final int hashCode() {
        int iA = j39.a(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iA2 = j39.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        gf6 gf6Var = this.f;
        int iC = j39.c(tw2.d(this.h, tw2.d(this.g, (iA2 + (gf6Var == null ? 0 : gf6Var.hashCode())) * 31, 31), 31), 31, this.i);
        sgb sgbVar = this.j;
        return Long.hashCode(this.l) + xv5.b((iC + (sgbVar != null ? sgbVar.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Conversation(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        j39.y(sb, ", name=", this.c, ", image=", this.d);
        sb.append(", visibility=");
        sb.append(this.e);
        sb.append(", latestMessage=");
        sb.append(this.f);
        tw2.v(this.g, this.h, ", unreadCount=", ", memberCount=", sb);
        sb.append(", isJoined=");
        sb.append(this.i);
        sb.append(", createdBy=");
        sb.append(this.j);
        dx1.z(sb, ", updatedAt=", this.k, ", createdAt=");
        return xv5.n(this.l, ")", sb);
    }
}
