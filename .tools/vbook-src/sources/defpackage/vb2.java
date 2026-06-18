package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vb2 {
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public final boolean e;

    public vb2(int i, long j, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = j;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb2)) {
            return false;
        }
        vb2 vb2Var = (vb2) obj;
        return lc5.Q(this.a, vb2Var.a) && this.b == vb2Var.b && lc5.Q(this.c, vb2Var.c) && this.d == vb2Var.d && this.e == vb2Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xv5.b(j39.a(tw2.d(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("DbNotification(id=", this.a, ", type=", ", content=", this.b);
        sbN.append(this.c);
        sbN.append(", createAt=");
        sbN.append(this.d);
        sbN.append(", read=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
