package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p39 implements m39, cx0 {
    public final String a;
    public final gx1 b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final m39[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final m39[] k;
    public final d6a l;

    public p39(String str, gx1 gx1Var, int i, List list, b91 b91Var) {
        this.a = str;
        this.b = gx1Var;
        this.c = i;
        this.d = b91Var.b;
        ArrayList arrayList = b91Var.c;
        this.e = fc1.X0(arrayList);
        int i2 = 0;
        this.f = (String[]) arrayList.toArray(new String[0]);
        this.g = kc5.v(b91Var.e);
        this.h = (List[]) b91Var.f.toArray(new List[0]);
        ArrayList arrayList2 = b91Var.g;
        arrayList2.getClass();
        boolean[] zArr = new boolean[arrayList2.size()];
        int size = arrayList2.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            zArr[i3] = ((Boolean) obj).booleanValue();
            i3++;
        }
        this.i = zArr;
        String[] strArr = this.f;
        strArr.getClass();
        j65 j65Var = new j65(new ub(strArr, 12), i2);
        ArrayList arrayList3 = new ArrayList(gc1.M(j65Var, 10));
        Iterator it = j65Var.iterator();
        while (true) {
            w53 w53Var = (w53) it;
            if (!w53Var.b.hasNext()) {
                this.j = y86.h0(arrayList3);
                this.k = kc5.v(list);
                this.l = new d6a(new o39(this, i2));
                return;
            }
            i65 i65Var = (i65) w53Var.next();
            arrayList3.add(new xl7(i65Var.b, Integer.valueOf(i65Var.a)));
        }
    }

    @Override // defpackage.m39
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cx0
    public final Set b() {
        return this.e;
    }

    @Override // defpackage.m39
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.m39
    public final gx1 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p39) {
            m39 m39Var = (m39) obj;
            if (this.a.equals(m39Var.a()) && Arrays.equals(this.k, ((p39) obj).k)) {
                int iF = m39Var.f();
                int i = this.c;
                if (i == iF) {
                    for (int i2 = 0; i2 < i; i2++) {
                        m39[] m39VarArr = this.g;
                        if (lc5.Q(m39VarArr[i2].a(), m39Var.i(i2).a()) && lc5.Q(m39VarArr[i2].e(), m39Var.i(i2).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.m39
    public final int f() {
        return this.c;
    }

    @Override // defpackage.m39
    public final String g(int i) {
        return this.f[i];
    }

    @Override // defpackage.m39
    public final List getAnnotations() {
        return this.d;
    }

    @Override // defpackage.m39
    public final List h(int i) {
        return this.h[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.m39
    public final m39 i(int i) {
        return this.g[i];
    }

    @Override // defpackage.m39
    public final boolean j(int i) {
        return this.i[i];
    }

    public final String toString() {
        return tu1.q0(this);
    }
}
