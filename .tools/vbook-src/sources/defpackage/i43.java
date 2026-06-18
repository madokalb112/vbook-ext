package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i43 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i43(hg9 hg9Var, long j, jg9 jg9Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.d = hg9Var;
        this.c = j;
        this.e = jg9Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                i43 i43Var = new i43((j43) obj2, this.c, jt1Var, 0);
                i43Var.d = obj;
                return i43Var;
            case 1:
                return new i43((hg9) this.d, this.c, (jg9) obj2, jt1Var);
            default:
                i43 i43Var2 = new i43((c1b) obj2, this.c, jt1Var, 2);
                i43Var2.d = obj;
                return i43Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((i43) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object pm8Var;
        Object value;
        b1b b1bVar;
        xq2 xq2VarA;
        ArrayList arrayList;
        int i = this.a;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        Object obj2 = this.e;
        long j = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    vx1 vx1Var = (vx1) this.d;
                    zb4 zb4Var = ((j43) obj2).Y;
                    eb7 eb7Var = new eb7(j);
                    this.b = 1;
                    if (zb4Var.c(vx1Var, eb7Var, this) == xx1Var) {
                    }
                }
                break;
            case 1:
                jg9 jg9Var = (jg9) obj2;
                hg9 hg9Var = (hg9) this.d;
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                        objB = obj;
                    }
                    break;
                } else {
                    e11.e0(obj);
                    ym ymVar = hg9Var.a;
                    na5 na5Var = new na5(j);
                    ko koVar = jg9Var.B;
                    this.b = 1;
                    objB = ym.b(ymVar, na5Var, koVar, null, this, 12);
                    if (objB == xx1Var) {
                    }
                }
                go goVar = ((io) objB).b;
                break;
            default:
                c1b c1bVar = (c1b) obj2;
                int i4 = this.b;
                try {
                    if (i4 != 0) {
                        if (i4 != 1) {
                            gp.j("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            e11.e0(obj);
                        }
                        break;
                    } else {
                        e11.e0(obj);
                        pg1 pg1Var = c1bVar.d;
                        this.d = null;
                        this.b = 1;
                        Object objH = ((vg1) pg1Var).a.d.h(j, this);
                        if (objH != xx1Var) {
                            objH = hebVar;
                        }
                        if (objH == xx1Var) {
                        }
                    }
                    pm8Var = hebVar;
                } catch (Throwable th) {
                    pm8Var = new pm8(th);
                }
                if (!(pm8Var instanceof pm8)) {
                    fr9 fr9Var = c1bVar.f;
                    if (fr9Var != null) {
                        do {
                            value = fr9Var.getValue();
                            b1bVar = (b1b) value;
                            xq2 xq2Var = b1bVar.f;
                            xq2VarA = xq2Var != null ? xq2.a(xq2Var, 0, false, Math.max(0, xq2Var.k - 1), 15359) : null;
                            List<bp2> list = b1bVar.g;
                            arrayList = new ArrayList(gc1.M(list, 10));
                            for (bp2 bp2VarA : list) {
                                if (bp2VarA.a == j) {
                                    bp2VarA = bp2.a(bp2VarA, 0, false, gc1.Y(jo2.a), 503);
                                }
                                arrayList.add(bp2VarA);
                            }
                        } while (!fr9Var.j(value, b1b.a(b1bVar, false, false, false, false, false, xq2VarA, arrayList, 31)));
                    }
                }
                Throwable thA = qm8.a(pm8Var);
                if (thA != null) {
                    thA.printStackTrace();
                }
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i43(Object obj, long j, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = obj;
        this.c = j;
    }
}
