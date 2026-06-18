package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q5b {
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;
    public final String e;

    public q5b(int i, int i2, String str, boolean z, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5b)) {
            return false;
        }
        q5b q5bVar = (q5b) obj;
        return this.a == q5bVar.a && this.b == q5bVar.b && this.c == q5bVar.c && this.d == q5bVar.d && this.e.equals(q5bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.c(j39.c(tw2.d(this.c, tw2.d(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31, true), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Info(supportAutoDetect=");
        sb.append(this.a);
        sb.append(", maxInputLine=");
        sb.append(this.b);
        sb.append(", maxInputLength=");
        j39.x(sb, this.c, ", isNetworkRequired=true, hasApiKey=", this.d, ", supportUrl=");
        return ky0.s(this.e, ")", sb);
    }
}
