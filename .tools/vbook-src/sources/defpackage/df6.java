package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class df6 extends gf6 {
    public final long a;
    public final String b;
    public final int c;
    public final sgb d;
    public final gf6 e;
    public final long f;
    public final long g;

    public df6(long j, String str, int i, sgb sgbVar, gf6 gf6Var, long j2, long j3) {
        str.getClass();
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = sgbVar;
        this.e = gf6Var;
        this.f = j2;
        this.g = j3;
    }

    @Override // defpackage.gf6
    public final long a() {
        return this.g;
    }

    @Override // defpackage.gf6
    public final long b() {
        return this.a;
    }

    @Override // defpackage.gf6
    public final sgb c() {
        return this.d;
    }

    public final ArrayList d() {
        List listP0 = bw9.p0(this.b, new String[]{","});
        ArrayList arrayList = new ArrayList(gc1.M(listP0, 10));
        Iterator it = listP0.iterator();
        while (it.hasNext()) {
            arrayList.add(bw9.B0((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df6)) {
            return false;
        }
        df6 df6Var = (df6) obj;
        return this.a == df6Var.a && lc5.Q(this.b, df6Var.b) && this.c == df6Var.c && this.d.equals(df6Var.d) && lc5.Q(this.e, df6Var.e) && this.f == df6Var.f && this.g == df6Var.g;
    }

    @Override // defpackage.gf6
    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + tw2.d(this.c, j39.a(Long.hashCode(this.a) * 31, 31, this.b), 31)) * 31;
        gf6 gf6Var = this.e;
        return Long.hashCode(this.g) + xv5.b((iHashCode + (gf6Var == null ? 0 : gf6Var.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("System(id=");
        sb.append(this.a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", user=");
        sb.append(this.d);
        sb.append(", quote=");
        sb.append(this.e);
        sb.append(", updatedAt=");
        sb.append(this.f);
        return dx1.l(sb, ", createdAt=", this.g, ")");
    }
}
