package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u4b {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final p5b f;
    public final r5b g;
    public final r5b h;

    public u4b(boolean z, boolean z2, boolean z3, boolean z4, String str, p5b p5bVar, r5b r5bVar, r5b r5bVar2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = p5bVar;
        this.g = r5bVar;
        this.h = r5bVar2;
    }

    public static u4b a(u4b u4bVar, boolean z, boolean z2, boolean z3, boolean z4, String str, p5b p5bVar, r5b r5bVar, r5b r5bVar2, int i) {
        if ((i & 1) != 0) {
            z = u4bVar.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = u4bVar.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = u4bVar.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = u4bVar.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            str = u4bVar.e;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            p5bVar = u4bVar.f;
        }
        p5b p5bVar2 = p5bVar;
        r5b r5bVar3 = (i & 64) != 0 ? u4bVar.g : r5bVar;
        r5b r5bVar4 = (i & Token.CASE) != 0 ? u4bVar.h : r5bVar2;
        u4bVar.getClass();
        return new u4b(z5, z6, z7, z8, str2, p5bVar2, r5bVar3, r5bVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4b)) {
            return false;
        }
        u4b u4bVar = (u4b) obj;
        return this.a == u4bVar.a && this.b == u4bVar.b && this.c == u4bVar.c && this.d == u4bVar.d && this.e.equals(u4bVar.e) && lc5.Q(this.f, u4bVar.f) && lc5.Q(this.g, u4bVar.g) && lc5.Q(this.h, u4bVar.h);
    }

    public final int hashCode() {
        int iA = j39.a(j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        p5b p5bVar = this.f;
        int iHashCode = (iA + (p5bVar == null ? 0 : p5bVar.hashCode())) * 31;
        r5b r5bVar = this.g;
        int iHashCode2 = (iHashCode + (r5bVar == null ? 0 : r5bVar.hashCode())) * 31;
        r5b r5bVar2 = this.h;
        return iHashCode2 + (r5bVar2 != null ? r5bVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("TranslateState(isTranslateEnabled=", this.a, ", isTranslating=", this.b, ", isShowRaw=");
        ky0.D(sbR, this.c, ", isSupportTranslate=", this.d, ", detectLanguage=");
        sbR.append(this.e);
        sbR.append(", currentEngine=");
        sbR.append(this.f);
        sbR.append(", fromLanguage=");
        sbR.append(this.g);
        sbR.append(", toLanguage=");
        sbR.append(this.h);
        sbR.append(")");
        return sbR.toString();
    }
}
