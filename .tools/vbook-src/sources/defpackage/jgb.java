package defpackage;

import android.net.Uri;
import android.provider.DocumentsContract;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class jgb {
    public static final String[] a = {"_display_name", "_size"};
    public static final String[] b = {"_display_name"};
    public static final yg8 c = new yg8("^\\d+(?:\\.[A-Za-z0-9]+)?$");

    public static Long a(Uri uri) {
        Object pm8Var;
        Object pm8Var2;
        Long lN;
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null && (lN = iw9.N(lastPathSegment)) != null) {
            return Long.valueOf(lN.longValue());
        }
        try {
            pm8Var = DocumentsContract.getDocumentId(uri);
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        if (pm8Var instanceof pm8) {
            pm8Var = null;
        }
        String str = (String) pm8Var;
        if (str == null) {
            try {
                pm8Var2 = DocumentsContract.getTreeDocumentId(uri);
            } catch (Throwable th2) {
                pm8Var2 = new pm8(th2);
            }
            if (pm8Var2 instanceof pm8) {
                pm8Var2 = null;
            }
            str = (String) pm8Var2;
            if (str == null) {
                return null;
            }
        }
        return iw9.N(bw9.t0(':', str, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[PHI: r0
  0x0032: PHI (r0v11 java.lang.String) = (r0v6 java.lang.String), (r0v13 java.lang.String) binds: [B:19:0x0042, B:14:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.net.Uri r5, java.lang.String r6) {
        /*
            boolean r0 = c(r5)
            java.lang.String r1 = ""
            if (r0 == 0) goto L84
            java.util.List r0 = r5.getPathSegments()
            java.lang.String r2 = "picker"
            int r2 = r0.indexOf(r2)
            r3 = -1
            r4 = 0
            if (r2 != r3) goto L18
            r0 = r4
            goto L20
        L18:
            int r2 = r2 + 2
            java.lang.Object r0 = defpackage.fc1.A0(r2, r0)
            java.lang.String r0 = (java.lang.String) r0
        L20:
            r2 = 46
            if (r0 == 0) goto L34
            java.lang.String r0 = defpackage.bw9.t0(r2, r0, r0)
            boolean r3 = defpackage.bw9.a0(r0)
            if (r3 != 0) goto L2f
            goto L30
        L2f:
            r0 = r4
        L30:
            if (r0 == 0) goto L34
        L32:
            r4 = r0
            goto L45
        L34:
            java.lang.String r0 = r5.getAuthority()
            if (r0 == 0) goto L45
            java.lang.String r0 = defpackage.bw9.t0(r2, r0, r0)
            boolean r2 = defpackage.bw9.a0(r0)
            if (r2 != 0) goto L45
            goto L32
        L45:
            java.lang.Long r0 = a(r5)
            if (r0 == 0) goto L55
            long r2 = r0.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            if (r0 != 0) goto L59
        L55:
            java.lang.String r0 = r5.getLastPathSegment()
        L59:
            if (r4 == 0) goto L64
            if (r0 == 0) goto L64
            java.lang.String r5 = "-"
            java.lang.String r1 = defpackage.dx1.h(r4, r5, r0)
            goto L6c
        L64:
            if (r4 != 0) goto L6b
            if (r0 != 0) goto L69
            goto L6c
        L69:
            r1 = r0
            goto L6c
        L6b:
            r1 = r4
        L6c:
            int r5 = r1.length()
            if (r5 != 0) goto L73
            goto L83
        L73:
            if (r6 == 0) goto L83
            boolean r5 = defpackage.bw9.a0(r6)
            if (r5 == 0) goto L7c
            goto L83
        L7c:
            java.lang.String r5 = "."
            java.lang.String r5 = defpackage.dx1.h(r1, r5, r6)
            return r5
        L83:
            return r1
        L84:
            java.lang.String r5 = r5.getLastPathSegment()
            if (r5 != 0) goto L8b
            return r1
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgb.b(android.net.Uri, java.lang.String):java.lang.String");
    }

    public static boolean c(Uri uri) {
        if (iw9.D(uri.getScheme(), "content", true)) {
            List<String> pathSegments = uri.getPathSegments();
            boolean z = pathSegments.contains("picker") || pathSegments.contains("photopicker");
            String authority = uri.getAuthority();
            if (authority != null) {
                int iHashCode = authority.hashCode();
                if (iHashCode != 103772132) {
                    if (iHashCode == 1901613822 && authority.equals("com.android.providers.media.photopicker")) {
                        return true;
                    }
                } else if (authority.equals("media")) {
                    return z;
                }
            }
        }
        return false;
    }
}
