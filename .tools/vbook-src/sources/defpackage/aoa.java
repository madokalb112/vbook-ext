package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class aoa {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;

    public aoa(int i, int i2, int i3, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public static aoa a(aoa aoaVar, boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = (i4 & 1) != 0 ? aoaVar.a : true;
        if ((i4 & 2) != 0) {
            z = aoaVar.b;
        }
        if ((i4 & 4) != 0) {
            i = aoaVar.c;
        }
        if ((i4 & 8) != 0) {
            i2 = aoaVar.d;
        }
        if ((i4 & 16) != 0) {
            i3 = aoaVar.e;
        }
        aoaVar.getClass();
        return new aoa(i, i2, i3, z2, z);
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoa)) {
            return false;
        }
        aoa aoaVar = (aoa) obj;
        return this.a == aoaVar.a && this.b == aoaVar.b && this.c == aoaVar.c && this.d == aoaVar.d && this.e == aoaVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + tw2.d(this.d, tw2.d(this.c, j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("TextToSpeechState(isRunning=", this.a, ", isExpand=", this.b, ", chapterIndex=");
        ky0.u(this.c, this.d, ", startIndex=", ", endIndex=", sbR);
        return tw2.q(sbR, this.e, ")");
    }

    public /* synthetic */ aoa() {
        this(0, -1, -1, false, false);
    }
}
