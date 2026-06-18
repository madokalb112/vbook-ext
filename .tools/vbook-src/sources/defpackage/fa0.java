package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fa0 extends ee5 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(fa0.class, Object.class, "_disposer$volatile");
    public static final /* synthetic */ long x = kt0.a.objectFieldOffset(fa0.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;
    public final ay0 t;
    public ax2 u;
    public final /* synthetic */ ha0 v;

    public fa0(ha0 ha0Var, ay0 ay0Var) {
        this.v = ha0Var;
        this.t = ay0Var;
    }

    @Override // defpackage.ee5
    public final boolean q() {
        return false;
    }

    @Override // defpackage.ee5
    public final void r(Throwable th) {
        ay0 ay0Var = this.t;
        if (th != null) {
            zy2 zy2VarG = ay0Var.G(new ei1(false, th), null);
            if (zy2VarG != null) {
                ay0Var.l(zy2VarG);
                ga0 ga0VarS = s();
                if (ga0VarS != null) {
                    ga0VarS.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ha0.b;
        ha0 ha0Var = this.v;
        if (atomicIntegerFieldUpdater.decrementAndGet(ha0Var) == 0) {
            ml2[] ml2VarArr = ha0Var.a;
            ArrayList arrayList = new ArrayList(ml2VarArr.length);
            for (ml2 ml2Var : ml2VarArr) {
                arrayList.add(ml2Var.getCompleted());
            }
            ay0Var.resumeWith(arrayList);
        }
    }

    public final ga0 s() {
        w.getClass();
        return (ga0) kt0.a.getObjectVolatile(this, x);
    }

    public final void t(ga0 ga0Var) {
        w.getClass();
        kt0.a.putObjectVolatile(this, x, ga0Var);
    }
}
