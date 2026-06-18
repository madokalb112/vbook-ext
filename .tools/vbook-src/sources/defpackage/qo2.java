package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qo2 {
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final long e;
    public final boolean f;
    public final boolean g;

    public qo2(int i, String str, int i2, String str2, long j, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = j;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo2)) {
            return false;
        }
        qo2 qo2Var = (qo2) obj;
        return this.a == qo2Var.a && this.b.equals(qo2Var.b) && this.c == qo2Var.c && this.d.equals(qo2Var.d) && this.e == qo2Var.e && this.f == qo2Var.f && this.g == qo2Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + j39.c(xv5.b(j39.a(tw2.d(this.c, j39.a(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbP = j39.p("DetailChapter(index=", ", name=", this.b, ", type=", this.a);
        ky0.w(this.c, ", description=", this.d, ", lastRead=", sbP);
        sbP.append(this.e);
        sbP.append(", isLock=");
        sbP.append(this.f);
        sbP.append(", isPay=");
        sbP.append(this.g);
        sbP.append(")");
        return sbP.toString();
    }
}
