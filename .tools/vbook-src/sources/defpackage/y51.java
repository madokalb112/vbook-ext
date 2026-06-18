package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y51 {
    public final gf6 a;
    public final boolean b;
    public final boolean c;
    public dg6 d = dg6.d;

    public y51(gf6 gf6Var, boolean z, boolean z2) {
        this.a = gf6Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y51)) {
            return false;
        }
        y51 y51Var = (y51) obj;
        return this.a.equals(y51Var.a) && this.b == y51Var.b && this.c == y51Var.c && this.d == y51Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + j39.c(j39.c(j39.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 961, false);
    }

    public final String toString() {
        return "ChatMessage(message=" + this.a + ", isMe=" + this.b + ", isSending=" + this.c + ", isError=false, localId=null, position=" + this.d + ")";
    }
}
