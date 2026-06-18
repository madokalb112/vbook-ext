package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w1b {
    public final b2b a;
    public final String b;
    public final String c;
    public final Map d;
    public final String e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;

    public w1b(b2b b2bVar, String str, String str2, Map map, String str3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        str.getClass();
        str2.getClass();
        map.getClass();
        str3.getClass();
        this.a = b2bVar;
        this.b = str;
        this.c = str2;
        this.d = map;
        this.e = str3;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1b)) {
            return false;
        }
        w1b w1bVar = (w1b) obj;
        return this.a == w1bVar.a && lc5.Q(this.b, w1bVar.b) && lc5.Q(this.c, w1bVar.c) && lc5.Q(this.d, w1bVar.d) && lc5.Q(this.e, w1bVar.e) && this.f.equals(w1bVar.f) && this.g.equals(w1bVar.g) && this.h.equals(w1bVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + j39.a(j39.b(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31);
    }

    public final String toString() {
        return "TrackContent(kind=" + this.a + ", data=" + this.b + ", mimeType=" + this.c + ", headers=" + this.d + ", host=" + this.e + ", timeSkip=" + this.f + ", audios=" + this.g + ", subtitles=" + this.h + ")";
    }
}
