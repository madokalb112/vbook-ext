package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cf6 extends gf6 {
    public final long a;
    public final String b;
    public final int c;
    public final int d;
    public final sgb e;
    public final gf6 f;
    public final long g;
    public final long h;

    public cf6(long j, String str, int i, int i2, sgb sgbVar, gf6 gf6Var, long j2, long j3) {
        str.getClass();
        sgbVar.getClass();
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = sgbVar;
        this.f = gf6Var;
        this.g = j2;
        this.h = j3;
    }

    @Override // defpackage.gf6
    public final long a() {
        return this.h;
    }

    @Override // defpackage.gf6
    public final long b() {
        return this.a;
    }

    @Override // defpackage.gf6
    public final sgb c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf6)) {
            return false;
        }
        cf6 cf6Var = (cf6) obj;
        return this.a == cf6Var.a && lc5.Q(this.b, cf6Var.b) && this.c == cf6Var.c && this.d == cf6Var.d && lc5.Q(this.e, cf6Var.e) && lc5.Q(this.f, cf6Var.f) && this.g == cf6Var.g && this.h == cf6Var.h;
    }

    @Override // defpackage.gf6
    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + tw2.d(this.d, tw2.d(this.c, j39.a(Long.hashCode(this.a) * 31, 31, this.b), 31), 31)) * 31;
        gf6 gf6Var = this.f;
        return Long.hashCode(this.h) + xv5.b((iHashCode + (gf6Var == null ? 0 : gf6Var.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Image(id=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        tw2.v(this.c, this.d, ", width=", ", height=", sb);
        sb.append(", user=");
        sb.append(this.e);
        sb.append(", quote=");
        sb.append(this.f);
        dx1.z(sb, ", updatedAt=", this.g, ", createdAt=");
        return xv5.n(this.h, ")", sb);
    }
}
