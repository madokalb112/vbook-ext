package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class hx7 implements m39, cx0 {
    public final String a;
    public final xd4 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final dp5 i;
    public final dp5 j;
    public final dp5 k;

    public hx7(String str, xd4 xd4Var, int i) {
        this.a = str;
        this.b = xd4Var;
        this.c = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.g = new boolean[i4];
        this.h = mc3.a;
        ib4 ib4Var = new ib4(this) { // from class: gx7
            public final /* synthetic */ hx7 b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                ArrayList arrayList;
                int i5 = i2;
                hx7 hx7Var = this.b;
                switch (i5) {
                    case 0:
                        xd4 xd4Var2 = hx7Var.b;
                        return xd4Var2 != null ? xd4Var2.d() : lc5.L;
                    case 1:
                        xd4 xd4Var3 = hx7Var.b;
                        if (xd4Var3 != null) {
                            oi5[] oi5VarArrA = xd4Var3.a();
                            arrayList = new ArrayList(oi5VarArrA.length);
                            for (oi5 oi5Var : oi5VarArrA) {
                                arrayList.add(oi5Var.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return kc5.v(arrayList);
                    default:
                        return Integer.valueOf(tu1.Q(hx7Var, (m39[]) hx7Var.j.getValue()));
                }
            }
        };
        xu5 xu5Var = xu5.b;
        this.i = ex1.Z(xu5Var, ib4Var);
        final int i5 = 1;
        this.j = ex1.Z(xu5Var, new ib4(this) { // from class: gx7
            public final /* synthetic */ hx7 b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                ArrayList arrayList;
                int i52 = i5;
                hx7 hx7Var = this.b;
                switch (i52) {
                    case 0:
                        xd4 xd4Var2 = hx7Var.b;
                        return xd4Var2 != null ? xd4Var2.d() : lc5.L;
                    case 1:
                        xd4 xd4Var3 = hx7Var.b;
                        if (xd4Var3 != null) {
                            oi5[] oi5VarArrA = xd4Var3.a();
                            arrayList = new ArrayList(oi5VarArrA.length);
                            for (oi5 oi5Var : oi5VarArrA) {
                                arrayList.add(oi5Var.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return kc5.v(arrayList);
                    default:
                        return Integer.valueOf(tu1.Q(hx7Var, (m39[]) hx7Var.j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.k = ex1.Z(xu5Var, new ib4(this) { // from class: gx7
            public final /* synthetic */ hx7 b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                ArrayList arrayList;
                int i52 = i6;
                hx7 hx7Var = this.b;
                switch (i52) {
                    case 0:
                        xd4 xd4Var2 = hx7Var.b;
                        return xd4Var2 != null ? xd4Var2.d() : lc5.L;
                    case 1:
                        xd4 xd4Var3 = hx7Var.b;
                        if (xd4Var3 != null) {
                            oi5[] oi5VarArrA = xd4Var3.a();
                            arrayList = new ArrayList(oi5VarArrA.length);
                            for (oi5 oi5Var : oi5VarArrA) {
                                arrayList.add(oi5Var.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return kc5.v(arrayList);
                    default:
                        return Integer.valueOf(tu1.Q(hx7Var, (m39[]) hx7Var.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.m39
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cx0
    public final Set b() {
        return this.h.keySet();
    }

    @Override // defpackage.m39
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.m39
    public gx1 e() {
        return qw9.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hx7) {
            m39 m39Var = (m39) obj;
            if (this.a.equals(m39Var.a()) && Arrays.equals((m39[]) this.j.getValue(), (m39[]) ((hx7) obj).j.getValue())) {
                int iF = m39Var.f();
                int i = this.c;
                if (i == iF) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (lc5.Q(i(i2).a(), m39Var.i(i2).a()) && lc5.Q(i(i2).e(), m39Var.i(i2).e())) {
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
        return this.e[i];
    }

    @Override // defpackage.m39
    public final List getAnnotations() {
        return lc3.a;
    }

    @Override // defpackage.m39
    public final List h(int i) {
        List list = this.f[i];
        return list == null ? lc3.a : list;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.m39
    public m39 i(int i) {
        return ((oi5[]) this.i.getValue())[i].e();
    }

    @Override // defpackage.m39
    public final boolean j(int i) {
        return this.g[i];
    }

    public final void k(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public String toString() {
        return tu1.q0(this);
    }
}
