package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jnb {
    public final gnb a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    public final String h;
    public final String i;
    public final double j;
    public final double k;
    public final double l;
    public final Object m;
    public final String n;
    public final Throwable o;

    public jnb(gnb gnbVar, boolean z, boolean z2, long j, long j2, long j3, int i, String str, String str2, double d, double d2, double d3, Object obj, String str3, Throwable th) {
        str.getClass();
        str2.getClass();
        this.a = gnbVar;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = d;
        this.k = d2;
        this.l = d3;
        this.m = obj;
        this.n = str3;
        this.o = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jnb) {
            jnb jnbVar = (jnb) obj;
            if (lc5.Q(this.a, jnbVar.a) && this.b == jnbVar.b && this.c == jnbVar.c && this.d == jnbVar.d && this.e == jnbVar.e && this.f == jnbVar.f && this.g == jnbVar.g && lc5.Q(this.h, jnbVar.h) && lc5.Q(this.i, jnbVar.i) && Double.compare(this.j, jnbVar.j) == 0 && Double.compare(this.k, jnbVar.k) == 0 && Double.compare(this.l, jnbVar.l) == 0 && lc5.Q(this.m, jnbVar.m) && lc5.Q(this.n, jnbVar.n) && lc5.Q(this.o, jnbVar.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (Double.hashCode(this.l) + ((Double.hashCode(this.k) + ((Double.hashCode(this.j) + j39.a(j39.a(tw2.d(this.g, xv5.b(xv5.b(xv5.b(j39.c(j39.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i)) * 31)) * 31)) * 31;
        Object obj = this.m;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 961;
        String str = this.n;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.o;
        return iHashCode3 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VfsStat(");
        ArrayList arrayList = new ArrayList(16);
        arrayList.add("file=" + this.a);
        arrayList.add("exists=" + this.b);
        arrayList.add("isDirectory=" + this.c);
        arrayList.add("size=" + this.d);
        arrayList.add("device=" + this.e);
        arrayList.add("inode=" + this.f);
        arrayList.add("mode=" + this.g);
        arrayList.add("owner=" + this.h);
        arrayList.add("group=" + this.i);
        arrayList.add("createTime=" + ((Object) y62.a(this.j)));
        arrayList.add("modifiedTime=" + ((Object) y62.a(this.k)));
        arrayList.add("lastAccessTime=" + ((Object) y62.a(this.l)));
        arrayList.add("extraInfo=" + this.m);
        arrayList.add("id=" + this.n);
        return xv5.s(sb, fc1.D0(arrayList, ", ", null, null, null, 62), ')');
    }
}
