package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vy2 {
    public final String a;
    public final wy2 b;
    public final Map c;
    public final List d;

    public vy2(String str, wy2 wy2Var, Map map, List list) {
        wy2Var.getClass();
        map.getClass();
        list.getClass();
        this.a = str;
        this.b = wy2Var;
        this.c = map;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy2)) {
            return false;
        }
        vy2 vy2Var = (vy2) obj;
        return this.a.equals(vy2Var.a) && lc5.Q(this.b, vy2Var.b) && lc5.Q(this.c, vy2Var.c) && lc5.Q(this.d, vy2Var.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + j39.d(j39.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), this.d, 31);
    }

    public final String toString() {
        return "DocxHtmlDocument(html=" + this.a + ", metadata=" + this.b + ", images=" + this.c + ", toc=" + this.d + ", embeddedImages=false)";
    }
}
