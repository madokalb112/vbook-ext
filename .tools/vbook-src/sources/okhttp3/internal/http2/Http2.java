package okhttp3.internal.http2;

import defpackage.av0;
import defpackage.ky0;
import defpackage.ra1;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Http2 {
    public static final av0 a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
        av0 av0Var = av0.d;
        a = ra1.s("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String strReplace = _UtilJvmKt.d("%8s", binaryString).replace(' ', '0');
            strReplace.getClass();
            strArr[i] = strReplace;
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = ky0.s(strArr2[i2], "|PADDED", new StringBuilder());
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = ky0.s(strArr3[i4], "|PADDED", sb);
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    public static String a(int i) {
        String[] strArr = b;
        return i < strArr.length ? strArr[i] : _UtilJvmKt.d("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            java.lang.String r0 = a(r7)
            if (r8 != 0) goto L9
            java.lang.String r7 = ""
            goto L58
        L9:
            r1 = 2
            java.lang.String[] r2 = okhttp3.internal.http2.Http2.d
            if (r7 == r1) goto L56
            r1 = 3
            if (r7 == r1) goto L56
            r1 = 4
            if (r7 == r1) goto L4d
            r1 = 6
            if (r7 == r1) goto L4d
            r1 = 7
            if (r7 == r1) goto L56
            r1 = 8
            if (r7 == r1) goto L56
            java.lang.String[] r1 = okhttp3.internal.http2.Http2.c
            int r3 = r1.length
            if (r8 >= r3) goto L29
            r1 = r1[r8]
            r1.getClass()
            goto L2b
        L29:
            r1 = r2[r8]
        L2b:
            r2 = 5
            r3 = 0
            if (r7 != r2) goto L3c
            r2 = r8 & 4
            if (r2 == 0) goto L3c
            java.lang.String r7 = "HEADERS"
            java.lang.String r8 = "PUSH_PROMISE"
            java.lang.String r7 = defpackage.iw9.H(r1, r3, r7, r8)
            goto L58
        L3c:
            if (r7 != 0) goto L4b
            r7 = r8 & 32
            if (r7 == 0) goto L4b
            java.lang.String r7 = "PRIORITY"
            java.lang.String r8 = "COMPRESSED"
            java.lang.String r7 = defpackage.iw9.H(r1, r3, r7, r8)
            goto L58
        L4b:
            r7 = r1
            goto L58
        L4d:
            r7 = 1
            if (r8 != r7) goto L53
            java.lang.String r7 = "ACK"
            goto L58
        L53:
            r7 = r2[r8]
            goto L58
        L56:
            r7 = r2[r8]
        L58:
            if (r4 == 0) goto L5d
            java.lang.String r4 = "<<"
            goto L5f
        L5d:
            java.lang.String r4 = ">>"
        L5f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r0, r7}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = okhttp3.internal._UtilJvmKt.d(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2.b(boolean, int, int, int, int):java.lang.String");
    }

    public static String c(int i, long j, int i2, boolean z) {
        return _UtilJvmKt.d("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), a(8), Long.valueOf(j));
    }
}
