package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class mi9 {
    public static final void a(cq9 cq9Var, ou6 ou6Var, dd4 dd4Var, int i) {
        int i2;
        cq9Var.getClass();
        dd4Var.h0(-584496876);
        if ((i & 6) == 0) {
            i2 = i | (dd4Var.f(cq9Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            a07 a07VarI = dk9.i(cq9Var.d, dd4Var);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = lc5.Z(dd4Var);
                dd4Var.p0(objQ);
            }
            vx1 vx1Var = (vx1) objQ;
            List listA = cq9Var.a();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objQ2 = dd4Var.Q();
            if (z || objQ2 == obj) {
                objQ2 = new dq9(cq9Var, null);
                dd4Var.p0(objQ2);
            }
            lc5.u((yb4) objQ2, dd4Var, listA);
            if (cq9Var.a().isEmpty()) {
                dd4Var.f0(-947431698);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-948126687);
                List listA2 = cq9Var.a();
                boolean zBooleanValue = ((Boolean) a07VarI.getValue()).booleanValue();
                vp9 vp9Var = cq9Var.b;
                boolean zH = dd4Var.h(vx1Var) | (i3 == 4);
                Object objQ3 = dd4Var.Q();
                if (zH || objQ3 == obj) {
                    objQ3 = new e67(17, cq9Var, vx1Var);
                    dd4Var.p0(objQ3);
                }
                oh9.d(listA2, vp9Var, (ib4) objQ3, zBooleanValue, ou6Var, dd4Var, (i2 << 12) & 458752);
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bo6((Object) cq9Var, false, (Object) ou6Var, i, 23);
        }
    }

    public static final void b(final boolean z, final String str, final String str2, final int i, final int i2, final boolean z2, final u4b u4bVar, final ou6 ou6Var, final ib4 ib4Var, final ib4 ib4Var2, final kb4 kb4Var, final ib4 ib4Var3, final ib4 ib4Var4, final ib4 ib4Var5, final ib4 ib4Var6, final ib4 ib4Var7, final ib4 ib4Var8, final ib4 ib4Var9, dd4 dd4Var, final int i3, final int i4) {
        int i5;
        String str3;
        ib4 ib4Var10;
        dd4 dd4Var2 = dd4Var;
        u4bVar.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        kb4Var.getClass();
        ib4Var3.getClass();
        ib4Var4.getClass();
        ib4Var5.getClass();
        ib4Var6.getClass();
        ib4Var7.getClass();
        ib4Var8.getClass();
        ib4Var9.getClass();
        dd4Var2.h0(536518654);
        if ((i3 & 6) == 0) {
            i5 = (dd4Var2.g(z) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= dd4Var2.f(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            str3 = str2;
            i5 |= dd4Var2.f(str3) ? 256 : Token.CASE;
        } else {
            str3 = str2;
        }
        if ((i3 & 3072) == 0) {
            i5 |= dd4Var2.d(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= dd4Var2.d(i2) ? 16384 : 8192;
        }
        int i6 = i3 & 196608;
        int i7 = Parser.ARGC_LIMIT;
        if (i6 == 0) {
            i5 |= dd4Var2.g(z2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= dd4Var2.f(u4bVar) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= dd4Var2.f(ou6Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= dd4Var2.h(ib4Var) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= dd4Var2.h(ib4Var2) ? 536870912 : 268435456;
        }
        int i8 = i5;
        int i9 = i4 | (dd4Var2.h(kb4Var) ? 4 : 2) | (dd4Var2.h(ib4Var3) ? 32 : 16);
        if ((i4 & 384) == 0) {
            ib4Var10 = ib4Var4;
            i9 |= dd4Var2.h(ib4Var10) ? 256 : Token.CASE;
        } else {
            ib4Var10 = ib4Var4;
        }
        if ((i4 & 3072) == 0) {
            i9 |= dd4Var2.h(ib4Var5) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i9 |= dd4Var2.h(ib4Var6) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            if (dd4Var2.h(ib4Var7)) {
                i7 = 131072;
            }
            i9 |= i7;
        }
        if ((i4 & 1572864) == 0) {
            i9 |= dd4Var2.h(ib4Var8) ? 1048576 : 524288;
        }
        int i10 = i9;
        if (dd4Var2.V(i8 & 1, ((i8 & 306783379) == 306783378 && (i10 & 4793491) == 4793490) ? false : true)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new uha(1);
                dd4Var2.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj) {
                objQ2 = new uha(2);
                dd4Var2.p0(objQ2);
            }
            kf0.e(z, ou6VarF, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), (String) null, jf0.G(290070256, new gl7(ib4Var, z2, kb4Var, ib4Var3, ib4Var10, ib4Var5, ib4Var2, ib4Var6, ib4Var7, str, str3), dd4Var2), dd4Var, 1600902 | ((i8 << 3) & Token.ASSIGN_MOD), 16);
            ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarF2);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ha6VarD);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            boolean z3 = u4bVar.a && z;
            ou6 ou6VarB = yib.B(lu6Var, 2);
            zn0 zn0Var = zn0.a;
            un9.b(z3, u4bVar, zn0Var.a(ou6VarB, xf0Var), ib4Var9, dd4Var, ((i8 >> 15) & Token.ASSIGN_MOD) | 3072);
            int i11 = i8 >> 6;
            dk9.g(z, i, i2, zn0Var.a(yib.B(lu6Var, 4), bv4.d), ib4Var8, dd4Var, (i8 & 14) | (i11 & Token.ASSIGN_MOD) | (i11 & 896) | (57344 & (i10 >> 6)));
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: hia
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(i3 | 1);
                    int iX02 = qu1.x0(i4);
                    mi9.b(z, str, str2, i, i2, z2, u4bVar, ou6Var, ib4Var, ib4Var2, kb4Var, ib4Var3, ib4Var4, ib4Var5, ib4Var6, ib4Var7, ib4Var8, ib4Var9, (dd4) obj2, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    public static final void c(kqb kqbVar, ou6 ou6Var, dd4 dd4Var, int i) {
        int i2;
        kqbVar.getClass();
        dd4Var.h0(1316131578);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(kqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        int i3 = 1;
        if (!dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            dd4Var.Y();
        } else if (((Boolean) dd4Var.j(c95.a)).booleanValue()) {
            dd4Var.f0(119517280);
            pn0.a(ou6Var, dd4Var, (i2 >> 3) & 14);
            dd4Var.q(false);
        } else {
            dd4Var.f0(119564834);
            ri9.g(kqbVar, ou6Var, dd4Var, i2 & Token.ELSE);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new p27(kqbVar, ou6Var, i, i3);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String d(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi9.d(java.lang.String, java.lang.String):java.lang.String");
    }

    public static final long e(long j, long j2) {
        int i = oa5.c;
        return fu8.a(((int) (j2 >> 32)) / ((int) (j >> 32)), ((int) (j2 & 4294967295L)) / ((int) (j & 4294967295L)));
    }

    public static final void f(q05 q05Var, ah8 ah8Var, long j) throws Exception {
        q05Var.getClass();
        String str = q05Var.b;
        long j2 = q05Var.a;
        if (rw1.O(j2)) {
            throw new Exception("image size invalid: " + q05Var.c + 'x' + q05Var.d);
        }
        if (rw1.O(j)) {
            int i = oa5.c;
            throw new Exception("content size invalid: " + ((int) (j >> 32)) + 'x' + ((int) (j & 4294967295L)));
        }
        int i2 = oa5.c;
        if (((int) (j >> 32)) >= ((int) (j2 >> 32)) || ((int) (j & 4294967295L)) >= ((int) (4294967295L & j2))) {
            throw new Exception("the thumbnail size is greater than or equal to the original image. contentSize=" + rw1.l0(j) + ", imageSize=" + rw1.l0(j2));
        }
        if (tw1.X(j2, j)) {
            if (lc5.Q(ah8Var.b(str), Boolean.FALSE)) {
                throw new Exception("Image type not support subsampling. mimeType=".concat(str));
            }
            return;
        }
        throw new Exception("The aspect ratio of thumbnail and original image is different. contentSize=" + rw1.l0(j) + ", imageSize=" + rw1.l0(j2));
    }

    public static final void g(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            gp.k(i != i2 ? xv5.j(i, i2, "Both size ", " and step ", " must be greater than zero.") : xv5.k(i, "size ", " must be greater than zero."));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        if (r0 != r6) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[Catch: all -> 0x00eb, TryCatch #0 {all -> 0x00eb, blocks: (B:13:0x002b, B:40:0x00cb, B:42:0x00d4, B:44:0x00e3, B:45:0x00ea, B:18:0x0040, B:29:0x008b, B:34:0x00a3, B:36:0x00ad, B:37:0x00b0, B:23:0x0063, B:25:0x0069, B:22:0x004c), top: B:49:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad A[Catch: all -> 0x00eb, TryCatch #0 {all -> 0x00eb, blocks: (B:13:0x002b, B:40:0x00cb, B:42:0x00d4, B:44:0x00e3, B:45:0x00ea, B:18:0x0040, B:29:0x008b, B:34:0x00a3, B:36:0x00ad, B:37:0x00b0, B:23:0x0063, B:25:0x0069, B:22:0x004c), top: B:49:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0084 -> B:20:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(l46 r16, defpackage.ty9 r17, long r18, java.util.List r20, defpackage.kt1 r21) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi9.h(l46, ty9, long, java.util.List, kt1):java.lang.Object");
    }

    public static final int i(long j, long j2, float f) {
        if (rw1.O(j) || rw1.O(j2) || f <= 0.0f) {
            return 0;
        }
        int i = oa5.c;
        int iPow = (int) Math.pow(2.0d, t96.M((float) (Math.log(tw1.P(1, ((int) (j >> 32)) / (((int) (j2 >> 32)) * f))) / fp1.a)));
        if (iPow < 1) {
            return 1;
        }
        return iPow;
    }

    public static final String j(krb krbVar) {
        krbVar.getClass();
        if (krbVar instanceof kgb) {
            return ((kgb) krbVar).a;
        }
        if (krbVar instanceof j62) {
            j62 j62Var = (j62) krbVar;
            return r(j62Var.a, j62Var.c, j62Var.d);
        }
        mn5.g();
        return null;
    }

    public static final boolean k(bp bpVar) {
        int length = bpVar.b.length();
        List list = bpVar.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ap apVar = (ap) list.get(i);
                if ((apVar.a instanceof ty5) && cp.b(0, length, apVar.b, apVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int l(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        gp.l(dx1.f(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static boolean m(byte b) {
        return b > -65;
    }

    public static final o7c n(l46 l46Var, dd4 dd4Var, int i) {
        if ((i & 1) != 0) {
            l46Var = cx1.p0(0, 7, dd4Var);
        }
        boolean zF = dd4Var.f(l46Var);
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            objQ = new o7c(l46Var);
            dd4Var.p0(objQ);
        }
        return (o7c) objQ;
    }

    public static final String o(String str, String str2) {
        String string = bw9.B0(str).toString();
        if (bw9.a0(string)) {
            return str;
        }
        Pattern patternCompile = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+.-]*:");
        patternCompile.getClass();
        if (patternCompile.matcher(string).find()) {
            return str;
        }
        if (!iw9.C(str2, "/", false)) {
            str2 = str2.concat("/");
        }
        return str2.concat(bw9.k0(string, "/"));
    }

    public static final xl7 p(Object obj, Object obj2) {
        return new xl7(obj, obj2);
    }

    public static final String q(ArrayList arrayList) {
        arrayList.getClass();
        return fc1.D0(arrayList, ",", "[", "]", new qc9(29), 24);
    }

    public static final String r(String str, String str2, String str3) {
        if (iw9.K(str, "data:", true)) {
            return str;
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if ((lowerCase.equals("application/x-mpegurl") || lowerCase.equals("application/vnd.apple.mpegurl") || lowerCase.equals("audio/mpegurl") || lowerCase.equals("audio/x-mpegurl")) && !bw9.a0(str3)) {
            str = f39.p0(new r04((a39) new jc1(str, 2), (kb4) new t14(str3, 9)), "\n");
        }
        if (bw9.a0(str2)) {
            str2 = "application/octet-stream";
        }
        return j39.m("data:", str2, ";base64,", pc0.b(pc0.e, iw9.B(str)));
    }

    public static BigDecimal s(String str) {
        t(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static void t(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String strSubstring = str.substring(0, 30);
        throw new NumberFormatException(j39.n(new StringBuilder(strSubstring.length() + 28), "Number string too large: ", strSubstring, "..."));
    }
}
