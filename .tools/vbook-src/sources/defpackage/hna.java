package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hna {
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final String e;

    public hna(int i, int i2, String str, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hna)) {
            return false;
        }
        hna hnaVar = (hna) obj;
        return this.a == hnaVar.a && this.b == hnaVar.b && this.c == hnaVar.c && this.d == hnaVar.d && this.e.equals(hnaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.c(tw2.d(this.c, j39.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TtsInfo(preload=");
        sb.append(this.a);
        sb.append(", preloadParallel=");
        sb.append(this.b);
        sb.append(", maxLength=");
        j39.x(sb, this.c, ", requiredApiKey=", this.d, ", supportUrl=");
        return ky0.s(this.e, ")", sb);
    }
}
