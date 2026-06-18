package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class on8 {
    public final Integer a;
    public final List b;
    public nn8 c;
    public on8 d;
    public String e;
    public long f;
    public vn9 g;
    public wn8 h;

    public /* synthetic */ on8(nn8 nn8Var, on8 on8Var, String str, long j, vn9 vn9Var, wn8 wn8Var, int i) {
        this(null, new ArrayList(), nn8Var, (i & 8) != 0 ? null : on8Var, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? zk9.h(0, 0) : j, (i & 64) != 0 ? new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65535) : vn9Var, (i & Token.CASE) != 0 ? rn8.b : wn8Var);
    }

    public final on8 a(vn9 vn9Var, wn8 wn8Var) {
        wn8Var.getClass();
        if (wn9.A(vn9Var, c(), true) && wn8Var.getClass() == this.h.getClass()) {
            return this;
        }
        on8 on8Var = this.d;
        if (on8Var != null) {
            return on8Var.a(vn9Var, wn8Var);
        }
        return null;
    }

    public final on8 b(int i) {
        List list = this.b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            on8 on8Var = (on8) list.get(i2);
            if (on8Var.e.length() > 0) {
                if (i != -1) {
                    on8Var.f = xv5.d(i, i, on8Var.e);
                }
                return on8Var;
            }
            on8 on8VarB = on8Var.b(i);
            if (on8VarB != null) {
                if (i != -1) {
                    on8Var.f = xv5.d(i, i, on8Var.e);
                }
                return on8VarB;
            }
        }
        return null;
    }

    public final vn9 c() {
        vn9 vn9VarD = this.g;
        for (on8 on8Var = this.d; on8Var != null; on8Var = on8Var.d) {
            vn9VarD = on8Var.g.d(vn9VarD);
        }
        return vn9VarD;
    }

    public final wn8 d() {
        wn8 wn8Var = this.h;
        for (on8 on8Var = this.d; on8Var != null && wn8Var.getClass() == rn8.class; on8Var = on8Var.d) {
            wn8Var = on8Var.h;
        }
        return wn8Var;
    }

    public final long e() {
        long jH = this.f;
        while (true) {
            List list = this.b;
            this = list != null ? (on8) fc1.F0(list) : null;
            if (this == null) {
                return jH;
            }
            jH = zk9.h(pja.g(jH), pja.f(this.f));
        }
    }

    public final on8 f() {
        List list = this.b;
        for (int iS = gc1.S(list); -1 < iS; iS--) {
            on8 on8Var = (on8) list.get(iS);
            if (on8Var.e.length() > 0) {
                return on8Var;
            }
            on8 on8VarF = on8Var.f();
            if (on8VarF != null) {
                return on8VarF;
            }
        }
        return null;
    }

    public final xl7 g(int i, int i2, boolean z) {
        this.f = xv5.d(i2, i2, this.e);
        if (!this.h.d() && !z) {
            long jE = e();
            if (i == pja.f(jE) - 1) {
                return new xl7(Integer.valueOf(pja.e(jE) + i2), null);
            }
        }
        int length = this.e.length() + i2;
        if (pja.a(i, this.f) || (k() && i + 1 == pja.g(this.f))) {
            return this.e.length() == 0 ? new xl7(Integer.valueOf(length), this.c.a(length)) : new xl7(Integer.valueOf(length), this);
        }
        List list = this.b;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            xl7 xl7VarG = ((on8) list.get(i3)).g(i, length, z);
            if (xl7VarG.b != null) {
                return xl7VarG;
            }
            length = ((Number) xl7VarG.a).intValue();
        }
        return new xl7(Integer.valueOf(length), null);
    }

    public final xl7 h(int i, long j) {
        ArrayList arrayList = new ArrayList();
        this.f = xv5.d(i, i, this.e);
        int length = this.e.length() + i;
        if (pja.g(j) < pja.f(this.f) && pja.f(j) > pja.g(this.f)) {
            arrayList.add(this);
        }
        List list = this.b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            xl7 xl7VarH = ((on8) list.get(i2)).h(length, j);
            arrayList.addAll((Collection) xl7VarH.b);
            length = ((Number) xl7VarH.a).intValue();
        }
        return new xl7(Integer.valueOf(length), arrayList);
    }

    public final boolean i() {
        if (!bw9.a0(this.e)) {
            return false;
        }
        List list = this.b;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((on8) it.next()).i()) {
                    return false;
                }
            }
        }
        return !(this.h instanceof un8);
    }

    public final boolean j() {
        boolean z;
        if (this.e.length() == 0) {
            List list = this.b;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((on8) it.next()).j()) {
                        z = false;
                        break;
                    }
                }
                z = true;
                if (!z && !(this.h instanceof un8)) {
                    return true;
                }
            } else {
                z = true;
                if (!z) {
                }
            }
        }
        return false;
    }

    public final boolean k() {
        on8 on8Var = this;
        while (true) {
            on8 on8Var2 = on8Var.d;
            if (on8Var2 == null) {
                return lc5.Q(fc1.z0(this.c.a), on8Var);
            }
            if (!lc5.Q(fc1.z0(on8Var2.b), on8Var) || on8Var2.e.length() > 0) {
                return false;
            }
            on8Var = on8Var2;
        }
    }

    public final void l() {
        ArrayList arrayList = new ArrayList();
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            on8 on8Var = (on8) list.get(i);
            if (on8Var.j()) {
                arrayList.add(Integer.valueOf(i));
            } else {
                on8Var.l();
            }
        }
        int size2 = arrayList.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = size2 - 1;
            list.remove(((Number) arrayList.get(size2)).intValue());
            if (i2 < 0) {
                return;
            } else {
                size2 = i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xl7 m(int r9, long r10) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on8.m(int, long):xl7");
    }

    public final void n(wn8 wn8Var) {
        wn8Var.getClass();
        this.h = wn8Var;
    }

    public final void o(vn9 vn9Var) {
        vn9Var.getClass();
        this.g = vn9Var;
    }

    public final void p(String str) {
        str.getClass();
        this.e = str;
    }

    public final void q(nn8 nn8Var) {
        nn8Var.getClass();
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            on8 on8Var = (on8) list.get(i);
            on8Var.c = nn8Var;
            on8Var.q(nn8Var);
        }
    }

    public final String toString() {
        String str = this.e;
        String strI = pja.i(this.f);
        String strI2 = pja.i(e());
        wn8 wn8Var = this.h;
        StringBuilder sbQ = j39.q("richSpan(text='", str, "', textRange=", strI, ", fullTextRange=");
        sbQ.append(strI2);
        sbQ.append("), richSpanStyle=");
        sbQ.append(wn8Var);
        sbQ.append(")");
        return sbQ.toString();
    }

    public on8(Integer num, List list, nn8 nn8Var, on8 on8Var, String str, long j, vn9 vn9Var, wn8 wn8Var) {
        nn8Var.getClass();
        str.getClass();
        vn9Var.getClass();
        wn8Var.getClass();
        this.a = num;
        this.b = list;
        this.c = nn8Var;
        this.d = on8Var;
        this.e = str;
        this.f = j;
        this.g = vn9Var;
        this.h = wn8Var;
    }
}
