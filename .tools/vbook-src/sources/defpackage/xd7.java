package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class xd7 {
    public static final wd7 Companion = new wd7();
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final float f;
    public final long g;

    public /* synthetic */ xd7(int i, long j, String str, String str2, String str3, int i2, float f, long j2) {
        if ((i & 1) == 0) {
            this.a = 0L;
        } else {
            this.a = j;
        }
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
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i2;
        }
        if ((i & 32) == 0) {
            this.f = 0.0f;
        } else {
            this.f = f;
        }
        if ((i & 64) == 0) {
            this.g = 0L;
        } else {
            this.g = j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd7)) {
            return false;
        }
        xd7 xd7Var = (xd7) obj;
        return this.a == xd7Var.a && lc5.Q(this.b, xd7Var.b) && lc5.Q(this.c, xd7Var.c) && lc5.Q(this.d, xd7Var.d) && this.e == xd7Var.e && Float.compare(this.f, xd7Var.f) == 0 && this.g == xd7Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + tw2.c(this.f, tw2.d(this.e, j39.a(j39.a(j39.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OldSyncNote(id=");
        sb.append(this.a);
        sb.append(", bookId=");
        sb.append(this.b);
        j39.y(sb, ", content=", this.c, ", title=", this.d);
        sb.append(", chapIndex=");
        sb.append(this.e);
        sb.append(", position=");
        sb.append(this.f);
        return dx1.l(sb, ", timestamp=", this.g, ")");
    }
}
