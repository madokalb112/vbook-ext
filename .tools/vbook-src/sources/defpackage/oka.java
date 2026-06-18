package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oka {
    public final String a;
    public final String b;
    public final Map c;
    public final boolean d;
    public final boolean e;

    public oka(String str, String str2, Map map, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oka)) {
            return false;
        }
        oka okaVar = (oka) obj;
        return this.a.equals(okaVar.a) && this.b.equals(okaVar.b) && this.c.equals(okaVar.c) && this.d == okaVar.d && this.e == okaVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j39.c(j39.b(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("TextSourceInfo(name=", this.a, ", sourceId=", this.b, ", translateConfig=");
        sbQ.append(this.c);
        sbQ.append(", isSupportDownload=");
        sbQ.append(this.d);
        sbQ.append(", isSupportCheckNewChapter=");
        return xv5.q(")", sbQ, this.e);
    }
}
