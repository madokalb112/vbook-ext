package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bp2 {
    public final long a;
    public final int b;
    public final sgb c;
    public final int d;
    public final cp2 e;
    public final int f;
    public final boolean g;
    public final long h;
    public final long i;
    public final List j;

    public bp2(long j, int i, sgb sgbVar, int i2, cp2 cp2Var, int i3, boolean z, long j2, long j3, List list) {
        this.a = j;
        this.b = i;
        this.c = sgbVar;
        this.d = i2;
        this.e = cp2Var;
        this.f = i3;
        this.g = z;
        this.h = j2;
        this.i = j3;
        this.j = list;
    }

    public static bp2 a(bp2 bp2Var, int i, boolean z, List list, int i2) {
        return new bp2(bp2Var.a, bp2Var.b, bp2Var.c, (i2 & 8) != 0 ? bp2Var.d : 2, bp2Var.e, (i2 & 32) != 0 ? bp2Var.f : i, (i2 & 64) != 0 ? bp2Var.g : z, bp2Var.h, bp2Var.i, (i2 & 512) != 0 ? bp2Var.j : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp2)) {
            return false;
        }
        bp2 bp2Var = (bp2) obj;
        return this.a == bp2Var.a && this.b == bp2Var.b && this.c.equals(bp2Var.c) && this.d == bp2Var.d && lc5.Q(this.e, bp2Var.e) && this.f == bp2Var.f && this.g == bp2Var.g && this.h == bp2Var.h && this.i == bp2Var.i && this.j.equals(bp2Var.j);
    }

    public final int hashCode() {
        int iD = tw2.d(this.d, (this.c.hashCode() + tw2.d(this.b, Long.hashCode(this.a) * 31, 31)) * 31, 31);
        cp2 cp2Var = this.e;
        return this.j.hashCode() + xv5.b(xv5.b(j39.c(tw2.d(this.f, (iD + (cp2Var == null ? 0 : cp2Var.hashCode())) * 31, 31), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DetailPost(id=");
        sb.append(this.a);
        sb.append(", topicId=");
        sb.append(this.b);
        sb.append(", user=");
        sb.append(this.c);
        sb.append(", status=");
        sb.append(this.d);
        sb.append(", quote=");
        sb.append(this.e);
        sb.append(", likes=");
        sb.append(this.f);
        sb.append(", liked=");
        sb.append(this.g);
        sb.append(", updatedAt=");
        sb.append(this.h);
        dx1.z(sb, ", createdAt=", this.i, ", blocks=");
        return tw2.t(sb, this.j, ")");
    }
}
