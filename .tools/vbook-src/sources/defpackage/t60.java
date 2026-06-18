package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t60 extends ez1 {
    public final List a;
    public final String b;

    public t60(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ez1)) {
            return false;
        }
        t60 t60Var = (t60) ((ez1) obj);
        if (!this.a.equals(t60Var.a)) {
            return false;
        }
        String str = t60Var.b;
        String str2 = this.b;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return ky0.s(this.b, "}", sb);
    }
}
