package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class rm7 {
    public final List a;
    public int b;

    public rm7(int i, ArrayList arrayList) {
        this.a = (i & 1) != 0 ? new ArrayList() : arrayList;
    }

    public Object a(a91 a91Var) {
        Object next;
        a91Var.getClass();
        List list = this.a;
        if (list.isEmpty()) {
            return null;
        }
        Object obj = list.get(this.b);
        if (!a91Var.h(obj)) {
            obj = null;
        }
        if (obj == null) {
            obj = null;
        }
        if (obj != null && this.b < gc1.S(list)) {
            this.b++;
        }
        if (obj != null) {
            return obj;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (a91Var.h(next)) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        return next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rm7) {
            return lc5.Q(this.a, ((rm7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + fc1.Z0(this.a);
    }
}
