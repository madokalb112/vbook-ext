package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class xhb {
    public static final whb Companion = new whb();
    public final mhb a;
    public final String b;
    public final String c;

    public /* synthetic */ xhb(int i, mhb mhbVar, String str, String str2) {
        this.a = (i & 1) == 0 ? new mhb() : mhbVar;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhb)) {
            return false;
        }
        xhb xhbVar = (xhb) obj;
        return lc5.Q(this.a, xhbVar.a) && lc5.Q(this.b, xhbVar.b) && lc5.Q(this.c, xhbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserLoginDto(user=");
        sb.append(this.a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        return ky0.s(this.c, ")", sb);
    }
}
