package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l9b {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public l9b(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public static l9b a(l9b l9bVar, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        if ((i3 & 1) != 0) {
            i = l9bVar.a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            i2 = l9bVar.b;
        }
        int i5 = i2;
        if ((i3 & 4) != 0) {
            z = l9bVar.c;
        }
        boolean z5 = z;
        if ((i3 & 8) != 0) {
            z2 = l9bVar.d;
        }
        boolean z6 = z2;
        if ((i3 & 16) != 0) {
            z3 = l9bVar.e;
        }
        boolean z7 = z3;
        if ((i3 & 32) != 0) {
            z4 = l9bVar.f;
        }
        l9bVar.getClass();
        return new l9b(i4, i5, z5, z6, z7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9b)) {
            return false;
        }
        l9b l9bVar = (l9b) obj;
        return this.a == l9bVar.a && this.b == l9bVar.b && this.c == l9bVar.c && this.d == l9bVar.d && this.e == l9bVar.e && this.f == l9bVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j39.c(j39.c(j39.c(tw2.d(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = xv5.t(this.a, this.b, "TurnPageState(turnPageByTouchOrientation=", ", turnPageTouchMode=", ", isTurnPageByVolume=");
        ky0.D(sbT, this.c, ", isRevertTurnPageByVolume=", this.d, ", isTurnPageByKeyboard=");
        sbT.append(this.e);
        sbT.append(", isAnimationTurnPage=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
