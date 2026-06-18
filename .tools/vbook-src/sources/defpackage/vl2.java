package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vl2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl2(h8a h8aVar, String str, String str2, boolean z, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 5;
        this.c = h8aVar;
        this.f = str;
        this.e = str2;
        this.d = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.e;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                int i2 = 0;
                vl2 vl2Var = new vl2(i2, jt1Var, (ut0) obj3, (pa7) obj2, this.d);
                vl2Var.c = obj;
                return vl2Var;
            case 1:
                int i3 = 1;
                vl2 vl2Var2 = new vl2(i3, jt1Var, (bv0) obj3, (pa7) obj2, this.d);
                vl2Var2.c = obj;
                return vl2Var2;
            case 2:
                return new vl2((i45) obj3, (List) obj2, this.d, jt1Var, 2);
            case 3:
                return new vl2(this.d, (sr5) this.c, (by3) obj3, (jh4) obj2, jt1Var);
            case 4:
                return new vl2((tb9) obj3, (List) obj2, this.d, jt1Var, 4);
            case 5:
                return new vl2((h8a) this.c, (String) obj3, (String) obj2, this.d, jt1Var);
            case 6:
                return new vl2(6, jt1Var, (a07) obj3, (yy6) obj2, this.d);
            case 7:
                return new vl2((hra) obj3, (List) obj2, this.d, jt1Var, 7);
            case 8:
                vl2 vl2Var3 = new vl2((uhb) obj3, (String) obj2, this.d, jt1Var, 8);
                vl2Var3.c = obj;
                return vl2Var3;
            case 9:
                return new vl2((h49) obj3, (List) obj2, this.d, jt1Var, 9);
            default:
                return new vl2((e7c) obj3, (wlb) obj2, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((vl2) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object objN;
        zv5 zv5Var;
        Object objB;
        Object objN2;
        zv5 zv5Var2;
        Object objN3;
        zv5 zv5Var3;
        Object pm8Var;
        Object value;
        Collection collectionValues;
        Object objN4;
        zv5 zv5Var4;
        Object objA0;
        pn2 pn2Var;
        boolean z;
        Object objA02;
        int i = this.a;
        xx1 xx1Var = xx1.a;
        Object obj2 = this.f;
        heb hebVar = heb.a;
        Object obj3 = this.e;
        int i2 = 1;
        jt1 jt1Var = null;
        switch (i) {
            case 0:
                i3c i3cVar = (i3c) this.c;
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    this.c = null;
                    this.b = 1;
                    if (yl2.a((ut0) obj2, i3cVar.a, this.d, (pa7) obj3, this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 1:
                pd8 pd8Var = (pd8) this.c;
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    this.c = null;
                    this.b = 1;
                    if (yl2.a(pd8Var.a, (bv0) obj2, this.d, (pa7) obj3, this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i4 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 2:
                i45 i45Var = (i45) obj2;
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    wp3 wp3VarG = ((uw5) i45Var.d).g(i45Var.c);
                    this.b = 1;
                    objN = cx1.N(wp3VarG, this);
                    if (objN == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            gp.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        zv5Var = (zv5) this.c;
                        e11.e0(obj);
                        i45Var.i(i45Var.L, new g05(((j4b) i45Var.u).e(zv5Var.b, zv5Var.a, zv5Var.m)));
                        return hebVar;
                    }
                    e11.e0(obj);
                    objN = obj;
                }
                zv5 zv5Var5 = (zv5) objN;
                if (zv5Var5 != null) {
                    aw5 aw5Var = i45Var.d;
                    zv5 zv5VarA = zv5.a(zv5Var5, null, null, (List) obj3, null, 1, null, null, 0, 0.0d, this.d, false, -41959489);
                    this.c = zv5Var5;
                    this.b = 2;
                    ((uw5) aw5Var).j(zv5VarA);
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                    zv5Var = zv5Var5;
                    i45Var.i(i45Var.L, new g05(((j4b) i45Var.u).e(zv5Var.b, zv5Var.a, zv5Var.m)));
                }
                return hebVar;
            case 3:
                sr5 sr5Var = (sr5) this.c;
                int i6 = this.b;
                try {
                    if (i6 == 0) {
                        e11.e0(obj);
                        if (this.d) {
                            ym ymVar = sr5Var.p;
                            Float f = new Float(0.0f);
                            this.b = 1;
                            if (ymVar.f(this, f) == xx1Var) {
                                return xx1Var;
                            }
                        }
                    } else {
                        if (i6 != 1) {
                            if (i6 != 2) {
                                gp.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            e11.e0(obj);
                            objB = obj;
                            return hebVar;
                        }
                        e11.e0(obj);
                    }
                    ym ymVar2 = sr5Var.p;
                    Float f2 = new Float(1.0f);
                    by3 by3Var = (by3) obj2;
                    qr5 qr5Var = new qr5((jh4) obj3, sr5Var, 0);
                    this.b = 2;
                    objB = ym.b(ymVar2, f2, by3Var, qr5Var, this, 4);
                    if (objB == xx1Var) {
                        return xx1Var;
                    }
                    return hebVar;
                } finally {
                    sr5Var.e(false);
                }
            case 4:
                tb9 tb9Var = (tb9) obj2;
                aw5 aw5Var2 = tb9Var.e;
                int i7 = this.b;
                if (i7 == 0) {
                    e11.e0(obj);
                    wp3 wp3VarG2 = ((uw5) aw5Var2).g(tb9Var.c);
                    this.b = 1;
                    objN2 = cx1.N(wp3VarG2, this);
                    if (objN2 == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            gp.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        zv5Var2 = (zv5) this.c;
                        e11.e0(obj);
                        tb9Var.i(tb9Var.u, new ti0(((j4b) tb9Var.s).e(zv5Var2.b, zv5Var2.a, zv5Var2.m)));
                        return hebVar;
                    }
                    e11.e0(obj);
                    objN2 = obj;
                }
                zv5 zv5Var6 = (zv5) objN2;
                if (zv5Var6 != null) {
                    zv5 zv5VarA2 = zv5.a(zv5Var6, null, null, (List) obj3, null, 1, null, null, 0, 0.0d, this.d, false, -41959489);
                    this.c = zv5Var6;
                    this.b = 2;
                    ((uw5) aw5Var2).j(zv5VarA2);
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                    zv5Var2 = zv5Var6;
                    tb9Var.i(tb9Var.u, new ti0(((j4b) tb9Var.s).e(zv5Var2.b, zv5Var2.a, zv5Var2.m)));
                }
                return hebVar;
            case 5:
                int i8 = this.b;
                if (i8 == 0) {
                    e11.e0(obj);
                    tna tnaVar = ((h8a) this.c).c;
                    String str = (String) obj2;
                    String str2 = (String) obj3;
                    boolean z2 = this.d;
                    this.b = 1;
                    n92 n92Var = ((zna) tnaVar).b.I;
                    n92Var.getClass();
                    str.getClass();
                    tc2 tc2Var = tc2.a;
                    rc2 rc2Var = (rc2) new g82(n92Var, str, new oc2(i2)).e();
                    if (rc2Var != null) {
                        String str3 = rc2Var.a;
                        long j = rc2Var.e;
                        long j2 = rc2Var.f;
                        str3.getClass();
                        str2.getClass();
                        n92Var.X(new rc2(str3, str, str2, z2, j, j2));
                    } else {
                        av0 av0Var = av0.d;
                        String strE = ra1.s(str).c("MD5").e();
                        qa1 qa1Var = r95.a;
                        n92Var.X(new rc2(strE, str, str2, z2, qa1Var.k().c(), qa1Var.k().c()));
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i8 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 6:
                a07 a07Var = (a07) obj2;
                int i9 = this.b;
                if (i9 == 0) {
                    e11.e0(obj);
                    c28 c28Var = (c28) a07Var.getValue();
                    if (c28Var != null) {
                        yy6 yy6Var = (yy6) obj3;
                        sa5 d28Var = this.d ? new d28(c28Var) : new b28(c28Var);
                        if (yy6Var != null) {
                            this.c = a07Var;
                            this.b = 1;
                            if (yy6Var.b(d28Var, this) == xx1Var) {
                                return xx1Var;
                            }
                        }
                    }
                    return hebVar;
                }
                if (i9 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a07Var = (a07) this.c;
                e11.e0(obj);
                a07Var.setValue((Object) null);
                return hebVar;
            case 7:
                hra hraVar = (hra) obj2;
                int i10 = this.b;
                if (i10 == 0) {
                    e11.e0(obj);
                    wp3 wp3VarG3 = ((uw5) hraVar.I).g(hraVar.H);
                    this.b = 1;
                    objN3 = cx1.N(wp3VarG3, this);
                    if (objN3 == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            gp.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        zv5Var3 = (zv5) this.c;
                        e11.e0(obj);
                        hraVar.i(hraVar.i0, new nea(((j4b) hraVar.R).e(zv5Var3.b, zv5Var3.a, zv5Var3.m)));
                        return hebVar;
                    }
                    e11.e0(obj);
                    objN3 = obj;
                }
                zv5 zv5Var7 = (zv5) objN3;
                if (zv5Var7 != null) {
                    aw5 aw5Var3 = hraVar.I;
                    zv5 zv5VarA3 = zv5.a(zv5Var7, null, null, (List) obj3, null, 1, null, null, 0, 0.0d, this.d, false, -41959489);
                    this.c = zv5Var7;
                    this.b = 2;
                    ((uw5) aw5Var3).j(zv5VarA3);
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                    zv5Var3 = zv5Var7;
                    hraVar.i(hraVar.i0, new nea(((j4b) hraVar.R).e(zv5Var3.b, zv5Var3.a, zv5Var3.m)));
                }
                return hebVar;
            case 8:
                boolean z3 = this.d;
                String str4 = (String) obj3;
                uhb uhbVar = (uhb) obj2;
                int i11 = this.b;
                try {
                    if (i11 == 0) {
                        e11.e0(obj);
                        q7 q7Var = uhbVar.c;
                        this.c = null;
                        this.b = 1;
                        Object objJ = ((s7) q7Var).a.d.J(str4, z3, this);
                        if (objJ != xx1Var) {
                            objJ = hebVar;
                        }
                        if (objJ == xx1Var) {
                            return xx1Var;
                        }
                    } else {
                        if (i11 != 1) {
                            gp.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        e11.e0(obj);
                    }
                    pm8Var = hebVar;
                    break;
                } catch (Throwable th) {
                    pm8Var = new pm8(th);
                }
                if (!(pm8Var instanceof pm8)) {
                    LinkedHashMap linkedHashMap = uhbVar.u;
                    ihb ihbVar = (ihb) linkedHashMap.get(str4);
                    if (ihbVar != null) {
                        linkedHashMap.put(str4, ihb.a(ihbVar, z3, gc1.Y("#3fa9f4"), 95));
                    }
                    fr9 fr9Var = uhbVar.d;
                    if (fr9Var != null) {
                        do {
                            value = fr9Var.getValue();
                            collectionValues = linkedHashMap.values();
                            collectionValues.getClass();
                        } while (!fr9Var.j(value, thb.a((thb) value, fc1.Z0(collectionValues))));
                    }
                }
                return hebVar;
            case 9:
                h49 h49Var = (h49) obj2;
                aw5 aw5Var4 = h49Var.d;
                int i12 = this.b;
                if (i12 == 0) {
                    e11.e0(obj);
                    wp3 wp3VarG4 = ((uw5) aw5Var4).g(h49Var.c);
                    this.b = 1;
                    objN4 = cx1.N(wp3VarG4, this);
                    if (objN4 == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            gp.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        zv5Var4 = (zv5) this.c;
                        e11.e0(obj);
                        h49Var.i(h49Var.G, new npb(((j4b) h49Var.t).e(zv5Var4.b, zv5Var4.a, zv5Var4.m)));
                        return hebVar;
                    }
                    e11.e0(obj);
                    objN4 = obj;
                }
                zv5 zv5Var8 = (zv5) objN4;
                if (zv5Var8 != null) {
                    zv5 zv5VarA4 = zv5.a(zv5Var8, null, null, (List) obj3, null, 1, null, null, 0, 0.0d, this.d, false, -41959489);
                    this.c = zv5Var8;
                    this.b = 2;
                    ((uw5) aw5Var4).j(zv5VarA4);
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                    zv5Var4 = zv5Var8;
                    h49Var.i(h49Var.G, new npb(((j4b) h49Var.t).e(zv5Var4.b, zv5Var4.a, zv5Var4.m)));
                }
                return hebVar;
            default:
                e7c e7cVar = (e7c) obj2;
                int i13 = this.b;
                if (i13 == 0) {
                    e11.e0(obj);
                    final boolean z4 = e7cVar.G;
                    final boolean z5 = e7cVar.H;
                    final eb7 eb7Var = e7cVar.I;
                    final boolean z6 = e7cVar.J;
                    final eb7 eb7Var2 = e7cVar.K;
                    final boolean zD = e7cVar.C.d(4);
                    final boolean zD2 = e7cVar.C.d(2);
                    final boolean zD3 = e7cVar.C.d(1);
                    l46 l46Var = e7cVar.C.a;
                    final wlb wlbVar = (wlb) obj3;
                    ib4 ib4Var = new ib4() { // from class: c7c
                        @Override // defpackage.ib4
                        public final Object invoke() {
                            wlb wlbVar2 = wlbVar;
                            float fY = fz1.Y(2, wlb.b(wlbVar2.a));
                            float fY2 = fz1.Y(2, wlb.c(wlbVar2.a));
                            StringBuilder sb = new StringBuilder("ZoomableState. zoomable. onEnd. velocity=");
                            sb.append(fY);
                            sb.append("x");
                            sb.append(fY2);
                            sb.append(", longPressExecuted=");
                            ky0.D(sb, z4, ", doubleTapExecuted=", z5, ", doubleTapPressPoint=");
                            sb.append(eb7Var);
                            sb.append(", oneFingerScaleExecuted=");
                            sb.append(z6);
                            sb.append(", twoFingerScaleCentroid=");
                            sb.append(eb7Var2);
                            sb.append(", supportOneFingerScale=");
                            sb.append(zD);
                            sb.append(", supportTwoFingerScale=");
                            sb.append(zD2);
                            sb.append(", supportDrag=");
                            sb.append(zD3);
                            return sb.toString();
                        }
                    };
                    l46Var.getClass();
                    l46Var.b(g46.a, ib4Var);
                    if (!z4 && !z5) {
                        pn2 pn2Var2 = (pn2) md2.y(e7cVar, xm1.h);
                        if (!zD || !z6) {
                            eb7Var = (!zD2 || eb7Var2 == null) ? null : eb7Var2;
                        }
                        o7c o7cVar = e7cVar.C;
                        this.c = pn2Var2;
                        this.d = zD3;
                        this.b = 1;
                        q6c q6cVar = o7cVar.c;
                        fb7 fb7Var = eb7Var != null ? new fb7(vo1.g0(eb7Var.a)) : null;
                        q6cVar.getClass();
                        objA0 = wx1.a0(new qoa(q6cVar, fb7Var, jt1Var, 28), this);
                        if (objA0 == xx1Var) {
                            return xx1Var;
                        }
                        pn2Var = pn2Var2;
                        z = zD3;
                    }
                    return hebVar;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                    objA02 = obj;
                    if (!((Boolean) objA02).booleanValue()) {
                        e7cVar.C.c.f(0);
                    }
                    return hebVar;
                }
                z = this.d;
                pn2Var = (pn2) this.c;
                e11.e0(obj);
                objA0 = obj;
                if (!((Boolean) objA0).booleanValue()) {
                    if (z) {
                        o7c o7cVar2 = e7cVar.C;
                        long j3 = ((wlb) obj3).a;
                        this.c = null;
                        this.b = 2;
                        q6c q6cVar2 = o7cVar2.c;
                        long jU = pu1.u(wlb.b(j3), wlb.c(j3));
                        Map mapSingletonMap = Collections.singletonMap("density", pn2Var);
                        mapSingletonMap.getClass();
                        q6cVar2.getClass();
                        objA02 = wx1.a0(new z(q6cVar2, jU, mapSingletonMap, (jt1) null, 10), this);
                        if (objA02 == xx1Var) {
                            return xx1Var;
                        }
                        if (!((Boolean) objA02).booleanValue()) {
                        }
                    }
                    e7cVar.C.c.f(0);
                }
                return hebVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vl2(int i, jt1 jt1Var, Object obj, Object obj2, boolean z) {
        super(2, jt1Var);
        this.a = i;
        this.f = obj;
        this.d = z;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vl2(qtb qtbVar, Object obj, boolean z, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.f = qtbVar;
        this.e = obj;
        this.d = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl2(e7c e7cVar, wlb wlbVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 10;
        this.f = e7cVar;
        this.e = wlbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl2(boolean z, sr5 sr5Var, by3 by3Var, jh4 jh4Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 3;
        this.d = z;
        this.c = sr5Var;
        this.f = by3Var;
        this.e = jh4Var;
    }
}
