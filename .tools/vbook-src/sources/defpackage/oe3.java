package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oe3 {
    public final byte[] a;
    public final String b;
    public final String c;

    public oe3(String str, String str2, byte[] bArr) {
        str.getClass();
        str2.getClass();
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public final byte[] a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe3)) {
            return false;
        }
        oe3 oe3Var = (oe3) obj;
        return this.a.equals(oe3Var.a) && lc5.Q(this.b, oe3Var.b) && lc5.Q(this.c, oe3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.a(Arrays.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return ky0.s(this.c, ")", j39.q("CoverInfo(bytes=", Arrays.toString(this.a), ", extension=", this.b, ", mediaType="));
    }
}
