package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n60 extends zz1 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final yz1 k;
    public final ez1 l;
    public final bz1 m;

    public n60(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, yz1 yz1Var, ez1 ez1Var, bz1 bz1Var) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = yz1Var;
        this.l = ez1Var;
        this.m = bz1Var;
    }

    public final m60 a() {
        m60 m60Var = new m60();
        m60Var.a = this.b;
        m60Var.b = this.c;
        m60Var.c = this.d;
        m60Var.d = this.e;
        m60Var.e = this.f;
        m60Var.f = this.g;
        m60Var.g = this.h;
        m60Var.h = this.i;
        m60Var.i = this.j;
        m60Var.j = this.k;
        m60Var.k = this.l;
        m60Var.l = this.m;
        m60Var.m = (byte) 1;
        return m60Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zz1) {
            n60 n60Var = (n60) ((zz1) obj);
            if (this.b.equals(n60Var.b) && this.c.equals(n60Var.c) && this.d == n60Var.d && this.e.equals(n60Var.e)) {
                String str = n60Var.f;
                String str2 = this.f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = n60Var.g;
                    String str4 = this.g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = n60Var.h;
                        String str6 = this.h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.i.equals(n60Var.i) && this.j.equals(n60Var.j)) {
                                yz1 yz1Var = n60Var.k;
                                yz1 yz1Var2 = this.k;
                                if (yz1Var2 != null ? yz1Var2.equals(yz1Var) : yz1Var == null) {
                                    ez1 ez1Var = n60Var.l;
                                    ez1 ez1Var2 = this.l;
                                    if (ez1Var2 != null ? ez1Var2.equals(ez1Var) : ez1Var == null) {
                                        bz1 bz1Var = n60Var.m;
                                        bz1 bz1Var2 = this.m;
                                        if (bz1Var2 != null ? bz1Var2.equals(bz1Var) : bz1Var == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        yz1 yz1Var = this.k;
        int iHashCode5 = (iHashCode4 ^ (yz1Var == null ? 0 : yz1Var.hashCode())) * 1000003;
        ez1 ez1Var = this.l;
        int iHashCode6 = (iHashCode5 ^ (ez1Var == null ? 0 : ez1Var.hashCode())) * 1000003;
        bz1 bz1Var = this.m;
        return iHashCode6 ^ (bz1Var != null ? bz1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
