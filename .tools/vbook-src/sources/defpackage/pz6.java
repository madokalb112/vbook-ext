package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pz6 {
    public final LinkedHashMap a;
    public final bbc b;

    public pz6(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new bbc(z);
    }

    public final Map a() {
        xl7 xl7Var;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int iO = y86.O(gc1.M(setEntrySet, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                xl7Var = new xl7(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                xl7Var = new xl7(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(xl7Var.a, xl7Var.b);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.b).get()) {
            gp.j("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(e18 e18Var) {
        e18Var.getClass();
        Object obj = this.a.get(e18Var);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final void d(e18 e18Var) {
        e18Var.getClass();
        b();
        this.a.remove(e18Var);
    }

    public final void e(e18 e18Var, Object obj) {
        e18Var.getClass();
        f(e18Var, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.pz6
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            pz6 r6 = (defpackage.pz6) r6
            java.util.LinkedHashMap r6 = r6.a
            java.util.LinkedHashMap r5 = r5.a
            r0 = 1
            if (r6 != r5) goto L10
            goto L61
        L10:
            int r2 = r6.size()
            int r3 = r5.size()
            if (r2 == r3) goto L1b
            goto L60
        L1b:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L22
            goto L61
        L22:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r3 = r5.get(r3)
            if (r3 == 0) goto L5d
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L58
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L5d
            byte[] r2 = (byte[]) r2
            byte[] r3 = (byte[]) r3
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L5d
            r2 = r0
            goto L5e
        L58:
            boolean r2 = defpackage.lc5.Q(r2, r3)
            goto L5e
        L5d:
            r2 = r1
        L5e:
            if (r2 != 0) goto L2a
        L60:
            return r1
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz6.equals(java.lang.Object):boolean");
    }

    public final void f(e18 e18Var, Object obj) {
        e18Var.getClass();
        b();
        if (obj == null) {
            d(e18Var);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.a;
        if (z) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(fc1.e1((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(e18Var, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(e18Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(e18Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final pz6 g() {
        return new pz6(new LinkedHashMap(a()), false);
    }

    public final pz6 h() {
        return new pz6(new LinkedHashMap(a()), true);
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return fc1.D0(this.a.entrySet(), ",\n", "{\n", "\n}", new ss6(6), 24);
    }

    public /* synthetic */ pz6(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
