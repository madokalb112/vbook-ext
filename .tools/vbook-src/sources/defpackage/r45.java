package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class r45 {
    public Object[] a;
    public int b;
    public boolean c;

    public r45(int i) {
        t1c.N(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public static int e(int i, int i2) {
        if (i2 < 0) {
            gp.l("cannot store more than MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public abstract r45 a(Object obj);

    public final void b(Object obj) {
        obj.getClass();
        d(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            d(collection.size());
            if (collection instanceof s45) {
                this.b = ((s45) collection).b(this.b, this.a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void d(int i) {
        Object[] objArr = this.a;
        int iE = e(objArr.length, this.b + i);
        if (iE > objArr.length || this.c) {
            this.a = Arrays.copyOf(this.a, iE);
            this.c = false;
        }
    }
}
