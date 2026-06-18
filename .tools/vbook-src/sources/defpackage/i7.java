package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i7 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public /* synthetic */ i7(int i) {
        this((i & 1) == 0, false, false, false, lc3.a);
    }

    public static i7 a(i7 i7Var, boolean z, boolean z2, boolean z3, boolean z4, List list, int i) {
        if ((i & 1) != 0) {
            z = i7Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = i7Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = i7Var.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = i7Var.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            list = i7Var.e;
        }
        List list2 = list;
        i7Var.getClass();
        list2.getClass();
        return new i7(z5, z6, z7, z8, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj;
        return this.a == i7Var.a && this.b == i7Var.b && this.c == i7Var.c && this.d == i7Var.d && lc5.Q(this.e, i7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("AddConversationState(isLoading=", this.a, ", isError=", this.b, ", isCreating=");
        ky0.D(sbR, this.c, ", hasMore=", this.d, ", users=");
        return tw2.t(sbR, this.e, ")");
    }

    public i7(boolean z, boolean z2, boolean z3, boolean z4, List list) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = list;
    }
}
