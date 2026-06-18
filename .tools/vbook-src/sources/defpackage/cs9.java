package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cs9 {
    public final ds9 a;
    public final ds9 b;
    public final ds9 c;
    public final ds9 d;
    public final tk0 e;
    public final List f;
    public final long g;
    public final long h;
    public final long i;
    public final List j;

    public cs9(ds9 ds9Var, ds9 ds9Var2, ds9 ds9Var3, ds9 ds9Var4, tk0 tk0Var, List list, long j, long j2, long j3, List list2) {
        tk0Var.getClass();
        list.getClass();
        list2.getClass();
        this.a = ds9Var;
        this.b = ds9Var2;
        this.c = ds9Var3;
        this.d = ds9Var4;
        this.e = tk0Var;
        this.f = list;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs9)) {
            return false;
        }
        cs9 cs9Var = (cs9) obj;
        return this.a.equals(cs9Var.a) && this.b.equals(cs9Var.b) && this.c.equals(cs9Var.c) && this.d.equals(cs9Var.d) && this.e == cs9Var.e && lc5.Q(this.f, cs9Var.f) && this.g == cs9Var.g && this.h == cs9Var.h && this.i == cs9Var.i && lc5.Q(this.j, cs9Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + xv5.b(xv5.b(xv5.b(j39.d((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, this.f, 31), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatisticState(todayStatistic=");
        sb.append(this.a);
        sb.append(", thisWeekStatistic=");
        sb.append(this.b);
        sb.append(", thisMonthStatistic=");
        sb.append(this.c);
        sb.append(", totalStatistic=");
        sb.append(this.d);
        sb.append(", sortMode=");
        sb.append(this.e);
        sb.append(", recentBooks=");
        sb.append(this.f);
        sb.append(", totalBooks=");
        sb.append(this.g);
        dx1.z(sb, ", totalChapters=", this.h, ", downloadedChapters=");
        sb.append(this.i);
        sb.append(", libraryBooks=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
