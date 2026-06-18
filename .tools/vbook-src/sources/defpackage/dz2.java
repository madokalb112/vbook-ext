package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class dz2 {
    public static final cz2 Companion = new cz2();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ dz2(int i, String str, String str2, boolean z) {
        if (7 != (i & 7)) {
            qu1.w0(i, 7, bz2.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz2)) {
            return false;
        }
        dz2 dz2Var = (dz2) obj;
        return lc5.Q(this.a, dz2Var.a) && lc5.Q(this.b, dz2Var.b) && this.c == dz2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xv5.q(")", j39.q("DomainOverrideDto(domain=", this.a, ", replace=", this.b, ", enabled="), this.c);
    }

    public dz2(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
