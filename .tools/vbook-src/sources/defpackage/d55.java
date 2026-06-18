package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class d55 implements Map, Serializable {
    public transient jh8 a;
    public transient kh8 b;
    public transient lh8 c;

    public static c55 a() {
        return new c55(4);
    }

    public static d55 c(Map map) {
        if ((map instanceof d55) && !(map instanceof SortedMap)) {
            return (d55) map;
        }
        Set setEntrySet = map.entrySet();
        c55 c55Var = new c55(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        c55Var.c(setEntrySet);
        return c55Var.a(true);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final f55 entrySet() {
        jh8 jh8Var = this.a;
        if (jh8Var != null) {
            return jh8Var;
        }
        mh8 mh8Var = (mh8) this;
        jh8 jh8Var2 = new jh8(mh8Var, mh8Var.e, mh8Var.f);
        this.a = jh8Var2;
        return jh8Var2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final f55 keySet() {
        kh8 kh8Var = this.b;
        if (kh8Var != null) {
            return kh8Var;
        }
        mh8 mh8Var = (mh8) this;
        kh8 kh8Var2 = new kh8(mh8Var, new lh8(mh8Var.e, 0, mh8Var.f));
        this.b = kh8Var2;
        return kh8Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return tu1.E(obj, this);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final s45 values() {
        lh8 lh8Var = this.c;
        if (lh8Var != null) {
            return lh8Var;
        }
        mh8 mh8Var = (mh8) this;
        lh8 lh8Var2 = new lh8(mh8Var.e, 1, mh8Var.f);
        this.c = lh8Var2;
        return lh8Var2;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return ny1.M(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((mh8) this).size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i = ((mh8) this).f;
        t1c.N(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        reb it = ((jh8) entrySet()).iterator();
        boolean z = true;
        while (true) {
            w45 w45Var = (w45) it;
            if (!w45Var.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) w45Var.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }
}
