package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class d89 implements c24, hc4 {
    public final /* synthetic */ AtomicReference a;

    public d89(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.hc4
    public final ub4 a() {
        return new p6(2, 4, AtomicReference.class, this.a, "set", "set(Ljava/lang/Object;)V");
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        this.a.set((b59) obj);
        return heb.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c24) && (obj instanceof hc4)) {
            return lc5.Q(a(), ((hc4) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
