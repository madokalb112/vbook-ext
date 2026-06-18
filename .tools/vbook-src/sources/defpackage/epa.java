package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class epa {
    public final String a;
    public final Map b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final List h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ epa(String str, String str2, String str3, String str4, List list, int i) {
        String str5 = (i & 1) != 0 ? "" : str;
        String str6 = (i & 4) != 0 ? "" : str2;
        String str7 = (i & 8) != 0 ? "" : str3;
        String str8 = (i & 16) != 0 ? "" : str4;
        int i2 = i & Token.CASE;
        lc3 lc3Var = lc3.a;
        this(str5, str6, str7, str8, lc3Var, lc3Var, i2 != 0 ? lc3Var : list, mc3.a);
    }

    public static epa a(epa epaVar, LinkedHashMap linkedHashMap, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, int i) {
        String str4 = epaVar.a;
        Map map = linkedHashMap;
        if ((i & 2) != 0) {
            map = epaVar.b;
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            str = epaVar.c;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = epaVar.d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = epaVar.e;
        }
        String str7 = str3;
        List list = arrayList;
        if ((i & 32) != 0) {
            list = epaVar.f;
        }
        List list2 = list;
        List list3 = arrayList2;
        if ((i & 64) != 0) {
            list3 = epaVar.g;
        }
        List list4 = list3;
        List list5 = epaVar.h;
        epaVar.getClass();
        str4.getClass();
        map2.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        list2.getClass();
        list4.getClass();
        list5.getClass();
        return new epa(str4, str5, str6, str7, list2, list4, list5, map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epa)) {
            return false;
        }
        epa epaVar = (epa) obj;
        return lc5.Q(this.a, epaVar.a) && lc5.Q(this.b, epaVar.b) && lc5.Q(this.c, epaVar.c) && lc5.Q(this.d, epaVar.d) && lc5.Q(this.e, epaVar.e) && lc5.Q(this.f, epaVar.f) && lc5.Q(this.g, epaVar.g) && lc5.Q(this.h, epaVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + j39.d(j39.d(j39.a(j39.a(j39.a(j39.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextTranslateState(word=");
        sb.append(this.a);
        sb.append(", translate=");
        sb.append(this.b);
        sb.append(", translateId=");
        j39.y(sb, this.c, ", fromLanguage=", this.d, ", toLanguage=");
        sb.append(this.e);
        sb.append(", fromLanguages=");
        sb.append(this.f);
        sb.append(", toLanguages=");
        sb.append(this.g);
        sb.append(", translateEngines=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public epa(String str, String str2, String str3, String str4, List list, List list2, List list3, Map map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list3.getClass();
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = list2;
        this.h = list3;
    }
}
