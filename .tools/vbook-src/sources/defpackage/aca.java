package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class aca {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final bp d;
    public final List e;

    public aca(boolean z, boolean z2, String str, bp bpVar, List list, int i) {
        str = (i & 4) != 0 ? null : str;
        bpVar = (i & 16) != 0 ? new bp("") : bpVar;
        list = (i & 32) != 0 ? lc3.a : list;
        bpVar.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = bpVar;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aca)) {
            return false;
        }
        aca acaVar = (aca) obj;
        return this.a == acaVar.a && this.b == acaVar.b && lc5.Q(this.c, acaVar.c) && lc5.Q(this.d, acaVar.d) && lc5.Q(this.e, acaVar.e);
    }

    public final int hashCode() {
        int iC = j39.c(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 961)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("TextContent(isLoading=", this.a, ", isError=", this.b, ", errorMessage=");
        sbR.append(this.c);
        sbR.append(", title=null, content=");
        sbR.append(this.d);
        sbR.append(", boundaries=");
        return tw2.t(sbR, this.e, ")");
    }
}
