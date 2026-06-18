package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gs2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ rs2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gs2(rs2 rs2Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = rs2Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        rs2 rs2Var = this.c;
        switch (i) {
            case 0:
                return new gs2(rs2Var, jt1Var, 0);
            case 1:
                return new gs2(rs2Var, jt1Var, 1);
            case 2:
                return new gs2(rs2Var, jt1Var, 2);
            case 3:
                return new gs2(rs2Var, jt1Var, 3);
            default:
                return new gs2(rs2Var, jt1Var, 4);
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
        return ((gs2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        rs2 rs2Var = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    m78 m78VarG = rs2Var.a.g();
                    zn7 zn7VarB = rs2.b(m78VarG != null ? m78VarG.a : null);
                    this.b = 1;
                    Serializable serializableG = rs2Var.g(zn7VarB, this);
                    if (serializableG == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 1:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    m78 m78VarA = rs2Var.a.a();
                    zn7 zn7VarB2 = rs2.b(m78VarA != null ? m78VarA.a : null);
                    this.b = 1;
                    Object objH = rs2Var.h(zn7VarB2, this);
                    if (objH == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 2:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    m78 m78VarD = rs2Var.a.d();
                    zn7 zn7VarB3 = rs2.b(m78VarD != null ? m78VarD.a : null);
                    this.b = 1;
                    e03 e03VarL = rs2.l(zn7VarB3);
                    if (e03VarL == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 3:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    m78 m78VarH = rs2Var.a.h();
                    zn7 zn7VarB4 = rs2.b(m78VarH != null ? m78VarH.a : null);
                    this.b = 1;
                    e03 e03VarL2 = rs2.l(zn7VarB4);
                    if (e03VarL2 == xx1Var) {
                    }
                } else if (i5 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i6 = this.b;
                if (i6 == 0) {
                    e11.e0(obj);
                    m78 m78VarJ = rs2Var.a.j();
                    zn7 zn7VarB5 = rs2.b(m78VarJ != null ? m78VarJ.a : null);
                    this.b = 1;
                    e03 e03VarL3 = rs2.l(zn7VarB5);
                    if (e03VarL3 == xx1Var) {
                    }
                } else if (i6 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}
