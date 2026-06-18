package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bw4 {
    public Long a = 0L;
    public Long b = 0L;
    public Long c = 0L;

    static {
        ug8.a(bw4.class);
        try {
            ug8.d(bw4.class);
        } catch (Throwable unused) {
        }
        if (bw9.a0("TimeoutConfiguration")) {
            gp.l("Name can't be blank");
        }
    }

    public bw4() {
        c(null);
        b(null);
        d(null);
    }

    public static void a(Long l) {
        if (l == null || l.longValue() > 0) {
            return;
        }
        gp.l("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS");
    }

    public final void b(Long l) {
        a(l);
        this.b = l;
    }

    public final void c(Long l) {
        a(l);
        this.a = l;
    }

    public final void d(Long l) {
        a(l);
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bw4.class != obj.getClass()) {
            return false;
        }
        bw4 bw4Var = (bw4) obj;
        return lc5.Q(this.a, bw4Var.a) && lc5.Q(this.b, bw4Var.b) && lc5.Q(this.c, bw4Var.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l != null ? Long.hashCode(l.longValue()) : 0) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 31;
        Long l3 = this.c;
        return iHashCode2 + (l3 != null ? Long.hashCode(l3.longValue()) : 0);
    }
}
