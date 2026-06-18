package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wj8 {
    public final long a;
    public final cp2 b;

    public wj8(long j, cp2 cp2Var) {
        this.a = j;
        this.b = cp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj8)) {
            return false;
        }
        wj8 wj8Var = (wj8) obj;
        return this.a == wj8Var.a && this.b.equals(wj8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ReplyTarget(postId=" + this.a + ", quote=" + this.b + ")";
    }
}
