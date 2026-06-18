package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ie5 implements t55 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ie5.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(ie5.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final e77 a;

    static {
        Unsafe unsafe = kt0.a;
        f = unsafe.objectFieldOffset(ie5.class.getDeclaredField("_rootCause$volatile"));
        d = AtomicReferenceFieldUpdater.newUpdater(ie5.class, Object.class, "_exceptionsHolder$volatile");
        e = unsafe.objectFieldOffset(ie5.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public ie5(e77 e77Var, Throwable th) {
        this.a = e77Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thD = d();
        if (thD == null) {
            h(th);
            return;
        }
        if (th == thD) {
            return;
        }
        Object objB = b();
        if (objB == null) {
            g(th);
            return;
        }
        if (!(objB instanceof Throwable)) {
            if (objB instanceof ArrayList) {
                ((ArrayList) objB).add(th);
                return;
            } else {
                mn5.n(objB, "State is ");
                return;
            }
        }
        if (th == objB) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objB);
        arrayList.add(th);
        g(arrayList);
    }

    public final Object b() {
        d.getClass();
        return kt0.a.getObjectVolatile(this, e);
    }

    @Override // defpackage.t55
    public final e77 c() {
        return this.a;
    }

    public final Throwable d() {
        c.getClass();
        return (Throwable) kt0.a.getObjectVolatile(this, f);
    }

    public final boolean e() {
        return d() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        Object objB = b();
        if (objB == null) {
            arrayList = new ArrayList(4);
        } else if (objB instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objB);
            arrayList = arrayList2;
        } else {
            if (!(objB instanceof ArrayList)) {
                mn5.n(objB, "State is ");
                return null;
            }
            arrayList = (ArrayList) objB;
        }
        Throwable thD = d();
        if (thD != null) {
            arrayList.add(0, thD);
        }
        if (th != null && !th.equals(thD)) {
            arrayList.add(th);
        }
        g(qe5.e);
        return arrayList;
    }

    public final void g(Object obj) {
        d.getClass();
        kt0.a.putObjectVolatile(this, e, obj);
    }

    public final void h(Throwable th) {
        c.getClass();
        kt0.a.putObjectVolatile(this, f, th);
    }

    @Override // defpackage.t55
    public final boolean isActive() {
        return d() == null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(b.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(d());
        sb.append(", exceptions=");
        sb.append(b());
        sb.append(", list=");
        sb.append(this.a);
        sb.append(']');
        return sb.toString();
    }
}
