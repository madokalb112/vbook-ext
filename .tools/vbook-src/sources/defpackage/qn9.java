package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class qn9 {
    public static final void a(int i, int i2, kb4 kb4Var, dd4 dd4Var, ou6 ou6Var) {
        ou6 ou6Var2;
        kb4Var.getClass();
        dd4Var.h0(-1855493851);
        int i3 = i2 | (dd4Var.d(i) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            Object obj = objQ;
            if (objQ == fu6Var) {
                m53[] m53VarArr = {(m53) f53.l.getValue(), (m53) a53.S.getValue(), (m53) f53.a.getValue(), (m53) a53.B.getValue()};
                dd4Var.p0(m53VarArr);
                obj = m53VarArr;
            }
            m53[] m53VarArr2 = (m53[]) obj;
            Object objQ2 = dd4Var.Q();
            Object obj2 = objQ2;
            if (objQ2 == fu6Var) {
                m53[] m53VarArr3 = {(m53) f53.m.getValue(), (m53) a53.T.getValue(), (m53) f53.b.getValue(), (m53) a53.B.getValue()};
                dd4Var.p0(m53VarArr3);
                obj2 = m53VarArr3;
            }
            m53[] m53VarArr4 = (m53[]) obj2;
            List listR = wm9.r((hv9) rv.e.getValue(), dd4Var);
            jj4 jj4Var = (jj4) dd4Var.j(xm1.l);
            int i4 = i3 >> 3;
            ou6Var2 = ou6Var;
            ou6 ou6VarB = yib.B(ou6Var2, 14);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarB);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, ha6VarD);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            t1c.b(i, kb4Var, listR.size(), tg9.f(lu6.a, 1.0f), jf0.G(-1099452243, new q8a(listR, i, kb4Var, jj4Var, m53VarArr4, m53VarArr2, 1), dd4Var), dd4Var, (i3 & 14) | 27648 | (i4 & Token.ASSIGN_MOD));
            dd4Var.q(true);
        } else {
            ou6Var2 = ou6Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jy0(i, ou6Var2, kb4Var, i2, 8);
        }
    }

    public static final void b(p35 p35Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i, int i2) {
        ou6 ou6Var2;
        p35Var.getClass();
        ib4Var.getClass();
        dd4Var.h0(-1514022649);
        int i3 = i | (dd4Var.f(p35Var) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        int i5 = i3 | (dd4Var.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
            ou6Var2 = i4 != 0 ? lu6.a : ou6Var;
            ou6 ou6VarN = tg9.n(ou6Var2, 32.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(ou6VarN, rp8Var);
            boolean z = (i5 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new oda(27, ib4Var);
                dd4Var.p0(objQ);
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarW, false, 15);
            ur9 ur9Var = s96.a;
            mx4.a(p35Var, (String) null, gjb.l0(fe.L(gjb.l0(fe.L(ou6VarJ, dd1.g(((q96) dd4Var.j(ur9Var)).a, 16.0f), jf0.G), 1.0f), dd1.g(((q96) dd4Var.j(ur9Var)).a, 8.0f), rp8Var), 6.0f), ((q96) dd4Var.j(ur9Var)).a.q, dd4Var, (i5 & 14) | 48, 0);
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new su1(p35Var, ou6Var2, ib4Var, i, i2, 1);
        }
    }

    public static final void c(int i, int i2, kb4 kb4Var, dd4 dd4Var, ou6 ou6Var) {
        ou6 ou6Var2;
        kb4Var.getClass();
        dd4Var.h0(-856341337);
        int i3 = (dd4Var.d(i) ? 4 : 2) | i2 | (dd4Var.f(ou6Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            Object obj = objQ;
            if (objQ == fu6Var) {
                m53[] m53VarArr = {(m53) f53.l.getValue(), (m53) a53.S.getValue(), (m53) f53.a.getValue(), (m53) a53.B.getValue()};
                dd4Var.p0(m53VarArr);
                obj = m53VarArr;
            }
            m53[] m53VarArr2 = (m53[]) obj;
            Object objQ2 = dd4Var.Q();
            Object obj2 = objQ2;
            if (objQ2 == fu6Var) {
                m53[] m53VarArr3 = {(m53) f53.m.getValue(), (m53) a53.T.getValue(), (m53) f53.b.getValue(), (m53) a53.B.getValue()};
                dd4Var.p0(m53VarArr3);
                obj2 = m53VarArr3;
            }
            ou6Var2 = ou6Var;
            sdc.e(yib.B(ou6Var2, 11), null, jf0.G(34124433, new q8a(wm9.r((hv9) rv.e.getValue(), dd4Var), i, kb4Var, (jj4) dd4Var.j(xm1.l), (m53[]) obj2, m53VarArr2, 0), dd4Var), dd4Var, 3072, 6);
        } else {
            ou6Var2 = ou6Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jy0(i, ou6Var2, kb4Var, i2, 7);
        }
    }

    public static final mv9 d(ue5 ue5Var, String str) {
        ue5Var.getClass();
        str.getClass();
        return new mv9(str, ue5Var.a);
    }

    public static final void e(final boolean z, final String str, final String str2, final int i, final int i2, final boolean z2, final u4b u4bVar, final ou6 ou6Var, final ib4 ib4Var, final ib4 ib4Var2, final kb4 kb4Var, final ib4 ib4Var3, final ib4 ib4Var4, final ib4 ib4Var5, final ib4 ib4Var6, final ib4 ib4Var7, final ib4 ib4Var8, dd4 dd4Var, final int i3, final int i4) {
        int i5;
        String str3;
        ib4 ib4Var9;
        ou6 ou6Var2;
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
        dd4Var2.h0(1876207986);
        if ((i3 & 6) == 0) {
            i5 = (dd4Var2.g(z) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            str3 = str;
            i5 |= dd4Var2.f(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i3 & 384) == 0) {
            i5 |= dd4Var2.f(str2) ? 256 : Token.CASE;
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
            ib4Var9 = ib4Var4;
            i9 |= dd4Var2.h(ib4Var9) ? 256 : Token.CASE;
        } else {
            ib4Var9 = ib4Var4;
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
        int i10 = i9;
        if (dd4Var2.V(i8 & 1, ((i8 & 306783379) == 306783378 && (i10 & 599187) == 599186) ? false : true)) {
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
                ou6Var2 = ou6VarF;
                objQ = new uha(11);
                dd4Var2.p0(objQ);
            } else {
                ou6Var2 = ou6VarF;
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj) {
                objQ2 = new uha(12);
                dd4Var2.p0(objQ2);
            }
            kf0.e(z, ou6Var2, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), (String) null, jf0.G(-2055345692, new noa(ib4Var6, ib4Var, ib4Var2, ib4Var3, z2, kb4Var, ib4Var9, ib4Var5, str3, str2), dd4Var2), dd4Var, 1600902 | ((i8 << 3) & Token.ASSIGN_MOD), 16);
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
            zn0 zn0Var = zn0.a;
            un9.b(z3, u4bVar, zn0Var.a(lu6Var, xf0Var), ib4Var8, dd4Var, ((i8 >> 15) & Token.ASSIGN_MOD) | 3072);
            int i11 = i8 >> 6;
            dk9.g(z, i, i2, zn0Var.a(lu6Var, bv4.d), ib4Var7, dd4Var, (i8 & 14) | (i11 & Token.ASSIGN_MOD) | (i11 & 896) | (57344 & (i10 >> 3)));
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: ooa
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(i3 | 1);
                    int iX02 = qu1.x0(i4);
                    qn9.e(z, str, str2, i, i2, z2, u4bVar, ou6Var, ib4Var, ib4Var2, kb4Var, ib4Var3, ib4Var4, ib4Var5, ib4Var6, ib4Var7, ib4Var8, (dd4) obj2, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    public static final c93 f(c93 c93Var, String str) {
        String strLookupPrefix = ((Node) ((gi8) c93Var).a).lookupPrefix("http://schemas.android.com/apk/res/android");
        strLookupPrefix.getClass();
        Object obj = null;
        ux3 ux3Var = new ux3(new vx3(new jc1(new z3c(c93Var, null), 1), true, l79.v));
        while (true) {
            if (!ux3Var.hasNext()) {
                break;
            }
            Object next = ux3Var.next();
            c93 c93Var2 = (c93) next;
            String namespaceURI = ((Node) ((gi8) c93Var2).a).getNamespaceURI();
            namespaceURI.getClass();
            if (namespaceURI.equals("http://schemas.android.com/aapt")) {
                String localName = ((Node) ((gi8) c93Var2).a).getLocalName();
                localName.getClass();
                if (localName.equals("attr")) {
                    String attribute = c93Var2.c.getAttribute("name");
                    attribute.getClass();
                    if (attribute.equals(strLookupPrefix + ":" + str)) {
                        obj = next;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return (c93) obj;
    }

    public static final String g(c93 c93Var, String str) {
        c93Var.getClass();
        String attributeNS = c93Var.c.getAttributeNS("http://schemas.android.com/apk/res/android", str);
        attributeNS.getClass();
        if (bw9.a0(attributeNS)) {
            return null;
        }
        return attributeNS;
    }

    public static byte h(long j) {
        fx1.E("out of range: %s", j, (j >> 8) == 0);
        return (byte) j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.N(r0) == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.cwb r6, defpackage.va1 r7, defpackage.kt1 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.dwb
            if (r0 == 0) goto L13
            r0 = r8
            dwb r0 = (defpackage.dwb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dwb r0 = new dwb
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.e11.e0(r8)     // Catch: java.lang.Throwable -> L55
            goto L55
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L31:
            cwb r6 = r0.a
            defpackage.e11.e0(r8)     // Catch: java.lang.Throwable -> L55
            goto L4a
        L37:
            defpackage.e11.e0(r8)
            ja4 r8 = new ja4     // Catch: java.lang.Throwable -> L55
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L55
            r0.a = r6     // Catch: java.lang.Throwable -> L55
            r0.c = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r7 = r6.R(r8, r0)     // Catch: java.lang.Throwable -> L55
            if (r7 != r5) goto L4a
            goto L54
        L4a:
            r0.a = r4     // Catch: java.lang.Throwable -> L55
            r0.c = r2     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r6.N(r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r5) goto L55
        L54:
            return r5
        L55:
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn9.i(cwb, va1, kt1):java.lang.Object");
    }

    public static Object j(cwb cwbVar, kt1 kt1Var) {
        wfc wfcVar = ua1.b;
        return i(cwbVar, new va1((short) 1000, ""), kt1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long k(defpackage.jl9 r18, byte r19, long r20, int r22) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn9.k(jl9, byte, long, int):long");
    }

    public static final boolean l(kga kgaVar, boolean z) {
        ym5 ym5VarC;
        qv5 qv5Var = kgaVar.d;
        if (qv5Var == null || (ym5VarC = qv5Var.c()) == null) {
            return false;
        }
        return h67.n0(h67.G0(ym5VarC), kgaVar.l(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final z2b m(z2b r29, z2b r30) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn9.m(z2b, z2b):z2b");
    }

    public static final ou6 n(ou6 ou6Var) {
        ou6Var.getClass();
        return s32.X(ou6Var, new tn8(3));
    }

    public static final xl7[] o(c93 c93Var) {
        List listR0 = f39.r0(new vx3(new vx3(new jc1(new z3c(c93Var, null), 1), true, l79.w), true, new f2c(5)));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listR0) {
            int i2 = i + 1;
            if (i < 0) {
                gc1.i0();
                throw null;
            }
            c93 c93Var2 = (c93) obj;
            float f = i;
            int size = listR0.size() - 1;
            if (size < 1) {
                size = 1;
            }
            float f2 = f / size;
            String strG = g(c93Var2, "offset");
            if (strG != null) {
                f2 = Float.parseFloat(strG);
            }
            String strG2 = g(c93Var2, "color");
            xl7 xl7Var = strG2 != null ? new xl7(Float.valueOf(f2), new lc1(ah1.j(yn9.j(strG2)))) : null;
            if (xl7Var != null) {
                arrayList.add(xl7Var);
            }
            i = i2;
        }
        if (arrayList.isEmpty()) {
            String strG3 = g(c93Var, "startColor");
            Integer numValueOf = strG3 != null ? Integer.valueOf(yn9.j(strG3)) : null;
            String strG4 = g(c93Var, "centerColor");
            Integer numValueOf2 = strG4 != null ? Integer.valueOf(yn9.j(strG4)) : null;
            String strG5 = g(c93Var, "endColor");
            Integer numValueOf3 = strG5 != null ? Integer.valueOf(yn9.j(strG5)) : null;
            if (numValueOf != null) {
                arrayList.add(new xl7(Float.valueOf(0.0f), new lc1(ah1.j(numValueOf.intValue()))));
            }
            if (numValueOf2 != null) {
                arrayList.add(new xl7(Float.valueOf(0.5f), new lc1(ah1.j(numValueOf2.intValue()))));
            }
            if (numValueOf3 != null) {
                arrayList.add(new xl7(Float.valueOf(1.0f), new lc1(ah1.j(numValueOf3.intValue()))));
            }
        }
        return (xl7[]) arrayList.toArray(new xl7[0]);
    }

    public static final l89 p(c93 c93Var) {
        Object next;
        String strG;
        ux3 ux3Var = new ux3(new vx3(new jc1(new z3c(c93Var, null), 1), true, l79.x));
        while (true) {
            if (!ux3Var.hasNext()) {
                next = null;
                break;
            }
            next = ux3Var.next();
            String nodeName = ((Node) ((gi8) ((c93) next)).a).getNodeName();
            nodeName.getClass();
            if (nodeName.equals("gradient")) {
                break;
            }
        }
        c93 c93Var2 = (c93) next;
        if (c93Var2 != null && (strG = g(c93Var2, "type")) != null) {
            int iHashCode = strG.hashCode();
            int i = 0;
            if (iHashCode != -1102672091) {
                if (iHashCode != -938579425) {
                    if (iHashCode == 109850348 && strG.equals("sweep")) {
                        xl7[] xl7VarArrO = o(c93Var2);
                        xl7[] xl7VarArr = (xl7[]) Arrays.copyOf(xl7VarArrO, xl7VarArrO.length);
                        String strG2 = g(c93Var2, "centerX");
                        float f = strG2 != null ? Float.parseFloat(strG2) : 0.0f;
                        String strG3 = g(c93Var2, "centerY");
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(strG3 != null ? Float.parseFloat(strG3) : 0.0f)) & 4294967295L);
                        ArrayList arrayList = new ArrayList(xl7VarArr.length);
                        for (xl7 xl7Var : xl7VarArr) {
                            arrayList.add(new lc1(((lc1) xl7Var.b).a));
                        }
                        int length = xl7VarArr.length;
                        ArrayList arrayList2 = new ArrayList(length);
                        while (i < length) {
                            arrayList2.add(Float.valueOf(((Number) xl7VarArr[i].a).floatValue()));
                            i++;
                        }
                        return new w1a(jFloatToRawIntBits, arrayList, arrayList2);
                    }
                } else if (strG.equals("radial")) {
                    xl7[] xl7VarArrO2 = o(c93Var2);
                    xl7[] xl7VarArr2 = (xl7[]) Arrays.copyOf(xl7VarArrO2, xl7VarArrO2.length);
                    String strG4 = g(c93Var2, "centerX");
                    float f2 = strG4 != null ? Float.parseFloat(strG4) : 0.0f;
                    String strG5 = g(c93Var2, "centerY");
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(strG5 != null ? Float.parseFloat(strG5) : 0.0f)) & 4294967295L);
                    String strG6 = g(c93Var2, "gradientRadius");
                    float f3 = strG6 != null ? Float.parseFloat(strG6) : 0.0f;
                    String strG7 = g(c93Var2, "tileMode");
                    int iL = strG7 != null ? yn9.l(strG7) : 0;
                    ArrayList arrayList3 = new ArrayList(xl7VarArr2.length);
                    for (xl7 xl7Var2 : xl7VarArr2) {
                        arrayList3.add(new lc1(((lc1) xl7Var2.b).a));
                    }
                    int length2 = xl7VarArr2.length;
                    ArrayList arrayList4 = new ArrayList(length2);
                    while (i < length2) {
                        arrayList4.add(Float.valueOf(((Number) xl7VarArr2[i].a).floatValue()));
                        i++;
                    }
                    return new sb8(arrayList3, arrayList4, jFloatToRawIntBits2, f3, iL);
                }
            } else if (strG.equals("linear")) {
                xl7[] xl7VarArrO3 = o(c93Var2);
                xl7[] xl7VarArr3 = (xl7[]) Arrays.copyOf(xl7VarArrO3, xl7VarArrO3.length);
                String strG8 = g(c93Var2, "startX");
                float f4 = strG8 != null ? Float.parseFloat(strG8) : 0.0f;
                String strG9 = g(c93Var2, "startY");
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(strG9 != null ? Float.parseFloat(strG9) : 0.0f)) & 4294967295L);
                String strG10 = g(c93Var2, "endX");
                float f5 = strG10 != null ? Float.parseFloat(strG10) : 0.0f;
                String strG11 = g(c93Var2, "endY");
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f5)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(strG11 != null ? Float.parseFloat(strG11) : 0.0f)));
                String strG12 = g(c93Var2, "tileMode");
                int iL2 = strG12 != null ? yn9.l(strG12) : 0;
                ArrayList arrayList5 = new ArrayList(xl7VarArr3.length);
                for (xl7 xl7Var3 : xl7VarArr3) {
                    arrayList5.add(new lc1(((lc1) xl7Var3.b).a));
                }
                int length3 = xl7VarArr3.length;
                ArrayList arrayList6 = new ArrayList(length3);
                while (i < length3) {
                    arrayList6.add(Float.valueOf(((Number) xl7VarArr3[i].a).floatValue()));
                    i++;
                }
                return new ly5(iL2, jFloatToRawIntBits3, jFloatToRawIntBits4, arrayList5, arrayList6);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(defpackage.c93 r22, o35 r23, qr0 r24) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn9.q(c93, o35, qr0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final z2b r(z2b r29, z2b r30) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn9.r(z2b, z2b):z2b");
    }

    public static final byte[] s(jl9 jl9Var, int i) {
        jl9Var.getClass();
        long j = i;
        if (j >= 0) {
            return t(jl9Var, i);
        }
        gp.k(xv5.m(j, "byteCount (", ") < 0"));
        return null;
    }

    public static final byte[] t(jl9 jl9Var, int i) {
        if (i == -1) {
            for (long j = 2147483647L; jl9Var.b().c < 2147483647L && jl9Var.request(j); j *= 2) {
            }
            if (jl9Var.b().c >= 2147483647L) {
                throw new IllegalStateException(("Can't create an array of size " + jl9Var.b().c).toString());
            }
            i = (int) jl9Var.b().c;
        } else {
            jl9Var.v(i);
        }
        byte[] bArr = new byte[i];
        wq0 wq0VarB = jl9Var.b();
        wq0VarB.getClass();
        long j2 = i;
        kl8.Q(j2, 0L, j2);
        int i2 = 0;
        while (i2 < i) {
            int iQ = wq0VarB.q(bArr, i2, i);
            if (iQ == -1) {
                throw new EOFException(xv5.j(i, iQ, "Source exhausted before reading ", " bytes. Only ", " bytes were read."));
            }
            i2 += iQ;
        }
        return bArr;
    }

    public static final String u(z2b z2bVar) {
        z2bVar.getClass();
        return "(" + fu8.d(z2bVar.a) + ',' + pu1.y0(z2bVar.b) + ',' + z2bVar.c + ',' + d3b.c(z2bVar.d) + ',' + d3b.c(z2bVar.e) + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(defpackage.ut0 r8, defpackage.gx3 r9, defpackage.zn7 r10, defpackage.kt1 r11) throws java.io.IOException {
        /*
            boolean r0 = r11 instanceof defpackage.ujb
            if (r0 == 0) goto L13
            r0 = r11
            ujb r0 = (defpackage.ujb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ujb r0 = new ujb
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2e
            java.io.Closeable r8 = r0.a
            defpackage.e11.e0(r11)     // Catch: java.lang.Throwable -> L2b
            goto L8d
        L2b:
            r9 = move-exception
            goto La6
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r4
        L34:
            java.io.Closeable r8 = r0.a
            defpackage.e11.e0(r11)     // Catch: java.lang.Throwable -> L3a
            goto L65
        L3a:
            r9 = move-exception
            goto L72
        L3c:
            defpackage.e11.e0(r11)
            oh5 r11 = defpackage.gx3.a
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            xx1 r1 = defpackage.xx1.a
            if (r9 != r11) goto L78
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile
            java.io.File r10 = r10.toFile()
            java.lang.String r11 = "rw"
            r9.<init>(r10, r11)
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L6e
            r0.a = r9     // Catch: java.lang.Throwable -> L6e
            r0.c = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r11 = defpackage.fw.b0(r8, r10, r5, r0)     // Catch: java.lang.Throwable -> L6e
            if (r11 != r1) goto L64
            goto L8b
        L64:
            r8 = r9
        L65:
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Throwable -> L3a
            r11.longValue()     // Catch: java.lang.Throwable -> L3a
            defpackage.kl8.S(r8, r4)
            goto Lb5
        L6e:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L72:
            throw r9     // Catch: java.lang.Throwable -> L73
        L73:
            r10 = move-exception
            defpackage.kl8.S(r8, r9)
            throw r10
        L78:
            r11 = 0
            ag9 r9 = r9.O0(r10, r11)
            he8 r9 = defpackage.tu1.r(r9)
            r0.a = r9     // Catch: java.lang.Throwable -> La2
            r0.c = r2     // Catch: java.lang.Throwable -> La2
            java.lang.Object r11 = defpackage.fw.b0(r8, r9, r5, r0)     // Catch: java.lang.Throwable -> La2
            if (r11 != r1) goto L8c
        L8b:
            return r1
        L8c:
            r8 = r9
        L8d:
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Throwable -> L2b
            long r9 = r11.longValue()     // Catch: java.lang.Throwable -> L2b
            java.lang.Long r11 = new java.lang.Long     // Catch: java.lang.Throwable -> L2b
            r11.<init>(r9)     // Catch: java.lang.Throwable -> L2b
            if (r8 == 0) goto L9f
            r8.close()     // Catch: java.lang.Throwable -> L9e
            goto L9f
        L9e:
            r4 = move-exception
        L9f:
            r9 = r4
            r4 = r11
            goto Lb0
        La2:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        La6:
            if (r8 == 0) goto Lb0
            r8.close()     // Catch: java.lang.Throwable -> Lac
            goto Lb0
        Lac:
            r8 = move-exception
            i12.r(r9, r8)
        Lb0:
            if (r9 != 0) goto Lb8
            r4.getClass()
        Lb5:
            heb r8 = defpackage.heb.a
            return r8
        Lb8:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn9.v(ut0, gx3, zn7, kt1):java.lang.Object");
    }

    public static String w(Context context) {
        try {
            return context.getResources().getResourcePackageName(2131951687);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
