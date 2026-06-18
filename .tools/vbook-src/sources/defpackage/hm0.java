package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hm0 implements cm0 {
    public final m62 a;

    public hm0(m62 m62Var) {
        this.a = m62Var;
    }

    public static boolean a(c92 c92Var, int i, int i2, int i3) {
        int i4 = c92Var.c;
        long j = c92Var.j;
        if (i4 != i) {
            return false;
        }
        long j2 = i2;
        long j3 = c92Var.i;
        if (j2 >= j3 && j2 <= j) {
            return true;
        }
        long j4 = i3;
        return j4 >= j3 && j4 <= j;
    }

    public final void b(final String str, final int i, final String str2, final String str3, final String str4, final String str5, final int i2, final int i3) {
        b92 b92Var = this.a.c;
        b92Var.getClass();
        str.getClass();
        f92 f92Var = f92.a;
        List listC = new m82(b92Var, str, 1, new d92(b92Var, 1)).c();
        final ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (a((c92) obj, i, i2, i3)) {
                arrayList.add(obj);
            }
        }
        ym9.l(b92Var, new kb4() { // from class: dm0
            @Override // defpackage.kb4
            public final Object invoke(Object obj2) {
                String strP;
                m62 m62Var = this.a;
                ((u2b) obj2).getClass();
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    m62Var.c.K(((c92) obj3).a);
                }
                b92 b92Var2 = m62Var.c;
                c92 c92Var = (c92) fc1.z0(arrayList2);
                if (c92Var == null || (strP = c92Var.a) == null) {
                    strP = wm9.p();
                }
                String str6 = str4;
                if (str6 == null) {
                    c92 c92Var2 = (c92) fc1.z0(arrayList2);
                    str6 = c92Var2 != null ? c92Var2.g : null;
                    if (str6 == null) {
                        str6 = "";
                    }
                }
                String str7 = str6;
                long j = i2;
                long j2 = i3;
                c92 c92Var3 = (c92) fc1.z0(arrayList2);
                b92Var2.g0(new c92(strP, str, i, str2, 1, str3, str7, str5, j, j2, c92Var3 != null ? c92Var3.k : r95.a.k().c()));
                return heb.a;
            }
        });
    }
}
