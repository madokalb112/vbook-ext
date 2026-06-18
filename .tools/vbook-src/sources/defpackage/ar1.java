package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ar1 extends o1a implements zb4 {
    public final /* synthetic */ int a = 1;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar1(vx1 vx1Var, ib4 ib4Var, ym ymVar, by3 by3Var, a07 a07Var, jt1 jt1Var) {
        super(3, jt1Var);
        this.b = vx1Var;
        this.c = ib4Var;
        this.d = ymVar;
        this.e = by3Var;
        this.f = a07Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                ar1 ar1Var = new ar1((xq1) obj6, (x91) obj5, (mz0) obj4, (jt1) obj3);
                ar1Var.b = (xu4) obj;
                ar1Var.c = (wh7) obj2;
                return ar1Var.invokeSuspend(hebVar);
            default:
                ((Number) obj2).floatValue();
                new ar1((vx1) this.b, (ib4) this.c, (ym) obj6, (by3) obj5, (a07) obj4, (jt1) obj3).invokeSuspend(hebVar);
                return hebVar;
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        wh7 bn1Var;
        int i = this.a;
        Object obj2 = this.f;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                xu4 xu4Var = (xu4) this.b;
                wh7 wh7Var = (wh7) this.c;
                e11.e0(obj);
                if (!((xq1) obj3).a) {
                    return null;
                }
                on1 on1Var = xu4Var.f;
                rcb rcbVar = xu4Var.a;
                List<String> list = (List) on1Var.e(br1.c);
                if (list == null) {
                    k46 k46Var = br1.a;
                    if (!ww1.S(k46Var)) {
                        return null;
                    }
                    k46Var.j("Skipping request compression for " + rcbVar + " because no compressions set");
                    return null;
                }
                k46 k46Var2 = br1.a;
                if (ww1.S(k46Var2)) {
                    k46Var2.j("Compressing request body for " + rcbVar + " using " + list);
                }
                mz0 mz0Var = (mz0) obj2;
                ArrayList arrayList = new ArrayList(gc1.M(list, 10));
                for (String str : list) {
                    wq1 wq1Var = (wq1) mz0Var.get(str);
                    if (wq1Var == null) {
                        throw new r91(str);
                    }
                    arrayList.add(wq1Var);
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj4 = arrayList.get(i3);
                    i3++;
                    wq1 wq1Var2 = (wq1) obj4;
                    o0a o0aVar = xu4Var.e;
                    wh7Var.getClass();
                    wq1Var2.getClass();
                    o0aVar.getClass();
                    if (wh7Var instanceof uh7) {
                        bn1Var = new bn1(wh7Var, new an1(wh7Var, i2), wq1Var2, o0aVar);
                    } else if (wh7Var instanceof vh7) {
                        bn1Var = new cn1((vh7) wh7Var, wq1Var2, o0aVar);
                    } else if (wh7Var instanceof sh7) {
                        bn1Var = new bn1(wh7Var, new an1(wh7Var, 1), wq1Var2, o0aVar);
                    } else {
                        if (!(wh7Var instanceof th7)) {
                            mn5.g();
                            return null;
                        }
                        bn1Var = null;
                    }
                    if (bn1Var != null) {
                        wh7Var = bn1Var;
                    }
                }
                return wh7Var;
            default:
                e11.e0(obj);
                ah1.J((vx1) this.b, null, null, new vg((ib4) this.c, (ym) obj3, (by3) this.e, (a07) obj2, null, 27), 3);
                return heb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar1(xq1 xq1Var, x91 x91Var, mz0 mz0Var, jt1 jt1Var) {
        super(3, jt1Var);
        this.d = xq1Var;
        this.e = x91Var;
        this.f = mz0Var;
    }
}
