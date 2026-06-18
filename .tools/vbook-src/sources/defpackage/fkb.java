package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fkb extends o1a implements yb4 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ s29 d;
    public final /* synthetic */ pkb e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ r07 s;
    public final /* synthetic */ pg8 t;
    public final /* synthetic */ kb4 u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkb(List list, s29 s29Var, pkb pkbVar, boolean z, r07 r07Var, pg8 pg8Var, kb4 kb4Var, int i, jt1 jt1Var) {
        super(2, jt1Var);
        this.c = list;
        this.d = s29Var;
        this.e = pkbVar;
        this.f = z;
        this.s = r07Var;
        this.t = pg8Var;
        this.u = kb4Var;
        this.v = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        fkb fkbVar = new fkb(this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, jt1Var);
        fkbVar.b = obj;
        return fkbVar;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((fkb) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        vx1 vx1Var = (vx1) this.b;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return obj;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        List<xl7> list = this.c;
        ArrayList arrayList = new ArrayList(gc1.M(list, 10));
        for (xl7 xl7Var : list) {
            arrayList.add(ah1.x(vx1Var, null, new ekb(this.d, (yn7) xl7Var.b, this.e, (String) xl7Var.a, this.f, this.s, this.t, this.u, this.v, null), 3));
        }
        this.b = null;
        this.a = 1;
        Object objK = vm7.K(arrayList, this);
        xx1 xx1Var = xx1.a;
        return objK == xx1Var ? xx1Var : objK;
    }
}
