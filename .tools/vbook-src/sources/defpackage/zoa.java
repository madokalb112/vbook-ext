package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zoa {
    public final pia a;
    public final tia b;
    public final jk c;
    public final int d;

    public zoa(pia piaVar, tia tiaVar, jk jkVar, int i) {
        jkVar.getClass();
        this.a = piaVar;
        this.b = tiaVar;
        this.c = jkVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoa)) {
            return false;
        }
        zoa zoaVar = (zoa) obj;
        return this.a.equals(zoaVar.a) && this.b.equals(zoaVar.b) && lc5.Q(this.c, zoaVar.c) && this.d == zoaVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextTouchTarget(page=" + this.a + ", paragraph=" + this.b + ", textLayoutResult=" + this.c + ", index=" + this.d + ")";
    }
}
