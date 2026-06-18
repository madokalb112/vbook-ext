package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oa8 {
    public final Class a;
    public final Class b;

    public oa8(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static oa8 a(Class cls) {
        return new oa8(na8.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oa8.class != obj.getClass()) {
            return false;
        }
        oa8 oa8Var = (oa8) obj;
        if (this.b.equals(oa8Var.b)) {
            return this.a.equals(oa8Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == na8.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
