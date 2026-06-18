package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s07 implements zx0, evb {
    public final ay0 a;
    public final /* synthetic */ t07 b;

    public s07(t07 t07Var, ay0 ay0Var) {
        this.b = t07Var;
        this.a = ay0Var;
    }

    @Override // defpackage.zx0
    public final boolean a(Throwable th) {
        return this.a.a(th);
    }

    @Override // defpackage.evb
    public final void b(pz8 pz8Var, int i) {
        this.a.b(pz8Var, i);
    }

    @Override // defpackage.zx0
    public final zy2 d(Object obj, zb4 zb4Var) {
        t07 t07Var = this.b;
        rt6 rt6Var = new rt6(t07Var, this);
        zy2 zy2VarG = this.a.G((heb) obj, rt6Var);
        if (zy2VarG != null) {
            t07.v.set(t07Var, null);
        }
        return zy2VarG;
    }

    @Override // defpackage.jt1
    public final jx1 getContext() {
        return this.a.e;
    }

    @Override // defpackage.zx0
    public final void i(Object obj, zb4 zb4Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t07.v;
        t07 t07Var = this.b;
        atomicReferenceFieldUpdater.set(t07Var, null);
        zs5 zs5Var = new zs5(17, t07Var, this);
        ay0 ay0Var = this.a;
        ay0Var.D(heb.a, ay0Var.c, new nl9(zs5Var, 4));
    }

    @Override // defpackage.zx0
    public final void l(Object obj) {
        this.a.l(obj);
    }

    @Override // defpackage.jt1
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
