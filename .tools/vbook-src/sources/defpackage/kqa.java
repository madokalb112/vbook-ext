package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kqa extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ hra c;
    public final /* synthetic */ aca d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kqa(hra hraVar, aca acaVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = hraVar;
        this.d = acaVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        aca acaVar = this.d;
        hra hraVar = this.c;
        switch (i) {
            case 0:
                return new kqa(hraVar, acaVar, jt1Var, 0);
            default:
                return new kqa(hraVar, acaVar, jt1Var, 1);
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
        return ((kqa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        aca acaVar = this.d;
        hra hraVar = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    bp bpVar = acaVar.d;
                    List list = acaVar.e;
                    this.b = 1;
                    Serializable serializableJ = hra.J(hraVar, bpVar, list, this);
                    if (serializableJ == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    bp bpVar2 = acaVar.d;
                    List list2 = acaVar.e;
                    this.b = 1;
                    Serializable serializableJ2 = hra.J(hraVar, bpVar2, list2, this);
                    if (serializableJ2 == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}
