package defpackage;

import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nc extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ AndroidBookUpdateWorker c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nc(AndroidBookUpdateWorker androidBookUpdateWorker, int i, int i2, jt1 jt1Var, int i3) {
        super(2, jt1Var);
        this.a = i3;
        this.c = androidBookUpdateWorker;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new nc(this.c, this.d, this.e, jt1Var, 0);
            default:
                return new nc(this.c, this.d, this.e, jt1Var, 1);
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
        return ((nc) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    kc kcVar = (kc) this.c.j.getValue();
                    this.b = 1;
                    if (kcVar.a(this.d, this.e, this) == xx1Var) {
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
                    aj2 aj2Var = rw2.a;
                    fj4 fj4Var = r76.a.f;
                    nc ncVar = new nc(this.c, this.d, this.e, null, 0);
                    this.b = 1;
                    if (ah1.b0(fj4Var, ncVar, this) == xx1Var) {
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
