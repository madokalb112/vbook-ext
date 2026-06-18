package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c55 {
    public Object[] a;
    public int b = 0;
    public b55 c;

    public c55(int i) {
        this.a = new Object[i * 2];
    }

    public final mh8 a(boolean z) {
        b55 b55Var;
        b55 b55Var2;
        if (z && (b55Var2 = this.c) != null) {
            throw b55Var2.a();
        }
        mh8 mh8VarG = mh8.g(this.b, this.a, this);
        if (!z || (b55Var = this.c) == null) {
            return mh8VarG;
        }
        throw b55Var.a();
    }

    public final void b(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = this.a;
        if (i > objArr.length) {
            this.a = Arrays.copyOf(objArr, r45.e(objArr.length, i));
        }
        t1c.M(obj, obj2);
        Object[] objArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
    }

    public final void c(Set set) {
        if (set instanceof Collection) {
            int size = (set.size() + this.b) * 2;
            Object[] objArr = this.a;
            if (size > objArr.length) {
                this.a = Arrays.copyOf(objArr, r45.e(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            b(entry.getKey(), entry.getValue());
        }
    }
}
