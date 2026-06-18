package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class pz7 {
    public static final oz7 Companion = new oz7();
    public final long a;
    public final int b;
    public final hhb c;
    public final String d;
    public final pz7 e;
    public final int f;
    public final int g;
    public final long h;
    public final long i;
    public final boolean j;
    public final int k;

    public /* synthetic */ pz7(int i, long j, int i2, hhb hhbVar, String str, pz7 pz7Var, int i3, int i4, long j2, long j3, boolean z, int i5) {
        if ((i & 1) == 0) {
            this.a = 0L;
        } else {
            this.a = j;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = new hhb();
        } else {
            this.c = hhbVar;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = pz7Var;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i3;
        }
        if ((i & 64) == 0) {
            this.g = 0;
        } else {
            this.g = i4;
        }
        if ((i & Token.CASE) == 0) {
            this.h = 0L;
        } else {
            this.h = j2;
        }
        if ((i & 256) == 0) {
            this.i = 0L;
        } else {
            this.i = j3;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z;
        }
        if ((i & 1024) == 0) {
            this.k = 0;
        } else {
            this.k = i5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz7)) {
            return false;
        }
        pz7 pz7Var = (pz7) obj;
        return this.a == pz7Var.a && this.b == pz7Var.b && lc5.Q(this.c, pz7Var.c) && lc5.Q(this.d, pz7Var.d) && lc5.Q(this.e, pz7Var.e) && this.f == pz7Var.f && this.g == pz7Var.g && this.h == pz7Var.h && this.i == pz7Var.i && this.j == pz7Var.j && this.k == pz7Var.k;
    }

    public final int hashCode() {
        int iA = j39.a((this.c.hashCode() + tw2.d(this.b, Long.hashCode(this.a) * 31, 31)) * 31, 31, this.d);
        pz7 pz7Var = this.e;
        return Integer.hashCode(this.k) + j39.c(xv5.b(xv5.b(tw2.d(this.g, tw2.d(this.f, (iA + (pz7Var == null ? 0 : pz7Var.hashCode())) * 31, 31), 31), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostDto(id=");
        sb.append(this.a);
        sb.append(", topicId=");
        sb.append(this.b);
        sb.append(", user=");
        sb.append(this.c);
        sb.append(", content=");
        sb.append(this.d);
        sb.append(", quote=");
        sb.append(this.e);
        sb.append(", status=");
        sb.append(this.f);
        sb.append(", likeCount=");
        sb.append(this.g);
        sb.append(", updatedAt=");
        sb.append(this.h);
        dx1.z(sb, ", createdAt=", this.i, ", liked=");
        sb.append(this.j);
        sb.append(", likes=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
