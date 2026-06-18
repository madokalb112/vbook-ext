package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class owa {
    public final String a;
    public final ywa b;
    public final int c;
    public final int d;

    public owa(String str, ywa ywaVar, int i, int i2) {
        this.a = str;
        this.b = ywaVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owa)) {
            return false;
        }
        owa owaVar = (owa) obj;
        return this.a.equals(owaVar.a) && this.b == owaVar.b && this.c == owaVar.c && this.d == owaVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + tw2.d(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "Token(text=" + this.a + ", type=" + this.b + ", start=" + this.c + ", end=" + this.d + ")";
    }
}
