package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.io.EOFException;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class t1c implements xc3 {
    public static final rj1 g;
    public static final rj1 i;
    public static final rj1 j;
    public static final rj1 k;
    public static final rj1 l;
    public static final rj1 o;
    public static final rj1 t;
    public static final rj1 u;
    public static final rj1 v;
    public static final rj1 w;
    public static final float[] a = new float[91];
    public static final Object[] b = new Object[0];
    public static final rj1 c = new rj1(new k7(26), false, -1109857292);
    public static final rj1 d = new rj1(new k7(27), false, 55829149);
    public static final rj1 e = new rj1(new k7(28), false, -981287428);
    public static final rj1 f = new rj1(new k7(29), false, 694984451);
    public static final rj1 h = new rj1(new uj1(20), false, -1610309117);
    public static final rj1 m = new rj1(new hk1(8), false, -399194850);
    public static final rj1 n = new rj1(new hk1(9), false, -1573789343);
    public static final rj1 p = new rj1(new ik1(4), false, 1356546105);
    public static final rj1 q = new rj1(new jk1(14), false, 146661766);
    public static final rj1 r = new rj1(new lk1(17), false, 280183671);
    public static final rj1 s = new rj1(new lk1(18), false, 1775961219);
    public static final char[] x = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] y = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final ef5 z = new ef5(2);
    public static final o99 A = new o99(1);
    public static final cu3 B = new cu3("account_capability_api", 1);
    public static final cu3 C = new cu3("google_auth_service_accounts", 2);
    public static final cu3 D = new cu3("google_auth_service_token", 3);
    public static final cu3 E = new cu3("work_account_client_is_whitelisted", 1);

    static {
        int i2 = 0;
        g = new rj1(new ak1(i2), false, -2036150420);
        int i3 = 1;
        i = new rj1(new ak1(i3), false, 1223717120);
        int i4 = 3;
        j = new rj1(new vj1(i4), false, 1334982502);
        int i5 = 2;
        k = new rj1(new dk1(i5), false, 2132747503);
        l = new rj1(new dk1(i4), false, 1897473965);
        o = new rj1(new ik1(i4), false, -767350555);
        t = new rj1(new qk1(i2), false, 948471118);
        u = new rj1(new qk1(i3), false, 1644249723);
        v = new rj1(new qk1(i5), false, -162181404);
        w = new rj1(new qk1(i4), false, 1132237443);
    }

    public static final void A(boolean z2, xga xgaVar, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, ib4 ib4Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(-1410106633);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(xgaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(kb4Var3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var4) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 1048576 : 524288;
        }
        if (dd4Var.V(i3 & 1, (599187 & i3) != 599186)) {
            sdc.e(tg9.c, null, jf0.G(-236633523, new fh1(z2, kb4Var, xgaVar, kb4Var2, kb4Var3, kb4Var4, ib4Var, 4), dd4Var), dd4Var, 3078, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tq6(z2, xgaVar, kb4Var, kb4Var2, kb4Var3, kb4Var4, ib4Var, i2, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [int] */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v74 */
    public static final void B(int i2, final long j2, final sia siaVar, final jka jkaVar, final aoa aoaVar, final zja zjaVar, final kba kbaVar, final ou6 ou6Var, dd4 dd4Var, final int i3) {
        int i4;
        ou6 ou6Var2;
        int i5;
        jm jmVar;
        Object obj;
        int i6;
        sia siaVar2;
        int i7;
        ib4 ib4Var;
        f9 f9Var;
        int i8;
        int i9;
        int i10;
        int i11;
        final sia siaVar3;
        jka jkaVar2;
        Object ocVar;
        kba kbaVar2;
        boolean z2;
        fu6 fu6Var;
        int i12;
        ou6 ou6Var3;
        float f2;
        boolean z3;
        boolean z4;
        ?? r13;
        boolean z5;
        int i13;
        int i14;
        fu6 fu6Var2;
        int i15;
        ou6 ou6Var4;
        float f3;
        tia tiaVar;
        List list;
        int i16;
        int i17;
        fu6 fu6Var3;
        int i18;
        ou6 ou6Var5;
        float f4;
        boolean z6;
        long j3;
        Object obj2;
        int i19;
        int i20;
        a07 a07Var;
        Object obj3;
        pn2 pn2Var;
        ?? r3;
        Object obj4;
        f9 f9Var2 = bv4.b;
        siaVar.getClass();
        List list2 = siaVar.d;
        float f5 = siaVar.c;
        aoaVar.getClass();
        zjaVar.getClass();
        kbaVar.getClass();
        dd4Var.h0(1145419710);
        if ((i3 & 6) == 0) {
            i4 = (dd4Var.d(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= dd4Var.e(j2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= dd4Var.h(siaVar) ? 256 : Token.CASE;
        }
        if ((i3 & 3072) == 0) {
            i4 |= dd4Var.f(jkaVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= dd4Var.f(aoaVar) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= dd4Var.f(zjaVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i3 & 1572864) == 0) {
            i4 |= dd4Var.f(kbaVar) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            ou6Var2 = ou6Var;
            i4 |= dd4Var.f(ou6Var2) ? 8388608 : 4194304;
        } else {
            ou6Var2 = ou6Var;
        }
        if (dd4Var.V(i4 & 1, (i4 & 4793491) != 4793490)) {
            ou6 ou6VarU = tg9.u(ou6Var2);
            ha6 ha6VarD = pn0.d(f9Var2, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarU);
            ml1.k.getClass();
            ib4 ib4Var2 = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var2);
            } else {
                dd4Var.s0();
            }
            jm jmVar2 = ll1.f;
            List list3 = list2;
            un9.s(jmVar2, dd4Var, ha6VarD);
            jm jmVar3 = ll1.e;
            un9.s(jmVar3, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar4 = ll1.g;
            un9.s(jmVar4, dd4Var, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var, kdVar);
            jm jmVar5 = ll1.d;
            un9.s(jmVar5, dd4Var, ou6VarL0);
            int i21 = i4 & 14;
            boolean z7 = i21 == 4;
            Object objQ = dd4Var.Q();
            fu6 fu6Var4 = vl1.a;
            if (z7 || objQ == fu6Var4) {
                jmVar = jmVar4;
                fo2 fo2VarN = dk9.n(new wj7(jkaVar, i2, 0));
                dd4Var.p0(fo2VarN);
                obj = fo2VarN;
            } else {
                jmVar = jmVar4;
                obj = objQ;
            }
            br9 br9Var = (br9) obj;
            boolean zBooleanValue = ((Boolean) br9Var.getValue()).booleanValue();
            ou6 ou6Var6 = lu6.a;
            if (zBooleanValue) {
                dd4Var.f0(-73966672);
                long j4 = ((cka) dd4Var.j(dka.a)).b;
                ib4Var = ib4Var2;
                ou6 ou6VarX = t96.x(tg9.h(tg9.f(ou6Var6, 1.0f), ((pn2) dd4Var.j(xm1.h)).b0(f5)));
                i6 = i4;
                boolean zH = ((i4 & 7168) == 2048) | dd4Var.h(siaVar) | (i21 == 4) | dd4Var.e(j4);
                Object objQ2 = dd4Var.Q();
                if (zH || objQ2 == fu6Var4) {
                    f9Var = f9Var2;
                    i8 = 16384;
                    i9 = 4;
                    i10 = i21;
                    w92 w92Var = new w92(siaVar, i2, jkaVar, j4);
                    siaVar2 = siaVar;
                    i7 = i2;
                    dd4Var.p0(w92Var);
                    objQ2 = w92Var;
                } else {
                    i7 = i2;
                    siaVar2 = siaVar;
                    f9Var = f9Var2;
                    i8 = 16384;
                    i9 = 4;
                    i10 = i21;
                }
                s32.F(ou6VarX, (kb4) objQ2, dd4Var, 0);
                dd4Var.q(false);
            } else {
                i6 = i4;
                siaVar2 = siaVar;
                i7 = i2;
                ib4Var = ib4Var2;
                f9Var = f9Var2;
                i8 = 16384;
                i9 = 4;
                i10 = i21;
                dd4Var.f0(-72384866);
                dd4Var.q(false);
            }
            int i22 = i6 & 57344;
            boolean zF = dd4Var.f(siaVar2) | (i10 == i9) | (i22 == i8);
            Object objQ3 = dd4Var.Q();
            Object obj5 = objQ3;
            if (zF || objQ3 == fu6Var4) {
                fo2 fo2VarN2 = dk9.n(new wj7(aoaVar, i7, 1));
                dd4Var.p0(fo2VarN2);
                obj5 = fo2VarN2;
            }
            if (((Boolean) ((br9) obj5).getValue()).booleanValue()) {
                dd4Var.f0(-72089188);
                long j5 = ((cka) dd4Var.j(dka.a)).b;
                ou6 ou6VarX2 = t96.x(tg9.h(tg9.f(ou6Var6, 1.0f), ((pn2) dd4Var.j(xm1.h)).b0(f5)));
                boolean zH2 = dd4Var.h(siaVar2) | (i22 == i8) | dd4Var.e(j5);
                Object objQ4 = dd4Var.Q();
                if (zH2 || objQ4 == fu6Var4) {
                    i11 = i7;
                    siaVar3 = siaVar;
                    mu0 mu0Var = new mu0(siaVar3, aoaVar, j5, 1);
                    dd4Var.p0(mu0Var);
                    objQ4 = mu0Var;
                } else {
                    i11 = i7;
                    siaVar3 = siaVar2;
                }
                s32.F(ou6VarX2, (kb4) objQ4, dd4Var, 0);
                dd4Var.q(false);
            } else {
                i11 = i7;
                siaVar3 = siaVar2;
                dd4Var.f0(-70949442);
                dd4Var.q(false);
            }
            int i23 = i6 & 458752;
            boolean zF2 = dd4Var.f(siaVar3) | (i10 == i9) | (i23 == 131072);
            Object objQ5 = dd4Var.Q();
            Object obj6 = objQ5;
            if (zF2 || objQ5 == fu6Var4) {
                fo2 fo2VarN3 = dk9.n(new lj(i11, zjaVar, siaVar3, 6));
                dd4Var.p0(fo2VarN3);
                obj6 = fo2VarN3;
            }
            if (((Boolean) ((br9) obj6).getValue()).booleanValue()) {
                dd4Var.f0(-70531035);
                long j6 = ((cka) dd4Var.j(dka.a)).b;
                ur9 ur9Var = xm1.h;
                pn2 pn2Var2 = (pn2) dd4Var.j(ur9Var);
                float fK0 = pn2Var2.k0(pn2Var2.Y(30));
                Object objQ6 = dd4Var.Q();
                Object obj7 = objQ6;
                if (objQ6 == fu6Var4) {
                    ym ymVarA = lc5.a(fK0, 0.01f);
                    dd4Var.p0(ymVarA);
                    obj7 = ymVarA;
                }
                ym ymVar = (ym) obj7;
                boolean zH3 = dd4Var.h(ymVar) | dd4Var.c(fK0);
                Object objQ7 = dd4Var.Q();
                Object obj8 = objQ7;
                if (zH3 || objQ7 == fu6Var4) {
                    yf6 yf6Var = new yf6(ymVar, fK0, null, 1);
                    dd4Var.p0(yf6Var);
                    obj8 = yf6Var;
                }
                lc5.u((yb4) obj8, dd4Var, zjaVar);
                ou6 ou6VarX3 = t96.x(tg9.h(tg9.f(ou6Var6, 1.0f), ((pn2) dd4Var.j(ur9Var)).b0(f5)));
                boolean zH4 = dd4Var.h(siaVar3) | (i23 == 131072) | dd4Var.h(ymVar) | dd4Var.e(j6);
                Object objQ8 = dd4Var.Q();
                if (zH4 || objQ8 == fu6Var4) {
                    jkaVar2 = jkaVar;
                    tm0 tm0Var = new tm0(siaVar3, zjaVar, ymVar, j6, 4);
                    dd4Var.p0(tm0Var);
                    objQ8 = tm0Var;
                } else {
                    jkaVar2 = jkaVar;
                }
                s32.F(ou6VarX3, (kb4) objQ8, dd4Var, 0);
                dd4Var.q(false);
            } else {
                jkaVar2 = jkaVar;
                dd4Var.f0(-68784898);
                dd4Var.q(false);
            }
            Object objQ9 = dd4Var.Q();
            lc3 lc3Var = lc3.a;
            Object obj9 = objQ9;
            if (objQ9 == fu6Var4) {
                cn7 cn7VarX = dk9.x(lc3Var);
                dd4Var.p0(cn7VarX);
                obj9 = cn7VarX;
            }
            final a07 a07Var2 = (a07) obj9;
            Object objQ10 = dd4Var.Q();
            Object obj10 = objQ10;
            if (objQ10 == fu6Var4) {
                cn7 cn7VarX2 = dk9.x(lc3Var);
                dd4Var.p0(cn7VarX2);
                obj10 = cn7VarX2;
            }
            a07 a07Var3 = (a07) obj10;
            boolean zH5 = ((i6 & 3670016) == 1048576) | (i10 == 4) | dd4Var.h(siaVar3);
            Object objQ11 = dd4Var.Q();
            if (zH5 || objQ11 == fu6Var4) {
                sia siaVar4 = siaVar3;
                ocVar = new oc(kbaVar, i2, siaVar4, a07Var2, a07Var3, (jt1) null);
                i5 = i2;
                kbaVar2 = kbaVar;
                siaVar3 = siaVar4;
                dd4Var.p0(ocVar);
            } else {
                i5 = i2;
                ocVar = objQ11;
                kbaVar2 = kbaVar;
            }
            lc5.v(kbaVar2, siaVar3, (yb4) ocVar, dd4Var);
            if (((List) a07Var2.getValue()).isEmpty()) {
                dd4Var.f0(-66296962);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-67615454);
                ou6 ou6VarX4 = t96.x(tg9.h(tg9.f(ou6Var6, 1.0f), ((pn2) dd4Var.j(xm1.h)).b0(f5)));
                boolean zH6 = dd4Var.h(siaVar3);
                Object objQ12 = dd4Var.Q();
                if (zH6 || objQ12 == fu6Var4) {
                    r3 = 0;
                    final boolean z8 = false ? 1 : 0;
                    kb4 kb4Var = new kb4() { // from class: bk7
                        @Override // defpackage.kb4
                        public final Object invoke(Object obj11) {
                            List list4;
                            int i24;
                            int i25;
                            int i26;
                            int i27;
                            int iMax;
                            int iMin;
                            List list5;
                            r43 r43Var;
                            int i28 = z8;
                            heb hebVar = heb.a;
                            a07 a07Var4 = a07Var2;
                            sia siaVar5 = siaVar3;
                            switch (i28) {
                                case 0:
                                    r43 r43Var2 = (r43) obj11;
                                    r43Var2.getClass();
                                    List list6 = siaVar5.d;
                                    int size = list6.size();
                                    for (int i29 = 0; i29 < size; i29++) {
                                        tia tiaVar2 = (tia) list6.get(i29);
                                        jk jkVar = tiaVar2.h;
                                        int i30 = tiaVar2.e;
                                        int i31 = tiaVar2.d;
                                        if (jkVar != null) {
                                            List list7 = (List) a07Var4.getValue();
                                            int size2 = list7.size();
                                            int i32 = 0;
                                            while (i32 < size2) {
                                                gba gbaVar = (gba) list7.get(i32);
                                                if (!ri9.D(gbaVar, i31, i30) || (iMax = Math.max(gbaVar.i, i31)) > (iMin = Math.min(gbaVar.j, i30 - 1))) {
                                                    list4 = list7;
                                                    i24 = i30;
                                                    i25 = i31;
                                                    i26 = size2;
                                                    i27 = i32;
                                                } else {
                                                    int i33 = tiaVar2.b;
                                                    int i34 = iMin - i33;
                                                    i27 = i32;
                                                    i24 = i30;
                                                    list4 = list7;
                                                    i26 = size2;
                                                    i25 = i31;
                                                    t1c.U(r43Var2, iMax - i33, i34, tiaVar2.a, 0.0f, kf0.H(gbaVar.g), tiaVar2.h);
                                                }
                                                i32 = i27 + 1;
                                                i30 = i24;
                                                i31 = i25;
                                                list7 = list4;
                                                size2 = i26;
                                            }
                                        }
                                    }
                                    return hebVar;
                                default:
                                    r43 r43Var3 = (r43) obj11;
                                    r43Var3.getClass();
                                    List list8 = siaVar5.d;
                                    int size3 = list8.size();
                                    int i35 = 0;
                                    while (i35 < size3) {
                                        tia tiaVar3 = (tia) list8.get(i35);
                                        jk jkVar2 = tiaVar3.h;
                                        if (jkVar2 != null) {
                                            long j7 = tiaVar3.a;
                                            long j8 = ((lc1) a07Var4.getValue()).a;
                                            y91 y91VarP0 = r43Var3.p0();
                                            long jG = y91VarP0.G();
                                            y91VarP0.x().i();
                                            try {
                                                list5 = list8;
                                                r43Var = r43Var3;
                                                ((lp8) y91VarP0.b).D(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
                                                jkVar2.e(r43Var.p0().x(), j8);
                                            } finally {
                                                j39.s(y91VarP0, jG);
                                            }
                                        } else {
                                            list5 = list8;
                                            r43Var = r43Var3;
                                        }
                                        i35++;
                                        r43Var3 = r43Var;
                                        list8 = list5;
                                    }
                                    return hebVar;
                            }
                        }
                    };
                    dd4Var.p0(kb4Var);
                    obj4 = kb4Var;
                } else {
                    r3 = 0;
                    obj4 = objQ12;
                }
                s32.F(ou6VarX4, (kb4) obj4, dd4Var, r3);
                dd4Var.q((boolean) r3);
            }
            final a07 a07VarA = dk9.A(new lc1(j2), dd4Var);
            ou6 ou6VarF = tg9.f(ou6Var6, 1.0f);
            ur9 ur9Var2 = xm1.h;
            ou6 ou6VarX5 = t96.x(tg9.h(ou6VarF, ((pn2) dd4Var.j(ur9Var2)).b0(f5)));
            boolean zH7 = dd4Var.h(siaVar3) | dd4Var.f(a07VarA);
            Object objQ13 = dd4Var.Q();
            Object obj11 = objQ13;
            if (zH7 || objQ13 == fu6Var4) {
                final int i24 = 1;
                kb4 kb4Var2 = new kb4() { // from class: bk7
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj112) {
                        List list4;
                        int i242;
                        int i25;
                        int i26;
                        int i27;
                        int iMax;
                        int iMin;
                        List list5;
                        r43 r43Var;
                        int i28 = i24;
                        heb hebVar = heb.a;
                        a07 a07Var4 = a07VarA;
                        sia siaVar5 = siaVar3;
                        switch (i28) {
                            case 0:
                                r43 r43Var2 = (r43) obj112;
                                r43Var2.getClass();
                                List list6 = siaVar5.d;
                                int size = list6.size();
                                for (int i29 = 0; i29 < size; i29++) {
                                    tia tiaVar2 = (tia) list6.get(i29);
                                    jk jkVar = tiaVar2.h;
                                    int i30 = tiaVar2.e;
                                    int i31 = tiaVar2.d;
                                    if (jkVar != null) {
                                        List list7 = (List) a07Var4.getValue();
                                        int size2 = list7.size();
                                        int i32 = 0;
                                        while (i32 < size2) {
                                            gba gbaVar = (gba) list7.get(i32);
                                            if (!ri9.D(gbaVar, i31, i30) || (iMax = Math.max(gbaVar.i, i31)) > (iMin = Math.min(gbaVar.j, i30 - 1))) {
                                                list4 = list7;
                                                i242 = i30;
                                                i25 = i31;
                                                i26 = size2;
                                                i27 = i32;
                                            } else {
                                                int i33 = tiaVar2.b;
                                                int i34 = iMin - i33;
                                                i27 = i32;
                                                i242 = i30;
                                                list4 = list7;
                                                i26 = size2;
                                                i25 = i31;
                                                t1c.U(r43Var2, iMax - i33, i34, tiaVar2.a, 0.0f, kf0.H(gbaVar.g), tiaVar2.h);
                                            }
                                            i32 = i27 + 1;
                                            i30 = i242;
                                            i31 = i25;
                                            list7 = list4;
                                            size2 = i26;
                                        }
                                    }
                                }
                                return hebVar;
                            default:
                                r43 r43Var3 = (r43) obj112;
                                r43Var3.getClass();
                                List list8 = siaVar5.d;
                                int size3 = list8.size();
                                int i35 = 0;
                                while (i35 < size3) {
                                    tia tiaVar3 = (tia) list8.get(i35);
                                    jk jkVar2 = tiaVar3.h;
                                    if (jkVar2 != null) {
                                        long j7 = tiaVar3.a;
                                        long j8 = ((lc1) a07Var4.getValue()).a;
                                        y91 y91VarP0 = r43Var3.p0();
                                        long jG = y91VarP0.G();
                                        y91VarP0.x().i();
                                        try {
                                            list5 = list8;
                                            r43Var = r43Var3;
                                            ((lp8) y91VarP0.b).D(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
                                            jkVar2.e(r43Var.p0().x(), j8);
                                        } finally {
                                            j39.s(y91VarP0, jG);
                                        }
                                    } else {
                                        list5 = list8;
                                        r43Var = r43Var3;
                                    }
                                    i35++;
                                    r43Var3 = r43Var;
                                    list8 = list5;
                                }
                                return hebVar;
                        }
                    }
                };
                dd4Var.p0(kb4Var2);
                obj11 = kb4Var2;
            }
            s32.F(ou6VarX5, (kb4) obj11, dd4Var, 0);
            pn2 pn2Var3 = (pn2) dd4Var.j(ur9Var2);
            ou6 ou6VarX6 = t96.x(tg9.h(tg9.f(ou6Var6, 1.0f), ((pn2) dd4Var.j(ur9Var2)).b0(f5)));
            f9 f9Var3 = f9Var;
            ha6 ha6VarD2 = pn0.d(f9Var3, false);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarX6);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar2, dd4Var, ha6VarD2);
            un9.s(jmVar3, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar, dd4Var, kdVar);
            un9.s(jmVar5, dd4Var, ou6VarL02);
            dd4Var.f0(-9997086);
            int size = list3.size();
            int i25 = 0;
            while (i25 < size) {
                List list4 = list3;
                tia tiaVar2 = (tia) list4.get(i25);
                via viaVar = tiaVar2.i;
                if (viaVar == null) {
                    dd4Var.f0(-1587791500);
                    dd4Var.q(false);
                    i19 = size;
                    pn2Var = pn2Var3;
                    i20 = i25;
                    a07Var = a07Var3;
                } else {
                    i19 = size;
                    kf8 kf8Var = viaVar.a;
                    i20 = i25;
                    dd4Var.f0(-1587791499);
                    dd4Var.f0(-1207756800);
                    boolean zH8 = dd4Var.h(tiaVar2) | dd4Var.f(viaVar);
                    Object objQ14 = dd4Var.Q();
                    if (zH8 || objQ14 == fu6Var4) {
                        a07Var = a07Var3;
                        q57 q57Var = new q57(7, tiaVar2, viaVar);
                        dd4Var.p0(q57Var);
                        obj3 = q57Var;
                    } else {
                        a07Var = a07Var3;
                        obj3 = objQ14;
                    }
                    ou6 ou6VarO = tg9.o(vm7.b0(ou6Var6, (kb4) obj3), pn2Var3.b0(kf8Var.c - kf8Var.a), pn2Var3.b0(kf8Var.d - kf8Var.b));
                    ha6 ha6VarD3 = pn0.d(f9Var3, false);
                    pn2 pn2Var4 = pn2Var3;
                    int iHashCode3 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL3 = dd4Var.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarO);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var.j0();
                    pn2Var = pn2Var4;
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(ll1.f, dd4Var, ha6VarD3);
                    un9.s(ll1.e, dd4Var, lr7VarL3);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode3));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL03);
                    E(i5, tiaVar2.i, tg9.c, dd4Var, i10 | 384);
                    tw2.x(dd4Var, true, false, false);
                }
                i25 = i20 + 1;
                list3 = list4;
                size = i19;
                a07Var3 = a07Var;
                pn2Var3 = pn2Var;
            }
            a07 a07Var4 = a07Var3;
            List list5 = list3;
            boolean z9 = true;
            dd4Var.q(false);
            dd4Var.q(true);
            if (((List) a07Var4.getValue()).isEmpty()) {
                z2 = true;
                fu6Var = fu6Var4;
                i12 = i10;
                ou6Var3 = ou6Var6;
                f2 = f5;
                z3 = false;
                dd4Var.f0(-63061058);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-63899050);
                int size2 = list5.size();
                int i26 = 0;
                while (i26 < size2) {
                    tia tiaVar3 = (tia) list5.get(i26);
                    if (tiaVar3.h != null) {
                        dd4Var.f0(-279150957);
                        List list6 = (List) a07Var4.getValue();
                        int size3 = list6.size();
                        int i27 = 0;
                        while (i27 < size3) {
                            int i28 = size2;
                            int i29 = i26;
                            if (ri9.D((gba) list6.get(i27), tiaVar3.d, tiaVar3.e)) {
                                dd4Var.f0(889151974);
                                p35 p35VarC = i25.c((m53) a53.n.getValue(), dd4Var, 0);
                                List list7 = list5;
                                long j7 = ((q96) dd4Var.j(s96.a)).a.w;
                                ou6 ou6VarR = tg9.r(ou6Var6, 16.0f);
                                boolean zH9 = dd4Var.h(tiaVar3);
                                Object objQ15 = dd4Var.Q();
                                if (zH9 || objQ15 == fu6Var4) {
                                    j3 = j7;
                                    zs5 zs5Var = new zs5(tiaVar3, 26);
                                    dd4Var.p0(zs5Var);
                                    obj2 = zs5Var;
                                } else {
                                    j3 = j7;
                                    obj2 = objQ15;
                                }
                                ou6 ou6VarA = zn0.a.a(vm7.b0(ou6VarR, (kb4) obj2), bv4.d);
                                f4 = f5;
                                i16 = size3;
                                tiaVar = tiaVar3;
                                i18 = i10;
                                list5 = list7;
                                z6 = true;
                                i17 = i27;
                                ou6Var5 = ou6Var6;
                                long j8 = j3;
                                list = list6;
                                fu6Var3 = fu6Var4;
                                mx4.a(p35VarC, (String) null, ou6VarA, j8, dd4Var, 48, 0);
                                dd4Var.q(false);
                            } else {
                                tiaVar = tiaVar3;
                                list = list6;
                                i16 = size3;
                                i17 = i27;
                                fu6Var3 = fu6Var4;
                                i18 = i10;
                                ou6Var5 = ou6Var6;
                                f4 = f5;
                                z6 = true;
                                dd4Var.f0(889667752);
                                dd4Var.q(false);
                            }
                            i27 = i17 + 1;
                            f5 = f4;
                            ou6Var6 = ou6Var5;
                            i10 = i18;
                            fu6Var4 = fu6Var3;
                            size2 = i28;
                            z9 = z6;
                            tiaVar3 = tiaVar;
                            i26 = i29;
                            size3 = i16;
                            list6 = list;
                        }
                        z5 = z9;
                        i13 = size2;
                        i14 = i26;
                        fu6Var2 = fu6Var4;
                        i15 = i10;
                        ou6Var4 = ou6Var6;
                        f3 = f5;
                        dd4Var.q(false);
                    } else {
                        z5 = z9;
                        i13 = size2;
                        i14 = i26;
                        fu6Var2 = fu6Var4;
                        i15 = i10;
                        ou6Var4 = ou6Var6;
                        f3 = f5;
                    }
                    f5 = f3;
                    ou6Var6 = ou6Var4;
                    i10 = i15;
                    fu6Var4 = fu6Var2;
                    i26 = i14 + 1;
                    size2 = i13;
                    z9 = z5;
                }
                z2 = z9;
                fu6Var = fu6Var4;
                i12 = i10;
                ou6Var3 = ou6Var6;
                f2 = f5;
                z3 = false;
                dd4Var.q(false);
            }
            if (((Boolean) br9Var.getValue()).booleanValue() && ((Boolean) jkaVar2.f.getValue()).booleanValue()) {
                dd4Var.f0(-62900044);
                final long j9 = ((cka) dd4Var.j(dka.a)).a;
                boolean zF3 = dd4Var.f(jkaVar2.c()) | (i12 == 4 ? z2 : z3);
                Object objQ16 = dd4Var.Q();
                int iNextIndex = -1;
                Object obj12 = objQ16;
                if (zF3 || objQ16 == fu6Var) {
                    Iterator it = list5.iterator();
                    ?? r12 = z3;
                    while (true) {
                        if (!it.hasNext()) {
                            r12 = -1;
                            break;
                        }
                        tia tiaVar4 = (tia) it.next();
                        if (i5 == jkaVar2.c().a && jkaVar2.c().b < tiaVar4.e) {
                            break;
                        } else {
                            r12 = (r12 == true ? 1 : 0) + 1;
                        }
                    }
                    Integer numValueOf2 = Integer.valueOf((int) r12);
                    dd4Var.p0(numValueOf2);
                    obj12 = numValueOf2;
                }
                final int iIntValue = ((Number) obj12).intValue();
                boolean zF4 = (i12 == 4 ? z2 : false) | dd4Var.f(jkaVar2.b());
                Object objQ17 = dd4Var.Q();
                Object obj13 = objQ17;
                if (zF4 || objQ17 == fu6Var) {
                    ListIterator listIterator = list5.listIterator(list5.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        tia tiaVar5 = (tia) listIterator.previous();
                        if (i5 == jkaVar2.b().a && jkaVar2.b().b >= tiaVar5.d) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                    Integer numValueOf3 = Integer.valueOf(iNextIndex);
                    dd4Var.p0(numValueOf3);
                    obj13 = numValueOf3;
                }
                final int iIntValue2 = ((Number) obj13).intValue();
                ou6 ou6VarH = tg9.h(tg9.f(ou6Var3, 1.0f), ((pn2) dd4Var.j(xm1.h)).b0(f2));
                boolean zH10 = dd4Var.h(siaVar3) | dd4Var.d(iIntValue) | ((i6 & 7168) == 2048 ? z2 : false) | dd4Var.e(j9) | dd4Var.d(iIntValue2);
                Object objQ18 = dd4Var.Q();
                if (zH10 || objQ18 == fu6Var) {
                    final jka jkaVar3 = jkaVar2;
                    z4 = z2;
                    r13 = 0;
                    kb4 kb4Var3 = new kb4() { // from class: zj7
                        /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
                        @Override // defpackage.kb4
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r24) {
                            /*
                                Method dump skipped, instruction units count: 414
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.zj7.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    dd4Var.p0(kb4Var3);
                    objQ18 = kb4Var3;
                } else {
                    z4 = z2;
                    r13 = 0;
                }
                s32.F(ou6VarH, (kb4) objQ18, dd4Var, r13);
                dd4Var.q((boolean) r13);
            } else {
                z4 = z2;
                dd4Var.f0(-60768546);
                dd4Var.q(z3);
            }
            dd4Var.q(z4);
        } else {
            i5 = i2;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            final int i30 = i5;
            ye8VarU.d = new yb4() { // from class: ak7
                @Override // defpackage.yb4
                public final Object invoke(Object obj14, Object obj15) {
                    ((Integer) obj15).getClass();
                    t1c.B(i30, j2, siaVar, jkaVar, aoaVar, zjaVar, kbaVar, ou6Var, (dd4) obj14, qu1.x0(i3 | 1));
                    return heb.a;
                }
            };
        }
    }

    public static final void C(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var) {
        int i3;
        dd4 dd4Var2 = dd4Var;
        ib4Var.getClass();
        dd4Var2.h0(578525079);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(ou6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 32 : 16;
        }
        int i4 = i3;
        if (dd4Var2.V(i4 & 1, (i4 & 19) != 18)) {
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
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
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.h(lu6Var, 56.0f));
            p35 p35VarC = i25.c((m53) a53.K.getValue(), dd4Var2, 0);
            ur9 ur9Var = s96.a;
            mx4.a(p35VarC, (String) null, tg9.n(lu6Var, 40.0f), ((q96) dd4Var2.j(ur9Var)).a.q, dd4Var2, 432, 0);
            un9.a(dd4Var2, tg9.h(lu6Var, 24.0f));
            nha.c(wn9.K((pv9) eu9.s.getValue(), dd4Var2), gjb.n0(lu6Var, 24.0f, 0.0f, 2), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.g, dd4Var2, 48, 0, 130040);
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var2, 0), wn9.K((pv9) vt9.r0.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var, (i4 << 21) & 234881024, 252);
            dd4Var2 = dd4Var;
            xv5.A(lu6Var, 56.0f, dd4Var2, true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xj7(ou6Var, ib4Var, i2, 0);
        }
    }

    public static final void D(final ks9 ks9Var, ou6 ou6Var, final kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        boolean z2;
        final kb4 kb4Var3 = kb4Var2;
        dd4 dd4Var2 = dd4Var;
        ks9Var.getClass();
        kb4Var.getClass();
        kb4Var3.getClass();
        dd4Var2.h0(-173279987);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(ks9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.h(kb4Var3) ? 2048 : 1024;
        }
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
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
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            int i4 = i3;
            String str = ks9Var.d;
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.g;
            long j2 = ((q96) dd4Var2.j(ur9Var)).a.q;
            lu6 lu6Var = lu6.a;
            nha.c(str, gjb.l0(lu6Var, 24.0f), j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, 48, 0, 130040);
            dd4Var2 = dd4Var;
            if (ks9Var.h) {
                dd4Var2.f0(-892206167);
                sdc.y(tg9.n(lu6Var, 48.0f), ((q96) dd4Var2.j(ur9Var)).a.q, null, dd4Var2, 6, 4);
                dd4Var2.q(false);
                kb4Var3 = kb4Var2;
            } else if (ks9Var.i) {
                dd4Var2.f0(-891986067);
                dd4Var2.f0(1218154256);
                String strK = ks9Var.j;
                if (strK == null) {
                    strK = "";
                }
                if (strK.length() == 0) {
                    strK = wn9.K((pv9) eu9.E.getValue(), dd4Var2);
                }
                dd4Var2.q(false);
                nha.c(strK, gjb.l0(lu6Var, 24.0f), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 48, 0, 130040);
                dd4Var2 = dd4Var;
                p35 p35VarC = i25.c((m53) f53.d0.getValue(), dd4Var2, 0);
                String strK2 = wn9.K((pv9) mu9.Q.getValue(), dd4Var2);
                int i5 = i4 & 14;
                boolean z3 = (i5 == 4) | ((i4 & 896) == 256);
                Object objQ = dd4Var2.Q();
                Object obj = vl1.a;
                if (z3 || objQ == obj) {
                    final int i6 = 0;
                    objQ = new ib4() { // from class: yj7
                        @Override // defpackage.ib4
                        public final Object invoke() {
                            int i7 = i6;
                            heb hebVar = heb.a;
                            ks9 ks9Var2 = ks9Var;
                            kb4 kb4Var4 = kb4Var;
                            switch (i7) {
                                case 0:
                                    kb4Var4.invoke(Integer.valueOf(ks9Var2.e));
                                    break;
                                default:
                                    kb4Var4.invoke(ks9Var2.f);
                                    break;
                            }
                            return hebVar;
                        }
                    };
                    dd4Var2.p0(objQ);
                }
                kc5.n(p35VarC, strK2, false, null, null, null, null, null, (ib4) objQ, dd4Var2, 0, 252);
                if (ks9Var.g) {
                    ky0.z(dd4Var2, -891360766, lu6Var, 12.0f, dd4Var2);
                    p35 p35VarC2 = i25.c((m53) f53.C.getValue(), dd4Var2, 0);
                    String strK3 = wn9.K((pv9) mu9.z.getValue(), dd4Var2);
                    boolean z4 = (i5 == 4) | ((i4 & 7168) == 2048);
                    Object objQ2 = dd4Var2.Q();
                    if (z4 || objQ2 == obj) {
                        kb4Var3 = kb4Var2;
                        final int i7 = 1;
                        objQ2 = new ib4() { // from class: yj7
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i72 = i7;
                                heb hebVar = heb.a;
                                ks9 ks9Var2 = ks9Var;
                                kb4 kb4Var4 = kb4Var3;
                                switch (i72) {
                                    case 0:
                                        kb4Var4.invoke(Integer.valueOf(ks9Var2.e));
                                        break;
                                    default:
                                        kb4Var4.invoke(ks9Var2.f);
                                        break;
                                }
                                return hebVar;
                            }
                        };
                        dd4Var2.p0(objQ2);
                    } else {
                        kb4Var3 = kb4Var2;
                    }
                    kc5.n(p35VarC2, strK3, false, null, null, null, null, null, (ib4) objQ2, dd4Var2, 0, 252);
                    z2 = false;
                    dd4Var2.q(false);
                } else {
                    kb4Var3 = kb4Var2;
                    z2 = false;
                    dd4Var2.f0(-891044597);
                    dd4Var2.q(false);
                }
                dd4Var2.q(z2);
            } else {
                kb4Var3 = kb4Var2;
                dd4Var2.f0(-891034677);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o50((Object) ks9Var, ou6Var, (ub4) kb4Var, (ub4) kb4Var3, i2, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(int r11, defpackage.via r12, ou6 r13, dd4 r14, int r15) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t1c.E(int, via, ou6, dd4, int):void");
    }

    public static final void F(final qb7 qb7Var, final boolean z2, final cl8 cl8Var, final boolean z3, long j2, final float f2, final ou6 ou6Var, dd4 dd4Var, final int i2) {
        int i3;
        long j3;
        int i4;
        long j4;
        boolean z4;
        dd4Var.h0(-466280168);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? dd4Var.f(qb7Var) : dd4Var.h(qb7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.d(cl8Var.ordinal()) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.g(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 1048576 : 524288;
        }
        if (dd4Var.V(i3 & 1, (533651 & i3) != 533650)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                i4 = i3 & (-57345);
                j4 = 9205357640488583168L;
            } else {
                dd4Var.Y();
                i4 = i3 & (-57345);
                j4 = j2;
            }
            dd4Var.r();
            cl8 cl8Var2 = cl8.b;
            cl8 cl8Var3 = cl8.a;
            if (z2) {
                m29 m29Var = j19.a;
                z4 = (cl8Var == cl8Var3 && !z3) || (cl8Var == cl8Var2 && z3);
            } else {
                m29 m29Var2 = j19.a;
                z4 = (cl8Var != cl8Var3 || z3) && !(cl8Var == cl8Var2 && z3);
            }
            uf0 uf0Var = z4 ? yb0.c : yb0.b;
            int i5 = i4 & 14;
            boolean zG = (i5 == 4 || ((i4 & 8) != 0 && dd4Var.h(qb7Var))) | ((i4 & Token.ASSIGN_MOD) == 32) | dd4Var.g(z4);
            Object objQ = dd4Var.Q();
            if (zG || objQ == vl1.a) {
                objQ = new aj(qb7Var, z2, z4);
                dd4Var.p0(objQ);
            }
            long j5 = j4;
            uf0 uf0Var2 = uf0Var;
            j3 = j5;
            x(qb7Var, uf0Var2, jf0.G(1365123137, new bj((ftb) dd4Var.j(xm1.t), j3, z4, a29.c(ou6Var, false, (kb4) objQ), qb7Var), dd4Var), dd4Var, i5 | 384);
        } else {
            dd4Var.Y();
            j3 = j2;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            final long j6 = j3;
            ye8VarU.d = new yb4() { // from class: cj
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t1c.F(qb7Var, z2, cl8Var, z3, j6, f2, ou6Var, (dd4) obj, qu1.x0(i2 | 1));
                    return heb.a;
                }
            };
        }
    }

    public static final void G(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, boolean z2) {
        int i3;
        dd4Var.h0(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(ou6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (dd4Var.h(ib4Var) ? 32 : 16) | (dd4Var.g(z2) ? 256 : Token.CASE);
        if (dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            m29 m29Var = j19.a;
            un9.a(dd4Var, s32.X(tg9.o(ou6Var, 25.0f, 25.0f), new gj(ib4Var, z2)));
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fj(ou6Var, ib4Var, z2, i2);
        }
    }

    public static final void H(xga xgaVar, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, ib4 ib4Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(185980396);
        int i3 = i2 | (dd4Var2.f(xgaVar) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(pj7Var) ? 32 : 16;
        }
        int i4 = i3 | 384 | (dd4Var2.h(kb4Var) ? 2048 : 1024) | (dd4Var2.h(kb4Var2) ? 16384 : 8192) | (dd4Var2.h(kb4Var3) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(ib4Var) ? 1048576 : 524288);
        if (dd4Var2.V(i4 & 1, (599187 & i4) != 599186)) {
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var3);
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
            int i5 = i4 << 3;
            t96.h(xgaVar.a, xgaVar.b, pj7Var, tg9.f(ou6Var3, 1.0f), kb4Var, kb4Var2, kb4Var3, dd4Var2, (i5 & 896) | 3072 | (57344 & i5) | (458752 & i5) | (i5 & 3670016));
            ou6 ou6VarL02 = gjb.l0(yib.B(zn0.a.a(ou6Var3, bv4.v), 15), 12.0f);
            long j2 = ((q96) dd4Var2.j(s96.a)).a.h;
            boolean z2 = (i4 & 3670016) == 1048576;
            Object objQ = dd4Var2.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new pm6(24, ib4Var);
                dd4Var2.p0(objQ);
            }
            ww1.g((ib4) objQ, ou6VarL02, null, j2, 0L, null, kf0.r, dd4Var, 12582912, Token.COLON);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new pj1(xgaVar, pj7Var, ou6Var2, kb4Var, kb4Var2, kb4Var3, ib4Var, i2, 3);
        }
    }

    public static final void I(rj7 rj7Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-306040127);
        int i3 = i2 | 48;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            px3 px3Var = tg9.c;
            mv mvVar = new mv(14.0f, true, new gp(5));
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = new uha(23);
                dd4Var.p0(objQ);
            }
            rw1.j(px3Var, null, rj7Var, false, mvVar, null, null, false, null, (kb4) objQ, dd4Var, 805331328, 490);
            ou6Var = lu6.a;
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b18(rj7Var, ou6Var, i2, 20);
        }
    }

    public static final int[] J(String str) {
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = -1;
        }
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            iArr[str.charAt(i3)] = i3;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int K(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t1c.K(int, int, int, boolean):int");
    }

    public static String L(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = (bArr[i2] & 240) >>> 4;
            char[] cArr = x;
            sb.append(cArr[i3]);
            sb.append(cArr[bArr[i2] & 15]);
        }
        return sb.toString();
    }

    public static void M(Object obj, Object obj2) {
        if (obj == null) {
            k27.n(ky0.p(obj2, "null key in entry: null="));
        } else {
            if (obj2 != null) {
                return;
            }
            ifc.e(obj, "=null", "null value in entry: ");
        }
    }

    public static void N(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        gp.l(dx1.g(i2, str, " cannot be negative but was: "));
    }

    public static int O(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ky4 P(pw0 r30, float r31) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t1c.P(pw0, float):ky4");
    }

    public static final r1c R(Context context, sn1 sn1Var) {
        ap8 ap8Var;
        String name;
        y93 y93VarE;
        y0a y0aVar;
        boolean zContainsKey;
        context.getClass();
        u1c u1cVar = new u1c(sn1Var.c);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        q39 q39Var = u1cVar.a;
        q39Var.getClass();
        s08 s08Var = sn1Var.d;
        boolean z2 = context.getResources().getBoolean(2131034120);
        s08Var.getClass();
        if (z2) {
            ap8Var = new ap8(applicationContext, null);
            ap8Var.i = true;
        } else {
            if (bw9.a0("androidx.work.workdb")) {
                gp.l("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                return null;
            }
            ap8 ap8Var2 = new ap8(applicationContext, "androidx.work.workdb");
            ap8Var2.h = new a09(applicationContext, 10);
            ap8Var = ap8Var2;
        }
        ap8Var.f = q39Var;
        k91 k91Var = new k91(s08Var);
        ArrayList arrayList = ap8Var.d;
        arrayList.add(k91Var);
        ap8Var.a(ch6.h);
        ap8Var.a(new sk8(applicationContext, 2, 3));
        ap8Var.a(ch6.i);
        ap8Var.a(ch6.j);
        ap8Var.a(new sk8(applicationContext, 5, 6));
        ap8Var.a(ch6.k);
        ap8Var.a(ch6.l);
        ap8Var.a(ch6.m);
        ap8Var.a(new sk8(applicationContext));
        ap8Var.a(new sk8(applicationContext, 10, 11));
        ap8Var.a(ch6.d);
        ap8Var.a(ch6.e);
        ap8Var.a(ch6.f);
        ap8Var.a(ch6.g);
        ap8Var.a(new sk8(applicationContext, 21, 22));
        ap8Var.p = false;
        ap8Var.q = true;
        ap8Var.r = true;
        Executor executor = ap8Var.f;
        if (executor == null && ap8Var.g == null) {
            gv gvVar = hv.c;
            ap8Var.g = gvVar;
            ap8Var.f = gvVar;
        } else if (executor != null && ap8Var.g == null) {
            ap8Var.g = executor;
        } else if (executor == null) {
            ap8Var.f = ap8Var.g;
        }
        LinkedHashSet linkedHashSet = ap8Var.n;
        linkedHashSet.getClass();
        LinkedHashSet linkedHashSet2 = ap8Var.m;
        linkedHashSet2.getClass();
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    gp.k(dx1.f(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        lr3 lr3Var = ap8Var.h;
        if (lr3Var == null) {
            lr3Var = new lr3(25);
        }
        lr3 lr3Var2 = lr3Var;
        if (ap8Var.k > 0) {
            if (ap8Var.c != null) {
                gp.l("Required value was null.");
                return null;
            }
            gp.l("Cannot create auto-closing database for an in-memory database.");
            return null;
        }
        boolean z3 = ap8Var.i;
        bp8 bp8Var = ap8Var.j;
        bp8Var.getClass();
        Context context2 = ap8Var.b;
        context2.getClass();
        if (bp8Var == bp8.a) {
            Object systemService = context2.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            bp8Var = (activityManager == null || activityManager.isLowRamDevice()) ? bp8.b : bp8.c;
        }
        bp8 bp8Var2 = bp8Var;
        Executor executor2 = ap8Var.f;
        if (executor2 == null) {
            gp.l("Required value was null.");
            return null;
        }
        Executor executor3 = ap8Var.g;
        if (executor3 == null) {
            gp.l("Required value was null.");
            return null;
        }
        l62 l62Var = new l62(context2, ap8Var.c, lr3Var2, ap8Var.l, arrayList, z3, bp8Var2, executor2, executor3, (Intent) null, ap8Var.p, ap8Var.q, linkedHashSet2, (String) null, (File) null, (Callable) null, ap8Var.e, ap8Var.o, ap8Var.r, (xq8) null, (jx1) null);
        l62Var.q = ap8Var.s;
        Class clsM = tu1.M(ap8Var.a);
        Package r4 = clsM.getPackage();
        if (r4 == null || (name = r4.getName()) == null) {
            name = "";
        }
        String canonicalName = clsM.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsM.getClassLoader());
            cls.getClass();
            WorkDatabase workDatabase = (dp8) cls.getDeclaredConstructor(null).newInstance(null);
            workDatabase.getClass();
            workDatabase.j = l62Var.q;
            try {
                y93VarE = workDatabase.e();
                y93VarE.getClass();
            } catch (u77 unused) {
                y93VarE = null;
            }
            if (y93VarE == null) {
                new zo8(l62Var, new f48((dp8) workDatabase));
                throw null;
            }
            workDatabase.d = new zo8(l62Var, y93VarE);
            workDatabase.e = workDatabase.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setH = workDatabase.h();
            int size = setH.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setH.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                int i2 = -1;
                List list = l62Var.n;
                if (zHasNext) {
                    a91 a91Var = (a91) it2.next();
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i3 = size2 - 1;
                            if (a91Var.h(list.get(size2))) {
                                zArr[size2] = true;
                                i2 = size2;
                                break;
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size2 = i3;
                        }
                    }
                    if (i2 < 0) {
                        so9.r(a91Var.f(), ") is missing in the database configuration.", "A required auto migration spec (");
                        return null;
                    }
                    linkedHashMap.put(a91Var, list.get(i2));
                } else {
                    int size3 = list.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i4 = size3 - 1;
                            if (size3 >= size || !zArr[size3]) {
                                break;
                            }
                            if (i4 < 0) {
                                break;
                            }
                            size3 = i4;
                        }
                        gp.l("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        return null;
                    }
                    for (bh6 bh6Var : workDatabase.c(linkedHashMap)) {
                        int i5 = bh6Var.a;
                        int i6 = bh6Var.b;
                        cp8 cp8Var = l62Var.d;
                        LinkedHashMap linkedHashMap2 = cp8Var.a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i5))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i5));
                            if (map == null) {
                                map = mc3.a;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(i6));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            cp8Var.a(bh6Var);
                        }
                    }
                    LinkedHashMap linkedHashMapI = workDatabase.i();
                    boolean[] zArr2 = new boolean[linkedHashMapI.size()];
                    Iterator it3 = linkedHashMapI.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        List list2 = l62Var.m;
                        if (!zHasNext2) {
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i7 = size4 - 1;
                                    if (!zArr2[size4]) {
                                        so9.s(list2.get(size4), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", "Unexpected type converter ");
                                        return null;
                                    }
                                    if (i7 < 0) {
                                        break;
                                    }
                                    size4 = i7;
                                }
                            }
                            workDatabase.b = l62Var.h;
                            workDatabase.c = new q39(l62Var.i, 1);
                            Executor executor4 = workDatabase.b;
                            if (executor4 == null) {
                                lc5.i0("internalQueryExecutor");
                                throw null;
                            }
                            iw0 iw0VarB = wx1.b(gx1.T(qu1.Y(executor4), zib.a()));
                            workDatabase.a = iw0VarB;
                            jx1 jx1Var = iw0VarB.b;
                            q39 q39Var2 = workDatabase.c;
                            if (q39Var2 == null) {
                                lc5.i0("internalTransactionExecutor");
                                throw null;
                            }
                            jx1Var.plus(qu1.Y(q39Var2));
                            workDatabase.g = l62Var.f;
                            zo8 zo8Var = workDatabase.d;
                            if (zo8Var == null) {
                                lc5.i0("connectionManager");
                                throw null;
                            }
                            y0a y0aVarC = zo8Var.c();
                            if (y0aVarC == null) {
                                y0aVarC = null;
                                break;
                            }
                            while (!(y0aVarC instanceof xz7)) {
                                if (!(y0aVarC instanceof rm2)) {
                                    y0aVarC = null;
                                    break;
                                }
                                y0aVarC = ((rm2) y0aVarC).p();
                            }
                            zo8 zo8Var2 = workDatabase.d;
                            if (zo8Var2 == null) {
                                lc5.i0("connectionManager");
                                throw null;
                            }
                            y0a y0aVarC2 = zo8Var2.c();
                            if (y0aVarC2 == null) {
                                y0aVar = null;
                                break;
                            }
                            while (!(y0aVarC2 instanceof z30)) {
                                if (!(y0aVarC2 instanceof rm2)) {
                                    y0aVar = null;
                                    break;
                                }
                                y0aVarC2 = ((rm2) y0aVarC2).p();
                            }
                            y0aVar = y0aVarC2;
                            WorkDatabase workDatabase2 = workDatabase;
                            Context applicationContext2 = context.getApplicationContext();
                            applicationContext2.getClass();
                            n2b n2bVar = new n2b(applicationContext2, u1cVar);
                            l38 l38Var = new l38(context.getApplicationContext(), sn1Var, u1cVar, workDatabase2);
                            return new r1c(context.getApplicationContext(), sn1Var, u1cVar, workDatabase2, (List) s1c.a.h(context, sn1Var, u1cVar, workDatabase2, n2bVar, l38Var), l38Var, n2bVar);
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        a91 a91Var2 = (a91) entry.getKey();
                        for (a91 a91Var3 : (List) entry.getValue()) {
                            int size5 = list2.size() - 1;
                            if (size5 >= 0) {
                                while (true) {
                                    int i8 = size5 - 1;
                                    if (a91Var3.h(list2.get(size5))) {
                                        zArr2[size5] = true;
                                        break;
                                    }
                                    if (i8 < 0) {
                                        break;
                                    }
                                    size5 = i8;
                                }
                                size5 = -1;
                            } else {
                                size5 = -1;
                            }
                            if (size5 < 0) {
                                so9.p("A required type converter (", a91Var3.f(), ") for ", a91Var2.f(), " is missing in the database configuration.");
                                return null;
                            }
                            Object obj = list2.get(size5);
                            a91Var3.getClass();
                            obj.getClass();
                            workDatabase.i.put(a91Var3, obj);
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("Cannot find implementation for " + clsM.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot access the constructor " + clsM.getCanonicalName(), e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Failed to create an instance of " + clsM.getCanonicalName(), e4);
        }
    }

    public static final long T(jl9 jl9Var, long j2) throws EOFException {
        jl9Var.getClass();
        jl9Var.request(j2);
        long jMin = Math.min(j2, jl9Var.b().c);
        jl9Var.b().skip(jMin);
        return jMin;
    }

    public static final void U(r43 r43Var, int i2, int i3, long j2, float f2, long j3, jk jkVar) {
        int iC = jkVar.c(i2);
        ArrayList arrayList = jkVar.a;
        int iC2 = jkVar.c(i3);
        if (iC > iC2) {
            return;
        }
        float f3 = 0.0f;
        while (true) {
            int iMax = Math.max(i2, ((tha) arrayList.get(iC)).a);
            int iMin = Math.min(i3, ((tha) arrayList.get(iC)).b - 1);
            float f4 = jkVar.a(iMax).a;
            kf8 kf8VarA = jkVar.a(iMin);
            float fMax = Math.max(f3, ((tha) arrayList.get(iC)).d);
            float fB = jkVar.b(iC);
            float f5 = 2.0f * f2;
            r43.J(r43Var, j3, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j2 >> 32)) + f4) - f5)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j2 & 4294967295L)) + fMax) - f2)) & 4294967295L), (((long) Float.floatToRawIntBits((4.0f * f2) + (kf8VarA.c - f4))) << 32) | (((long) Float.floatToRawIntBits((fB - fMax) + f5)) & 4294967295L), 0.0f, (jw9) null, 120);
            if (iC == iC2) {
                return;
            }
            iC++;
            f3 = fB;
        }
    }

    public static boolean W(String str, String str2) {
        char c2;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) == str2.charAt(i2) || ((c2 = (char) ((r3 | ' ') - 97)) < 26 && c2 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final long Z(jl9 jl9Var) {
        jl9Var.getClass();
        return jl9Var.b().c;
    }

    public static final void a(fq8 fq8Var, boolean z2, ib4 ib4Var, rj1 rj1Var, ou6 ou6Var, boolean z3, yb4 yb4Var, dd4 dd4Var, int i2) {
        int i3;
        ou6 ou6Var2;
        boolean z4;
        fq8Var.getClass();
        ib4Var.getClass();
        dd4Var.h0(-2124957378);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(fq8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(rj1Var) ? 2048 : 1024;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            i4 |= dd4Var.h(yb4Var) ? 1048576 : 524288;
        }
        if (dd4Var.V(i4 & 1, (590995 & i4) != 590994)) {
            n37.b(fq8Var, z2, ib4Var, rj1Var, null, yb4Var, false, null, dd4Var, i4 & 4136958);
            ou6Var2 = lu6.a;
            z4 = true;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
            z4 = z3;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new dn0(fq8Var, z2, ib4Var, rj1Var, ou6Var2, z4, yb4Var, i2);
        }
    }

    public static final void b(int i2, kb4 kb4Var, int i3, ou6 ou6Var, rj1 rj1Var, dd4 dd4Var, int i4) {
        int i5;
        kb4Var.getClass();
        dd4Var.h0(473603477);
        if ((i4 & 24576) == 0) {
            i5 = (dd4Var.h(rj1Var) ? 16384 : 8192) | i4;
        } else {
            i5 = i4;
        }
        if (dd4Var.V(i5 & 1, (i5 & 8193) != 8192)) {
            n37.a(tg9.f(lu6.a, 1.0f), lc1.i, 0L, 1.0f, new tz3(), rj1Var, dd4Var, ((i5 << 3) & 458752) | 3126);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new cn0(i2, kb4Var, i3, ou6Var, rj1Var, i4);
        }
    }

    public static boolean b0(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static final void c(List list, zk7 zk7Var, boolean z2, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        int i3;
        ou6 ou6Var2;
        dd4Var.h0(1326504158);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(zk7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.g(z2) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            ou6Var2 = ou6Var;
            i3 |= dd4Var.f(ou6Var2) ? 2048 : 1024;
        } else {
            ou6Var2 = ou6Var;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 16384 : 8192;
        }
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            int i5 = i3;
            int iK = zk7Var.k();
            long j2 = lc1.i;
            qx8.d(iK, ou6Var2, j2, j2, 0.0f, jf0.G(-1619403330, new oh1(zk7Var, i4), dd4Var), p7c.e, jf0.G(1322356670, new uu1(iK, kb4Var, list, z2), dd4Var), dd4Var, ((i5 >> 6) & Token.ASSIGN_MOD) | 14380416, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bu2(list, zk7Var, z2, ou6Var, kb4Var, i2);
        }
    }

    public static final ou6 c0(ou6 ou6Var, li5 li5Var, qs5 qs5Var, lh7 lh7Var, boolean z2, boolean z3) {
        return ou6Var.e(new ts5(li5Var, qs5Var, lh7Var, z2, z3));
    }

    public static final void d(String str, u4b u4bVar, to3 to3Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, dd4 dd4Var, int i2) {
        int i3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-703451910);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(u4bVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? dd4Var2.f(to3Var) : dd4Var2.h(to3Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var2.h(ib4Var2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var2.h(ib4Var3) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dd4Var2.h(ib4Var4) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (dd4Var2.V(i4 & 1, (i4 & 4793491) != 4793490)) {
            int i5 = i4 >> 9;
            ou6 ou6VarY = yn2.y(dd4Var2, ou6Var);
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarY);
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
            ou6 ou6VarP0 = gjb.p0(gjb.n0(yib.B(tg9.f(lu6Var, 1.0f), 1), 12.0f, 0.0f, 2), 0.0f, 6.0f, 0.0f, 0.0f, 13);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarP0);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            ou6 ou6VarP02 = gjb.p0(tg9.h(ky0.g(dd4Var2, ou6VarL02, jmVar4, 1.0f, true), 40.0f), 12.0f, 0.0f, 0.0f, 0.0f, 14);
            vf0 vf0Var2 = bv4.A;
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var2, dd4Var2, 48);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarP02);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            String str2 = to3Var.b;
            ur9 ur9Var = s96.a;
            nha.c(str2, tg9.f(lu6Var, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 48, 24960, 109564);
            nha.c(to3Var.d, tg9.f(lu6Var, 1.0f), lc1.c(0.5f, ((q96) dd4Var.j(ur9Var)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.l, dd4Var, 48, 24960, 109560);
            dd4Var.q(true);
            wn9.h(u4bVar, false, null, new rj7(3.0f, 3.0f, 3.0f, 3.0f), ib4Var4, dd4Var, ((i4 >> 3) & 14) | 3072 | (57344 & i5), 6);
            h(to3Var, gjb.n0(lu6Var, 0.0f, 6.0f, 1), ib4Var2, ib4Var3, dd4Var, (i5 & 7168) | 48 | ((i4 >> 6) & 14) | (i5 & 896));
            dd4Var.q(true);
            ou6 ou6VarF = xv5.f(1.0f, tg9.f(lu6Var, 1.0f), true);
            ie1 ie1VarA3 = ge1.a(pv.e, vf0Var2, dd4Var, 54);
            int iHashCode4 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL4 = dd4Var.l();
            ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarF);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA3);
            un9.s(jmVar2, dd4Var, lr7VarL4);
            ky0.v(iHashCode4, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL04);
            dd4Var.f0(-846717625);
            String strK = str.length() == 0 ? wn9.K((pv9) eu9.E.getValue(), dd4Var) : str;
            dd4Var.q(false);
            nha.c(strK, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.f, dd4Var, 0, 0, 130046);
            un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
            kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var, 0), wn9.K((pv9) mu9.Q.getValue(), dd4Var), false, null, null, null, null, null, ib4Var, dd4Var, (i4 << 12) & 234881024, 252);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xb1(str, u4bVar, to3Var, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, i2);
        }
    }

    public static int d0(int i2, int... iArr) {
        for (int i3 : iArr) {
            i2 = Math.max(i2, i3);
        }
        return i2;
    }

    public static final void e(u4b u4bVar, to3 to3Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, dd4 dd4Var, int i2) {
        int i3;
        boolean z2;
        dd4 dd4Var2;
        ou6 ou6Var2;
        int i4;
        float f2;
        dd4 dd4Var3 = dd4Var;
        wf0 wf0Var = bv4.w;
        wf0 wf0Var2 = bv4.x;
        dd4Var3.h0(333583375);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var3.f(u4bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? dd4Var3.f(to3Var) : dd4Var3.h(to3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var3.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var3.h(ib4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var3.h(ib4Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var3.h(ib4Var3) ? 131072 : Parser.ARGC_LIMIT;
        }
        int i5 = i3;
        if (dd4Var3.V(i5 & 1, (i5 & 74899) != 74898)) {
            boolean zA = xzb.a(dd4Var3);
            rj7 rj7Var = zA ? new rj7(12.0f, 8.0f, 12.0f, 92.0f) : new rj7(12.0f, 8.0f, 12.0f, 12.0f);
            ou6 ou6VarY = yn2.y(dd4Var3, ou6Var);
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var3, 0);
            int iHashCode = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL = dd4Var3.l();
            ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarY);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(um1Var);
            } else {
                dd4Var3.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var3, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var3, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var3, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var3, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var3, ou6VarL0);
            ou6 ou6Var3 = lu6.a;
            iv ivVar = pv.a;
            if (zA) {
                dd4Var3.f0(229287985);
                ou6 ou6VarP0 = gjb.p0(gjb.n0(yib.B(tg9.f(ou6Var3, 1.0f), 1), 12.0f, 0.0f, 2), 0.0f, 6.0f, 0.0f, 0.0f, 13);
                eq8 eq8VarA = dq8.a(ivVar, wf0Var2, dd4Var3, 48);
                int iHashCode2 = Long.hashCode(dd4Var3.T);
                lr7 lr7VarL2 = dd4Var3.l();
                ou6 ou6VarL02 = s32.L0(dd4Var3, ou6VarP0);
                dd4Var3.j0();
                if (dd4Var3.S) {
                    dd4Var3.k(um1Var);
                } else {
                    dd4Var3.s0();
                }
                un9.s(jmVar, dd4Var3, eq8VarA);
                un9.s(jmVar2, dd4Var3, lr7VarL2);
                ky0.v(iHashCode2, dd4Var3, jmVar3, dd4Var3, kdVar);
                ou6 ou6VarP02 = gjb.p0(tg9.h(ky0.g(dd4Var3, ou6VarL02, jmVar4, 1.0f, true), 40.0f), 12.0f, 0.0f, 0.0f, 0.0f, 14);
                ie1 ie1VarA2 = ge1.a(jvVar, bv4.A, dd4Var3, 48);
                int iHashCode3 = Long.hashCode(dd4Var3.T);
                lr7 lr7VarL3 = dd4Var3.l();
                ou6 ou6VarL03 = s32.L0(dd4Var3, ou6VarP02);
                dd4Var3.j0();
                if (dd4Var3.S) {
                    dd4Var3.k(um1Var);
                } else {
                    dd4Var3.s0();
                }
                un9.s(jmVar, dd4Var3, ie1VarA2);
                un9.s(jmVar2, dd4Var3, lr7VarL3);
                ky0.v(iHashCode3, dd4Var3, jmVar3, dd4Var3, kdVar);
                un9.s(jmVar4, dd4Var3, ou6VarL03);
                String str = to3Var.b;
                ur9 ur9Var = s96.a;
                nha.c(str, tg9.f(ou6Var3, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var3.j(ur9Var)).b.j, dd4Var, 48, 24960, 109564);
                nha.c(to3Var.d, tg9.f(ou6Var3, 1.0f), lc1.c(0.5f, ((q96) dd4Var.j(ur9Var)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.l, dd4Var, 48, 24960, 109560);
                dd4Var.q(true);
                int i6 = i5 >> 3;
                wn9.h(u4bVar, false, null, new rj7(3.0f, 3.0f, 3.0f, 3.0f), ib4Var3, dd4Var, (i5 & 14) | 3072 | (i6 & 57344), 6);
                int i7 = 48 | (i6 & 14) | (i6 & 896) | (i6 & 7168);
                z2 = true;
                h(to3Var, gjb.n0(ou6Var3, 0.0f, 6.0f, 1), ib4Var, ib4Var2, dd4Var, i7);
                dd4Var.q(true);
                ou6 ou6VarN0 = gjb.n0(tg9.f(ou6Var3, 1.0f), 8.0f, 0.0f, 2);
                eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var, 0);
                int iHashCode4 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL4 = dd4Var.l();
                ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarN0);
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, eq8VarA2);
                un9.s(jmVar2, dd4Var, lr7VarL4);
                ky0.v(iHashCode4, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL04);
                dd4Var.f0(-211470633);
                Iterator it = gc1.Z(new x13(84.0f), new x13(68.0f), new x13(96.0f), new x13(74.0f)).iterator();
                while (it.hasNext()) {
                    ah1.r(t96.w(gjb.l0(tg9.r(tg9.h(ou6Var3, 40.0f), ((x13) it.next()).a), 4.0f), tp8.a), null, dd4Var, 0, 2);
                }
                tw2.x(dd4Var, false, true, false);
                dd4Var2 = dd4Var;
                i4 = 2;
                ou6Var2 = ou6Var3;
                f2 = 8.0f;
            } else {
                z2 = true;
                dd4Var3.f0(231719532);
                ou6 ou6VarN02 = gjb.n0(yib.B(tg9.f(ou6Var3, 1.0f), 1), 0.0f, 8.0f, 1);
                eq8 eq8VarA3 = dq8.a(ivVar, wf0Var2, dd4Var3, 48);
                int iHashCode5 = Long.hashCode(dd4Var3.T);
                lr7 lr7VarL5 = dd4Var3.l();
                ou6 ou6VarL05 = s32.L0(dd4Var3, ou6VarN02);
                dd4Var3.j0();
                if (dd4Var3.S) {
                    dd4Var3.k(um1Var);
                } else {
                    dd4Var3.s0();
                }
                un9.s(jmVar, dd4Var3, eq8VarA3);
                un9.s(jmVar2, dd4Var3, lr7VarL5);
                ky0.v(iHashCode5, dd4Var3, jmVar3, dd4Var3, kdVar);
                ou6 ou6VarP03 = gjb.p0(ky0.g(dd4Var3, ou6VarL05, jmVar4, 1.0f, true), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                eq8 eq8VarA4 = dq8.a(ivVar, wf0Var, dd4Var3, 0);
                int iHashCode6 = Long.hashCode(dd4Var3.T);
                lr7 lr7VarL6 = dd4Var3.l();
                ou6 ou6VarL06 = s32.L0(dd4Var3, ou6VarP03);
                dd4Var3.j0();
                if (dd4Var3.S) {
                    dd4Var3.k(um1Var);
                } else {
                    dd4Var3.s0();
                }
                un9.s(jmVar, dd4Var3, eq8VarA4);
                un9.s(jmVar2, dd4Var3, lr7VarL6);
                ky0.v(iHashCode6, dd4Var3, jmVar3, dd4Var3, kdVar);
                un9.s(jmVar4, dd4Var3, ou6VarL06);
                dd4Var3.f0(591464237);
                Iterator it2 = gc1.Z(new x13(84.0f), new x13(68.0f), new x13(96.0f), new x13(74.0f)).iterator();
                while (it2.hasNext()) {
                    ah1.r(t96.w(gjb.l0(tg9.r(tg9.h(ou6Var3, 40.0f), ((x13) it2.next()).a), 4.0f), tp8.a), null, dd4Var3, 0, 2);
                }
                dd4Var3.q(false);
                dd4Var3.q(true);
                un9.a(dd4Var3, tg9.r(ou6Var3, 6.0f));
                int i8 = i5 >> 3;
                dd4Var2 = dd4Var3;
                wn9.h(u4bVar, false, null, new rj7(3.0f, 3.0f, 3.0f, 3.0f), ib4Var3, dd4Var2, (i5 & 14) | 3072 | (i8 & 57344), 6);
                un9.a(dd4Var2, tg9.r(ou6Var3, 6.0f));
                ou6Var2 = ou6Var3;
                i4 = 2;
                f2 = 8.0f;
                j(to3Var, gjb.p0(ou6Var3, 0.0f, 0.0f, 12.0f, 0.0f, 11), ib4Var, ib4Var2, dd4Var3, 48 | (i8 & 14) | (i8 & 896) | (i8 & 7168));
                dd4Var2.q(true);
                dd4Var2.q(false);
            }
            un9.a(dd4Var2, tg9.h(ou6Var2, 12.0f));
            zh4 zh4Var = zA ? new zh4() : new yh4(160.0f);
            ou6 ou6VarF = xv5.f(1.0f, tg9.f(ou6Var2, 1.0f), z2);
            mv mvVar = new mv(f2, z2, new gp(5));
            mv mvVar2 = new mv(f2, z2, new gp(5));
            Object objQ = dd4Var2.Q();
            if (objQ == vl1.a) {
                objQ = new gq2(i4);
                dd4Var2.p0(objQ);
            }
            dd4 dd4Var4 = dd4Var2;
            sw1.h(zh4Var, ou6VarF, (wq5) null, rj7Var, mvVar2, mvVar, (s04) null, false, (ag) null, (kb4) objQ, dd4Var4, 102432768, 6, 660);
            dd4Var3 = dd4Var4;
            dd4Var3.q(z2);
        } else {
            dd4Var3.Y();
        }
        ye8 ye8VarU = dd4Var3.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tz0(u4bVar, to3Var, ou6Var, ib4Var, ib4Var2, ib4Var3, i2, 1);
        }
    }

    public static Comparable e0(x13 x13Var, x13 x13Var2) {
        return x13Var.compareTo(x13Var2) >= 0 ? x13Var : x13Var2;
    }

    public static final void f(boolean z2, to3 to3Var, t27 t27Var, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        to3 to3Var2;
        t27 t27Var2;
        int i3;
        Object obj;
        to3Var.getClass();
        t27Var.getClass();
        kb4Var.getClass();
        dd4Var.h0(-1452624334);
        int i4 = i2 | (dd4Var.f(to3Var) ? 32 : 16) | (dd4Var.f(t27Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 16384 : 8192);
        if (dd4Var.V(i4 & 1, (i4 & 9361) != 9360)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ut2 ut2Var = (ut2) ((qtb) qx1.N(ug8.a(ut2.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            int i5 = 2;
            fu6 fu6Var = vl1.a;
            Object obj2 = objQ;
            if (objQ == fu6Var) {
                bs2 bs2Var = new bs2(i5);
                dd4Var.p0(bs2Var);
                obj2 = bs2Var;
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) obj2, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            Object obj3 = objQ2;
            if (objQ2 == fu6Var) {
                bs2 bs2Var2 = new bs2(3);
                dd4Var.p0(bs2Var2);
                obj3 = bs2Var2;
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) obj3, dd4Var, 48);
            Object[] objArr3 = new Object[0];
            Object objQ3 = dd4Var.Q();
            Object obj4 = objQ3;
            if (objQ3 == fu6Var) {
                bs2 bs2Var3 = new bs2(4);
                dd4Var.p0(bs2Var3);
                obj4 = bs2Var3;
            }
            a07 a07Var3 = (a07) ww1.b0(objArr3, (ib4) obj4, dd4Var, 48);
            a07 a07VarB = bx1.B(ut2Var.K, dd4Var);
            a07 a07VarB2 = bx1.B(ut2Var.d, dd4Var);
            boolean zF = dd4Var.f(ut2Var);
            Object objQ4 = dd4Var.Q();
            Object obj5 = objQ4;
            if (zF || objQ4 == fu6Var) {
                rb2 rb2Var = new rb2(ut2Var, 23);
                dd4Var.p0(rb2Var);
                obj5 = rb2Var;
            }
            lx1.g(ut2Var, null, (kb4) obj5, dd4Var, 0);
            ha6 ha6VarD = pn0.d(bv4.b, false);
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
            un9.s(ll1.f, dd4Var, ha6VarD);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            pt2 pt2Var = (pt2) a07VarB.getValue();
            u4b u4bVar = (u4b) a07VarB2.getValue();
            px3 px3Var = tg9.c;
            boolean zF2 = dd4Var.f(ut2Var);
            Object objQ5 = dd4Var.Q();
            Object obj6 = objQ5;
            if (zF2 || objQ5 == fu6Var) {
                uk2 uk2Var = new uk2(ut2Var, 2);
                dd4Var.p0(uk2Var);
                obj6 = uk2Var;
            }
            ib4 ib4Var = (ib4) obj6;
            boolean zF3 = dd4Var.f(a07Var);
            Object objQ6 = dd4Var.Q();
            Object obj7 = objQ6;
            if (zF3 || objQ6 == fu6Var) {
                bv1 bv1Var = new bv1(a07Var, 11);
                dd4Var.p0(bv1Var);
                obj7 = bv1Var;
            }
            ib4 ib4Var2 = (ib4) obj7;
            boolean zF4 = dd4Var.f(a07Var2);
            Object objQ7 = dd4Var.Q();
            Object obj8 = objQ7;
            if (zF4 || objQ7 == fu6Var) {
                bv1 bv1Var2 = new bv1(a07Var2, 12);
                dd4Var.p0(bv1Var2);
                obj8 = bv1Var2;
            }
            ib4 ib4Var3 = (ib4) obj8;
            boolean zF5 = dd4Var.f(a07Var3);
            Object objQ8 = dd4Var.Q();
            Object obj9 = objQ8;
            if (zF5 || objQ8 == fu6Var) {
                bv1 bv1Var3 = new bv1(a07Var3, 13);
                dd4Var.p0(bv1Var3);
                obj9 = bv1Var3;
            }
            g(to3Var, pt2Var, u4bVar, t27Var, px3Var, ib4Var, ib4Var2, ib4Var3, (ib4) obj9, dd4Var, 24576 | ((i4 >> 3) & 14) | ((i4 << 3) & 7168));
            to3Var2 = to3Var;
            t27Var2 = t27Var;
            dd4Var.q(true);
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            boolean zF6 = dd4Var.f(a07Var);
            Object objQ9 = dd4Var.Q();
            Object obj10 = objQ9;
            if (zF6 || objQ9 == fu6Var) {
                r02 r02Var = new r02(a07Var, 11);
                dd4Var.p0(r02Var);
                obj10 = r02Var;
            }
            kb4 kb4Var2 = (kb4) obj10;
            boolean zF7 = dd4Var.f(a07Var) | ((57344 & i4) == 16384);
            Object objQ10 = dd4Var.Q();
            if (zF7 || objQ10 == fu6Var) {
                i3 = 0;
                vt2 vt2Var = new vt2(i3, kb4Var, a07Var);
                dd4Var.p0(vt2Var);
                obj = vt2Var;
            } else {
                i3 = 0;
                obj = objQ10;
            }
            kb4 kb4Var3 = (kb4) obj;
            int i6 = i4 & 896;
            int i7 = (dd4Var.f(a07Var) ? 1 : 0) | (i6 == 256 ? 1 : i3);
            Object objQ11 = dd4Var.Q();
            Object obj11 = objQ11;
            if (i7 != 0 || objQ11 == fu6Var) {
                wt2 wt2Var = new wt2(t27Var2, a07Var, i3);
                dd4Var.p0(wt2Var);
                obj11 = wt2Var;
            }
            sw1.m(zBooleanValue, kb4Var2, kb4Var3, (kb4) obj11, dd4Var, 0);
            boolean zBooleanValue2 = ((Boolean) a07Var2.getValue()).booleanValue();
            String strL = wn9.L((pv9) mu9.d0.getValue(), new Object[]{to3Var2.b}, dd4Var);
            boolean zF8 = dd4Var.f(a07Var2);
            Object objQ12 = dd4Var.Q();
            Object obj12 = objQ12;
            if (zF8 || objQ12 == fu6Var) {
                r02 r02Var2 = new r02(a07Var2, 12);
                dd4Var.p0(r02Var2);
                obj12 = r02Var2;
            }
            kb4 kb4Var4 = (kb4) obj12;
            int i8 = (dd4Var.f(a07Var2) ? 1 : 0) | (i6 == 256 ? 1 : i3) | ((i4 & Token.ASSIGN_MOD) != 32 ? i3 : 1);
            Object objQ13 = dd4Var.Q();
            Object obj13 = objQ13;
            if (i8 != 0 || objQ13 == fu6Var) {
                v6 v6Var = new v6(27, t27Var2, to3Var2, a07Var2);
                dd4Var.p0(v6Var);
                obj13 = v6Var;
            }
            wx1.p(zBooleanValue2, "", strL, kb4Var4, (kb4) obj13, dd4Var, 48);
            boolean zBooleanValue3 = ((Boolean) a07Var3.getValue()).booleanValue();
            String str = to3Var2.a;
            boolean zF9 = dd4Var.f(a07Var3);
            Object objQ14 = dd4Var.Q();
            Object obj14 = objQ14;
            if (zF9 || objQ14 == fu6Var) {
                r02 r02Var3 = new r02(a07Var3, 13);
                dd4Var.p0(r02Var3);
                obj14 = r02Var3;
            }
            kb4 kb4Var5 = (kb4) obj14;
            boolean zF10 = dd4Var.f(a07Var3);
            if (i6 == 256) {
                i3 = 1;
            }
            int i9 = (zF10 ? 1 : 0) | i3;
            Object objQ15 = dd4Var.Q();
            Object obj15 = objQ15;
            if (i9 != 0 || objQ15 == fu6Var) {
                xj0 xj0Var = new xj0(t27Var2, a07Var3, 8);
                dd4Var.p0(xj0Var);
                obj15 = xj0Var;
            }
            wn9.c(zBooleanValue3, null, str, kb4Var5, (ib4) obj15, dd4Var, 0);
        } else {
            to3Var2 = to3Var;
            t27Var2 = t27Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new z41(z2, to3Var2, t27Var2, ou6Var, kb4Var, i2);
        }
    }

    public static float f0(float f2, float... fArr) {
        for (float f3 : fArr) {
            f2 = Math.min(f2, f3);
        }
        return f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.to3 r27, defpackage.pt2 r28, defpackage.u4b r29, defpackage.t27 r30, ou6 r31, defpackage.ib4 r32, defpackage.ib4 r33, defpackage.ib4 r34, defpackage.ib4 r35, dd4 r36, int r37) {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t1c.g(to3, pt2, u4b, t27, ou6, ib4, ib4, ib4, ib4, dd4, int):void");
    }

    public static Comparable g0(x13 x13Var, x13 x13Var2) {
        return x13Var.compareTo(x13Var2) <= 0 ? x13Var : x13Var2;
    }

    public static final void h(to3 to3Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i2) {
        int i3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1934240732);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? dd4Var2.f(to3Var) : dd4Var2.h(to3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.h(ib4Var2) ? 2048 : 1024;
        }
        int i4 = i3;
        if (dd4Var2.V(i4 & 1, (i4 & 1171) != 1170)) {
            ou6 ou6VarH = tg9.h(ou6Var, 40.0f);
            eq8 eq8VarA = dq8.a(pv.e, bv4.x, dd4Var2, 54);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarH);
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
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.r(lu6Var, 8.0f));
            ou6 ou6VarN = tg9.n(lu6Var, 40.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(ou6VarN, rp8Var);
            boolean z2 = (i4 & 7168) == 2048;
            Object objQ = dd4Var2.Q();
            fu6 fu6Var = vl1.a;
            if (z2 || objQ == fu6Var) {
                objQ = new mh1(12, ib4Var2);
                dd4Var2.p0(objQ);
            }
            mx4.a(i25.c((m53) f53.i0.getValue(), dd4Var2, 0), (String) null, gjb.l0(fw.J(null, (ib4) objQ, ou6VarW, false, 15), 10.0f), 0L, dd4Var2, 48, 8);
            un9.a(dd4Var2, tg9.r(lu6Var, 4.0f));
            ou6 ou6VarL = fe.L(t96.w(gjb.l0(tg9.n(lu6Var, 40.0f), 6.0f), rp8Var), ((q96) dd4Var2.j(s96.a)).a.a, jf0.G);
            boolean z3 = (i4 & 896) == 256;
            Object objQ2 = dd4Var2.Q();
            if (z3 || objQ2 == fu6Var) {
                objQ2 = new mh1(13, ib4Var);
                dd4Var2.p0(objQ2);
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ2, ou6VarL, false, 15);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarJ);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            w05.a(new po3(to3Var.r, to3Var.a, to3Var.c), ra1.d, false, null, null, tg9.c, null, dd4Var, 1572912, 444);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new au2(to3Var, ou6Var, ib4Var, ib4Var2, i2, 0);
        }
    }

    public static final void i(String str, zk7 zk7Var, final List list, boolean z2, final pj7 pj7Var, final szb szbVar, final t27 t27Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        String str2;
        int i3;
        final boolean z3;
        dd4Var.h0(1171848939);
        if ((i2 & 6) == 0) {
            str2 = str;
            i3 = (dd4Var.f(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(zk7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(list) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            z3 = z2;
            i3 |= dd4Var.g(z3) ? 2048 : 1024;
        } else {
            z3 = z2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.f(szbVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.f(t27Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (dd4Var.V(i4 & 1, (4793491 & i4) != 4793490)) {
            final String str3 = str2;
            e11.e(zk7Var, ou6Var, null, null, 0, 0.0f, null, null, false, null, null, null, jf0.G(369140682, new ac4() { // from class: xt2
                @Override // defpackage.ac4
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                    dd4 dd4Var2;
                    int iIntValue = ((Integer) obj2).intValue();
                    dd4 dd4Var3 = (dd4) obj3;
                    ((Integer) obj4).getClass();
                    ((rk7) obj).getClass();
                    boolean z4 = z3;
                    String str4 = str3;
                    t27 t27Var2 = t27Var;
                    pj7 pj7Var2 = pj7Var;
                    szb szbVar2 = szbVar;
                    List list2 = list;
                    if (z4) {
                        dd4Var3.f0(1953827785);
                        if (iIntValue == 0) {
                            dd4Var3.f0(1953840433);
                            dd4Var2 = dd4Var3;
                            p7c.g(str4, t27Var2, pj7Var2, szbVar2, tg9.c, dd4Var2, 24576);
                            dd4Var2.q(false);
                        } else {
                            dd4Var3.f0(1954173435);
                            gc1.k(str4, ((nz0) list2.get(iIntValue - 1)).b, t27Var2, pj7Var2, szbVar2, tg9.c, dd4Var3, 196608);
                            dd4Var2 = dd4Var3;
                            dd4Var2.q(false);
                        }
                        dd4Var2.q(false);
                    } else {
                        dd4Var3.f0(1954597639);
                        gc1.k(str4, ((nz0) list2.get(iIntValue)).b, t27Var2, pj7Var2, szbVar2, tg9.c, dd4Var3, 196608);
                        dd4Var3.q(false);
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, ((i4 >> 3) & 14) | ((i4 >> 18) & Token.ASSIGN_MOD), 16380);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new is0(str, zk7Var, list, z2, pj7Var, szbVar, t27Var, ou6Var, i2);
        }
    }

    public static final ou6 i0(ou6 ou6Var) {
        return Build.VERSION.SDK_INT < 29 ? ou6Var : ou6Var.e(new zh3((kb4) null));
    }

    public static final void j(to3 to3Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i2) {
        int i3;
        int i4;
        to3 to3Var2 = to3Var;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-2141768862);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? dd4Var2.f(to3Var2) : dd4Var2.h(to3Var2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.h(ib4Var2) ? 2048 : 1024;
        }
        int i5 = i3;
        if (dd4Var2.V(i5 & 1, (i5 & 1171) != 1170)) {
            ou6 ou6VarH = tg9.h(ou6Var, 40.0f);
            eq8 eq8VarA = dq8.a(pv.e, bv4.x, dd4Var2, 54);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarH);
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
            lu6 lu6Var = lu6.a;
            ou6 ou6VarN = tg9.n(lu6Var, 40.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(ou6VarN, rp8Var);
            boolean z2 = (i5 & 7168) == 2048;
            Object objQ = dd4Var2.Q();
            fu6 fu6Var = vl1.a;
            if (z2 || objQ == fu6Var) {
                objQ = new mh1(14, ib4Var2);
                dd4Var2.p0(objQ);
            }
            mx4.a(i25.c((m53) f53.i0.getValue(), dd4Var2, 0), (String) null, gjb.l0(fw.J(null, (ib4) objQ, ou6VarW, false, 15), 8.0f), 0L, dd4Var2, 48, 8);
            un9.a(dd4Var2, tg9.r(lu6Var, 8.0f));
            ou6 ou6VarL = fe.L(t96.w(gjb.l0(tg9.n(lu6Var, 40.0f), 6.0f), rp8Var), ((q96) dd4Var2.j(s96.a)).a.a, jf0.G);
            boolean z3 = (i5 & 896) == 256;
            Object objQ2 = dd4Var2.Q();
            if (z3 || objQ2 == fu6Var) {
                i4 = 15;
                objQ2 = new mh1(15, ib4Var);
                dd4Var2.p0(objQ2);
            } else {
                i4 = 15;
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ2, ou6VarL, false, i4);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarJ);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            to3Var2 = to3Var;
            w05.a(new po3(to3Var2.a), ra1.d, false, null, null, tg9.c, null, dd4Var, 1572912, 444);
            dd4Var2 = dd4Var;
            ky0.A(dd4Var2, true, lu6Var, 8.0f, dd4Var2);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new au2(to3Var2, ou6Var, ib4Var, ib4Var2, i2, 1);
        }
    }

    public static final ou6 j0(ou6 ou6Var, kb4 kb4Var) {
        return Build.VERSION.SDK_INT < 29 ? ou6Var : ou6Var.e(new zh3(kb4Var));
    }

    public static final void k(final u4b u4bVar, final to3 to3Var, final List list, final zk7 zk7Var, final boolean z2, final ou6 ou6Var, final kb4 kb4Var, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final ib4 ib4Var4, dd4 dd4Var, final int i2, final int i3) {
        int i4;
        int i5;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(562286809);
        if ((i2 & 6) == 0) {
            i4 = (dd4Var2.f(u4bVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? dd4Var2.f(to3Var) : dd4Var2.h(to3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= dd4Var2.h(list) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dd4Var2.f(zk7Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dd4Var2.g(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= dd4Var2.f(ou6Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i4 |= dd4Var2.h(kb4Var) ? 1048576 : 524288;
        }
        if ((100663296 & i2) == 0) {
            i4 |= dd4Var2.h(ib4Var2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= dd4Var2.h(ib4Var3) ? 536870912 : 268435456;
        }
        int i6 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (dd4Var2.h(ib4Var4) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (dd4Var2.V(i6 & 1, ((i6 & 302589075) == 302589074 && (i5 & 3) == 2) ? false : true)) {
            ou6 ou6VarY = yn2.y(dd4Var2, ou6Var);
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarY);
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
            int i7 = i5;
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarP0 = gjb.p0(gjb.n0(yib.B(tg9.f(lu6Var, 1.0f), 1), 12.0f, 0.0f, 2), 0.0f, 6.0f, 0.0f, 0.0f, 13);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarP0);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            ou6 ou6VarP02 = gjb.p0(tg9.h(ky0.g(dd4Var2, ou6VarL02, jmVar4, 1.0f, true), 40.0f), 12.0f, 0.0f, 0.0f, 0.0f, 14);
            ie1 ie1VarA2 = ge1.a(jvVar, bv4.A, dd4Var2, 48);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarP02);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            String str = to3Var.b;
            ur9 ur9Var = s96.a;
            nha.c(str, tg9.f(lu6Var, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 48, 24960, 109564);
            nha.c(to3Var.d, tg9.f(lu6Var, 1.0f), lc1.c(0.5f, ((q96) dd4Var.j(ur9Var)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.l, dd4Var, 48, 24960, 109560);
            dd4Var.q(true);
            wn9.h(u4bVar, false, null, new rj7(3.0f, 3.0f, 3.0f, 3.0f), ib4Var4, dd4Var, (i6 & 14) | 3072 | ((i7 << 12) & 57344), 6);
            int i8 = i6 >> 18;
            h(to3Var, gjb.n0(lu6Var, 0.0f, 6.0f, 1), ib4Var2, ib4Var3, dd4Var, 48 | ((i6 >> 3) & 14) | (i8 & 896) | (i8 & 7168));
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            if (list.isEmpty()) {
                dd4Var2.f0(2001857779);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(2001545454);
                c(list, zk7Var, z2, gjb.p0(tg9.f(lu6Var, 1.0f), 12.0f, 0.0f, 12.0f, 6.0f, 2), kb4Var, dd4Var2, (i6 >> 6) & 58366);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: yt2
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(i2 | 1);
                    int iX02 = qu1.x0(i3);
                    t1c.k(u4bVar, to3Var, list, zk7Var, z2, ou6Var, kb4Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, (dd4) obj, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    public static final Object[] k0(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = b;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i3);
            }
            i2 = i3;
        }
    }

    public static final void l(u4b u4bVar, to3 to3Var, List list, zk7 zk7Var, boolean z2, ou6 ou6Var, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, dd4 dd4Var, int i2) {
        int i3;
        ib4 ib4Var4;
        int i4;
        int i5;
        boolean z3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1729980783);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(u4bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? dd4Var2.f(to3Var) : dd4Var2.h(to3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.h(list) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.f(zk7Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var2.g(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var2.h(kb4Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            ib4Var4 = ib4Var;
            i3 |= dd4Var2.h(ib4Var4) ? 8388608 : 4194304;
        } else {
            ib4Var4 = ib4Var;
        }
        if ((100663296 & i2) == 0) {
            i3 |= dd4Var2.h(ib4Var2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= dd4Var2.h(ib4Var3) ? 536870912 : 268435456;
        }
        if (dd4Var2.V(i3 & 1, (306783379 & i3) != 306783378)) {
            int i6 = i3 >> 15;
            ou6 ou6VarN0 = gjb.n0(yib.B(yn2.y(dd4Var2, ou6Var), 1), 0.0f, 8.0f, 1);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarN0);
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
            if (list.isEmpty()) {
                i4 = i3;
                i5 = i6;
                dd4Var2.f0(-1035833745);
                if (1.0f <= 0.0d) {
                    o75.a("invalid weight; must be greater than zero");
                }
                z3 = true;
                un9.a(dd4Var2, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-1036080908);
                i4 = i3;
                if (1.0f <= 0.0d) {
                    o75.a("invalid weight; must be greater than zero");
                }
                i5 = i6;
                c(list, zk7Var, z2, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), kb4Var, dd4Var2, (i4 >> 6) & 58366);
                dd4Var2.q(false);
                z3 = true;
            }
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.r(lu6Var, 6.0f));
            wn9.h(u4bVar, false, null, new rj7(3.0f, 3.0f, 3.0f, 3.0f), ib4Var3, dd4Var2, (i4 & 14) | 3072 | (57344 & i5), 6);
            un9.a(dd4Var2, tg9.r(lu6Var, 6.0f));
            j(to3Var, gjb.p0(lu6Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), ib4Var4, ib4Var2, dd4Var2, 48 | ((i4 >> 3) & 14) | (i5 & 896) | (i5 & 7168));
            dd4Var2 = dd4Var2;
            dd4Var2.q(z3);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new zt2(u4bVar, to3Var, list, zk7Var, z2, ou6Var, kb4Var, ib4Var, ib4Var2, ib4Var3, i2);
        }
    }

    public static final Object[] l0(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final void m(p35 p35Var, String str, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        p35 p35Var2;
        int i3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-822472021);
        if ((i2 & 6) == 0) {
            p35Var2 = p35Var;
            i3 = (dd4Var2.f(p35Var2) ? 4 : 2) | i2;
        } else {
            p35Var2 = p35Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 2048 : 1024;
        }
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            ou6 ou6VarM0 = gjb.m0(fw.J(null, ib4Var, ou6Var, false, 15), 8.0f, 16.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.A, dd4Var2, 48);
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
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            lu6 lu6Var = lu6.a;
            mx4.a(p35Var2, (String) null, tg9.n(lu6Var, 24.0f), 0L, dd4Var2, (i3 & 14) | 432, 8);
            un9.a(dd4Var2, tg9.h(lu6Var, 4.0f));
            nha.c(str, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.k, dd4Var, (i3 >> 3) & 14, 0, 130046);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ln3(p35Var, str, ou6Var, ib4Var, i2, 0);
        }
    }

    public static String m0(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (b0(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (b0(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static final void n(dr3 dr3Var, cr3 cr3Var, ou6 ou6Var, yb4 yb4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-216271855);
        int i3 = (dd4Var.f(dr3Var) ? 4 : 2) | i2 | (dd4Var.h(cr3Var) ? 32 : 16) | (dd4Var.h(yb4Var) ? 2048 : 1024);
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            u(wn9.K((pv9) eu9.A0.getValue(), dd4Var), ou6Var, jf0.G(445483270, new c41(14, cr3Var, dr3Var, yb4Var), dd4Var), dd4Var, 432);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ev0(dr3Var, cr3Var, ou6Var, yb4Var, i2, 17);
        }
    }

    public static String n0(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static final void o(gn3 gn3Var, fn3 fn3Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, dd4 dd4Var, int i2) {
        fn3 fn3Var2;
        kb4 kb4Var4;
        gn3 gn3Var2;
        kb4 kb4Var5;
        kb4 kb4Var6;
        dd4Var.h0(-993237254);
        int i3 = (dd4Var.f(gn3Var) ? 4 : 2) | i2 | (dd4Var.f(fn3Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 16384 : 8192) | (dd4Var.h(kb4Var3) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i3 & 1, (74899 & i3) != 74898)) {
            String strK = wn9.K((pv9) eu9.v0.getValue(), dd4Var);
            fn3Var2 = fn3Var;
            kb4Var4 = kb4Var3;
            sz0 sz0Var = new sz0(fn3Var2, gn3Var, kb4Var, kb4Var2, kb4Var4, 7);
            gn3Var2 = gn3Var;
            kb4Var6 = kb4Var;
            kb4Var5 = kb4Var2;
            u(strK, ou6Var, jf0.G(-1492475601, sz0Var, dd4Var), dd4Var, 432);
        } else {
            fn3Var2 = fn3Var;
            kb4Var4 = kb4Var3;
            gn3Var2 = gn3Var;
            kb4Var5 = kb4Var2;
            kb4Var6 = kb4Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uq6(gn3Var2, fn3Var2, ou6Var, kb4Var6, kb4Var5, kb4Var4, i2);
        }
    }

    public static final void p(String str, ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-862175090);
        int i3 = 4;
        int i4 = (dd4Var.f(str) ? 4 : 2) | i2;
        int i5 = 1;
        if (dd4Var.V(i4 & 1, (i4 & 19) != 18)) {
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = lc5.Z(dd4Var);
                dd4Var.p0(objQ);
            }
            vx1 vx1Var = (vx1) objQ;
            Object[] objArr = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new tl3(5);
                dd4Var.p0(objQ2);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ2, dd4Var, 48);
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = dk9.x("");
                dd4Var.p0(objQ3);
            }
            a07 a07Var2 = (a07) objQ3;
            int i6 = i4 & 14;
            boolean z2 = i6 == 4;
            Object objQ4 = dd4Var.Q();
            int i7 = 13;
            if (z2 || objQ4 == obj) {
                objQ4 = new hl2(str, a07Var2, null, i7);
                dd4Var.p0(objQ4);
            }
            lc5.u((yb4) objQ4, dd4Var, str);
            u(wn9.K((pv9) eu9.x0.getValue(), dd4Var), ou6Var, jf0.G(1047633593, new c41(i7, a07Var, (Object) a07Var2, (Object) str), dd4Var), dd4Var, 432);
            String str2 = (String) a07Var2.getValue();
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            boolean zF = dd4Var.f(a07Var);
            Object objQ5 = dd4Var.Q();
            if (zF || objQ5 == obj) {
                objQ5 = new wf3(a07Var, i7);
                dd4Var.p0(objQ5);
            }
            kb4 kb4Var = (kb4) objQ5;
            boolean zH = dd4Var.h(vx1Var) | (i6 == 4);
            Object objQ6 = dd4Var.Q();
            if (zH || objQ6 == obj) {
                objQ6 = new fb3(i5, vx1Var, a07Var2, str);
                dd4Var.p0(objQ6);
            }
            ny1.e(0, kb4Var, (kb4) objQ6, dd4Var, str2, zBooleanValue);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b7(str, ou6Var, i2, i3);
        }
    }

    public static final void q(String str, t27 t27Var, dd4 dd4Var, int i2) {
        t27 t27Var2;
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(-1706672914);
        int i3 = (dd4Var.f(str) ? 4 : 2) | i2 | (dd4Var.f(t27Var) ? 32 : 16);
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new wj0(str, 24);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            yn3 yn3Var = (yn3) ((qtb) qx1.N(ug8.a(yn3.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), ib4Var));
            a07 a07VarB = bx1.B(yn3Var.s, dd4Var);
            fn2 fn2VarT0 = lx1.t0(dd4Var);
            Object[] objArr = new Object[0];
            rt8 rt8Var = r83.e;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new uj6(3);
                dd4Var.p0(objQ2);
            }
            r83 r83Var = (r83) ww1.d0(objArr, rt8Var, (ib4) objQ2, dd4Var, 384);
            t27Var2 = t27Var;
            gx1.p(wn9.K((pv9) zt9.p0.getValue(), dd4Var), tg9.c, false, jf0.G(838711026, new q41(t27Var, 23), dd4Var), t96.h, jf0.G(518973796, new p02(a07VarB, t27Var, fn2VarT0, yn3Var, r83Var), dd4Var), dd4Var, 224304, 4);
            boolean zF = dd4Var.f(yn3Var) | ((i3 & Token.ASSIGN_MOD) == 32);
            Object objQ3 = dd4Var.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new n82(27, yn3Var, t27Var2);
                dd4Var.p0(objQ3);
            }
            lx1.i(fn2VarT0, (kb4) objQ3, dd4Var, 0);
            boolean zF2 = dd4Var.f(yn3Var);
            Object objQ4 = dd4Var.Q();
            if (zF2 || objQ4 == obj) {
                objQ4 = new ah(yn3Var, 14);
                dd4Var.p0(objQ4);
            }
            qu1.f(r83Var, (yb4) objQ4, dd4Var, 0);
        } else {
            t27Var2 = t27Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yj0(str, t27Var2, i2, 8);
        }
    }

    public static final void r(String str, ou6 ou6Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        dd4Var.h0(-305031495);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2) | 48;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var.j(ur9Var)).b.k;
            long jC = lc1.c(0.65f, ((q96) dd4Var.j(ur9Var)).a.q);
            ou6 ou6Var3 = lu6.a;
            nha.c(str, gjb.m0(fe.L(t96.w(tg9.f(ou6Var3, 1.0f), ((q96) dd4Var.j(ur9Var)).c.c), dd1.g(((q96) dd4Var.j(ur9Var)).a, 6.0f), jf0.G), 14.0f, 12.0f), jC, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, i3 & 14, 0, 131064);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b7(str, ou6Var2, i2, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(defpackage.to3 r57, ou6 r58, defpackage.ib4 r59, defpackage.ib4 r60, defpackage.ib4 r61, dd4 r62, int r63, int r64) {
        /*
            Method dump skipped, instruction units count: 1475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t1c.s(to3, ou6, ib4, ib4, ib4, dd4, int, int):void");
    }

    public static final void t(ou6 ou6Var, rj1 rj1Var, dd4 dd4Var, int i2) {
        dd4Var.h0(1373963882);
        int i3 = i2 | 6;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            ou6 ou6Var2 = lu6.a;
            ou6 ou6VarF = tg9.f(ou6Var2, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarL = fe.L(t96.w(ou6VarF, ((q96) dd4Var.j(ur9Var)).c.c), dd1.g(((q96) dd4Var.j(ur9Var)).a, 6.0f), jf0.G);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarL);
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
            rj1Var.c(ke1.a, dd4Var, 54);
            dd4Var.q(true);
            ou6Var = ou6Var2;
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vu1(ou6Var, rj1Var, i2, 2);
        }
    }

    public static final void u(String str, ou6 ou6Var, rj1 rj1Var, dd4 dd4Var, int i2) {
        int i3;
        rj1 rj1Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-928399489);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.h(rj1Var) ? 256 : Token.CASE;
        }
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ur9 ur9Var = s96.a;
            ou6 ou6VarL0 = gjb.l0(fe.L(t96.w(ou6Var, ((q96) dd4Var2.j(ur9Var)).c.d), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 2.0f), jf0.G), 18.0f);
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
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.g;
            lu6 lu6Var = lu6.a;
            nha.c(str, tg9.f(lu6Var, 1.0f), ((q96) dd4Var2.j(ur9Var)).a.a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, (i3 & 14) | 48, 0, 131064);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.h(lu6Var, 20.0f));
            rj1Var2 = rj1Var;
            rj1Var2.c(ke1.a, dd4Var2, Integer.valueOf(((i3 >> 3) & Token.ASSIGN_MOD) | 6));
            dd4Var2.q(true);
        } else {
            rj1Var2 = rj1Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nn3(str, ou6Var, rj1Var2, i2);
        }
    }

    public static final void v(xo3 xo3Var, ou6 ou6Var, ib4 ib4Var, yb4 yb4Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        xo3 xo3Var2;
        kb4 kb4Var2;
        yb4 yb4Var2;
        ib4 ib4Var2;
        dd4Var.h0(1875484875);
        int i3 = (dd4Var.h(xo3Var) ? 4 : 2) | i2 | (dd4Var.h(ib4Var) ? 256 : Token.CASE) | (dd4Var.h(yb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var) ? 16384 : 8192);
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            String strK = wn9.K((pv9) eu9.B0.getValue(), dd4Var);
            xo3Var2 = xo3Var;
            kb4Var2 = kb4Var;
            hu2 hu2Var = new hu2(xo3Var2, ib4Var, yb4Var, kb4Var2, 9);
            ib4Var2 = ib4Var;
            yb4Var2 = yb4Var;
            u(strK, ou6Var, jf0.G(199585984, hu2Var, dd4Var), dd4Var, 432);
        } else {
            xo3Var2 = xo3Var;
            kb4Var2 = kb4Var;
            yb4Var2 = yb4Var;
            ib4Var2 = ib4Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uj0(xo3Var2, ou6Var, ib4Var2, yb4Var2, kb4Var2, i2);
        }
    }

    public static final void w(String str, ou6 ou6Var, long j2, long j3, dd4 dd4Var, int i2, int i3) {
        int i4;
        long jG;
        long jB;
        ou6 ou6Var2;
        long j4;
        long j5;
        int i5;
        ou6 ou6Var3;
        int i6;
        dd4Var.h0(1219270835);
        if ((i2 & 6) == 0) {
            i4 = (dd4Var.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i4 | 48;
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                jG = j2;
                if (dd4Var.e(jG)) {
                    i6 = 256;
                }
                i7 |= i6;
            } else {
                jG = j2;
            }
            i6 = Token.CASE;
            i7 |= i6;
        } else {
            jG = j2;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                jB = j3;
                int i8 = dd4Var.e(jB) ? 2048 : 1024;
                i7 |= i8;
            } else {
                jB = j3;
            }
            i7 |= i8;
        } else {
            jB = j3;
        }
        if (dd4Var.V(i7 & 1, (i7 & 1171) != 1170)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                if ((i3 & 4) != 0) {
                    jG = dd1.g(((q96) dd4Var.j(s96.a)).a, 6.0f);
                    i7 &= -897;
                }
                int i9 = i3 & 8;
                ou6 ou6Var4 = lu6.a;
                if (i9 != 0) {
                    jB = dd1.b(((q96) dd4Var.j(s96.a)).a.h, dd4Var);
                    i7 &= -7169;
                }
                i5 = i7;
                ou6Var3 = ou6Var4;
            } else {
                dd4Var.Y();
                if ((i3 & 4) != 0) {
                    i7 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i7 &= -7169;
                }
                i5 = i7;
                ou6Var3 = ou6Var;
            }
            dd4Var.r();
            long jX = wn9.x(10);
            ur9 ur9Var = s96.a;
            long j6 = jB;
            nha.c(str, gjb.m0(fe.L(t96.w(ou6Var3, ((q96) dd4Var.j(ur9Var)).c.a), jG, jf0.G), 7.0f, 2.0f), j6, (g60) null, jX, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.l, dd4Var, (i5 & 14) | 24576 | ((i5 >> 3) & 896), 24576, 114664);
            j5 = j6;
            ou6Var2 = ou6Var3;
            j4 = jG;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
            j4 = jG;
            j5 = jB;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new kn3(str, ou6Var2, j4, j5, i2, i3, 0);
        }
    }

    public static final void x(qb7 qb7Var, f9 f9Var, rj1 rj1Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(-1090171650);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? dd4Var.f(qb7Var) : dd4Var.h(qb7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(f9Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(rj1Var) ? 256 : Token.CASE;
        }
        boolean z2 = true;
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            boolean z3 = (i3 & Token.ASSIGN_MOD) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !dd4Var.f(qb7Var))) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objQ = dd4Var.Q();
            if (z4 || objQ == vl1.a) {
                objQ = new aj4(f9Var, qb7Var);
                dd4Var.p0(objQ);
            }
            ci.a((aj4) objQ, (ib4) null, new kz7(false, sy8.a, false), rj1Var, dd4Var, ((i3 << 3) & 7168) | 384, 2);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yi(qb7Var, f9Var, rj1Var, i2, 0);
        }
    }

    public static final void y(boolean z2, xga xgaVar, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, ib4 ib4Var, dd4 dd4Var, int i2) {
        int i3;
        xgaVar.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        kb4Var3.getClass();
        kb4Var4.getClass();
        ib4Var.getClass();
        dd4Var.h0(1875142916);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(xgaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(kb4Var3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var4) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 1048576 : 524288;
        }
        if (!dd4Var.V(i3 & 1, (599187 & i3) != 599186)) {
            dd4Var.Y();
        } else if (xzb.a(dd4Var)) {
            dd4Var.f0(2038253034);
            A(z2, xgaVar, kb4Var, kb4Var2, kb4Var3, kb4Var4, ib4Var, dd4Var, i3 & 4194302);
            dd4Var.q(false);
        } else {
            dd4Var.f0(2038564553);
            z(z2, xgaVar, kb4Var, kb4Var2, kb4Var3, kb4Var4, ib4Var, dd4Var, i3 & 4194302);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tq6(z2, xgaVar, kb4Var, kb4Var2, kb4Var3, kb4Var4, ib4Var, i2, 0);
        }
    }

    public static final void z(boolean z2, xga xgaVar, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, ib4 ib4Var, dd4 dd4Var, int i2) {
        boolean z3;
        int i3;
        dd4Var.h0(-1476274029);
        if ((i2 & 6) == 0) {
            z3 = z2;
            i3 = (dd4Var.g(z3) ? 4 : 2) | i2;
        } else {
            z3 = z2;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(xgaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(kb4Var3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var4) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 1048576 : 524288;
        }
        if (dd4Var.V(i3 & 1, (599187 & i3) != 599186)) {
            fw.r(z3, kb4Var, null, true, 0L, 0L, 0.0f, 0L, 0.0f, jf0.G(-2080049214, new uq6(xgaVar, kb4Var2, kb4Var3, kb4Var4, ib4Var, kb4Var), dd4Var), dd4Var, (i3 & 14) | 805309440 | ((i3 >> 3) & Token.ASSIGN_MOD), 500);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tq6(z2, xgaVar, kb4Var, kb4Var2, kb4Var3, kb4Var4, ib4Var, i2, 1);
        }
    }

    public abstract Intent Q(Context context, Object obj);

    public abstract int S(StringBuilder sb, byte[] bArr, int i2);

    public abstract void V(b10 b10Var, String str, int i2);

    public abstract int X(int i2);

    public abstract int Y(int i2);

    public gi8 a0(Context context, Object obj) {
        return null;
    }

    public abstract Object h0(Intent intent, int i2);
}
