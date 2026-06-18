package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class eoa extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ joa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eoa(joa joaVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = joaVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        joa joaVar = this.b;
        switch (i) {
            case 0:
                return new eoa(joaVar, jt1Var, 0);
            case 1:
                return new eoa(joaVar, jt1Var, 1);
            case 2:
                return new eoa(joaVar, jt1Var, 2);
            case 3:
                return new eoa(joaVar, jt1Var, 3);
            case 4:
                return new eoa(joaVar, jt1Var, 4);
            case 5:
                return new eoa(joaVar, jt1Var, 5);
            case 6:
                return new eoa(joaVar, jt1Var, 6);
            case 7:
                return new eoa(joaVar, jt1Var, 7);
            case 8:
                return new eoa(joaVar, jt1Var, 8);
            default:
                return new eoa(joaVar, jt1Var, 9);
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
                ((eoa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((eoa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((eoa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 3:
                ((eoa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 4:
                ((eoa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 5:
                ((eoa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 6:
                ((eoa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 7:
                ((eoa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 8:
                ((eoa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((eoa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        float fK;
        zna znaVar;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        int i = this.a;
        heb hebVar = heb.a;
        joa joaVar = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                fr9 fr9Var = joaVar.x;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                        tna tnaVar = joaVar.s;
                        fK = ((zna) tnaVar).k();
                        znaVar = (zna) tnaVar;
                    } while (!fr9Var.j(value, tla.a((tla) value, fK, znaVar.j(), znaVar.c(), znaVar.r(), znaVar.q(), znaVar.e(), znaVar.d(), 4)));
                }
                break;
            case 1:
                e11.e0(obj);
                fr9 fr9Var2 = joaVar.v;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, gna.a((gna) value2, null, null, null, null, null, null, false, false, 191)));
                }
                joaVar.d.getClass();
                vg3.a(new fla(false));
                break;
            case 2:
                e11.e0(obj);
                fr9 fr9Var3 = joaVar.v;
                if (fr9Var3 != null) {
                    do {
                        value3 = fr9Var3.getValue();
                    } while (!fr9Var3.j(value3, gna.a((gna) value3, "", null, null, null, null, null, false, false, Token.ELSE)));
                }
                joaVar.d.getClass();
                d6a d6aVar = vg3.a;
                vg3.a(hla.a);
                break;
            case 3:
                e11.e0(obj);
                fr9 fr9Var4 = joaVar.v;
                if (fr9Var4 != null) {
                    do {
                        value4 = fr9Var4.getValue();
                    } while (!fr9Var4.j(value4, gna.a((gna) value4, null, null, null, null, null, null, true, false, 191)));
                }
                joaVar.d.getClass();
                vg3.a(new fla(true));
                break;
            case 4:
                e11.e0(obj);
                joaVar.d.getClass();
                d6a d6aVar2 = vg3.a;
                vg3.a(ila.a);
                break;
            case 5:
                e11.e0(obj);
                joaVar.d.getClass();
                d6a d6aVar3 = vg3.a;
                vg3.a(jla.a);
                break;
            case 6:
                e11.e0(obj);
                if (!((ana) joaVar.w.getValue()).a) {
                    boolean z = ((ana) joaVar.w.getValue()).b;
                    q8b q8bVar = joaVar.d;
                    if (!z) {
                        q8bVar.getClass();
                        d6a d6aVar4 = vg3.a;
                        vg3.a(lla.a);
                    } else {
                        q8bVar.getClass();
                        d6a d6aVar5 = vg3.a;
                        vg3.a(kla.a);
                    }
                }
                break;
            case 7:
                e11.e0(obj);
                joaVar.d.getClass();
                d6a d6aVar6 = vg3.a;
                vg3.a(nla.a);
                break;
            case 8:
                e11.e0(obj);
                joaVar.d.getClass();
                d6a d6aVar7 = vg3.a;
                vg3.a(ola.a);
                break;
            default:
                e11.e0(obj);
                fr9 fr9Var5 = joaVar.w;
                tna tnaVar2 = joaVar.s;
                if (fr9Var5 != null) {
                    do {
                        value6 = fr9Var5.getValue();
                    } while (!fr9Var5.j(value6, ana.a((ana) value6, false, false, false, 29)));
                }
                fr9 fr9Var6 = joaVar.x;
                if (fr9Var6 != null) {
                    do {
                        value5 = fr9Var6.getValue();
                    } while (!fr9Var6.j(value5, tla.a((tla) value5, ((zna) tnaVar2).k(), ((zna) tnaVar2).j(), 0L, false, false, 0.0f, null, 252)));
                }
                joaVar.d.getClass();
                d6a d6aVar8 = vg3.a;
                vg3.a(pla.a);
                break;
        }
        return hebVar;
    }
}
