package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pn4 implements rn4 {
    public final String a;
    public final String b;

    public pn4(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn4)) {
            return false;
        }
        pn4 pn4Var = (pn4) obj;
        return lc5.Q(this.a, pn4Var.a) && lc5.Q(this.b, pn4Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return tw2.o("ExtensionFound(url=", this.a, ", extensionId=", this.b, ")");
    }
}
