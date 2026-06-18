package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ka6 {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final vf0 e;
    public final wf0 f;
    public final zm5 g;
    public final boolean h;
    public final int i;
    public final int[] j;
    public int k;
    public int l;

    public ka6(int i, int i2, List list, long j, Object obj, lh7 lh7Var, vf0 vf0Var, wf0 wf0Var, zm5 zm5Var) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = vf0Var;
        this.f = wf0Var;
        this.g = zm5Var;
        this.h = lh7Var == lh7.a;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jt7 jt7Var = (jt7) list.get(i3);
            iMax = Math.max(iMax, !this.h ? jt7Var.b : jt7Var.a);
        }
        this.i = iMax;
        this.j = new int[this.b.size() * 2];
        this.l = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.k += i;
        int[] iArr = this.j;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.h;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.k = i;
        boolean z = this.h;
        this.l = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            jt7 jt7Var = (jt7) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.j;
            if (z) {
                vf0 vf0Var = this.e;
                if (vf0Var == null) {
                    throw tw2.f("null horizontalAlignment");
                }
                iArr[i6] = vf0Var.a(jt7Var.a, i2, this.g);
                iArr[i6 + 1] = i;
                i4 = jt7Var.b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                wf0 wf0Var = this.f;
                if (wf0Var == null) {
                    throw tw2.f("null verticalAlignment");
                }
                iArr[i7] = wf0Var.a(jt7Var.b, i3);
                i4 = jt7Var.a;
            }
            i += i4;
        }
    }
}
