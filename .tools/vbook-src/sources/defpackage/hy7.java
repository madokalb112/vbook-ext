package defpackage;

import com.reader.android.AndroidApp;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class hy7 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hy7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    @Override // defpackage.kb4
    public final Object invoke(Object obj) throws e20 {
        int i = this.a;
        jt1 jt1Var = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                b91 b91Var = (b91) obj;
                b91Var.getClass();
                b91Var.a("type", tv9.b);
                b91Var.a(ES6Iterator.VALUE_PROPERTY, fx1.A("kotlinx.serialization.Polymorphic<" + ((iy7) obj2).a.g() + '>', r39.c, new m39[0]));
                b91Var.b = lc3.a;
                return heb.a;
            case 1:
                rg8 rg8Var = (rg8) obj2;
                n6b n6bVar = (n6b) obj;
                n6bVar.getClass();
                ms5 ms5Var = ((p6b) n6bVar).A;
                List listA0 = (List) rg8Var.a;
                if (listA0 != null) {
                    listA0.add(ms5Var);
                } else {
                    listA0 = gc1.a0(ms5Var);
                }
                rg8Var.a = listA0;
                return m6b.b;
            case 2:
                un5 un5Var = (un5) obj;
                float fA = ((g78) obj2).a();
                if (fA > 1.0f) {
                    float f = (-(fA - 1.0f)) * 180.0f;
                    long jA0 = un5Var.a.A0();
                    y91 y91Var = un5Var.a.b;
                    long jG = y91Var.G();
                    y91Var.x().i();
                    try {
                        ((lp8) y91Var.b).x(f, jA0);
                        un5Var.a();
                    } finally {
                        j39.s(y91Var, jG);
                    }
                } else {
                    un5Var.a();
                }
                return heb.a;
            case 3:
                t78 t78Var = (t78) obj2;
                List list = (List) obj;
                list.getClass();
                za1 za1VarA = vtb.a(t78Var);
                aj2 aj2Var = rw2.a;
                t78Var.g(za1VarA, nh2.c, new y46(t78Var, list, jt1Var, 19));
                return heb.a;
            case 4:
                AndroidApp androidApp = (AndroidApp) obj2;
                dk5 dk5Var = (dk5) obj;
                dk5Var.getClass();
                nc1 nc1Var = dk5Var.a;
                zk4 zk4Var = (zk4) nc1Var.b;
                yv5 yv5Var = yv5.b;
                zk4Var.getClass();
                yv5 yv5Var2 = yv5.e;
                if (yv5Var2.compareTo(yv5Var) <= 0) {
                    ((zk4) nc1Var.b).getClass();
                    yv5Var2.compareTo(yv5Var);
                }
                rx2 rx2Var = new rx2(androidApp, 25);
                vu6 vu6Var = new vu6();
                rx2Var.invoke(vu6Var);
                nc1Var.K(gc1.Y(vu6Var), true);
                return heb.a;
            case 5:
                ((pm1) obj2).c(obj);
                return heb.a;
            case 6:
                ff8 ff8Var = (ff8) obj2;
                Throwable th = (Throwable) obj;
                CancellationException cancellationExceptionA = e11.a("Recomposer effect job completed", th);
                synchronized (ff8Var.d) {
                    try {
                        yd5 yd5Var = ff8Var.e;
                        if (yd5Var != null) {
                            fr9 fr9Var = ff8Var.v;
                            cf8 cf8Var = cf8.b;
                            fr9Var.getClass();
                            fr9Var.l(null, cf8Var);
                            yd5Var.cancel(cancellationExceptionA);
                            ff8Var.s = null;
                            yd5Var.invokeOnCompletion(new q57(16, ff8Var, th));
                        } else {
                            ff8Var.f = cancellationExceptionA;
                            fr9 fr9Var2 = ff8Var.v;
                            cf8 cf8Var2 = cf8.a;
                            fr9Var2.getClass();
                            fr9Var2.l(null, cf8Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return heb.a;
            case 7:
                ((hf8) obj2).a((h83) obj);
                return heb.a;
            case 8:
                sn8 sn8Var = (sn8) obj2;
                ((yn8) obj).getClass();
                return new vn9(lc1.i, sn8Var.e, (a84) null, (t74) null, (u74) null, sn8Var.g, (String) null, 0L, (ge0) null, new aha(sn8Var.f, 0.0f), (h36) null, 0L, (jda) null, (o89) null, 64988);
            case 9:
                va4 va4Var = (va4) obj;
                va4Var.getClass();
                ((zo8) obj2).g = va4Var;
                return heb.a;
            case 10:
                ((qp7) obj).E(((ds8) obj2).a);
                return heb.a;
            case 11:
                rs8 rs8Var = ((os8) obj2).c;
                return Boolean.valueOf(rs8Var != null ? rs8Var.c(obj) : true);
            case 12:
                ((ns8) obj2).f(obj);
                return heb.a;
            case 13:
                ((jk9) obj2).remove(obj);
                return heb.a;
            case 14:
                ((yw2) obj).getClass();
                return new z5((xi) obj2, 15);
            case 15:
                ww8 ww8Var = (ww8) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                zm7 zm7Var = ww8Var.a;
                float fH = zm7Var.h() + fFloatValue + ww8Var.f;
                float fP = wx1.P(fH, 0.0f, ww8Var.e.h());
                i = fH == fP ? 1 : 0;
                float fH2 = fP - zm7Var.h();
                int iRound = Math.round(fH2);
                zm7Var.i(zm7Var.h() + iRound);
                ww8Var.f = fH2 - iRound;
                if (i == 0) {
                    fFloatValue = fH2;
                }
                return Float.valueOf(fFloatValue);
            case 16:
                gy8 gy8Var = (gy8) obj2;
                return new eb7(gy8Var.c(gy8Var.k, ((eb7) obj).a, gy8Var.j));
            case 17:
                ux7 ux7Var = (ux7) obj;
                if (((vv6) obj2).b(ux7Var.c)) {
                    ux7Var.a();
                }
                return heb.a;
            case 18:
                obj.getClass();
                return ((s5) obj2).invoke();
            case 19:
                oi5 oi5Var = (oi5) obj2;
                ((List) obj).getClass();
                return oi5Var;
            case 20:
                b89 b89Var = (b89) obj2;
                ((Boolean) obj).getClass();
                za1 za1VarA2 = vtb.a(b89Var);
                aj2 aj2Var2 = rw2.a;
                b89Var.g(za1VarA2, nh2.c, new z79(b89Var, jt1Var, 3));
                return heb.a;
            case 21:
                ((Float) obj).getClass();
                pn2 pn2Var = ((kb9) obj2).c;
                if (pn2Var != null) {
                    return Float.valueOf(pn2Var.k0(56.0f));
                }
                gp.l("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
                return null;
            case 22:
                yb9 yb9Var = (yb9) obj2;
                String str = (String) obj;
                str.getClass();
                za1 za1VarA3 = vtb.a(yb9Var);
                aj2 aj2Var3 = rw2.a;
                yb9Var.g(za1VarA3, nh2.c, new lq8(yb9Var, str, jt1Var, 8));
                return heb.a;
            case 23:
                df9 df9Var = (df9) obj2;
                ym ymVar = (ym) obj;
                ymVar.getClass();
                df9Var.n(Float.intBitsToFloat((int) (((eb7) ymVar.d()).a >> 32)));
                df9Var.o(Float.intBitsToFloat((int) (((eb7) ymVar.d()).a & 4294967295L)));
                return heb.a;
            case 24:
                xf9 xf9Var = (xf9) obj2;
                w29 w29Var = xf9Var.f;
                w29Var.getClass();
                if (!lc5.Q(xf9Var.f, w29Var)) {
                    d08.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                uz6 uz6Var = xf9Var.e;
                Object obj3 = xf9Var.c;
                if (uz6Var != null) {
                    if (obj3 != null) {
                        d08.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    uz6Var.a(obj);
                } else if (obj3 == null) {
                    xf9Var.c = obj;
                } else {
                    uz6 uz6Var2 = ku8.a;
                    uz6 uz6Var3 = new uz6();
                    uz6Var3.a(obj3);
                    uz6Var3.a(obj);
                    xf9Var.e = uz6Var3;
                    xf9Var.c = null;
                }
                return heb.a;
            case 25:
                return Integer.valueOf(((oi9) obj2).a(gx1.x(((kw6) obj).e)));
            case 26:
                lk9 lk9Var = (lk9) obj2;
                synchronized (lk9Var.g) {
                    kk9 kk9Var = lk9Var.i;
                    kk9Var.getClass();
                    Object obj4 = kk9Var.b;
                    obj4.getClass();
                    int i2 = kk9Var.d;
                    gz6 gz6Var = kk9Var.c;
                    if (gz6Var == null) {
                        gz6Var = new gz6();
                        kk9Var.c = gz6Var;
                        kk9Var.f.n(obj4, gz6Var);
                    }
                    kk9Var.b(obj, i2, obj4, gz6Var);
                }
                return heb.a;
            case 27:
                ln9 ln9Var = (ln9) obj2;
                ux5 ux5Var = (ux5) obj;
                ux5Var.getClass();
                ln9Var.k();
                return new lb0(ux5Var, ln9Var, 17);
            case 28:
                m91 m91Var = (m91) obj2;
                long j = ((eb7) obj).a;
                qha qhaVar = m91Var.c;
                if (qhaVar != null) {
                    int iH = qhaVar.b.h(j);
                    List listD = qhaVar.a.a.d(iH, iH);
                    int size = listD.size();
                    while (i < size) {
                        ap apVar = (ap) listD.get(i);
                        if (lc5.Q(apVar.d, m91Var.b)) {
                            m91Var.a.invoke(apVar.a);
                        }
                        i++;
                    }
                }
                return heb.a;
            default:
                oc8 oc8Var = (oc8) obj;
                oc8Var.getClass();
                p95 p95Var = p95.c;
                return yib.F(ny1.G(oc8Var.c), (mua) obj2).a();
        }
    }
}
