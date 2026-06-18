package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ev1 {
    public static final ur9 a = new ur9(new dh1(6));

    public static final void a(ib4 ib4Var, kf8 kf8Var, kb4 kb4Var, boolean z, kb4 kb4Var2, dd4 dd4Var, int i) {
        kb4 kb4Var3;
        boolean z2;
        kf8 kf8Var2;
        kb4 kb4Var4;
        ib4Var.getClass();
        kf8Var.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var.h0(1507002163);
        if ((((dd4Var.f(kf8Var) ? 32 : 16) | i | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.g(z) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 16384 : 8192)) & 9363) == 9362 && dd4Var.F()) {
            dd4Var.Y();
            kb4Var3 = kb4Var2;
            z2 = z;
            kb4Var4 = kb4Var;
            kf8Var2 = kf8Var;
        } else {
            List list = ((o12) dd4Var.j(p12.b)).e;
            int size = list.size() + 1;
            kb4Var3 = kb4Var2;
            awa awaVar = new awa(kb4Var3, z, list, kf8Var, kb4Var);
            z2 = z;
            kf8Var2 = kf8Var;
            kb4Var4 = kb4Var;
            cx1.p(ib4Var, size, jf0.G(1826395663, awaVar, dd4Var), dd4Var, 390);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new z41(ib4Var, kf8Var2, kb4Var4, z2, kb4Var3, i);
        }
    }

    public static final void b(ou6 ou6Var, rj1 rj1Var, dd4 dd4Var, int i) {
        dd4Var.h0(280500352);
        int i2 = (dd4Var.f(ou6Var) ? 4 : 2) | i;
        int i3 = 0;
        if ((i2 & 19) == 18 && dd4Var.F()) {
            dd4Var.Y();
        } else {
            rp8 rp8Var = tp8.a;
            ur9 ur9Var = s96.a;
            j1a.a(ou6Var, rp8Var, lc1.c(0.8f, ((q96) dd4Var.j(ur9Var)).a.p), dd1.b(((q96) dd4Var.j(ur9Var)).a.p, dd4Var), 0.0f, 4.0f, (wm0) null, jf0.G(2051005467, new yu1(rj1Var, i3), dd4Var), dd4Var, (i2 & 14) | 12779520, 80);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vu1(ou6Var, rj1Var, i, 0);
        }
    }

    public static final void c(boolean z, h12 h12Var, ou6 ou6Var, dd4 dd4Var, int i) {
        int i2;
        h12Var.getClass();
        dd4Var.h0(613399259);
        if ((i & 6) == 0) {
            i2 = (dd4Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(h12Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & Token.EXPR_VOID) == 146 && dd4Var.F()) {
            dd4Var.Y();
        } else {
            jv3.e(a.a(Boolean.valueOf(z)), jf0.G(-190648805, new bq0(1, ou6Var, h12Var), dd4Var), dd4Var, 56);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uu1(z, h12Var, ou6Var, i, 0);
        }
    }

    public static final void d(e12 e12Var, boolean z, ib4 ib4Var, ou6 ou6Var, dd4 dd4Var, int i) {
        long j;
        ou6 ou6Var2;
        e12Var.getClass();
        ib4Var.getClass();
        dd4Var.h0(-988307538);
        int i2 = 2;
        int i3 = i | (dd4Var.f(e12Var) ? 4 : 2) | (dd4Var.g(z) ? 32 : 16) | (dd4Var.h(ib4Var) ? 256 : Token.CASE) | 3072;
        if ((i3 & 1171) == 1170 && dd4Var.F()) {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        } else {
            if (z) {
                dd4Var.f0(-575762986);
                j = ((q96) dd4Var.j(s96.a)).a.j;
                dd4Var.q(false);
            } else {
                dd4Var.f0(-575764491);
                j = ((lc1) dd4Var.j(oq1.a)).a;
                dd4Var.q(false);
            }
            ou6Var2 = lu6.a;
            kf0.m(ib4Var, ou6Var2, false, (kx4) null, jf0.G(-666678735, new bq0(i2, e12Var, yf9.a(j, (ko) null, dd4Var, 0, 14)), dd4Var), dd4Var, ((i3 >> 6) & 14) | 196656, 28);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i90(e12Var, z, ib4Var, ou6Var2, i, 4);
        }
    }

    public static final void e(ib4 ib4Var, List list, e12 e12Var, kb4 kb4Var, dd4 dd4Var, int i) {
        ib4Var.getClass();
        e12Var.getClass();
        kb4Var.getClass();
        dd4Var.h0(2098499478);
        if ((((dd4Var.h(list) ? 32 : 16) | i | (dd4Var.f(e12Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 2048 : 1024)) & 1171) == 1170 && dd4Var.F()) {
            dd4Var.Y();
        } else {
            cx1.p(ib4Var, list.size(), jf0.G(-21915334, new dv1(list, e12Var, kb4Var), dd4Var), dd4Var, 390);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ev0(ib4Var, list, e12Var, kb4Var, i);
        }
    }
}
