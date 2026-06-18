package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ef6 extends gf6 {
    public final long a;
    public final bp b;
    public final sgb c;
    public final gf6 d;
    public final long e;
    public final long f;

    public ef6(long j, bp bpVar, sgb sgbVar, gf6 gf6Var, long j2, long j3) {
        this.a = j;
        this.b = bpVar;
        this.c = sgbVar;
        this.d = gf6Var;
        this.e = j2;
        this.f = j3;
    }

    @Override // defpackage.gf6
    public final long a() {
        return this.f;
    }

    @Override // defpackage.gf6
    public final long b() {
        return this.a;
    }

    @Override // defpackage.gf6
    public final sgb c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef6)) {
            return false;
        }
        ef6 ef6Var = (ef6) obj;
        return this.a == ef6Var.a && this.b.equals(ef6Var.b) && this.c.equals(ef6Var.c) && lc5.Q(this.d, ef6Var.d) && this.e == ef6Var.e && this.f == ef6Var.f;
    }

    @Override // defpackage.gf6
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31;
        gf6 gf6Var = this.d;
        return Long.hashCode(this.f) + xv5.b((iHashCode + (gf6Var == null ? 0 : gf6Var.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(id=");
        sb.append(this.a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", user=");
        sb.append(this.c);
        sb.append(", quote=");
        sb.append(this.d);
        dx1.z(sb, ", updatedAt=", this.e, ", createdAt=");
        return xv5.n(this.f, ")", sb);
    }
}
