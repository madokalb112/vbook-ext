package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class xz8 {
    public static final oz8 a = new oz8(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(oz8 oz8Var) {
        oz8Var.getClass();
        if (oz8Var.f != null || oz8Var.g != null) {
            gp.l("Failed requirement.");
            return;
        }
        if (oz8Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        oz8 oz8Var2 = a;
        oz8 oz8Var3 = (oz8) atomicReference.getAndSet(oz8Var2);
        if (oz8Var3 == oz8Var2) {
            return;
        }
        int i = oz8Var3 != null ? oz8Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(oz8Var3);
            return;
        }
        oz8Var.f = oz8Var3;
        oz8Var.b = 0;
        oz8Var.c = i + 8192;
        atomicReference.set(oz8Var);
    }

    public static final oz8 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        oz8 oz8Var = a;
        oz8 oz8Var2 = (oz8) atomicReference.getAndSet(oz8Var);
        if (oz8Var2 == oz8Var) {
            return new oz8();
        }
        if (oz8Var2 == null) {
            atomicReference.set(null);
            return new oz8();
        }
        atomicReference.set(oz8Var2.f);
        oz8Var2.f = null;
        oz8Var2.c = 0;
        return oz8Var2;
    }
}
