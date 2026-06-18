package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bsa extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ csa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bsa(csa csaVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = csaVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        csa csaVar = this.c;
        switch (i) {
            case 0:
                bsa bsaVar = new bsa(csaVar, jt1Var, 0);
                bsaVar.b = obj;
                return bsaVar;
            case 1:
                bsa bsaVar2 = new bsa(csaVar, jt1Var, 1);
                bsaVar2.b = obj;
                return bsaVar2;
            case 2:
                bsa bsaVar3 = new bsa(csaVar, jt1Var, 2);
                bsaVar3.b = obj;
                return bsaVar3;
            default:
                bsa bsaVar4 = new bsa(csaVar, jt1Var, 3);
                bsaVar4.b = obj;
                return bsaVar4;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((bsa) create((String) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 1:
                ((bsa) create((kra) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 2:
                ((bsa) create((List) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            default:
                ((bsa) create((String) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i = this.a;
        heb hebVar = heb.a;
        csa csaVar = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj2;
                e11.e0(obj);
                fr9 fr9Var = csaVar.d;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, wra.a((wra) value, null, null, null, null, 0, false, false, false, 0, 0.0f, null, 0, str, 0.0f, 24575)));
                }
                break;
            case 1:
                kra kraVar = (kra) obj2;
                e11.e0(obj);
                fr9 fr9Var2 = csaVar.d;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, wra.a((wra) value2, kraVar, kraVar.a, null, null, 0, false, false, false, 0, 0.0f, null, 0, null, 0.0f, 32764)));
                }
                break;
            case 2:
                List list = (List) obj2;
                e11.e0(obj);
                fr9 fr9Var3 = csaVar.d;
                if (fr9Var3 != null) {
                    do {
                        value3 = fr9Var3.getValue();
                    } while (!fr9Var3.j(value3, wra.a((wra) value3, null, null, null, list, 0, false, false, false, 0, 0.0f, null, 0, null, 0.0f, 32759)));
                }
                break;
            default:
                String str2 = (String) obj2;
                e11.e0(obj);
                fr9 fr9Var4 = csaVar.d;
                if (fr9Var4 != null) {
                    do {
                        value4 = fr9Var4.getValue();
                    } while (!fr9Var4.j(value4, wra.a((wra) value4, null, null, null, null, 0, false, false, false, 0, 0.0f, str2, 0, null, 0.0f, 30719)));
                }
                break;
        }
        return hebVar;
    }
}
