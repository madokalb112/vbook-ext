package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fo8 {
    public static final rt8 x = qu1.k0(new qp6(20), new f48(16));
    public final hk9 a;
    public final cn7 b;
    public final cn7 c;
    public final jk9 d;
    public final LinkedHashSet e;
    public gia f;
    public final cn7 g;
    public final cn7 h;
    public final cn7 i;
    public final cn7 j;
    public final cn7 k;
    public final cn7 l;
    public final cn7 m;
    public final cn7 n;
    public final cn7 o;
    public final cn7 p;
    public final hk9 q;
    public final cn7 r;
    public final cn7 s;
    public final yn8 t;
    public final String u;
    public wga v;
    public oq9 w;

    public fo8(List list) {
        vn9 vn9VarC;
        km7 km7Var;
        Object obj;
        Object obj2;
        hk9 hk9Var = new hk9();
        this.a = hk9Var;
        this.b = dk9.x(js8.y);
        this.c = j39.g(7, null, 0L);
        this.d = new jk9();
        this.e = new LinkedHashSet();
        this.g = dk9.x(new bp(""));
        this.h = dk9.x(Boolean.FALSE);
        this.i = dk9.x((Object) null);
        this.j = dk9.x((Object) null);
        on8 on8VarH = h(pja.g(k().b) - 1, false);
        if (on8VarH == null || (vn9VarC = on8VarH.c()) == null) {
            wn8.a.getClass();
            vn9VarC = qn8.b;
        }
        this.k = dk9.x(vn9VarC);
        on8 on8VarH2 = h(pja.g(k().b) - 1, false);
        this.l = dk9.x((on8VarH2 == null || (obj2 = on8VarH2.h) == null) ? rn8.b : obj2);
        this.m = dk9.x(new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65535));
        this.n = dk9.x(new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65535));
        this.o = dk9.x(rn8.b);
        this.p = dk9.x(ug8.a(rn8.class));
        this.q = new hk9();
        nn8 nn8VarG = g(pja.g(k().b) - 1);
        if (nn8VarG == null || (km7Var = nn8VarG.b) == null) {
            nn8 nn8Var = (nn8) fc1.z0(hk9Var);
            km7Var = nn8Var != null ? nn8Var.b : nn8.d;
        }
        this.r = dk9.x(km7Var);
        dk9.x(new km7(0, 0, 0L, (dha) null, (iu7) null, (iy5) null, 0, 0, 511));
        dk9.x(new km7(0, 0, 0L, (dha) null, (iu7) null, (iy5) null, 0, 0, 511));
        nn8 nn8VarG2 = g(pja.g(k().b) - 1);
        this.s = dk9.x((nn8VarG2 == null || (obj = nn8VarG2.c) == null) ? new ri2() : obj);
        yn8 yn8Var = new yn8();
        yn8Var.a = lc1.g;
        yn8Var.b = jda.c;
        yn8Var.c = lc1.j;
        yn8Var.d = lc1.i;
        yn8Var.e = lc1.d;
        yn8Var.f = 38;
        yn8Var.g = 38;
        yn8Var.h = true;
        this.t = yn8Var;
        x(list);
        this.u = "⬚";
        this.v = k();
    }

    public static void a(on8 on8Var, on8 on8Var2, int i) {
        List list = on8Var.b;
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            long j = ((on8) it.next()).f;
            int i4 = pja.c;
            if (((int) (j >> 32)) == i) {
                break;
            } else {
                i3++;
            }
        }
        Object obj = null;
        if (i3 != -1) {
            for (Object obj2 : list) {
                int i5 = i2 + 1;
                if (i2 < 0) {
                    gc1.i0();
                    throw null;
                }
                on8 on8Var3 = (on8) obj2;
                if (i2 >= i3) {
                    long j2 = on8Var3.f;
                    int i6 = pja.c;
                    on8Var3.f = xv5.d((int) (on8Var3.f & 4294967295L), on8Var2.e.length() + ((int) (j2 >> 32)), on8Var2.e);
                }
                i2 = i5;
            }
            list.add(i3, on8Var2);
            return;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            on8 on8Var4 = (on8) next;
            long jE = on8Var4.e();
            int i7 = pja.c;
            if (((int) (jE >> 32)) < i && ((int) (on8Var4.e() & 4294967295L)) > i) {
                obj = next;
                break;
            }
        }
        on8 on8Var5 = (on8) obj;
        if (on8Var5 != null) {
            a(on8Var5, on8Var2, i);
        } else {
            list.add(on8Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(defpackage.fo8 r37, defpackage.on8 r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, int r42, vn9 r43, vn9 r44, int r45) {
        /*
            Method dump skipped, instruction units count: 1189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo8.o(fo8, on8, java.lang.String, java.lang.String, java.lang.String, int, vn9, vn9, int):void");
    }

    public final wga b(int i, int i2, wga wgaVar) {
        hk9 hk9Var = this.a;
        int iS = gc1.S(hk9Var);
        if (i <= iS) {
            int i3 = i2;
            while (true) {
                nn8 nn8Var = (nn8) hk9Var.get(i);
                mm7 mm7Var = nn8Var.c;
                if (!(mm7Var instanceof ih7)) {
                    break;
                }
                ih7 ih7Var = (ih7) mm7Var;
                wgaVar = w(nn8Var, new ih7(i3, this.t.f, ih7Var.b, ih7Var.c), wgaVar);
                i3++;
                if (i == iS) {
                    break;
                }
                i++;
            }
        }
        return wgaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r19, pja r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo8.c(long, pja):void");
    }

    public final void d(long j) throws Throwable {
        ArrayList arrayListI = i(j);
        int iG = pja.g(j);
        int iF = pja.f(j);
        int size = arrayListI.size();
        while (true) {
            size--;
            if (-1 >= size) {
                y(k());
                return;
            }
            on8 on8Var = (on8) arrayListI.get(size);
            String strSubstring = "";
            String strSubstring2 = pja.a(iG, on8Var.f) ? on8Var.e.substring(0, iG - ((int) (on8Var.f >> 32))) : "";
            String strSubstring3 = on8Var.e.substring(Math.max(iG - ((int) (on8Var.f >> 32)), 0), Math.min(iF - ((int) (on8Var.f >> 32)), on8Var.e.length()));
            if (pja.a(iF - 1, on8Var.f)) {
                strSubstring = on8Var.e.substring(iF - ((int) (on8Var.f >> 32)));
            }
            o(this, on8Var, strSubstring2, strSubstring3, strSubstring, Math.max(iG, (int) (on8Var.f >> 32)), null, wn9.O(wn9.q(on8Var.c(), m()), n()), 160);
        }
    }

    public final bp e() {
        return (bp) this.g.getValue();
    }

    public final vn9 f() {
        return wn9.O(wn9.q((vn9) this.k.getValue(), m()), n());
    }

    public final nn8 g(int i) {
        Object obj;
        boolean zJ = j();
        hk9 hk9Var = this.a;
        if (zJ) {
            return (nn8) fc1.z0(hk9Var);
        }
        if (i < 0) {
            return (nn8) fc1.z0(hk9Var);
        }
        int size = hk9Var.size();
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = hk9Var.get(i3);
            i2++;
            km7 km7Var = nn8.d;
            xl7 xl7VarB = ((nn8) obj).b(i2, i, i4, false);
            int iIntValue = ((Number) xl7VarB.a).intValue();
            if (xl7VarB.b != null) {
                break;
            }
            i3++;
            i4 = iIntValue;
        }
        return (nn8) obj;
    }

    public final on8 h(int i, boolean z) {
        hk9 hk9Var = this.a;
        if (i < 0) {
            nn8 nn8Var = (nn8) fc1.z0(hk9Var);
            if (nn8Var == null) {
                return null;
            }
            mm7 mm7Var = nn8Var.c;
            mm7Var.getClass();
            return nn8Var.a(mm7Var.a().e.length());
        }
        int size = hk9Var.size();
        int iIntValue = 0;
        for (int i2 = 0; i2 < size; i2++) {
            xl7 xl7VarB = ((nn8) hk9Var.get(i2)).b(i2, i, iIntValue, z);
            Object obj = xl7VarB.b;
            if (obj != null) {
                return (on8) obj;
            }
            iIntValue = ((Number) xl7VarB.a).intValue();
        }
        return null;
    }

    public final ArrayList i(long j) {
        ArrayList arrayList = new ArrayList();
        hk9 hk9Var = this.a;
        int size = hk9Var.size();
        int iIntValue = 0;
        for (int i = 0; i < size; i++) {
            xl7 xl7VarC = ((nn8) hk9Var.get(i)).c(i, iIntValue, j);
            arrayList.addAll((Collection) xl7VarC.b);
            iIntValue = ((Number) xl7VarC.a).intValue();
        }
        return arrayList;
    }

    public final boolean j() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    public final wga k() {
        return (wga) this.c.getValue();
    }

    public final wn8 l() {
        return (wn8) this.o.getValue();
    }

    public final vn9 m() {
        return (vn9) this.m.getValue();
    }

    public final vn9 n() {
        return (vn9) this.n.getValue();
    }

    public final void p(nn8 nn8Var, nn8 nn8Var2) {
        nn8Var2.getClass();
        nn8Var.getClass();
        List list = nn8Var2.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            on8 on8Var = (on8) list.get(i);
            on8Var.getClass();
            on8Var.c = nn8Var;
            on8Var.q(nn8Var);
        }
        nn8Var.a.addAll(list);
        this.a.remove(nn8Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0658  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(wga r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo8.q(wga):void");
    }

    public final void r(vn9 vn9Var) throws Throwable {
        if (wn9.A(f(), vn9Var, false)) {
            this.n.setValue(wn9.q(n(), vn9Var));
            this.m.setValue(wn9.O(m(), vn9Var));
        }
        if (pja.d(k().b)) {
            return;
        }
        d(k().b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        if (r1 == 2) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c A[LOOP:1: B:88:0x016a->B:89:0x016c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String s() {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo8.s():java.lang.String");
    }

    public final void t(vn9 vn9Var) {
        if (wn9.A(f(), vn9Var, false)) {
            r(vn9Var);
            return;
        }
        if (!wn9.A(f(), vn9Var, false)) {
            this.m.setValue(wn9.q(m(), vn9Var));
            this.n.setValue(wn9.O(n(), vn9Var));
        }
        if (pja.d(k().b)) {
            return;
        }
        d(k().b);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo8.u():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo8.v():void");
    }

    public final wga w(nn8 nn8Var, ih7 ih7Var, wga wgaVar) {
        Integer numValueOf;
        int iF;
        int length;
        long j = wgaVar.b;
        mm7 mm7Var = nn8Var.c;
        mm7Var.getClass();
        int length2 = mm7Var.a().e.length();
        int length3 = k().a.b.length();
        bp bpVar = wgaVar.a;
        String str = bpVar.b;
        String str2 = bpVar.b;
        int length4 = length3 - str.length();
        on8 on8VarA = nn8Var.a(-1);
        if (on8VarA != null) {
            int iG = pja.g(on8VarA.f);
            if (iG >= pja.g(j)) {
                iG -= length4;
            }
            numValueOf = Integer.valueOf(iG);
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : pja.g(j);
        nn8Var.c = ih7Var;
        if (length2 == ih7Var.f.e.length()) {
            return wgaVar;
        }
        String strSubstring = str2.substring(0, iIntValue - length2);
        String strSubstring2 = str2.substring(iIntValue);
        int length5 = pja.g(j) > iIntValue ? (ih7Var.f.e.length() + pja.g(j)) - length2 : pja.g(j) == iIntValue ? (ih7Var.f.e.length() + iIntValue) - length2 : pja.g(j);
        if (pja.f(j) > iIntValue) {
            iIntValue = pja.f(j);
            length = ih7Var.f.e.length();
        } else {
            if (pja.f(j) != iIntValue) {
                iF = pja.f(j);
                return wga.b(wgaVar, dx1.h(strSubstring, ih7Var.f.e, strSubstring2), zk9.h(length5, iF), 4);
            }
            length = ih7Var.f.e.length();
        }
        iF = (length + iIntValue) - length2;
        return wga.b(wgaVar, dx1.h(strSubstring, ih7Var.f.e, strSubstring2), zk9.h(length5, iF), 4);
    }

    public final void x(List list) {
        vn9 vn9Var;
        list.getClass();
        hk9 hk9Var = this.a;
        hk9Var.clear();
        hk9Var.addAll(list);
        if (hk9Var.isEmpty()) {
            hk9Var.add(new nn8(null, null, 15));
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = this.e;
        linkedHashSet.clear();
        zo zoVar = new zo();
        int size = hk9Var.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            nn8 nn8Var = (nn8) hk9Var.get(i);
            int iJ = zoVar.j(nn8Var.b.b(nn8Var.c.e(this.t)));
            try {
                mm7 mm7Var = nn8Var.c;
                mm7Var.getClass();
                zoVar.f(mm7Var.a().e);
                mm7 mm7Var2 = nn8Var.c;
                mm7Var2.getClass();
                int length = mm7Var2.a().e.length() + i2;
                nn8Var.c.a().f = zk9.h(i2, length);
                wn8.a.getClass();
                int iK = zoVar.k(qn8.b);
                try {
                    List list2 = nn8Var.a;
                    cl3 cl3Var = new cl3(7, arrayList);
                    list2.getClass();
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        length = md2.s(zoVar, this, (on8) list2.get(i3), length, cl3Var);
                    }
                    if (!j() && i != hk9Var.size() - 1) {
                        zoVar.a.append(' ');
                        length++;
                    }
                    zoVar.h(iJ);
                    i++;
                    i2 = length;
                } finally {
                }
            } catch (Throwable th) {
                zoVar.h(iJ);
                throw th;
            }
        }
        this.g.setValue(zoVar.l());
        jk9 jk9Var = this.d;
        Object it = jk9Var.c.iterator();
        while (((l1) it).hasNext()) {
            String str = (String) ((kr9) it).next();
            if (!linkedHashSet.contains(str)) {
                jk9Var.remove(str);
            }
        }
        hk9 hk9Var2 = this.q;
        hk9Var2.clear();
        String str2 = e().b;
        int length2 = e().b.length();
        this.c.setValue(new wga(str2, zk9.h(length2, length2), 4));
        this.b.setValue(new eo8(this, 1));
        hk9Var2.addAll(arrayList);
        v();
        u();
        vn9 vn9Var2 = new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65535);
        ListIterator listIterator = hk9Var.listIterator();
        while (true) {
            int i4 = 0;
            while (true) {
                em4 em4Var = (em4) listIterator;
                if (!em4Var.hasNext()) {
                    return;
                }
                nn8 nn8Var2 = (nn8) em4Var.next();
                mm7 mm7Var3 = nn8Var2.c;
                if (mm7Var3 instanceof ih7) {
                    i4++;
                    if (i4 == 1) {
                        on8 on8VarA = nn8Var2.a(-1);
                        vn9Var2 = (on8VarA == null || (vn9Var = on8VarA.g) == null) ? new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65535) : vn9Var;
                    }
                    ih7 ih7Var = (ih7) mm7Var3;
                    ih7Var.a = i4;
                    ih7Var.f = ih7Var.g(ih7Var.f.f);
                    ih7Var.b = vn9Var2;
                    ih7Var.e = ih7Var.f();
                }
            }
            vn9Var2 = new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65535);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(wga wgaVar) throws Throwable {
        Class<rn8> cls;
        zo zoVar;
        int i;
        int i2;
        cl3 cl3Var;
        ArrayList arrayList;
        int i3;
        Class<rn8> cls2;
        hk9 hk9Var;
        yn8 yn8Var;
        LinkedHashSet linkedHashSet;
        int iIndexOf;
        fo8 fo8Var = this;
        fo8Var.v = wgaVar;
        boolean zJ = fo8Var.j();
        cn7 cn7Var = fo8Var.p;
        char c = '\n';
        hk9 hk9Var2 = fo8Var.a;
        yn8 yn8Var2 = fo8Var.t;
        boolean z = false;
        Class<rn8> cls3 = rn8.class;
        if (!zJ) {
            int iT = bw9.T(fo8Var.v.a.b);
            while (true) {
                int iD0 = bw9.d0(fo8Var.v.a.b, c, iT, 4);
                if (iD0 < pja.g(fo8Var.k().b)) {
                    break;
                }
                on8 on8VarH = fo8Var.h(iD0, z);
                if (on8VarH == null || (iIndexOf = hk9Var2.indexOf(on8VarH.c)) == -1) {
                    iT = iD0 - 1;
                } else {
                    cn7 cn7Var2 = cn7Var;
                    int iMax = Math.max(iD0, pja.g(on8VarH.f));
                    nn8 nn8Var = on8VarH.c;
                    nn8 nn8Var2 = new nn8(nn8Var.b, nn8Var.c.b(), 3);
                    Class<rn8> cls4 = cls3;
                    int iG = pja.g(nn8Var.c.a().f);
                    long j = on8VarH.f;
                    int length = iMax == iG ? nn8Var.c.a().e.length() + (iMax - pja.g(j)) : iMax - pja.g(j);
                    on8 on8VarA = nn8Var2.c.a();
                    on8VarA.getClass();
                    on8VarA.c = nn8Var2;
                    int i4 = 1;
                    nn8Var2.c.a().f = zk9.h(z ? 1 : 0, nn8Var2.c.a().e.length());
                    String str = on8VarH.e;
                    List list = on8VarH.b;
                    String strSubstring = str.substring(z ? 1 : 0, wx1.Q(length, z ? 1 : 0, str.length()));
                    String str2 = on8VarH.e;
                    String strSubstring2 = str2.substring(wx1.Q(length + 1, z ? 1 : 0, str2.length()));
                    on8VarH.e = strSubstring;
                    on8VarH.f = xv5.d(pja.g(on8VarH.f), pja.g(on8VarH.f), strSubstring);
                    on8 on8Var = new on8(nn8Var2, null, strSubstring2, xv5.d(iMax, iMax, strSubstring2), on8VarH.c(), null, Token.DO);
                    List list2 = nn8Var2.a;
                    list2.add(on8Var);
                    for (int iS = gc1.S(list); -1 < iS; iS--) {
                        on8 on8Var2 = (on8) list.get(iS);
                        list.remove(iS);
                        on8Var2.d = on8Var;
                        on8Var2.c = nn8Var2;
                        on8Var.b.add(on8Var2);
                    }
                    on8 on8Var3 = on8VarH;
                    while (true) {
                        on8 on8Var4 = on8Var3.d;
                        if (on8Var4 == null) {
                            break;
                        }
                        List list3 = on8Var4.b;
                        int iIndexOf2 = list3.indexOf(on8Var3);
                        if (iIndexOf2 >= 0 && iIndexOf2 < list3.size() - 1) {
                            int i5 = iIndexOf2 + 1;
                            Iterator it = new ha5(i5, list3.size() - 1, 1).iterator();
                            while (true) {
                                w21 w21Var = (w21) it;
                                if (!w21Var.d) {
                                    break;
                                }
                                on8 on8Var5 = (on8) list3.get(w21Var.nextInt());
                                on8Var5.o(on8Var5.c());
                                on8Var5.d = null;
                                on8Var5.c = nn8Var2;
                                list2.add(on8Var5);
                            }
                            rw1.U(i5, list3, list3.size());
                        }
                        on8Var3 = on8Var4;
                        z = false;
                        i4 = 1;
                    }
                    int iIndexOf3 = on8VarH.c.a.indexOf(on8Var3);
                    if (iIndexOf3 >= 0 && iIndexOf3 < gc1.S(on8VarH.c.a)) {
                        int i6 = iIndexOf3 + 1;
                        Iterator it2 = new ha5(i6, gc1.S(on8VarH.c.a), i4).iterator();
                        while (true) {
                            w21 w21Var2 = (w21) it2;
                            if (!w21Var2.d) {
                                break;
                            }
                            on8 on8Var6 = (on8) on8VarH.c.a.get(w21Var2.nextInt());
                            on8Var6.o(on8Var6.c());
                            on8Var6.d = null;
                            on8Var6.c = nn8Var2;
                            list2.add(on8Var6);
                        }
                        List list4 = on8VarH.c.a;
                        rw1.U(i6, list4, list4.size());
                    }
                    if (pja.d(fo8Var.v.b) && nn8.e(nn8Var2)) {
                        on8 on8VarA2 = nn8Var2.a(-1);
                        char c2 = (on8VarA2 == null || pja.g(on8VarA2.f) != pja.g(fo8Var.v.b) - 1) ? z ? 1 : 0 : (char) 1;
                        if ((!yn8Var2.h || nn8.e(on8VarH.c)) && c2 != 0) {
                            vn9 vn9Var = new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65535);
                            on8VarA2.getClass();
                            on8VarA2.g = vn9Var;
                            on8VarA2.h = rn8.b;
                        } else if (yn8Var2.h && c2 != 0) {
                            vn9 vn9VarF = fo8Var.f();
                            on8VarA2.getClass();
                            on8VarA2.g = vn9VarF;
                            cn7 cn7Var3 = fo8Var.l;
                            on8VarA2.n(((wn8) cn7Var3.getValue()).getClass() == cls4 ? fo8Var.l() : ug8.a(((wn8) cn7Var3.getValue()).getClass()).equals((a91) cn7Var2.getValue()) ? rn8.b : (wn8) cn7Var3.getValue());
                        }
                    }
                    int i7 = iMax + 1;
                    String strSubstring3 = fo8Var.v.a.b.substring(z ? 1 : 0, i7);
                    String strSubstring4 = fo8Var.v.a.b.substring(i7);
                    wga wgaVar2 = fo8Var.v;
                    mm7 mm7Var = nn8Var2.c;
                    mm7Var.getClass();
                    String strH = dx1.h(strSubstring3, mm7Var.a().e, strSubstring4);
                    int i8 = (int) (fo8Var.v.b >> 32);
                    mm7 mm7Var2 = nn8Var2.c;
                    mm7Var2.getClass();
                    int length2 = mm7Var2.a().e.length() + i8;
                    int i9 = (int) (fo8Var.v.b & 4294967295L);
                    mm7 mm7Var3 = nn8Var2.c;
                    mm7Var3.getClass();
                    fo8Var.v = wga.b(wgaVar2, strH, xv5.d(i9, length2, mm7Var3.a().e), 4);
                    hk9Var2.add(iIndexOf + 1, nn8Var2);
                    mm7 mm7Var4 = nn8Var2.c;
                    if (mm7Var4 instanceof ih7) {
                        fo8Var.v = fo8Var.b(iIndexOf + 2, ((ih7) mm7Var4).a + 1, fo8Var.v);
                    }
                    iT = iD0 - 1;
                    cls3 = cls4;
                    cn7Var = cn7Var2;
                    c = '\n';
                }
            }
        }
        Class<rn8> cls5 = cls3;
        cn7 cn7Var4 = cn7Var;
        boolean zQ = lc5.Q(fo8Var.v.a.b, fo8Var.k().a.b);
        cn7 cn7Var5 = fo8Var.c;
        if (!zQ || pja.c(fo8Var.v.b, fo8Var.k().b)) {
            wga wgaVar3 = fo8Var.v;
            wgaVar3.getClass();
            boolean zJ2 = fo8Var.j();
            bp bpVar = wgaVar3.a;
            String strI = zJ2 ? bpVar.b : iw9.I(bpVar.b, '\n', ' ');
            ArrayList arrayList2 = new ArrayList();
            LinkedHashSet linkedHashSet2 = fo8Var.e;
            linkedHashSet2.clear();
            zo zoVar2 = new zo();
            int size = hk9Var2.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                nn8 nn8Var3 = (nn8) hk9Var2.get(i10);
                if (i11 > strI.length()) {
                    hk9Var2.remove(i10);
                    arrayList = arrayList2;
                    zoVar = zoVar2;
                    i = size;
                    cls2 = cls5;
                    hk9Var = hk9Var2;
                    yn8Var = yn8Var2;
                    linkedHashSet = linkedHashSet2;
                    i3 = i10;
                } else {
                    int iJ = zoVar2.j(nn8Var3.b.b(nn8Var3.c.e(yn8Var2)));
                    try {
                        mm7 mm7Var5 = nn8Var3.c;
                        mm7Var5.getClass();
                        zoVar2.f(mm7Var5.a().e);
                        mm7 mm7Var6 = nn8Var3.c;
                        mm7Var6.getClass();
                        int length3 = mm7Var6.a().e.length() + i11;
                        i = size;
                        String str3 = strI;
                        nn8Var3.c.a().f = zk9.h(i11, length3);
                        wn8.a.getClass();
                        int iK = zoVar2.k(qn8.b);
                        try {
                            List list5 = nn8Var3.a;
                            int i12 = i10;
                            long j2 = wgaVar3.b;
                            zo zoVar3 = zoVar2;
                            try {
                                try {
                                    cl3Var = new cl3(6, arrayList2);
                                    list5.getClass();
                                    arrayList = arrayList2;
                                    zoVar = zoVar3;
                                    Class<rn8> cls6 = cls5;
                                    i3 = i12;
                                    strI = str3;
                                    cls2 = cls6;
                                    hk9Var = hk9Var2;
                                    i2 = iK;
                                    yn8Var = yn8Var2;
                                    linkedHashSet = linkedHashSet2;
                                    fo8Var = this;
                                } catch (Throwable th) {
                                    th = th;
                                    zoVar = zoVar3;
                                    i2 = iK;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                i2 = iK;
                                zoVar = zoVar3;
                            }
                            try {
                                int iU = md2.u(zoVar, fo8Var, null, list5, length3, strI, j2, cl3Var);
                                if (!fo8Var.j() && i3 != hk9Var.size() - 1 && iU < strI.length()) {
                                    zoVar.a.append(' ');
                                    iU++;
                                }
                                i11 = iU;
                                try {
                                    zoVar.h(i2);
                                    zoVar.h(iJ);
                                } catch (Throwable th3) {
                                    th = th3;
                                    zoVar.h(iJ);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                zoVar.h(i2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            i2 = iK;
                            zoVar = zoVar2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        zoVar = zoVar2;
                    }
                }
                i10 = i3 + 1;
                zoVar2 = zoVar;
                arrayList2 = arrayList;
                linkedHashSet2 = linkedHashSet;
                hk9Var2 = hk9Var;
                cls5 = cls2;
                size = i;
                yn8Var2 = yn8Var;
            }
            ArrayList arrayList3 = arrayList2;
            LinkedHashSet linkedHashSet3 = linkedHashSet2;
            cls = cls5;
            fo8Var.g.setValue(zoVar2.l());
            jk9 jk9Var = fo8Var.d;
            Iterator it3 = jk9Var.c.iterator();
            while (((l1) it3).hasNext()) {
                String str4 = (String) ((kr9) it3).next();
                if (!linkedHashSet3.contains(str4)) {
                    jk9Var.remove(str4);
                }
            }
            hk9 hk9Var3 = fo8Var.q;
            hk9Var3.clear();
            cn7Var5.setValue(wga.b(wgaVar3, fo8Var.e().b, 0L, 6));
            fo8Var.b.setValue(new eo8(fo8Var, 0));
            hk9Var3.addAll(arrayList3);
        } else {
            cn7Var5.setValue(fo8Var.v);
            cls = cls5;
        }
        fo8Var.m.setValue(new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65535));
        fo8Var.n.setValue(new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65535));
        fo8Var.o.setValue(rn8.b);
        cn7Var4.setValue(ug8.a(cls));
        fo8Var.v();
        fo8Var.u();
        fo8Var.v = new wga((String) null, 0L, 7);
    }

    public fo8() {
        this(gc1.Y(new nn8(null, null, 15)));
    }
}
