package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h13 {
    public final is4 a;
    public final m62 b;
    public final f4b c;
    public final sv8 d;
    public final ho1 e;
    public final Object f = new Object();
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashSet h = new LinkedHashSet();

    public h13(is4 is4Var, m62 m62Var, f4b f4bVar, sv8 sv8Var, ho1 ho1Var) {
        this.a = is4Var;
        this.b = m62Var;
        this.c = f4bVar;
        this.d = sv8Var;
        this.e = ho1Var;
    }

    public static final void a(h13 h13Var, String str) {
        synchronized (h13Var.f) {
            h13Var.g.remove(str);
            h13Var.h.remove(str);
        }
    }

    public static final void d(qg8 qg8Var, h13 h13Var, xa8 xa8Var, String str, boolean z) {
        long jC = r95.a.k().c();
        if (z || jC - qg8Var.a > 1000) {
            qg8Var.a = jC;
            b92 b92Var = h13Var.b.u;
            int i = xa8Var.b;
            int i2 = xa8Var.c;
            b92Var.getClass();
            str.getClass();
            ((qj) ((yf1) b92Var).a).q(542192517, "UPDATE DbDownload\nSET downloaded = ?,\n    total = ?\nWHERE id = ?", new x92(b92Var, i, i2, str));
            b92Var.w(542192517, new q92(17));
        }
    }

    public final void b() {
        List listZ0;
        synchronized (this.f) {
            listZ0 = fc1.Z0(this.g.values());
            this.g.clear();
            this.h.clear();
        }
        Iterator it = listZ0.iterator();
        while (it.hasNext()) {
            try {
                ((nf1) it.next()).e();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.wa2 r12, defpackage.kt1 r13) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h13.c(wa2, kt1):java.lang.Object");
    }

    public final xa8 e(a82 a82Var, int i, int i2) {
        Map map = a82Var.b;
        String str = a82Var.a;
        String strE = ((j4b) this.c).e(map, str, a82Var.l);
        b92 b92Var = this.b.u;
        ha2 ha2Var = (ha2) b92Var.T(str).e();
        Integer numValueOf = ha2Var != null ? Integer.valueOf(ha2Var.k) : null;
        int i3 = 0;
        boolean z = (numValueOf != null && numValueOf.intValue() == 0) || (numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 2);
        int i4 = (!z || ha2Var == null) ? 0 : ha2Var.h;
        if (z && ha2Var != null) {
            i3 = ha2Var.i;
        }
        int i5 = i3;
        xa8 xa8Var = new xa8(1);
        xa8Var.b = i4;
        xa8Var.c = i5;
        String str2 = a82Var.a;
        String str3 = a82Var.d;
        String str4 = a82Var.j;
        int i6 = a82Var.e;
        long jC = (!z || ha2Var == null) ? r95.a.k().c() : ha2Var.l;
        b92Var.j0(new ha2(str2, str2, strE, str3, str4, i, i2, i4, i5, i6, 0, jC));
        return xa8Var;
    }

    public final wa2 f(a82 a82Var) throws ap3 {
        Object obj;
        String str;
        Object pm8Var;
        wa2 wa2Var;
        String str2 = a82Var.l;
        String str3 = a82Var.j;
        m62 m62Var = this.b;
        if (str2 != null && str2.length() != 0 && (wa2Var = (wa2) m62Var.x.T(str2).e()) != null) {
            return wa2Var;
        }
        b92 b92Var = m62Var.x;
        Iterator it = b92Var.c0().c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            boolean zBooleanValue = false;
            try {
                String str4 = ((re4) next).b;
                str4.getClass();
                Pattern patternCompile = Pattern.compile(str4);
                patternCompile.getClass();
                str3.getClass();
                boolean z = true;
                if (!patternCompile.matcher(str3).matches()) {
                    String strE0 = iw9.K(str3, "https://", false) ? bw9.E0(bw9.k0(str3, "https://"), '/') : iw9.K(str3, "http://", false) ? bw9.E0(bw9.k0(str3, "http://"), '/') : bw9.E0(str3, '/');
                    strE0.getClass();
                    if (!patternCompile.matcher(strE0).matches()) {
                        z = false;
                    }
                }
                pm8Var = Boolean.valueOf(z);
            } catch (Throwable th) {
                pm8Var = new pm8(th);
            }
            Boolean bool = (Boolean) (pm8Var instanceof pm8 ? null : pm8Var);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                obj = next;
                break;
            }
        }
        re4 re4Var = (re4) obj;
        if (re4Var == null || (str = re4Var.a) == null) {
            throw new ap3();
        }
        wa2 wa2Var2 = (wa2) b92Var.T(str).e();
        if (wa2Var2 != null) {
            return wa2Var2;
        }
        throw new ap3();
    }

    public final Object g(String str, kt1 kt1Var) throws Throwable {
        synchronized (this.f) {
            this.h.remove(str);
        }
        ha2 ha2Var = (ha2) this.b.u.T(str).e();
        if (ha2Var == null) {
            return heb.a;
        }
        String str2 = ha2Var.b;
        int i = ha2Var.f;
        Object objH = h(str2, i, ha2Var.g - i, false, kt1Var);
        return objH == xx1.a ? objH : heb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r23, int r24, int r25, boolean r26, defpackage.kt1 r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h13.h(java.lang.String, int, int, boolean, kt1):java.lang.Object");
    }
}
