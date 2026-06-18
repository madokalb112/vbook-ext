package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.inputmethod.ExtractedText;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class qx1 {
    public static final long A(long j) {
        if (j < 0) {
            mc8 mc8Var = k63.b;
            return k63.d;
        }
        mc8 mc8Var2 = k63.b;
        return k63.c;
    }

    public static final ax2 B(yd5 yd5Var, boolean z, ee5 ee5Var) {
        if (yd5Var instanceof pe5) {
            return ((pe5) yd5Var).L(z, ee5Var);
        }
        return yd5Var.invokeOnCompletion(ee5Var.q(), z, new qd2(1, ee5Var, ee5.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 17));
    }

    public static final boolean C(jx1 jx1Var) {
        yd5 yd5Var = (yd5) jx1Var.get(s00.s);
        if (yd5Var != null) {
            return yd5Var.isActive();
        }
        return true;
    }

    public static boolean D(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31 || !(i == 26 || i == 27)) {
            return i2 >= 33 && i == 30;
        }
        return true;
    }

    public static final y34 E(pp1 pp1Var, jx1 jx1Var) {
        jx1Var.getClass();
        return new y34(pp1Var, jx1Var, 0);
    }

    public static final y34 F(pp1 pp1Var, jx1 jx1Var) {
        jx1Var.getClass();
        return new y34(pp1Var, jx1Var, 1);
    }

    public static final y34 G(pp1 pp1Var, jx1 jx1Var) {
        jx1Var.getClass();
        return new y34(pp1Var, jx1Var, 2);
    }

    public static final void H(t27 t27Var, String str) {
        t27Var.getClass();
        str.getClass();
        t27Var.a.d(new yz0(str));
    }

    public static final void I(t27 t27Var, String str) {
        t27Var.getClass();
        str.getClass();
        t27Var.a.d(new l83(str));
    }

    public static z08 J(String str, q43 q43Var, od5 od5Var, int i) {
        if ((i & 2) != 0) {
            q43Var = null;
        }
        kb4 ss6Var = od5Var;
        if ((i & 4) != 0) {
            ss6Var = new ss6(26);
        }
        aj2 aj2Var = rw2.a;
        nh2 nh2Var = nh2.c;
        o0a o0aVarA = zib.a();
        nh2Var.getClass();
        return new z08(str, q43Var, ss6Var, wx1.b(gx1.T(nh2Var, o0aVarA)));
    }

    public static final ss7 K(lw3 lw3Var, zv3 zv3Var, kb4 kb4Var, dd4 dd4Var) {
        kb4Var.getClass();
        wx1.l(dd4Var, 0);
        a07 a07VarA = dk9.A(lw3Var, dd4Var);
        a07 a07VarA2 = dk9.A(zv3Var, dd4Var);
        a07 a07VarA3 = dk9.A(kb4Var, dd4Var);
        Object[] objArr = new Object[0];
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (objQ == obj) {
            objQ = new tl3(11);
            dd4Var.p0(objQ);
        }
        a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
        Object[] objArr2 = new Object[0];
        Object objQ2 = dd4Var.Q();
        if (objQ2 == obj) {
            objQ2 = new tl3(12);
            dd4Var.p0(objQ2);
        }
        a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
        Object[] objArr3 = new Object[0];
        Object objQ3 = dd4Var.Q();
        if (objQ3 == obj) {
            objQ3 = new tl3(13);
            dd4Var.p0(objQ3);
        }
        a07 a07Var3 = (a07) ww1.b0(objArr3, (ib4) objQ3, dd4Var, 48);
        k5 k5Var = new k5(2);
        boolean zF = dd4Var.f(a07Var3) | dd4Var.f(a07Var) | dd4Var.f(a07Var2) | dd4Var.f(a07VarA3);
        Object objQ4 = dd4Var.Q();
        if (zF || objQ4 == obj) {
            rv3 rv3Var = new rv3(a07Var3, a07Var, a07Var2, a07VarA3, 0);
            dd4Var.p0(rv3Var);
            objQ4 = rv3Var;
        }
        y76 y76VarE0 = p7c.e0(k5Var, (kb4) objQ4, dd4Var);
        k5 k5Var2 = new k5(7);
        boolean zF2 = dd4Var.f(a07Var3) | dd4Var.f(a07Var) | dd4Var.f(a07Var2) | dd4Var.f(a07VarA3);
        Object objQ5 = dd4Var.Q();
        if (zF2 || objQ5 == obj) {
            rv3 rv3Var2 = new rv3(a07Var3, a07Var, a07Var2, a07VarA3, 1);
            dd4Var.p0(rv3Var2);
            objQ5 = rv3Var2;
        }
        y76 y76VarE02 = p7c.e0(k5Var2, (kb4) objQ5, dd4Var);
        k5 k5Var3 = new k5(0);
        boolean zF3 = dd4Var.f(a07Var3) | dd4Var.f(a07Var) | dd4Var.f(a07Var2) | dd4Var.f(a07VarA3);
        Object objQ6 = dd4Var.Q();
        if (zF3 || objQ6 == obj) {
            rv3 rv3Var3 = new rv3(a07Var3, a07Var, a07Var2, a07VarA3, 2);
            dd4Var.p0(rv3Var3);
            objQ6 = rv3Var3;
        }
        y76 y76VarE03 = p7c.e0(k5Var3, (kb4) objQ6, dd4Var);
        k5 k5Var4 = new k5(1);
        boolean zF4 = dd4Var.f(a07Var3) | dd4Var.f(a07Var) | dd4Var.f(a07Var2) | dd4Var.f(a07VarA3);
        Object objQ7 = dd4Var.Q();
        if (zF4 || objQ7 == obj) {
            rv3 rv3Var4 = new rv3(a07Var3, a07Var, a07Var2, a07VarA3, 3);
            dd4Var.p0(rv3Var4);
            objQ7 = rv3Var4;
        }
        y76 y76VarE04 = p7c.e0(k5Var4, (kb4) objQ7, dd4Var);
        boolean zF5 = dd4Var.f(y76VarE0) | dd4Var.f(y76VarE02) | dd4Var.f(y76VarE03) | dd4Var.f(y76VarE04);
        Object objQ8 = dd4Var.Q();
        if (zF5 || objQ8 == obj) {
            ss7 ss7Var = new ss7(new sv3(a07VarA2, a07Var, a07Var2, a07VarA, a07Var3, y76VarE0, y76VarE03, a07VarA3, y76VarE02, y76VarE04));
            dd4Var.p0(ss7Var);
            objQ8 = ss7Var;
        }
        return (ss7) objQ8;
    }

    public static final sw8 L(int i, dd4 dd4Var, st5 st5Var) {
        Object my1Var;
        st5Var.getClass();
        dd4Var.f0(927400620);
        boolean zD = dd4Var.d(i);
        Object objQ = dd4Var.Q();
        fu6 fu6Var = vl1.a;
        int i2 = 0;
        Object obj = objQ;
        if (zD || objQ == fu6Var) {
            int i3 = 3;
            int i4 = 1;
            if (i != 1) {
                int i5 = 2;
                if (i == 2) {
                    my1Var = new my1(st5Var, i2);
                } else if (i != 3) {
                    my1Var = i != 4 ? i != 5 ? new pmb(st5Var) : new my1(st5Var, i4) : new my1(st5Var, i5);
                } else {
                    df9 df9Var = new df9(st5Var);
                    df9Var.y = 1;
                    df9Var.z = 1;
                    my1Var = df9Var;
                }
            } else {
                my1Var = new my1(st5Var, i3);
            }
            Object obj2 = my1Var;
            dd4Var.p0(obj2);
            obj = obj2;
        }
        sw8 sw8Var = (sw8) obj;
        Object objQ2 = dd4Var.Q();
        if (objQ2 == fu6Var) {
            objQ2 = lc5.Z(dd4Var);
            dd4Var.p0(objQ2);
        }
        sw8Var.b = (vx1) objQ2;
        sw8Var.a.setValue(st5Var);
        dd4Var.q(false);
        return sw8Var;
    }

    public static final void M(vu6 vu6Var) {
        vu6Var.getClass();
        int i = 18;
        xc8 xc8Var = new xc8(i);
        ov9 ov9Var = s16.t;
        a91 a91VarA = ug8.a(cq3.class);
        ck5 ck5Var = ck5.a;
        kf9 kf9VarK = ky0.k(new if0(ov9Var, a91VarA, xc8Var, ck5Var), vu6Var);
        a91 a91VarA2 = ug8.a(qp3.class);
        if0 if0Var = kf9VarK.a;
        if0Var.e = fc1.J0(if0Var.e, a91VarA2);
        pa8 pa8Var = if0Var.a;
        StringBuilder sb = new StringBuilder();
        ky0.y(a91VarA2, sb, ':', "", ':');
        sb.append(pa8Var);
        String string = sb.toString();
        LinkedHashMap linkedHashMap = vu6Var.c;
        linkedHashMap.put(string, kf9VarK);
        kf9 kf9VarK2 = ky0.k(new if0(ov9Var, ug8.a(jr3.class), new xc8(29), ck5Var), vu6Var);
        a91 a91VarA3 = ug8.a(gr3.class);
        if0 if0Var2 = kf9VarK2.a;
        if0Var2.e = fc1.J0(if0Var2.e, a91VarA3);
        pa8 pa8Var2 = if0Var2.a;
        StringBuilder sb2 = new StringBuilder();
        ky0.y(a91VarA3, sb2, ':', "", ':');
        sb2.append(pa8Var2);
        linkedHashMap.put(sb2.toString(), kf9VarK2);
        int i2 = 10;
        kf9 kf9VarK3 = ky0.k(new if0(ov9Var, ug8.a(y64.class), new jk8(i2), ck5Var), vu6Var);
        a91 a91VarA4 = ug8.a(u64.class);
        if0 if0Var3 = kf9VarK3.a;
        if0Var3.e = fc1.J0(if0Var3.e, a91VarA4);
        pa8 pa8Var3 = if0Var3.a;
        StringBuilder sb3 = new StringBuilder();
        ky0.y(a91VarA4, sb3, ':', "", ':');
        sb3.append(pa8Var3);
        linkedHashMap.put(sb3.toString(), kf9VarK3);
        int i3 = 17;
        kf9 kf9VarK4 = ky0.k(new if0(ov9Var, ug8.a(uw5.class), new jk8(i3), ck5Var), vu6Var);
        a91 a91VarA5 = ug8.a(aw5.class);
        if0 if0Var4 = kf9VarK4.a;
        if0Var4.e = fc1.J0(if0Var4.e, a91VarA5);
        pa8 pa8Var4 = if0Var4.a;
        StringBuilder sb4 = new StringBuilder();
        ky0.y(a91VarA5, sb4, ':', "", ':');
        sb4.append(pa8Var4);
        linkedHashMap.put(sb4.toString(), kf9VarK4);
        kf9 kf9VarK5 = ky0.k(new if0(ov9Var, ug8.a(uu2.class), new jk8(i), ck5Var), vu6Var);
        a91 a91VarA6 = ug8.a(ou2.class);
        if0 if0Var5 = kf9VarK5.a;
        if0Var5.e = fc1.J0(if0Var5.e, a91VarA6);
        pa8 pa8Var5 = if0Var5.a;
        StringBuilder sb5 = new StringBuilder();
        ky0.y(a91VarA6, sb5, ':', "", ':');
        sb5.append(pa8Var5);
        linkedHashMap.put(sb5.toString(), kf9VarK5);
        int i4 = 19;
        kf9 kf9VarK6 = ky0.k(new if0(ov9Var, ug8.a(kp2.class), new jk8(i4), ck5Var), vu6Var);
        a91 a91VarA7 = ug8.a(dp2.class);
        if0 if0Var6 = kf9VarK6.a;
        if0Var6.e = fc1.J0(if0Var6.e, a91VarA7);
        pa8 pa8Var6 = if0Var6.a;
        StringBuilder sb6 = new StringBuilder();
        ky0.y(a91VarA7, sb6, ':', "", ':');
        sb6.append(pa8Var6);
        linkedHashMap.put(sb6.toString(), kf9VarK6);
        int i5 = 20;
        kf9 kf9VarK7 = ky0.k(new if0(ov9Var, ug8.a(j4b.class), new jk8(i5), ck5Var), vu6Var);
        a91 a91VarA8 = ug8.a(f4b.class);
        if0 if0Var7 = kf9VarK7.a;
        if0Var7.e = fc1.J0(if0Var7.e, a91VarA8);
        pa8 pa8Var7 = if0Var7.a;
        StringBuilder sb7 = new StringBuilder();
        ky0.y(a91VarA8, sb7, ':', "", ':');
        sb7.append(pa8Var7);
        linkedHashMap.put(sb7.toString(), kf9VarK7);
        int i6 = 21;
        kf9 kf9VarK8 = ky0.k(new if0(ov9Var, ug8.a(my8.class), new jk8(i6), ck5Var), vu6Var);
        a91 a91VarA9 = ug8.a(ly8.class);
        if0 if0Var8 = kf9VarK8.a;
        if0Var8.e = fc1.J0(if0Var8.e, a91VarA9);
        pa8 pa8Var8 = if0Var8.a;
        StringBuilder sb8 = new StringBuilder();
        ky0.y(a91VarA9, sb8, ':', "", ':');
        sb8.append(pa8Var8);
        linkedHashMap.put(sb8.toString(), kf9VarK8);
        int i7 = 22;
        kf9 kf9VarK9 = ky0.k(new if0(ov9Var, ug8.a(i79.class), new jk8(i7), ck5Var), vu6Var);
        a91 a91VarA10 = ug8.a(g79.class);
        if0 if0Var9 = kf9VarK9.a;
        if0Var9.e = fc1.J0(if0Var9.e, a91VarA10);
        pa8 pa8Var9 = if0Var9.a;
        StringBuilder sb9 = new StringBuilder();
        ky0.y(a91VarA10, sb9, ':', "", ':');
        sb9.append(pa8Var9);
        linkedHashMap.put(sb9.toString(), kf9VarK9);
        kf9 kf9VarK10 = ky0.k(new if0(ov9Var, ug8.a(sra.class), new xc8(8), ck5Var), vu6Var);
        a91 a91VarA11 = ug8.a(nra.class);
        if0 if0Var10 = kf9VarK10.a;
        if0Var10.e = fc1.J0(if0Var10.e, a91VarA11);
        pa8 pa8Var10 = if0Var10.a;
        StringBuilder sb10 = new StringBuilder();
        ky0.y(a91VarA11, sb10, ':', "", ':');
        sb10.append(pa8Var10);
        linkedHashMap.put(sb10.toString(), kf9VarK10);
        kf9 kf9VarK11 = ky0.k(new if0(ov9Var, ug8.a(xw5.class), new xc8(9), ck5Var), vu6Var);
        a91 a91VarA12 = ug8.a(ww5.class);
        if0 if0Var11 = kf9VarK11.a;
        if0Var11.e = fc1.J0(if0Var11.e, a91VarA12);
        pa8 pa8Var11 = if0Var11.a;
        StringBuilder sb11 = new StringBuilder();
        ky0.y(a91VarA12, sb11, ':', "", ':');
        sb11.append(pa8Var11);
        linkedHashMap.put(sb11.toString(), kf9VarK11);
        kf9 kf9VarK12 = ky0.k(new if0(ov9Var, ug8.a(yy4.class), new xc8(i2), ck5Var), vu6Var);
        a91 a91VarA13 = ug8.a(xy4.class);
        if0 if0Var12 = kf9VarK12.a;
        if0Var12.e = fc1.J0(if0Var12.e, a91VarA13);
        pa8 pa8Var12 = if0Var12.a;
        StringBuilder sb12 = new StringBuilder();
        ky0.y(a91VarA13, sb12, ':', "", ':');
        sb12.append(pa8Var12);
        linkedHashMap.put(sb12.toString(), kf9VarK12);
        int i8 = 11;
        kf9 kf9VarK13 = ky0.k(new if0(ov9Var, ug8.a(xba.class), new xc8(i8), ck5Var), vu6Var);
        a91 a91VarA14 = ug8.a(qba.class);
        if0 if0Var13 = kf9VarK13.a;
        if0Var13.e = fc1.J0(if0Var13.e, a91VarA14);
        pa8 pa8Var13 = if0Var13.a;
        StringBuilder sb13 = new StringBuilder();
        ky0.y(a91VarA14, sb13, ':', "", ':');
        sb13.append(pa8Var13);
        linkedHashMap.put(sb13.toString(), kf9VarK13);
        kf9 kf9VarK14 = ky0.k(new if0(ov9Var, ug8.a(nnb.class), new xc8(12), ck5Var), vu6Var);
        a91 a91VarA15 = ug8.a(mnb.class);
        if0 if0Var14 = kf9VarK14.a;
        if0Var14.e = fc1.J0(if0Var14.e, a91VarA15);
        pa8 pa8Var14 = if0Var14.a;
        StringBuilder sb14 = new StringBuilder();
        ky0.y(a91VarA15, sb14, ':', "", ':');
        sb14.append(pa8Var14);
        linkedHashMap.put(sb14.toString(), kf9VarK14);
        kf9 kf9VarK15 = ky0.k(new if0(ov9Var, ug8.a(zna.class), new xc8(13), ck5Var), vu6Var);
        a91 a91VarA16 = ug8.a(tna.class);
        if0 if0Var15 = kf9VarK15.a;
        if0Var15.e = fc1.J0(if0Var15.e, a91VarA16);
        pa8 pa8Var15 = if0Var15.a;
        StringBuilder sb15 = new StringBuilder();
        ky0.y(a91VarA16, sb15, ':', "", ':');
        sb15.append(pa8Var15);
        linkedHashMap.put(sb15.toString(), kf9VarK15);
        kf9 kf9VarK16 = ky0.k(new if0(ov9Var, ug8.a(p13.class), new xc8(14), ck5Var), vu6Var);
        a91 a91VarA17 = ug8.a(i13.class);
        if0 if0Var16 = kf9VarK16.a;
        if0Var16.e = fc1.J0(if0Var16.e, a91VarA17);
        pa8 pa8Var16 = if0Var16.a;
        StringBuilder sb16 = new StringBuilder();
        ky0.y(a91VarA17, sb16, ':', "", ':');
        sb16.append(pa8Var16);
        linkedHashMap.put(sb16.toString(), kf9VarK16);
        kf9 kf9VarK17 = ky0.k(new if0(ov9Var, ug8.a(jo1.class), new xc8(15), ck5Var), vu6Var);
        a91 a91VarA18 = ug8.a(ho1.class);
        if0 if0Var17 = kf9VarK17.a;
        if0Var17.e = fc1.J0(if0Var17.e, a91VarA18);
        pa8 pa8Var17 = if0Var17.a;
        StringBuilder sb17 = new StringBuilder();
        ky0.y(a91VarA18, sb17, ':', "", ':');
        sb17.append(pa8Var17);
        linkedHashMap.put(sb17.toString(), kf9VarK17);
        kf9 kf9VarK18 = ky0.k(new if0(ov9Var, ug8.a(s87.class), new xc8(16), ck5Var), vu6Var);
        a91 a91VarA19 = ug8.a(r87.class);
        if0 if0Var18 = kf9VarK18.a;
        if0Var18.e = fc1.J0(if0Var18.e, a91VarA19);
        pa8 pa8Var18 = if0Var18.a;
        StringBuilder sb18 = new StringBuilder();
        ky0.y(a91VarA19, sb18, ':', "", ':');
        sb18.append(pa8Var18);
        linkedHashMap.put(sb18.toString(), kf9VarK18);
        kf9 kf9VarK19 = ky0.k(new if0(ov9Var, ug8.a(jo3.class), new xc8(i3), ck5Var), vu6Var);
        a91 a91VarA20 = ug8.a(io3.class);
        if0 if0Var19 = kf9VarK19.a;
        if0Var19.e = fc1.J0(if0Var19.e, a91VarA20);
        pa8 pa8Var19 = if0Var19.a;
        StringBuilder sb19 = new StringBuilder();
        ky0.y(a91VarA20, sb19, ':', "", ':');
        sb19.append(pa8Var19);
        linkedHashMap.put(sb19.toString(), kf9VarK19);
        kf9 kf9VarK20 = ky0.k(new if0(ov9Var, ug8.a(sd8.class), new xc8(i4), ck5Var), vu6Var);
        a91 a91VarA21 = ug8.a(rd8.class);
        if0 if0Var20 = kf9VarK20.a;
        if0Var20.e = fc1.J0(if0Var20.e, a91VarA21);
        pa8 pa8Var20 = if0Var20.a;
        StringBuilder sb20 = new StringBuilder();
        ky0.y(a91VarA21, sb20, ':', "", ':');
        sb20.append(pa8Var20);
        linkedHashMap.put(sb20.toString(), kf9VarK20);
        kf9 kf9VarK21 = ky0.k(new if0(ov9Var, ug8.a(hm0.class), new xc8(i5), ck5Var), vu6Var);
        a91 a91VarA22 = ug8.a(cm0.class);
        if0 if0Var21 = kf9VarK21.a;
        if0Var21.e = fc1.J0(if0Var21.e, a91VarA22);
        pa8 pa8Var21 = if0Var21.a;
        StringBuilder sb21 = new StringBuilder();
        ky0.y(a91VarA22, sb21, ':', "", ':');
        sb21.append(pa8Var21);
        linkedHashMap.put(sb21.toString(), kf9VarK21);
        kf9 kf9VarK22 = ky0.k(new if0(ov9Var, ug8.a(d1c.class), new xc8(i6), ck5Var), vu6Var);
        a91 a91VarA23 = ug8.a(t0c.class);
        if0 if0Var22 = kf9VarK22.a;
        if0Var22.e = fc1.J0(if0Var22.e, a91VarA23);
        pa8 pa8Var22 = if0Var22.a;
        StringBuilder sb22 = new StringBuilder();
        ky0.y(a91VarA23, sb22, ':', "", ':');
        sb22.append(pa8Var22);
        linkedHashMap.put(sb22.toString(), kf9VarK22);
        kf9 kf9VarK23 = ky0.k(new if0(ov9Var, ug8.a(wja.class), new xc8(i7), ck5Var), vu6Var);
        a91 a91VarA24 = ug8.a(sja.class);
        if0 if0Var23 = kf9VarK23.a;
        if0Var23.e = fc1.J0(if0Var23.e, a91VarA24);
        pa8 pa8Var23 = if0Var23.a;
        StringBuilder sb23 = new StringBuilder();
        ky0.y(a91VarA24, sb23, ':', "", ':');
        sb23.append(pa8Var23);
        linkedHashMap.put(sb23.toString(), kf9VarK23);
        kf9 kf9VarK24 = ky0.k(new if0(ov9Var, ug8.a(v15.class), new xc8(23), ck5Var), vu6Var);
        a91 a91VarA25 = ug8.a(q15.class);
        if0 if0Var24 = kf9VarK24.a;
        if0Var24.e = fc1.J0(if0Var24.e, a91VarA25);
        pa8 pa8Var24 = if0Var24.a;
        StringBuilder sb24 = new StringBuilder();
        ky0.y(a91VarA25, sb24, ':', "", ':');
        sb24.append(pa8Var24);
        linkedHashMap.put(sb24.toString(), kf9VarK24);
        kf9 kf9VarK25 = ky0.k(new if0(ov9Var, ug8.a(tqb.class), new xc8(24), ck5Var), vu6Var);
        a91 a91VarA26 = ug8.a(pqb.class);
        if0 if0Var25 = kf9VarK25.a;
        if0Var25.e = fc1.J0(if0Var25.e, a91VarA26);
        pa8 pa8Var25 = if0Var25.a;
        StringBuilder sb25 = new StringBuilder();
        ky0.y(a91VarA26, sb25, ':', "", ':');
        sb25.append(pa8Var25);
        linkedHashMap.put(sb25.toString(), kf9VarK25);
        kf9 kf9VarK26 = ky0.k(new if0(ov9Var, ug8.a(l55.class), new xc8(25), ck5Var), vu6Var);
        a91 a91VarA27 = ug8.a(j55.class);
        if0 if0Var26 = kf9VarK26.a;
        if0Var26.e = fc1.J0(if0Var26.e, a91VarA27);
        pa8 pa8Var26 = if0Var26.a;
        StringBuilder sb26 = new StringBuilder();
        ky0.y(a91VarA27, sb26, ':', "", ':');
        sb26.append(pa8Var26);
        linkedHashMap.put(sb26.toString(), kf9VarK26);
        kf9 kf9VarK27 = ky0.k(new if0(ov9Var, ug8.a(nl3.class), new xc8(26), ck5Var), vu6Var);
        a91 a91VarA28 = ug8.a(ll3.class);
        if0 if0Var27 = kf9VarK27.a;
        if0Var27.e = fc1.J0(if0Var27.e, a91VarA28);
        pa8 pa8Var27 = if0Var27.a;
        StringBuilder sb27 = new StringBuilder();
        ky0.y(a91VarA28, sb27, ':', "", ':');
        sb27.append(pa8Var27);
        linkedHashMap.put(sb27.toString(), kf9VarK27);
        kf9 kf9VarK28 = ky0.k(new if0(ov9Var, ug8.a(lab.class), new xc8(27), ck5Var), vu6Var);
        a91 a91VarA29 = ug8.a(hab.class);
        if0 if0Var28 = kf9VarK28.a;
        if0Var28.e = fc1.J0(if0Var28.e, a91VarA29);
        pa8 pa8Var28 = if0Var28.a;
        StringBuilder sb28 = new StringBuilder();
        ky0.y(a91VarA29, sb28, ':', "", ':');
        sb28.append(pa8Var28);
        linkedHashMap.put(sb28.toString(), kf9VarK28);
        kf9 kf9VarK29 = ky0.k(new if0(ov9Var, ug8.a(eia.class), new xc8(28), ck5Var), vu6Var);
        a91 a91VarA30 = ug8.a(cia.class);
        if0 if0Var29 = kf9VarK29.a;
        if0Var29.e = fc1.J0(if0Var29.e, a91VarA30);
        pa8 pa8Var29 = if0Var29.a;
        StringBuilder sb29 = new StringBuilder();
        ky0.y(a91VarA30, sb29, ':', "", ':');
        sb29.append(pa8Var29);
        linkedHashMap.put(sb29.toString(), kf9VarK29);
        kf9 kf9VarK30 = ky0.k(new if0(ov9Var, ug8.a(pz2.class), new jk8(0), ck5Var), vu6Var);
        a91 a91VarA31 = ug8.a(jz2.class);
        if0 if0Var30 = kf9VarK30.a;
        if0Var30.e = fc1.J0(if0Var30.e, a91VarA31);
        pa8 pa8Var30 = if0Var30.a;
        StringBuilder sb30 = new StringBuilder();
        ky0.y(a91VarA31, sb30, ':', "", ':');
        sb30.append(pa8Var30);
        linkedHashMap.put(sb30.toString(), kf9VarK30);
        kf9 kf9VarK31 = ky0.k(new if0(ov9Var, ug8.a(o87.class), new jk8(1), ck5Var), vu6Var);
        a91 a91VarA32 = ug8.a(m87.class);
        if0 if0Var31 = kf9VarK31.a;
        if0Var31.e = fc1.J0(if0Var31.e, a91VarA32);
        pa8 pa8Var31 = if0Var31.a;
        StringBuilder sb31 = new StringBuilder();
        ky0.y(a91VarA32, sb31, ':', "", ':');
        sb31.append(pa8Var31);
        linkedHashMap.put(sb31.toString(), kf9VarK31);
        kf9 kf9VarK32 = ky0.k(new if0(ov9Var, ug8.a(hib.class), new jk8(2), ck5Var), vu6Var);
        a91 a91VarA33 = ug8.a(aib.class);
        if0 if0Var32 = kf9VarK32.a;
        if0Var32.e = fc1.J0(if0Var32.e, a91VarA33);
        pa8 pa8Var32 = if0Var32.a;
        StringBuilder sb32 = new StringBuilder();
        ky0.y(a91VarA33, sb32, ':', "", ':');
        sb32.append(pa8Var32);
        linkedHashMap.put(sb32.toString(), kf9VarK32);
        kf9 kf9VarK33 = ky0.k(new if0(ov9Var, ug8.a(pl0.class), new jk8(3), ck5Var), vu6Var);
        a91 a91VarA34 = ug8.a(ml0.class);
        if0 if0Var33 = kf9VarK33.a;
        if0Var33.e = fc1.J0(if0Var33.e, a91VarA34);
        pa8 pa8Var33 = if0Var33.a;
        StringBuilder sb33 = new StringBuilder();
        ky0.y(a91VarA34, sb33, ':', "", ':');
        sb33.append(pa8Var33);
        linkedHashMap.put(sb33.toString(), kf9VarK33);
        kf9 kf9VarK34 = ky0.k(new if0(ov9Var, ug8.a(aw2.class), new jk8(4), ck5Var), vu6Var);
        a91 a91VarA35 = ug8.a(xv2.class);
        if0 if0Var34 = kf9VarK34.a;
        if0Var34.e = fc1.J0(if0Var34.e, a91VarA35);
        pa8 pa8Var34 = if0Var34.a;
        StringBuilder sb34 = new StringBuilder();
        ky0.y(a91VarA35, sb34, ':', "", ':');
        sb34.append(pa8Var34);
        linkedHashMap.put(sb34.toString(), kf9VarK34);
        kf9 kf9VarK35 = ky0.k(new if0(ov9Var, ug8.a(vg1.class), new jk8(5), ck5Var), vu6Var);
        a91 a91VarA36 = ug8.a(pg1.class);
        if0 if0Var35 = kf9VarK35.a;
        if0Var35.e = fc1.J0(if0Var35.e, a91VarA36);
        pa8 pa8Var35 = if0Var35.a;
        StringBuilder sb35 = new StringBuilder();
        ky0.y(a91VarA36, sb35, ':', "", ':');
        sb35.append(pa8Var35);
        linkedHashMap.put(sb35.toString(), kf9VarK35);
        kf9 kf9VarK36 = ky0.k(new if0(ov9Var, ug8.a(fk8.class), new jk8(6), ck5Var), vu6Var);
        a91 a91VarA37 = ug8.a(dk8.class);
        if0 if0Var36 = kf9VarK36.a;
        if0Var36.e = fc1.J0(if0Var36.e, a91VarA37);
        pa8 pa8Var36 = if0Var36.a;
        StringBuilder sb36 = new StringBuilder();
        ky0.y(a91VarA37, sb36, ':', "", ':');
        sb36.append(pa8Var36);
        linkedHashMap.put(sb36.toString(), kf9VarK36);
        kf9 kf9VarK37 = ky0.k(new if0(ov9Var, ug8.a(p61.class), new jk8(7), ck5Var), vu6Var);
        a91 a91VarA38 = ug8.a(z51.class);
        if0 if0Var37 = kf9VarK37.a;
        if0Var37.e = fc1.J0(if0Var37.e, a91VarA38);
        pa8 pa8Var37 = if0Var37.a;
        StringBuilder sb37 = new StringBuilder();
        ky0.y(a91VarA38, sb37, ':', "", ':');
        sb37.append(pa8Var37);
        linkedHashMap.put(sb37.toString(), kf9VarK37);
        kf9 kf9VarK38 = ky0.k(new if0(ov9Var, ug8.a(s7.class), new jk8(8), ck5Var), vu6Var);
        a91 a91VarA39 = ug8.a(q7.class);
        if0 if0Var38 = kf9VarK38.a;
        if0Var38.e = fc1.J0(if0Var38.e, a91VarA39);
        pa8 pa8Var38 = if0Var38.a;
        StringBuilder sb38 = new StringBuilder();
        ky0.y(a91VarA39, sb38, ':', "", ':');
        sb38.append(pa8Var38);
        linkedHashMap.put(sb38.toString(), kf9VarK38);
        kf9 kf9VarK39 = ky0.k(new if0(ov9Var, ug8.a(lb3.class), new jk8(9), ck5Var), vu6Var);
        a91 a91VarA40 = ug8.a(eb3.class);
        if0 if0Var39 = kf9VarK39.a;
        if0Var39.e = fc1.J0(if0Var39.e, a91VarA40);
        pa8 pa8Var39 = if0Var39.a;
        StringBuilder sb39 = new StringBuilder();
        ky0.y(a91VarA40, sb39, ':', "", ':');
        sb39.append(pa8Var39);
        linkedHashMap.put(sb39.toString(), kf9VarK39);
        kf9 kf9VarK40 = ky0.k(new if0(ov9Var, ug8.a(ip0.class), new jk8(i8), ck5Var), vu6Var);
        a91 a91VarA41 = ug8.a(fp0.class);
        if0 if0Var40 = kf9VarK40.a;
        if0Var40.e = fc1.J0(if0Var40.e, a91VarA41);
        pa8 pa8Var40 = if0Var40.a;
        StringBuilder sb40 = new StringBuilder();
        ky0.y(a91VarA41, sb40, ':', "", ':');
        sb40.append(pa8Var40);
        linkedHashMap.put(sb40.toString(), kf9VarK40);
        kf9 kf9VarK41 = ky0.k(new if0(ov9Var, ug8.a(gt.class), new jk8(12), ck5Var), vu6Var);
        a91 a91VarA42 = ug8.a(et.class);
        if0 if0Var41 = kf9VarK41.a;
        if0Var41.e = fc1.J0(if0Var41.e, a91VarA42);
        pa8 pa8Var41 = if0Var41.a;
        StringBuilder sb41 = new StringBuilder();
        ky0.y(a91VarA42, sb41, ':', "", ':');
        sb41.append(pa8Var41);
        linkedHashMap.put(sb41.toString(), kf9VarK41);
        kf9 kf9VarK42 = ky0.k(new if0(ov9Var, ug8.a(f6.class), new jk8(13), ck5Var), vu6Var);
        a91 a91VarA43 = ug8.a(b6.class);
        if0 if0Var42 = kf9VarK42.a;
        if0Var42.e = fc1.J0(if0Var42.e, a91VarA43);
        pa8 pa8Var42 = if0Var42.a;
        StringBuilder sb42 = new StringBuilder();
        ky0.y(a91VarA43, sb42, ':', "", ':');
        sb42.append(pa8Var42);
        linkedHashMap.put(sb42.toString(), kf9VarK42);
        kf9 kf9VarK43 = ky0.k(new if0(ov9Var, ug8.a(ah6.class), new jk8(14), ck5Var), vu6Var);
        a91 a91VarA44 = ug8.a(xg6.class);
        if0 if0Var43 = kf9VarK43.a;
        if0Var43.e = fc1.J0(if0Var43.e, a91VarA44);
        pa8 pa8Var43 = if0Var43.a;
        StringBuilder sb43 = new StringBuilder();
        ky0.y(a91VarA44, sb43, ':', "", ':');
        sb43.append(pa8Var43);
        linkedHashMap.put(sb43.toString(), kf9VarK43);
        kf9 kf9VarK44 = ky0.k(new if0(ov9Var, ug8.a(f5a.class), new jk8(15), ck5Var), vu6Var);
        a91 a91VarA45 = ug8.a(z4a.class);
        if0 if0Var44 = kf9VarK44.a;
        if0Var44.e = fc1.J0(if0Var44.e, a91VarA45);
        pa8 pa8Var44 = if0Var44.a;
        StringBuilder sb44 = new StringBuilder();
        ky0.y(a91VarA45, sb44, ':', "", ':');
        sb44.append(pa8Var44);
        linkedHashMap.put(sb44.toString(), kf9VarK44);
        kf9 kf9VarK45 = ky0.k(new if0(ov9Var, ug8.a(wfb.class), new jk8(16), ck5Var), vu6Var);
        a91 a91VarA46 = ug8.a(vfb.class);
        if0 if0Var45 = kf9VarK45.a;
        if0Var45.e = fc1.J0(if0Var45.e, a91VarA46);
        pa8 pa8Var45 = if0Var45.a;
        StringBuilder sb45 = new StringBuilder();
        ky0.y(a91VarA46, sb45, ':', "", ':');
        sb45.append(pa8Var45);
        linkedHashMap.put(sb45.toString(), kf9VarK45);
    }

    public static final rtb N(a91 a91Var, cub cubVar, String str, w02 w02Var, ev8 ev8Var, ib4 ib4Var) {
        cubVar.getClass();
        w02Var.getClass();
        aub aubVar = new aub(cubVar, new ik5(a91Var, ev8Var, ib4Var), w02Var);
        a91Var.f();
        if (str == null) {
            str = null;
        }
        if (str != null) {
            return aubVar.a(a91Var, str);
        }
        String strF = a91Var.f();
        if (strF != null) {
            return aubVar.a(a91Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strF));
        }
        gp.l("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final long O(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        o63 o63Var = o63.NANOSECONDS;
        if (j4 >= 0) {
            return lx1.A0(j3, o63Var);
        }
        o63 o63Var2 = o63.MILLISECONDS;
        if (o63Var.compareTo(o63Var2) >= 0) {
            return k63.k(A(j3));
        }
        long j5 = (j / 1000000) - (j2 / 1000000);
        long j6 = (j % 1000000) - (j2 % 1000000);
        mc8 mc8Var = k63.b;
        return k63.h(lx1.A0(j5, o63Var2), lx1.A0(j6, o63Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.oi5 P(q32 r5, defpackage.pi5 r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx1.P(q32, pi5, boolean):oi5");
    }

    public static final ExtractedText Q(wga wgaVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wgaVar.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = wgaVar.b;
        extractedText.selectionStart = pja.g(j);
        extractedText.selectionEnd = pja.f(j);
        extractedText.flags = !bw9.P(wgaVar.a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final pp1 R(ra8 ra8Var) {
        return new pp1(new vg(ra8Var, null), 6);
    }

    public static final long S(int i, int i2) {
        long j = (((long) i) * 12) + ((long) i2);
        long j2 = j / 12;
        if (-2147483648L <= j2 && j2 <= 2147483647L) {
            return j;
        }
        gp.k(xv5.j(i, i2, "The total number of years in ", " years and ", " months overflows an Int"));
        return 0L;
    }

    public static final void a(int i, kb4 kb4Var, dd4 dd4Var, ou6 ou6Var, String str, boolean z) {
        int i2;
        boolean z2;
        kb4 kb4Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1802770092);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= dd4Var2.g(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            kb4Var2 = kb4Var;
            i2 |= dd4Var2.h(kb4Var2) ? 256 : Token.CASE;
        } else {
            kb4Var2 = kb4Var;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 2048 : 1024;
        }
        if (dd4Var2.V(i2 & 1, (i2 & 1171) != 1170)) {
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
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
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            vo1.e(z2, kb4Var2, null, false, null, dd4Var2, (i2 >> 3) & Token.ELSE);
            ur9 ur9Var = s96.a;
            nha.c(str, new bp5(1.0f, true), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, i2 & 14, 0, 131064);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new kl6(str, z, kb4Var, ou6Var, i);
        }
    }

    public static ng b(int i, int i2, int i3, int i4) {
        Bitmap bitmapCreateBitmap;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        kn8 kn8Var = hd1.e;
        Bitmap.Config configW = q95.w(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = h10.g(i, i2, i3, kn8Var);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, configW);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new ng(bitmapCreateBitmap);
    }

    public static final void c(String str, ou6 ou6Var, dd4 dd4Var, int i) {
        String str2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(2065184499);
        int i2 = i | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16);
        if (dd4Var2.V(i2 & 1, (i2 & 19) != 18)) {
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
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
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            ur9 ur9Var = s96.a;
            nha.c(str, new bp5(1.0f, true), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, i2 & 14, 0, 131064);
            str2 = str;
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.r(lu6.a, 12.0f));
            mx4.a(i25.c((m53) f53.t.getValue(), dd4Var2, 0), (String) null, (ou6) null, ((q96) dd4Var2.j(ur9Var)).a.q, dd4Var2, 48, 4);
            dd4Var2.q(true);
        } else {
            str2 = str;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b7(str2, ou6Var, i, 9);
        }
    }

    public static ae5 d() {
        return new ae5(null);
    }

    public static final void e(ib4 ib4Var, ou6 ou6Var, ms5 ms5Var, cs5 cs5Var, dd4 dd4Var, int i, int i2) {
        int i3;
        int i4;
        cs5 cs5Var2;
        ms5 ms5Var2;
        ou6 ou6Var2;
        dd4Var.h0(1055276397);
        int i5 = (dd4Var.h(ib4Var) ? 4 : 2) | i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
        } else {
            i3 = i5 | (dd4Var.f(ou6Var) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 384;
        } else {
            i4 = i3 | (dd4Var.f(ms5Var) ? 256 : Token.CASE);
        }
        int i8 = i4 | (dd4Var.f(cs5Var) ? 2048 : 1024);
        if (dd4Var.V(i8 & 1, (i8 & 1171) != 1170)) {
            if (i6 != 0) {
                ou6Var = lu6.a;
            }
            ou6 ou6Var3 = ou6Var;
            if (i7 != 0) {
                ms5Var = null;
            }
            ms5 ms5Var3 = ms5Var;
            cs5Var2 = cs5Var;
            vv1.d(jf0.G(-933153643, new hu2(ms5Var3, ou6Var3, cs5Var2, dk9.A(ib4Var, dd4Var), 3), dd4Var), dd4Var, 6);
            ms5Var2 = ms5Var3;
            ou6Var2 = ou6Var3;
        } else {
            cs5Var2 = cs5Var;
            dd4Var.Y();
            ms5Var2 = ms5Var;
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o50(ib4Var, ou6Var2, ms5Var2, cs5Var2, i, i2);
        }
    }

    public static final void f(gn2 gn2Var, kb4 kb4Var, dd4 dd4Var, int i) {
        gn2Var.getClass();
        kb4Var.getClass();
        dd4Var.h0(-1224227726);
        int i2 = i | (dd4Var.f(gn2Var) ? 4 : 2) | (dd4Var.h(kb4Var) ? 32 : 16);
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean zBooleanValue = ((Boolean) gn2Var.a.getValue()).booleanValue();
            boolean z = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new zs5(gn2Var, 10);
                dd4Var.p0(objQ);
            }
            z8.d(zBooleanValue, (kb4) objQ, jf0.G(-207921722, new lj6(gn2Var, kb4Var), dd4Var), null, null, jf0.G(-1657419831, new ah(gn2Var, 25), dd4Var), fe.k, null, 0L, 0L, 0.0f, false, false, fe.l, dd4Var, 1769856, 8088);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new lj6(gn2Var, kb4Var, i);
        }
    }

    public static final void g(final boolean z, final boolean z2, final boolean z3, final boolean z4, final kb4 kb4Var, final kb4 kb4Var2, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final ib4 ib4Var4, final ib4 ib4Var5, final ib4 ib4Var6, dd4 dd4Var, final int i) {
        kb4Var.getClass();
        kb4Var2.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        ib4Var3.getClass();
        ib4Var4.getClass();
        ib4Var5.getClass();
        ib4Var6.getClass();
        dd4Var.h0(2071567447);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.g(z2) ? 32 : 16) | (dd4Var.g(z3) ? 256 : Token.CASE) | (dd4Var.g(z4) ? 2048 : 1024) | (dd4Var.h(kb4Var) ? 16384 : 8192) | (dd4Var.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(ib4Var) ? 1048576 : 524288) | (dd4Var.h(ib4Var2) ? 8388608 : 4194304) | (dd4Var.h(ib4Var3) ? 67108864 : 33554432) | (dd4Var.h(ib4Var4) ? 536870912 : 268435456);
        if (dd4Var.V(i2 & 1, ((i2 & 306783379) == 306783378 && (((dd4Var.h(ib4Var5) ? (char) 4 : (char) 2) | (dd4Var.h(ib4Var6) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            xf0 xf0Var = bv4.d;
            ou6 ou6VarP0 = gjb.p0(yib.B(tg9.w(lu6.a), 15), 0.0f, 40.0f, 24.0f, 0.0f, 9);
            long jC = lc1.c(0.1f, lc1.b);
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new zm6(2);
                dd4Var.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new zm6(3);
                dd4Var.p0(objQ2);
            }
            bx1.a(z, kb4Var, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), xf0Var, jC, false, false, ou6VarP0, jf0.G(-29795531, new zb4() { // from class: ln6
                @Override // defpackage.zb4
                public final Object c(Object obj2, Object obj3, Object obj4) {
                    dd4 dd4Var2 = (dd4) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((co0) obj2).getClass();
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                        ur9 ur9Var = s96.a;
                        qx1.h(z2, z3, z4, fe.L(t96.w(lu6.a, ((q96) dd4Var2.j(ur9Var)).c.e), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 1.0f), jf0.G), kb4Var2, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, dd4Var2, 0);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, (i2 & 14) | 805531008 | ((i2 >> 9) & Token.ASSIGN_MOD), 192);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(z, z2, z3, z4, kb4Var, kb4Var2, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, i) { // from class: mn6
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ kb4 e;
                public final /* synthetic */ kb4 f;
                public final /* synthetic */ ib4 s;
                public final /* synthetic */ ib4 t;
                public final /* synthetic */ ib4 u;
                public final /* synthetic */ ib4 v;
                public final /* synthetic */ ib4 w;
                public final /* synthetic */ ib4 x;

                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(1);
                    qx1.g(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, (dd4) obj2, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void h(boolean z, boolean z2, boolean z3, ou6 ou6Var, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, dd4 dd4Var, int i) {
        ou6 ou6Var2;
        Object obj;
        dd4Var.h0(2072260366);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.g(z2) ? 32 : 16) | (dd4Var.g(z3) ? 256 : Token.CASE) | (dd4Var.f(ou6Var) ? 2048 : 1024) | (dd4Var.h(kb4Var) ? 16384 : 8192) | (dd4Var.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(ib4Var2) ? 1048576 : 524288) | (dd4Var.h(ib4Var3) ? 8388608 : 4194304) | (dd4Var.h(ib4Var4) ? 67108864 : 33554432) | (dd4Var.h(ib4Var5) ? 536870912 : 268435456);
        char c = dd4Var.h(ib4Var6) ? (char) 4 : (char) 2;
        if (dd4Var.V(i2 & 1, ((i2 & 306783379) == 306783378 && (c & 3) == 2) ? false : true)) {
            ou6 ou6VarQ = kc5.Q(gjb.n0(jv3.O(ou6Var, fc5.b), 0.0f, 12.0f, 1), kc5.J(dd4Var), 14);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarQ);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, ie1VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            ou6 ou6Var3 = lu6.a;
            Object obj2 = vl1.a;
            if (z2) {
                ou6Var2 = ou6Var3;
                obj = obj2;
                dd4Var.f0(-95005046);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-95760392);
                String strK = wn9.K((pv9) vu9.w0.getValue(), dd4Var);
                int i3 = i2 & 57344;
                boolean z4 = i3 == 16384;
                Object objQ = dd4Var.Q();
                if (z4 || objQ == obj2) {
                    objQ = new mj(12, kb4Var);
                    dd4Var.p0(objQ);
                }
                kb4 kb4Var2 = (kb4) objQ;
                ou6 ou6VarF = tg9.f(ou6Var3, 1.0f);
                boolean z5 = (i3 == 16384) | ((i2 & 14) == 4);
                Object objQ2 = dd4Var.Q();
                if (z5 || objQ2 == obj2) {
                    objQ2 = new ck0(8, kb4Var, z);
                    dd4Var.p0(objQ2);
                }
                ou6 ou6VarP0 = gjb.p0(fw.J(null, (ib4) objQ2, ou6VarF, false, 15), 8.0f, 0.0f, 28.0f, 0.0f, 10);
                ou6Var2 = ou6Var3;
                a((i2 << 3) & Token.ASSIGN_MOD, kb4Var2, dd4Var, ou6VarP0, strK, z);
                String strK2 = wn9.K((pv9) iu9.D0.getValue(), dd4Var);
                ou6 ou6VarF2 = tg9.f(ou6Var2, 1.0f);
                boolean z6 = (i2 & 458752) == 131072;
                Object objQ3 = dd4Var.Q();
                if (z6) {
                    obj = obj2;
                } else {
                    obj = obj2;
                    if (objQ3 == obj) {
                    }
                    c(strK2, gjb.m0(gjb.p0(fw.J(null, (ib4) objQ3, ou6VarF2, false, 15), 8.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f, 12.0f), dd4Var, 0);
                    dd4Var.q(false);
                }
                objQ3 = new pm6(5, ib4Var);
                dd4Var.p0(objQ3);
                c(strK2, gjb.m0(gjb.p0(fw.J(null, (ib4) objQ3, ou6VarF2, false, 15), 8.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f, 12.0f), dd4Var, 0);
                dd4Var.q(false);
            }
            if (z3) {
                dd4Var.f0(-94955601);
                String strK3 = wn9.K((pv9) iu9.H0.getValue(), dd4Var);
                ou6 ou6VarF3 = tg9.f(ou6Var2, 1.0f);
                boolean z7 = (i2 & 29360128) == 8388608;
                Object objQ4 = dd4Var.Q();
                if (z7 || objQ4 == obj) {
                    objQ4 = new pm6(6, ib4Var3);
                    dd4Var.p0(objQ4);
                }
                c(strK3, gjb.m0(gjb.p0(fw.J(null, (ib4) objQ4, ou6VarF3, false, 15), 8.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f, 12.0f), dd4Var, 0);
                String strK4 = wn9.K((pv9) zt9.u0.getValue(), dd4Var);
                ou6 ou6VarF4 = tg9.f(ou6Var2, 1.0f);
                boolean z8 = (i2 & 3670016) == 1048576;
                Object objQ5 = dd4Var.Q();
                if (z8 || objQ5 == obj) {
                    objQ5 = new pm6(7, ib4Var2);
                    dd4Var.p0(objQ5);
                }
                c(strK4, gjb.m0(gjb.p0(fw.J(null, (ib4) objQ5, ou6VarF4, false, 15), 8.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f, 12.0f), dd4Var, 0);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-94298339);
                String strK5 = wn9.K((pv9) iu9.G0.getValue(), dd4Var);
                ou6 ou6VarF5 = tg9.f(ou6Var2, 1.0f);
                boolean z9 = (i2 & 234881024) == 67108864;
                Object objQ6 = dd4Var.Q();
                if (z9 || objQ6 == obj) {
                    objQ6 = new pm6(8, ib4Var4);
                    dd4Var.p0(objQ6);
                }
                c(strK5, gjb.m0(gjb.p0(fw.J(null, (ib4) objQ6, ou6VarF5, false, 15), 8.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f, 12.0f), dd4Var, 0);
                dd4Var.q(false);
            }
            String strK6 = wn9.K((pv9) ev9.g.getValue(), dd4Var);
            ou6 ou6VarF6 = tg9.f(ou6Var2, 1.0f);
            boolean z10 = (i2 & 1879048192) == 536870912;
            Object objQ7 = dd4Var.Q();
            if (z10 || objQ7 == obj) {
                objQ7 = new pm6(3, ib4Var5);
                dd4Var.p0(objQ7);
            }
            c(strK6, gjb.m0(gjb.p0(fw.J(null, (ib4) objQ7, ou6VarF6, false, 15), 8.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f, 12.0f), dd4Var, 0);
            String strK7 = wn9.K((pv9) mu9.N.getValue(), dd4Var);
            ou6 ou6VarF7 = tg9.f(ou6Var2, 1.0f);
            boolean z11 = (c & 14) == 4;
            Object objQ8 = dd4Var.Q();
            if (z11 || objQ8 == obj) {
                objQ8 = new pm6(4, ib4Var6);
                dd4Var.p0(objQ8);
            }
            c(strK7, gjb.m0(gjb.p0(fw.J(null, (ib4) objQ8, ou6VarF7, false, 15), 8.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f, 12.0f), dd4Var, 0);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new kn6(z, z2, z3, ou6Var, kb4Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, i);
        }
    }

    public static final b4c i() {
        int i = ~100;
        b4c b4cVar = new b4c();
        b4cVar.c = 100;
        b4cVar.d = 0;
        b4cVar.e = 0;
        b4cVar.f = 0;
        b4cVar.s = i;
        b4cVar.t = (100 << 10) ^ (0 >>> 4);
        if ((100 | 0 | i) == 0) {
            gp.l("Initial state must have at least one non-zero element.");
            throw null;
        }
        for (int i2 = 0; i2 < 64; i2++) {
            b4cVar.d();
        }
        return b4cVar;
    }

    public static final void j(t27 t27Var, dd4 dd4Var, int i) {
        t27Var.getClass();
        dd4Var.h0(-115153971);
        int i2 = (dd4Var.f(t27Var) ? 4 : 2) | i;
        int i3 = 0;
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            qe9 qe9Var = (qe9) ((qtb) N(ug8.a(qe9.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(qe9Var.d, dd4Var);
            m8 m8Var = (m8) dd4Var.j(a9.a);
            u90 u90Var = (u90) dd4Var.j(xm1.d);
            pp1 pp1Var = qe9Var.e;
            boolean zF = dd4Var.f(m8Var) | ((i2 & 14) == 4);
            Object objQ = dd4Var.Q();
            jt1 jt1Var = null;
            if (zF || objQ == vl1.a) {
                objQ = new q51(m8Var, t27Var, jt1Var, 10);
                dd4Var.p0(objQ);
            }
            wx1.e(pp1Var, null, (zb4) objQ, dd4Var, 0);
            gx1.p(wn9.K((pv9) zt9.X.getValue(), dd4Var), null, false, jf0.G(850208585, new n74(t27Var, 29), dd4Var), null, jf0.G(746286487, new ak0(12, qe9Var, u90Var, a07VarB), dd4Var), dd4Var, 199680, 22);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new oe9(i, i3, t27Var);
        }
    }

    public static final bbb k(bbb bbbVar) {
        bbbVar.getClass();
        pi5 pi5Var = bbbVar.b;
        pi5Var.getClass();
        pi5 pi5Var2 = ((ri5) pi5Var.b().get(0)).b;
        pi5Var2.getClass();
        sh5 sh5VarD = pi5Var2.d();
        sh5VarD.getClass();
        return new bbb((a91) sh5VarD, pi5Var2);
    }

    public static final String l(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final float m(pj7 pj7Var, dd4 dd4Var) {
        pj7Var.getClass();
        return gjb.V(pj7Var, (zm5) dd4Var.j(xm1.n));
    }

    public static final float n(pj7 pj7Var, dd4 dd4Var) {
        pj7Var.getClass();
        return gjb.W(pj7Var, (zm5) dd4Var.j(xm1.n));
    }

    public static final void o(jx1 jx1Var, CancellationException cancellationException) {
        yd5 yd5Var = (yd5) jx1Var.get(s00.s);
        if (yd5Var != null) {
            yd5Var.cancel(cancellationException);
        }
    }

    public static final void p(yd5 yd5Var, String str, Throwable th) {
        yd5Var.cancel(e11.a(str, th));
    }

    public static final Object q(yd5 yd5Var, kt1 kt1Var) {
        yd5Var.cancel(null);
        Object objJoin = yd5Var.join(kt1Var);
        return objJoin == xx1.a ? objJoin : heb.a;
    }

    public static final void r(int i) {
        if (i >= 1) {
            return;
        }
        gp.k(dx1.f(i, "Expected positive parallelism level, but got "));
    }

    public static final void s(jx1 jx1Var) {
        yd5 yd5Var = (yd5) jx1Var.get(s00.s);
        if (yd5Var != null && !yd5Var.isActive()) {
            throw yd5Var.getCancellationException();
        }
    }

    public static final le3 t(Enum[] enumArr) {
        enumArr.getClass();
        return new le3(enumArr);
    }

    public static boolean u(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double v(double r10, double r12) {
        /*
            double r0 = defpackage.qu1.j0(r10, r12)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        Lc:
            double r4 = defpackage.qu1.D(r10, r12)
            double r2 = java.lang.Math.max(r2, r4)
            double r4 = defpackage.qu1.n0(r0, r10)
            double r6 = defpackage.qu1.n0(r2, r10)
            double r10 = java.lang.Math.rint(r10)
            r8 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L4b
            double r10 = r4 - r6
            double r10 = java.lang.Math.abs(r10)
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L3f
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3f
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3f
            r10 = 1
            goto L40
        L3f:
            r10 = 0
        L40:
            int r11 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r11 >= 0) goto L54
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 >= 0) goto L54
            if (r10 == 0) goto L55
            goto L54
        L4b:
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L55
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L54
            goto L55
        L54:
            return r0
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx1.v(double, double):double");
    }

    public static final yd5 w(jx1 jx1Var) {
        yd5 yd5Var = (yd5) jx1Var.get(s00.s);
        if (yd5Var != null) {
            return yd5Var;
        }
        mn5.n(jx1Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final int x(wq8 wq8Var) throws Exception {
        wq8Var.getClass();
        cr8 cr8VarP0 = wq8Var.P0("SELECT changes()");
        try {
            cr8VarP0.J0();
            int i = (int) cr8VarP0.getLong(0);
            lc5.U(cr8VarP0, null);
            return i;
        } finally {
        }
    }

    public static final void y(jx1 jx1Var, Throwable th) {
        if (th instanceof jw2) {
            th = ((jw2) th).a;
        }
        try {
            ox1 ox1Var = (ox1) jx1Var.get(lr3.e);
            if (ox1Var != null) {
                ox1Var.P(jx1Var, th);
            } else {
                yn2.D(jx1Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                i12.r(runtimeException, th);
                th = runtimeException;
            }
            yn2.D(jx1Var, th);
        }
    }

    public static final ou6 z(ou6 ou6Var, boolean z, zb4 zb4Var, dd4 dd4Var, int i) {
        ou6Var.getClass();
        if (!z) {
            dd4Var.f0(1394400731);
            dd4Var.q(false);
            return ou6Var;
        }
        dd4Var.f0(1394380953);
        ou6 ou6Var2 = (ou6) zb4Var.c(ou6Var, dd4Var, Integer.valueOf((i & 14) | ((i >> 3) & Token.ASSIGN_MOD)));
        dd4Var.q(false);
        return ou6Var2;
    }
}
