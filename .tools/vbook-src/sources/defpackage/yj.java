package defpackage;

import com.reader.data.server.AndroidTestServerService;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yj extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ AndroidTestServerService c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yj(AndroidTestServerService androidTestServerService, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = androidTestServerService;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        AndroidTestServerService androidTestServerService = this.c;
        switch (i) {
            case 0:
                return new yj(androidTestServerService, jt1Var, 0);
            case 1:
                return new yj(androidTestServerService, jt1Var, 1);
            default:
                return new yj(androidTestServerService, jt1Var, 2);
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
        return ((yj) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        AndroidTestServerService androidTestServerService = this.c;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                d6a d6aVar = vg3.a;
                a91 a91VarA = ug8.a(paa.class);
                xz6 xz6Var = (xz6) vg3.a.getValue();
                sg sgVar = new sg(androidTestServerService, i2);
                this.b = 1;
                Object objA = xz6Var.a(new l51(3, sgVar, a91VarA), this);
                if (objA != xx1Var) {
                    objA = hebVar;
                }
                return objA == xx1Var ? xx1Var : hebVar;
            case 1:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    oaa oaaVar = (oaa) androidTestServerService.a.getValue();
                    this.b = 1;
                    return oaaVar.b(this) == xx1Var ? xx1Var : hebVar;
                }
                if (i4 == 1) {
                    e11.e0(obj);
                    return hebVar;
                }
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    oaa oaaVar2 = (oaa) androidTestServerService.a.getValue();
                    this.b = 1;
                    if (oaaVar2.b(this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i5 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                fr9 fr9Var = AndroidTestServerService.d;
                fr9 fr9Var2 = AndroidTestServerService.d;
                fr9Var2.getClass();
                fr9Var2.l(null, u49.a);
                androidTestServerService.stopSelf();
                return hebVar;
        }
    }
}
