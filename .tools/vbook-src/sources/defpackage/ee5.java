package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ee5 extends n36 implements ax2, t55 {
    public pe5 s;

    @Override // defpackage.ax2
    public final void a() {
        p().b0(this);
    }

    @Override // defpackage.t55
    public final e77 c() {
        return null;
    }

    public yd5 getParent() {
        return p();
    }

    @Override // defpackage.t55
    public final boolean isActive() {
        return true;
    }

    public final pe5 p() {
        pe5 pe5Var = this.s;
        if (pe5Var != null) {
            return pe5Var;
        }
        lc5.i0("job");
        throw null;
    }

    public abstract boolean q();

    public abstract void r(Throwable th);

    @Override // defpackage.n36
    public final String toString() {
        return getClass().getSimpleName() + '@' + md2.c0(this) + "[job@" + md2.c0(p()) + ']';
    }
}
