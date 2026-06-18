package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ck8 {
    public final int a;
    public final String b;
    public final sgb c;
    public final int d;
    public final int e;
    public final boolean f;
    public final int g;
    public final long h;
    public final long i;

    public ck8(int i, String str, sgb sgbVar, int i2, int i3, boolean z, int i4, long j, long j2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = sgbVar;
        this.d = i2;
        this.e = i3;
        this.f = z;
        this.g = i4;
        this.h = j;
        this.i = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck8)) {
            return false;
        }
        ck8 ck8Var = (ck8) obj;
        return this.a == ck8Var.a && lc5.Q(this.b, ck8Var.b) && this.c.equals(ck8Var.c) && this.d == ck8Var.d && this.e == ck8Var.e && this.f == ck8Var.f && this.g == ck8Var.g && this.h == ck8Var.h && this.i == ck8Var.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + xv5.b(tw2.d(this.g, j39.c(tw2.d(this.e, tw2.d(this.d, (this.c.hashCode() + j39.a(Integer.hashCode(this.a) * 31, 31, this.b)) * 31, 31), 31), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbP = j39.p("ReportTopic(id=", ", title=", this.b, ", user=", this.a);
        sbP.append(this.c);
        sbP.append(", status=");
        sbP.append(this.d);
        sbP.append(", type=");
        j39.x(sbP, this.e, ", pined=", this.f, ", comments=");
        sbP.append(this.g);
        sbP.append(", updatedAt=");
        sbP.append(this.h);
        return dx1.l(sbP, ", createdAt=", this.i, ")");
    }
}
