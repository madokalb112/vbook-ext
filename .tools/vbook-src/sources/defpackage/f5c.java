package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f5c {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final String e;

    public f5c(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = str2;
    }

    public static f5c a(f5c f5cVar, boolean z, boolean z2, String str, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = f5cVar.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = f5cVar.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            str = f5cVar.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z3 = f5cVar.d;
        }
        String str3 = f5cVar.e;
        f5cVar.getClass();
        return new f5c(str2, str3, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5c)) {
            return false;
        }
        f5c f5cVar = (f5c) obj;
        return this.a == f5cVar.a && this.b == f5cVar.b && this.c.equals(f5cVar.c) && this.d == f5cVar.d && this.e.equals(f5cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.c(j39.a(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("ZipState(isLoading=", this.a, ", isImporting=", this.b, ", bookName=");
        j39.z(sbR, this.c, ", isError=", this.d, ", errorMessage=");
        return ky0.s(this.e, ")", sbR);
    }
}
