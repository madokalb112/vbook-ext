package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h80 {
    public final String a;
    public final String b;
    public final String c;
    public final a90 d;
    public final int e;

    public h80(String str, String str2, String str3, a90 a90Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = a90Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h80)) {
            return false;
        }
        h80 h80Var = (h80) obj;
        String str = h80Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = h80Var.b;
        String str4 = this.b;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = h80Var.c;
        String str6 = this.c;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        a90 a90Var = h80Var.d;
        a90 a90Var2 = this.d;
        if (a90Var2 == null) {
            if (a90Var != null) {
                return false;
            }
        } else if (!a90Var2.equals(a90Var)) {
            return false;
        }
        int i = h80Var.e;
        int i2 = this.e;
        return i2 == 0 ? i == 0 : dx1.a(i2, i);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        a90 a90Var = this.d;
        int iHashCode4 = (iHashCode3 ^ (a90Var == null ? 0 : a90Var.hashCode())) * 1000003;
        int i = this.e;
        return iHashCode4 ^ (i != 0 ? dx1.C(i) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i = this.e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
