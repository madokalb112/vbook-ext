package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v07 {
    public final int a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final List f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public ArrayList j = null;

    public v07(int i, Integer num, Integer num2, String str, Integer num3, List list, Integer num4, Integer num5, Integer num6) {
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = str;
        this.e = num3;
        this.f = list;
        this.g = num4;
        this.h = num5;
        this.i = num6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v07)) {
            return false;
        }
        v07 v07Var = (v07) obj;
        return this.a == v07Var.a && lc5.Q(this.b, v07Var.b) && lc5.Q(this.c, v07Var.c) && this.d.equals(v07Var.d) && lc5.Q(this.e, v07Var.e) && lc5.Q(this.f, v07Var.f) && lc5.Q(this.g, v07Var.g) && lc5.Q(this.h, v07Var.h) && lc5.Q(this.i, v07Var.i) && lc5.Q(this.j, v07Var.j);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iA = j39.a((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.d);
        Integer num3 = this.e;
        int iHashCode3 = (iA + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list = this.f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.g;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.h;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.i;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        ArrayList arrayList = this.j;
        return iHashCode7 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "NCX(index=" + this.a + ", offset=" + this.b + ", size=" + this.c + ", label=" + this.d + ", headingLevel=" + this.e + ", pos=" + this.f + ", parent=" + this.g + ", firstChild=" + this.h + ", lastChild=" + this.i + ", children=" + this.j + ")";
    }
}
