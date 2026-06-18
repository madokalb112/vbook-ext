package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cd6 {
    public final String a;
    public final long b;

    public cd6(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd6)) {
            return false;
        }
        cd6 cd6Var = (cd6) obj;
        return lc5.Q(this.a, cd6Var.a) && this.b == cd6Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Long.hashCode(this.b) + ((str != null ? str.hashCode() : 0) * 31);
    }
}
