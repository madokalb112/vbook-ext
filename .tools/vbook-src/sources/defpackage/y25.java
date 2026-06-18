package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y25 {
    public final String a;
    public final List b;
    public final int c;
    public final int d;
    public final String e;

    public y25(String str, ArrayList arrayList, int i, int i2, String str2) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y25)) {
            return false;
        }
        y25 y25Var = (y25) obj;
        return lc5.Q(this.a, y25Var.a) && lc5.Q(this.b, y25Var.b) && this.c == y25Var.c && this.d == y25Var.d && lc5.Q(this.e, y25Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        int iD = tw2.d(this.d, tw2.d(this.c, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
        String str = this.e;
        return iD + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageSourceImage(path=");
        sb.append(this.a);
        sb.append(", fallback=");
        sb.append(this.b);
        sb.append(", width=");
        ky0.u(this.c, this.d, ", height=", ", script=", sb);
        return ky0.s(this.e, ")", sb);
    }
}
