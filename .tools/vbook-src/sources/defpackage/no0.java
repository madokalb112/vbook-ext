package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class no0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                no0 no0Var = new no0((oo0) obj5, (x67) obj4, (hd) obj3, (ma0) obj2, jt1Var, 0);
                no0Var.b = obj;
                return no0Var;
            case 1:
                return new no0((jja) this.b, (a07) obj5, (a07) obj4, (a07) obj3, (a07) obj2, jt1Var, 1);
            case 2:
                return new no0((List) this.b, (a07) obj5, (a07) obj4, (a07) obj3, (a07) obj2, jt1Var, 2);
            case 3:
                return new no0((yva) this.b, (String) obj5, (String) obj4, (String) obj3, (String) obj2, jt1Var, 3);
            case 4:
                return new no0((e6c) this.b, (sr1) obj5, (f9) obj4, (zm5) obj3, (ul7) obj2, jt1Var, 4);
            default:
                no0 no0Var2 = new no0((zx7) obj5, (n7c) obj4, (a07) obj3, (a07) obj2, jt1Var, 5);
                no0Var2.b = obj;
                return no0Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                ((no0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 3:
                ((no0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 4:
                ((no0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((no0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        long jM;
        int i = this.a;
        int i2 = 0;
        jt1 jt1Var = null;
        heb hebVar = heb.a;
        int i3 = 1;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                e11.e0(obj);
                vx1 vx1Var = (vx1) this.b;
                oo0 oo0Var = (oo0) obj5;
                ah1.J(vx1Var, null, null, new y(oo0Var, (x67) obj4, (hd) obj3, null, 13), 3);
                break;
            case 1:
                e11.e0(obj);
                break;
            case 2:
                e11.e0(obj);
                a07 a07Var = (a07) obj2;
                boolean zBooleanValue = ((Boolean) ((a07) obj5).getValue()).booleanValue();
                List listN0 = (List) this.b;
                if (zBooleanValue) {
                    listN0 = fc1.N0(listN0);
                }
                a07 a07Var2 = (a07) obj3;
                vx3 vx3Var = new vx3(fc1.q0(listN0), true, new aq9((a07) obj4, 13));
                if (!bw9.a0(((wga) a07Var2.getValue()).a.b)) {
                    vx3Var = new vx3(vx3Var, true, new aq9(a07Var2, 14));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ux3 ux3Var = new ux3(vx3Var);
                while (ux3Var.hasNext()) {
                    Object next = ux3Var.next();
                    Integer num = new Integer(((gba) next).c);
                    Object arrayList = linkedHashMap.get(num);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(num, arrayList);
                    }
                    ((List) arrayList).add(next);
                }
                a07Var.setValue(linkedHashMap);
                break;
            case 3:
                e11.e0(obj);
                yva yvaVar = (yva) this.b;
                ArrayList arrayListB1 = fc1.b1(((xva) yvaVar.d.getValue()).b);
                String str = (String) obj2;
                int size = arrayListB1.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        Object obj6 = arrayListB1.get(i4);
                        i4++;
                        if (!lc5.Q(((dab) obj6).a, str)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 != -1) {
                    arrayListB1.set(i2, dab.a((dab) arrayListB1.get(i2), false, (String) obj5, (String) obj4, (String) obj3, 3));
                } else {
                    arrayListB1.add(new dab(wm9.p(), (String) obj5, (String) obj4, (String) obj3, true));
                }
                za1 za1VarA = vtb.a(yvaVar);
                aj2 aj2Var = rw2.a;
                yvaVar.g(za1VarA, nh2.c, new qoa(yvaVar, arrayListB1, null, 12));
                break;
            case 4:
                e11.e0(obj);
                e6c e6cVar = (e6c) this.b;
                bz9 bz9Var = e6cVar.b;
                o7c o7cVar = e6cVar.a;
                List listY = gc1.Y(new f04());
                bz9Var.getClass();
                bz9Var.u.setValue(listY);
                oy9 oy9Var = bz9Var.e;
                oy9Var.getClass();
                sw1.h0();
                if (!lc5.Q(oy9Var.t, listY)) {
                    oy9Var.t = listY;
                    l46 l46Var = oy9Var.a;
                    e67 e67Var = new e67(20, listY, oy9Var);
                    l46Var.getClass();
                    l46Var.b(g46.b, e67Var);
                    oy9Var.f("regionDecodersChanged");
                }
                o7cVar.j((sr1) obj5);
                o7cVar.h((f9) obj4);
                o7cVar.l((zm5) obj3);
                long jI = ((ul7) obj2).i();
                if (jI != 9205357640488583168L) {
                    jM = (((long) t96.M(Float.intBitsToFloat((int) (jI >> 32)))) << 32) | (((long) t96.M(Float.intBitsToFloat((int) (jI & 4294967295L)))) & 4294967295L);
                } else {
                    jM = 0;
                }
                o7cVar.k(jM);
                break;
            default:
                vx1 vx1Var2 = (vx1) this.b;
                e11.e0(obj);
                zx7 zx7Var = (zx7) obj5;
                n7c n7cVar = (n7c) obj4;
                x6c x6cVar = new x6c(zx7Var, n7cVar, jt1Var, i2);
                zx1 zx1Var = zx1.d;
                ah1.J(vx1Var2, null, zx1Var, x6cVar, 1);
                ah1.J(vx1Var2, null, zx1Var, new x6c(zx7Var, n7cVar, jt1Var, i3), 1);
                ah1.J(vx1Var2, null, zx1Var, new u9a((zx7) obj5, n7cVar, (a07) obj3, (a07) obj2, (jt1) null, 9), 1);
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no0(Object obj, Object obj2, Object obj3, Object obj4, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
