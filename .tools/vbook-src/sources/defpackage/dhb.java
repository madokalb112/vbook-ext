package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dhb {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final boolean e;

    public dhb(String str, String str2, String str3, List list, boolean z) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = z;
    }

    public static dhb a(dhb dhbVar, String str, String str2, String str3, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            str = dhbVar.a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = dhbVar.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = dhbVar.c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            list = dhbVar.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = dhbVar.e;
        }
        dhbVar.getClass();
        list2.getClass();
        return new dhb(str4, str5, str6, list2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhb)) {
            return false;
        }
        dhb dhbVar = (dhb) obj;
        return this.a.equals(dhbVar.a) && this.b.equals(dhbVar.b) && this.c.equals(dhbVar.c) && lc5.Q(this.d, dhbVar.d) && this.e == dhbVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j39.d(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("UserDetailState(userName=", this.a, ", email=", this.b, ", avatar=");
        sbQ.append(this.c);
        sbQ.append(", colors=");
        sbQ.append(this.d);
        sbQ.append(", isLoading=");
        return xv5.q(")", sbQ, this.e);
    }
}
