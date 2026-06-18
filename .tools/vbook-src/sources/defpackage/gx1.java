package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import java.io.File;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class gx1 {
    public static p35 b;
    public final /* synthetic */ int a;

    public /* synthetic */ gx1(int i) {
        this.a = i;
    }

    public static ni1 A(String str, String str2) {
        j80 j80Var = new j80(str, str2);
        mi1 mi1VarB = ni1.b(j80.class);
        mi1VarB.e = 1;
        mi1VarB.f = new li1(j80Var, 0);
        return mi1VarB.b();
    }

    public static final File B(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static kx4 C(ad1 ad1Var, long j) {
        kx4 kx4Var = ad1Var.c0;
        if (kx4Var != null) {
            return kx4Var;
        }
        long j2 = lc1.i;
        kx4 kx4Var2 = new kx4(j2, j, j2, lc1.c(zib.b, j));
        ad1Var.c0 = kx4Var2;
        return kx4Var2;
    }

    public static void D(un5 un5Var, fx1 fx1Var, sq0 sq0Var, float f, int i) {
        float f2 = (i & 4) != 0 ? 1.0f : f;
        boolean z = fx1Var instanceof yh7;
        ox3 ox3Var = ox3.a;
        if (z) {
            kf8 kf8Var = ((yh7) fx1Var).b;
            float f3 = kf8Var.a;
            un5Var.P0(sq0Var, (((long) Float.floatToRawIntBits(kf8Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32), V(kf8Var), f2, ox3Var, (qc1) null, 3);
            return;
        }
        if (!(fx1Var instanceof zh7)) {
            if (fx1Var instanceof xh7) {
                un5Var.x(((xh7) fx1Var).b, sq0Var, f2, ox3Var, (qc1) null, 3);
                return;
            } else {
                mn5.g();
                return;
            }
        }
        zh7 zh7Var = (zh7) fx1Var;
        hh hhVar = zh7Var.c;
        if (hhVar != null) {
            un5Var.x(hhVar, sq0Var, f2, ox3Var, (qc1) null, 3);
            return;
        }
        np8 np8Var = zh7Var.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (np8Var.h >> 32));
        float f4 = np8Var.a;
        un5Var.D0(sq0Var, (((long) Float.floatToRawIntBits(np8Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32), (((long) Float.floatToRawIntBits(np8Var.b())) << 32) | (((long) Float.floatToRawIntBits(np8Var.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), f2, ox3Var, (qc1) null, 3);
    }

    public static void E(un5 un5Var, fx1 fx1Var, long j) {
        boolean z = fx1Var instanceof yh7;
        ox3 ox3Var = ox3.a;
        if (z) {
            kf8 kf8Var = ((yh7) fx1Var).b;
            float f = kf8Var.a;
            un5Var.z(j, (((long) Float.floatToRawIntBits(kf8Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), V(kf8Var), 1.0f, ox3Var, 3);
            return;
        }
        if (!(fx1Var instanceof zh7)) {
            if (fx1Var instanceof xh7) {
                un5Var.h(((xh7) fx1Var).b, j, 1.0f, ox3Var);
                return;
            } else {
                mn5.g();
                return;
            }
        }
        zh7 zh7Var = (zh7) fx1Var;
        hh hhVar = zh7Var.c;
        if (hhVar != null) {
            un5Var.h(hhVar, j, 1.0f, ox3Var);
            return;
        }
        np8 np8Var = zh7Var.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (np8Var.h >> 32));
        float f2 = np8Var.a;
        un5Var.j0(j, (((long) Float.floatToRawIntBits(np8Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), (((long) Float.floatToRawIntBits(np8Var.b())) << 32) | (((long) Float.floatToRawIntBits(np8Var.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), ox3Var, 1.0f);
    }

    public static ni1 F(String str, sy3 sy3Var) {
        mi1 mi1VarB = ni1.b(j80.class);
        mi1VarB.e = 1;
        mi1VarB.a(vn2.b(Context.class));
        mi1VarB.f = new gj1(3, str, sy3Var);
        return mi1VarB.b();
    }

    public static hx1 G(hx1 hx1Var, ix1 ix1Var) {
        ix1Var.getClass();
        if (lc5.Q(hx1Var.getKey(), ix1Var)) {
            return hx1Var;
        }
        return null;
    }

    public static Object I(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object L(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        mn5.m();
        return null;
    }

    public static kx4 M(dd4 dd4Var) {
        long j = ((lc1) dd4Var.j(oq1.a)).a;
        kx4 kx4VarC = C(((q96) dd4Var.j(s96.a)).a, j);
        if (lc1.d(kx4VarC.b, j)) {
            return kx4VarC;
        }
        return kx4VarC.a(kx4VarC.a, j, kx4VarC.c, lc1.c(zib.b, j));
    }

    public static kx4 N(long j, dd4 dd4Var) {
        fn1 fn1Var = oq1.a;
        long j2 = ((lc1) dd4Var.j(fn1Var)).a;
        return C(((q96) dd4Var.j(s96.a)).a, ((lc1) dd4Var.j(fn1Var)).a).a(j, j2, lc1.j, lc1.c(zib.b, j2));
    }

    public static final xj5 O(float f, float f2, int i, kb4 kb4Var) {
        float f3;
        zj5 zj5Var = new zj5();
        kb4Var.invoke(zj5Var);
        int i2 = zj5Var.a;
        while (true) {
            ArrayList arrayList = zj5Var.c;
            if (i2 >= gc1.S(arrayList)) {
                break;
            }
            int i3 = i2 + 1;
            if (((yj5) arrayList.get(i3)).a != zj5Var.b) {
                break;
            }
            i2 = i3;
        }
        int i4 = zj5Var.a;
        int i5 = i2 - i4;
        if (i == 0) {
            float f4 = 0.0f;
            if (f2 != 0.0f) {
                int i6 = i5 % 2;
                if (i6 + ((((i6 ^ 2) & ((-i6) | i6)) >> 31) & 2) != 0) {
                    f4 = f2 / 2.0f;
                }
            }
            f3 = (((f / 2.0f) - ((zj5Var.b / 2.0f) * i5)) - f4) - ((i5 / 2) * f2);
        } else {
            float f5 = zj5Var.b;
            f3 = i == 1 ? f - (f5 / 2.0f) : f5 / 2.0f;
        }
        return new xj5(zj5.b(i4, f3, i4, i2, zj5Var.b, f, f2, zj5Var.c));
    }

    public static final wj5 P(wj5 wj5Var, wj5 wj5Var2, float f) {
        return new wj5(sw1.V(wj5Var.a, wj5Var2.a, f), sw1.V(wj5Var.b, wj5Var2.b, f), sw1.V(wj5Var.c, wj5Var2.c, f), f < 0.5f ? wj5Var.d : wj5Var2.d, f < 0.5f ? wj5Var.e : wj5Var2.e, (f < 0.5f ? wj5Var : wj5Var2).f, sw1.V(wj5Var.g, wj5Var2.g, f));
    }

    public static jx1 Q(hx1 hx1Var, ix1 ix1Var) {
        ix1Var.getClass();
        return lc5.Q(hx1Var.getKey(), ix1Var) ? hc3.a : hx1Var;
    }

    public static final void R(t27 t27Var, String str, String str2) {
        t27Var.getClass();
        str.getClass();
        t27Var.a.d(new np2(str, str2));
    }

    public static String S(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = "";
        }
        int length = lowerCase.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = lc5.V(lowerCase.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return lowerCase.subSequence(i, length + 1).toString();
    }

    public static jx1 T(hx1 hx1Var, jx1 jx1Var) {
        jx1Var.getClass();
        return jx1Var == hc3.a ? hx1Var : (jx1) jx1Var.fold(hx1Var, new qk1(29));
    }

    public static final kj8 U(wq5 wq5Var, szb szbVar, ac4 ac4Var, dd4 dd4Var, int i) {
        wq5Var.getClass();
        ac4Var.getClass();
        dd4Var.f0(1209098259);
        dd4Var.f0(-1246997158);
        int i2 = i & 14;
        boolean z = ((i2 ^ 6) > 4 && dd4Var.f(wq5Var)) || (i & 6) == 4;
        Object objQ = dd4Var.Q();
        fu6 fu6Var = vl1.a;
        if (z || objQ == fu6Var) {
            objQ = new rh(wq5Var, 19);
            dd4Var.p0(objQ);
        }
        dd4Var.q(false);
        by8 by8VarK0 = ny1.k0(wq5Var, (ib4) objQ, dd4Var, i2);
        pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
        float fK0 = pn2Var.k0(48.0f);
        Object objQ2 = dd4Var.Q();
        if (objQ2 == fu6Var) {
            ym1 ym1Var = new ym1(lc5.Z(dd4Var));
            dd4Var.p0(ym1Var);
            objQ2 = ym1Var;
        }
        vx1 vx1Var = ((ym1) objQ2).a;
        a07 a07VarA = dk9.A(ac4Var, dd4Var);
        zm5 zm5Var = (zm5) dd4Var.j(xm1.n);
        o oVar = new o(pn2Var.k0(gjb.W(szbVar, zm5Var)), pn2Var.k0(gjb.V(szbVar, zm5Var)), pn2Var.k0(szbVar.d()), pn2Var.k0(szbVar.a()));
        dd4Var.f0(-1246964004);
        boolean zF = ((((i & Token.ASSIGN_MOD) ^ 48) > 32 && dd4Var.f(szbVar)) || (i & 48) == 32) | dd4Var.f(vx1Var) | ((((i & 14) ^ 6) > 4 && dd4Var.f(wq5Var)) || (i & 6) == 4) | ((((i & 896) ^ 384) > 256 && dd4Var.c(48.0f)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && dd4Var.f(by8VarK0)) || (i & 3072) == 2048);
        Object objQ3 = dd4Var.Q();
        if (zF || objQ3 == fu6Var) {
            by8VarK0.getClass();
            zm5Var.getClass();
            kj8 kj8Var = new kj8(new sq5(wq5Var), vx1Var, a07VarA, fK0, oVar, by8VarK0, nw8.a, zm5Var, null, 768);
            dd4Var.p0(kj8Var);
            objQ3 = kj8Var;
        }
        kj8 kj8Var2 = (kj8) objQ3;
        dd4Var.q(false);
        dd4Var.q(false);
        return kj8Var2;
    }

    public static final long V(kf8 kf8Var) {
        float f = kf8Var.c - kf8Var.a;
        return (((long) Float.floatToRawIntBits(kf8Var.d - kf8Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static void W(List list, h08 h08Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (h08Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final hd3 X(hd3 r17, a25 r18, gh7 r19, yg3 r20, defpackage.kt1 r21) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx1.X(hd3, a25, gh7, yg3, kt1):hd3");
    }

    public static final int Y(int i, int i2, String str) {
        while (i2 > i && gjb.h0(str.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    public static final int Z(int i, int i2, String str) {
        while (i < i2 && gjb.h0(str.charAt(i))) {
            i++;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r22, f9 r23, long r24, ou6 r26, float r27, pj7 r28, final defpackage.ib4 r29, final defpackage.rj1 r30, dd4 r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx1.a(boolean, f9, long, ou6, float, pj7, ib4, rj1, dd4, int, int):void");
    }

    public static final void b(rj1 rj1Var, yb4 yb4Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i, int i2) {
        rj1 rj1Var2;
        dd4 dd4Var2;
        ib4 ib4Var2;
        ou6 ou6Var2;
        yb4 yb4Var2;
        ib4Var.getClass();
        dd4Var.h0(-766207653);
        int i3 = i | 48;
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 = i | 432;
        } else if ((i & 384) == 0) {
            i3 |= dd4Var.h(yb4Var) ? 256 : Token.CASE;
        }
        int i5 = i3 | 27648 | (dd4Var.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i5 & 1, (74899 & i5) != 74898)) {
            if (i4 != 0) {
                yb4Var = null;
            }
            yb4 yb4Var3 = yb4Var;
            ou6 ou6Var3 = lu6.a;
            rj1Var2 = rj1Var;
            dd4Var2 = dd4Var;
            d(rj1Var2, null, yb4Var3, null, ou6Var3, ib4Var, dd4Var2, i5 & 524286);
            ib4Var2 = ib4Var;
            yb4Var2 = yb4Var3;
            ou6Var2 = ou6Var3;
        } else {
            rj1Var2 = rj1Var;
            dd4Var2 = dd4Var;
            ib4Var2 = ib4Var;
            dd4Var2.Y();
            ou6Var2 = ou6Var;
            yb4Var2 = yb4Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tv2(rj1Var2, yb4Var2, ou6Var2, ib4Var2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r16, java.lang.String r17, defpackage.yb4 r18, java.lang.Boolean r19, ou6 r20, defpackage.ib4 r21, dd4 r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx1.c(java.lang.String, java.lang.String, yb4, java.lang.Boolean, ou6, ib4, dd4, int, int):void");
    }

    public static final void d(rj1 rj1Var, yb4 yb4Var, yb4 yb4Var2, Boolean bool, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i) {
        int i2;
        yb4 yb4Var3;
        long j;
        boolean z;
        long jC;
        dd4Var.h0(-1783779311);
        if ((i & 6) == 0) {
            i2 = (dd4Var.h(rj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            yb4Var3 = yb4Var;
            i2 |= dd4Var.h(yb4Var3) ? 32 : 16;
        } else {
            yb4Var3 = yb4Var;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(yb4Var2) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.f(bool) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (dd4Var.V(i2 & 1, (74899 & i2) != 74898)) {
            Boolean bool2 = Boolean.TRUE;
            if (lc5.Q(bool, bool2)) {
                dd4Var.f0(-519957032);
                j = ((q96) dd4Var.j(s96.a)).a.a;
            } else {
                dd4Var.f0(-519955782);
                j = ((q96) dd4Var.j(s96.a)).a.q;
            }
            dd4Var.q(false);
            ou6 ou6VarM0 = gjb.m0(ou6Var, 6.0f, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarW = t96.w(ou6VarM0, ((q96) dd4Var.j(ur9Var)).c.b);
            if (lc5.Q(bool, bool2)) {
                dd4Var.f0(-519947868);
                jC = lc1.c(0.14f, ((q96) dd4Var.j(ur9Var)).a.a);
                z = false;
                dd4Var.q(false);
            } else {
                z = false;
                dd4Var.f0(-519946884);
                dd4Var.q(false);
                jC = lc1.i;
            }
            ou6 ou6VarJ = tg9.j(gjb.m0(fw.J(null, ib4Var, fe.L(ou6VarW, jC, jf0.G), z, 15), 12.0f, 6.0f), 36.0f, 0.0f, 2);
            ha6 ha6VarD = pn0.d(bv4.b, z);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarJ);
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
            jv3.e(oq1.a.a(new lc1(j)), jf0.G(-2031223721, new ev0(yb4Var2, bool, rj1Var, yb4Var3, 16), dd4Var), dd4Var, 56);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tz0(rj1Var, yb4Var, yb4Var2, bool, ou6Var, ib4Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.to3 r46, dd4 r47, int r48) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx1.e(to3, dd4, int):void");
    }

    public static final void f(String str, String str2, dd4 dd4Var, int i) {
        String str3;
        int i2;
        dd4 dd4Var2 = dd4Var;
        str.getClass();
        dd4Var2.h0(-970199339);
        int i3 = i | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.f(str2) ? 32 : 16);
        if (dd4Var2.V(i3 & 1, (i3 & 19) != 18)) {
            lu6 lu6Var = lu6.a;
            ou6 ou6VarL0 = gjb.l0(fe.L(t96.w(tg9.f(lu6Var, 1.0f), s00.p(dd4Var2).c), lc1.c(0.4f, s00.o(dd4Var2).y), jf0.G), 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL0);
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
            un9.s(ll1.d, dd4Var2, ou6VarL02);
            nha.c(str, (ou6) null, s00.o(dd4Var2).z, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).k, dd4Var, i3 & 14, 0, 131066);
            dd4Var2 = dd4Var;
            if (bw9.a0(str2)) {
                str3 = str2;
                i2 = 0;
                dd4Var2.f0(-906736285);
                dd4Var2.q(false);
            } else {
                ky0.z(dd4Var2, -907055337, lu6Var, 6.0f, dd4Var2);
                str3 = str2;
                nha.c(str3, (ou6) null, s00.o(dd4Var2).z, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 3, 0, (kb4) null, s00.q(dd4Var2).l, dd4Var, (i3 >> 3) & 14, 24960, 110586);
                dd4Var2 = dd4Var;
                i2 = 0;
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            str3 = str2;
            i2 = 0;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new en6(str, str3, i, i2);
        }
    }

    public static final void g(String str, dd4 dd4Var, int i) {
        dd4 dd4Var2 = dd4Var;
        str.getClass();
        dd4Var2.h0(1645914240);
        int i2 = i | (dd4Var2.f(str) ? 4 : 2);
        if (dd4Var2.V(i2 & 1, (i2 & 3) != 2)) {
            lu6 lu6Var = lu6.a;
            ou6 ou6VarJ = tg9.j(tg9.f(lu6Var, 1.0f), 96.0f, 0.0f, 2);
            ha6 ha6VarD = pn0.d(bv4.f, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarJ);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ha6VarD);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            eq8 eq8VarA = dq8.a(new mv(12.0f, true, new gp(5)), bv4.x, dd4Var2, 54);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, lu6Var);
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
            h48.a(tg9.n(lu6Var, 20.0f), 0L, 2.0f, 0L, 0, 0.0f, dd4Var2, 390, 58);
            nha.c(str, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.k, dd4Var, i2 & 14, 0, 131070);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new z31(str, i, 16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(ou6 r26, st5 r27, pj7 r28, nv r29, vf0 r30, s04 r31, boolean r32, pj7 r33, long r34, long r36, float r38, defpackage.kb4 r39, dd4 r40, int r41, int r42, int r43) {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx1.h(ou6, st5, pj7, nv, vf0, s04, boolean, pj7, long, long, float, kb4, dd4, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final yh4 r25, final ou6 r26, wq5 r27, final pj7 r28, nv r29, kv r30, s04 r31, boolean r32, long r33, long r35, final pj7 r37, float r38, final defpackage.kb4 r39, dd4 r40, final int r41, final int r42, final int r43) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx1.i(yh4, ou6, wq5, pj7, nv, kv, s04, boolean, long, long, pj7, float, kb4, dd4, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final defpackage.iq9 r23, ou6 r24, uu5 r25, final pj7 r26, float r27, kv r28, s04 r29, boolean r30, long r31, long r33, pj7 r35, final defpackage.kb4 r36, dd4 r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx1.j(iq9, ou6, uu5, pj7, float, kv, s04, boolean, long, long, pj7, kb4, dd4, int, int, int):void");
    }

    public static final void k(t27 t27Var, dd4 dd4Var, int i) {
        dd4 dd4Var2;
        t27Var.getClass();
        dd4Var.h0(-1303847715);
        int i2 = (dd4Var.f(t27Var) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            m56 m56Var = (m56) ((qtb) qx1.N(ug8.a(m56.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(m56Var.d, dd4Var);
            m8 m8Var = (m8) dd4Var.j(a9.a);
            pp1 pp1Var = m56Var.e;
            boolean zF = dd4Var.f(m8Var) | ((i2 & 14) == 4);
            Object objQ = dd4Var.Q();
            jt1 jt1Var = null;
            if (zF || objQ == vl1.a) {
                objQ = new q51(m8Var, t27Var, jt1Var, 6);
                dd4Var.p0(objQ);
            }
            wx1.e(pp1Var, null, (zb4) objQ, dd4Var, 0);
            dd4Var2 = dd4Var;
            p(wn9.K((pv9) fv9.a.getValue(), dd4Var), null, false, jf0.G(927321945, new n74(t27Var, 9), dd4Var), null, jf0.G(-51556057, new ak0(7, m56Var, t27Var, a07VarB), dd4Var), dd4Var2, 199680, 22);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new n74(i, 10, t27Var);
        }
    }

    public static final void l(boolean z, int i, boolean z2, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i2) {
        boolean z3;
        int i3;
        kb4Var.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        dd4Var.h0(-899915257);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            z3 = z;
            i3 = (dd4Var.g(z3) ? 4 : 2) | i2;
        } else {
            z3 = z;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.g(z2) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(ib4Var2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (dd4Var.V(i3 & 1, (74899 & i3) != 74898)) {
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = new ss6(25);
                dd4Var.p0(objQ);
            }
            z8.a(z3, (kb4) objQ, jf0.G(862456094, new lo(3, ib4Var2), dd4Var), null, null, jf0.G(1570965563, new lo(i4, ib4Var), dd4Var), p7c.m, null, 0L, 0L, 0.0f, null, null, null, false, false, jf0.G(-1013147421, new jb0(i, kb4Var, z2), dd4Var), dd4Var, (i3 & 14) | 1769904, 1794048, 16280);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ki6(z, i, z2, kb4Var, ib4Var, ib4Var2, i2);
        }
    }

    public static final void m(boolean z, String str, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i) {
        Object gl0Var;
        g95 g95Var;
        String str2;
        kb4Var.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        dd4Var.h0(1144226645);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(str) ? 32 : 16) | (dd4Var.h(ib4Var) ? 2048 : 1024) | (dd4Var.h(ib4Var2) ? 16384 : 8192);
        int i3 = 0;
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            g95 g95Var2 = (g95) ((qtb) qx1.N(ug8.a(g95.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(g95Var2.d, dd4Var);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i4 = i2 & 14;
            boolean zF = ((i2 & Token.ASSIGN_MOD) == 32) | (i4 == 4) | dd4Var.f(g95Var2);
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (zF || objQ == fu6Var) {
                g95Var = g95Var2;
                gl0Var = new gl0(z, str, g95Var, (jt1) null, 3);
                str2 = str;
                dd4Var.p0(gl0Var);
            } else {
                str2 = str;
                gl0Var = objQ;
                g95Var = g95Var2;
            }
            lc5.v(boolValueOf, str2, (yb4) gl0Var, dd4Var);
            boolean z2 = ((f95) a07VarB.getValue()).b == j95.b;
            boolean z3 = ((f95) a07VarB.getValue()).b == j95.d;
            boolean zG = dd4Var.g(z3);
            Object objQ2 = dd4Var.Q();
            if (zG || objQ2 == fu6Var) {
                objQ2 = new fn6(0, kb4Var, z3);
                dd4Var.p0(objQ2);
            }
            z8.a(z, (kb4) objQ2, jf0.G(-402037602, new sp0(z2, z3, g95Var, ib4Var, kb4Var, ib4Var2, 3), dd4Var), null, null, jf0.G(1880536481, new an6(i3, kb4Var, z3), dd4Var), m79.p, null, 0L, 0L, 0.0f, null, null, null, false, false, jf0.G(695270905, new bn6(str, a07VarB, i3), dd4Var), dd4Var, i4 | 1769856, 1572864, 65432);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new cn6(z, str, kb4Var, ib4Var, ib4Var2, i, 0);
        }
    }

    public static final void n(sgb sgbVar, String str, boolean z, boolean z2, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i) {
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var.h0(998823769);
        int i2 = i | (dd4Var.h(sgbVar) ? 4 : 2) | (dd4Var.f(str) ? 32 : 16) | (dd4Var.g(z) ? 256 : Token.CASE) | (dd4Var.g(z2) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i2 & 1, (74899 & i2) != 74898)) {
            fw.q(z, kb4Var, null, false, null, null, 0L, 0L, 0.0f, 0L, null, jf0.G(-1717047115, new sl9(sgbVar, str, z2, kb4Var2), dd4Var), dd4Var, ((i2 >> 6) & 14) | 48, 48, 2044);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new sp0(sgbVar, str, z, z2, kb4Var, kb4Var2, i);
        }
    }

    public static final void o(dq5 dq5Var, kj8 kj8Var, Object obj, ou6 ou6Var, boolean z, ou6 ou6Var2, rj1 rj1Var, dd4 dd4Var, int i) {
        int i2;
        ou6 ou6VarA;
        ou6 ou6Var3;
        int i3;
        boolean z2;
        ou6 ou6VarW;
        ou6 ou6Var4;
        ou6 ou6Var5;
        dq5Var.getClass();
        kj8Var.getClass();
        obj.getClass();
        dd4Var.h0(-952947733);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(dq5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(kj8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(obj) ? 256 : Token.CASE;
        }
        int i4 = i2 | 27648;
        if ((196608 & i) == 0) {
            i4 = 93184 | i2;
        }
        if ((1572864 & i) == 0) {
            i4 |= dd4Var.h(rj1Var) ? 1048576 : 524288;
        }
        if ((599187 & i4) == 599186 && dd4Var.F()) {
            dd4Var.Y();
            ou6Var4 = ou6Var;
            z2 = z;
            ou6Var5 = ou6Var2;
        } else {
            dd4Var.a0();
            if ((i & 1) == 0 || dd4Var.C()) {
                ou6 ou6Var6 = lu6.a;
                ou6VarA = dq5.a(dq5Var, ou6Var6);
                ou6Var3 = ou6Var6;
                i3 = i4 & (-458753);
                z2 = true;
            } else {
                dd4Var.Y();
                i3 = i4 & (-458753);
                ou6Var3 = ou6Var;
                z2 = z;
                ou6VarA = ou6Var2;
            }
            dd4Var.r();
            fo2 fo2VarN = dk9.n(new hd(12, obj, kj8Var));
            boolean zBooleanValue = ((Boolean) fo2VarN.getValue()).booleanValue();
            Object obj2 = vl1.a;
            int i5 = 0;
            if (zBooleanValue) {
                dd4Var.f0(-16669332);
                p4c p4cVar = new p4c(1.0f);
                dd4Var.f0(-1663103542);
                boolean z3 = (i3 & Token.ASSIGN_MOD) == 32;
                Object objQ = dd4Var.Q();
                if (z3 || objQ == obj2) {
                    objQ = new ij8(kj8Var, i5);
                    dd4Var.p0(objQ);
                }
                dd4Var.q(false);
                ou6VarW = kl8.W(p4cVar, (kb4) objQ);
                dd4Var.q(false);
            } else if (obj.equals(kj8Var.s.getValue())) {
                dd4Var.f0(-16414264);
                p4c p4cVar2 = new p4c(1.0f);
                dd4Var.f0(-1663095314);
                boolean z4 = (i3 & Token.ASSIGN_MOD) == 32;
                Object objQ2 = dd4Var.Q();
                if (z4 || objQ2 == obj2) {
                    objQ2 = new ij8(kj8Var, 1);
                    dd4Var.p0(objQ2);
                }
                dd4Var.q(false);
                ou6VarW = kl8.W(p4cVar2, (kb4) objQ2);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-16142952);
                dd4Var.q(false);
                ou6VarW = ou6VarA;
            }
            fx1.n(kj8Var, obj, ou6Var3.e(ou6VarW), z2, ((Boolean) fo2VarN.getValue()).booleanValue(), rj1Var, dd4Var, (i3 >> 3) & 466046);
            ou6Var4 = ou6Var3;
            ou6Var5 = ou6VarA;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new hj8(dq5Var, kj8Var, obj, ou6Var4, z2, ou6Var5, rj1Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(java.lang.String r24, ou6 r25, boolean r26, defpackage.rj1 r27, defpackage.zb4 r28, defpackage.rj1 r29, dd4 r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx1.p(java.lang.String, ou6, boolean, rj1, zb4, rj1, dd4, int, int):void");
    }

    public static final void q(ou6 ou6Var, rj1 rj1Var, dd4 dd4Var, int i, int i2) {
        int i3;
        ou6 ou6Var2;
        dd4Var.h0(-522896278);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (dd4Var.f(ou6Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            ou6 ou6Var3 = i4 != 0 ? lu6.a : ou6Var;
            j1a.a(ou6Var3, (t89) null, lc1.i, 0L, 0.0f, 0.0f, (wm0) null, jf0.G(489587119, new il6(i5, (c73) dd4Var.j(b73.a), rj1Var), dd4Var), dd4Var, (i3 & 14) | 12583296, Token.FUNCTION);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new hx(ou6Var2, rj1Var, i, i2, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(java.lang.String r22, ou6 r23, defpackage.rj1 r24, defpackage.zb4 r25, defpackage.rj1 r26, dd4 r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx1.r(java.lang.String, ou6, rj1, zb4, rj1, dd4, int, int):void");
    }

    public static final void s(int i, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, t27 t27Var, pj7 pj7Var, szb szbVar) {
        t27Var.getClass();
        ib4Var.getClass();
        dd4Var.h0(1304420603);
        int i2 = 4;
        int i3 = i | (dd4Var.f(t27Var) ? 4 : 2) | (dd4Var.f(pj7Var) ? 256 : Token.CASE) | (dd4Var.f(szbVar) ? 2048 : 1024) | (dd4Var.h(ib4Var) ? 16384 : 8192);
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            fd9 fd9Var = (fd9) ((qtb) qx1.N(ug8.a(fd9.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            eub eubVarA = (eub) dd4Var.j(utb.b);
            if (eubVarA == null) {
                dd4Var.f0(1368428688);
                eubVarA = e36.a(dd4Var);
            } else {
                dd4Var.f0(1368426673);
            }
            dd4Var.q(false);
            if (eubVarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                return;
            }
            a07 a07VarB = bx1.B(((mib) ((qtb) qx1.N(ug8.a(mib.class), eubVarA.f(), null, eubVarA instanceof pj4 ? ((pj4) eubVarA).d() : v02.b, ek5.a(dd4Var), null))).f, dd4Var);
            a07 a07VarB2 = bx1.B(fd9Var.e, dd4Var);
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new aa9(15);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new aa9(16);
                dd4Var.p0(objQ2);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            gd9 gd9Var = (gd9) a07VarB2.getValue();
            boolean z = ((iib) a07VarB.getValue()).i;
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objQ3 = dd4Var.Q();
            if (z2 || objQ3 == obj) {
                objQ3 = new cl0(t27Var, 17);
                dd4Var.p0(objQ3);
            }
            kb4 kb4Var = (kb4) objQ3;
            boolean zF = dd4Var.f(a07Var2) | dd4Var.f(a07Var);
            Object objQ4 = dd4Var.Q();
            if (zF || objQ4 == obj) {
                objQ4 = new rl0(a07Var2, a07Var, 26);
                dd4Var.p0(objQ4);
            }
            sdc.V(gd9Var, z, pj7Var, szbVar, ou6Var, kb4Var, (kb4) objQ4, ib4Var, dd4Var, ((i3 << 9) & 29360128) | (i3 & 8064) | 24576);
            String str = (String) a07Var2.getValue();
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ5 = dd4Var.Q();
            if (zF2 || objQ5 == obj) {
                objQ5 = new hp8(a07Var, 22);
                dd4Var.p0(objQ5);
            }
            kb4 kb4Var2 = (kb4) objQ5;
            boolean zF3 = dd4Var.f(a07Var) | (i4 == 4);
            Object objQ6 = dd4Var.Q();
            if (zF3 || objQ6 == obj) {
                objQ6 = new v03(t27Var, a07Var, 7);
                dd4Var.p0(objQ6);
            }
            yb4 yb4Var = (yb4) objQ6;
            boolean zF4 = dd4Var.f(a07Var) | (i4 == 4);
            Object objQ7 = dd4Var.Q();
            if (zF4 || objQ7 == obj) {
                objQ7 = new sc9(t27Var, a07Var, 3);
                dd4Var.p0(objQ7);
            }
            kb4 kb4Var3 = (kb4) objQ7;
            boolean zF5 = dd4Var.f(a07Var) | (i4 == 4);
            Object objQ8 = dd4Var.Q();
            if (zF5 || objQ8 == obj) {
                objQ8 = new sc9(t27Var, a07Var, i2);
                dd4Var.p0(objQ8);
            }
            kb4 kb4Var4 = (kb4) objQ8;
            boolean zF6 = dd4Var.f(a07Var) | (i4 == 4);
            Object objQ9 = dd4Var.Q();
            if (zF6 || objQ9 == obj) {
                objQ9 = new sc9(t27Var, a07Var, 5);
                dd4Var.p0(objQ9);
            }
            kb4 kb4Var5 = (kb4) objQ9;
            boolean zF7 = dd4Var.f(a07Var) | (i4 == 4);
            Object objQ10 = dd4Var.Q();
            if (zF7 || objQ10 == obj) {
                objQ10 = new sc9(t27Var, a07Var, 2);
                dd4Var.p0(objQ10);
            }
            qu1.g(zBooleanValue, str, kb4Var2, yb4Var, kb4Var3, kb4Var4, kb4Var5, (kb4) objQ10, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new y03(t27Var, ou6Var, pj7Var, szbVar, ib4Var, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(defpackage.c24 r4, java.lang.Object r5, java.lang.Object r6, defpackage.kt1 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.x24
            if (r0 == 0) goto L13
            r0 = r7
            x24 r0 = (defpackage.x24) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            x24 r0 = new x24
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return
        L27:
            java.lang.Object r6 = r0.a
            defpackage.e11.e0(r7)
            goto L3d
        L2d:
            defpackage.e11.e0(r7)
            r0.a = r6
            r0.c = r2
            java.lang.Object r4 = r4.b(r5, r0)
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L3d
            return
        L3d:
            j r4 = new j
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx1.t(c24, java.lang.Object, java.lang.Object, kt1):void");
    }

    public static final boolean u(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (lc5.V(cCharAt, Token.CASE) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float v(it7 r7, boolean r8, fp4[] r9, float r10) {
        /*
            int r0 = r9.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r4 = r1
            r3 = r2
        L6:
            if (r3 >= r0) goto L21
            r5 = r9[r3]
            float r5 = r7.c(r5, r1)
            boolean r6 = java.lang.Float.isNaN(r4)
            if (r6 != 0) goto L1d
            int r6 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1a
            r6 = 1
            goto L1b
        L1a:
            r6 = r2
        L1b:
            if (r8 != r6) goto L1e
        L1d:
            r4 = r5
        L1e:
            int r3 = r3 + 1
            goto L6
        L21:
            boolean r7 = java.lang.Float.isNaN(r4)
            if (r7 == 0) goto L28
            return r10
        L28:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx1.v(it7, boolean, fp4[], float):float");
    }

    public static final void w(qm7 qm7Var, String str, int i, int i2, int i3) {
        if (i2 == -1) {
            int iZ = Z(i, i3, str);
            int iY = Y(iZ, i3, str);
            if (iY > iZ) {
                qm7Var.g(str.substring(iZ, iY), lc3.a);
                return;
            }
            return;
        }
        int iZ2 = Z(i, i2, str);
        int iY2 = Y(iZ2, i2, str);
        if (iY2 > iZ2) {
            String strSubstring = str.substring(iZ2, iY2);
            int iZ3 = Z(i2 + 1, i3, str);
            qm7Var.h(strSubstring, str.substring(iZ3, Y(iZ3, i3, str)));
        }
    }

    public static final yc4 x(yc4 yc4Var) {
        if (yc4Var == null) {
            yc4Var = null;
        }
        if (yc4Var != null) {
            return yc4Var;
        }
        zl1.b("Inconsistent composition");
        if2.c();
        return null;
    }

    public static void y(Object obj, String str) {
        if (obj != null) {
            return;
        }
        k27.n(str);
    }

    public static int z(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, gc.r(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public Object H(int i) {
        zb5 zb5VarG = J().g(i);
        return zb5VarG.c.getType().invoke(Integer.valueOf(i - zb5VarG.a));
    }

    public abstract og J();

    public Object K(int i) {
        Object objInvoke;
        zb5 zb5VarG = J().g(i);
        int i2 = i - zb5VarG.a;
        kb4 key = zb5VarG.c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new yh2(i) : objInvoke;
    }

    public int hashCode() {
        switch (this.a) {
            case 28:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 28:
                String strG = ug8.a(getClass()).g();
                strG.getClass();
                return strG;
            default:
                return super.toString();
        }
    }
}
