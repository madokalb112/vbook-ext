package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u29 extends pz8 {
    public final /* synthetic */ AtomicReferenceArray s;

    public u29(long j, u29 u29Var, int i) {
        super(j, u29Var, i);
        this.s = new AtomicReferenceArray(t29.f);
    }

    @Override // defpackage.pz8
    public final int l() {
        return t29.f;
    }

    @Override // defpackage.pz8
    public final void m(int i, jx1 jx1Var) {
        this.s.set(i, t29.e);
        n();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}
