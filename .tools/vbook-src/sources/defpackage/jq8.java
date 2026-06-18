package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jq8 extends n0 implements lt1, im2 {
    public final g83 b;
    public final /* synthetic */ pg8 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public jq8(pg8 pg8Var) {
        g83 g83Var = g83.d;
        this.c = pg8Var;
        super(g83Var);
        this.b = g83Var;
    }

    @Override // defpackage.lt1
    public final jt1 E(kt1 kt1Var) {
        this.c.a++;
        return kt1Var;
    }

    @Override // defpackage.lt1
    public final void K0(jt1 jt1Var) {
        jt1Var.getClass();
    }

    @Override // defpackage.n0, defpackage.jx1
    public final hx1 get(ix1 ix1Var) {
        return sdc.k0(this, ix1Var);
    }

    @Override // defpackage.n0, defpackage.hx1
    public final ix1 getKey() {
        return this.b;
    }

    @Override // defpackage.n0, defpackage.jx1
    public final jx1 minusKey(ix1 ix1Var) {
        return sdc.r0(this, ix1Var);
    }

    @Override // defpackage.im2
    public final ax2 p(long j, Runnable runnable, jx1 jx1Var) {
        return pg2.a.p(j, runnable, jx1Var);
    }

    @Override // defpackage.im2
    public final void q(long j, ay0 ay0Var) {
        ay0Var.resumeWith(heb.a);
    }
}
