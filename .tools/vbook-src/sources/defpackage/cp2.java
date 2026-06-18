package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cp2 {
    public final sgb a;
    public final bp b;
    public final boolean c;

    public cp2(sgb sgbVar, bp bpVar, boolean z) {
        sgbVar.getClass();
        bpVar.getClass();
        this.a = sgbVar;
        this.b = bpVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp2)) {
            return false;
        }
        cp2 cp2Var = (cp2) obj;
        return lc5.Q(this.a, cp2Var.a) && lc5.Q(this.b, cp2Var.b) && this.c == cp2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DetailQuote(user=");
        sb.append(this.a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", isDeleted=");
        return xv5.q(")", sb, this.c);
    }
}
