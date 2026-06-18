package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class yz8 {
    public static final nz8 a = new nz8(new byte[0], 0, 0, null);
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final AtomicReferenceArray f;
    public static final AtomicReferenceArray g;

    static {
        int iIntValue;
        int i = 0;
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        int i2 = iHighestOneBit / 2;
        int i3 = i2 >= 1 ? i2 : 1;
        c = i3;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", lc5.Q(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304");
        property.getClass();
        Integer numL = iw9.L(10, property);
        if (numL != null && (iIntValue = numL.intValue()) >= 0) {
            i = iIntValue;
        }
        d = i;
        int i4 = i / i3;
        if (i4 < 8192) {
            i4 = 8192;
        }
        e = i4;
        f = new AtomicReferenceArray(iHighestOneBit);
        g = new AtomicReferenceArray(i3);
    }

    public static final void a(nz8 nz8Var) {
        nz8 nz8Var2 = a;
        nz8Var.getClass();
        if (nz8Var.f != null || nz8Var.g != null) {
            gp.l("Failed requirement.");
            return;
        }
        sg8 sg8Var = nz8Var.d;
        if (sg8Var != null && sg8Var.a != 0) {
            int iDecrementAndGet = sg8.b.decrementAndGet(sg8Var);
            if (iDecrementAndGet >= 0) {
                return;
            }
            if (iDecrementAndGet != -1) {
                w58.q(iDecrementAndGet + 1, "Shared copies count is negative: ");
                return;
            }
            sg8Var.a = 0;
        }
        AtomicReferenceArray atomicReferenceArray = f;
        int id = (int) ((((long) b) - 1) & Thread.currentThread().getId());
        nz8Var.b = 0;
        nz8Var.e = true;
        while (true) {
            nz8 nz8Var3 = (nz8) atomicReferenceArray.get(id);
            if (nz8Var3 != nz8Var2) {
                int i = nz8Var3 != null ? nz8Var3.c : 0;
                if (i < 65536) {
                    nz8Var.f = nz8Var3;
                    nz8Var.c = i + 8192;
                    while (!atomicReferenceArray.compareAndSet(id, nz8Var3, nz8Var)) {
                        if (atomicReferenceArray.get(id) != nz8Var3) {
                            break;
                        }
                    }
                    return;
                }
                if (d <= 0) {
                    return;
                }
                nz8Var.b = 0;
                nz8Var.e = true;
                int id2 = (int) ((((long) c) - 1) & Thread.currentThread().getId());
                AtomicReferenceArray atomicReferenceArray2 = g;
                int i2 = 0;
                while (true) {
                    nz8 nz8Var4 = (nz8) atomicReferenceArray2.get(id2);
                    if (nz8Var4 != nz8Var2) {
                        int i3 = (nz8Var4 != null ? nz8Var4.c : 0) + 8192;
                        if (i3 <= e) {
                            nz8Var.f = nz8Var4;
                            nz8Var.c = i3;
                            while (!atomicReferenceArray2.compareAndSet(id2, nz8Var4, nz8Var)) {
                                if (atomicReferenceArray2.get(id2) != nz8Var4) {
                                    break;
                                }
                            }
                            return;
                        }
                        int i4 = c;
                        if (i2 >= i4) {
                            return;
                        }
                        i2++;
                        id2 = (id2 + 1) & (i4 - 1);
                    }
                }
            }
        }
    }

    public static final nz8 b() {
        AtomicReferenceArray atomicReferenceArray;
        nz8 nz8Var;
        nz8 nz8Var2;
        int id = (int) ((((long) b) - 1) & Thread.currentThread().getId());
        do {
            atomicReferenceArray = f;
            nz8Var = a;
            nz8Var2 = (nz8) atomicReferenceArray.getAndSet(id, nz8Var);
        } while (lc5.Q(nz8Var2, nz8Var));
        if (nz8Var2 != null) {
            atomicReferenceArray.set(id, nz8Var2.f);
            nz8Var2.f = null;
            nz8Var2.c = 0;
            return nz8Var2;
        }
        atomicReferenceArray.set(id, null);
        if (d <= 0) {
            return new nz8();
        }
        int i = c;
        int id2 = (int) (Thread.currentThread().getId() & (((long) i) - 1));
        int i2 = 0;
        while (true) {
            AtomicReferenceArray atomicReferenceArray2 = g;
            nz8 nz8Var3 = (nz8) atomicReferenceArray2.getAndSet(id2, nz8Var);
            if (!lc5.Q(nz8Var3, nz8Var)) {
                if (nz8Var3 != null) {
                    atomicReferenceArray2.set(id2, nz8Var3.f);
                    nz8Var3.f = null;
                    nz8Var3.c = 0;
                    return nz8Var3;
                }
                atomicReferenceArray2.set(id2, null);
                if (i2 >= i) {
                    return new nz8();
                }
                id2 = (id2 + 1) & (i - 1);
                i2++;
            }
        }
    }
}
