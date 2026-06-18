package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gn3 {
    public final int a;
    public final int b;
    public final boolean c;

    public gn3(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn3)) {
            return false;
        }
        gn3 gn3Var = (gn3) obj;
        return this.a == gn3Var.a && this.b == gn3Var.b && this.c == gn3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + tw2.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return xv5.q(")", xv5.t(this.a, this.b, "ExtensionConnectionConfig(thread=", ", delay=", ", ignore="), this.c);
    }
}
