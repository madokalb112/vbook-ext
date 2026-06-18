package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uqb {
    public final Object a;
    public final String b;
    public final String c;

    public uqb(Object obj, String str, String str2) {
        this.a = obj;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqb)) {
            return false;
        }
        uqb uqbVar = (uqb) obj;
        return this.a.equals(uqbVar.a) && this.b.equals(uqbVar.b) && this.c.equals(uqbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoRequest(data=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", uuid=");
        return ky0.s(this.c, ")", sb);
    }
}
