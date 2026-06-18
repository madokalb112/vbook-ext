package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ud8 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public ud8(boolean z, boolean z2, boolean z3, boolean z4, long j) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = j;
    }

    public static ud8 a(ud8 ud8Var, boolean z, boolean z2, boolean z3, boolean z4, long j, int i) {
        if ((i & 1) != 0) {
            z = ud8Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = ud8Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = ud8Var.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = ud8Var.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            j = ud8Var.e;
        }
        ud8Var.getClass();
        return new ud8(z5, z6, z7, z8, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud8)) {
            return false;
        }
        ud8 ud8Var = (ud8) obj;
        return this.a == ud8Var.a && this.b == ud8Var.b && this.c == ud8Var.c && this.d == ud8Var.d && this.e == ud8Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("ReaderSettingState(isShowControlWhenStartRead=", this.a, ", isAutoOpenLastRead=", this.b, ", isAlwaysScreenOn=");
        ky0.D(sbR, this.c, ", isSaveReadHistory=", this.d, ", remindTime=");
        return xv5.n(this.e, ")", sbR);
    }
}
