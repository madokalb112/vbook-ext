package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rrb {
    public final String a;
    public final String b;
    public final String c;
    public final Map d;
    public final String e;
    public final List f;
    public final List g;
    public final List h;

    public rrb(String str, String str2, String str3, String str4, List list, List list2, List list3, Map map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
        this.e = str4;
        this.f = list;
        this.g = list2;
        this.h = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrb)) {
            return false;
        }
        rrb rrbVar = (rrb) obj;
        return lc5.Q(this.a, rrbVar.a) && lc5.Q(this.b, rrbVar.b) && lc5.Q(this.c, rrbVar.c) && lc5.Q(this.d, rrbVar.d) && lc5.Q(this.e, rrbVar.e) && lc5.Q(this.f, rrbVar.f) && lc5.Q(this.g, rrbVar.g) && lc5.Q(this.h, rrbVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + j39.d(j39.d(j39.a(j39.b(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("VideoSourceTrackContent(kind=", this.a, ", data=", this.b, ", mimeType=");
        sbQ.append(this.c);
        sbQ.append(", headers=");
        sbQ.append(this.d);
        sbQ.append(", host=");
        sbQ.append(this.e);
        sbQ.append(", timeSkip=");
        sbQ.append(this.f);
        sbQ.append(", audios=");
        sbQ.append(this.g);
        sbQ.append(", subtitles=");
        sbQ.append(this.h);
        sbQ.append(")");
        return sbQ.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rrb(String str, String str2, String str3, Map map, String str4, int i) {
        Map map2 = (i & 8) != 0 ? mc3.a : map;
        str4 = (i & 16) != 0 ? "" : str4;
        lc3 lc3Var = lc3.a;
        this(str, str2, str3, str4, lc3Var, lc3Var, lc3Var, map2);
    }
}
