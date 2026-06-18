package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class do8 {
    public static final long a = vp1.a(0, 0, 0, 0);
    public static final float b = 16.0f;
    public static final float c = 12.0f;
    public static final float d = 4.0f;
    public static final ou6 e = tg9.a(lu6.a, 48.0f, 48.0f);

    public static final void a(String str, yb4 yb4Var, boolean z, ta5 ta5Var, pj7 pj7Var, zn8 zn8Var, yb4 yb4Var2, dd4 dd4Var, int i, int i2) {
        int i3;
        yb4 yb4Var3;
        int i4;
        pj7 pj7Var2;
        yb4 yb4Var4;
        bv4 bv4Var;
        boolean z2;
        boolean z3;
        xub xubVar = js8.y;
        yb4Var.getClass();
        ta5Var.getClass();
        zn8Var.getClass();
        dd4Var.h0(1477218819);
        if ((i & 6) == 0) {
            i3 = (dd4Var.d(0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dd4Var.f(str) ? 32 : 16;
        }
        int i5 = i & 384;
        int i6 = Token.CASE;
        if (i5 == 0) {
            yb4Var3 = yb4Var;
            i3 |= dd4Var.h(yb4Var3) ? 256 : 128;
        } else {
            yb4Var3 = yb4Var;
        }
        if ((i & 3072) == 0) {
            i3 |= dd4Var.f(xubVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= dd4Var.h((Object) null) ? 16384 : 8192;
        }
        int i7 = i & 196608;
        int i8 = Parser.ARGC_LIMIT;
        if (i7 == 0) {
            i3 |= dd4Var.h((Object) null) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= dd4Var.h((Object) null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= dd4Var.h((Object) null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= dd4Var.h((Object) null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= dd4Var.g(false) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (dd4Var.g(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dd4Var.g(false) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (dd4Var.f(ta5Var)) {
                i6 = 256;
            }
            i4 |= i6;
        }
        if ((i2 & 3072) == 0) {
            pj7Var2 = pj7Var;
            i4 |= dd4Var.f(pj7Var2) ? 2048 : 1024;
        } else {
            pj7Var2 = pj7Var;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dd4Var.f(zn8Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            yb4Var4 = yb4Var2;
            if (dd4Var.h(yb4Var4)) {
                i8 = 131072;
            }
            i4 |= i8;
        } else {
            yb4Var4 = yb4Var2;
        }
        boolean z4 = true;
        if (dd4Var.V(i3 & 1, ((i3 & 306783379) == 306783378 && (74899 & i4) == 74898) ? false : true)) {
            boolean z5 = ((i3 & 7168) == 2048) | ((i3 & Token.ASSIGN_MOD) == 32);
            Object objQ = dd4Var.Q();
            if (z5 || objQ == vl1.a) {
                objQ = xubVar.a(new bp(str));
                dd4Var.p0(objQ);
            }
            String str2 = ((i3b) objQ).a.b;
            h85 h85Var = ((Boolean) ny1.l(ta5Var, dd4Var, (i4 >> 6) & 14).getValue()).booleanValue() ? h85.a : str2.length() == 0 ? h85.b : h85.c;
            co8 co8Var = new co8(zn8Var, z, ta5Var);
            ur9 ur9Var = s96.a;
            xbb xbbVar = ((q96) dd4Var.j(ur9Var)).b;
            uka ukaVar = xbbVar.j;
            uka ukaVar2 = xbbVar.l;
            long jB = ukaVar.b();
            long j = lc1.j;
            if ((!lc1.d(jB, j) || lc1.d(ukaVar2.b(), j)) && (lc1.d(ukaVar.b(), j) || !lc1.d(ukaVar2.b(), j))) {
                z4 = false;
            }
            bv4 bv4Var2 = bv4.P;
            dd4Var.f0(-2026837344);
            long jB2 = ((q96) dd4Var.j(ur9Var)).b.l.b();
            if (z4) {
                dd4Var.f0(-214716904);
                if (jB2 == 16) {
                    jB2 = ((lc1) co8Var.c(h85Var, dd4Var, 0)).a;
                }
                z2 = false;
                dd4Var.q(false);
                bv4Var = bv4Var2;
            } else {
                bv4Var = bv4Var2;
                z2 = false;
                dd4Var.f0(1932737641);
                dd4Var.q(false);
            }
            long j2 = jB2;
            dd4Var.q(z2);
            dd4Var.f0(-2026831168);
            long jB3 = ((q96) dd4Var.j(ur9Var)).b.j.b();
            if (z4) {
                dd4Var.f0(96674167);
                if (jB3 == 16) {
                    jB3 = ((lc1) co8Var.c(h85Var, dd4Var, 0)).a;
                }
                z3 = false;
            } else {
                z3 = false;
                dd4Var.f0(1665687850);
            }
            dd4Var.q(z3);
            long j3 = jB3;
            dd4Var.q(z3);
            bv4Var.l(h85Var, j2, j3, co8Var, z3, jf0.G(1730049478, new bo8(str2, zn8Var, z, ta5Var, yb4Var3, pj7Var2, z4, ukaVar2, yb4Var4), dd4Var), dd4Var, 1769472);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new gs0(str, yb4Var, z, ta5Var, pj7Var, zn8Var, yb4Var2, i, i2);
        }
    }

    public static final Object b(ca6 ca6Var) {
        ca6Var.getClass();
        Object objF = ca6Var.F();
        dn5 dn5Var = objF instanceof dn5 ? (dn5) objF : null;
        if (dn5Var != null) {
            return dn5Var.A;
        }
        return null;
    }
}
