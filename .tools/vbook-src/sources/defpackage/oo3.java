package defpackage;

import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oo3 {
    public static final oo3 a = new oo3();

    public static wa2 a(m62 m62Var, String str, String str2) throws ap3 {
        String str3;
        Object pm8Var;
        m62Var.getClass();
        str.getClass();
        Object obj = null;
        wa2 wa2Var = (str2 == null || str2.length() == 0) ? null : (wa2) m62Var.x.T(str2).e();
        if (wa2Var != null) {
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
                boolean z = true;
                if (!patternCompile.matcher(str).matches()) {
                    String strE0 = iw9.K(str, "https://", false) ? bw9.E0(bw9.k0(str, "https://"), '/') : iw9.K(str, "http://", false) ? bw9.E0(bw9.k0(str, "http://"), '/') : bw9.E0(str, '/');
                    strE0.getClass();
                    if (!patternCompile.matcher(strE0).matches()) {
                        z = false;
                    }
                }
                pm8Var = Boolean.valueOf(z);
            } catch (Throwable th) {
                pm8Var = new pm8(th);
            }
            if (pm8Var instanceof pm8) {
                pm8Var = null;
            }
            Boolean bool = (Boolean) pm8Var;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                obj = next;
                break;
            }
        }
        re4 re4Var = (re4) obj;
        if (re4Var == null || (str3 = re4Var.a) == null) {
            throw new ap3();
        }
        wa2 wa2Var2 = (wa2) b92Var.T(str3).e();
        if (wa2Var2 != null) {
            return wa2Var2;
        }
        throw new ap3();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.m62 r35, java.lang.String r36, java.lang.String r37, boolean r38, byte[] r39, defpackage.kt1 r40) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo3.b(m62, java.lang.String, java.lang.String, boolean, byte[], kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r27, byte[] r28, defpackage.kt1 r29) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo3.c(java.lang.String, byte[], kt1):java.lang.Object");
    }
}
