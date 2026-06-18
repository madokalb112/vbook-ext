package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class as1 {
    public static final as1 e = new as1("*", "*", lc3.a);
    public final String a;
    public final List b;
    public final String c;
    public final String d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public as1(String str, String str2, List list) {
        this(str + '/' + str2, list);
        str.getClass();
        str2.getClass();
        list.getClass();
        this.c = str;
        this.d = str2;
    }

    public final boolean a(as1 as1Var) {
        boolean zD;
        as1Var.getClass();
        String str = as1Var.d;
        String str2 = as1Var.c;
        if (!lc5.Q(str2, "*") && !iw9.D(str2, this.c, true)) {
            return false;
        }
        if (!lc5.Q(str, "*") && !iw9.D(str, this.d, true)) {
            return false;
        }
        for (bk4 bk4Var : as1Var.b) {
            String str3 = bk4Var.a;
            String str4 = bk4Var.b;
            if (lc5.Q(str3, "*")) {
                if (!lc5.Q(str4, "*")) {
                    List list = this.b;
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (iw9.D(((bk4) it.next()).b, str4, true)) {
                            }
                        }
                    }
                    zD = false;
                }
                zD = true;
                break;
            }
            String strB = b(str3);
            if (!lc5.Q(str4, "*")) {
                zD = iw9.D(strB, str4, true);
            } else {
                if (strB != null) {
                    zD = true;
                    break;
                    break;
                }
                zD = false;
            }
            if (!zD) {
                return false;
            }
        }
        return true;
    }

    public final String b(String str) {
        str.getClass();
        List list = this.b;
        int iS = gc1.S(list);
        if (iS < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            bk4 bk4Var = (bk4) list.get(i);
            if (iw9.D(bk4Var.a, str, true)) {
                return bk4Var.b;
            }
            if (i == iS) {
                return null;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (defpackage.iw9.D(r1.b, r7, true) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.as1 c(java.lang.String r7) {
        /*
            r6 = this;
            java.util.List r0 = r6.b
            int r1 = r0.size()
            java.lang.String r2 = "charset"
            if (r1 == 0) goto L4d
            r3 = 1
            if (r1 == r3) goto L35
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L14
            goto L4d
        L14:
            java.util.Iterator r1 = r0.iterator()
        L18:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r1.next()
            bk4 r4 = (defpackage.bk4) r4
            java.lang.String r5 = r4.a
            boolean r5 = defpackage.iw9.D(r5, r2, r3)
            if (r5 == 0) goto L18
            java.lang.String r4 = r4.b
            boolean r4 = defpackage.iw9.D(r4, r7, r3)
            if (r4 == 0) goto L18
            goto L4c
        L35:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            bk4 r1 = (defpackage.bk4) r1
            java.lang.String r4 = r1.a
            boolean r4 = defpackage.iw9.D(r4, r2, r3)
            if (r4 == 0) goto L4d
            java.lang.String r1 = r1.b
            boolean r1 = defpackage.iw9.D(r1, r7, r3)
            if (r1 == 0) goto L4d
        L4c:
            return r6
        L4d:
            as1 r1 = new as1
            bk4 r3 = new bk4
            r3.<init>(r2, r7)
            java.util.ArrayList r7 = defpackage.fc1.J0(r0, r3)
            java.lang.String r0 = r6.c
            java.lang.String r2 = r6.d
            java.lang.String r6 = r6.a
            r1.<init>(r0, r2, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as1.c(java.lang.String):as1");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof as1)) {
            return false;
        }
        as1 as1Var = (as1) obj;
        return iw9.D(this.c, as1Var.c, true) && iw9.D(this.d, as1Var.d, true) && lc5.Q(this.b, as1Var.b);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.c.toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.d.toLowerCase(locale);
        lowerCase2.getClass();
        int iHashCode2 = lowerCase2.hashCode();
        return (this.b.hashCode() * 31) + iHashCode2 + (iHashCode * 31) + iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119 A[LOOP:1: B:12:0x0044->B:62:0x0119, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011d A[EDGE_INSN: B:66:0x011d->B:63:0x011d BREAK  A[LOOP:1: B:12:0x0044->B:62:0x0119], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as1.toString():java.lang.String");
    }

    public as1(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public as1(String str, String str2, String str3, ArrayList arrayList) {
        this(str3, arrayList);
        this.c = str;
        this.d = str2;
    }
}
