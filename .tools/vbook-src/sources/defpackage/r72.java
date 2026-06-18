package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39(with = wta.class)
public final class r72 extends s72 {
    public static final q72 Companion = new q72();
    public final long d;
    public final String e;
    public final long f;

    public r72(long j) {
        this.d = j;
        if (j <= 0) {
            gp.k(xv5.m(j, "Unit duration must be positive, but was ", " ns."));
            throw null;
        }
        if (j % 3600000000000L == 0) {
            this.e = "HOUR";
            this.f = j / 3600000000000L;
            return;
        }
        if (j % 60000000000L == 0) {
            this.e = "MINUTE";
            this.f = j / 60000000000L;
            return;
        }
        if (j % 1000000000 == 0) {
            this.e = "SECOND";
            this.f = j / 1000000000;
        } else if (j % 1000000 == 0) {
            this.e = "MILLISECOND";
            this.f = j / 1000000;
        } else if (j % 1000 == 0) {
            this.e = "MICROSECOND";
            this.f = j / 1000;
        } else {
            this.e = "NANOSECOND";
            this.f = j;
        }
    }

    public final r72 b(int i) {
        return new r72(Math.multiplyExact(this.d, i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r72) {
            return this.d == ((r72) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public final String toString() {
        String str = this.e;
        str.getClass();
        long j = this.f;
        if (j == 1) {
            return str;
        }
        return j + '-' + str;
    }
}
