package defpackage;

import android.content.Context;
import android.view.textclassifier.TextClassifier;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ne0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne0(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = obj;
    }

    public static final void m(qg8 qg8Var, HashSet hashSet, ArrayList arrayList, rg8 rg8Var, e71 e71Var, gf6 gf6Var, boolean z) {
        if (gf6Var.a() - qg8Var.a > 21600000) {
            if (!hashSet.contains(zk4.i(gf6Var.a(), "yyyyMMddHH"))) {
                arrayList.add(new mx2(gf6Var.a()));
            }
            y51 y51Var = (y51) rg8Var.a;
            if (y51Var != null) {
                jf0.J(y51Var);
            }
            rg8Var.a = null;
        } else if (gf6Var.a() - qg8Var.a > 120000) {
            y51 y51Var2 = (y51) rg8Var.a;
            if (y51Var2 != null) {
                jf0.J(y51Var2);
            }
            rg8Var.a = null;
        }
        String str = gf6Var.c().a;
        ihb ihbVar = e71Var.x;
        y51 y51Var3 = new y51(gf6Var, lc5.Q(str, ihbVar != null ? ihbVar.a : null), z);
        y51 y51Var4 = (y51) rg8Var.a;
        dg6 dg6Var = dg6.a;
        if (y51Var4 == null) {
            y51Var3.d = dg6Var;
        } else {
            boolean zQ = lc5.Q(gf6Var.c().a, y51Var4.a.c().a);
            dg6 dg6Var2 = y51Var4.d;
            if (zQ) {
                dg6 dg6Var3 = dg6.c;
                if (dg6Var2 == dg6Var3) {
                    y51Var4.d = dg6.b;
                }
                y51Var3.d = dg6Var3;
            } else {
                if (dg6Var2 == dg6Var) {
                    y51Var4.d = dg6.d;
                }
                y51Var3.d = dg6Var;
            }
        }
        arrayList.add(y51Var3);
        rg8Var.a = y51Var3;
        qg8Var.a = gf6Var.a();
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new ne0((fo8) obj2, jt1Var, 0);
            case 1:
                return new ne0((rk0) obj2, jt1Var, 1);
            case 2:
                return new ne0((rq0) obj2, jt1Var, 2);
            case 3:
                return new ne0((e71) obj2, jt1Var, 3);
            case 4:
                return new ne0((d2c) obj2, jt1Var, 4);
            case 5:
                return new ne0((nv2) obj2, jt1Var, 5);
            case 6:
                return new ne0((iw2) obj2, jt1Var, 6);
            case 7:
                return new ne0((sr3) obj2, jt1Var, 7);
            case 8:
                return new ne0((cs3) obj2, jt1Var, 8);
            case 9:
                return new ne0((xi1) obj2, jt1Var, 9);
            case 10:
                return new ne0((zn7) obj2, jt1Var, 10);
            case 11:
                return new ne0((s74) obj2, jt1Var, 11);
            case 12:
                return new ne0((yk4) obj2, jt1Var, 12);
            case 13:
                return new ne0((cm4) obj2, jt1Var, 13);
            case 14:
                return new ne0((fr7) obj2, jt1Var, 14);
            case 15:
                return new ne0((ac1) obj2, jt1Var, 15);
            case 16:
                return new ne0((s87) obj2, jt1Var, 16);
            case 17:
                return new ne0((hk7) obj2, jt1Var, 17);
            case 18:
                return new ne0((wt7) obj2, jt1Var, 18);
            case 19:
                return new ne0((ru7) obj2, jt1Var, 19);
            case 20:
                return new ne0((vc8) obj2, jt1Var, 20);
            case 21:
                return new ne0((vd8) obj2, jt1Var, 21);
            case 22:
                return new ne0((b59) obj2, jt1Var, 22);
            case 23:
                return new ne0((dta) obj2, jt1Var, 23);
            case 24:
                return new ne0((kta) obj2, jt1Var, 24);
            case 25:
                return new ne0((c1b) obj2, jt1Var, 25);
            case 26:
                return new ne0((o9b) obj2, jt1Var, 26);
            case 27:
                return new ne0((rab) obj2, jt1Var, 27);
            default:
                return new ne0((owb) obj2, jt1Var, 28);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 1:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 2:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 3:
                break;
            case 4:
                ((ne0) create((aq1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 5:
                ((ne0) create((List) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 6:
                break;
            case 7:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 8:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 9:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 10:
                break;
            case 11:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 12:
                break;
            case 13:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 14:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 15:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 16:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 17:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 21:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 22:
                break;
            case 23:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 24:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 25:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 26:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 27:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            default:
                ((ne0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v77, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v32, types: [fr9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [jt1] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v28 */
    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Exception {
        Object value;
        cp0 cp0Var;
        Object next;
        Throwable th;
        Object value2;
        k85 k85Var;
        Object value3;
        boolean zC;
        boolean zBooleanValue;
        boolean zB;
        boolean zE;
        long jLongValue;
        Object value4;
        int iA;
        int iB;
        boolean zG;
        boolean zD;
        boolean zF;
        boolean zC2;
        int i = 2;
        ?? r4 = 0;
        Throwable th2 = null;
        r4 = 0;
        switch (this.a) {
            case 0:
                e11.e0(obj);
                ((fo8) this.b).h.setValue(Boolean.FALSE);
                return heb.a;
            case 1:
                e11.e0(obj);
                ((rk0) this.b).l();
                return heb.a;
            case 2:
                e11.e0(obj);
                rq0 rq0Var = (rq0) this.b;
                fp0 fp0Var = rq0Var.d;
                fr9 fr9Var = rq0Var.s;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                        cp0Var = ((ip0) fp0Var).b;
                    } while (!fr9Var.j(value, iq0.a((iq0) value, false, ((Boolean) cp0Var.a.c(cp0.d[0], cp0Var)).booleanValue(), ((ip0) fp0Var).b.a(), null, null, 51)));
                }
                return heb.a;
            case 3:
                e11.e0(obj);
                ArrayList arrayList = new ArrayList();
                qg8 qg8Var = new qg8();
                HashSet hashSet = new HashSet();
                rg8 rg8Var = new rg8();
                e71 e71Var = (e71) this.b;
                Collection collectionValues = e71Var.F.values();
                collectionValues.getClass();
                List<gf6> listR0 = fc1.R0(new k54(16), collectionValues);
                e71 e71Var2 = (e71) this.b;
                for (gf6 gf6Var : listR0) {
                    gf6Var.getClass();
                    e71 e71Var3 = e71Var2;
                    m(qg8Var, hashSet, arrayList, rg8Var, e71Var3, gf6Var, false);
                    e71Var2 = e71Var3;
                }
                Collection<gf6> collectionValues2 = e71Var.G.values();
                collectionValues2.getClass();
                e71 e71Var4 = (e71) this.b;
                for (gf6 gf6Var2 : collectionValues2) {
                    gf6Var2.getClass();
                    m(qg8Var, hashSet, arrayList, rg8Var, e71Var4, gf6Var2, true);
                }
                y51 y51Var = (y51) rg8Var.a;
                if (y51Var != null) {
                    jf0.J(y51Var);
                }
                return fc1.N0(arrayList);
            case 4:
                e11.e0(obj);
                String str = rp1.a;
                d2c d2cVar = (d2c) this.b;
                cp4.k().d(str, "Constraints changed for " + d2cVar);
                return heb.a;
            case 5:
                e11.e0(obj);
                nv2 nv2Var = (nv2) this.b;
                za1 za1VarA = vtb.a(nv2Var);
                aj2 aj2Var = rw2.a;
                nv2Var.g(za1VarA, nh2.c, new oc(nv2Var, (jt1) r4, i));
                return heb.a;
            case 6:
                e11.e0(obj);
                iw2 iw2Var = (iw2) this.b;
                synchronized (iw2Var.t) {
                    if (!iw2Var.y || iw2Var.z) {
                        return heb.a;
                    }
                    try {
                        iw2Var.j0();
                        break;
                    } catch (IOException unused) {
                        iw2Var.A = true;
                    }
                    try {
                        if ((iw2Var.v >= 2000 ? 1 : 0) != 0) {
                            iw2Var.x0();
                        }
                        break;
                    } catch (IOException unused2) {
                        iw2Var.B = true;
                        iw2Var.w = new he8(new eh0());
                    }
                    return heb.a;
                }
            case 7:
                e11.e0(obj);
                sr3 sr3Var = (sr3) this.b;
                for (to3 to3Var : sr3Var.t) {
                    Iterator it = sr3Var.u.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (lc5.Q(((to3) next).a, to3Var.a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    to3 to3Var2 = (to3) next;
                    if (to3Var2 != null && to3Var2.g < to3Var.g) {
                        za1 za1VarA2 = vtb.a(sr3Var);
                        aj2 aj2Var2 = rw2.a;
                        sr3Var.g(za1VarA2, nh2.c, new hl2(sr3Var, to3Var, r4, 17));
                    }
                }
                return heb.a;
            case 8:
                e11.e0(obj);
                cs3 cs3Var = (cs3) this.b;
                int i2 = cs3Var.q;
                while (i < i2) {
                    int i3 = cs3Var.p + i + 1;
                    ArrayList arrayList2 = cs3Var.k;
                    zka zkaVar = arrayList2 != null ? (zka) fc1.A0(i3, arrayList2) : null;
                    if (zkaVar != null) {
                        String str2 = zkaVar.a;
                        se6 se6Var = cs3Var.s;
                        se6Var.getClass();
                        if (se6Var.a.get(str2) == null) {
                            xr3 xr3Var = new xr3();
                            cs3Var.A(xr3Var, str2);
                            se6Var.a(str2, xr3Var);
                        }
                    }
                    i++;
                }
                return heb.a;
            case 9:
                e11.e0(obj);
                xi1 xi1Var = (xi1) this.b;
                if (xi1Var != null) {
                    WeakReference weakReference = vv3.a;
                    vv3.a = new WeakReference(xi1Var);
                }
                return heb.a;
            case 10:
                e11.e0(obj);
                oh5 oh5Var = gx3.a;
                zn7 zn7Var = (zn7) this.b;
                oh5Var.getClass();
                j85 j85VarK0 = tu1.k0(zn7Var.toFile());
                xq0 xq0Var = new xq0();
                try {
                    xq0Var.K0(j85VarK0);
                    byte[] bArrE0 = xq0Var.e0(xq0Var.b);
                    try {
                        j85VarK0.close();
                        xq0Var.p();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                    Throwable th4 = th2;
                    r4 = bArrE0;
                    th = th4;
                    break;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        j85VarK0.close();
                        xq0Var.p();
                    } catch (Throwable th6) {
                        i12.r(th, th6);
                    }
                    break;
                }
                if (th == null) {
                    return r4;
                }
                throw th;
            case 11:
                e11.e0(obj);
                s74 s74Var = (s74) this.b;
                za1 za1VarA3 = vtb.a(s74Var);
                aj2 aj2Var3 = rw2.a;
                s74Var.g(za1VarA3, nh2.c, new yw3(s74Var, (jt1) r4, 10));
                return heb.a;
            case 12:
                e11.e0(obj);
                owb owbVar = ((yk4) this.b).a;
                if (owbVar == null) {
                    return null;
                }
                owbVar.a.destroy();
                owbVar.f.clear();
                owbVar.e = null;
                return heb.a;
            case 13:
                e11.e0(obj);
                cm4 cm4Var = (cm4) this.b;
                fr9 fr9Var2 = cm4Var.s;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, zl4.a((zl4) value2, 0, 0, false, false, false, ((sd8) cm4Var.f).e(), null, 191)));
                }
                return heb.a;
            case 14:
                e11.e0(obj);
                ((fr7) this.b).a.a();
                return heb.a;
            case 15:
                e11.e0(obj);
                o7c o7cVar = ((ac1) this.b).a;
                iu8.o.getClass();
                o7cVar.m(new d04(2.0f));
                o7cVar.y.setValue(Boolean.FALSE);
                q6c q6cVar = o7cVar.c;
                q6cVar.getClass();
                sw1.h0();
                if (q6cVar.m) {
                    q6cVar.m = false;
                    l46 l46Var = q6cVar.a;
                    l46Var.getClass();
                    g46 g46Var = g46.b;
                    if (l46Var.a(g46Var)) {
                        xg xgVar = l46Var.b;
                        String str3 = l46Var.a;
                        xgVar.getClass();
                        xg.a(g46Var, str3, "ZoomableState. rubberBandScale=false");
                    }
                }
                return heb.a;
            case 16:
                e11.e0(obj);
                s87 s87Var = (s87) this.b;
                fr9 fr9Var3 = s87Var.b;
                qt qtVar = s87Var.a;
                km0 km0Var = qtVar.x;
                ni5[] ni5VarArr = qt.T;
                Boolean bool = (Boolean) km0Var.c(ni5VarArr[22], qtVar);
                bool.getClass();
                fr9Var3.getClass();
                fr9Var3.l(null, bool);
                fr9 fr9Var4 = s87Var.c;
                Boolean bool2 = (Boolean) qtVar.y.c(ni5VarArr[23], qtVar);
                bool2.getClass();
                fr9Var4.getClass();
                fr9Var4.l(null, bool2);
                fr9 fr9Var5 = s87Var.d;
                Boolean bool3 = (Boolean) qtVar.z.c(ni5VarArr[24], qtVar);
                bool3.getClass();
                fr9Var5.getClass();
                fr9Var5.l(null, bool3);
                ?? r14 = s87Var.e;
                Boolean bool4 = (Boolean) qtVar.A.c(ni5VarArr[25], qtVar);
                bool4.booleanValue();
                r14.getClass();
                r14.l(null, bool4);
                fr9 fr9Var6 = s87Var.f;
                Integer num = new Integer(((Number) qtVar.B.c(ni5VarArr[26], qtVar)).intValue());
                fr9Var6.getClass();
                fr9Var6.l(null, num);
                fr9 fr9Var7 = s87Var.g;
                Integer num2 = new Integer(qtVar.d());
                fr9Var7.getClass();
                fr9Var7.l(null, num2);
                return heb.a;
            case 17:
                e11.e0(obj);
                hk7 hk7Var = (hk7) this.b;
                hk7Var.h(0.0f);
                hk7Var.e.setValue(Boolean.TRUE);
                hk7Var.f();
                return heb.a;
            case 18:
                e11.e0(obj);
                wt7 wt7Var = (wt7) this.b;
                wt7Var.getClass();
                t96 t96Var = wt7Var.a;
                if (t96Var instanceof dg) {
                    k85Var = hx3.a.y(vo1.i0(wt7Var));
                } else {
                    if (!(t96Var instanceof eg)) {
                        mn5.g();
                        return null;
                    }
                    Context context = (Context) tv3.a.get();
                    if (context == null) {
                        throw new uv3("FileKit Core not initialized properly. You may have disabled App Startup in your app. Please check the documentation: https://filekit.mintlify.app/core/setup#android-setup");
                    }
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(((eg) t96Var).z);
                    if (inputStreamOpenInputStream == null) {
                        throw new e20("Could not open input stream for Uri");
                    }
                    int i4 = yg5.a;
                    k85Var = new k85(inputStreamOpenInputStream);
                }
                se8 se8Var = new se8(k85Var);
                try {
                    byte[] bArrT = qn9.t(se8Var, -1);
                    lc5.U(se8Var, null);
                    return bArrT;
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        lc5.U(se8Var, th7);
                        throw th8;
                    }
                }
            case 19:
                e11.e0(obj);
                ru7 ru7Var = (ru7) this.b;
                TextClassifier textClassifierK = cr.k(ru7Var.b, ru7Var.c);
                ru7Var.f = textClassifierK;
                return textClassifierK;
            case 20:
                e11.e0(obj);
                vc8 vc8Var = (vc8) this.b;
                int i5 = vc8.K;
                zo9 zo9Var = (zo9) vc8Var.H.getValue();
                ah1.J(vtb.a(zo9Var), null, null, new dd9(zo9Var, (jt1) r4, 4), 3);
                return heb.a;
            case 21:
                e11.e0(obj);
                vd8 vd8Var = (vd8) this.b;
                fr9 fr9Var8 = vd8Var.d;
                if (fr9Var8 != null) {
                    do {
                        value3 = fr9Var8.getValue();
                        rd8 rd8Var = vd8Var.c;
                        zC = ((sd8) rd8Var).a.c();
                        sd8 sd8Var = (sd8) rd8Var;
                        zc8 zc8Var = sd8Var.a;
                        km0 km0Var2 = zc8Var.d;
                        ni5[] ni5VarArr2 = zc8.q;
                        zBooleanValue = ((Boolean) km0Var2.c(ni5VarArr2[2], zc8Var)).booleanValue();
                        zB = sd8Var.a.b();
                        zE = sd8Var.e();
                        zc8 zc8Var2 = sd8Var.a;
                        jLongValue = ((Number) zc8Var2.o.c(ni5VarArr2[13], zc8Var2)).longValue();
                        ((ud8) value3).getClass();
                    } while (!fr9Var8.j(value3, new ud8(zC, zBooleanValue, zB, zE, jLongValue)));
                }
                return heb.a;
            case 22:
                e11.e0(obj);
                return (b59) this.b;
            case 23:
                e11.e0(obj);
                dta dtaVar = (dta) this.b;
                dtaVar.getClass();
                try {
                    j39.t(dtaVar);
                    break;
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused3) {
                }
                return heb.a;
            case 24:
                kta ktaVar = (kta) this.b;
                e11.e0(obj);
                try {
                    bh8 bh8VarA = ktaVar.c.a(new ty9(new r25(ktaVar.a), ktaVar.b), ktaVar.a);
                    bh8VarA.j();
                    ktaVar.i = bh8VarA;
                    break;
                } catch (Throwable th9) {
                    ktaVar.h.setValue(th9);
                }
                return heb.a;
            case 25:
                e11.e0(obj);
                c1b c1bVar = (c1b) this.b;
                if (!c1bVar.t) {
                    c1bVar.j();
                }
                return heb.a;
            case 26:
                e11.e0(obj);
                o9b o9bVar = (o9b) this.b;
                fr9 fr9Var9 = o9bVar.d;
                if (fr9Var9 != null) {
                    do {
                        value4 = fr9Var9.getValue();
                        rd8 rd8Var2 = o9bVar.c;
                        iA = ((sd8) rd8Var2).a();
                        sd8 sd8Var2 = (sd8) rd8Var2;
                        iB = sd8Var2.b();
                        zG = sd8Var2.g();
                        zD = sd8Var2.d();
                        zF = sd8Var2.f();
                        zC2 = sd8Var2.c();
                        ((l9b) value4).getClass();
                    } while (!fr9Var9.j(value4, new l9b(iA, iB, zG, zD, zF, zC2)));
                }
                return heb.a;
            case 27:
                e11.e0(obj);
                rab rabVar = (rab) this.b;
                za1 za1VarA4 = vtb.a(rabVar);
                aj2 aj2Var4 = rw2.a;
                rabVar.g(za1VarA4, nh2.c, new gb3(rabVar, (jt1) r4, 7));
                return heb.a;
            default:
                e11.e0(obj);
                owb owbVar2 = (owb) this.b;
                owbVar2.a.destroy();
                owbVar2.f.clear();
                owbVar2.e = null;
                return heb.a;
        }
    }
}
