package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class vw1 {
    public static p35 a;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.wa2 A(defpackage.jd7 r38) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw1.A(jd7):wa2");
    }

    public static final jx1 B(dp8 dp8Var, kt1 kt1Var) {
        if (!dp8Var.j()) {
            iw0 iw0Var = dp8Var.a;
            if (iw0Var != null) {
                return iw0Var.b;
            }
            lc5.i0("coroutineScope");
            throw null;
        }
        if (kt1Var.getContext().get(t08.b) != null) {
            j31.j();
            return null;
        }
        iw0 iw0Var2 = dp8Var.a;
        if (iw0Var2 != null) {
            return iw0Var2.b;
        }
        lc5.i0("coroutineScope");
        throw null;
    }

    public static final long C(KeyEvent keyEvent) {
        return cx1.e(keyEvent.getKeyCode());
    }

    public static final uy7 D(View view) {
        uy7 uy7Var = (uy7) view.getTag(2131362314);
        if (uy7Var != null) {
            return uy7Var;
        }
        uy7 uy7Var2 = new uy7();
        view.setTag(2131362314, uy7Var2);
        return uy7Var2;
    }

    public static final int E(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final qj4 F(byte[] bArr, s3 s3Var) {
        s3Var.getClass();
        vj4 vj4Var = (vj4) ((ib4) s3Var.c).invoke();
        vj4Var.g(bArr.length, bArr);
        return vj4Var.e();
    }

    public static final void G(b29 b29Var) {
        S(b29Var).I();
    }

    public static final float H(ty6 ty6Var, ty6 ty6Var2, float f) {
        int iNextInt;
        int i;
        ty6Var.getClass();
        ty6Var2.getClass();
        if (0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f).toString());
        }
        Iterator it = wx1.s0(0, ty6Var.b).iterator();
        while (true) {
            w21 w21Var = (w21) it;
            if (!w21Var.d) {
                so9.n("Collection contains no element matching the predicate.");
                return 0.0f;
            }
            iNextInt = w21Var.nextInt();
            float fB = ty6Var.b(iNextInt);
            i = iNextInt + 1;
            float fB2 = ty6Var.b(i % ty6Var.b);
            if (fB2 >= fB) {
                if (fB <= f && f <= fB2) {
                    break;
                }
            } else if (f >= fB || f <= fB2) {
                break;
            }
        }
        int i2 = i % ty6Var.b;
        float fC = kjb.c(ty6Var.b(i2) - ty6Var.b(iNextInt));
        return kjb.c((kjb.c(ty6Var2.b(i2) - ty6Var2.b(iNextInt)) * (fC < 0.001f ? 0.5f : kjb.c(f - ty6Var.b(iNextInt)) / fC)) + ty6Var2.b(iNextInt));
    }

    public static double[] I(double[] dArr, double[][] dArr2) {
        dArr.getClass();
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        return new double[]{d6, d7, (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0])};
    }

    public static final Object J(dp8 dp8Var, boolean z, boolean z2, kb4 kb4Var) {
        dp8Var.getClass();
        dp8Var.a();
        if (!dp8Var.j() || dp8Var.k() || dp8Var.h.get() == null) {
            return lx1.v0(new v22((jt1) null, kb4Var, dp8Var, z, z2));
        }
        gp.j("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(defpackage.dp8 r7, boolean r8, defpackage.f2c r9, defpackage.kt1 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.w22
            if (r0 == 0) goto L13
            r0 = r10
            w22 r0 = (defpackage.w22) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            w22 r0 = new w22
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L42
            if (r1 == r5) goto L3e
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.e11.e0(r10)
            return r10
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r2
        L34:
            boolean r8 = r0.c
            f2c r9 = r0.b
            dp8 r7 = r0.a
            defpackage.e11.e0(r10)
            goto L75
        L3e:
            defpackage.e11.e0(r10)
            return r10
        L42:
            defpackage.e11.e0(r10)
            boolean r10 = r7.j()
            if (r10 == 0) goto L66
            boolean r10 = r7.m()
            if (r10 == 0) goto L66
            boolean r10 = r7.k()
            if (r10 == 0) goto L66
            x22 r10 = new x22
            r10.<init>(r2, r9, r7, r8)
            r0.e = r5
            java.lang.Object r7 = r7.q(r8, r10, r0)
            if (r7 != r6) goto L65
            goto L88
        L65:
            return r7
        L66:
            r0.a = r7
            r0.b = r9
            r0.c = r8
            r0.e = r4
            jx1 r10 = B(r7, r0)
            if (r10 != r6) goto L75
            goto L88
        L75:
            jx1 r10 = (defpackage.jx1) r10
            qk0 r1 = new qk0
            r1.<init>(r2, r9, r7, r8)
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r7 = defpackage.ah1.b0(r10, r1, r0)
            if (r7 != r6) goto L89
        L88:
            return r6
        L89:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw1.K(dp8, boolean, f2c, kt1):java.lang.Object");
    }

    public static final float L(float f, float f2) {
        float fAbs = Math.abs(f - f2);
        return Math.min(fAbs, 1.0f - fAbs);
    }

    public static final yk1 M(cx5 cx5Var, dd4 dd4Var) {
        mx5 mx5Var = (mx5) dd4Var.j(r26.a);
        boolean zF = dd4Var.f(mx5Var);
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (zF || objQ == obj) {
            objQ = new yk1();
            dd4Var.p0(objQ);
        }
        yk1 yk1Var = (yk1) objQ;
        boolean zH = dd4Var.h(yk1Var) | dd4Var.h(mx5Var);
        Object objQ2 = dd4Var.Q();
        if (zH || objQ2 == obj) {
            objQ2 = new q57(17, mx5Var, yk1Var);
            dd4Var.p0(objQ2);
        }
        lc5.k(yk1Var, mx5Var, (kb4) objQ2, dd4Var);
        boolean zH2 = dd4Var.h(yk1Var) | dd4Var.d(cx5Var.ordinal());
        Object objQ3 = dd4Var.Q();
        if (zH2 || objQ3 == obj) {
            objQ3 = new pg(yk1Var, cx5Var, null, 26);
            dd4Var.p0(objQ3);
        }
        lc5.v(yk1Var, cx5Var, (yb4) objQ3, dd4Var);
        return yk1Var;
    }

    public static final kb9 N(boolean z, boolean z2, kb4 kb4Var, dd4 dd4Var) {
        pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
        Object objQ = dd4Var.Q();
        if (objQ == vl1.a) {
            objQ = new kb9(z, z2, pn2Var, kb4Var);
            dd4Var.p0(objQ);
        }
        return (kb9) objQ;
    }

    public static final void O(lm2 lm2Var) {
        dc dcVar;
        sn5 sn5VarS = S(lm2Var);
        if (sn5VarS.G) {
            return;
        }
        rd rdVarA = vn5.a(sn5VarS);
        if (!rd.f() || (dcVar = rdVarA.c0) == null) {
            return;
        }
        dcVar.d.b.x(sn5VarS.b, new cc(dcVar, sn5VarS));
    }

    public static final x67 P(lm2 lm2Var, int i) {
        x67 x67Var = ((nu6) lm2Var).a.t;
        x67Var.getClass();
        if (x67Var.f1() != lm2Var || !d77.g(i)) {
            return x67Var;
        }
        x67 x67Var2 = x67Var.D;
        x67Var2.getClass();
        return x67Var2;
    }

    public static final gh4 Q(lm2 lm2Var) {
        return T(lm2Var).getGraphicsContext();
    }

    public static final x67 R(lm2 lm2Var) {
        if (!((nu6) lm2Var).a.z) {
            q75.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        x67 x67VarP = P(lm2Var, 2);
        if (!x67VarP.f1().z) {
            q75.c("LayoutCoordinates is not attached.");
        }
        return x67VarP;
    }

    public static final sn5 S(lm2 lm2Var) {
        x67 x67Var = ((nu6) lm2Var).a.t;
        if (x67Var != null) {
            return x67Var.A;
        }
        throw dx1.c("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final zi7 T(lm2 lm2Var) {
        zi7 zi7Var = S(lm2Var).A;
        if (zi7Var != null) {
            return zi7Var;
        }
        throw dx1.c("This node does not have an owner.");
    }

    public static Object U(ib4 ib4Var, kt1 kt1Var) {
        return ah1.b0(hc3.a, new pg(ib4Var, null, 20), kt1Var);
    }

    public static final sn7 V(Integer num, Integer num2, Integer num3, y48 y48Var, String str, boolean z) {
        int iIntValue;
        lc3 lc3Var;
        int iIntValue2 = (num != null ? num.intValue() : 1) + (z ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z) {
                iIntValue++;
            }
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return W(z, y48Var, str, iIntValue2, iIntValue);
        }
        sn7 sn7VarW = W(z, y48Var, str, iIntValue2, iIntValue2);
        while (true) {
            lc3Var = lc3.a;
            if (iIntValue2 >= iMin) {
                break;
            }
            iIntValue2++;
            sn7VarW = new sn7(lc3Var, gc1.Z(W(z, y48Var, str, iIntValue2, iIntValue2), tw1.E(gc1.Z(new sn7(gc1.Y(new st7(" ")), lc3Var), sn7VarW))));
        }
        return iIntValue3 > iIntValue ? tw1.E(gc1.Z(new sn7(gc1.Y(new st7(iw9.G(iIntValue3 - iIntValue, " "))), lc3Var), sn7VarW)) : iIntValue3 == iIntValue ? sn7VarW : new sn7(lc3Var, gc1.Z(W(z, y48Var, str, iIntValue3 + 1, iIntValue), sn7VarW));
    }

    public static final sn7 W(boolean z, y48 y48Var, String str, int i, int i2) {
        if (i2 < (z ? 1 : 0) + 1) {
            gp.j("Check failed.");
            return null;
        }
        zy5 zy5VarN = gc1.N();
        if (z) {
            zy5VarN.add(new st7("-"));
        }
        zy5VarN.add(new ha7(gc1.Y(new kfb(Integer.valueOf(i - (z ? 1 : 0)), Integer.valueOf(i2 - (z ? 1 : 0)), y48Var, str, z))));
        return new sn7(gc1.J(zy5VarN), lc3.a);
    }

    public static final long X(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static int Y(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static String Z(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + yn2.Y(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + yn2.Y(Float.intBitsToFloat(i)) + ", " + yn2.Y(Float.intBitsToFloat(i2)) + ')';
    }

    public static final long a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void a0(ty6 ty6Var) {
        ty6Var.getClass();
        int i = ty6Var.b;
        if (i == 0) {
            so9.n("FloatList is empty.");
            return;
        }
        float f = ty6Var.a[i - 1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float fB = ty6Var.b(i2);
            if (fB < 0.0f || fB >= 1.0f) {
                gp.k("FloatMapping - Progress outside of range: ".concat(ty6.c(ty6Var, 31)));
                return;
            }
            if (L(fB, f) <= 1.0E-4f) {
                gp.k("FloatMapping - Progress repeats a value: ".concat(ty6.c(ty6Var, 31)));
                return;
            } else if (fB < f && (i3 = i3 + 1) > 1) {
                gp.k("FloatMapping - Progress wraps more than once: ".concat(ty6.c(ty6Var, 31)));
                return;
            } else {
                i2++;
                f = fB;
            }
        }
    }

    public static final void b(v93 v93Var, ou6 ou6Var, dd4 dd4Var, int i) {
        ou6 ou6Var2;
        dd4 dd4Var2;
        dd4Var.h0(-1750618746);
        int i2 = (dd4Var.f(v93Var) ? 4 : 2) | i | (dd4Var.f(ou6Var) ? 32 : 16);
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            ou6Var2 = ou6Var;
            dd4Var2 = dd4Var;
            w05.a(v93Var.c, ra1.e, false, null, fz1.f, ou6Var2, null, dd4Var2, ((i2 << 15) & 3670016) | 196656, 412);
        } else {
            ou6Var2 = ou6Var;
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new il6(v93Var, ou6Var2, i, 22);
        }
    }

    public static final int b0(jq5 jq5Var) {
        lh7 lh7Var = jq5Var.q;
        List list = jq5Var.m;
        boolean z = lh7Var == lh7.a;
        if (list.isEmpty()) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < list.size()) {
            kq5 kq5Var = (kq5) list.get(i);
            int i4 = z ? kq5Var.v : kq5Var.w;
            if (i4 == -1) {
                i++;
            } else {
                int iMax = 0;
                while (i < list.size()) {
                    kq5 kq5Var2 = (kq5) list.get(i);
                    if ((z ? kq5Var2.v : kq5Var2.w) != i4) {
                        break;
                    }
                    iMax = Math.max(iMax, (int) (z ? ((kq5) list.get(i)).t & 4294967295L : ((kq5) list.get(i)).t >> 32));
                    i++;
                }
                i2 += iMax;
                i3++;
            }
        }
        return (i2 / i3) + jq5Var.s;
    }

    public static final void c(pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, ib4 ib4Var, dd4 dd4Var, int i) {
        pj7 pj7Var2;
        Object hl2Var;
        a07 a07Var;
        st5 st5Var;
        a07 a07Var2;
        a07 a07Var3;
        boolean z;
        wq5 wq5Var;
        kb4Var.getClass();
        ib4Var.getClass();
        dd4Var.h0(-1083503617);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.h(ib4Var) ? 2048 : 1024;
        }
        if (dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            pj7 rj7Var = new rj7(0.0f, 0.0f, 0.0f, 0.0f);
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            bc3 bc3Var = (bc3) ((qtb) qx1.N(ug8.a(bc3.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(bc3Var.d, dd4Var);
            st5 st5VarA = ut5.a(0, dd4Var, 0, 3);
            wq5 wq5VarA = yq5.a(dd4Var);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.x(lc3.a);
                dd4Var.p0(objQ);
            }
            a07 a07Var4 = (a07) objQ;
            Integer numValueOf = Integer.valueOf(((ub3) a07VarB.getValue()).b.size());
            List list = ((ub3) a07VarB.getValue()).c;
            boolean zF = dd4Var.f(a07VarB);
            Object objQ2 = dd4Var.Q();
            jt1 jt1Var = null;
            if (zF || objQ2 == obj) {
                objQ2 = new pa3(a07VarB, a07Var4, null);
                dd4Var.p0(objQ2);
            }
            lc5.v(numValueOf, list, (yb4) objQ2, dd4Var);
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = dk9.n(new y6(27, wq5VarA, a07Var4));
                dd4Var.p0(objQ3);
            }
            br9 br9Var = (br9) objQ3;
            String str = (String) br9Var.getValue();
            boolean zF2 = dd4Var.f(a07VarB) | dd4Var.f(st5VarA);
            Object objQ4 = dd4Var.Q();
            if (zF2 || objQ4 == obj) {
                a07Var = a07Var4;
                hl2Var = new hl2(st5VarA, a07VarB, br9Var, jt1Var, 6);
                st5Var = st5VarA;
                a07Var2 = a07VarB;
                dd4Var.p0(hl2Var);
            } else {
                a07Var2 = a07VarB;
                a07Var = a07Var4;
                hl2Var = objQ4;
                st5Var = st5VarA;
            }
            lc5.u((yb4) hl2Var, dd4Var, str);
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj) {
                objQ5 = lc5.Z(dd4Var);
                dd4Var.p0(objQ5);
            }
            vx1 vx1Var = (vx1) objQ5;
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
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
            ou6 ou6VarH = tg9.h(tg9.f(lu6.a, 1.0f), 46.0f);
            rj7 rj7VarO = gjb.o(2, 8.0f);
            boolean zF3 = ((i2 & 7168) == 2048) | dd4Var.f(a07Var2) | dd4Var.h(vx1Var) | dd4Var.f(wq5VarA);
            Object objQ6 = dd4Var.Q();
            if (zF3 || objQ6 == obj) {
                a07Var3 = a07Var2;
                z = false;
                wq5Var = wq5VarA;
                pm0 pm0Var = new pm0(a07Var3, vx1Var, wq5Var, br9Var, a07Var, ib4Var, 4);
                dd4Var.p0(pm0Var);
                objQ6 = pm0Var;
            } else {
                a07Var3 = a07Var2;
                wq5Var = wq5VarA;
                z = false;
            }
            a07 a07Var5 = a07Var3;
            rw1.k(ou6VarH, st5Var, rj7VarO, false, null, null, null, false, null, (kb4) objQ6, dd4Var, 390, 504);
            bp5 bp5Var = new bp5(1.0f, true);
            yh4 yh4Var = new yh4(58.0f);
            szb szbVarW = yib.w(rj7Var, new rj7(8.0f, 8.0f, 8.0f, 8.0f));
            boolean zF4 = dd4Var.f(a07Var5);
            if ((i2 & 896) == 256) {
                z = true;
            }
            boolean zF5 = zF4 | z | dd4Var.f(bc3Var);
            Object objQ7 = dd4Var.Q();
            if (zF5 || objQ7 == obj) {
                objQ7 = new v6(29, a07Var5, kb4Var, bc3Var);
                dd4Var.p0(objQ7);
            }
            sw1.h(yh4Var, bp5Var, wq5Var, szbVarW, (nv) null, (kv) null, (s04) null, false, (ag) null, (kb4) objQ7, dd4Var, 0, 0, 1008);
            dd4Var.q(true);
            pj7Var2 = rj7Var;
        } else {
            dd4Var.Y();
            pj7Var2 = pj7Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o50((Object) pj7Var2, ou6Var, (ub4) kb4Var, (ub4) ib4Var, i, 3);
        }
    }

    public static final void d(ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(-268071215);
        if ((i & 48) == 0) {
            i2 = i | (dd4Var.f(ou6Var) ? 32 : 16);
        } else {
            i2 = i;
        }
        int i3 = i2 | (dd4Var.h(ib4Var) ? 256 : Token.CASE) | (dd4Var.h(ib4Var2) ? 2048 : 1024) | (dd4Var.h(ib4Var3) ? 16384 : 8192);
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 >> 3;
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
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
            p35 p35VarC = i25.c((m53) a53.x.getValue(), dd4Var, 0);
            String strK = wn9.K((pv9) mu9.V.getValue(), dd4Var);
            lu6 lu6Var = lu6.a;
            h(p35VarC, strK, gjb.l0(tg9.f(lu6Var, 1.0f), 8.0f), ib4Var, dd4Var, ((i3 << 3) & 7168) | 384);
            h(i25.c((m53) a53.m.getValue(), dd4Var, 0), wn9.K((pv9) zt9.m0.getValue(), dd4Var), gjb.l0(tg9.f(lu6Var, 1.0f), 8.0f), ib4Var2, dd4Var, (i3 & 7168) | 384);
            h(i25.c((m53) a53.I.getValue(), dd4Var, 0), wn9.K((pv9) zt9.l0.getValue(), dd4Var), gjb.l0(tg9.f(lu6Var, 1.0f), 8.0f), ib4Var3, dd4Var, (i4 & 7168) | 384);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new pl6(ou6Var, ib4Var, ib4Var2, ib4Var3, i, 0);
        }
    }

    public static final void e(uu5 uu5Var, boolean z, float f, pj7 pj7Var, float f2, long j, long j2, t89 t89Var, ux8 ux8Var, tx8 tx8Var, int i, dd4 dd4Var, int i2, int i3) {
        int i4;
        int i5;
        br9 br9Var;
        ym7 ym7Var;
        br9 br9Var2;
        ym7 ym7Var2;
        br9 br9Var3;
        float f3;
        br9 br9Var4;
        kb4 kb4Var;
        ym7 ym7Var3;
        Object obj;
        int i6;
        br9 br9Var5;
        br9 br9Var6;
        br9 br9Var7;
        boolean z2;
        boolean z3;
        uu5 uu5Var2;
        uu5Var.getClass();
        pj7Var.getClass();
        dd4Var.h0(-1720080850);
        if ((i2 & 6) == 0) {
            i4 = (dd4Var.f(uu5Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dd4Var.f(lu6.a) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= dd4Var.g(z) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dd4Var.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dd4Var.c(f) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= dd4Var.f(pj7Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= dd4Var.c(f2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= dd4Var.e(j) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= dd4Var.e(j2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= dd4Var.f(t89Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = (dd4Var.d(ux8Var == null ? -1 : ux8Var.ordinal()) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= dd4Var.d(tx8Var != null ? tx8Var.ordinal() : -1) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= dd4Var.d(i) ? 256 : Token.CASE;
        }
        if ((i3 & 3072) == 0) {
            i5 |= dd4Var.h((Object) null) ? 2048 : 1024;
        }
        int i7 = i5;
        int i8 = 1;
        if (dd4Var.V(i4 & 1, ((306783379 & i4) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            dd4Var.a0();
            if ((i2 & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            Object objQ = dd4Var.Q();
            Object obj2 = vl1.a;
            if (objQ == obj2) {
                objQ = dk9.n(new gt5(uu5Var, i8));
                dd4Var.p0(objQ);
            }
            br9 br9Var8 = (br9) objQ;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj2) {
                objQ2 = lc5.Z(dd4Var);
                dd4Var.p0(objQ2);
            }
            vx1 vx1Var = (vx1) objQ2;
            int i9 = i4;
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj2) {
                objQ3 = dk9.x(Boolean.FALSE);
                dd4Var.p0(objQ3);
            }
            br9 br9Var9 = (a07) objQ3;
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj2) {
                br9Var = br9Var8;
                objQ4 = new ym7(0.0f);
                dd4Var.p0(objQ4);
            } else {
                br9Var = br9Var8;
            }
            ym7 ym7Var4 = (ym7) objQ4;
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj2) {
                ym7Var = ym7Var4;
                objQ5 = dk9.n(new gt5(uu5Var, 2));
                dd4Var.p0(objQ5);
            } else {
                ym7Var = ym7Var4;
            }
            br9 br9Var10 = (br9) objQ5;
            Object objQ6 = dd4Var.Q();
            int i10 = 3;
            if (objQ6 == obj2) {
                objQ6 = dk9.n(new gt5(uu5Var, i10));
                dd4Var.p0(objQ6);
            }
            br9 br9Var11 = (br9) objQ6;
            Object objQ7 = dd4Var.Q();
            if (objQ7 == obj2) {
                br9Var2 = br9Var11;
                objQ7 = dk9.n(new al3(28, uu5Var, br9Var10));
                dd4Var.p0(objQ7);
            } else {
                br9Var2 = br9Var11;
            }
            br9 br9Var12 = (br9) objQ7;
            Object objQ8 = dd4Var.Q();
            if (objQ8 == obj2) {
                ym7Var2 = ym7Var;
                br9Var3 = br9Var2;
                objQ8 = dk9.n(new wp0(uu5Var, br9Var10, br9Var3, br9Var12, 6));
                dd4Var.p0(objQ8);
            } else {
                ym7Var2 = ym7Var;
                br9Var3 = br9Var2;
            }
            br9 br9Var13 = (br9) objQ8;
            Object objQ9 = dd4Var.Q();
            if (objQ9 == obj2) {
                f3 = f2;
                objQ9 = dk9.n(new jp5(f3, br9Var13, 2));
                dd4Var.p0(objQ9);
            } else {
                f3 = f2;
            }
            br9 br9Var14 = (br9) objQ9;
            Object objQ10 = dd4Var.Q();
            if (objQ10 == obj2) {
                objQ10 = dk9.n(new kp5(uu5Var, br9Var10, br9Var3, f3, br9Var13));
                dd4Var.p0(objQ10);
            }
            br9 br9Var15 = (br9) objQ10;
            Object objQ11 = dd4Var.Q();
            if (objQ11 == obj2) {
                objQ11 = new lp5(br9Var14, ym7Var2, 2);
                dd4Var.p0(objQ11);
            }
            kb4 kb4Var2 = (kb4) objQ11;
            Object objQ12 = dd4Var.Q();
            if (objQ12 == obj2) {
                br9Var5 = br9Var14;
                obj = obj2;
                br9Var4 = br9Var15;
                br9Var6 = br9Var9;
                br9Var7 = br9Var;
                z3 = true;
                ym7Var3 = ym7Var2;
                i6 = i7;
                ar5 ar5Var = new ar5(kb4Var2, uu5Var, vx1Var, br9Var3, ym7Var3, f2, br9Var13, br9Var10, 1);
                kb4Var = kb4Var2;
                uu5Var2 = uu5Var;
                z2 = false;
                dd4Var.p0(ar5Var);
                objQ12 = ar5Var;
            } else {
                br9Var4 = br9Var15;
                kb4Var = kb4Var2;
                ym7Var3 = ym7Var2;
                obj = obj2;
                i6 = i7;
                br9Var5 = br9Var14;
                br9Var6 = br9Var9;
                br9Var7 = br9Var;
                z2 = false;
                z3 = true;
                uu5Var2 = uu5Var;
            }
            kb4 kb4Var3 = (kb4) objQ12;
            Object objQ13 = dd4Var.Q();
            if (objQ13 == obj) {
                objQ13 = new tn4(br9Var6, 23);
                dd4Var.p0(objQ13);
            }
            kb4 kb4Var4 = (kb4) objQ13;
            if (uu5Var2.n.a() || ((Boolean) br9Var6.getValue()).booleanValue()) {
                z2 = z3;
            }
            Object objQ14 = dd4Var.Q();
            if (objQ14 == obj) {
                objQ14 = new op0(br9Var7, 15);
                dd4Var.p0(objQ14);
            }
            ib4 ib4Var = (ib4) objQ14;
            boolean zBooleanValue = ((Boolean) br9Var6.getValue()).booleanValue();
            float fH = ym7Var3.h();
            Object objQ15 = dd4Var.Q();
            if (objQ15 == obj) {
                objQ15 = new op0(br9Var5, 16);
                dd4Var.p0(objQ15);
            }
            ib4 ib4Var2 = (ib4) objQ15;
            Object objQ16 = dd4Var.Q();
            if (objQ16 == obj) {
                objQ16 = new op0(br9Var4, 17);
                dd4Var.p0(objQ16);
            }
            ib4 ib4Var3 = (ib4) objQ16;
            int i11 = i9 >> 3;
            g(pj7Var, z, i, t89Var, f, j, j2, tx8Var, ux8Var, ib4Var, zBooleanValue, fH, ib4Var2, ib4Var3, z2, kb4Var, kb4Var3, kb4Var4, dd4Var, (i11 & 29360128) | (i11 & 14) | ((i9 >> 12) & Token.ASSIGN_MOD) | (i9 & 896) | ((i6 << 3) & 7168) | ((i9 >> 15) & 57344) | ((i9 << 3) & 458752) | (3670016 & i11) | ((i6 << 21) & 234881024) | ((i6 << 27) & 1879048192), ((i6 >> 9) & 14) | 918773808);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new qp5(uu5Var, z, f, pj7Var, f2, j, j2, t89Var, ux8Var, tx8Var, i, i2, i3);
        }
    }

    public static final void f(uu5 uu5Var, ou6 ou6Var, boolean z, float f, pj7 pj7Var, float f2, long j, long j2, t89 t89Var, ux8 ux8Var, tx8 tx8Var, int i, boolean z2, rj1 rj1Var, dd4 dd4Var, int i2) {
        int i3;
        pj7 pj7Var2;
        long j3;
        dd4 dd4Var2;
        boolean z3;
        float f3;
        float f4;
        t89 t89Var2;
        ux8 ux8Var2;
        tx8 tx8Var2;
        boolean z4;
        t89 t89Var3;
        float f5;
        ux8 ux8Var3;
        int i4;
        boolean z5;
        boolean z6;
        float f6;
        tx8 tx8Var3;
        ux8 ux8Var4;
        t89 t89Var4;
        uu5Var.getClass();
        pj7Var.getClass();
        dd4Var.h0(-1401568378);
        if ((i2 & 6) == 0) {
            i3 = i2 | (dd4Var.f(uu5Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        int i5 = i3 | 28032;
        if ((i2 & 196608) == 0) {
            pj7Var2 = pj7Var;
            i5 |= dd4Var.f(pj7Var2) ? 131072 : Parser.ARGC_LIMIT;
        } else {
            pj7Var2 = pj7Var;
        }
        int i6 = i5 | 1572864;
        if ((i2 & 12582912) == 0) {
            i6 |= dd4Var.e(j) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            j3 = j2;
            i6 |= dd4Var.e(j3) ? 67108864 : 33554432;
        } else {
            j3 = j2;
        }
        if ((i2 & 805306368) == 0) {
            i6 |= 268435456;
        }
        if (dd4Var.V(i6 & 1, (306783379 & i6) != 306783378)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                t89Var3 = tp8.a;
                f5 = 3.0f;
                ux8Var3 = ux8.a;
                i4 = i6 & (-1879048193);
                z5 = true;
                z6 = true;
                f6 = 0.1f;
                tx8Var3 = tx8.a;
            } else {
                dd4Var.Y();
                f5 = f;
                f6 = f2;
                t89Var3 = t89Var;
                ux8Var3 = ux8Var;
                z6 = z2;
                i4 = i6 & (-1879048193);
                z5 = z;
                tx8Var3 = tx8Var;
            }
            dd4Var.r();
            if (z6) {
                dd4Var.f0(1549332586);
                ha6 ha6VarD = pn0.d(bv4.b, false);
                tx8 tx8Var4 = tx8Var3;
                int iHashCode = Long.hashCode(dd4Var.T);
                lr7 lr7VarL = dd4Var.l();
                ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
                ml1.k.getClass();
                um1 um1Var = ll1.b;
                dd4Var.j0();
                boolean z7 = z5;
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
                rj1Var.invoke(dd4Var, 6);
                tx8Var3 = tx8Var4;
                z3 = z7;
                f3 = f5;
                ux8Var4 = ux8Var3;
                t89Var4 = t89Var3;
                e(uu5Var, z3, f3, pj7Var2, f6, j, j3, t89Var4, ux8Var4, tx8Var3, i, dd4Var, (i4 & 14) | 48 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4), 3510);
                dd4Var2 = dd4Var;
                dd4Var2.q(true);
                dd4Var2.q(false);
            } else {
                dd4Var.f0(1549278243);
                rj1Var.invoke(dd4Var, 6);
                dd4Var.q(false);
                dd4Var2 = dd4Var;
                z3 = z5;
                f3 = f5;
                ux8Var4 = ux8Var3;
                t89Var4 = t89Var3;
            }
            f4 = f6;
            t89Var2 = t89Var4;
            ux8Var2 = ux8Var4;
            tx8Var2 = tx8Var3;
            z4 = z6;
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
            z3 = z;
            f3 = f;
            f4 = f2;
            t89Var2 = t89Var;
            ux8Var2 = ux8Var;
            tx8Var2 = tx8Var;
            z4 = z2;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ip5(uu5Var, ou6Var, z3, f3, pj7Var, f4, j, j2, t89Var2, ux8Var2, tx8Var2, i, z4, rj1Var, i2, 2);
        }
    }

    public static final void g(final pj7 pj7Var, final boolean z, final int i, final t89 t89Var, final float f, final long j, final long j2, final tx8 tx8Var, final ux8 ux8Var, final ib4 ib4Var, final boolean z2, final float f2, final ib4 ib4Var2, final ib4 ib4Var3, final boolean z3, final kb4 kb4Var, final kb4 kb4Var2, final kb4 kb4Var3, dd4 dd4Var, final int i2, final int i3) {
        int i4;
        boolean z4;
        int i5;
        int i6;
        boolean z5;
        float f3;
        dd4Var.h0(932687357);
        int i7 = i2 & 6;
        lu6 lu6Var = lu6.a;
        if (i7 == 0) {
            i4 = (dd4Var.f(lu6Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z4 = z;
            i4 |= dd4Var.g(z4) ? 256 : Token.CASE;
        } else {
            z4 = z;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dd4Var.d(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dd4Var.f(t89Var) ? 16384 : 8192;
        }
        int i8 = i2 & 196608;
        int i9 = Parser.ARGC_LIMIT;
        if (i8 == 0) {
            i4 |= dd4Var.c(f) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= dd4Var.e(j) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= dd4Var.e(j2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= dd4Var.d(tx8Var.ordinal()) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 = 805306368;
            i4 |= dd4Var.d(ux8Var.ordinal()) ? 536870912 : 268435456;
        } else {
            i5 = 805306368;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (dd4Var.h((Object) null) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= dd4Var.h(ib4Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            z5 = z2;
            i6 |= dd4Var.g(z5) ? 256 : Token.CASE;
        } else {
            z5 = z2;
        }
        if ((i3 & 3072) == 0) {
            f3 = f2;
            i6 |= dd4Var.c(f3) ? 2048 : 1024;
        } else {
            f3 = f2;
        }
        int i10 = i4;
        if ((i3 & 24576) == 0) {
            i6 |= dd4Var.h(ib4Var2) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            if (dd4Var.h(ib4Var3)) {
                i9 = 131072;
            }
            i6 |= i9;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= dd4Var.g(z3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= dd4Var.h(kb4Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= dd4Var.h(kb4Var2) ? 67108864 : 33554432;
        }
        if ((i3 & i5) == 0) {
            i6 |= dd4Var.h(kb4Var3) ? 536870912 : 268435456;
        }
        if (dd4Var.V(i10 & 1, ((i10 & 306783379) == 306783378 && (i6 & 306783379) == 306783378) ? false : true)) {
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            int i11 = i10 & Token.ASSIGN_MOD;
            boolean z6 = i11 == 32;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z6 || objQ == obj) {
                objQ = new x13(pj7Var.d());
                dd4Var.p0(objQ);
            }
            float f4 = ((x13) objQ).a;
            boolean z7 = i11 == 32;
            Object objQ2 = dd4Var.Q();
            if (z7 || objQ2 == obj) {
                x13 x13Var = new x13(pj7Var.a());
                dd4Var.p0(x13Var);
                objQ2 = x13Var;
            }
            final float f5 = f3;
            final boolean z8 = z4;
            final boolean z9 = z5;
            sdc.e(gjb.p0(ou6VarF, 0.0f, f4, 0.0f, ((x13) objQ2).a, 5), null, jf0.G(672783335, new zb4(pj7Var, z8, z9, j2, j, i, t89Var, f, tx8Var, kb4Var2, f5, ux8Var, ib4Var2, ib4Var3, z3, ib4Var, kb4Var, kb4Var3) { // from class: zu5
                public final /* synthetic */ boolean A;
                public final /* synthetic */ kb4 B;
                public final /* synthetic */ kb4 C;
                public final /* synthetic */ pj7 a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ int f;
                public final /* synthetic */ t89 s;
                public final /* synthetic */ float t;
                public final /* synthetic */ tx8 u;
                public final /* synthetic */ kb4 v;
                public final /* synthetic */ float w;
                public final /* synthetic */ ux8 x;
                public final /* synthetic */ ib4 y;
                public final /* synthetic */ ib4 z;

                {
                    this.B = kb4Var;
                    this.C = kb4Var3;
                }

                @Override // defpackage.zb4
                public final Object c(Object obj2, Object obj3, Object obj4) {
                    ib4 ib4Var4;
                    Object objA;
                    co0 co0Var = (co0) obj2;
                    dd4 dd4Var2 = (dd4) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    co0Var.getClass();
                    int i12 = 2;
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= dd4Var2.f(co0Var) ? 4 : 2;
                    }
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                        final float fH = up1.h(co0Var.b);
                        zm5 zm5Var = (zm5) dd4Var2.j(xm1.n);
                        pj7 pj7Var2 = this.a;
                        boolean zF = dd4Var2.f(pj7Var2) | dd4Var2.d(zm5Var.ordinal());
                        Object objQ3 = dd4Var2.Q();
                        boolean z10 = this.b;
                        Object obj5 = vl1.a;
                        if (zF || objQ3 == obj5) {
                            objQ3 = new x13(z10 ? gjb.V(pj7Var2, zm5Var) : gjb.W(pj7Var2, zm5Var));
                            dd4Var2.p0(objQ3);
                        }
                        float f6 = ((x13) objQ3).a;
                        sx8 sx8Var = z10 ? sx8.b : sx8.a;
                        final boolean z11 = this.c;
                        long j3 = z11 ? this.d : this.e;
                        int i13 = this.f;
                        boolean zD = dd4Var2.d(i13) | dd4Var2.c(f6);
                        t89 t89Var2 = this.s;
                        boolean zF2 = zD | dd4Var2.f(t89Var2);
                        float f7 = this.t;
                        boolean zC = zF2 | dd4Var2.c(f7) | dd4Var2.e(j3) | dd4Var2.d(sx8Var.ordinal());
                        tx8 tx8Var2 = this.u;
                        boolean zD2 = zC | dd4Var2.d(tx8Var2.ordinal());
                        Object objQ4 = dd4Var2.Q();
                        if (zD2 || objQ4 == obj5) {
                            rx8 rx8Var = new rx8(i13, f6, t89Var2, f7, j3, sx8Var, tx8Var2);
                            dd4Var2.p0(rx8Var);
                            objQ4 = rx8Var;
                        }
                        rx8 rx8Var2 = (rx8) objQ4;
                        jt1 jt1Var = null;
                        boolean zF3 = dd4Var2.f((Object) null);
                        Object objQ5 = dd4Var2.Q();
                        if (zF3 || objQ5 == obj5) {
                            dd4Var2.p0((Object) null);
                            objQ5 = null;
                        }
                        yb4 yb4Var = (yb4) objQ5;
                        boolean zG = dd4Var2.g(z11);
                        final kb4 kb4Var4 = this.v;
                        boolean zF4 = zG | dd4Var2.f(kb4Var4);
                        final float f8 = this.w;
                        boolean zC2 = zF4 | dd4Var2.c(f8) | dd4Var2.c(fH);
                        Object objQ6 = dd4Var2.Q();
                        if (zC2 || objQ6 == obj5) {
                            objQ6 = new kb4() { // from class: bv5
                                @Override // defpackage.kb4
                                public final Object invoke(Object obj6) {
                                    float fFloatValue = ((Float) obj6).floatValue();
                                    if (z11) {
                                        kb4Var4.invoke(Float.valueOf((fFloatValue / fH) + f8));
                                    }
                                    return heb.a;
                                }
                            };
                            dd4Var2.p0(objQ6);
                        }
                        k43 k43VarB = h43.b((kb4) objQ6, dd4Var2, 0);
                        ux8 ux8Var2 = this.x;
                        boolean zD3 = dd4Var2.d(ux8Var2.ordinal()) | dd4Var2.c(fH) | dd4Var2.f(k43VarB);
                        Object objQ7 = dd4Var2.Q();
                        ib4 ib4Var5 = this.y;
                        ib4 ib4Var6 = this.z;
                        if (zD3 || objQ7 == obj5) {
                            boolean z12 = ux8Var2 != ux8.b;
                            ib4Var4 = ib4Var6;
                            kb4 kb4Var5 = this.B;
                            kb4 kb4Var6 = this.C;
                            objA = h43.a(lu6.a, k43VarB, lh7.a, z12, (yy6) null, true, new cv5(fH, ux8Var2, ib4Var4, ib4Var5, kb4Var5, kb4Var4, kb4Var6, null), new tp5(i12, jt1Var, kb4Var6), false, Token.WITH);
                            dd4Var2.p0(objA);
                        } else {
                            objA = objQ7;
                            ib4Var4 = ib4Var6;
                        }
                        oh9.f(ib4Var5, ib4Var4, this.A, rx8Var2, (ou6) objA, yb4Var, dd4Var2, 0);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, 3072, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: av5
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(i2 | 1);
                    int iX02 = qu1.x0(i3);
                    vw1.g(pj7Var, z, i, t89Var, f, j, j2, tx8Var, ux8Var, ib4Var, z2, f2, ib4Var2, ib4Var3, z3, kb4Var, kb4Var2, kb4Var3, (dd4) obj2, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    public static final void h(p35 p35Var, String str, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i) {
        p35 p35Var2;
        int i2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1976535449);
        if ((i & 6) == 0) {
            p35Var2 = p35Var;
            i2 = (dd4Var2.f(p35Var2) ? 4 : 2) | i;
        } else {
            p35Var2 = p35Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var2.h(ib4Var) ? 2048 : 1024;
        }
        if (dd4Var2.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 7168) == 2048;
            Object objQ = dd4Var2.Q();
            if (z || objQ == vl1.a) {
                objQ = new i35(24, ib4Var);
                dd4Var2.p0(objQ);
            }
            lu6 lu6Var = lu6.a;
            ou6 ou6VarE = fw.J(null, (ib4) objQ, lu6Var, false, 15).e(ou6Var);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarE);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, eq8VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            int i3 = i2;
            mx4.a(p35Var2, (String) null, gjb.l0(tg9.n(lu6Var, 32.0f), 4.0f), 0L, dd4Var2, (i2 & 14) | 432, 8);
            un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
            ou6 ou6VarF = xv5.f(1.0f, tg9.f(lu6Var, 1.0f), true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarF);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            nha.c(str, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.h, dd4Var, (i3 >> 3) & 14, 24960, 110590);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ln3(p35Var, str, ou6Var, ib4Var, i, 1);
        }
    }

    public static final void i(boolean z, String str, String str2, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i, int i2) {
        String str3;
        int i3;
        String str4;
        str.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var.h0(-2006698228);
        int i4 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(str) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i4 | (dd4Var.f(str3) ? 256 : Token.CASE);
        }
        int i6 = (dd4Var.h(kb4Var2) ? 16384 : 8192) | i3 | (dd4Var.h(kb4Var) ? 2048 : 1024);
        int i7 = 0;
        if (dd4Var.V(i6 & 1, (i6 & 9363) != 9362)) {
            if (i5 != 0) {
                str3 = "";
            }
            boolean z2 = (i6 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                int length = str3.length();
                objQ = dk9.x(new wga(str3, zk9.h(length, length), 4));
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            String str5 = str3;
            z8.d(z, kb4Var, jf0.G(1692945208, new li6(0, kb4Var2, kb4Var, a07Var, str3), dd4Var), null, yib.E(lu6.a, 14), jf0.G(513948373, new mi6(i7, kb4Var, a07Var, str5), dd4Var), jf0.G(120949428, new z31(str, 10), dd4Var), null, 0L, 0L, 0.0f, false, false, jf0.G(1749204960, new kq2(a07Var, 6), dd4Var), dd4Var, (i6 & 14) | 1769856 | ((i6 >> 6) & Token.ASSIGN_MOD), 8072);
            str4 = str5;
        } else {
            dd4Var.Y();
            str4 = str3;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ni6(z, str, str4, kb4Var, kb4Var2, i, i2);
        }
    }

    public static final void j(boolean z, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, dd4 dd4Var, int i) {
        dd4 dd4Var2;
        kb4Var.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        ib4Var3.getClass();
        dd4Var.h0(-1034099994);
        int i2 = i | (dd4Var.g(z) ? 4 : 2);
        if (!dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        } else if (xzb.a(dd4Var)) {
            dd4Var.f0(927726231);
            fw.q(z, kb4Var, null, false, null, null, 0L, 0L, 0.0f, 0L, null, jf0.G(1021498205, new sp2(ib4Var, ib4Var2, ib4Var3, 3), dd4Var), dd4Var, i2 & Token.ELSE, 48, 2044);
            dd4Var2 = dd4Var;
            dd4Var2.q(false);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.f0(928180009);
            z8.d(z, kb4Var, null, null, null, null, null, null, 0L, 0L, 0.0f, false, false, jf0.G(1311506270, new nl6(ib4Var, ib4Var2, ib4Var3, 0), dd4Var2), dd4Var2, i2 & Token.ELSE, 8188);
            dd4Var2.q(false);
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ol6(z, kb4Var, ib4Var, ib4Var2, ib4Var3, i, 0);
        }
    }

    public static final void k(final boolean z, final boolean z2, final boolean z3, final float f, final List list, ou6 ou6Var, final kb4 kb4Var, final kb4 kb4Var2, final kb4 kb4Var3, final ib4 ib4Var, dd4 dd4Var, final int i) {
        final ou6 ou6Var2;
        list.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        kb4Var3.getClass();
        ib4Var.getClass();
        dd4Var.h0(1134485005);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.g(z2) ? 32 : 16) | (dd4Var.g(z3) ? 256 : Token.CASE) | (dd4Var.c(f) ? 2048 : 1024) | (dd4Var.h(list) ? 16384 : 8192) | 196608 | (dd4Var.h(kb4Var2) ? 8388608 : 4194304) | (dd4Var.h(kb4Var3) ? 67108864 : 33554432) | (dd4Var.h(ib4Var) ? 536870912 : 268435456);
        if (dd4Var.V(i2 & 1, (306783379 & i2) != 306783378)) {
            if (z2) {
                dd4Var.f0(345541863);
                int i3 = i2 & 14;
                int i4 = i2 >> 3;
                m(z, z3, f, list, kb4Var, kb4Var2, kb4Var3, ib4Var, dd4Var, (i4 & 896) | i3 | (i4 & Token.ASSIGN_MOD) | (i4 & 7168) | 221184 | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024));
                dd4Var.q(false);
            } else {
                dd4Var.f0(346038018);
                int i5 = i2 & 14;
                int i6 = i2 >> 3;
                l(z, z3, f, list, kb4Var, kb4Var2, kb4Var3, ib4Var, dd4Var, i5 | (i6 & Token.ASSIGN_MOD) | (i6 & 896) | (i6 & 7168) | 221184 | (i6 & 3670016) | (i6 & 29360128) | (i6 & 234881024));
                dd4Var.q(false);
            }
            ou6Var2 = lu6.a;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(z, z2, z3, f, list, ou6Var2, kb4Var, kb4Var2, kb4Var3, ib4Var, i) { // from class: wr6
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ float d;
                public final /* synthetic */ List e;
                public final /* synthetic */ ou6 f;
                public final /* synthetic */ kb4 s;
                public final /* synthetic */ kb4 t;
                public final /* synthetic */ kb4 u;
                public final /* synthetic */ ib4 v;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(1572865);
                    vw1.k(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void l(boolean z, boolean z2, float f, List list, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, ib4 ib4Var, dd4 dd4Var, int i) {
        boolean z3;
        int i2;
        int i3;
        dd4Var.h0(-274720791);
        if ((i & 6) == 0) {
            z3 = z;
            i2 = (dd4Var.g(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.c(f) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.h(list) ? 2048 : 1024;
        }
        int i4 = i & 24576;
        int i5 = i2;
        lu6 lu6Var = lu6.a;
        if (i4 == 0) {
            i3 = (dd4Var.f(lu6Var) ? 16384 : 8192) | i5;
        } else {
            i3 = i5;
        }
        if ((196608 & i) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= dd4Var.h(kb4Var3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 67108864 : 33554432;
        }
        if (dd4Var.V(i3 & 1, (38347923 & i3) != 38347922)) {
            fw.q(z3, kb4Var, lu6Var, true, null, null, 0L, 0L, 0.0f, 0L, null, jf0.G(332343109, new j50(z2, f, list, kb4Var2, kb4Var3, ib4Var), dd4Var), dd4Var, (i3 & 14) | 3072 | ((i3 >> 12) & Token.ASSIGN_MOD) | ((i3 >> 6) & 896), 48, 2032);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yr6(z, z2, f, list, kb4Var, kb4Var2, kb4Var3, ib4Var, i, 1);
        }
    }

    public static final void m(boolean z, final boolean z2, final float f, final List list, kb4 kb4Var, final kb4 kb4Var2, final kb4 kb4Var3, final ib4 ib4Var, dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(-1037749607);
        if ((i & 6) == 0) {
            i2 = (dd4Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.c(f) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.h(list) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        lu6 lu6Var = lu6.a;
        if (i3 == 0) {
            i2 |= dd4Var.f(lu6Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= dd4Var.h(kb4Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= dd4Var.h(kb4Var3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= dd4Var.h(ib4Var) ? 67108864 : 33554432;
        }
        byte b = 0;
        if (dd4Var.V(i2 & 1, (38347923 & i2) != 38347922)) {
            z8.d(z, kb4Var, null, lu6Var, null, jf0.G(913558448, new gs6(kb4Var, 22, b), dd4Var), md2.w, null, 0L, 0L, 0.0f, false, false, jf0.G(1983252293, new yb4() { // from class: xr6
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    dd4 dd4Var2 = (dd4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                        vw1.q(z2, f, list, tg9.f(lu6.a, 1.0f), kb4Var2, kb4Var3, ib4Var, dd4Var2, 3072);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, (i2 & 14) | 1769472 | ((i2 >> 12) & Token.ASSIGN_MOD) | ((i2 >> 3) & 7168), 8084);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yr6(z, z2, f, list, kb4Var, kb4Var2, kb4Var3, ib4Var, i, 0);
        }
    }

    public static final void n(kqb kqbVar, ou6 ou6Var, dd4 dd4Var, int i) {
        int i2;
        kqbVar.getClass();
        dd4Var.h0(-846374003);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(kqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        int i3 = 0;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            mi9.c(kqbVar, ou6Var, dd4Var, i2 & Token.ELSE);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new p27(kqbVar, ou6Var, i, i3);
        }
    }

    public static final void o(long j, uka ukaVar, yb4 yb4Var, dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(-684938728);
        if ((i & 6) == 0) {
            i2 = (dd4Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(ukaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(yb4Var) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            fn1 fn1Var = nha.a;
            jv3.f(new p58[]{oq1.a.a(new lc1(j)), fn1Var.a(((uka) dd4Var.j(fn1Var)).d(ukaVar))}, yb4Var, dd4Var, ((i2 >> 3) & Token.ASSIGN_MOD) | 8);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o58(j, ukaVar, yb4Var, i, 0);
        }
    }

    public static p p(float f, float f2, float f3, float f4) {
        return new p(f, 100, f2, 100, f3, 100, f4, 100);
    }

    public static final void q(final boolean z, final float f, final List list, final ou6 ou6Var, final kb4 kb4Var, final kb4 kb4Var2, final ib4 ib4Var, dd4 dd4Var, final int i) {
        float f2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-444469287);
        int i2 = (dd4Var2.g(z) ? 4 : 2) | i | (dd4Var2.c(f) ? 32 : 16) | (dd4Var2.h(list) ? 256 : Token.CASE);
        if ((i & 3072) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 2048 : 1024;
        }
        int i3 = i2 | (dd4Var2.h(kb4Var) ? 16384 : 8192) | (dd4Var2.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(ib4Var) ? 1048576 : 524288);
        if (dd4Var2.V(i3 & 1, (599187 & i3) != 599186)) {
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
            ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 8.0f, 1);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarN0);
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
            String strK = wn9.K((pv9) ev9.o.getValue(), dd4Var2);
            ur9 ur9Var = s96.a;
            nha.c(strK, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.h, dd4Var2, 0, 24960, 110588);
            int i4 = i3 >> 3;
            dd4 dd4Var3 = dd4Var;
            zk9.g(z, false, null, kb4Var, dd4Var3, (i3 & 14) | (i4 & 7168));
            xv5.z(dd4Var3, true, lu6Var, 32.0f, dd4Var3);
            if (list.isEmpty()) {
                dd4Var3.f0(-2118656065);
                String strK2 = wn9.K((pv9) ev9.q.getValue(), dd4Var3);
                uka ukaVar = ((q96) dd4Var3.j(ur9Var)).b.j;
                long j = ((q96) dd4Var3.j(ur9Var)).a.q;
                f2 = 0.0f;
                nha.c(strK2, gjb.n0(lu6Var, 24.0f, 0.0f, 2).e(new xo4(bv4.A)), j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var3, 0, 0, 131064);
                dd4Var3.q(false);
            } else {
                f2 = 0.0f;
                dd4Var3.f0(-2118287041);
                String strK3 = wn9.K((pv9) ev9.s.getValue(), dd4Var3);
                boolean z2 = (i3 & 458752) == 131072;
                Object objQ = dd4Var3.Q();
                if (z2 || objQ == vl1.a) {
                    objQ = new ir6(8, kb4Var2);
                    dd4Var3.p0(objQ);
                }
                bx1.t(f, 0.0f, 1.0f, strK3, z, (ou6) null, kb4Var2, (ib4) objQ, dd4Var3, (i4 & 14) | 432 | ((i3 << 12) & 57344) | (3670016 & (i3 << 3)), 32);
                dd4Var3 = dd4Var3;
                dd4Var3.q(false);
            }
            dd4 dd4Var4 = dd4Var3;
            kc5.n(i25.c((m53) f53.A.getValue(), dd4Var3, 0), wn9.K((pv9) ev9.r.getValue(), dd4Var3), false, null, gjb.n0(new xo4(bv4.B), f2, 12.0f, 1), null, null, null, ib4Var, dd4Var4, (i3 << 6) & 234881024, 236);
            dd4Var2 = dd4Var4;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: zr6
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vw1.q(z, f, list, ou6Var, kb4Var, kb4Var2, ib4Var, (dd4) obj, qu1.x0(i | 1));
                    return heb.a;
                }
            };
        }
    }

    public static Object r(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final void s(g07 g07Var, nu6 nu6Var) {
        g07 g07VarA = S(nu6Var).A();
        int i = g07VarA.c - 1;
        Object[] objArr = g07VarA.a;
        if (i < objArr.length) {
            while (i >= 0) {
                g07Var.b((nu6) ((sn5) objArr[i]).S.g);
                i--;
            }
        }
    }

    public static final nu6 t(g07 g07Var) {
        int i;
        if (g07Var == null || (i = g07Var.c) == 0) {
            return null;
        }
        return (nu6) g07Var.k(i - 1);
    }

    public static final double u(double d) {
        return (d / 180.0d) * 3.141592653589793d;
    }

    public static final in5 v(nu6 nu6Var) {
        if ((nu6Var.c & 2) != 0) {
            if (nu6Var instanceof in5) {
                return (in5) nu6Var;
            }
            if (nu6Var instanceof qm2) {
                nu6 nu6Var2 = ((qm2) nu6Var).B;
                while (nu6Var2 != null) {
                    if (nu6Var2 instanceof in5) {
                        return (in5) nu6Var2;
                    }
                    nu6Var2 = (!(nu6Var2 instanceof qm2) || (nu6Var2.c & 2) == 0) ? nu6Var2.f : ((qm2) nu6Var2).B;
                }
            }
        }
        return null;
    }

    public static final float[] w(m45 m45Var, long j) {
        m45Var.getClass();
        long j2 = m45Var.c;
        long j3 = m45Var.b;
        int i = m45Var.a;
        if (i == 0) {
            if (eb7.c(j3, (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L))) {
                return v96.a;
            }
        }
        float[] fArrA = u96.a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * ((int) (j >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * ((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        int i2 = (int) (jFloatToRawIntBits >> 32);
        int i3 = (int) (jFloatToRawIntBits & 4294967295L);
        u96.k(fArrA, Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        u96.g(i, fArrA);
        u96.h(fArrA, Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
        u96.k(fArrA, -Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
        return fArrA;
    }

    public static final void x(View view) {
        view.getClass();
        b39 b39VarY = ex1.Y(new yf(view, (jt1) null, 2));
        while (b39VarY.hasNext()) {
            ArrayList arrayList = D((View) b39VarY.next()).a;
            for (int iS = gc1.S(arrayList); -1 < iS; iS--) {
                ((ctb) arrayList.get(iS)).a.e();
            }
        }
    }

    public static final kf8 y(nu6 nu6Var, boolean z, boolean z2) {
        if (!nu6Var.a.z) {
            return kf8.e;
        }
        if (z) {
            return P(nu6Var, 8).B1();
        }
        x67 x67VarP = P(nu6Var, 8);
        return e11.K(x67VarP).O(x67VarP, z2);
    }

    public static final boolean z(long j, long j2) {
        return j == j2;
    }
}
