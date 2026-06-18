package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ps4 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public kb4 d = new xl4(13);
    public boolean e = true;
    public boolean f = true;

    public ps4() {
        int i = cv7.a;
    }

    public final void a(at4 at4Var, kb4 kb4Var) {
        at4Var.getClass();
        j00 key = at4Var.getKey();
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.put(at4Var.getKey(), new sl1((kb4) linkedHashMap.get(key), kb4Var, 1));
        j00 key2 = at4Var.getKey();
        LinkedHashMap linkedHashMap2 = this.a;
        if (linkedHashMap2.containsKey(key2)) {
            return;
        }
        linkedHashMap2.put(at4Var.getKey(), new rx2(at4Var, 19));
    }
}
