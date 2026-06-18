package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39(with = bv6.class)
public final class p72 extends l72 {
    public static final o72 Companion = new o72();
    public final int d;

    public p72(int i) {
        this.d = i;
        if (i > 0) {
            return;
        }
        gp.k(xv5.k(i, "Unit duration must be positive, but was ", " months."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p72) {
            return this.d == ((p72) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d ^ 131072;
    }

    public final String toString() {
        int i = this.d;
        return i % 1200 == 0 ? s72.a(i / 1200, "CENTURY") : i % 12 == 0 ? s72.a(i / 12, "YEAR") : i % 3 == 0 ? s72.a(i / 3, "QUARTER") : s72.a(i, "MONTH");
    }
}
