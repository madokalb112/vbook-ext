package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class d56 {
    public static final j00 a;
    public static final j00 b;
    public static final y91 c;

    static {
        fbb fbbVarD;
        a91 a91VarA = ug8.a(os4.class);
        fbb fbbVarD2 = null;
        try {
            fbbVarD = ug8.d(os4.class);
        } catch (Throwable unused) {
            fbbVarD = null;
        }
        a = new j00("CallLogger", new bbb(a91VarA, fbbVarD));
        a91 a91VarA2 = ug8.a(heb.class);
        try {
            fbbVarD2 = ug8.d(heb.class);
        } catch (Throwable unused2) {
        }
        b = new j00("DisableLogging", new bbb(a91VarA2, fbbVarD2));
        c = new y91("Logging", s46.a, new rv5(17));
    }

    public static final boolean a(y36 y36Var) {
        return y36Var == y36.BODY || y36Var == y36.ALL;
    }

    public static final boolean b(y36 y36Var) {
        return y36Var == y36.HEADERS;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.x91 r11, defpackage.mc8 r12, defpackage.wh7 r13, defpackage.gu4 r14, defpackage.ek4 r15, java.util.List r16, defpackage.kt1 r17) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d56.c(x91, mc8, wh7, gu4, ek4, java.util.List, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.mc8 r8, defpackage.wh7 r9, java.lang.Long r10, defpackage.ek4 r11, defpackage.gu4 r12, java.util.List r13, defpackage.ut0 r14, defpackage.kt1 r15) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d56.d(mc8, wh7, java.lang.Long, ek4, gu4, java.util.List, ut0, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.mc8 r8, defpackage.gv4 r9, defpackage.ut0 r10, java.util.List r11, defpackage.kt1 r12) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d56.e(mc8, gv4, ut0, java.util.List, kt1):java.lang.Object");
    }

    public static final Object f(i46 i46Var, y36 y36Var, List list, xu4 xu4Var, t46 t46Var) throws IOException {
        Charset charsetA;
        Object obj = xu4Var.d;
        obj.getClass();
        wh7 wh7Var = (wh7) obj;
        os4 os4Var = new os4(i46Var);
        xu4Var.f.f(a, os4Var);
        StringBuilder sb = new StringBuilder();
        if (y36Var.a) {
            StringBuilder sb2 = new StringBuilder("REQUEST: ");
            rcb rcbVar = xu4Var.a;
            rcbVar.getClass();
            rcb rcbVar2 = new rcb();
            ql9.E(rcbVar2, rcbVar);
            sb2.append(rcbVar2.b());
            sb.append(sb2.toString());
            sb.append('\n');
            sb.append("METHOD: " + xu4Var.b);
            sb.append('\n');
        }
        if (y36Var.b) {
            sb.append("COMMON HEADERS\n");
            fx1.z0(sb, xu4Var.c.b(), list);
            sb.append("CONTENT HEADERS");
            sb.append('\n');
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw j39.h(it);
            }
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw j39.h(it2);
            }
            Long lA = wh7Var.a();
            if (lA != null) {
                fx1.y0("Content-Length", String.valueOf(lA.longValue()), sb);
            }
            as1 as1VarB = wh7Var.b();
            if (as1VarB != null) {
                fx1.y0("Content-Type", as1VarB.toString(), sb);
            }
            fx1.z0(sb, wh7Var.c().b(), list);
        }
        String string = sb.toString();
        if (string.length() > 0) {
            os4Var.c(string);
        }
        if (string.length() == 0 || !y36Var.c) {
            os4Var.a();
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("BODY Content-Type: " + wh7Var.b());
        sb3.append('\n');
        as1 as1VarB2 = wh7Var.b();
        if (as1VarB2 == null || (charsetA = ds1.a(as1VarB2)) == null) {
            charsetA = q31.a;
        }
        Charset charset = charsetA;
        jt0 jt0Var = new jt0(false);
        aj2 aj2Var = rw2.a;
        k76 k76Var = new k76();
        aj2Var.getClass();
        ah1.J(yf4.a, gx1.T(aj2Var, k76Var), null, new ug(jt0Var, charset, sb3, os4Var, null, 17), 2);
        return e11.R(wh7Var, jt0Var, t46Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x027d, code lost:
    
        if (r2 == r7) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0299, code lost:
    
        if (r2 == r7) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(java.util.List r23, defpackage.y36 r24, defpackage.x91 r25, defpackage.mc8 r26, defpackage.xu4 r27, java.util.ArrayList r28, defpackage.kt1 r29) {
        /*
            Method dump skipped, instruction units count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d56.g(java.util.List, y36, x91, mc8, xu4, java.util.ArrayList, kt1):java.lang.Object");
    }

    public static final void h(y36 y36Var, StringBuilder sb, wu4 wu4Var, Throwable th) {
        if (y36Var.a) {
            sb.append("RESPONSE " + wu4Var.getUrl() + " failed with exception: " + th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(java.util.List r22, defpackage.y36 r23, defpackage.mc8 r24, defpackage.gv4 r25, java.util.ArrayList r26, defpackage.kt1 r27) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d56.i(java.util.List, y36, mc8, gv4, java.util.ArrayList, kt1):java.lang.Object");
    }
}
