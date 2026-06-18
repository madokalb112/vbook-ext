package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uk8 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final d6a r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v10, types: [int] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [int] */
    /* JADX WARN: Type inference failed for: r13v13, types: [int] */
    /* JADX WARN: Type inference failed for: r13v14, types: [int] */
    /* JADX WARN: Type inference failed for: r13v15, types: [int] */
    /* JADX WARN: Type inference failed for: r13v16, types: [int] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int] */
    /* JADX WARN: Type inference failed for: r13v19, types: [int] */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v20, types: [int] */
    /* JADX WARN: Type inference failed for: r13v21, types: [int] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8, types: [int] */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    public uk8(int i) {
        this.a = i;
        boolean z = false;
        ?? r0 = (i & 1) != 0 ? 1 : 0;
        this.b = r0;
        boolean z2 = (i & 2) != 0;
        this.c = z2;
        boolean z3 = (i & 4) != 0;
        this.d = z3;
        boolean z4 = (i & 8) != 0;
        this.e = z4;
        boolean z5 = (i & 16) != 0;
        this.f = z5;
        boolean z6 = (i & 32) != 0;
        this.g = z6;
        boolean z7 = (i & 2048) != 0;
        this.h = z7;
        boolean z8 = (i & 64) != 0;
        this.i = z8;
        boolean z9 = (i & Token.CASE) != 0;
        this.j = z9;
        boolean z10 = (i & 256) != 0;
        this.k = z10;
        boolean z11 = (i & 512) != 0;
        this.l = z11;
        boolean z12 = (i & 1024) != 0;
        this.m = z12;
        ?? r13 = z2 ? r0 + 1 : r0;
        r13 = z3 ? r13 + 1 : r13;
        r13 = z4 ? r13 + 1 : r13;
        r13 = z5 ? r13 + 1 : r13;
        r13 = z6 ? r13 + 1 : r13;
        r13 = z7 ? r13 + 1 : r13;
        r13 = z8 ? r13 + 1 : r13;
        r13 = z9 ? r13 + 1 : r13;
        r13 = z10 ? r13 + 1 : r13;
        r13 = z11 ? r13 + 1 : r13;
        r13 = z12 ? r13 + 1 : r13;
        this.n = r13 == 0;
        this.o = r13 == 1 && r0 != 0;
        boolean z13 = r13 == 1 && z2;
        this.p = z13;
        if (r13 == 1 && z3) {
            z = true;
        }
        this.q = z;
        if (z13 || !z) {
        }
        this.r = new d6a(new wn6(this, 20));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && uk8.class == obj.getClass() && this.a == ((uk8) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return xv5.s(new StringBuilder("ResetParamsDiffResult("), (String) this.r.getValue(), ')');
    }
}
