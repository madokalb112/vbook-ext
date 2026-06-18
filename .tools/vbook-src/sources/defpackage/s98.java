package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s98 extends o1a implements kb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ u98 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s98(u98 u98Var, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.c = u98Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new s98(this.c, jt1Var, 0);
            case 1:
                return new s98(this.c, jt1Var, 1);
            case 2:
                return new s98(this.c, jt1Var, 2);
            case 3:
                return new s98(this.c, jt1Var, 3);
            default:
                return new s98(this.c, jt1Var, 4);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
        }
        return ((s98) create(jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.a;
        u98 u98Var = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    y78 y78Var = u98Var.c;
                    this.b = 1;
                    c98 c98Var = (c98) y78Var;
                    m78 m78VarA = c98Var.c.a();
                    Object objX = c98Var.x(m78VarA != null ? m78VarA.a : null, "LuatNhan", this);
                    if (objX == xx1Var) {
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
                    y78 y78Var2 = u98Var.c;
                    this.b = 1;
                    c98 c98Var2 = (c98) y78Var2;
                    m78 m78VarD = c98Var2.c.d();
                    Object objY = c98Var2.y(m78VarD != null ? m78VarD.a : null, "Name", this);
                    if (objY == xx1Var) {
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
                    y78 y78Var3 = u98Var.c;
                    this.b = 1;
                    c98 c98Var3 = (c98) y78Var3;
                    m78 m78VarG = c98Var3.c.g();
                    Object objX2 = c98Var3.x(m78VarG != null ? m78VarG.a : null, "PhienAm", this);
                    if (objX2 == xx1Var) {
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
                    y78 y78Var4 = u98Var.c;
                    this.b = 1;
                    c98 c98Var4 = (c98) y78Var4;
                    m78 m78VarH = c98Var4.c.h();
                    Object objY2 = c98Var4.y(m78VarH != null ? m78VarH.a : null, "Pronouns", this);
                    if (objY2 == xx1Var) {
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
                    y78 y78Var5 = u98Var.c;
                    this.b = 1;
                    c98 c98Var5 = (c98) y78Var5;
                    m78 m78VarJ = c98Var5.c.j();
                    Object objY3 = c98Var5.y(m78VarJ != null ? m78VarJ.a : null, "VietPhrase", this);
                    if (objY3 == xx1Var) {
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
