package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class uz5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ mx0 c;
    public final /* synthetic */ ib4 d;

    public /* synthetic */ uz5(AtomicBoolean atomicBoolean, mx0 mx0Var, ib4 ib4Var, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = mx0Var;
        this.d = ib4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ib4 ib4Var = this.d;
        mx0 mx0Var = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (i) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        mx0Var.a(ib4Var.invoke());
                    } catch (Throwable th) {
                        mx0Var.b(th);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        mx0Var.a(ib4Var.invoke());
                    } catch (Throwable th2) {
                        mx0Var.b(th2);
                    }
                    break;
                }
                break;
        }
    }
}
