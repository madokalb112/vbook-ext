package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zl9 {
    public final String a;
    public final String b;

    public zl9(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl9)) {
            return false;
        }
        zl9 zl9Var = (zl9) obj;
        return this.a.equals(zl9Var.a) && this.b.equals(zl9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tw2.o("SourceContent(title=", this.a, ", content=", this.b, ")");
    }
}
