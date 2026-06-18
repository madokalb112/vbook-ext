package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class thb {
    public final boolean a;
    public final boolean b;
    public final List c;

    public thb(boolean z, boolean z2, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
    }

    public static thb a(thb thbVar, List list) {
        boolean z = thbVar.a;
        boolean z2 = thbVar.b;
        thbVar.getClass();
        return new thb(z, z2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thb)) {
            return false;
        }
        thb thbVar = (thb) obj;
        return this.a == thbVar.a && this.b == thbVar.b && lc5.Q(this.c, thbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.c(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return tw2.t(j39.r("UserListState(isLoading=", this.a, ", hasMore=", this.b, ", users="), this.c, ")");
    }
}
