package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class lsa {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(lsa.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public ch3[] a;

    public final void a(ch3 ch3Var) {
        ch3Var.d((dh3) this);
        ch3[] ch3VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (ch3VarArr == null) {
            ch3VarArr = new ch3[4];
            this.a = ch3VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= ch3VarArr.length) {
            ch3VarArr = (ch3[]) Arrays.copyOf(ch3VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = ch3VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        ch3VarArr[i] = ch3Var;
        ch3Var.b = i;
        c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ch3 b(int r9) {
        /*
            r8 = this;
            ch3[] r0 = r8.a
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.lsa.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            ch3[] r5 = r8.a
            r5.getClass()
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            r6.getClass()
            r7 = r5[r4]
            r7.getClass()
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            r4.getClass()
            r5 = r5[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.d(r2)
            r9.b = r3
            int r8 = r1.get(r8)
            r0[r8] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lsa.b(int):ch3");
    }

    public final void c(int i) {
        while (i > 0) {
            ch3[] ch3VarArr = this.a;
            ch3VarArr.getClass();
            int i2 = (i - 1) / 2;
            ch3 ch3Var = ch3VarArr[i2];
            ch3Var.getClass();
            ch3 ch3Var2 = ch3VarArr[i];
            ch3Var2.getClass();
            if (ch3Var.compareTo(ch3Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        ch3[] ch3VarArr = this.a;
        ch3VarArr.getClass();
        ch3 ch3Var = ch3VarArr[i2];
        ch3Var.getClass();
        ch3 ch3Var2 = ch3VarArr[i];
        ch3Var2.getClass();
        ch3VarArr[i] = ch3Var;
        ch3VarArr[i2] = ch3Var2;
        ch3Var.b = i;
        ch3Var2.b = i2;
    }
}
