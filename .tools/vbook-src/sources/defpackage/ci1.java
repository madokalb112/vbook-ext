package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ci1 {
    public final Object a;
    public final vx0 b;
    public final zb4 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ ci1(Object obj, vx0 vx0Var, zb4 zb4Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : vx0Var, (i & 4) != 0 ? null : zb4Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static ci1 a(ci1 ci1Var, vx0 vx0Var, Throwable th, int i) {
        Object obj = ci1Var.a;
        if ((i & 2) != 0) {
            vx0Var = ci1Var.b;
        }
        vx0 vx0Var2 = vx0Var;
        zb4 zb4Var = ci1Var.c;
        Object obj2 = ci1Var.d;
        if ((i & 16) != 0) {
            th = ci1Var.e;
        }
        return new ci1(obj, vx0Var2, zb4Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci1)) {
            return false;
        }
        ci1 ci1Var = (ci1) obj;
        return lc5.Q(this.a, ci1Var.a) && lc5.Q(this.b, ci1Var.b) && lc5.Q(this.c, ci1Var.c) && lc5.Q(this.d, ci1Var.d) && lc5.Q(this.e, ci1Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        vx0 vx0Var = this.b;
        int iHashCode2 = (iHashCode + (vx0Var == null ? 0 : vx0Var.hashCode())) * 31;
        zb4 zb4Var = this.c;
        int iHashCode3 = (iHashCode2 + (zb4Var == null ? 0 : zb4Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public ci1(Object obj, vx0 vx0Var, zb4 zb4Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = vx0Var;
        this.c = zb4Var;
        this.d = obj2;
        this.e = th;
    }
}
