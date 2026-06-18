package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x77 {
    public final String a;
    public final int b;
    public final g87 c;
    public final boolean d;
    public final long e;

    public x77(String str, int i, g87 g87Var, boolean z, long j) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = g87Var;
        this.d = z;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x77)) {
            return false;
        }
        x77 x77Var = (x77) obj;
        return lc5.Q(this.a, x77Var.a) && this.b == x77Var.b && this.c.equals(x77Var.c) && this.d == x77Var.d && this.e == x77Var.e;
    }

    public final int hashCode() {
        return y87.a.hashCode() + xv5.b(j39.c((this.c.hashCode() + tw2.d(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("Notification(id=", this.a, ", type=", ", content=", this.b);
        sbN.append(this.c);
        sbN.append(", read=");
        sbN.append(this.d);
        sbN.append(", createAt=");
        sbN.append(this.e);
        sbN.append(", source=");
        sbN.append(y87.a);
        sbN.append(")");
        return sbN.toString();
    }
}
