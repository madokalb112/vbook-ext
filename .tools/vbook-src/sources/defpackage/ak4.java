package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ak4 {
    public final String a;
    public final List b;
    public final double c;

    public ak4(String str, List list) {
        Double d;
        Object next;
        String str2;
        Double dW;
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        Iterator it = list.iterator();
        while (true) {
            d = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (lc5.Q(((bk4) next).a, "q")) {
                    break;
                }
            }
        }
        bk4 bk4Var = (bk4) next;
        double dDoubleValue = 1.0d;
        if (bk4Var != null && (str2 = bk4Var.b) != null && (dW = hw9.w(str2)) != null) {
            double dDoubleValue2 = dW.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d = dW;
            }
            if (d != null) {
                dDoubleValue = d.doubleValue();
            }
        }
        this.c = dDoubleValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak4)) {
            return false;
        }
        ak4 ak4Var = (ak4) obj;
        return lc5.Q(this.a, ak4Var.a) && lc5.Q(this.b, ak4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.a + ", params=" + this.b + ')';
    }
}
