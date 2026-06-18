package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zka {
    public final String a;
    public final int b;
    public final int c;

    public zka(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public static zka a(zka zkaVar, String str) {
        int i = zkaVar.b;
        int i2 = zkaVar.c;
        str.getClass();
        return new zka(str, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zka)) {
            return false;
        }
        zka zkaVar = (zka) obj;
        return this.a.equals(zkaVar.a) && this.b == zkaVar.b && this.c == zkaVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + tw2.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return tw2.q(dx1.n("Sentence(text=", this.a, ", start=", ", end=", this.b), this.c, ")");
    }
}
