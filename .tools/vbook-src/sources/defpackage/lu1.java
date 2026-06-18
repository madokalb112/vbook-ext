package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lu1 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o7c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu1(o7c o7cVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = o7cVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new lu1(this.b, jt1Var, 0);
            default:
                return new lu1(this.b, jt1Var, 1);
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
                ((lu1) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((lu1) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        o7c o7cVar = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                iu8.o.getClass();
                o7cVar.m(new d04(1.5f));
                break;
            default:
                e11.e0(obj);
                o7cVar.m(new mc8(19));
                cn7 cn7Var = o7cVar.x;
                Boolean bool = Boolean.TRUE;
                cn7Var.setValue(bool);
                q6c q6cVar = o7cVar.c;
                q6cVar.getClass();
                sw1.h0();
                boolean z = q6cVar.l;
                g46 g46Var = g46.b;
                if (!z) {
                    q6cVar.l = true;
                    l46 l46Var = q6cVar.a;
                    l46Var.getClass();
                    if (l46Var.a(g46Var)) {
                        xg xgVar = l46Var.b;
                        String str = l46Var.a;
                        xgVar.getClass();
                        xg.a(g46Var, str, "ZoomableState. threeStepScale=true");
                    }
                }
                o7cVar.A.setValue(bool);
                q6cVar.getClass();
                sw1.h0();
                if (!q6cVar.p) {
                    q6cVar.p = true;
                    l46 l46Var2 = q6cVar.a;
                    l46Var2.getClass();
                    if (l46Var2.a(g46Var)) {
                        xg xgVar2 = l46Var2.b;
                        String str2 = l46Var2.a;
                        xgVar2.getClass();
                        xg.a(g46Var, str2, "ZoomableState. keepTransformWhenSameAspectRatioContentSizeChanged=true");
                    }
                }
                break;
        }
        return hebVar;
    }
}
