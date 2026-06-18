package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class hhb {
    public static final ghb Companion = new ghb();
    public static final dp5[] i = {null, null, null, null, null, null, null, ex1.Z(xu5.b, new wab(7))};
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final int f;
    public final String g;
    public final List h;

    public /* synthetic */ hhb(int i2, String str, String str2, String str3, int i3, boolean z, int i4, String str4, List list) {
        if ((i2 & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i2 & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i2 & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i3;
        }
        if ((i2 & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i2 & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i4;
        }
        if ((i2 & 64) == 0) {
            this.g = "";
        } else {
            this.g = str4;
        }
        if ((i2 & Token.CASE) == 0) {
            this.h = lc3.a;
        } else {
            this.h = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhb)) {
            return false;
        }
        hhb hhbVar = (hhb) obj;
        return lc5.Q(this.a, hhbVar.a) && lc5.Q(this.b, hhbVar.b) && lc5.Q(this.c, hhbVar.c) && this.d == hhbVar.d && this.e == hhbVar.e && this.f == hhbVar.f && lc5.Q(this.g, hhbVar.g) && lc5.Q(this.h, hhbVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + j39.a(tw2.d(this.f, j39.c(tw2.d(this.d, j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("UserDto(id=", this.a, ", name=", this.b, ", avatar=");
        dx1.t(this.d, this.c, ", role=", ", premium=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", exp=");
        sbQ.append(this.f);
        sbQ.append(", color=");
        sbQ.append(this.g);
        sbQ.append(", extraColor=");
        sbQ.append(this.h);
        sbQ.append(")");
        return sbQ.toString();
    }

    public hhb() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = false;
        this.f = 0;
        this.g = "";
        this.h = lc3.a;
    }
}
