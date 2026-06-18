package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o60 {
    public final n60 a;
    public final String b;
    public final File c;

    public o60(n60 n60Var, String str, File file) {
        this.a = n60Var;
        if (str == null) {
            k27.n("Null sessionId");
            throw null;
        }
        this.b = str;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o60)) {
            return false;
        }
        o60 o60Var = (o60) obj;
        return this.a.equals(o60Var.a) && this.b.equals(o60Var.b) && this.c.equals(o60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
