package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c4b {
    public final boolean a;
    public final Map b;
    public final Map c;

    public c4b(boolean z, Map map, Map map2) {
        map.getClass();
        map2.getClass();
        this.a = z;
        this.b = map;
        this.c = map2;
    }

    public final Map a(String str) {
        Map map = (Map) this.b.get(str);
        return map == null ? mc3.a : map;
    }
}
