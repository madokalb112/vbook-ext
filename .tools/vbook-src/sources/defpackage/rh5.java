package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class rh5 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final String a(a91 a91Var) {
        a91Var.getClass();
        ConcurrentHashMap concurrentHashMap = a;
        String str = (String) concurrentHashMap.get(a91Var);
        if (str != null) {
            return str;
        }
        String name = tu1.M(a91Var).getName();
        concurrentHashMap.put(a91Var, name);
        return name;
    }
}
