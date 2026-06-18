package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dpa {
    public final String a;
    public final int b;
    public final int c;
    public final String d;

    public dpa(String str, int i, int i2, String str2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpa)) {
            return false;
        }
        dpa dpaVar = (dpa) obj;
        return lc5.Q(this.a, dpaVar.a) && this.b == dpaVar.b && this.c == dpaVar.c && this.d.equals(dpaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + tw2.d(this.c, tw2.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("TextTranslateSelection(sentence=", this.a, ", selectionStart=", ", selectionEnd=", this.b);
        sbN.append(this.c);
        sbN.append(", translate=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
