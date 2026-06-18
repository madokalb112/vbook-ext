package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ko8 extends q1 implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public ko8(Object[] objArr, int i) {
        this.a = objArr;
        if (i < 0) {
            gp.k(dx1.f(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.b = objArr.length;
            this.d = i;
        } else {
            gp.h(objArr.length, xv5.u(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    @Override // defpackage.g0
    public final int a() {
        return this.d;
    }

    public final void c(int i) {
        if (i < 0) {
            gp.k(dx1.f(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > this.d) {
            gp.h(this.d, xv5.u(i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
            return;
        }
        if (i > 0) {
            int i2 = this.c;
            int i3 = this.b;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.a;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.c = i4;
            this.d -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.d;
        if (i < 0 || i >= i2) {
            k27.m(xv5.o("index: ", i, i2, ", size: "));
            return null;
        }
        return this.a[(this.c + i) % this.b];
    }

    @Override // defpackage.q1, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new jo8(this);
    }

    @Override // defpackage.g0, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.d;
        int i3 = this.c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.a;
            if (i5 >= i2 || i3 >= this.b) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // defpackage.g0, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }
}
