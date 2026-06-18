package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wra {
    public final kra a;
    public final String b;
    public final List c;
    public final List d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final float j;
    public final String k;
    public final int l;
    public final String m;
    public final float n;

    public wra(kra kraVar, String str, List list, List list2, int i, boolean z, boolean z2, boolean z3, int i2, float f, String str2, int i3, String str3, float f2) {
        list.getClass();
        list2.getClass();
        this.a = kraVar;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = i;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = i2;
        this.j = f;
        this.k = str2;
        this.l = i3;
        this.m = str3;
        this.n = f2;
    }

    public static wra a(wra wraVar, kra kraVar, String str, List list, List list2, int i, boolean z, boolean z2, boolean z3, int i2, float f, String str2, int i3, String str3, float f2, int i4) {
        kra kraVar2 = (i4 & 1) != 0 ? wraVar.a : kraVar;
        String str4 = (i4 & 2) != 0 ? wraVar.b : str;
        List list3 = (i4 & 4) != 0 ? wraVar.c : list;
        List list4 = (i4 & 8) != 0 ? wraVar.d : list2;
        int i5 = (i4 & 16) != 0 ? wraVar.e : i;
        boolean z4 = (i4 & 32) != 0 ? wraVar.f : z;
        boolean z5 = (i4 & 64) != 0 ? wraVar.g : z2;
        boolean z6 = (i4 & Token.CASE) != 0 ? wraVar.h : z3;
        int i6 = (i4 & 256) != 0 ? wraVar.i : i2;
        float f3 = (i4 & 512) != 0 ? wraVar.j : f;
        wraVar.getClass();
        String str5 = (i4 & 2048) != 0 ? wraVar.k : str2;
        int i7 = (i4 & 4096) != 0 ? wraVar.l : i3;
        String str6 = (i4 & 8192) != 0 ? wraVar.m : str3;
        float f4 = (i4 & 16384) != 0 ? wraVar.n : f2;
        wraVar.getClass();
        str4.getClass();
        list3.getClass();
        list4.getClass();
        str5.getClass();
        str6.getClass();
        return new wra(kraVar2, str4, list3, list4, i5, z4, z5, z6, i6, f3, str5, i7, str6, f4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wra)) {
            return false;
        }
        wra wraVar = (wra) obj;
        return lc5.Q(this.a, wraVar.a) && this.b.equals(wraVar.b) && lc5.Q(this.c, wraVar.c) && lc5.Q(this.d, wraVar.d) && this.e == wraVar.e && this.f == wraVar.f && this.g == wraVar.g && this.h == wraVar.h && this.i == wraVar.i && Float.compare(this.j, wraVar.j) == 0 && this.k.equals(wraVar.k) && this.l == wraVar.l && this.m.equals(wraVar.m) && Float.compare(this.n, wraVar.n) == 0;
    }

    public final int hashCode() {
        kra kraVar = this.a;
        return Float.hashCode(this.n) + j39.a(tw2.d(this.l, j39.a(j39.c(tw2.c(this.j, tw2.d(this.i, j39.c(j39.c(j39.c(tw2.d(this.e, j39.d(j39.d(j39.a((kraVar == null ? 0 : kraVar.hashCode()) * 31, 31, this.b), this.c, 31), this.d, 31), 31), 31, this.f), 31, this.g), 31, this.h), 31), 31), 31, false), 31, this.k), 31), 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThemeSettingState(themeColor=");
        sb.append(this.a);
        sb.append(", themeId=");
        sb.append(this.b);
        sb.append(", basicColors=");
        sb.append(this.c);
        sb.append(", userColors=");
        sb.append(this.d);
        sb.append(", darkTheme=");
        j39.x(sb, this.e, ", useAmoledTheme=", this.f, ", useEInkTheme=");
        ky0.D(sb, this.g, ", useSystemColor=", this.h, ", style=");
        sb.append(this.i);
        sb.append(", contrastLevel=");
        sb.append(this.j);
        sb.append(", isExtendedFidelity=false, fontFamily=");
        dx1.t(this.l, this.k, ", swipeBack=", ", themeBackgroundImage=", sb);
        sb.append(this.m);
        sb.append(", themeBackgroundImageAlpha=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
