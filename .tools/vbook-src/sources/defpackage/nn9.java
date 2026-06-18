package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nn9 {
    public final String a;
    public final String b;
    public final String c;
    public final LinkedHashMap d;
    public final String e;
    public final ArrayList f;
    public final List g;
    public final List h;

    public nn9(String str, String str2, String str3, LinkedHashMap linkedHashMap, String str4, ArrayList arrayList, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = linkedHashMap;
        this.e = str4;
        this.f = arrayList;
        this.g = list;
        this.h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn9)) {
            return false;
        }
        nn9 nn9Var = (nn9) obj;
        return lc5.Q(this.a, nn9Var.a) && lc5.Q(this.b, nn9Var.b) && lc5.Q(this.c, nn9Var.c) && this.d.equals(nn9Var.d) && this.e.equals(nn9Var.e) && this.f.equals(nn9Var.f) && lc5.Q(this.g, nn9Var.g) && lc5.Q(this.h, nn9Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + j39.d((this.f.hashCode() + j39.a((this.d.hashCode() + j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e)) * 31, this.g, 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SourceTrackContent(kind=", this.a, ", mimeType=", this.b, ", data=");
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
}
