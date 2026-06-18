package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gqa extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ hra c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gqa(hra hraVar, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = hraVar;
        this.d = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new gqa(this.c, this.d, jt1Var, 0);
            case 1:
                return new gqa(this.c, this.d, jt1Var, 1);
            default:
                return new gqa(this.c, this.d, jt1Var, 2);
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
        return ((gqa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Collection collectionValues;
        String str;
        String strP;
        Object value2;
        jja jjaVar;
        ArrayList arrayList;
        int i = this.a;
        String str2 = this.d;
        xx1 xx1Var = xx1.a;
        hra hraVar = this.c;
        heb hebVar = heb.a;
        Object obj2 = null;
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
                    cm0 cm0Var = hraVar.O;
                    this.b = 1;
                    ((hm0) cm0Var).a.c.K(str2);
                    if (hebVar == xx1Var) {
                    }
                }
                break;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    a64 a64Var = (a64) hraVar.F0.remove(str2);
                    if (a64Var != null) {
                        u64 u64Var = hraVar.N;
                        String str3 = a64Var.a;
                        this.b = 1;
                        ((y64) u64Var).a(str3);
                        if (hebVar == xx1Var) {
                        }
                    }
                }
                fr9 fr9Var = hraVar.p0;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                        collectionValues = hraVar.F0.values();
                        collectionValues.getClass();
                    } while (!fr9Var.j(value, xga.a((xga) value, null, fc1.Z0(collectionValues), 1)));
                }
                break;
            default:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    y78 y78Var = hraVar.S;
                    this.b = 1;
                    n92 n92Var = ((c98) y78Var).a.E;
                    Iterator it = n92Var.P().c().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        str = this.d;
                        if (zHasNext) {
                            Object next = it.next();
                            if (lc5.Q(((bc2) next).b, str)) {
                                obj2 = next;
                            }
                        }
                    }
                    bc2 bc2Var = (bc2) obj2;
                    if (bc2Var == null || (strP = bc2Var.a) == null) {
                        strP = wm9.p();
                    }
                    n92Var.a0(new bc2(bc2Var != null ? bc2Var.c : r95.a.k().c(), r95.a.k().c(), strP, str));
                    if (hebVar == xx1Var) {
                    }
                }
                fr9 fr9Var2 = hraVar.y0;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                        jjaVar = (jja) value2;
                        List list = jjaVar.g;
                        arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (!lc5.Q(((v78) obj3).a, str2)) {
                                arrayList.add(obj3);
                            }
                        }
                    } while (!fr9Var2.j(value2, jja.a(jjaVar, false, false, null, null, 0, arrayList, 63)));
                }
                break;
        }
        return hebVar;
    }
}
