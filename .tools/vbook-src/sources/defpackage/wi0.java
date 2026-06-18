package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wi0 {
    public final a82 a;
    public final List b;
    public final Map c;
    public final Map d;
    public final String e;
    public final String f;
    public final String g;
    public final byte[] h;

    public wi0(a82 a82Var, List list, HashMap map, HashMap map2, String str, String str2, String str3, byte[] bArr) {
        list.getClass();
        map.getClass();
        map2.getClass();
        this.a = a82Var;
        this.b = list;
        this.c = map;
        this.d = map2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = bArr;
    }

    public final Map a() {
        return this.c;
    }

    public final List b() {
        return this.b;
    }

    public final String c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi0)) {
            return false;
        }
        wi0 wi0Var = (wi0) obj;
        return this.a.equals(wi0Var.a) && lc5.Q(this.b, wi0Var.b) && lc5.Q(this.c, wi0Var.c) && lc5.Q(this.d, wi0Var.d) && this.e.equals(wi0Var.e) && this.f.equals(wi0Var.f) && this.g.equals(wi0Var.g) && lc5.Q(this.h, wi0Var.h);
    }

    public final int hashCode() {
        int iA = j39.a(j39.a(j39.a(j39.b(j39.b(j39.d(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        byte[] bArr = this.h;
        return iA + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    public final String toString() {
        String string = Arrays.toString(this.h);
        StringBuilder sb = new StringBuilder("ExportContext(book=");
        sb.append(this.a);
        sb.append(", chapters=");
        sb.append(this.b);
        sb.append(", chapterTitles=");
        sb.append(this.c);
        sb.append(", chapterContents=");
        sb.append(this.d);
        sb.append(", fileBaseName=");
        j39.y(sb, this.e, ", exportName=", this.f, ", exportAuthor=");
        return tw2.s(sb, this.g, ", customCoverBytes=", string, ")");
    }
}
