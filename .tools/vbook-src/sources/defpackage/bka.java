package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bka {
    public final boolean a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final List f;

    public bka(boolean z, int i, String str, int i2, int i3, List list) {
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = list;
    }

    public static bka a(bka bkaVar, boolean z, int i, String str, int i2, int i3, List list, int i4) {
        if ((i4 & 1) != 0) {
            z = bkaVar.a;
        }
        boolean z2 = z;
        if ((i4 & 2) != 0) {
            i = bkaVar.b;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            str = bkaVar.c;
        }
        String str2 = str;
        if ((i4 & 8) != 0) {
            i2 = bkaVar.d;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = bkaVar.e;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            list = bkaVar.f;
        }
        List list2 = list;
        bkaVar.getClass();
        str2.getClass();
        list2.getClass();
        return new bka(z2, i5, str2, i6, i7, list2);
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.e;
    }

    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bka)) {
            return false;
        }
        bka bkaVar = (bka) obj;
        return this.a == bkaVar.a && this.b == bkaVar.b && lc5.Q(this.c, bkaVar.c) && this.d == bkaVar.d && this.e == bkaVar.e && lc5.Q(this.f, bkaVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + tw2.d(this.e, tw2.d(this.d, j39.a(tw2.d(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSearchState(isSearching=");
        sb.append(this.a);
        sb.append(", searchPercent=");
        sb.append(this.b);
        sb.append(", searchKey=");
        dx1.t(this.d, this.c, ", focusSearchIndex=", ", searchFoundCount=", sb);
        sb.append(this.e);
        sb.append(", searchResults=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ bka() {
        this(false, 0, "", 0, 0, lc3.a);
    }
}
