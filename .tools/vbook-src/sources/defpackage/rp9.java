package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rp9 implements jt1, yx1 {
    public final jt1 a;
    public final jx1 b;

    public rp9(jt1 jt1Var, jx1 jx1Var) {
        this.a = jt1Var;
        this.b = jx1Var;
    }

    @Override // defpackage.yx1
    public final yx1 getCallerFrame() {
        jt1 jt1Var = this.a;
        if (jt1Var instanceof yx1) {
            return (yx1) jt1Var;
        }
        return null;
    }

    @Override // defpackage.jt1
    public final jx1 getContext() {
        return this.b;
    }

    @Override // defpackage.jt1
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
