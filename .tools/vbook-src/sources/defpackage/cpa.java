package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cpa {
    public final String a;
    public final String b;

    public cpa(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpa)) {
            return false;
        }
        cpa cpaVar = (cpa) obj;
        return lc5.Q(this.a, cpaVar.a) && lc5.Q(this.b, cpaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tw2.o("TextTranslateLookup(name=", this.a, ", url=", this.b, ")");
    }
}
