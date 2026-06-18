package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class zg3 extends nx1 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public vv e;

    public final void F0(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public abstract long O0();

    public final boolean T0() {
        vv vvVar = this.e;
        if (vvVar == null) {
            return false;
        }
        nw2 nw2Var = (nw2) (vvVar.isEmpty() ? null : vvVar.removeFirst());
        if (nw2Var == null) {
            return false;
        }
        nw2Var.run();
        return true;
    }

    @Override // defpackage.nx1
    public final nx1 e0(int i) {
        qx1.r(i);
        return this;
    }

    public final void p0(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract void shutdown();

    public final void x0(nw2 nw2Var) {
        vv vvVar = this.e;
        if (vvVar == null) {
            vvVar = new vv();
            this.e = vvVar;
        }
        vvVar.addLast(nw2Var);
    }
}
