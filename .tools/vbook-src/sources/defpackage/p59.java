package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p59 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final u32 e;
    public final String f;
    public final String g;

    public p59(String str, String str2, int i, long j, u32 u32Var, String str3, String str4) {
        j39.v(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = u32Var;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p59)) {
            return false;
        }
        p59 p59Var = (p59) obj;
        return lc5.Q(this.a, p59Var.a) && lc5.Q(this.b, p59Var.b) && this.c == p59Var.c && this.d == p59Var.d && this.e.equals(p59Var.e) && this.f.equals(p59Var.f) && lc5.Q(this.g, p59Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + j39.a((this.e.hashCode() + xv5.b(tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return xv5.s(sb, this.g, ')');
    }
}
