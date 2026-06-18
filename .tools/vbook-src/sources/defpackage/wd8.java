package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wd8 {
    public final boolean a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;

    public wd8(boolean z, String str, String str2, int i, int i2, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = z2;
    }

    public static wd8 a(wd8 wd8Var, boolean z, String str, String str2, int i, int i2, boolean z2, int i3) {
        if ((i3 & 2) != 0) {
            str = wd8Var.b;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            str2 = wd8Var.c;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            i = wd8Var.d;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = wd8Var.e;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            z2 = wd8Var.f;
        }
        wd8Var.getClass();
        str3.getClass();
        return new wd8(z, str3, str4, i4, i5, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd8)) {
            return false;
        }
        wd8 wd8Var = (wd8) obj;
        return this.a == wd8Var.a && this.b.equals(wd8Var.b) && this.c.equals(wd8Var.c) && this.d == wd8Var.d && this.e == wd8Var.e && this.f == wd8Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + tw2.d(this.e, tw2.d(this.d, j39.a(j39.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReaderState(isLoading=");
        sb.append(this.a);
        sb.append(", bookId=");
        sb.append(this.b);
        sb.append(", bookName=");
        dx1.t(this.d, this.c, ", bookType=", ", bookFormat=", sb);
        sb.append(this.e);
        sb.append(", isError=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
