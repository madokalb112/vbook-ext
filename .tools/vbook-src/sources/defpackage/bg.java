package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bg {
    public final Context a;
    public final pn2 b;
    public final long c;
    public final pj7 d;

    public bg(Context context, pn2 pn2Var, long j, pj7 pj7Var) {
        this.a = context;
        this.b = pn2Var;
        this.c = j;
        this.d = pj7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!bg.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        bg bgVar = (bg) obj;
        return lc5.Q(this.a, bgVar.a) && lc5.Q(this.b, bgVar.b) && lc1.d(this.c, bgVar.c) && lc5.Q(this.d, bgVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = lc1.k;
        return this.d.hashCode() + xv5.b(iHashCode, 31, this.c);
    }
}
