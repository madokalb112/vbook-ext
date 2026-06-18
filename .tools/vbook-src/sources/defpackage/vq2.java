package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vq2 {
    public final String a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public vq2(String str, List list, boolean z, boolean z2) {
        this.a = str;
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq2)) {
            return false;
        }
        vq2 vq2Var = (vq2) obj;
        return this.a.equals(vq2Var.a) && this.b.equals(vq2Var.b) && this.c == vq2Var.c && this.d == vq2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j39.c(j39.d(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }

    public final String toString() {
        return "DetailSection(title=" + this.a + ", chapters=" + this.b + ", isGrid=" + this.c + ", isReverted=" + this.d + ")";
    }
}
