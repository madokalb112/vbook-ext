package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w60 extends yz1 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final gz1 g;
    public final xz1 h;
    public final wz1 i;
    public final hz1 j;
    public final List k;
    public final int l;

    public w60(String str, String str2, String str3, long j, Long l, boolean z, gz1 gz1Var, xz1 xz1Var, wz1 wz1Var, hz1 hz1Var, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = gz1Var;
        this.h = xz1Var;
        this.i = wz1Var;
        this.j = hz1Var;
        this.k = list;
        this.l = i;
    }

    @Override // defpackage.yz1
    public final v60 a() {
        v60 v60Var = new v60();
        v60Var.a = this.a;
        v60Var.b = this.b;
        v60Var.c = this.c;
        v60Var.d = this.d;
        v60Var.e = this.e;
        v60Var.f = this.f;
        v60Var.g = this.g;
        v60Var.h = this.h;
        v60Var.i = this.i;
        v60Var.j = this.j;
        v60Var.k = this.k;
        v60Var.l = this.l;
        v60Var.m = (byte) 7;
        return v60Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yz1) {
            w60 w60Var = (w60) ((yz1) obj);
            if (this.a.equals(w60Var.a) && this.b.equals(w60Var.b)) {
                String str = w60Var.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == w60Var.d) {
                        Long l = w60Var.e;
                        Long l2 = this.e;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f == w60Var.f && this.g.equals(w60Var.g)) {
                                xz1 xz1Var = w60Var.h;
                                xz1 xz1Var2 = this.h;
                                if (xz1Var2 != null ? xz1Var2.equals(xz1Var) : xz1Var == null) {
                                    wz1 wz1Var = w60Var.i;
                                    wz1 wz1Var2 = this.i;
                                    if (wz1Var2 != null ? wz1Var2.equals(wz1Var) : wz1Var == null) {
                                        hz1 hz1Var = w60Var.j;
                                        hz1 hz1Var2 = this.j;
                                        if (hz1Var2 != null ? hz1Var2.equals(hz1Var) : hz1Var == null) {
                                            List list = w60Var.k;
                                            List list2 = this.k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.l == w60Var.l) {
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
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        xz1 xz1Var = this.h;
        int iHashCode4 = (iHashCode3 ^ (xz1Var == null ? 0 : xz1Var.hashCode())) * 1000003;
        wz1 wz1Var = this.i;
        int iHashCode5 = (iHashCode4 ^ (wz1Var == null ? 0 : wz1Var.hashCode())) * 1000003;
        hz1 hz1Var = this.j;
        int iHashCode6 = (iHashCode5 ^ (hz1Var == null ? 0 : hz1Var.hashCode())) * 1000003;
        List list = this.k;
        return this.l ^ ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return tw2.q(sb, this.l, "}");
    }
}
