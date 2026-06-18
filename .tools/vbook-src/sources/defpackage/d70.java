package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d70 extends pz1 {
    public final e70 a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final oz1 e;
    public final List f;
    public final int g;

    public d70(e70 e70Var, List list, List list2, Boolean bool, oz1 oz1Var, List list3, int i) {
        this.a = e70Var;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = oz1Var;
        this.f = list3;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pz1)) {
            return false;
        }
        d70 d70Var = (d70) ((pz1) obj);
        if (!this.a.equals(d70Var.a)) {
            return false;
        }
        List list = d70Var.b;
        List list2 = this.b;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        List list3 = d70Var.c;
        List list4 = this.c;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        Boolean bool = d70Var.d;
        Boolean bool2 = this.d;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        oz1 oz1Var = d70Var.e;
        oz1 oz1Var2 = this.e;
        if (oz1Var2 == null) {
            if (oz1Var != null) {
                return false;
            }
        } else if (!oz1Var2.equals(oz1Var)) {
            return false;
        }
        List list5 = d70Var.f;
        List list6 = this.f;
        if (list6 == null) {
            if (list5 != null) {
                return false;
            }
        } else if (!list6.equals(list5)) {
            return false;
        }
        return this.g == d70Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        oz1 oz1Var = this.e;
        int iHashCode5 = (iHashCode4 ^ (oz1Var == null ? 0 : oz1Var.hashCode())) * 1000003;
        List list3 = this.f;
        return this.g ^ ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return tw2.q(sb, this.g, "}");
    }
}
