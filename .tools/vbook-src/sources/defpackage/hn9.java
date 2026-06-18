package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class hn9 {
    public static vs7 a;

    public static final void a(String str, String str2, o8a o8aVar, dd4 dd4Var, int i) {
        dd4Var.h0(-1257987480);
        int i2 = (dd4Var.f(str) ? 4 : 2) | i | (dd4Var.f(str2) ? 32 : 16) | (dd4Var.h(o8aVar) ? 16384 : 8192);
        int i3 = 1;
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            Bitmap bitmapDecodeFile = null;
            if (str != null) {
                String str3 = !bw9.a0(str) ? str : null;
                if (str3 != null) {
                    bitmapDecodeFile = BitmapFactory.decodeFile(str3);
                }
            }
            p7c.c(ww1.H(xg9.i(xg9.p(44.0f), 44.0f).d(new zb0(o8aVar.b)), 22.0f), e9.d, jf0.G(102648262, new j8a(bitmapDecodeFile, str2, i3), dd4Var), dd4Var, 384);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new f47(str, str2, o8aVar, i, 6);
        }
    }

    public static final void b(final mq8 mq8Var, final int i, final int i2, final yc1 yc1Var, final float f, float f2, float f3, dd4 dd4Var, final int i3) {
        final float f4;
        final float f5;
        dd4Var.h0(-1690252346);
        int i4 = i3 | (dd4Var.h(mq8Var) ? 4 : 2) | (dd4Var.d(i) ? 32 : 16) | (dd4Var.d(i2) ? 256 : Token.CASE) | (dd4Var.h(yc1Var) ? 2048 : 1024);
        if (dd4Var.V(i4 & 1, (599187 & i4) != 599186)) {
            f4 = f2;
            f5 = f3;
            p7c.c(xg9.i(xg9.p(f), f4).d(new x4(mq8Var)), e9.d, jf0.G(473191972, new yb4() { // from class: k8a
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    dd4 dd4Var2 = (dd4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ny1.b(new ni(i2), null, xg9.h(kf4.a), 0, null, dd4Var2, 48, 24);
                        ni niVar = new ni(i);
                        float f6 = f5;
                        ny1.b(niVar, null, xg9.i(xg9.p(f6), f6), 0, new pc1(new eva(yc1Var)), dd4Var2, 32816, 8);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, 384);
        } else {
            f4 = f2;
            f5 = f3;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(i, i2, yc1Var, f, f4, f5, i3) { // from class: l8a
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ yc1 d;
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;
                public final /* synthetic */ float s;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(1794049);
                    hn9.b(this.a, this.b, this.c, this.d, this.e, this.f, this.s, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void c(String str, String str2, String str3, ou6 ou6Var, kb4 kb4Var, ib4 ib4Var, dd4 dd4Var, int i) {
        str.getClass();
        kb4Var.getClass();
        ib4Var.getClass();
        dd4Var.h0(1177798217);
        int i2 = i | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(str2) ? 32 : 16) | (dd4Var.f(str3) ? 256 : Token.CASE) | (dd4Var.f(ou6Var) ? 2048 : 1024) | (dd4Var.h(kb4Var) ? 16384 : 8192) | (dd4Var.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i2 & 1, (74899 & i2) != 74898)) {
            String strH = dx1.h(str, "-", str3);
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new lq2(str, str3, 5);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var2 = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ry6 ry6VarD = pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b;
            ev8 ev8VarA = ek5.a(dd4Var);
            a91 a91VarA = ug8.a(ln9.class);
            ln9 ln9Var = (ln9) ((qtb) qx1.N(a91VarA, pj4VarA.f(), dx1.h(a91VarA.f(), "-", strH), ry6VarD, ev8VarA, ib4Var2));
            boolean zF = dd4Var.f(ln9Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new hy7(ln9Var, 27);
                dd4Var.p0(objQ2);
            }
            lx1.g(ln9Var, null, (kb4) objQ2, dd4Var, 0);
            a07 a07VarB = bx1.B(ln9Var.M, dd4Var);
            if (((in9) a07VarB.getValue()).a) {
                dd4Var.f0(-2095524984);
                f(tg9.f(ou6Var, 1.0f), dd4Var, 0);
                dd4Var.q(false);
            } else if (((in9) a07VarB.getValue()).d) {
                dd4Var.f0(-2095407370);
                ou6 ou6VarF = tg9.f(ou6Var, 1.0f);
                boolean zF2 = dd4Var.f(ln9Var);
                Object objQ3 = dd4Var.Q();
                if (zF2 || objQ3 == obj) {
                    objQ3 = new o39(ln9Var, 12);
                    dd4Var.p0(objQ3);
                }
                e((i2 >> 3) & 14, (ib4) objQ3, dd4Var, ou6VarF, str2);
                dd4Var.q(false);
            } else if (((in9) a07VarB.getValue()).c.isEmpty()) {
                dd4Var.f0(-2094845929);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-2095165632);
                d(str2, ((in9) a07VarB.getValue()).c, ((in9) a07VarB.getValue()).b, tg9.f(ou6Var, 1.0f), ib4Var, kb4Var, dd4Var, ((i2 << 3) & 458752) | ((i2 >> 3) & 57358));
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uq6(str, str2, str3, ou6Var, kb4Var, ib4Var, i);
        }
    }

    public static final void d(String str, List list, boolean z, ou6 ou6Var, ib4 ib4Var, kb4 kb4Var, dd4 dd4Var, int i) {
        int i2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(906532615);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.h(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.g(z) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var2.h(ib4Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var2.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        int i3 = i2;
        if (dd4Var2.V(i3 & 1, (i3 & 74899) != 74898)) {
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
            boolean z2 = (i3 & 57344) == 16384;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new or6(17, ib4Var);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarV = yn2.V(0, (ib4) objQ, dd4Var2, ou6VarF, z);
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarV);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            dd4Var2.f0(-668038833);
            String strK = str.length() == 0 ? wn9.K((pv9) vt9.y0.getValue(), dd4Var2) : str;
            dd4Var2.q(false);
            bp5 bp5Var = new bp5(1.0f, true);
            ur9 ur9Var = s96.a;
            boolean z3 = false;
            nha.c(strK, bp5Var, ((q96) dd4Var2.j(ur9Var)).a.a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.g, dd4Var, 0, 0, 131064);
            if (z) {
                dd4Var.f0(765909272);
                mx4.a(i25.c((m53) a53.f.getValue(), dd4Var, 0), (String) null, tg9.n(lu6Var, 24.0f), 0L, dd4Var, 432, 8);
                dd4Var.q(false);
            } else {
                dd4Var.f0(766116321);
                dd4Var.q(false);
            }
            xv5.z(dd4Var, true, lu6Var, 24.0f, dd4Var);
            ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
            mv mvVar = new mv(8.0f, true, new gp(5));
            boolean zH = dd4Var.h(list);
            if ((i3 & 458752) == 131072) {
                z3 = true;
            }
            boolean z4 = zH | z3;
            Object objQ2 = dd4Var.Q();
            if (z4 || objQ2 == obj) {
                objQ2 = new qp0(list, kb4Var, 9);
                dd4Var.p0(objQ2);
            }
            rw1.k(ou6VarF2, null, null, false, mvVar, null, null, false, null, (kb4) objQ2, dd4Var, 24582, 494);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new k71(str, list, z, ou6Var, ib4Var, kb4Var, i);
        }
    }

    public static final void e(int i, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, String str) {
        int i2;
        String str2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1865241688);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.h(ib4Var) ? 256 : Token.CASE;
        }
        if (dd4Var2.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            dd4Var2.f0(823813244);
            String strK = str.length() == 0 ? wn9.K((pv9) vt9.y0.getValue(), dd4Var2) : str;
            dd4Var2.q(false);
            nha.c(strK, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.g, dd4Var2, 0, 0, 131070);
            dd4Var2 = dd4Var2;
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.h(lu6Var, 24.0f));
            str2 = str;
            kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var2, 0), wn9.K((pv9) mu9.Q.getValue(), dd4Var2), false, null, new xo4(bv4.A), null, null, null, ib4Var, dd4Var2, (i2 << 18) & 234881024, 236);
            xv5.A(lu6Var, 12.0f, dd4Var2, true);
        } else {
            str2 = str;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mr6(str2, ou6Var, ib4Var, i);
        }
    }

    public static final void f(ou6 ou6Var, dd4 dd4Var, int i) {
        ou6 ou6Var2;
        dd4 dd4Var2;
        dd4Var.h0(-1354208837);
        int i2 = (dd4Var.f(ou6Var) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            ou6Var2 = ou6Var;
            dd4Var2 = dd4Var;
            sdc.e(ou6Var2, null, jv3.v, dd4Var2, (i2 & 14) | 3072, 6);
        } else {
            ou6Var2 = ou6Var;
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var2, i, 22);
        }
    }

    public static final void g(boolean z, cl8 cl8Var, kga kgaVar, dd4 dd4Var, int i) {
        int i2;
        rha rhaVarD;
        dd4Var.h0(-1344558920);
        if ((i & 6) == 0) {
            i2 = (dd4Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.d(cl8Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(kgaVar) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            int i3 = i2 & 14;
            boolean zF = (i3 == 4) | dd4Var.f(kgaVar);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = new n19(kgaVar, z);
                dd4Var.p0(objQ);
            }
            tda tdaVar = (tda) objQ;
            boolean zH = dd4Var.h(kgaVar) | (i3 == 4);
            Object objQ2 = dd4Var.Q();
            if (zH || objQ2 == obj) {
                objQ2 = new lga(kgaVar, z);
                dd4Var.p0(objQ2);
            }
            qb7 qb7Var = (qb7) objQ2;
            boolean zH2 = pja.h(kgaVar.n().b);
            wga wgaVarN = kgaVar.n();
            int i4 = (int) (z ? wgaVarN.b >> 32 : wgaVarN.b & 4294967295L);
            qv5 qv5Var = kgaVar.d;
            float fK = (qv5Var == null || (rhaVarD = qv5Var.d()) == null) ? 0.0f : sg9.k(rhaVarD.a, i4);
            boolean zH3 = dd4Var.h(tdaVar);
            Object objQ3 = dd4Var.Q();
            if (zH3 || objQ3 == obj) {
                objQ3 = new w09(tdaVar, 1);
                dd4Var.p0(objQ3);
            }
            t1c.F(qb7Var, z, cl8Var, zH2, 0L, fK, r1a.b(lu6.a, tdaVar, (PointerInputEventHandler) objQ3), dd4Var, (i2 << 3) & 1008);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uu1(z, cl8Var, kgaVar, i, 7);
        }
    }

    public static final void h(lra lraVar, rj1 rj1Var, dd4 dd4Var, int i) {
        long j;
        long j2;
        ad1 ad1Var;
        lraVar.getClass();
        dd4Var.h0(281643902);
        int i2 = (dd4Var.f(lraVar) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = lraVar.a;
            Object obj = vl1.a;
            if (z) {
                dd4Var.f0(-1912438021);
                ad1Var = ((q96) dd4Var.j(s96.a)).a;
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1912383461);
                long j3 = lraVar.c;
                long j4 = lraVar.d;
                if (lraVar.b) {
                    dd4Var.f0(76864773);
                    j = j3;
                    j2 = ((q96) dd4Var.j(s96.a)).a.a;
                    dd4Var.q(false);
                } else {
                    j = j3;
                    dd4Var.f0(76865741);
                    dd4Var.q(false);
                    j2 = lraVar.d;
                }
                long j5 = j2;
                boolean z2 = !kf0.I(j4);
                long j6 = j;
                boolean zE = dd4Var.e(j6) | dd4Var.e(j4);
                Object objQ = dd4Var.Q();
                if (zE || objQ == obj) {
                    f73.a.getClass();
                    objQ = ad1.a(ny1.A(j5, z2, false, cm7.a, 0.0d, id1.d, f73.b, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j4, j6, j4, j6, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -122881, 65535);
                    dd4Var.p0(objQ);
                }
                ad1Var = (ad1) objQ;
                dd4Var.q(false);
            }
            m6a m6aVar = (m6a) dd4Var.j(b73.b);
            boolean zE2 = dd4Var.e(ad1Var.p);
            Object objQ2 = dd4Var.Q();
            if (zE2 || objQ2 == obj) {
                objQ2 = Boolean.valueOf(kf0.I(ad1Var.p));
                dd4Var.p0(objQ2);
            }
            Boolean bool = (Boolean) objQ2;
            boolean zBooleanValue = bool.booleanValue();
            boolean zF = dd4Var.f(m6aVar) | dd4Var.g(zBooleanValue);
            Object objQ3 = dd4Var.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new a73(m6aVar, zBooleanValue, (jt1) null, 1);
                dd4Var.p0(objQ3);
            }
            lc5.u((yb4) objQ3, dd4Var, bool);
            rla rlaVar = (rla) dd4Var.j(zma.a);
            boolean zF2 = dd4Var.f(rlaVar) | dd4Var.f(ad1Var);
            Object objQ4 = dd4Var.Q();
            if (zF2 || objQ4 == obj) {
                objQ4 = new k49(16, rlaVar, ad1Var);
                dd4Var.p0(objQ4);
            }
            lc5.j(ad1Var, (kb4) objQ4, dd4Var);
            s96.b(ad1Var, m99.a, b73.d(lraVar.f, dd4Var), jf0.G(840308306, new tb0(rj1Var, 13), dd4Var), dd4Var, 3120, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b18(lraVar, rj1Var, i, 13);
        }
    }

    public static final void i(final mq8 mq8Var, final int i, final o8a o8aVar, final float f, dd4 dd4Var, final int i2) {
        dd4Var.h0(1932339686);
        int i3 = (dd4Var.h(mq8Var) ? 4 : 2) | i2 | (dd4Var.d(i) ? 32 : 16) | (dd4Var.h(o8aVar) ? 256 : Token.CASE);
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            float f2 = 8.0f + f;
            p7c.c(xg9.i(xg9.p(f2), f2).d(new x4(mq8Var)), e9.d, jf0.G(-968363452, new yb4() { // from class: m8a
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    dd4 dd4Var2 = (dd4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ni niVar = new ni(i);
                        float f3 = f;
                        ny1.b(niVar, null, xg9.i(xg9.p(f3), f3), 0, new pc1(new eva(o8aVar.g)), dd4Var2, 32816, 8);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, 384);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(i, o8aVar, f, i2) { // from class: n8a
                public final /* synthetic */ int b;
                public final /* synthetic */ o8a c;
                public final /* synthetic */ float d;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(3073);
                    hn9.i(this.a, this.b, this.c, this.d, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final mf4 j(o8a o8aVar) {
        mf4 mf4VarH = ww1.H(xg9.h(kf4.a).d(new zb0(o8aVar.a)), 28.0f);
        kj7 kj7Var = new kj7(2, 12.0f);
        return mf4VarH.d(new nj7(kj7Var, kj7Var, kj7Var, kj7Var)).d(new x4(new rq9(fw.B0((z4[]) Arrays.copyOf(new z4[0], 0)))));
    }

    public static final Object k(ly7 ly7Var, String str, kt1 kt1Var) {
        Object objB = ly7Var.b(str, new uha(25), kt1Var);
        return objB == xx1.a ? objB : heb.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int l(int r11, java.lang.String r12) {
        /*
            ca3 r0 = p()
            r1 = 0
            if (r0 == 0) goto L7c
            int r2 = r0.c()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L10
            goto L11
        L10:
            r4 = r3
        L11:
            if (r4 == 0) goto L76
            java.lang.String r2 = "charSequence cannot be null"
            defpackage.lx1.B(r12, r2)
            aa r0 = r0.e
            java.lang.Object r0 = r0.b
            r4 = r0
            y91 r4 = (y91) r4
            r4.getClass()
            r0 = -1
            if (r11 < 0) goto L2b
            int r2 = r12.length()
            if (r11 < r2) goto L2d
        L2b:
            r5 = r12
            goto L6c
        L2d:
            boolean r2 = r12 instanceof android.text.Spanned
            if (r2 == 0) goto L49
            r2 = r12
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r5 = r11 + 1
            java.lang.Class<qbb> r6 = qbb.class
            java.lang.Object[] r5 = r2.getSpans(r11, r5, r6)
            qbb[] r5 = (qbb[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L49
            r3 = r5[r3]
            int r2 = r2.getSpanEnd(r3)
            r5 = r12
            goto L6d
        L49:
            int r2 = r11 + (-16)
            int r6 = java.lang.Math.max(r3, r2)
            int r2 = r12.length()
            int r3 = r11 + 16
            int r7 = java.lang.Math.min(r2, r3)
            bb3 r10 = new bb3
            r10.<init>(r11)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            r5 = r12
            java.lang.Object r12 = r4.T(r5, r6, r7, r8, r9, r10)
            bb3 r12 = (bb3) r12
            int r2 = r12.c
            goto L6d
        L6c:
            r2 = r0
        L6d:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L74
            goto L7d
        L74:
            r1 = r12
            goto L7d
        L76:
            java.lang.String r11 = "Not initialized yet"
            gp.j(r11)
            return r3
        L7c:
            r5 = r12
        L7d:
            if (r1 == 0) goto L84
            int r11 = r1.intValue()
            return r11
        L84:
            java.text.BreakIterator r12 = java.text.BreakIterator.getCharacterInstance()
            r12.setText(r5)
            int r11 = r12.following(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn9.l(int, java.lang.String):int");
    }

    public static final int m(int i, String str) {
        ca3 ca3VarP = p();
        Integer num = null;
        if (ca3VarP != null) {
            Integer numValueOf = Integer.valueOf(ca3VarP.b(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final ir0 n(g11 g11Var, j11 j11Var) {
        g11Var.getClass();
        j11Var.getClass();
        int i = j11Var.a;
        return i == Integer.MAX_VALUE ? vm7.c(Integer.MAX_VALUE, 6, null) : vm7.c(i, 4, ar0.a);
    }

    public static String o(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final ca3 p() {
        if (!ca3.d()) {
            return null;
        }
        ca3 ca3VarA = ca3.a();
        if (ca3VarA.c() == 1) {
            return ca3VarA;
        }
        return null;
    }

    public static final int q(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean s(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static final void t(aq5 aq5Var, String str, List list, kb4 kb4Var, yb4 yb4Var) {
        aq5Var.getClass();
        str.getClass();
        kb4Var.getClass();
        yb4Var.getClass();
        aq5Var.c0(list.size(), new kt6(25, new qc9(20), list), new bq0(5, new vw8(6, (byte) 0), list), new js6(16, list), new rj1(new l90(list, str, kb4Var, yb4Var, 9), true, -1117249557));
    }

    public static final Object u(fv8 fv8Var, boolean z, fv8 fv8Var2, yb4 yb4Var) throws Throwable {
        Object ei1Var;
        Object objS;
        try {
            if (yb4Var instanceof vc0) {
                fw.F(2, yb4Var);
                ei1Var = yb4Var.invoke(fv8Var2, fv8Var);
            } else {
                ei1Var = bx1.Y(yb4Var, fv8Var2, fv8Var);
            }
        } catch (jw2 e) {
            Throwable th = e.a;
            fv8Var.Q(new ei1(false, th));
            throw th;
        } catch (Throwable th2) {
            ei1Var = new ei1(false, th2);
        }
        xx1 xx1Var = xx1.a;
        if (ei1Var == xx1Var || (objS = fv8Var.S(ei1Var)) == qe5.b) {
            return xx1Var;
        }
        fv8Var.s0();
        if (!(objS instanceof ei1)) {
            return qe5.a(objS);
        }
        if (!z) {
            Throwable th3 = ((ei1) objS).a;
            if ((th3 instanceof vua) && ((vua) th3).a == fv8Var) {
                if (ei1Var instanceof ei1) {
                    throw ((ei1) ei1Var).a;
                }
                return ei1Var;
            }
        }
        throw ((ei1) objS).a;
    }
}
