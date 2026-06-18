package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class mhb {
    public static final lhb Companion = new lhb();
    public static final dp5[] j = {null, null, null, null, null, null, null, null, ex1.Z(xu5.b, new wab(8))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final int g;
    public final String h;
    public final List i;

    public /* synthetic */ mhb(int i, String str, String str2, String str3, String str4, int i2, boolean z, int i3, String str5, List list) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i2;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = 0;
        } else {
            this.g = i3;
        }
        if ((i & Token.CASE) == 0) {
            this.h = "";
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = lc3.a;
        } else {
            this.i = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhb)) {
            return false;
        }
        mhb mhbVar = (mhb) obj;
        return lc5.Q(this.a, mhbVar.a) && lc5.Q(this.b, mhbVar.b) && lc5.Q(this.c, mhbVar.c) && lc5.Q(this.d, mhbVar.d) && this.e == mhbVar.e && this.f == mhbVar.f && this.g == mhbVar.g && lc5.Q(this.h, mhbVar.h) && lc5.Q(this.i, mhbVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + j39.a(tw2.d(this.g, j39.c(tw2.d(this.e, j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("UserInfoDto(id=", this.a, ", name=", this.b, ", email=");
        j39.y(sbQ, this.c, ", avatar=", this.d, ", role=");
        j39.x(sbQ, this.e, ", premium=", this.f, ", exp=");
        ky0.w(this.g, ", color=", this.h, ", extraColor=", sbQ);
        return tw2.t(sbQ, this.i, ")");
    }

    public mhb() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = false;
        this.g = 0;
        this.h = "";
        this.i = lc3.a;
    }
}
