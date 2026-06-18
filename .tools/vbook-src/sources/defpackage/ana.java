package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ana {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public ana(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static ana a(ana anaVar, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = anaVar.a;
        }
        if ((i & 4) != 0) {
            z3 = anaVar.c;
        }
        anaVar.getClass();
        anaVar.getClass();
        anaVar.getClass();
        return new ana(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ana)) {
            return false;
        }
        ana anaVar = (ana) obj;
        return this.a == anaVar.a && this.b == anaVar.b && this.c == anaVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, true);
    }

    public final String toString() {
        return xv5.q(", hasNext=true, hasPrevious=true)", j39.r("TextToSpeechControlState(isLoading=", this.a, ", isPlaying=", this.b, ", isError="), this.c);
    }
}
