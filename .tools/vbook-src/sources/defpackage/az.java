package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class az implements iy {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ az(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ax
    public final Object a(kt1 kt1Var) {
        boolean zIsTerminated;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object objA = ((oy) ((ww) obj).b).a(kt1Var);
                return objA == xx1.a ? objA : hebVar;
            default:
                Object obj2 = (r5a) obj;
                if (!(obj2 instanceof AutoCloseable)) {
                    obj2 = null;
                }
                if (obj2 == null || (obj2 instanceof AutoCloseable)) {
                    return hebVar;
                }
                if (!(obj2 instanceof ExecutorService)) {
                    w58.p();
                    return null;
                }
                ExecutorService executorService = (ExecutorService) obj2;
                if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                    return hebVar;
                }
                executorService.shutdown();
                boolean z = false;
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (!z) {
                    return hebVar;
                }
                Thread.currentThread().interrupt();
                return hebVar;
        }
    }

    @Override // defpackage.iy
    public final Object b(int i, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                Object objB = ((oy) ((ww) this.b).b).b(i, jt1Var);
                return objB == xx1.a ? objB : heb.a;
            default:
                return kf0.Z(this, i, (fm2) jt1Var);
        }
    }

    @Override // defpackage.iy
    public final Object f(byte[] bArr, int i, int i2, kt1 kt1Var) {
        int i3 = this.a;
        heb hebVar = heb.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                Object objF = ((oy) ((ww) obj).b).f(bArr, i, i2, kt1Var);
                return objF == xx1.a ? objF : hebVar;
            default:
                ((r5a) obj).write(bArr, i, i2);
                return hebVar;
        }
    }
}
