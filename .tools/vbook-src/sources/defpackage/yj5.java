package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yj5 {
    public final float a;
    public final boolean b;

    public yj5(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj5)) {
            return false;
        }
        yj5 yj5Var = (yj5) obj;
        return Float.compare(this.a, yj5Var.a) == 0 && this.b == yj5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TmpKeyline(size=" + this.a + ", isAnchor=" + this.b + ')';
    }
}
