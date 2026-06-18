package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class eqa extends o1a implements yb4 {
    public final /* synthetic */ int a = 1;
    public /* synthetic */ Object b;
    public final /* synthetic */ hra c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqa(hra hraVar, int i, jt1 jt1Var) {
        super(2, jt1Var);
        this.c = hraVar;
        this.d = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        hra hraVar = this.c;
        switch (i) {
            case 0:
                eqa eqaVar = new eqa(hraVar, jt1Var);
                eqaVar.b = obj;
                return eqaVar;
            default:
                eqa eqaVar2 = new eqa(hraVar, this.d, jt1Var);
                eqaVar2.b = obj;
                return eqaVar2;
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
                return ((eqa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            default:
                ((eqa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                return hebVar;
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object pm8Var;
        int i = this.a;
        heb hebVar = heb.a;
        hra hraVar = this.c;
        switch (i) {
            case 0:
                int i2 = this.d;
                try {
                    if (i2 == 0) {
                        e11.e0(obj);
                        hraVar.i(hraVar.i0, pea.a);
                        kka kkaVarX0 = hraVar.x0();
                        this.b = null;
                        this.d = 1;
                        obj = kkaVarX0.w(true, this);
                        xx1 xx1Var = xx1.a;
                        if (obj == xx1Var) {
                        }
                    } else if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    pm8Var = new Integer(((Number) obj).intValue());
                } catch (Throwable th) {
                    pm8Var = new pm8(th);
                }
                if (!(pm8Var instanceof pm8)) {
                    hraVar.i(hraVar.i0, new qea(((Number) pm8Var).intValue()));
                }
                if (qm8.a(pm8Var) != null) {
                    hraVar.i(hraVar.i0, oea.a);
                }
                break;
            default:
                e11.e0(obj);
                List list = ((bka) hraVar.r0.getValue()).f;
                int i3 = this.d;
                Iterator it = list.iterator();
                int i4 = 0;
                while (true) {
                    if (it.hasNext()) {
                        ArrayList arrayList = ((g21) it.next()).c;
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj2 = arrayList.get(i5);
                            i5++;
                            yja yjaVar = (yja) obj2;
                            if (i4 == i3) {
                                yjaVar.getClass();
                                za1 za1VarA = vtb.a(hraVar);
                                aj2 aj2Var = rw2.a;
                                hraVar.g(za1VarA, nh2.c, new ti(hraVar, yjaVar, (jt1) null, 17));
                            } else {
                                i4++;
                            }
                        }
                    }
                    break;
                }
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqa(hra hraVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.c = hraVar;
    }
}
