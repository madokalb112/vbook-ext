package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class a2 extends v1 implements SortedMap {
    public SortedSet e;
    public final /* synthetic */ by6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(by6 by6Var, SortedMap sortedMap) {
        super(by6Var, sortedMap);
        this.f = by6Var;
    }

    public SortedSet c() {
        return new b2(this.f, e());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override // defpackage.v1, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetC = c();
        this.e = sortedSetC;
        return sortedSetC;
    }

    public SortedMap e() {
        return (SortedMap) this.c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return e().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new a2(this.f, e().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return e().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new a2(this.f, e().subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new a2(this.f, e().tailMap(obj));
    }
}
