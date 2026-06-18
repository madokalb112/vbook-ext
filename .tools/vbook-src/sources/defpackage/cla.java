package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cla {
    public final String a;
    public final String b;
    public final boolean c;

    public cla(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cla)) {
            return false;
        }
        cla claVar = (cla) obj;
        return this.a.equals(claVar.a) && this.b.equals(claVar.b) && this.c == claVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xv5.q(")", j39.q("Voice(id=", this.a, ", name=", this.b, ", isRequireNetwork="), this.c);
    }
}
