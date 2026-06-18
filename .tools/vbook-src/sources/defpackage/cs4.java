package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cs4 extends o1a implements zb4 {
    public final /* synthetic */ int a;
    public Throwable b;
    public int c;
    public /* synthetic */ wu4 d;
    public /* synthetic */ Throwable e;
    public final /* synthetic */ List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cs4(List list, jt1 jt1Var, int i) {
        super(3, jt1Var);
        this.a = i;
        this.f = list;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        List list = this.f;
        wu4 wu4Var = (wu4) obj;
        Throwable th = (Throwable) obj2;
        jt1 jt1Var = (jt1) obj3;
        switch (i) {
            case 0:
                cs4 cs4Var = new cs4(list, jt1Var, 0);
                cs4Var.d = wu4Var;
                cs4Var.e = th;
                return cs4Var.invokeSuspend(hebVar);
            default:
                cs4 cs4Var2 = new cs4(list, jt1Var, 1);
                cs4Var2.d = wu4Var;
                cs4Var2.e = th;
                return cs4Var2.invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        List list = this.f;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                wu4 wu4Var = this.d;
                Throwable th = this.e;
                int i2 = this.c;
                if (i2 != 0) {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th2 = this.b;
                    e11.e0(obj);
                    return th2;
                }
                e11.e0(obj);
                Throwable thN0 = ny1.n0(th);
                this.d = null;
                this.e = null;
                this.b = thN0;
                this.c = 1;
                gs4.a(list, thN0, wu4Var, this);
                return hebVar == xx1Var ? xx1Var : thN0;
            default:
                wu4 wu4Var2 = this.d;
                Throwable th3 = this.e;
                int i3 = this.c;
                if (i3 != 0) {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th4 = this.b;
                    e11.e0(obj);
                    return th4;
                }
                e11.e0(obj);
                Throwable thN02 = ny1.n0(th3);
                this.d = null;
                this.e = null;
                this.b = thN02;
                this.c = 1;
                gs4.a(list, thN02, wu4Var2, this);
                return hebVar == xx1Var ? xx1Var : thN02;
        }
    }
}
