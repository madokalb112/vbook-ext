package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pia extends tj7 {
    public final int d;
    public final String e;
    public final int f;
    public final ria g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pia(int i, String str, int i2, ria riaVar) {
        super(xv5.o("text_", i, riaVar.a, "_"), i, str);
        riaVar.getClass();
        this.d = i;
        this.e = str;
        this.f = i2;
        this.g = riaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pia)) {
            return false;
        }
        pia piaVar = (pia) obj;
        return this.d == piaVar.d && lc5.Q(this.e, piaVar.e) && this.f == piaVar.f && lc5.Q(this.g, piaVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + tw2.d(this.f, j39.a(Integer.hashCode(this.d) * 31, 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbP = j39.p("TextPage(chapterIndex=", ", chapterName=", this.e, ", pageCount=", this.d);
        sbP.append(this.f);
        sbP.append(", page=");
        sbP.append(this.g);
        sbP.append(")");
        return sbP.toString();
    }
}
