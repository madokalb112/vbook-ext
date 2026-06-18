package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w4c {
    public static final iz7 f = new iz7(7);
    public static final byte[] g = {80, 75, 5, 6};
    public final yy a;
    public final boolean b;
    public final String c;
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();

    public w4c(yy yyVar, boolean z, String str) {
        this.a = yyVar;
        this.b = z;
        this.c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0234, code lost:
    
        if (r1 != r12) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02e6, code lost:
    
        if (r1 == r12) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x035d, code lost:
    
        if (r1 != r12) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0217 A[PHI: r0 r1 r3 r9 r10 r11
  0x0217: PHI (r0v24 int) = (r0v17 int), (r0v26 int) binds: [B:18:0x00d7, B:46:0x0213] A[DONT_GENERATE, DONT_INLINE]
  0x0217: PHI (r1v36 java.lang.Object) = (r1v1 java.lang.Object), (r1v42 java.lang.Object) binds: [B:18:0x00d7, B:46:0x0213] A[DONT_GENERATE, DONT_INLINE]
  0x0217: PHI (r3v34 long) = (r3v16 long), (r3v35 long) binds: [B:18:0x00d7, B:46:0x0213] A[DONT_GENERATE, DONT_INLINE]
  0x0217: PHI (r9v10 java.util.Iterator) = (r9v7 java.util.Iterator), (r9v11 java.util.Iterator) binds: [B:18:0x00d7, B:46:0x0213] A[DONT_GENERATE, DONT_INLINE]
  0x0217: PHI (r10v6 w4c) = (r10v4 w4c), (r10v7 w4c) binds: [B:18:0x00d7, B:46:0x0213] A[DONT_GENERATE, DONT_INLINE]
  0x0217: PHI (r11v5 java.lang.String) = (r11v3 java.lang.String), (r11v6 java.lang.String) binds: [B:18:0x00d7, B:46:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0464 -> B:13:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0234 -> B:51:0x0238). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.w4c r45, defpackage.kt1 r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w4c.a(w4c, kt1):java.lang.Object");
    }

    public final String b(String str) {
        str.getClass();
        if (this.b) {
            return bw9.C0(str, '/');
        }
        String lowerCase = bw9.C0(str, '/').toLowerCase();
        lowerCase.getClass();
        return lowerCase;
    }

    public final String toString() {
        return xv5.s(new StringBuilder("ZipFile("), this.c, ')');
    }
}
