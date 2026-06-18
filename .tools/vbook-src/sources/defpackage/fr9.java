package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fr9 extends a3 implements b07, b24, mc4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(fr9.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long s = kt0.a.objectFieldOffset(fr9.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    public fr9(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        if (r13.equals(r15) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0079, code lost:
    
        if (r15 != r2) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:39:0x008f, B:41:0x0095], limit reached: 70 */
    /* JADX WARN: Path cross not found for [B:41:0x0095, B:39:0x008f], limit reached: 70 */
    /* JADX WARN: Path cross not found for [B:41:0x0095, B:49:0x00b0], limit reached: 70 */
    /* JADX WARN: Path cross not found for [B:61:0x00f2, B:62:0x00f3], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:31:0x0079, B:33:0x0081, B:36:0x0088, B:37:0x008c, B:39:0x008f, B:49:0x00b0, B:52:0x00c0, B:53:0x00dc, B:59:0x00ec, B:56:0x00e3, B:58:0x00e9, B:41:0x0095, B:45:0x009c, B:21:0x004b), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:31:0x0079, B:33:0x0081, B:36:0x0088, B:37:0x008c, B:39:0x008f, B:49:0x00b0, B:52:0x00c0, B:53:0x00dc, B:59:0x00ec, B:56:0x00e3, B:58:0x00e9, B:41:0x0095, B:45:0x009c, B:21:0x004b), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:31:0x0079, B:33:0x0081, B:36:0x0088, B:37:0x008c, B:39:0x008f, B:49:0x00b0, B:52:0x00c0, B:53:0x00dc, B:59:0x00ec, B:56:0x00e3, B:58:0x00e9, B:41:0x0095, B:45:0x009c, B:21:0x004b), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [hr9] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [b3] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [hr9] */
    /* JADX WARN: Type inference failed for: r1v7, types: [hr9] */
    /* JADX WARN: Type inference failed for: r1v8, types: [hr9] */
    /* JADX WARN: Type inference failed for: r8v1, types: [a3] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [fr9] */
    /* JADX WARN: Type inference failed for: r8v5, types: [fr9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [fr9] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00bf -> B:31:0x0079). Please report as a decompilation issue!!! */
    @Override // defpackage.b24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.c24 r14, defpackage.jt1 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr9.a(c24, jt1):java.lang.Object");
    }

    @Override // defpackage.xz6, defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        k(obj);
        return heb.a;
    }

    @Override // defpackage.mc4
    public final b24 c(jx1 jx1Var, int i, ar0 ar0Var) {
        return ((((i < 0 || i >= 2) && i != -2) || ar0Var != ar0.b) && !((i == 0 || i == -3) && ar0Var == ar0.a)) ? new n11(this, jx1Var, i, ar0Var) : this;
    }

    @Override // defpackage.a3
    public final b3 e() {
        return new hr9();
    }

    @Override // defpackage.xz6
    public final boolean f(Object obj) {
        k(obj);
        return true;
    }

    @Override // defpackage.a3
    public final b3[] g() {
        return new hr9[2];
    }

    @Override // defpackage.dr9
    public final Object getValue() {
        f.getClass();
        Object objectVolatile = kt0.a.getObjectVolatile(this, s);
        if (objectVolatile == y97.a) {
            return null;
        }
        return objectVolatile;
    }

    public final boolean j(Object obj, Object obj2) {
        zy2 zy2Var = y97.a;
        if (obj == null) {
            obj = zy2Var;
        }
        if (obj2 == null) {
            obj2 = zy2Var;
        }
        return l(obj, obj2);
    }

    public final void k(Object obj) {
        if (obj == null) {
            obj = y97.a;
        }
        l(null, obj);
    }

    public final boolean l(Object obj, Object obj2) {
        int i;
        b3[] b3VarArr;
        zy2 zy2Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !lc5.Q(obj3, obj)) {
                return false;
            }
            if (lc5.Q(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.e;
            if ((i2 & 1) != 0) {
                this.e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e = i3;
            b3[] b3VarArr2 = this.a;
            while (true) {
                hr9[] hr9VarArr = (hr9[]) b3VarArr2;
                if (hr9VarArr != null) {
                    for (hr9 hr9Var : hr9VarArr) {
                        if (hr9Var != null) {
                            AtomicReference atomicReference = hr9Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (zy2Var = gr9.b)) {
                                    zy2 zy2Var2 = gr9.a;
                                    if (obj4 != zy2Var2) {
                                        while (!atomicReference.compareAndSet(obj4, zy2Var2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((ay0) obj4).resumeWith(heb.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, zy2Var)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i3) {
                        this.e = i3 + 1;
                        return true;
                    }
                    b3VarArr = this.a;
                }
                b3VarArr2 = b3VarArr;
                i3 = i;
            }
        }
    }
}
