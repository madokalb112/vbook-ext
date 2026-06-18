package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zua {
    public final long a;
    public final long b;
    public final long c;
    public final so9 d;

    public zua() {
        mc8 mc8Var = k63.b;
        o63 o63Var = o63.SECONDS;
        long jZ0 = lx1.z0(45, o63Var);
        long jZ02 = lx1.z0(5, o63Var);
        long jZ03 = lx1.z0(5, o63Var);
        so9 so9Var = js8.x;
        this.a = jZ0;
        this.b = jZ02;
        this.c = jZ03;
        this.d = so9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zua)) {
            return false;
        }
        zua zuaVar = (zua) obj;
        return k63.d(this.a, zuaVar.a) && k63.d(this.b, zuaVar.b) && k63.d(this.c, zuaVar.c) && lc5.Q(this.d, zuaVar.d);
    }

    public final int hashCode() {
        mc8 mc8Var = k63.b;
        return this.d.hashCode() + xv5.b(xv5.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) k63.j(this.a)) + ", additionalTime=" + ((Object) k63.j(this.b)) + ", idleTimeout=" + ((Object) k63.j(this.c)) + ", timeSource=" + this.d + ')';
    }
}
