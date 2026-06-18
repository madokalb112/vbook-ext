package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class c4a {
    public static final b4a Companion = new b4a();
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final long f;

    public /* synthetic */ c4a(int i, String str, String str2, int i2, String str3, int i3, long j) {
        if (63 != (i & 63)) {
            qu1.w0(i, 63, a4a.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = str3;
        this.e = i3;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4a)) {
            return false;
        }
        c4a c4aVar = (c4a) obj;
        return lc5.Q(this.a, c4aVar.a) && lc5.Q(this.b, c4aVar.b) && this.c == c4aVar.c && lc5.Q(this.d, c4aVar.d) && this.e == c4aVar.e && this.f == c4aVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + tw2.d(this.e, j39.a(tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SyncInfo(deviceId=", this.a, ", deviceName=", this.b, ", deviceType=");
        ky0.w(this.c, ", appVersion=", this.d, ", backupVersion=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", createAt=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }

    public c4a(long j, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = 0;
        this.d = str3;
        this.e = 1;
        this.f = j;
    }
}
