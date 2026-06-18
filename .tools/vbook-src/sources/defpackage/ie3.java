package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ie3 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;

    public ie3(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                this.b = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                this.b = new LinkedHashMap();
                break;
        }
    }

    public void a(a91 a91Var, kb4 kb4Var, kb4 kb4Var2, rj1 rj1Var) {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(a91Var)) {
            sy3.n("An `entry` with the same `clazz` has already been added: ", a91Var.g(), 46);
        } else {
            linkedHashMap.put(a91Var, new he3(a91Var, kb4Var, kb4Var2, rj1Var));
        }
    }
}
