package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qrb {
    public final String a;
    public final Map b;
    public final String c;
    public final String d;
    public final String e;

    public qrb(String str, Map map, String str2, String str3, String str4) {
        str.getClass();
        map.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrb)) {
            return false;
        }
        qrb qrbVar = (qrb) obj;
        return lc5.Q(this.a, qrbVar.a) && lc5.Q(this.b, qrbVar.b) && lc5.Q(this.c, qrbVar.c) && lc5.Q(this.d, qrbVar.d) && lc5.Q(this.e, qrbVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.a(j39.a(j39.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSourceTrackAudio(data=");
        sb.append(this.a);
        sb.append(", headers=");
        sb.append(this.b);
        sb.append(", type=");
        j39.y(sb, this.c, ", label=", this.d, ", language=");
        return ky0.s(this.e, ")", sb);
    }
}
