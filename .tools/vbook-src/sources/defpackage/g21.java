package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g21 {
    public final int a;
    public final String b;
    public final ArrayList c;

    public g21(int i, String str, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g21)) {
            return false;
        }
        g21 g21Var = (g21) obj;
        return this.a == g21Var.a && this.c.size() == g21Var.c.size();
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.a * 31);
    }

    public final String toString() {
        StringBuilder sbP = j39.p("ChapterSearchContent(chapterIndex=", ", chapterName=", this.b, ", searchContents=", this.a);
        sbP.append(this.c);
        sbP.append(")");
        return sbP.toString();
    }
}
