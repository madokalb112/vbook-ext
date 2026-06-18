package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class by6 extends k2 implements Serializable {
    public final transient Map e;
    public transient int f;
    public transient ay6 s;

    public by6(Map map) {
        fx1.G(map.isEmpty());
        this.e = map;
    }

    @Override // defpackage.k2
    public final void b() {
        Map map = this.e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f = 0;
    }

    @Override // defpackage.k2
    public final Map c() {
        Map map = this.e;
        return map instanceof NavigableMap ? new x1(this, (NavigableMap) map) : map instanceof SortedMap ? new a2(this, (SortedMap) map) : new v1(this, map);
    }

    @Override // defpackage.k2
    public final Collection d() {
        return new j2(this, 0);
    }

    @Override // defpackage.k2
    public final Set e() {
        Map map = this.e;
        return map instanceof NavigableMap ? new y1(this, (NavigableMap) map) : map instanceof SortedMap ? new b2(this, (SortedMap) map) : new w1(this, map);
    }

    @Override // defpackage.k2
    public final Iterator f() {
        return new s1(this, 1);
    }

    @Override // defpackage.k2
    public final int h() {
        return this.f;
    }

    public final Collection i() {
        return (List) this.s.get();
    }

    public final boolean j(Object obj, Object obj2) {
        Map map = this.e;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f++;
            return true;
        }
        Collection collectionI = i();
        if (!collectionI.add(obj2)) {
            gp.i("New Collection violated the Collection spec");
            return false;
        }
        this.f++;
        map.put(obj, collectionI);
        return true;
    }
}
