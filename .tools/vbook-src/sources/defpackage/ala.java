package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ala {
    public final String a;
    public final String b;
    public final boolean c;

    public ala(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ala)) {
            return false;
        }
        ala alaVar = (ala) obj;
        return lc5.Q(this.a, alaVar.a) && lc5.Q(this.b, alaVar.b) && this.c == alaVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xv5.q(")", j39.q("Tts(id=", this.a, ", name=", this.b, ", isRequireNetwork="), this.c);
    }
}
