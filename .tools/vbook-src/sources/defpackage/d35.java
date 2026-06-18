package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d35 {
    public final String a;
    public final String b;
    public final int c;
    public final float d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final long j;

    public d35(String str, String str2, int i, float f, String str3, int i2, boolean z, boolean z2, boolean z3, long j) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = f;
        this.e = str3;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d35)) {
            return false;
        }
        d35 d35Var = (d35) obj;
        return lc5.Q(this.a, d35Var.a) && this.b.equals(d35Var.b) && this.c == d35Var.c && Float.compare(this.d, d35Var.d) == 0 && lc5.Q(this.e, d35Var.e) && this.f == d35Var.f && this.g == d35Var.g && this.h == d35Var.h && this.i == d35Var.i && this.j == d35Var.j;
    }

    public final int hashCode() {
        int iC = tw2.c(this.d, tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31), 31);
        String str = this.e;
        return Long.hashCode(this.j) + j39.c(j39.c(j39.c(tw2.d(this.f, tw2.d(0, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("ImageTocLink(id=", this.a, ", title=", this.b, ", chapterIndex=");
        sbQ.append(this.c);
        sbQ.append(", chapterPosition=");
        sbQ.append(this.d);
        sbQ.append(", parentId=");
        dx1.t(this.f, this.e, ", level=0, count=", ", downloaded=", sbQ);
        ky0.D(sbQ, this.g, ", locked=", this.h, ", pay=");
        sbQ.append(this.i);
        sbQ.append(", lastRead=");
        sbQ.append(this.j);
        sbQ.append(")");
        return sbQ.toString();
    }
}
