package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fpa {
    public final String a;
    public final int b;
    public final boolean c;

    public fpa(String str, int i, boolean z) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpa)) {
            return false;
        }
        fpa fpaVar = (fpa) obj;
        return lc5.Q(this.a, fpaVar.a) && this.b == fpaVar.b && this.c == fpaVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + tw2.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return xv5.q(")", dx1.n("TextTranslateWord(text=", this.a, ", type=", ", isPriv=", this.b), this.c);
    }
}
