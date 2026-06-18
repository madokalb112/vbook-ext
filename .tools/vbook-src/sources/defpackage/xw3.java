package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xw3 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public wt7 b;
    public int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ kb4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw3(String str, String str2, kb4 kb4Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = str;
        this.e = str2;
        this.f = kb4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new xw3(this.d, this.e, this.f, jt1Var, 0);
            default:
                return new xw3(this.d, this.e, this.f, jt1Var, 1);
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
        return ((xw3) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        wt7 wt7Var;
        wt7 wt7Var2;
        int i = this.a;
        kb4 kb4Var = this.f;
        String str = this.e;
        String str2 = this.d;
        xx1 xx1Var = xx1.a;
        int i2 = 0;
        jt1 jt1Var = null;
        switch (i) {
            case 0:
                int i3 = this.c;
                if (i3 == 0) {
                    e11.e0(obj);
                    this.c = 1;
                    obj = ny1.U(str2, str, this);
                    if (obj == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            gp.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wt7Var = this.b;
                        e11.e0(obj);
                        return new fj7(wt7Var, 0);
                    }
                    e11.e0(obj);
                }
                wt7 wt7Var3 = (wt7) obj;
                if (wt7Var3 != null) {
                    aj2 aj2Var = rw2.a;
                    nh2 nh2Var = nh2.c;
                    hl2 hl2Var = new hl2(wt7Var3, kb4Var, jt1Var, 19);
                    this.b = wt7Var3;
                    this.c = 2;
                    if (ah1.b0(nh2Var, hl2Var, this) == xx1Var) {
                        return xx1Var;
                    }
                    wt7Var = wt7Var3;
                    return new fj7(wt7Var, 0);
                }
                return null;
            default:
                int i4 = this.c;
                if (i4 == 0) {
                    e11.e0(obj);
                    this.c = 1;
                    obj = ny1.U(str2, str, this);
                    if (obj == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            gp.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wt7Var2 = this.b;
                        e11.e0(obj);
                        return new fj7(wt7Var2, 0);
                    }
                    e11.e0(obj);
                }
                wt7 wt7Var4 = (wt7) obj;
                if (wt7Var4 != null) {
                    aj2 aj2Var2 = rw2.a;
                    nh2 nh2Var2 = nh2.c;
                    yw3 yw3Var = new yw3(kb4Var, wt7Var4, jt1Var, i2);
                    this.b = wt7Var4;
                    this.c = 2;
                    if (ah1.b0(nh2Var2, yw3Var, this) == xx1Var) {
                        return xx1Var;
                    }
                    wt7Var2 = wt7Var4;
                    return new fj7(wt7Var2, 0);
                }
                return null;
        }
    }
}
