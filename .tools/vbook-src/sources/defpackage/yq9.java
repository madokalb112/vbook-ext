package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yq9 implements ib9 {
    public final long a;
    public final long b;

    public yq9(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j < 0) {
            gp.k(xv5.m(j, "stopTimeout(", " ms) cannot be negative"));
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        gp.k(xv5.m(j2, "replayExpiration(", " ms) cannot be negative"));
        throw null;
    }

    @Override // defpackage.ib9
    public final b24 a(fz9 fz9Var) {
        return cx1.L(new v24(cx1.A0(fz9Var, new xq9(this, null)), new ei0(2, 8, null), 0));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yq9)) {
            return false;
        }
        yq9 yq9Var = (yq9) obj;
        return this.a == yq9Var.a && this.b == yq9Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        zy5 zy5Var = new zy5(2);
        long j = this.a;
        if (j > 0) {
            zy5Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            zy5Var.add("replayExpiration=" + j2 + "ms");
        }
        return xv5.s(new StringBuilder("SharingStarted.WhileSubscribed("), fc1.D0(gc1.J(zy5Var), null, null, null, null, 63), ')');
    }
}
