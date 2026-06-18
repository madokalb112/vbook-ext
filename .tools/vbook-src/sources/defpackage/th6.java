package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class th6 {
    public String a = "";
    public String b = "";
    public boolean c = false;
    public String d = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th6)) {
            return false;
        }
        th6 th6Var = (th6) obj;
        return this.a.equals(th6Var.a) && this.b.equals(th6Var.b) && this.c == th6Var.c && this.d.equals(th6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j39.c(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        boolean z = this.c;
        String str3 = this.d;
        StringBuilder sbQ = j39.q("MobiChapter(href=", str, ", title=", str2, ", isVolume=");
        sbQ.append(z);
        sbQ.append(", nextHref=");
        sbQ.append(str3);
        sbQ.append(")");
        return sbQ.toString();
    }
}
