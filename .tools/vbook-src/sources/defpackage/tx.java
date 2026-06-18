package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tx {
    public final Object a;
    public final ix b;
    public final b15 c;

    public tx(String str, ix ixVar, b15 b15Var) {
        ixVar.getClass();
        this.a = str;
        this.b = ixVar;
        this.c = b15Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx)) {
            return false;
        }
        tx txVar = (tx) obj;
        ix ixVar = txVar.b;
        ix ixVar2 = this.b;
        return lc5.Q(ixVar2, ixVar) && ixVar2.a(this.a, txVar.a) && this.c.equals(txVar.c);
    }

    public final int hashCode() {
        ix ixVar = this.b;
        return this.c.hashCode() + ((ixVar.b(this.a) + (ixVar.hashCode() * 31)) * 31);
    }
}
