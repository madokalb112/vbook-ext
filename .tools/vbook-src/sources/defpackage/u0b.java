package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class u0b implements e37 {
    public static final t0b Companion = new t0b();
    public final int a;

    public /* synthetic */ u0b(int i, int i2) {
        if (1 == (i & 1)) {
            this.a = i2;
        } else {
            qu1.w0(i, 1, s0b.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0b) && this.a == ((u0b) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return xv5.k(this.a, "TopicDetailRoute(id=", ")");
    }

    public u0b(int i) {
        this.a = i;
    }
}
