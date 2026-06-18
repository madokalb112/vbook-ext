package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gna {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public gna(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = z2;
    }

    public static gna a(gna gnaVar, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = gnaVar.a;
        }
        String str7 = str;
        if ((i & 2) != 0) {
            str2 = gnaVar.b;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = gnaVar.c;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = gnaVar.d;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = gnaVar.e;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = gnaVar.f;
        }
        String str12 = str6;
        boolean z3 = (i & 64) != 0 ? gnaVar.g : z;
        boolean z4 = (i & Token.CASE) != 0 ? gnaVar.h : z2;
        gnaVar.getClass();
        str7.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        return new gna(str7, str8, str9, str10, str11, str12, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gna)) {
            return false;
        }
        gna gnaVar = (gna) obj;
        return this.a.equals(gnaVar.a) && this.b.equals(gnaVar.b) && this.c.equals(gnaVar.c) && this.d.equals(gnaVar.d) && this.e.equals(gnaVar.e) && this.f.equals(gnaVar.f) && this.g == gnaVar.g && this.h == gnaVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + j39.c(j39.a(j39.a(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("TextToSpeechInfoState(bookId=", this.a, ", bookName=", this.b, ", authorName=");
        j39.y(sbQ, this.c, ", chapterName=", this.d, ", bookPath=");
        j39.y(sbQ, this.e, ", coverPath=", this.f, ", isExpand=");
        sbQ.append(this.g);
        sbQ.append(", isRunning=");
        sbQ.append(this.h);
        sbQ.append(")");
        return sbQ.toString();
    }
}
