package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m1b implements zb4 {
    public final /* synthetic */ otb a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ b6c c;
    public final /* synthetic */ List d;
    public final /* synthetic */ kf8 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ t33 s;
    public final /* synthetic */ kb4 t;

    public m1b(otb otbVar, a07 a07Var, b6c b6cVar, List list, kf8 kf8Var, kb4 kb4Var, t33 t33Var, kb4 kb4Var2) {
        this.a = otbVar;
        this.b = a07Var;
        this.c = b6cVar;
        this.d = list;
        this.e = kf8Var;
        this.f = kb4Var;
        this.s = t33Var;
        this.t = kb4Var2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        ou6 ou6Var = (ou6) obj;
        dd4 dd4Var = (dd4) obj2;
        ((Number) obj3).intValue();
        ou6Var.getClass();
        dd4Var.f0(-694765045);
        dd4Var.f0(-1949275820);
        pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
        otb otbVar = this.a;
        fo2 fo2Var = otbVar.e;
        float fFloatValue = ((Number) fo2Var.getValue()).floatValue();
        dd4Var.f0(-1633490746);
        boolean zC = dd4Var.c(fFloatValue) | dd4Var.c(20.0f);
        Object objQ = dd4Var.Q();
        if (zC || objQ == vl1.a) {
            objQ = Float.valueOf(pn2Var.k0(20.0f) / ((Number) fo2Var.getValue()).floatValue());
            dd4Var.p0(objQ);
        }
        float fFloatValue2 = ((Number) objQ).floatValue();
        dd4Var.q(false);
        dd4Var.q(false);
        a07 a07Var = this.b;
        b6c b6cVar = this.c;
        l1b l1bVar = new l1b(otbVar, a07Var, otbVar, b6cVar, a07Var);
        List list = this.d;
        kf8 kf8Var = this.e;
        kb4 kb4Var = this.f;
        k1b k1bVar = new k1b(otbVar, list, kf8Var, fFloatValue2 * fFloatValue2, kb4Var, this.s, otbVar, b6cVar, this.t, kb4Var);
        dd4Var.f0(-259642354);
        y91 y91Var = new y91(24, dk9.A(l1bVar, dd4Var), dk9.A(k1bVar, dd4Var), dk9.A(new me4(), dd4Var));
        dd4Var.q(false);
        rg8 rg8Var = new rg8();
        rg8Var.a = new he4();
        le4 le4Var = new le4(y91Var, rg8Var);
        heb hebVar = heb.a;
        ou6 ou6VarB = r1a.b(r1a.b(ou6Var, hebVar, le4Var), hebVar, new le4(rg8Var, y91Var));
        dd4Var.q(false);
        return ou6VarB;
    }
}
