package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mo2 implements po2 {
    public final sgb a;
    public final int b;
    public final String c;

    public mo2(sgb sgbVar, int i, String str) {
        str.getClass();
        this.a = sgbVar;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo2)) {
            return false;
        }
        mo2 mo2Var = (mo2) obj;
        return this.a.equals(mo2Var.a) && this.b == mo2Var.b && lc5.Q(this.c, mo2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tw2.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportStatus(user=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", content=");
        return ky0.s(this.c, ")", sb);
    }
}
