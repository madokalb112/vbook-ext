package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k4b {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final int h;
    public final List i;
    public final List j;
    public final List k;

    public k4b(boolean z, String str, String str2, String str3, boolean z2, String str4, String str5, int i, List list, List list2, List list3) {
        j39.w(str, str2, str3, str4, str5);
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z2;
        this.f = str4;
        this.g = str5;
        this.h = i;
        this.i = list;
        this.j = list2;
        this.k = list3;
    }

    public static k4b a(boolean z, String str, String str2, String str3, boolean z2, String str4, String str5, int i, List list, List list2, List list3) {
        j39.w(str, str2, str3, str4, str5);
        list.getClass();
        list2.getClass();
        list3.getClass();
        return new k4b(z, str, str2, str3, z2, str4, str5, i, list, list2, list3);
    }

    public static /* synthetic */ k4b b(k4b k4bVar, String str, String str2, String str3, boolean z, int i, List list, List list2, List list3, int i2) {
        boolean z2 = k4bVar.a;
        if ((i2 & 2) != 0) {
            str = k4bVar.b;
        }
        if ((i2 & 4) != 0) {
            str2 = k4bVar.c;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            str3 = k4bVar.d;
        }
        String str5 = str3;
        boolean z3 = (i2 & 16) != 0 ? k4bVar.e : z;
        String str6 = k4bVar.f;
        String str7 = k4bVar.g;
        int i3 = (i2 & Token.CASE) != 0 ? k4bVar.h : i;
        List list4 = (i2 & 256) != 0 ? k4bVar.i : list;
        List list5 = (i2 & 512) != 0 ? k4bVar.j : list2;
        List list6 = (i2 & 1024) != 0 ? k4bVar.k : list3;
        k4bVar.getClass();
        return a(z2, str, str4, str5, z3, str6, str7, i3, list4, list5, list6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4b)) {
            return false;
        }
        k4b k4bVar = (k4b) obj;
        return this.a == k4bVar.a && lc5.Q(this.b, k4bVar.b) && lc5.Q(this.c, k4bVar.c) && lc5.Q(this.d, k4bVar.d) && this.e == k4bVar.e && lc5.Q(this.f, k4bVar.f) && lc5.Q(this.g, k4bVar.g) && this.h == k4bVar.h && lc5.Q(this.i, k4bVar.i) && lc5.Q(this.j, k4bVar.j) && lc5.Q(this.k, k4bVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + j39.d(j39.d(tw2.d(this.h, j39.a(j39.a(j39.c(j39.a(j39.a(j39.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), this.i, 31), this.j, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TranslateSettingState(isLoading=");
        sb.append(this.a);
        sb.append(", engineId=");
        sb.append(this.b);
        sb.append(", fromLanguageId=");
        j39.y(sb, this.c, ", toLanguageId=", this.d, ", isShowRaw=");
        sb.append(this.e);
        sb.append(", bookId=");
        sb.append(this.f);
        sb.append(", extensionId=");
        dx1.t(this.h, this.g, ", saveSettingType=", ", availableEngines=", sb);
        sb.append(this.i);
        sb.append(", availableFromLanguages=");
        sb.append(this.j);
        sb.append(", availableToLanguages=");
        return tw2.t(sb, this.k, ")");
    }
}
