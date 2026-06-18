package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gl8 {
    public final fm5 a;
    public final ch8 b;
    public final mra c;
    public final tn2 d;

    public gl8(fm5 fm5Var, ch8 ch8Var, mra mraVar, tn2 tn2Var) {
        this.a = fm5Var;
        this.b = ch8Var;
        this.c = mraVar;
        this.d = tn2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gl8.class != obj.getClass()) {
            return false;
        }
        gl8 gl8Var = (gl8) obj;
        return this.a.equals(gl8Var.a) && this.b.equals(gl8Var.b) && this.c == gl8Var.c && this.d == gl8Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + j39.a(this.a.a.hashCode() * 31, 31, this.b.a)) * 31);
    }
}
