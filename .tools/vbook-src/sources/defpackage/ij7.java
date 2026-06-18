package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ij7 implements r81 {
    public final Class a;

    public ij7(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.r81
    public final Class c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ij7) {
            return lc5.Q(this.a, ((ij7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
