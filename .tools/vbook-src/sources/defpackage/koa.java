package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class koa {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final long j;

    public koa(String str, String str2, int i, String str3, int i2, boolean z, boolean z2, boolean z3, int i3, long j) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = i3;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koa)) {
            return false;
        }
        koa koaVar = (koa) obj;
        return lc5.Q(this.a, koaVar.a) && this.b.equals(koaVar.b) && this.c == koaVar.c && Float.compare(0.0f, 0.0f) == 0 && lc5.Q(this.d, koaVar.d) && this.e == koaVar.e && this.f == koaVar.f && this.g == koaVar.g && this.h == koaVar.h && this.i == koaVar.i && this.j == koaVar.j;
    }

    public final int hashCode() {
        int iC = tw2.c(0.0f, tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31), 31);
        String str = this.d;
        return Long.hashCode(this.j) + tw2.d(this.i, j39.c(j39.c(j39.c(tw2.d(this.e, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f), 31, this.g), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("TextTocLink(id=", this.a, ", title=", this.b, ", chapterIndex=");
        ky0.w(this.c, ", chapterPosition=0.0, parentId=", this.d, ", level=", sbQ);
        j39.x(sbQ, this.e, ", downloaded=", this.f, ", locked=");
        ky0.D(sbQ, this.g, ", pay=", this.h, ", count=");
        sbQ.append(this.i);
        sbQ.append(", lastRead=");
        sbQ.append(this.j);
        sbQ.append(")");
        return sbQ.toString();
    }
}
