package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class v1 extends AbstractMap {
    public transient t1 a;
    public transient j2 b;
    public final transient Map c;
    public final /* synthetic */ by6 d;

    public v1(by6 by6Var, Map map) {
        this.d = by6Var;
        this.c = map;
    }

    public final t45 a(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z = list instanceof RandomAccess;
        by6 by6Var = this.d;
        return new t45(key, z ? new z1(by6Var, key, list, null) : new d2(by6Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        by6 by6Var = this.d;
        if (this.c == by6Var.e) {
            by6Var.b();
            return;
        }
        u1 u1Var = new u1(this);
        while (u1Var.hasNext()) {
            u1Var.next();
            u1Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        t1 t1Var = this.a;
        if (t1Var != null) {
            return t1Var;
        }
        t1 t1Var2 = new t1(this);
        this.a = t1Var2;
        return t1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z = list instanceof RandomAccess;
        by6 by6Var = this.d;
        return z ? new z1(by6Var, obj, list, null) : new d2(by6Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        by6 by6Var = this.d;
        Set set = by6Var.b;
        if (set != null) {
            return set;
        }
        Set setE = by6Var.e();
        by6Var.b = setE;
        return setE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        by6 by6Var = this.d;
        Collection collectionI = by6Var.i();
        collectionI.addAll(collection);
        by6Var.f -= collection.size();
        collection.clear();
        return collectionI;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        j2 j2Var = this.b;
        if (j2Var != null) {
            return j2Var;
        }
        j2 j2Var2 = new j2(this);
        this.b = j2Var2;
        return j2Var2;
    }
}
