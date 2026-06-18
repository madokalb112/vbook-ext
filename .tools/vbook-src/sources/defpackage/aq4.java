package defpackage;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class aq4 {
    public static final aq4 a = new aq4();
    public static final d6a b = new d6a(new un4(6));

    public static void a(HashMap map, int i, int i2, String str) {
        Integer numValueOf = Integer.valueOf(i);
        Object arrayList = map.get(numValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(numValueOf, arrayList);
        }
        ((List) arrayList).add(new yp4(i2, str));
    }

    public static String b(long j, String str) {
        if (lc1.d(j, lc1.j)) {
            return null;
        }
        int iQ = wx1.Q((int) (lc1.i(j) * 255.0f), 0, 255);
        int iQ2 = wx1.Q((int) (lc1.h(j) * 255.0f), 0, 255);
        int iQ3 = wx1.Q((int) (lc1.f(j) * 255.0f), 0, 255);
        gjb.X(16);
        String string = Integer.toString(iQ, 16);
        string.getClass();
        String strI0 = bw9.i0(2, string);
        gjb.X(16);
        String string2 = Integer.toString(iQ2, 16);
        string2.getClass();
        String strI02 = bw9.i0(2, string2);
        gjb.X(16);
        String string3 = Integer.toString(iQ3, 16);
        string3.getClass();
        return str + ":#" + strI0 + strI02 + bw9.i0(2, string3);
    }

    public static String c(String str) {
        return iw9.H(iw9.H(iw9.H(iw9.H(iw9.H(str, false, "&", "&amp;"), false, "<", "&lt;"), false, ">", "&gt;"), false, "\"", "&quot;"), false, "'", "&#39;");
    }

    public static bp d(String str) {
        str.getClass();
        xq4 xq4Var = new xq4();
        return e().d(xq4Var.q(new StringReader(str), "", new is(xq4Var)).Y());
    }

    public static bq4 e() {
        return (bq4) b.getValue();
    }

    public static zx2 f(String str) {
        str.getClass();
        xq4 xq4Var = new xq4();
        return xq4Var.q(new StringReader(str), "", new is(xq4Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0097, code lost:
    
        r0 = r6 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static bp g(bp r10) {
        /*
            r10.getClass()
            java.lang.String r0 = r10.b
            int r1 = r0.length()
            mz7[] r2 = new defpackage.mz7[r1]
            r3 = 0
            r4 = r3
        Ld:
            if (r4 >= r1) goto L1d
            mz7 r5 = new mz7
            char r6 = r0.charAt(r4)
            r5.<init>(r6, r4)
            r2[r4] = r5
            int r4 = r4 + 1
            goto Ld
        L1d:
            r0 = r3
        L1e:
            r4 = 0
            r5 = 1
            if (r3 >= r1) goto L36
            r0 = r2[r3]
            if (r0 == 0) goto L37
            char r0 = r0.a
            boolean r0 = defpackage.gjb.h0(r0)
            if (r0 != r5) goto L37
            r2[r3] = r4
            int r0 = r3 + 1
            r9 = r3
            r3 = r0
            r0 = r9
            goto L1e
        L36:
            r3 = r0
        L37:
            int r1 = r1 - r5
            r0 = -1
            r6 = r0
        L3a:
            if (r0 >= r1) goto L50
            r6 = r2[r1]
            if (r6 == 0) goto L51
            char r6 = r6.a
            boolean r6 = defpackage.gjb.h0(r6)
            if (r6 != r5) goto L51
            r2[r1] = r4
            int r6 = r1 + (-1)
            r9 = r6
            r6 = r1
            r1 = r9
            goto L3a
        L50:
            r1 = r6
        L51:
            r0 = r3
        L52:
            if (r0 > r1) goto L9b
            r6 = r2[r0]
            if (r6 == 0) goto L99
            char r6 = r6.a
            r7 = 10
            if (r6 == r7) goto L62
            r8 = 13
            if (r6 != r8) goto L99
        L62:
            mz7 r6 = new mz7
            r6.<init>(r7, r0)
            r2[r0] = r6
            int r6 = r0 + (-1)
            if (r3 > r6) goto L80
        L6d:
            r7 = r2[r6]
            if (r7 == 0) goto L80
            char r7 = r7.a
            boolean r7 = defpackage.gjb.h0(r7)
            if (r7 != r5) goto L80
            r2[r6] = r4
            if (r6 == r3) goto L80
            int r6 = r6 + (-1)
            goto L6d
        L80:
            int r6 = r0 + 1
            if (r6 > r1) goto L99
        L84:
            r7 = r2[r6]
            if (r7 == 0) goto L97
            char r7 = r7.a
            boolean r7 = defpackage.gjb.h0(r7)
            if (r7 != r5) goto L97
            r2[r6] = r4
            if (r6 == r1) goto L99
            int r6 = r6 + 1
            goto L84
        L97:
            int r0 = r6 + (-1)
        L99:
            int r0 = r0 + r5
            goto L52
        L9b:
            i21 r0 = new i21
            java.util.ArrayList r1 = defpackage.fw.i0(r2)
            r0.<init>(r1)
            bp r10 = r0.e(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq4.g(bp):bp");
    }

    public static final void h(ArrayList arrayList, ArrayList arrayList2, String str) {
        arrayList.add("<" + str + ">");
        arrayList2.add(0, "</" + str + ">");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String i(bp r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq4.i(bp):java.lang.String");
    }
}
