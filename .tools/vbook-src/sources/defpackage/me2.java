package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class me2 {
    public final ke2 a;
    public final String b;
    public final ngb c;

    public me2(ke2 ke2Var, String str) {
        this.a = ke2Var;
        this.b = str;
        this.c = ql9.p(str);
    }

    public final Map a() {
        pm7 pm7Var = this.c.c;
        pm7Var.getClass();
        Set<Map.Entry> setB = pm7Var.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setB) {
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(gc1.M(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(new xl7(entry.getKey(), (String) it.next()));
            }
            fc1.p0(arrayList, arrayList2);
        }
        return y86.h0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me2)) {
            return false;
        }
        me2 me2Var = (me2) obj;
        return this.a == me2Var.a && this.b.equals(me2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((le2.a.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Deeplink(action=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(le2.a);
        sb.append(", data=");
        return ky0.s(this.b, ")", sb);
    }
}
