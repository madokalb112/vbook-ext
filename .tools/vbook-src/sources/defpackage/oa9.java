package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oa9 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ sa9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa9(sa9 sa9Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = sa9Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        sa9 sa9Var = this.c;
        switch (i) {
            case 0:
                return new oa9(sa9Var, jt1Var, 0);
            default:
                return new oa9(sa9Var, jt1Var, 1);
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
        return ((oa9) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        Object obj2 = heb.a;
        xx1 xx1Var = xx1.a;
        sa9 sa9Var = this.c;
        jt1 jt1Var = null;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        e11.e0(obj);
                        return obj2;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                tg3 tg3Var = new tg3(3, sa9Var.e.getData(), new xa(sa9Var, jt1Var, 20));
                sg sgVar = new sg(sa9Var, 29);
                this.b = 1;
                return tg3Var.a(sgVar, this) == xx1Var ? xx1Var : obj2;
            default:
                int i3 = this.b;
                try {
                    if (i3 == 0) {
                        e11.e0(obj);
                        h42 h42Var = sa9Var.e;
                        qa9 qa9Var = new qa9(sa9Var, jt1Var, 0);
                        this.b = 1;
                        if (h42Var.a(qa9Var, this) == xx1Var) {
                            obj2 = xx1Var;
                        }
                    } else {
                        if (i3 != 1) {
                            gp.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        e11.e0(obj);
                    }
                    return obj2;
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
                    e59 e59Var = sa9Var.h;
                    if (e59Var == null) {
                        lc5.i0("localSessionData");
                        throw null;
                    }
                    sa9Var.d.getClass();
                    sa9Var.h = e59.a(e59Var, null, iua.a(), null, 5);
                    return obj2;
                }
        }
    }
}
