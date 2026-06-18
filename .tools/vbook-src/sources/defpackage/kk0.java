package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kk0 {
    public final boolean a;
    public final boolean b;
    public final zv5 c;
    public final ji0 d;
    public final String e;

    public kk0(boolean z, boolean z2, zv5 zv5Var, ji0 ji0Var, String str) {
        this.a = z;
        this.b = z2;
        this.c = zv5Var;
        this.d = ji0Var;
        this.e = str;
    }

    public static kk0 a(kk0 kk0Var, boolean z, boolean z2, zv5 zv5Var, ji0 ji0Var, String str, int i) {
        if ((i & 1) != 0) {
            z = kk0Var.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = kk0Var.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            zv5Var = kk0Var.c;
        }
        zv5 zv5Var2 = zv5Var;
        if ((i & 8) != 0) {
            ji0Var = kk0Var.d;
        }
        ji0 ji0Var2 = ji0Var;
        if ((i & 16) != 0) {
            str = kk0Var.e;
        }
        String str2 = str;
        kk0Var.getClass();
        str2.getClass();
        return new kk0(z3, z4, zv5Var2, ji0Var2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk0)) {
            return false;
        }
        kk0 kk0Var = (kk0) obj;
        return this.a == kk0Var.a && this.b == kk0Var.b && lc5.Q(this.c, kk0Var.c) && lc5.Q(this.d, kk0Var.d) && this.e.equals(kk0Var.e);
    }

    public final int hashCode() {
        int iC = j39.c(Boolean.hashCode(this.a) * 31, 31, this.b);
        zv5 zv5Var = this.c;
        int iHashCode = (iC + (zv5Var == null ? 0 : zv5Var.hashCode())) * 31;
        ji0 ji0Var = this.d;
        return this.e.hashCode() + ((iHashCode + (ji0Var != null ? ji0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("BookMigrateState(isMigrating=", this.a, ", isMigrated=", this.b, ", currentBook=");
        sbR.append(this.c);
        sbR.append(", migrateBook=");
        sbR.append(this.d);
        sbR.append(", extensionId=");
        return ky0.s(this.e, ")", sbR);
    }
}
