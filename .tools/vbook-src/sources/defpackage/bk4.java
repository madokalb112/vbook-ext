package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bk4 {
    public final String a;
    public final String b;

    public bk4(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bk4)) {
            return false;
        }
        bk4 bk4Var = (bk4) obj;
        return iw9.D(bk4Var.a, this.a, true) && iw9.D(bk4Var.b, this.b, true);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.a.toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.b.toLowerCase(locale);
        lowerCase2.getClass();
        return lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValueParam(name=");
        sb.append(this.a);
        sb.append(", value=");
        return ky0.s(this.b, ", escapeValue=false)", sb);
    }
}
