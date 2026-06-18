package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zx4 {
    public final String a;
    public final float b;

    public zx4(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx4)) {
            return false;
        }
        zx4 zx4Var = (zx4) obj;
        return this.a.equals(zx4Var.a) && Float.compare(this.b, zx4Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdentifiedLanguage(languageTag=" + this.a + ", confidence=" + this.b + ")";
    }
}
