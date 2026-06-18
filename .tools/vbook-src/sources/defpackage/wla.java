package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wla extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ fma c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wla(fma fmaVar, int i, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.c = fmaVar;
        this.d = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        int i2 = this.d;
        fma fmaVar = this.c;
        switch (i) {
            case 0:
                return new wla(fmaVar, i2, jt1Var, 0);
            default:
                return new wla(fmaVar, i2, jt1Var, 1);
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
        return ((wla) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objK;
        Object value;
        int i = this.a;
        xx1 xx1Var = xx1.a;
        fma fmaVar = this.c;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    p8b p8bVarL = fmaVar.l();
                    this.b = 1;
                    dla dlaVar = p8bVarL.a;
                    dlaVar.getClass();
                    objK = dlaVar.k(this);
                    if (objK == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                    objK = obj;
                }
                int iQ = wx1.Q(this.d, 1, ((xka) objK).c);
                zna znaVar = (zna) fmaVar.c;
                rna rnaVar = znaVar.a;
                String strC = rnaVar.c();
                String strH = znaVar.h();
                strC.getClass();
                g18 g18VarB = rnaVar.b();
                g18VarB.getClass();
                wh0 wh0VarF = g18VarB.f();
                wh0VarF.getClass();
                ah1.S(hc3.a, new th0(wh0VarF, "tts_break_length_" + strC + "_" + strH, iQ, null, 1));
                fr9 fr9Var = fmaVar.e;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, sla.a((sla) value, 0.0f, 0.0f, (String) null, (ArrayList) null, (String) null, (List) null, (String) null, (List) null, (String) null, 0, (List) null, false, (String) null, (String) null, iQ, false, 49151)));
                }
                return hebVar;
            default:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    zna znaVar2 = (zna) fmaVar.c;
                    rna rnaVar2 = znaVar2.a;
                    String strC2 = rnaVar2.c();
                    String strH2 = znaVar2.h();
                    strC2.getClass();
                    g18 g18VarB2 = rnaVar2.b();
                    g18VarB2.getClass();
                    wh0 wh0VarF2 = g18VarB2.f();
                    wh0VarF2.getClass();
                    ah1.S(hc3.a, new th0(wh0VarF2, "tts_break_" + strC2 + "_" + strH2, this.d, null, 1));
                    this.b = 1;
                    fmaVar.n();
                    if (hebVar == xx1Var) {
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
        }
    }
}
