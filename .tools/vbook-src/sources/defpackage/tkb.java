package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tkb {
    public final String a;
    public final Object b;

    public tkb(Object obj, String str) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkb)) {
            return false;
        }
        tkb tkbVar = (tkb) obj;
        return lc5.Q(this.a, tkbVar.a) && lc5.Q(this.b, tkbVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValueElement(name=");
        sb.append(this.a);
        sb.append(", value=");
        return xv5.r(sb, this.b, ')');
    }
}
