package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k99 {
    public final List a;
    public final float b;
    public final float c;

    public k99(List list, float f, float f2) {
        this.a = list;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k99)) {
            return false;
        }
        k99 k99Var = (k99) obj;
        return this.a.equals(k99Var.a) && Float.compare(this.b, k99Var.b) == 0 && Float.compare(this.c, k99Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + tw2.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FaceInfo(indices=" + this.a + ", depth=" + this.b + ", normalZ=" + this.c + ")";
    }
}
