package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i8a {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public i8a(String str, boolean z, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8a)) {
            return false;
        }
        i8a i8aVar = (i8a) obj;
        return this.a.equals(i8aVar.a) && this.b.equals(i8aVar.b) && this.c == i8aVar.c && lc5.Q(this.d, i8aVar.d);
    }

    public final int hashCode() {
        int iC = j39.c(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("TTSState(title=", this.a, ", chapter=", this.b, ", isPlaying=");
        sbQ.append(this.c);
        sbQ.append(", coverPath=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
