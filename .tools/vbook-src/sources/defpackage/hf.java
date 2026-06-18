package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hf {
    public final Uri a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public hf(Uri uri, String str, String str2, String str3) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = lc5.Q(str3, "vnd.android.document/directory");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf)) {
            return false;
        }
        hf hfVar = (hf) obj;
        return this.a.equals(hfVar.a) && this.b.equals(hfVar.b) && lc5.Q(this.c, hfVar.c) && lc5.Q(this.d, hfVar.d);
    }

    public final int hashCode() {
        int iA = j39.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidDocumentInfo(uri=");
        sb.append(this.a);
        sb.append(", documentId=");
        sb.append(this.b);
        sb.append(", name=");
        return tw2.s(sb, this.c, ", mimeType=", this.d, ")");
    }
}
