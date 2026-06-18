package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q7a extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7a(h8a h8aVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = h8aVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        h8a h8aVar = this.b;
        switch (i) {
            case 0:
                return new q7a(h8aVar, jt1Var, 0);
            case 1:
                return new q7a(h8aVar, jt1Var, 1);
            case 2:
                return new q7a(h8aVar, jt1Var, 2);
            default:
                return new q7a(h8aVar, jt1Var, 3);
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
                ((q7a) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((q7a) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((q7a) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((q7a) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        ni5[] ni5VarArr;
        boolean zBooleanValue;
        zna znaVar;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        rna rnaVar;
        int i = this.a;
        heb hebVar = heb.a;
        h8a h8aVar = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                h8aVar.j();
                break;
            case 1:
                e11.e0(obj);
                h8aVar.j();
                break;
            case 2:
                e11.e0(obj);
                h8aVar.j();
                break;
            default:
                e11.e0(obj);
                fr9 fr9Var = h8aVar.f;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                        tna tnaVar = h8aVar.c;
                        rna rnaVar2 = ((zna) tnaVar).a;
                        km0 km0Var = rnaVar2.j;
                        ni5VarArr = rna.m;
                        zBooleanValue = ((Boolean) km0Var.c(ni5VarArr[9], rnaVar2)).booleanValue();
                        znaVar = (zna) tnaVar;
                        rna rnaVar3 = znaVar.a;
                        zBooleanValue2 = ((Boolean) rnaVar3.b.c(ni5VarArr[1], rnaVar3)).booleanValue();
                        rna rnaVar4 = znaVar.a;
                        zBooleanValue3 = ((Boolean) rnaVar4.d.c(ni5VarArr[3], rnaVar4)).booleanValue();
                        rnaVar = znaVar.a;
                    } while (!fr9Var.j(value, e8a.a((e8a) value, zBooleanValue, zBooleanValue2, zBooleanValue3, ((Boolean) rnaVar.c.c(ni5VarArr[2], rnaVar)).booleanValue(), znaVar.q(), znaVar.e(), znaVar.d(), null, Token.CASE)));
                }
                break;
        }
        return hebVar;
    }
}
