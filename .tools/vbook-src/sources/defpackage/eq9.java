package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class eq9 {
    public final String a;
    public final yab b;
    public final long c;

    public eq9(String str, yab yabVar, long j) {
        str.getClass();
        yabVar.getClass();
        this.a = str;
        this.b = yabVar;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq9)) {
            return false;
        }
        eq9 eq9Var = (eq9) obj;
        return lc5.Q(this.a, eq9Var.a) && this.b == eq9Var.b && this.c == eq9Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StackedToastData(message=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", endDuration=");
        return xv5.n(this.c, ")", sb);
    }
}
