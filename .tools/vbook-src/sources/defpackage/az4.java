package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class az4 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final List d;

    public az4(boolean z, boolean z2, String str, ArrayList arrayList, int i) {
        str = (i & 4) != 0 ? null : str;
        arrayList = (i & 8) != 0 ? null : arrayList;
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az4)) {
            return false;
        }
        az4 az4Var = (az4) obj;
        return this.a == az4Var.a && this.b == az4Var.b && lc5.Q(this.c, az4Var.c) && lc5.Q(this.d, az4Var.d);
    }

    public final int hashCode() {
        int iC = j39.c(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("ImageContent(isLoading=", this.a, ", isError=", this.b, ", errorMessage=");
        sbR.append(this.c);
        sbR.append(", images=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
