package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mia {
    public final int a;
    public final String b;
    public final float c;

    public mia(int i, String str, float f) {
        this.a = i;
        this.b = str;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mia)) {
            return false;
        }
        mia miaVar = (mia) obj;
        return this.a == miaVar.a && this.b.equals(miaVar.b) && Float.compare(this.c, miaVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + j39.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbP = j39.p("TextNavigation(index=", ", title=", this.b, ", position=", this.a);
        sbP.append(this.c);
        sbP.append(")");
        return sbP.toString();
    }
}
