package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xka {
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final float g;
    public final boolean h;
    public final boolean i;
    public final String j;

    public xka(int i, boolean z, int i2, boolean z2, boolean z3, float f, float f2, boolean z4, boolean z5, String str) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = z3;
        this.f = f;
        this.g = f2;
        this.h = z4;
        this.i = z5;
        this.j = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xka)) {
            return false;
        }
        xka xkaVar = (xka) obj;
        return this.a == xkaVar.a && this.b == xkaVar.b && this.c == xkaVar.c && this.d == xkaVar.d && this.e == xkaVar.e && Float.compare(this.f, xkaVar.f) == 0 && Float.compare(this.g, xkaVar.g) == 0 && this.h == xkaVar.h && this.i == xkaVar.i && this.j.equals(xkaVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + j39.c(j39.c(tw2.c(this.g, tw2.c(this.f, j39.c(j39.c(tw2.d(this.c, j39.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Info(preloadSize=");
        sb.append(this.a);
        sb.append(", isPreloadParallel=");
        sb.append(this.b);
        sb.append(", maxSpeechInputLength=");
        j39.x(sb, this.c, ", isSupportChangeSpeedRate=", this.d, ", isSupportChangePinch=");
        sb.append(this.e);
        sb.append(", maxSpeedRate=");
        sb.append(this.f);
        sb.append(", maxPinch=");
        sb.append(this.g);
        sb.append(", isNetworkRequired=");
        sb.append(this.h);
        sb.append(", hasApiKey=");
        sb.append(this.i);
        sb.append(", supportUrl=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
