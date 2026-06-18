package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class qz0 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qz0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        kr3 kr3Var = (kr3) this.c;
        ib4 ib4Var = (ib4) this.b;
        dq5 dq5Var = (dq5) obj;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        dq5Var.getClass();
        int i = 2;
        if ((iIntValue & 6) == 0) {
            iIntValue |= dd4Var.f(dq5Var) ? 4 : 2;
        }
        if (dd4Var.V(iIntValue & 1, (iIntValue & 19) != 18)) {
            gc1.r(kr3Var.j.size(), 3072, 0, jf0.G(1674814789, new lo(i, ib4Var), dd4Var), dd4Var, dq5.a(dq5Var, tg9.f(lu6.a, 1.0f)), wn9.K((pv9) ev9.U.getValue(), dd4Var));
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        zl4 zl4Var = (zl4) this.b;
        kb4 kb4Var = (kb4) this.c;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((dq5) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean z = zl4Var.g;
            String strK = wn9.K((pv9) ru9.v0.getValue(), dd4Var);
            String strK2 = wn9.K((pv9) ru9.w0.getValue(), dd4Var);
            ou6 ou6VarF = tg9.f(lu6.a, 1.0f);
            ur9 ur9Var = s96.a;
            e11.x(null, strK, strK2, gjb.l0(fe.L(t96.w(ou6VarF, ((q96) dd4Var.j(ur9Var)).c.d), dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G), 16.0f), false, z, kb4Var, dd4Var, 0, 17);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        gm5 gm5Var = (gm5) this.b;
        kb4 kb4Var = (kb4) this.c;
        dq5 dq5Var = (dq5) obj;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        dq5Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= dd4Var.f(dq5Var) ? 4 : 2;
        }
        if (dd4Var.V(iIntValue & 1, (iIntValue & 19) != 18)) {
            String strK = wn9.K((pv9) iu9.e.getValue(), dd4Var);
            vl5 vl5Var = gm5Var.a;
            boolean z = (vl5Var != null ? vl5Var.b : null) == null;
            ou6 ou6VarQ = t96.Q(dd4Var, dq5.a(dq5Var, tg9.f(lu6.a, 1.0f)));
            boolean zF = dd4Var.f(kb4Var);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                objQ = new mj(7, kb4Var);
                dd4Var.p0(objQ);
            }
            e11.w(strK, "", ou6VarQ, false, z, (kb4) objQ, dd4Var, 48, 8);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        zd1 zd1Var = (zd1) this.b;
        zb4 zb4Var = (zb4) this.c;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ke1) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            kc5.a(zd1Var, yib.B(gjb.l0(tg9.f(lu6.a, 1.0f), 12.0f), 14), zb4Var, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        kr3 kr3Var = (kr3) this.b;
        kb4 kb4Var = (kb4) this.c;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ke1) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            String strK = wn9.K((pv9) mu9.q.getValue(), dd4Var);
            String strK2 = wn9.K((pv9) mu9.r.getValue(), dd4Var);
            boolean z = kr3Var.b;
            ou6 ou6VarM0 = gjb.m0(tg9.f(lu6.a, 1.0f), 14.0f, 12.0f);
            boolean zF = dd4Var.f(kb4Var);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                objQ = new mj(10, kb4Var);
                dd4Var.p0(objQ);
            }
            e11.x(null, strK, strK2, ou6VarM0, false, z, (kb4) objQ, dd4Var, 3072, 17);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        zy4 zy4Var = (zy4) this.b;
        i45 i45Var = (i45) this.c;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ke1) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            lu6 lu6Var = lu6.a;
            ou6 ou6VarQ = kc5.Q(tg9.f(lu6Var, 1.0f), kc5.J(dd4Var), 14);
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
            h67.l(zy4Var, i45Var, gjb.k0(tg9.f(lu6Var, 1.0f), yib.d(6, dd4Var, false)), dd4Var, 0);
            un9.a(dd4Var, tg9.h(lu6Var, yib.z(dd4Var) + 8.0f));
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        m55 m55Var = (m55) this.b;
        kb4 kb4Var = (kb4) this.c;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((co0) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            List list = (List) m55Var.b.getValue();
            ou6 ou6VarF = tg9.f(lu6.a, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarL = fe.L(t96.w(ou6VarF, ((q96) dd4Var.j(ur9Var)).c.c), dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G);
            boolean zF = dd4Var.f(m55Var);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                objQ = new uk2(m55Var, 28);
                dd4Var.p0(objQ);
            }
            cx1.c(list, ou6VarL, kb4Var, (ib4) objQ, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        ac4 ac4Var = (ac4) this.b;
        a07 a07Var = (a07) this.c;
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        str.getClass();
        str2.getClass();
        str3.getClass();
        ac4Var.g(str, str2, str3, (String) a07Var.getValue());
        return heb.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        bc9 bc9Var = (bc9) this.b;
        kb4 kb4Var = (kb4) this.c;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ke1) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            int i = bc9Var.a;
            ou6 ou6VarF = tg9.f(lu6.a, 1.0f);
            boolean zF = dd4Var.f(kb4Var);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                objQ = new mj(13, kb4Var);
                dd4Var.p0(objQ);
            }
            gc1.A(i, 48, (kb4) objQ, dd4Var, ou6VarF);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        yba ybaVar = (yba) this.b;
        ac4 ac4Var = (ac4) this.c;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((dr5) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            gjb.r(ybaVar.D, ybaVar.F, ybaVar.E, ybaVar.G, tg9.f(lu6.a, 1.0f), ac4Var, dd4Var, 24576);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        co0 co0Var = (co0) this.b;
        kb4 kb4Var = (kb4) this.c;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ke1) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            ww1.A(gjb.p0(yib.B(tg9.h(tg9.f(lu6.a, 1.0f), co0Var.c() * 0.8f), 14), 0.0f, 0.0f, 0.0f, 12.0f, 7), kb4Var, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        c17 c17Var = (c17) this.b;
        br9 br9Var = (br9) this.c;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((fq8) obj).getClass();
        if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            dd4Var.Y();
        } else if (((a17) br9Var.getValue()).b.isEmpty()) {
            dd4Var.f0(-23663704);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-23851099);
            p35 p35VarC = i25.c((m53) a53.I.getValue(), dd4Var, 0);
            boolean zF = dd4Var.f(c17Var);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                d7 d7Var = new d7(0, c17Var, c17.class, "clearSkips", "clearSkips()V", 0, 24);
                dd4Var.p0(d7Var);
                objQ = d7Var;
            }
            sw1.r(p35VarC, (ou6) null, 0L, (ib4) ((ei5) objQ), dd4Var, 0, 6);
            dd4Var.q(false);
        }
        return heb.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        c97 c97Var = (c97) this.b;
        br9 br9Var = (br9) this.c;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((fq8) obj).getClass();
        if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            dd4Var.Y();
        } else if (((a97) br9Var.getValue()).b.isEmpty()) {
            dd4Var.f0(-1702725447);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-1703135794);
            p35 p35VarC = i25.c((m53) a53.K.getValue(), dd4Var, 0);
            boolean zF = dd4Var.f(c97Var);
            Object objQ = dd4Var.Q();
            Object obj4 = vl1.a;
            if (zF || objQ == obj4) {
                objQ = new d7(0, c97Var, c97.class, "markAllAsRead", "markAllAsRead()V", 0, 25);
                dd4Var.p0(objQ);
            }
            sw1.r(p35VarC, (ou6) null, 0L, (ib4) ((ei5) objQ), dd4Var, 0, 6);
            p35 p35VarC2 = i25.c((m53) a53.H.getValue(), dd4Var, 0);
            long j = ((q96) dd4Var.j(s96.a)).a.w;
            boolean zF2 = dd4Var.f(c97Var);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj4) {
                objQ2 = new d7(0, c97Var, c97.class, "clearAll", "clearAll()V", 0, 26);
                dd4Var.p0(objQ2);
            }
            sw1.r(p35VarC2, (ou6) null, j, (ib4) ((ei5) objQ2), dd4Var, 0, 2);
            dd4Var.q(false);
        }
        return heb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.b
            zk7 r0 = (zk7) r0
            java.lang.Object r9 = r9.c
            zm5 r9 = (zm5) r9
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            boolean r1 = defpackage.tu1.T(r0, r10)
            qk7 r2 = r0.n()
            lh7 r2 = r2.e
            lh7 r3 = lh7.a
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L2b
            goto L35
        L2b:
            zm5 r2 = zm5.a
            if (r9 != r2) goto L30
            goto L35
        L30:
            if (r1 != 0) goto L34
            r1 = r5
            goto L35
        L34:
            r1 = r4
        L35:
            qk7 r9 = r0.n()
            int r9 = r9.b
            r2 = 0
            if (r9 != 0) goto L40
            r3 = r2
            goto L46
        L40:
            float r3 = defpackage.tu1.D(r0)
            float r9 = (float) r9
            float r3 = r3 / r9
        L46:
            int r9 = (int) r3
            float r9 = (float) r9
            float r9 = r3 - r9
            pn2 r6 = r0.n
            float r7 = java.lang.Math.abs(r10)
            r8 = 1137180672(0x43c80000, float:400.0)
            float r6 = r6.k0(r8)
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            r7 = 2
            if (r6 >= 0) goto L5c
            goto L63
        L5c:
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 <= 0) goto L62
            r4 = r5
            goto L63
        L62:
            r4 = r7
        L63:
            if (r4 != 0) goto Laa
            float r9 = java.lang.Math.abs(r9)
            r10 = 1056964608(0x3f000000, float:0.5)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L72
            if (r1 == 0) goto Lb2
            goto Lac
        L72:
            float r9 = java.lang.Math.abs(r3)
            pn2 r10 = r0.n
            bl7 r2 = cl7.a
            r2 = 1113587712(0x42600000, float:56.0)
            float r10 = r10.k0(r2)
            int r2 = r0.p()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r10 = java.lang.Math.min(r10, r2)
            int r0 = r0.p()
            float r0 = (float) r0
            float r10 = r10 / r0
            float r10 = java.lang.Math.abs(r10)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 < 0) goto L9d
            if (r1 == 0) goto Lac
            goto Lb2
        L9d:
            float r9 = java.lang.Math.abs(r11)
            float r10 = java.lang.Math.abs(r12)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto Lac
            goto Lb2
        Laa:
            if (r4 != r5) goto Lae
        Lac:
            r11 = r12
            goto Lb2
        Lae:
            if (r4 != r7) goto Lb1
            goto Lb2
        Lb1:
            r11 = r2
        Lb2:
            java.lang.Float r9 = java.lang.Float.valueOf(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz0.t(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object u(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        Spannable spannable = (Spannable) this.b;
        eh ehVar = (eh) this.c;
        vn9 vn9Var = (vn9) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        c64 c64Var = vn9Var.f;
        a84 a84Var = vn9Var.c;
        if (a84Var == null) {
            a84Var = a84.t;
        }
        t74 t74Var = vn9Var.d;
        int i = t74Var != null ? t74Var.a : 0;
        u74 u74Var = vn9Var.e;
        int i2 = u74Var != null ? u74Var.a : 65535;
        fh fhVar = (fh) ehVar.b;
        ubb ubbVarB = ((d64) fhVar.e).b(c64Var, a84Var, i, i2);
        if (ubbVarB instanceof ubb) {
            Object obj4 = ubbVarB.a;
            obj4.getClass();
            typeface = (Typeface) obj4;
        } else {
            be5 be5Var = new be5(ubbVarB, fhVar.v);
            fhVar.v = be5Var;
            Object obj5 = be5Var.d;
            obj5.getClass();
            typeface = (Typeface) obj5;
        }
        spannable.setSpan(new f64(typeface, 1), iIntValue, iIntValue2, 33);
        return heb.a;
    }

    private final Object v(Object obj, Object obj2, Object obj3) {
        ib4 ib4Var = (ib4) this.b;
        vvb vvbVar = (vvb) this.c;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ke1) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            lc5.J(ib4Var, gjb.p0(lu6.a, 0.0f, 0.0f, 0.0f, 8.0f, 7), false, null, null, null, lc5.A, dd4Var, 805306416, 508);
            if (vvbVar != null) {
                dd4Var.f0(470100);
                gjb.C(wn9.K((pv9) vu9.Y.getValue(), dd4Var), vvbVar.a, 0L, null, dd4Var, 0, 12);
                gjb.C(wn9.K((pv9) vu9.o.getValue(), dd4Var), vvbVar.b, 0L, null, dd4Var, 0, 12);
                gjb.C(wn9.K((pv9) vu9.X.getValue(), dd4Var), vvbVar.d, 0L, null, dd4Var, 0, 12);
                dd4Var.q(false);
            } else {
                dd4Var.f0(942850);
                String strK = wn9.K((pv9) vu9.M.getValue(), dd4Var);
                ur9 ur9Var = s96.a;
                nha.c(strK, (ou6) null, ((q96) dd4Var.j(ur9Var)).a.s, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.l, dd4Var, 0, 0, 131066);
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i;
        kd kdVar;
        jm jmVar;
        int i2;
        heb hebVar;
        dd4 dd4Var;
        boolean z;
        boolean z2;
        int i3 = this.a;
        jv jvVar = pv.c;
        zn0 zn0Var = zn0.a;
        int i4 = 3;
        lu6 lu6Var = lu6.a;
        fu6 fu6Var = vl1.a;
        heb hebVar2 = heb.a;
        Object obj4 = this.c;
        int i5 = 1;
        Object obj5 = this.b;
        switch (i3) {
            case 0:
                ib4 ib4Var = (ib4) obj5;
                pz0 pz0Var = (pz0) obj4;
                co0 co0Var = (co0) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var2.f(co0Var) ? 4 : 2;
                }
                if (dd4Var2.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ou6 ou6VarL0 = gjb.l0(tg9.h(tg9.f(lu6Var, 1.0f), (co0Var.d() * 0.935f) + 2.08f), 8.0f);
                    boolean zF = dd4Var2.f(ib4Var);
                    Object objQ = dd4Var2.Q();
                    Object obj6 = objQ;
                    if (zF || objQ == fu6Var) {
                        m50 m50Var = new m50(20, ib4Var);
                        dd4Var2.p0(m50Var);
                        obj6 = m50Var;
                    }
                    ou6 ou6VarW = t96.w(yn2.s(ou6VarL0, false, 0.0f, (ib4) obj6, 3), s00.p(dd4Var2).c);
                    long jG = dd1.g(s00.o(dd4Var2), 1.0f);
                    lp4 lp4Var = jf0.G;
                    ou6 ou6VarL = fe.L(ou6VarW, jG, lp4Var);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL = dd4Var2.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var);
                    } else {
                        dd4Var2.s0();
                    }
                    jm jmVar2 = ll1.f;
                    un9.s(jmVar2, dd4Var2, ha6VarD);
                    jm jmVar3 = ll1.e;
                    un9.s(jmVar3, dd4Var2, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar4 = ll1.g;
                    un9.s(jmVar4, dd4Var2, numValueOf);
                    kd kdVar2 = ll1.h;
                    un9.r(dd4Var2, kdVar2);
                    jm jmVar5 = ll1.d;
                    un9.s(jmVar5, dd4Var2, ou6VarL02);
                    ArrayList arrayList = pz0Var.c;
                    int i6 = pz0Var.d;
                    ob9 ob9Var = (ob9) fc1.A0(0, arrayList);
                    ob9 ob9Var2 = (ob9) fc1.A0(1, arrayList);
                    ob9 ob9Var3 = (ob9) fc1.A0(2, arrayList);
                    if (ob9Var != null) {
                        dd4Var2.f0(1653298199);
                        String str = ob9Var.a;
                        String str2 = ob9Var.b;
                        String str3 = ob9Var.c;
                        qr1 qr1Var = ra1.d;
                        px3 px3Var = tg9.c;
                        w05.c(str, str2, str3, str3, qr1Var, px3Var, dd4Var2, 221184);
                        kdVar = kdVar2;
                        jmVar = jmVar4;
                        dd4Var2 = dd4Var2;
                        i = i6;
                        pn0.a(fe.L(lu6Var, lc1.c(0.7f, lc1.b), lp4Var).e(px3Var), dd4Var2, 6);
                        i2 = 0;
                        dd4Var2.q(false);
                    } else {
                        i = i6;
                        kdVar = kdVar2;
                        jmVar = jmVar4;
                        dd4Var2.f0(1653889276);
                        nha.c(wn9.K((pv9) eu9.n.getValue(), dd4Var2), zn0Var.a(lu6Var, bv4.f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var2, 0, 0, 262140);
                        i2 = 0;
                        dd4Var2.q(false);
                    }
                    ou6 ou6VarL03 = gjb.l0(tg9.f(lu6Var, 1.0f), 8.0f);
                    eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var2, i2);
                    int iHashCode2 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL2 = dd4Var2.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarL03);
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(jmVar2, dd4Var2, eq8VarA);
                    un9.s(jmVar3, dd4Var2, lr7VarL2);
                    jm jmVar6 = jmVar;
                    kd kdVar3 = kdVar;
                    ky0.v(iHashCode2, dd4Var2, jmVar6, dd4Var2, kdVar3);
                    un9.s(jmVar5, dd4Var2, ou6VarL04);
                    if (1.9f <= 0.0d) {
                        o75.a("invalid weight; must be greater than zero");
                    }
                    h67.e(ob9Var, t96.w(tg9.c(new bp5(1.9f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.9f, true), 1.0f), s00.p(dd4Var2).a), dd4Var2, 0);
                    un9.a(dd4Var2, tg9.r(lu6Var, 8.0f));
                    if (1.0f <= 0.0d) {
                        o75.a("invalid weight; must be greater than zero");
                    }
                    bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    ie1 ie1VarA = ge1.a(jvVar, bv4.z, dd4Var2, 0);
                    int iHashCode3 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL3 = dd4Var2.l();
                    ou6 ou6VarL05 = s32.L0(dd4Var2, bp5Var);
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(jmVar2, dd4Var2, ie1VarA);
                    un9.s(jmVar3, dd4Var2, lr7VarL3);
                    ky0.v(iHashCode3, dd4Var2, jmVar6, dd4Var2, kdVar3);
                    un9.s(jmVar5, dd4Var2, ou6VarL05);
                    h67.e(ob9Var2, t96.w(ke1.b(tg9.f(lu6Var, 1.0f), 1.0f), s00.p(dd4Var2).a), dd4Var2, 0);
                    h67.e(ob9Var3, t96.w(ke1.b(xv5.h(lu6Var, 8.0f, dd4Var2, lu6Var, 1.0f), 1.0f), s00.p(dd4Var2).a), dd4Var2, 0);
                    dd4Var2.q(true);
                    dd4Var2.q(true);
                    int i7 = i;
                    if (i7 > 3) {
                        dd4Var2.f0(1655462526);
                        nha.c((i7 - 3) + "+", gjb.m0(fe.L(t96.w(gjb.l0(zn0Var.a(lu6Var, bv4.v), 10.0f), tp8.a), lc1.c(0.5f, lc1.b), lp4Var), 8.0f, 2.0f), lc1.e, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).o, dd4Var2, 384, 0, 131064);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(1655990673);
                        dd4Var2.q(false);
                    }
                    dd4Var2.q(true);
                } else {
                    dd4Var2.Y();
                }
                return hebVar2;
            case 1:
                ej4 ej4Var = (ej4) obj5;
                String str4 = (String) obj4;
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if (dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    qr1 qr1Var2 = ra1.d;
                    px3 px3Var2 = tg9.c;
                    boolean zF2 = dd4Var3.f(ej4Var) | dd4Var3.f(str4);
                    Object objQ2 = dd4Var3.Q();
                    Object obj7 = objQ2;
                    if (zF2 || objQ2 == fu6Var) {
                        al3 al3Var = new al3(15, ej4Var, str4);
                        dd4Var3.p0(al3Var);
                        obj7 = al3Var;
                    }
                    ou6 ou6VarJ = fw.J(null, (ib4) obj7, px3Var2, false, 15);
                    ur9 ur9Var = s96.a;
                    w05.a(str4, qr1Var2, false, fe.f, fe.g, fe.L(ou6VarJ, lc1.c(0.06f, ((q96) dd4Var3.j(ur9Var)).a.a), ((q96) dd4Var3.j(ur9Var)).c.b), null, dd4Var3, 221232, 396);
                } else {
                    dd4Var3.Y();
                }
                return hebVar2;
            case 2:
                f28 f28Var = (f28) obj5;
                a07 a07Var = (a07) obj4;
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (dd4Var4.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    List list = (List) f28Var.c.getValue();
                    Object objQ3 = dd4Var4.Q();
                    Object obj8 = objQ3;
                    if (objQ3 == fu6Var) {
                        String str5 = (String) f28Var.b.getValue();
                        list.getClass();
                        Integer numValueOf2 = Integer.valueOf(list.indexOf(str5));
                        dd4Var4.p0(numValueOf2);
                        obj8 = numValueOf2;
                    }
                    int iIntValue4 = ((Number) obj8).intValue();
                    Object objQ4 = dd4Var4.Q();
                    Object obj9 = objQ4;
                    if (objQ4 == fu6Var) {
                        vx1 vx1VarZ = lc5.Z(dd4Var4);
                        dd4Var4.p0(vx1VarZ);
                        obj9 = vx1VarZ;
                    }
                    vx1 vx1Var = (vx1) obj9;
                    pj4 pj4VarA = e36.a(dd4Var4);
                    if (pj4VarA == null) {
                        gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    h28 h28Var = (h28) ((qtb) qx1.N(ug8.a(h28.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var4), null));
                    a07 a07VarB = bx1.B(h28Var.d, dd4Var4);
                    Object objQ5 = dd4Var4.Q();
                    Object obj10 = objQ5;
                    if (objQ5 == fu6Var) {
                        cn7 cn7VarX = dk9.x(Float.valueOf(0.0f));
                        dd4Var4.p0(cn7VarX);
                        obj10 = cn7VarX;
                    }
                    a07 a07Var2 = (a07) obj10;
                    al7 al7VarH0 = ny1.h0(iIntValue4, list.size(), dd4Var4, 6, 2);
                    px3 px3Var3 = tg9.c;
                    e11.e(al7VarH0, px3Var3, null, null, 0, 0.0f, null, null, false, null, null, null, jf0.G(-1184062670, new ao6(a07Var, f28Var, al7VarH0, a07Var2, vx1Var, list), dd4Var4), dd4Var4, 48, 16380);
                    ou6 ou6VarI = yb0.I(px3Var3, ((Number) a07Var2.getValue()).floatValue());
                    xf0 xf0Var = bv4.b;
                    ha6 ha6VarD2 = pn0.d(xf0Var, false);
                    int iHashCode4 = Long.hashCode(dd4Var4.T);
                    lr7 lr7VarL4 = dd4Var4.l();
                    ou6 ou6VarL06 = s32.L0(dd4Var4, ou6VarI);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var4.j0();
                    hebVar = hebVar2;
                    if (dd4Var4.S) {
                        dd4Var4.k(um1Var2);
                    } else {
                        dd4Var4.s0();
                    }
                    jm jmVar7 = ll1.f;
                    un9.s(jmVar7, dd4Var4, ha6VarD2);
                    jm jmVar8 = ll1.e;
                    un9.s(jmVar8, dd4Var4, lr7VarL4);
                    Integer numValueOf3 = Integer.valueOf(iHashCode4);
                    jm jmVar9 = ll1.g;
                    un9.s(jmVar9, dd4Var4, numValueOf3);
                    kd kdVar4 = ll1.h;
                    un9.r(dd4Var4, kdVar4);
                    jm jmVar10 = ll1.d;
                    un9.s(jmVar10, dd4Var4, ou6VarL06);
                    p35 p35VarC = i25.c((m53) a53.w.getValue(), dd4Var4, 0);
                    ou6 ou6VarN = tg9.n(gjb.l0(lc5.h0(lu6Var), 24.0f), 32.0f);
                    rp8 rp8Var = tp8.a;
                    ou6 ou6VarW2 = t96.w(ou6VarN, rp8Var);
                    long j = lc1.b;
                    long jC = lc1.c(0.8f, j);
                    lp4 lp4Var2 = jf0.G;
                    ou6 ou6VarL07 = gjb.l0(fe.L(ou6VarW2, jC, lp4Var2), 6.0f);
                    long j2 = lc1.e;
                    mx4.a(p35VarC, (String) null, ou6VarL07, j2, dd4Var4, 3120, 0);
                    ou6 ou6VarW3 = t96.w(tg9.n(gjb.l0(lc5.h0(zn0Var.a(lu6Var, bv4.d)), 24.0f), 32.0f), rp8Var);
                    boolean z3 = !((g28) a07VarB.getValue()).a;
                    boolean zH = dd4Var4.h(list) | dd4Var4.f(al7VarH0) | dd4Var4.f(h28Var);
                    Object objQ6 = dd4Var4.Q();
                    Object obj11 = objQ6;
                    if (zH || objQ6 == fu6Var) {
                        ma0 ma0Var = new ma0(17, list, al7VarH0, h28Var);
                        dd4Var4.p0(ma0Var);
                        obj11 = ma0Var;
                    }
                    ou6 ou6VarL08 = gjb.l0(fe.L(fw.J(null, (ib4) obj11, ou6VarW3, z3, 14), lc1.c(0.8f, j), lp4Var2), 8.0f);
                    ha6 ha6VarD3 = pn0.d(xf0Var, false);
                    int iHashCode5 = Long.hashCode(dd4Var4.T);
                    lr7 lr7VarL5 = dd4Var4.l();
                    ou6 ou6VarL09 = s32.L0(dd4Var4, ou6VarL08);
                    dd4Var4.j0();
                    if (dd4Var4.S) {
                        dd4Var4.k(um1Var2);
                    } else {
                        dd4Var4.s0();
                    }
                    un9.s(jmVar7, dd4Var4, ha6VarD3);
                    un9.s(jmVar8, dd4Var4, lr7VarL5);
                    ky0.v(iHashCode5, dd4Var4, jmVar9, dd4Var4, kdVar4);
                    un9.s(jmVar10, dd4Var4, ou6VarL09);
                    if (((g28) a07VarB.getValue()).a) {
                        dd4Var4.f0(-889182144);
                        l16.a(2.0f, 438, 0, j2, dd4Var4, px3Var3);
                        dd4Var = dd4Var4;
                        dd4Var.q(false);
                    } else {
                        dd4Var = dd4Var4;
                        dd4Var.f0(-888900478);
                        mx4.a(i25.c((m53) a53.M.getValue(), dd4Var, 0), (String) null, px3Var3, j2, dd4Var, 3504, 0);
                        dd4Var.q(false);
                    }
                    dd4Var.q(true);
                    dd4Var.q(true);
                } else {
                    hebVar = hebVar2;
                    dd4Var4.Y();
                }
                return hebVar;
            case 3:
                ija ijaVar = (ija) obj5;
                kb4 kb4Var = (kb4) obj4;
                co0 co0Var2 = (co0) obj;
                dd4 dd4Var5 = (dd4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                co0Var2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= dd4Var5.f(co0Var2) ? 4 : 2;
                }
                if (!dd4Var5.V(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    dd4Var5.Y();
                    return hebVar2;
                }
                ou6 ou6VarL2 = fe.L(t96.w(gjb.l0(tg9.h(tg9.t(yib.E(yn2.E(lu6Var, dd4Var5, 6), 14), 0.0f, 600.0f, 1), co0Var2.c() * 0.9f), 24.0f), s00.p(dd4Var5).c), s00.o(dd4Var5).p, jf0.G);
                ie1 ie1VarA2 = ge1.a(jvVar, bv4.z, dd4Var5, 0);
                int iHashCode6 = Long.hashCode(dd4Var5.T);
                lr7 lr7VarL6 = dd4Var5.l();
                ou6 ou6VarL010 = s32.L0(dd4Var5, ou6VarL2);
                ml1.k.getClass();
                um1 um1Var3 = ll1.b;
                dd4Var5.j0();
                if (dd4Var5.S) {
                    dd4Var5.k(um1Var3);
                } else {
                    dd4Var5.s0();
                }
                jm jmVar11 = ll1.f;
                un9.s(jmVar11, dd4Var5, ie1VarA2);
                jm jmVar12 = ll1.e;
                un9.s(jmVar12, dd4Var5, lr7VarL6);
                Integer numValueOf4 = Integer.valueOf(iHashCode6);
                jm jmVar13 = ll1.g;
                un9.s(jmVar13, dd4Var5, numValueOf4);
                kd kdVar5 = ll1.h;
                un9.r(dd4Var5, kdVar5);
                jm jmVar14 = ll1.d;
                un9.s(jmVar14, dd4Var5, ou6VarL010);
                fxb fxbVarJ = wn9.J(null, dd4Var5, 1);
                ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 6.0f, 1);
                eq8 eq8VarA2 = dq8.a(pv.a, bv4.x, dd4Var5, 48);
                int iHashCode7 = Long.hashCode(dd4Var5.T);
                lr7 lr7VarL7 = dd4Var5.l();
                ou6 ou6VarL011 = s32.L0(dd4Var5, ou6VarN0);
                dd4Var5.j0();
                if (dd4Var5.S) {
                    dd4Var5.k(um1Var3);
                } else {
                    dd4Var5.s0();
                }
                un9.s(jmVar11, dd4Var5, eq8VarA2);
                un9.s(jmVar12, dd4Var5, lr7VarL7);
                ky0.v(iHashCode7, dd4Var5, jmVar13, dd4Var5, kdVar5);
                un9.s(jmVar14, dd4Var5, ou6VarL011);
                un9.a(dd4Var5, tg9.r(lu6Var, 6.0f));
                p35 p35VarC2 = i25.c((m53) a53.w.getValue(), dd4Var5, 0);
                String strK = wn9.K((pv9) vt9.w0.getValue(), dd4Var5);
                long j3 = s00.o(dd4Var5).q;
                ou6 ou6VarW4 = t96.w(tg9.n(lu6Var, 40.0f), tp8.a);
                boolean zF3 = dd4Var5.f(kb4Var);
                Object objQ7 = dd4Var5.Q();
                Object obj12 = objQ7;
                if (zF3 || objQ7 == fu6Var) {
                    tk6 tk6Var = new tk6(25, kb4Var);
                    dd4Var5.p0(tk6Var);
                    obj12 = tk6Var;
                }
                mx4.a(p35VarC2, strK, gjb.l0(fw.J(null, (ib4) obj12, ou6VarW4, false, 15), 8.0f), j3, dd4Var5, 0, 0);
                String str6 = (String) fxbVarJ.e.getValue();
                if (str6 == null) {
                    str6 = "";
                }
                nha.c(str6, new bp5(1.0f, true), s00.o(dd4Var5).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 2, false, 1, 0, (kb4) null, s00.q(dd4Var5).i, dd4Var5, 0, 24960, 109560);
                ou6 ou6VarN2 = tg9.n(lu6Var, 40.0f);
                ha6 ha6VarD4 = pn0.d(bv4.b, false);
                int iHashCode8 = Long.hashCode(dd4Var5.T);
                lr7 lr7VarL8 = dd4Var5.l();
                ou6 ou6VarL012 = s32.L0(dd4Var5, ou6VarN2);
                dd4Var5.j0();
                if (dd4Var5.S) {
                    dd4Var5.k(um1Var3);
                } else {
                    dd4Var5.s0();
                }
                un9.s(jmVar11, dd4Var5, ha6VarD4);
                un9.s(jmVar12, dd4Var5, lr7VarL8);
                ky0.v(iHashCode8, dd4Var5, jmVar13, dd4Var5, kdVar5);
                un9.s(jmVar14, dd4Var5, ou6VarL012);
                if (fxbVarJ.h()) {
                    dd4Var5.f0(994543640);
                    l16.a(2.0f, 48, 0, s00.o(dd4Var5).q, dd4Var5, tg9.n(zn0Var.a(lu6Var, bv4.f), 20.0f));
                    dd4Var5.q(false);
                } else {
                    dd4Var5.f0(994892483);
                    dd4Var5.q(false);
                }
                ky0.A(dd4Var5, true, lu6Var, 6.0f, dd4Var5);
                dd4Var5.q(true);
                y86.c(0.0f, 6, 6, 0L, dd4Var5, tg9.f(lu6Var, 1.0f));
                px3 px3Var4 = tg9.c;
                rt8 rt8Var = fxb.m;
                jt1 jt1Var = null;
                pg9.b(fxbVarJ, px3Var4, (yb4) null, dd4Var5, 56);
                boolean zF4 = dd4Var5.f(ijaVar) | dd4Var5.h(fxbVarJ);
                Object objQ8 = dd4Var5.Q();
                Object obj13 = objQ8;
                if (zF4 || objQ8 == fu6Var) {
                    y46 y46Var = new y46(ijaVar, fxbVarJ, jt1Var, 6);
                    dd4Var5.p0(y46Var);
                    obj13 = y46Var;
                }
                lc5.u((yb4) obj13, dd4Var5, hebVar2);
                if (b73.c(dd4Var5).a()) {
                    dd4Var5.f0(1156653262);
                    boolean z4 = !b73.c(dd4Var5).b();
                    dd4Var5.q(false);
                    z = z4;
                } else {
                    dd4Var5.f0(1496513991);
                    dd4Var5.q(false);
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean zH2 = dd4Var5.h(fxbVarJ) | dd4Var5.g(z);
                Object objQ9 = dd4Var5.Q();
                Object obj14 = objQ9;
                if (zH2 || objQ9 == fu6Var) {
                    fq0 fq0Var = new fq0(fxbVarJ, z, null, 2);
                    dd4Var5.p0(fq0Var);
                    obj14 = fq0Var;
                }
                lc5.u((yb4) obj14, dd4Var5, boolValueOf);
                dd4Var5.q(true);
                return hebVar2;
            case 4:
                y86.w((kb4) obj5, obj4, (jx1) obj3);
                return hebVar2;
            case 5:
                yb4 yb4Var = (yb4) obj5;
                yb4 yb4Var2 = (yb4) obj4;
                dd4 dd4Var6 = (dd4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var6.V(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    if (yb4Var != null) {
                        dd4Var6.f0(-493253374);
                        yb4Var.invoke(dd4Var6, 0);
                        z2 = false;
                        dd4Var6.q(false);
                    } else {
                        z2 = false;
                        dd4Var6.f0(-493224544);
                        dd4Var6.q(false);
                    }
                    if (yb4Var == null || yb4Var2 == null) {
                        dd4Var6.f0(-493120384);
                        dd4Var6.q(z2);
                    } else {
                        dd4Var6.f0(-493179966);
                        un9.a(dd4Var6, tg9.n(lu6Var, 8.0f));
                        dd4Var6.q(z2);
                    }
                    if (yb4Var2 != null) {
                        dd4Var6.f0(-493092670);
                        yb4Var2.invoke(dd4Var6, 0);
                        dd4Var6.q(z2);
                    } else {
                        dd4Var6.f0(-493063840);
                        dd4Var6.q(z2);
                    }
                } else {
                    dd4Var6.Y();
                }
                return hebVar2;
            case 6:
                ou6 ou6Var = (ou6) obj4;
                ib4 ib4Var2 = (ib4) obj5;
                co0 co0Var3 = (co0) obj;
                dd4 dd4Var7 = (dd4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                co0Var3.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= dd4Var7.f(co0Var3) ? 4 : 2;
                }
                if (dd4Var7.V(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    ou6 ou6VarL013 = gjb.l0(tg9.h(ou6Var, (co0Var3.d() * 0.935f) + 2.08f), 8.0f);
                    boolean zF5 = dd4Var7.f(ib4Var2);
                    Object objQ10 = dd4Var7.Q();
                    Object obj15 = objQ10;
                    if (zF5 || objQ10 == fu6Var) {
                        m50 m50Var2 = new m50(19, ib4Var2);
                        dd4Var7.p0(m50Var2);
                        obj15 = m50Var2;
                    }
                    ou6 ou6VarS = yn2.s(ou6VarL013, false, 0.0f, (ib4) obj15, 3);
                    ur9 ur9Var2 = s96.a;
                    ou6 ou6VarL3 = fe.L(t96.w(ou6VarS, ((q96) dd4Var7.j(ur9Var2)).c.c), dd1.g(((q96) dd4Var7.j(ur9Var2)).a, 1.0f), jf0.G);
                    ha6 ha6VarD5 = pn0.d(bv4.b, false);
                    int iHashCode9 = Long.hashCode(dd4Var7.T);
                    lr7 lr7VarL9 = dd4Var7.l();
                    ou6 ou6VarL014 = s32.L0(dd4Var7, ou6VarL3);
                    ml1.k.getClass();
                    um1 um1Var4 = ll1.b;
                    dd4Var7.j0();
                    if (dd4Var7.S) {
                        dd4Var7.k(um1Var4);
                    } else {
                        dd4Var7.s0();
                    }
                    un9.s(ll1.f, dd4Var7, ha6VarD5);
                    un9.s(ll1.e, dd4Var7, lr7VarL9);
                    un9.s(ll1.g, dd4Var7, Integer.valueOf(iHashCode9));
                    un9.r(dd4Var7, ll1.h);
                    un9.s(ll1.d, dd4Var7, ou6VarL014);
                    mx4.a(i25.c((m53) a53.E.getValue(), dd4Var7, 0), wn9.K((pv9) vt9.i.getValue(), dd4Var7), zn0Var.a(tg9.n(lu6Var, 36.0f), bv4.f), 0L, dd4Var7, 0, 8);
                    dd4Var7.q(true);
                } else {
                    dd4Var7.Y();
                }
                return hebVar2;
            case 7:
                fv1 fv1Var = (fv1) obj5;
                t61 t61Var = (t61) obj4;
                dd4 dd4Var8 = (dd4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var8.V(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    eq8 eq8VarA3 = dq8.a(new mv(12.0f, true, new gp(5)), bv4.x, dd4Var8, 54);
                    int iHashCode10 = Long.hashCode(dd4Var8.T);
                    lr7 lr7VarL10 = dd4Var8.l();
                    ou6 ou6VarL015 = s32.L0(dd4Var8, lu6Var);
                    ml1.k.getClass();
                    um1 um1Var5 = ll1.b;
                    dd4Var8.j0();
                    if (dd4Var8.S) {
                        dd4Var8.k(um1Var5);
                    } else {
                        dd4Var8.s0();
                    }
                    jm jmVar15 = ll1.f;
                    un9.s(jmVar15, dd4Var8, eq8VarA3);
                    jm jmVar16 = ll1.e;
                    un9.s(jmVar16, dd4Var8, lr7VarL10);
                    Integer numValueOf5 = Integer.valueOf(iHashCode10);
                    jm jmVar17 = ll1.g;
                    un9.s(jmVar17, dd4Var8, numValueOf5);
                    kd kdVar6 = ll1.h;
                    un9.r(dd4Var8, kdVar6);
                    jm jmVar18 = ll1.d;
                    un9.s(jmVar18, dd4Var8, ou6VarL015);
                    sg9.a(fv1Var.d, t61Var.h, tg9.n(lu6Var, 56.0f), (ib4) null, dd4Var8, 384, 8);
                    bp5 bp5Var2 = new bp5(1.0f, true);
                    ie1 ie1VarA3 = ge1.a(jvVar, bv4.z, dd4Var8, 0);
                    int iHashCode11 = Long.hashCode(dd4Var8.T);
                    lr7 lr7VarL11 = dd4Var8.l();
                    ou6 ou6VarL016 = s32.L0(dd4Var8, bp5Var2);
                    dd4Var8.j0();
                    if (dd4Var8.S) {
                        dd4Var8.k(um1Var5);
                    } else {
                        dd4Var8.s0();
                    }
                    un9.s(jmVar15, dd4Var8, ie1VarA3);
                    un9.s(jmVar16, dd4Var8, lr7VarL11);
                    ky0.v(iHashCode11, dd4Var8, jmVar17, dd4Var8, kdVar6);
                    un9.s(jmVar18, dd4Var8, ou6VarL016);
                    String str7 = t61Var.h;
                    ur9 ur9Var3 = s96.a;
                    nha.c(str7, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var8.j(ur9Var3)).b.h, dd4Var8, 0, 24960, 110590);
                    if (t61Var.j) {
                        dd4Var8.f0(-771951326);
                        dd4Var8.q(false);
                    } else {
                        dd4Var8.f0(-772385543);
                        nha.c(wn9.L((pv9) zt9.m.getValue(), new Object[]{Integer.valueOf(fv1Var.h)}, dd4Var8), (ou6) null, ((q96) dd4Var8.j(ur9Var3)).a.s, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var8.j(ur9Var3)).b.l, dd4Var8, 0, 0, 131066);
                        dd4Var8.q(false);
                    }
                    dd4Var8.q(true);
                    dd4Var8.q(true);
                } else {
                    dd4Var8.Y();
                }
                return hebVar2;
            case 8:
                kb4 kb4Var2 = (kb4) obj5;
                ks1 ks1Var = (ks1) obj4;
                dd4 dd4Var9 = (dd4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (dd4Var9.V(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    Object objQ11 = dd4Var9.Q();
                    Object obj16 = objQ11;
                    if (objQ11 == fu6Var) {
                        os1 os1Var = new os1();
                        dd4Var9.p0(os1Var);
                        obj16 = os1Var;
                    }
                    os1 os1Var2 = (os1) obj16;
                    os1Var2.a.clear();
                    kb4Var2.invoke(os1Var2);
                    os1Var2.a(ks1Var, dd4Var9, 0);
                } else {
                    dd4Var9.Y();
                }
                return hebVar2;
            case 9:
                a07 a07Var3 = (a07) obj5;
                t02 t02Var = (t02) obj4;
                dd4 dd4Var10 = (dd4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((dr5) obj).getClass();
                if (dd4Var10.V(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    wga wgaVar = (wga) a07Var3.getValue();
                    String strK2 = wn9.K((pv9) mu9.g0.getValue(), dd4Var10);
                    long jG2 = dd1.g(((q96) dd4Var10.j(s96.a)).a, 6.0f);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    boolean zF6 = dd4Var10.f(a07Var3);
                    Object objQ12 = dd4Var10.Q();
                    Object obj17 = objQ12;
                    if (zF6 || objQ12 == fu6Var) {
                        r02 r02Var = new r02(a07Var3, false ? 1 : 0);
                        dd4Var10.p0(r02Var);
                        obj17 = r02Var;
                    }
                    kb4 kb4Var3 = (kb4) obj17;
                    boolean zF7 = dd4Var10.f(t02Var) | dd4Var10.f(a07Var3);
                    Object objQ13 = dd4Var10.Q();
                    Object obj18 = objQ13;
                    if (zF7 || objQ13 == fu6Var) {
                        q02 q02Var = new q02(t02Var, a07Var3, i5);
                        dd4Var10.p0(q02Var);
                        obj18 = q02Var;
                    }
                    e11.A(wgaVar, strK2, 0L, jG2, null, null, ou6VarF, kb4Var3, (ib4) obj18, dd4Var10, 1572864, 52);
                } else {
                    dd4Var10.Y();
                }
                return hebVar2;
            case 10:
                d37 d37Var = (d37) obj5;
                c37 c37Var = (c37) obj4;
                dd4 dd4Var11 = (dd4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if (dd4Var11.V(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    d37Var.b.c(c37Var, dd4Var11, 0);
                } else {
                    dd4Var11.Y();
                }
                return hebVar2;
            case 11:
                el3 el3Var = (el3) obj5;
                kb4 kb4Var4 = (kb4) obj4;
                dd4 dd4Var12 = (dd4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (dd4Var12.V(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    boolean zH3 = dd4Var12.h(el3Var) | dd4Var12.f(kb4Var4);
                    Object objQ14 = dd4Var12.Q();
                    Object obj19 = objQ14;
                    if (zH3 || objQ14 == fu6Var) {
                        y6 y6Var = new y6(29, el3Var, kb4Var4);
                        dd4Var12.p0(y6Var);
                        obj19 = y6Var;
                    }
                    kl8.q(el3Var, null, (ib4) obj19, dd4Var12, 0);
                } else {
                    dd4Var12.Y();
                }
                return hebVar2;
            case 12:
                return a(obj, obj2, obj3);
            case 13:
                return b(obj, obj2, obj3);
            case 14:
                return d(obj, obj2, obj3);
            case 15:
                return f(obj, obj2, obj3);
            case 16:
                return i(obj, obj2, obj3);
            case 17:
                return l(obj, obj2, obj3);
            case 18:
                return m(obj, obj2, obj3);
            case 19:
                return n(obj, obj2, obj3);
            case 20:
                return o(obj, obj2, obj3);
            case 21:
                return p(obj, obj2, obj3);
            case 22:
                return q(obj, obj2, obj3);
            case 23:
                return r(obj, obj2, obj3);
            case 24:
                return s(obj, obj2, obj3);
            case 25:
                return t(obj, obj2, obj3);
            case 26:
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                ((rj1) obj5).c((co0) obj4, (dd4) obj2, 0);
                return hebVar2;
            case 27:
                return u(obj, obj2, obj3);
            case 28:
                return v(obj, obj2, obj3);
            default:
                h8a h8aVar = (h8a) obj5;
                br9 br9Var = (br9) obj4;
                dd4 dd4Var13 = (dd4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var13.V(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    boolean z5 = ((e8a) br9Var.getValue()).e;
                    boolean zF8 = dd4Var13.f(h8aVar);
                    Object objQ15 = dd4Var13.Q();
                    Object obj20 = objQ15;
                    if (zF8 || objQ15 == fu6Var) {
                        p7a p7aVar = new p7a(h8aVar, i4);
                        dd4Var13.p0(p7aVar);
                        obj20 = p7aVar;
                    }
                    zk9.g(z5, false, null, (kb4) obj20, dd4Var13, 0);
                    un9.a(dd4Var13, tg9.r(lu6Var, 8.0f));
                } else {
                    dd4Var13.Y();
                }
                return hebVar2;
        }
    }

    public /* synthetic */ qz0(Object obj, ib4 ib4Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = ib4Var;
    }
}
