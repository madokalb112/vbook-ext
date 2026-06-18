package defpackage;

import android.os.Build;
import android.webkit.WebView;
import com.google.android.gms.internal.firebase-auth-api.zzajb;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class un9 {
    public static final void a(dd4 dd4Var, ou6 ou6Var) {
        ef efVar = ef.l;
        int iHashCode = Long.hashCode(dd4Var.T);
        ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
        lr7 lr7VarL = dd4Var.l();
        ml1.k.getClass();
        um1 um1Var = ll1.b;
        dd4Var.j0();
        if (dd4Var.S) {
            dd4Var.k(um1Var);
        } else {
            dd4Var.s0();
        }
        s(ll1.f, dd4Var, efVar);
        s(ll1.e, dd4Var, lr7VarL);
        r(dd4Var, ll1.h);
        s(ll1.d, dd4Var, ou6VarL0);
        s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
        dd4Var.q(true);
    }

    public static final void b(boolean z, u4b u4bVar, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i) {
        int i2;
        ou6 ou6Var2;
        u4bVar.getClass();
        ib4Var.getClass();
        dd4Var.h0(-1069997233);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (dd4Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(u4bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            ou6Var2 = ou6Var;
            i2 |= dd4Var.f(ou6Var2) ? 256 : Token.CASE;
        } else {
            ou6Var2 = ou6Var;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.h(ib4Var) ? 2048 : 1024;
        }
        if (dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new uha(13);
                dd4Var.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.l((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new uha(14);
                dd4Var.p0(objQ2);
            }
            kf0.d(z, ou6Var2, be3VarA, cj3VarD.a(wd3.p((kb4) objQ2)), (String) null, jf0.G(277089143, new jca(i3, u4bVar, ib4Var), dd4Var), dd4Var, (i2 & 14) | 200064 | ((i2 >> 3) & Token.ASSIGN_MOD), 16);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new p41(z, u4bVar, ou6Var, ib4Var, i);
        }
    }

    public static final long c(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = b3b.c;
        return jFloatToRawIntBits;
    }

    public static final LinkedHashMap d(ArrayList arrayList) {
        String str = zn7.b;
        zn7 zn7VarB = xn7.b("/", false);
        LinkedHashMap linkedHashMapS = y86.S(new xl7(zn7VarB, new r4c(zn7VarB, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (r4c r4cVar : fc1.R0(new cd9(21), arrayList)) {
            if (((r4c) linkedHashMapS.put(r4cVar.a, r4cVar)) == null) {
                while (true) {
                    zn7 zn7Var = r4cVar.a;
                    zn7 zn7VarC = zn7Var.c();
                    if (zn7VarC != null) {
                        r4c r4cVar2 = (r4c) linkedHashMapS.get(zn7VarC);
                        if (r4cVar2 != null) {
                            r4cVar2.q.add(zn7Var);
                            break;
                        }
                        r4c r4cVar3 = new r4c(zn7VarC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMapS.put(zn7VarC, r4cVar3);
                        r4cVar3.q.add(zn7Var);
                        r4cVar = r4cVar3;
                    }
                }
            }
        }
        return linkedHashMapS;
    }

    public static final boolean e(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return lc5.Q(bw9.B0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static String f(xu0 xu0Var) {
        StringBuilder sb = new StringBuilder(xu0Var.size());
        for (int i = 0; i < xu0Var.size(); i++) {
            byte bA = xu0Var.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static InvocationHandler g() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = cr.C();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                sy3.o(e);
                return null;
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static final void h(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = ml4.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static final String i(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? cw9.s(fc1.D0(collection, ",\n", "\n", "\n", null, 56), "    ").concat("},") : " }";
    }

    public static final String j(int i) {
        gjb.X(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    public static final long k(int i, byte[] bArr) {
        return (((long) bArr[i + 7]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
    }

    public static final void l(dd4 dd4Var, Integer num, yb4 yb4Var) {
        if (dd4Var.S) {
            dd4Var.b(num, yb4Var);
        }
    }

    public static String m(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            gp.l("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:14|15|16|(8:18|139|19|(3:21|(2:53|54)(4:24|140|25|(2:27|(2:36|37)(6:31|135|32|33|35|(1:49)(1:50)))(2:39|40))|(1:65)(1:66))|133|55|56|(0)(0))|69|125|70|(4:73|(3:75|(2:77|145)(1:144)|80)(3:143|81|82)|(4:93|119|94|95)(1:96)|71)|130|83|84|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:18|(2:139|19)|(3:21|(2:53|54)(4:24|140|25|(2:27|(2:36|37)(6:31|135|32|33|35|(1:49)(1:50)))(2:39|40))|(1:65)(1:66))|133|55|56|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0197, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0198, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a A[Catch: all -> 0x014b, TryCatch #7 {all -> 0x014b, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007b, B:18:0x0085, B:66:0x014a, B:62:0x0143, B:69:0x014f, B:93:0x01a5, B:96:0x01b2, B:90:0x019f, B:103:0x01be, B:106:0x01ca, B:107:0x01d1, B:108:0x01d2, B:109:0x01d5, B:110:0x01d6, B:111:0x01eb, B:59:0x013e, B:70:0x015f, B:73:0x0165, B:75:0x0171, B:77:0x017f, B:80:0x0186, B:81:0x018a, B:82:0x0191, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:100:0x01b6, B:101:0x01bb, B:87:0x019a, B:19:0x008e, B:21:0x0097, B:24:0x00a8, B:50:0x012d, B:46:0x0126, B:53:0x0131, B:54:0x0136), top: B:132:0x000d, inners: #2, #3, #4, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a5 A[Catch: all -> 0x014b, TRY_LEAVE, TryCatch #7 {all -> 0x014b, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007b, B:18:0x0085, B:66:0x014a, B:62:0x0143, B:69:0x014f, B:93:0x01a5, B:96:0x01b2, B:90:0x019f, B:103:0x01be, B:106:0x01ca, B:107:0x01d1, B:108:0x01d2, B:109:0x01d5, B:110:0x01d6, B:111:0x01eb, B:59:0x013e, B:70:0x015f, B:73:0x0165, B:75:0x0171, B:77:0x017f, B:80:0x0186, B:81:0x018a, B:82:0x0191, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:100:0x01b6, B:101:0x01bb, B:87:0x019a, B:19:0x008e, B:21:0x0097, B:24:0x00a8, B:50:0x012d, B:46:0x0126, B:53:0x0131, B:54:0x0136), top: B:132:0x000d, inners: #2, #3, #4, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b2 A[Catch: all -> 0x014b, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x014b, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007b, B:18:0x0085, B:66:0x014a, B:62:0x0143, B:69:0x014f, B:93:0x01a5, B:96:0x01b2, B:90:0x019f, B:103:0x01be, B:106:0x01ca, B:107:0x01d1, B:108:0x01d2, B:109:0x01d5, B:110:0x01d6, B:111:0x01eb, B:59:0x013e, B:70:0x015f, B:73:0x0165, B:75:0x0171, B:77:0x017f, B:80:0x0186, B:81:0x018a, B:82:0x0191, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:100:0x01b6, B:101:0x01bb, B:87:0x019a, B:19:0x008e, B:21:0x0097, B:24:0x00a8, B:50:0x012d, B:46:0x0126, B:53:0x0131, B:54:0x0136), top: B:132:0x000d, inners: #2, #3, #4, #10, #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.b5c n(defpackage.zn7 r23, defpackage.gx3 r24, defpackage.kb4 r25) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un9.n(zn7, gx3, kb4):b5c");
    }

    public static final r4c o(final ie8 ie8Var) throws IOException {
        int iQ = ie8Var.q();
        if (iQ != 33639248) {
            throw new IOException("bad zip: expected " + j(33639248) + " but was " + j(iQ));
        }
        ie8Var.skip(4L);
        short sE = ie8Var.E();
        int i = sE & 65535;
        if ((sE & 1) != 0) {
            sy3.m("unsupported zip: general purpose bit flag=".concat(j(i)));
            return null;
        }
        int iE = ie8Var.E() & 65535;
        int iE2 = ie8Var.E() & 65535;
        int iE3 = ie8Var.E() & 65535;
        long jQ = ((long) ie8Var.q()) & 4294967295L;
        final qg8 qg8Var = new qg8();
        qg8Var.a = ((long) ie8Var.q()) & 4294967295L;
        final qg8 qg8Var2 = new qg8();
        qg8Var2.a = ((long) ie8Var.q()) & 4294967295L;
        int iE4 = ie8Var.E() & 65535;
        int iE5 = ie8Var.E() & 65535;
        int iE6 = ie8Var.E() & 65535;
        ie8Var.skip(8L);
        final qg8 qg8Var3 = new qg8();
        qg8Var3.a = ((long) ie8Var.q()) & 4294967295L;
        String strN = ie8Var.N(iE4);
        if (bw9.P(strN, (char) 0)) {
            sy3.m("bad zip: filename contains 0x00");
            return null;
        }
        long j = qg8Var2.a == 4294967295L ? 8L : 0L;
        if (qg8Var.a == 4294967295L) {
            j += 8;
        }
        if (qg8Var3.a == 4294967295L) {
            j += 8;
        }
        final long j2 = j;
        final rg8 rg8Var = new rg8();
        final rg8 rg8Var2 = new rg8();
        final rg8 rg8Var3 = new rg8();
        final ng8 ng8Var = new ng8();
        p(ie8Var, iE5, new yb4() { // from class: d5c
            @Override // defpackage.yb4
            public final Object invoke(Object obj, Object obj2) throws EOFException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                ie8 ie8Var2 = ie8Var;
                if (iIntValue == 1) {
                    ng8 ng8Var2 = ng8Var;
                    if (ng8Var2.a) {
                        sy3.m("bad zip: zip64 extra repeated");
                        return null;
                    }
                    ng8Var2.a = true;
                    if (jLongValue < j2) {
                        sy3.m("bad zip: zip64 extra too short");
                        return null;
                    }
                    qg8 qg8Var4 = qg8Var2;
                    long jA = qg8Var4.a;
                    if (jA == 4294967295L) {
                        jA = ie8Var2.A();
                    }
                    qg8Var4.a = jA;
                    qg8 qg8Var5 = qg8Var;
                    qg8Var5.a = qg8Var5.a == 4294967295L ? ie8Var2.A() : 0L;
                    qg8 qg8Var6 = qg8Var3;
                    qg8Var6.a = qg8Var6.a == 4294967295L ? ie8Var2.A() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        sy3.m("bad zip: NTFS extra too short");
                        return null;
                    }
                    ie8Var2.skip(4L);
                    un9.p(ie8Var2, (int) (jLongValue - 4), new c5c(rg8Var, ie8Var2, rg8Var2, rg8Var3));
                }
                return heb.a;
            }
        });
        if (j2 > 0 && !ng8Var.a) {
            sy3.m("bad zip: zip64 extra required but absent");
            return null;
        }
        String strN2 = ie8Var.N(iE6);
        String str = zn7.b;
        return new r4c(xn7.b("/", false).e(strN), iw9.C(strN, "/", false), strN2, jQ, qg8Var.a, qg8Var2.a, iE, qg8Var3.a, iE3, iE2, (Long) rg8Var.a, (Long) rg8Var2.a, (Long) rg8Var3.a, 57344);
    }

    public static final void p(ie8 ie8Var, int i, yb4 yb4Var) throws EOFException {
        xq0 xq0Var = ie8Var.b;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                sy3.m("bad zip: truncated header in extra field");
                return;
            }
            int iE = ie8Var.E() & 65535;
            long jE = ((long) ie8Var.E()) & 65535;
            long j2 = j - 4;
            if (j2 < jE) {
                sy3.m("bad zip: truncated value in extra field");
                return;
            }
            ie8Var.v(jE);
            long j3 = xq0Var.b;
            yb4Var.invoke(Integer.valueOf(iE), Long.valueOf(jE));
            long j4 = (xq0Var.b + jE) - j3;
            if (j4 < 0) {
                sy3.m(dx1.f(iE, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    xq0Var.skip(j4);
                }
                j = j2 - jE;
            }
        }
    }

    public static final r4c q(ie8 ie8Var, r4c r4cVar) throws IOException {
        int iQ = ie8Var.q();
        if (iQ != 67324752) {
            throw new IOException("bad zip: expected " + j(67324752) + " but was " + j(iQ));
        }
        ie8Var.skip(2L);
        short sE = ie8Var.E();
        int i = sE & 65535;
        if ((sE & 1) != 0) {
            sy3.m("unsupported zip: general purpose bit flag=".concat(j(i)));
            return null;
        }
        ie8Var.skip(18L);
        long jE = ((long) ie8Var.E()) & 65535;
        int iE = ie8Var.E() & 65535;
        ie8Var.skip(jE);
        if (r4cVar == null) {
            ie8Var.skip(iE);
            return null;
        }
        rg8 rg8Var = new rg8();
        rg8 rg8Var2 = new rg8();
        rg8 rg8Var3 = new rg8();
        p(ie8Var, iE, new c5c(ie8Var, rg8Var, rg8Var2, rg8Var3));
        return new r4c(r4cVar.a, r4cVar.b, r4cVar.c, r4cVar.d, r4cVar.e, r4cVar.f, r4cVar.g, r4cVar.h, r4cVar.i, r4cVar.j, r4cVar.k, r4cVar.l, r4cVar.m, (Integer) rg8Var.a, (Integer) rg8Var2.a, (Integer) rg8Var3.a);
    }

    public static final void r(dd4 dd4Var, kb4 kb4Var) {
        dd4Var.b(heb.a, new gs6(kb4Var, 28, (byte) 0));
    }

    public static final void s(yb4 yb4Var, dd4 dd4Var, Object obj) {
        if (dd4Var.S || !lc5.Q(dd4Var.Q(), obj)) {
            dd4Var.p0(obj);
            dd4Var.b(obj, yb4Var);
        }
    }

    public static final void t(int i, String str, String str2) {
        StringBuilder sbN = dx1.n("Expected ", str2, " at index ", ", but was '", i);
        sbN.append(str.charAt(i));
        sbN.append('\'');
        throw new IllegalArgumentException(sbN.toString());
    }

    public static zzajb u(x20 x20Var, String str) {
        if (x20Var instanceof rg4) {
            rg4 rg4Var = (rg4) x20Var;
            return new zzajb(rg4Var.a, rg4Var.b, "google.com", (String) null, (String) null, (String) null, str, (String) null, (String) null);
        }
        if (x20Var instanceof gt3) {
            return new zzajb((String) null, ((gt3) x20Var).a, "facebook.com", (String) null, (String) null, (String) null, str, (String) null, (String) null);
        }
        if (x20Var instanceof q9b) {
            q9b q9bVar = (q9b) x20Var;
            return new zzajb((String) null, q9bVar.a, "twitter.com", (String) null, q9bVar.b, (String) null, str, (String) null, (String) null);
        }
        if (x20Var instanceof df4) {
            return new zzajb((String) null, ((df4) x20Var).a, "github.com", (String) null, (String) null, (String) null, str, (String) null, (String) null);
        }
        if (x20Var instanceof dv7) {
            return new zzajb((String) null, (String) null, "playgames.google.com", (String) null, (String) null, ((dv7) x20Var).a, str, (String) null, (String) null);
        }
        if (!(x20Var instanceof ffc)) {
            gp.l("Unsupported credential type.");
            return null;
        }
        ffc ffcVar = (ffc) x20Var;
        zzajb zzajbVar = ffcVar.d;
        return zzajbVar != null ? zzajbVar : new zzajb(ffcVar.b, ffcVar.c, ffcVar.a, (String) null, ffcVar.f, (String) null, str, ffcVar.e, ffcVar.s);
    }
}
