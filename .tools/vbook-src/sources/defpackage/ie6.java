package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ie6 {
    public final Class a;
    public final Object b;
    public boolean c = false;
    public he6 d;

    public ie6(Class cls, Object obj, he6 he6Var) {
        this.a = cls;
        this.b = obj;
        this.d = he6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie6)) {
            return false;
        }
        ie6 ie6Var = (ie6) obj;
        return lc5.Q(this.a, ie6Var.a) && lc5.Q(this.b, ie6Var.b) && this.c == ie6Var.c && this.d == ie6Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return this.d.hashCode() + j39.c((iHashCode + (obj == null ? 0 : obj.hashCode())) * 961, 31, this.c);
    }

    public final String toString() {
        return "Configuration(declaringClass=" + this.a + ", memberInstance=" + this.b + ", processorResolver=null, superclass=" + this.c + ", optional=" + this.d + ")";
    }
}
