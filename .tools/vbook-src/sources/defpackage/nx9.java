package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class nx9 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nx9(nx9 nx9Var, s49 s49Var) {
        this.a = 4;
        this.b = nx9Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        float f;
        long j;
        char c;
        Set<Map.Entry> setEntrySet;
        int i = this.a;
        float f2 = 0.0f;
        long j2 = 4294967295L;
        char c2 = ' ';
        jt1 jt1Var = null;
        int i2 = 2;
        int i3 = 0;
        heb hebVar = heb.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                bn8 bn8Var = (bn8) obj;
                al8 al8VarJ1 = ox9.j1((ox9) obj2, 4);
                bn8Var.c(al8VarJ1.V);
                bn8Var.n(al8VarJ1.W);
                bn8Var.o(al8VarJ1.X);
                bn8Var.B(al8VarJ1.Y);
                bn8Var.C(al8VarJ1.Z);
                bn8Var.i(al8VarJ1.a0);
                bn8Var.j(al8VarJ1.b0);
                bn8Var.l(al8VarJ1.c0);
                bn8Var.w(al8VarJ1.d0);
                bn8Var.e(false);
                bn8Var.r(al8VarJ1.U);
                return hebVar;
            case 1:
                yp8 yp8Var = (yp8) obj;
                yp8Var.getClass();
                mq3 mq3Var = ((oaa) obj2).a;
                lq3 lq3Var = new lq3(mq3Var, jt1Var, i3);
                ArrayList arrayList = yp8Var.a;
                hu4 hu4Var = hu4.a;
                arrayList.add(new xp8(hu4Var, "/extension/docs", lq3Var));
                yp8Var.a("/extension/install", new lq3(mq3Var, jt1Var, 1));
                yp8Var.a("/extension/test", new lq3(mq3Var, jt1Var, i2));
                yp8Var.a("/extension/build", new lq3(mq3Var, jt1Var, 3));
                arrayList.add(new xp8(hu4Var, "/connect", new ei0(i2, i2, jt1Var)));
                return hebVar;
            case 2:
                Drawable drawable = (Drawable) obj2;
                r43 r43Var = (r43) obj;
                fy0 fy0VarX = r43Var.p0().x();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (r43Var.f() >> 32)), (int) Float.intBitsToFloat((int) (r43Var.f() & 4294967295L)));
                drawable.draw(sc.a(fy0VarX));
                return hebVar;
            case 3:
                ((kb4) obj).invoke((oca) obj2);
                return hebVar;
            case 4:
                nx9 nx9Var = (nx9) obj2;
                m7 m7Var = (n6b) obj;
                if (m7Var instanceof m7) {
                    nx9Var.invoke(m7Var.A);
                    return Boolean.TRUE;
                }
                gp.j("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 5:
                da8 da8Var = (da8) obj;
                da8Var.getClass();
                ((ma8) obj2).l(da8Var.c);
                return hebVar;
            case 6:
                ega egaVar = (ega) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                ym7 ym7Var = egaVar.a;
                float fH = ym7Var.h() + fFloatValue;
                ym7 ym7Var2 = egaVar.b;
                if (fH > ym7Var2.h()) {
                    fFloatValue = ym7Var2.h() - ym7Var.h();
                } else if (fH < 0.0f) {
                    fFloatValue = -ym7Var.h();
                }
                ym7Var.i(ym7Var.h() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 7:
                xha xhaVar = (xha) obj2;
                ap apVar = (ap) obj;
                sy5 sy5Var = (xo) apVar.a;
                if (sy5Var instanceof sy5) {
                    sy5 sy5Var2 = sy5Var;
                    if (sy5Var2.b == null) {
                        return ap.a(apVar, new sy5(sy5Var2.a, xhaVar), 0, 14);
                    }
                }
                if (!(sy5Var instanceof ry5)) {
                    return apVar;
                }
                ry5 ry5Var = (ry5) sy5Var;
                return ry5Var.b == null ? ap.a(apVar, new ry5(ry5Var.a, xhaVar), 0, 14) : apVar;
            case 8:
                ((zlb) obj2).b();
                return hebVar;
            case 9:
                rpa rpaVar = (rpa) obj2;
                i6b i6bVar = (i6b) obj;
                i6bVar.getClass();
                String str = i6bVar.a;
                str.getClass();
                za1 za1VarA = vtb.a(rpaVar);
                aj2 aj2Var = rw2.a;
                rpaVar.g(za1VarA, nh2.c, new qoa(rpaVar, str, jt1Var, i2));
                return hebVar;
            case 10:
                kta ktaVar = (kta) obj2;
                r43 r43Var2 = (r43) obj;
                r43Var2.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (r43Var2.f() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (r43Var2.f() & 4294967295L));
                if (fIntBitsToFloat > 0.0f && fIntBitsToFloat2 > 0.0f) {
                    long j3 = ktaVar.b.a;
                    int i4 = oa5.c;
                    float f3 = (int) (j3 >> 32);
                    float f4 = (int) (j3 & 4294967295L);
                    if (f3 > 0.0f && f4 > 0.0f) {
                        float f5 = fIntBitsToFloat / f3;
                        float f6 = fIntBitsToFloat2 / f4;
                        for (ata ataVar : (List) ktaVar.g.getValue()) {
                            ja5 ja5Var = ataVar.b;
                            ng ngVar = ataVar.c;
                            float f7 = ja5Var.a * f5;
                            float f8 = ja5Var.b * f6;
                            float f9 = ja5Var.c * f5;
                            float f10 = ja5Var.d * f6;
                            float f11 = f9 - f7;
                            if (f11 < f2) {
                                f11 = f2;
                            }
                            float f12 = f10 - f8;
                            if (f12 < f2) {
                                f12 = f2;
                            }
                            if (f11 <= f2 || f12 <= f2) {
                                f = f2;
                                j = j2;
                                c = c2;
                            } else {
                                f = f2;
                                j = j2;
                                int iFloor = (int) Math.floor(f7);
                                int iFloor2 = (int) Math.floor(f8);
                                int iCeil = (int) Math.ceil(f9);
                                int iCeil2 = (int) Math.ceil(f10);
                                c = c2;
                                long width = (((long) ngVar.a.getWidth()) << c2) | (((long) ngVar.a.getHeight()) & j);
                                long j4 = (((long) iFloor) << c) | (((long) iFloor2) & j);
                                int i5 = iCeil - iFloor;
                                if (i5 < 1) {
                                    i5 = 1;
                                }
                                int i6 = iCeil2 - iFloor2;
                                r43.F0(r43Var2, ngVar, width, j4, (((long) i5) << c) | (((long) (i6 < 1 ? 1 : i6)) & j), 0.0f, (qc1) null, 2, 480);
                            }
                            f2 = f;
                            j2 = j;
                            c2 = c;
                        }
                    }
                }
                return hebVar;
            case 11:
                yva yvaVar = (yva) obj2;
                List list = (List) obj;
                list.getClass();
                za1 za1VarA2 = vtb.a(yvaVar);
                aj2 aj2Var2 = rw2.a;
                yvaVar.g(za1VarA2, nh2.c, new qoa(yvaVar, list, jt1Var, 12));
                return hebVar;
            case 12:
                j7b j7bVar = (j7b) obj2;
                b91 b91Var = (b91) obj;
                b91Var.getClass();
                b91Var.a("first", j7bVar.a.e());
                b91Var.a("second", j7bVar.b.e());
                b91Var.a("third", j7bVar.c.e());
                return hebVar;
            case 13:
                rab rabVar = (rab) obj2;
                ux5 ux5Var = (ux5) obj;
                ux5Var.getClass();
                rabVar.k();
                return new lb0(ux5Var, rabVar, 18);
            case 14:
                uhb uhbVar = (uhb) obj2;
                String str2 = (String) obj;
                str2.getClass();
                uhbVar.e = str2;
                uhbVar.f = 1;
                uhbVar.u.clear();
                uhbVar.j();
                return hebVar;
            case 15:
                Long l = (Long) obj;
                l.longValue();
                ((hk9) obj2).remove(l);
                return hebVar;
            case 16:
                ad1 ad1Var = (ad1) obj;
                ad1Var.getClass();
                if (((c73) obj2).a()) {
                    long j5 = lc1.b;
                    long j6 = lc1.e;
                    return ad1.a(ad1Var, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j5, j6, j5, j6, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -122881, 65535);
                }
                long j7 = lc1.e;
                long j8 = lc1.b;
                return ad1.a(ad1Var, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j7, j8, j7, j8, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -122881, 65535);
            case 17:
                kub kubVar = (kub) ((lub) obj2).f.getValue();
                jub jubVar = (jub) kubVar.b.g(obj);
                if (jubVar != null) {
                    jubVar.d = true;
                    if (jubVar.c <= 0) {
                        kubVar.g(obj);
                    }
                }
                return hebVar;
            case 18:
                xu4 xu4Var = (xu4) obj;
                j00 j00Var = yu4.a;
                xu4Var.getClass();
                fk4 fk4Var = xu4Var.c;
                fg5 fg5VarK = i12.K((mf5) obj2);
                if (fg5VarK != null && (setEntrySet = fg5VarK.a.entrySet()) != null) {
                    for (Map.Entry entry : setEntrySet) {
                        String str3 = (String) entry.getKey();
                        String strG = i12.G((mf5) entry.getValue());
                        if (strG == null) {
                            strG = "";
                        }
                        fk4Var.h(str3, strG);
                    }
                }
                return hebVar;
            case 19:
                h5c h5cVar = (h5c) obj2;
                ux5 ux5Var2 = (ux5) obj;
                ux5Var2.getClass();
                h5cVar.k();
                return new lb0(ux5Var2, h5cVar, 19);
            case 20:
                x5c x5cVar = (x5c) obj2;
                ux5 ux5Var3 = (ux5) obj;
                ux5Var3.getClass();
                x5cVar.getClass();
                x5cVar.K = r95.a.k().c();
                return new lb0(ux5Var3, x5cVar, 20);
            case 21:
                ux7 ux7Var = (ux7) obj;
                ((b18) obj2).invoke(ux7Var, new eb7(vv1.T(ux7Var, false)));
                ux7Var.a();
                return hebVar;
            case 22:
                n7c n7cVar = (n7c) obj2;
                ux7 ux7Var2 = (ux7) obj;
                yd5 yd5Var = n7cVar.p;
                if (yd5Var != null) {
                    yd5Var.cancel(null);
                }
                n7cVar.q.setValue(Boolean.TRUE);
                n7cVar.g.a.a(ux7Var2.b, ux7Var2.c);
                return hebVar;
            default:
                List list2 = (List) obj;
                list2.getClass();
                return new n7c((od2) obj2, ((Number) list2.get(2)).floatValue(), ((Number) list2.get(0)).floatValue(), ((Number) list2.get(1)).floatValue());
        }
    }

    public /* synthetic */ nx9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
