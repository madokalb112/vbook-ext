package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wp9 {
    public final long a;
    public final zab b;
    public final String c;
    public final long d;

    public wp9(zab zabVar, String str, long j) {
        zabVar.getClass();
        str.getClass();
        this.a = r95.a.k().c() + j;
        this.b = zabVar;
        this.c = str;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp9)) {
            return false;
        }
        wp9 wp9Var = (wp9) obj;
        return this.b == wp9Var.b && lc5.Q(this.c, wp9Var.c) && this.d == wp9Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + j39.a(this.b.hashCode() * 31, 923521, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Normal(type=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=null, actionTitle=null, action=null, duration=");
        return xv5.n(this.d, ")", sb);
    }
}
