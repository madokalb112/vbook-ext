package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ux {
    public final a25 a;
    public final ix b;
    public final b15 c;

    public ux(ix ixVar, b15 b15Var, a25 a25Var) {
        this.a = a25Var;
        this.b = ixVar;
        this.c = b15Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux)) {
            return false;
        }
        ux uxVar = (ux) obj;
        ix ixVar = uxVar.b;
        ix ixVar2 = this.b;
        return lc5.Q(ixVar2, ixVar) && ixVar2.a(this.a, uxVar.a) && lc5.Q(this.c, uxVar.c);
    }

    public final int hashCode() {
        ix ixVar = this.b;
        return this.c.hashCode() + ((ixVar.b(this.a) + (ixVar.hashCode() * 31)) * 31);
    }
}
