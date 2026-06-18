package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ue0 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r19 b;

    public /* synthetic */ ue0(r19 r19Var, int i) {
        this.a = i;
        this.b = r19Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        r19 r19Var = this.b;
        switch (i) {
            case 0:
                AtomicLong atomicLong = r19Var.d;
                long andIncrement = atomicLong.getAndIncrement();
                while (andIncrement == 0) {
                    andIncrement = atomicLong.getAndIncrement();
                }
                return Long.valueOf(andIncrement);
            default:
                AtomicLong atomicLong2 = r19Var.d;
                long andIncrement2 = atomicLong2.getAndIncrement();
                while (andIncrement2 == 0) {
                    andIncrement2 = atomicLong2.getAndIncrement();
                }
                return Long.valueOf(andIncrement2);
        }
    }
}
