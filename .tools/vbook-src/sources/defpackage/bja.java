package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bja {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public bja(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static bja a(bja bjaVar, int i, int i2, int i3, int i4, int i5) {
        bjaVar.getClass();
        if ((i5 & 2) != 0) {
            i = bjaVar.a;
        }
        if ((i5 & 4) != 0) {
            i2 = bjaVar.b;
        }
        if ((i5 & 8) != 0) {
            i3 = bjaVar.c;
        }
        if ((i5 & 16) != 0) {
            i4 = bjaVar.d;
        }
        bjaVar.getClass();
        return new bja(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bja)) {
            return false;
        }
        bja bjaVar = (bja) obj;
        return this.a == bjaVar.a && this.b == bjaVar.b && this.c == bjaVar.c && this.d == bjaVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + tw2.d(this.c, tw2.d(this.b, tw2.d(this.a, Boolean.hashCode(true) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = xv5.t(this.a, this.b, "TextQtDictionaryState(isLoading=true, privVpCount=", ", privNameCount=", ", generalVpCount=");
        sbT.append(this.c);
        sbT.append(", generalNameCount=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
