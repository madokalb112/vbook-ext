package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class eu6 {
    public static final List a = gc1.Z(Float.valueOf(0.25f), Float.valueOf(0.5f), Float.valueOf(1.0f), Float.valueOf(1.5f), Float.valueOf(2.0f), Float.valueOf(2.5f), Float.valueOf(3.0f));

    public static final void a(final boolean z, final float f, final ib4 ib4Var, final kb4 kb4Var, dd4 dd4Var, final int i) {
        boolean z2;
        int i2;
        ib4Var.getClass();
        kb4Var.getClass();
        dd4Var.h0(1635375280);
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (dd4Var.g(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(ib4Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        int i3 = 0;
        if (dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z3 = z2;
            gx1.a(z3, bv4.d, (((long) Float.floatToRawIntBits(8.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), null, 0.0f, null, ib4Var, jf0.G(2041576740, new bu6(f, kb4Var, i3), dd4Var), dd4Var, (i2 & 14) | 12583344 | ((i2 << 12) & 3670016), 56);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: cu6
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    eu6.a(z, f, ib4Var, kb4Var, (dd4) obj, qu1.x0(i | 1));
                    return heb.a;
                }
            };
        }
    }

    public static final void b(final float f, final boolean z, final ib4 ib4Var, dd4 dd4Var, final int i) {
        long jG;
        long jC;
        long j;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(2133220924);
        int i2 = i | (dd4Var2.c(f) ? 4 : 2) | (dd4Var2.g(z) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            if (z) {
                dd4Var2.f0(-1846400958);
                jG = lc1.c(0.2f, ((q96) dd4Var2.j(s96.a)).a.a);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-1846327457);
                jG = dd1.g(((q96) dd4Var2.j(s96.a)).a, 6.0f);
                dd4Var2.q(false);
            }
            if (z) {
                dd4Var2.f0(-1846220414);
                jC = lc1.c(0.6f, ((q96) dd4Var2.j(s96.a)).a.a);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-1846147006);
                jC = lc1.c(0.2f, ((q96) dd4Var2.j(s96.a)).a.A);
                dd4Var2.q(false);
            }
            if (z) {
                dd4Var2.f0(-1846045419);
                j = ((q96) dd4Var2.j(s96.a)).a.a;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-1845990797);
                j = ((q96) dd4Var2.j(s96.a)).a.q;
                dd4Var2.q(false);
            }
            ur9 ur9Var = s96.a;
            ou6 ou6VarM0 = gjb.m0(fw.J(null, ib4Var, fw.G(fe.L(t96.w(lu6.a, ((q96) dd4Var2.j(ur9Var)).c.c), jG, jf0.G), 1.0f, jC, ((q96) dd4Var2.j(ur9Var)).c.c), false, 15), 14.0f, 8.0f);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarM0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ha6VarD);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            nha.c(wn9.L((pv9) ev9.v0.getValue(), new Object[]{c(f)}, dd4Var2), (ou6) null, j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.k, dd4Var, 0, 0, 131066);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(f, z, ib4Var, i) { // from class: du6
                public final /* synthetic */ float a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ ib4 c;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(1);
                    eu6.b(this.a, this.b, this.c, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final String c(float f) {
        float f2 = ((int) (f * 100.0f)) / 100.0f;
        int i = (int) f2;
        return Math.abs(f2 - ((float) i)) < 0.005f ? String.valueOf(i) : bw9.E0(bw9.E0(String.valueOf(((double) ((int) (f2 * 100.0f))) / 100.0d), '0'), '.');
    }
}
