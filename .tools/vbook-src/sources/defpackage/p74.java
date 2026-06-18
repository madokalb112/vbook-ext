package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p74 {
    public final boolean a;
    public final String b;
    public final float c;
    public final float d;
    public final List e;

    public p74(boolean z, String str, float f, float f2, List list) {
        list.getClass();
        this.a = z;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = list;
    }

    public static p74 a(p74 p74Var, String str, float f, float f2, ArrayList arrayList, int i) {
        boolean z = (i & 1) != 0 ? p74Var.a : false;
        if ((i & 2) != 0) {
            str = p74Var.b;
        }
        if ((i & 4) != 0) {
            f = p74Var.c;
        }
        if ((i & 8) != 0) {
            f2 = p74Var.d;
        }
        List list = arrayList;
        if ((i & 16) != 0) {
            list = p74Var.e;
        }
        List list2 = list;
        p74Var.getClass();
        str.getClass();
        list2.getClass();
        float f3 = f2;
        return new p74(z, str, f, f3, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p74)) {
            return false;
        }
        p74 p74Var = (p74) obj;
        return this.a == p74Var.a && this.b.equals(p74Var.b) && Float.compare(this.c, p74Var.c) == 0 && Float.compare(this.d, p74Var.d) == 0 && lc5.Q(this.e, p74Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + tw2.c(this.d, tw2.c(this.c, j39.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontSettingState(isLoading=");
        sb.append(this.a);
        sb.append(", currentFont=");
        sb.append(this.b);
        sb.append(", fontScale=");
        sb.append(this.c);
        sb.append(", densityScale=");
        sb.append(this.d);
        sb.append(", localFonts=");
        return tw2.t(sb, this.e, ")");
    }
}
