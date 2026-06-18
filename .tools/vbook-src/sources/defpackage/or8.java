package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class or8 implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ or8(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                try {
                    runnable.run();
                } catch (Exception e) {
                    ex1.M(e, "Executor", "Background execution failure.");
                    return;
                }
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                Deque deque = (Deque) nh6.b.get();
                ex1.C(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                nh6.b.set(new ArrayDeque());
                runnable.run();
                break;
        }
    }

    public String toString() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 1:
                return runnable.toString();
            case 2:
                return runnable.toString();
            default:
                return super.toString();
        }
    }
}
