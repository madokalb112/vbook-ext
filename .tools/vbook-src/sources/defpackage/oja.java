package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oja {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final Map f;
    public final List g;
    public final List h;
    public final List i;
    public final boolean j;
    public final boolean k;

    public oja(String str, String str2, int i, int i2, String str3, Map map, List list, List list2, List list3, boolean z, boolean z2) {
        str.getClass();
        str3.getClass();
        map.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = map;
        this.g = list;
        this.h = list2;
        this.i = list3;
        this.j = z;
        this.k = z2;
    }

    public static oja a(oja ojaVar, String str, int i, int i2, String str2, LinkedHashMap linkedHashMap, List list, boolean z, boolean z2, int i3) {
        String str3 = ojaVar.a;
        if ((i3 & 2) != 0) {
            str = ojaVar.b;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            i = ojaVar.c;
        }
        int i4 = i;
        int i5 = (i3 & 8) != 0 ? ojaVar.d : i2;
        String str5 = (i3 & 16) != 0 ? ojaVar.e : str2;
        Map map = (i3 & 32) != 0 ? ojaVar.f : linkedHashMap;
        List list2 = (i3 & 64) != 0 ? ojaVar.g : list;
        List list3 = ojaVar.h;
        List list4 = ojaVar.i;
        boolean z3 = (i3 & 512) != 0 ? ojaVar.j : z;
        boolean z4 = (i3 & 1024) != 0 ? ojaVar.k : z2;
        ojaVar.getClass();
        str3.getClass();
        str5.getClass();
        map.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        return new oja(str3, str4, i4, i5, str5, map, list2, list3, list4, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oja)) {
            return false;
        }
        oja ojaVar = (oja) obj;
        return lc5.Q(this.a, ojaVar.a) && lc5.Q(this.b, ojaVar.b) && this.c == ojaVar.c && this.d == ojaVar.d && lc5.Q(this.e, ojaVar.e) && lc5.Q(this.f, ojaVar.f) && lc5.Q(this.g, ojaVar.g) && lc5.Q(this.h, ojaVar.h) && lc5.Q(this.i, ojaVar.i) && this.j == ojaVar.j && this.k == ojaVar.k;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.k) + j39.c(j39.d(j39.d(j39.d(j39.b(j39.a(tw2.d(this.d, tw2.d(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.e), 31, this.f), this.g, 31), this.h, 31), this.i, 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("TextQtTranslateState(sentence=", this.a, ", translate=", this.b, ", selectionStart=");
        ky0.u(this.c, this.d, ", selectionEnd=", ", translateType=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", translateSentence=");
        sbQ.append(this.f);
        sbQ.append(", translateSuggests=");
        sbQ.append(this.g);
        sbQ.append(", translateLookups=");
        sbQ.append(this.h);
        sbQ.append(", translateEngines=");
        sbQ.append(this.i);
        sbQ.append(", isNameSavePriority=");
        sbQ.append(this.j);
        sbQ.append(", isPrivSavePriority=");
        return xv5.q(")", sbQ, this.k);
    }
}
