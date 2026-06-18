package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ob9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final String j;

    public ob9(String str, String str2, String str3, String str4, boolean z, int i, int i2, int i3, long j, String str5) {
        tw2.A(str, str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob9)) {
            return false;
        }
        ob9 ob9Var = (ob9) obj;
        return lc5.Q(this.a, ob9Var.a) && this.b.equals(ob9Var.b) && lc5.Q(this.c, ob9Var.c) && lc5.Q(this.d, ob9Var.d) && this.e == ob9Var.e && this.f == ob9Var.f && this.g == ob9Var.g && this.h == ob9Var.h && this.i == ob9Var.i && lc5.Q(this.j, ob9Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + xv5.b(tw2.d(this.h, tw2.d(this.g, tw2.d(this.f, j39.c(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("ShelfBook(id=", this.a, ", name=", this.b, ", cover=");
        j39.y(sbQ, this.c, ", source=", this.d, ", isNsfw=");
        sbQ.append(this.e);
        sbQ.append(", totalChapter=");
        sbQ.append(this.f);
        sbQ.append(", newChapterCount=");
        ky0.u(this.g, this.h, ", readPercent=", ", lastReadTime=", sbQ);
        sbQ.append(this.i);
        sbQ.append(", lastReadChapter=");
        sbQ.append(this.j);
        sbQ.append(")");
        return sbQ.toString();
    }
}
