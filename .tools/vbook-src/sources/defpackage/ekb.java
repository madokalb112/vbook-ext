package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ekb extends o1a implements yb4 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ r07 B;
    public final /* synthetic */ pg8 C;
    public final /* synthetic */ kb4 D;
    public final /* synthetic */ int E;
    public s29 a;
    public yn7 b;
    public pkb c;
    public String d;
    public r07 e;
    public pg8 f;
    public kb4 s;
    public boolean t;
    public int u;
    public int v;
    public final /* synthetic */ s29 w;
    public final /* synthetic */ yn7 x;
    public final /* synthetic */ pkb y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekb(s29 s29Var, yn7 yn7Var, pkb pkbVar, String str, boolean z, r07 r07Var, pg8 pg8Var, kb4 kb4Var, int i, jt1 jt1Var) {
        super(2, jt1Var);
        this.w = s29Var;
        this.x = yn7Var;
        this.y = pkbVar;
        this.z = str;
        this.A = z;
        this.B = r07Var;
        this.C = pg8Var;
        this.D = kb4Var;
        this.E = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new ekb(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((ekb) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        s29 s29Var;
        yn7 yn7Var;
        pkb pkbVar;
        r07 r07Var;
        pg8 pg8Var;
        kb4 kb4Var;
        String str;
        boolean z;
        int i;
        Throwable th;
        s29 s29Var2;
        int i2 = this.v;
        xx1 xx1Var = xx1.a;
        try {
            if (i2 == 0) {
                e11.e0(obj);
                s29Var = this.w;
                this.a = s29Var;
                yn7Var = this.x;
                this.b = yn7Var;
                pkbVar = this.y;
                this.c = pkbVar;
                String str2 = this.z;
                this.d = str2;
                r07Var = this.B;
                this.e = r07Var;
                pg8Var = this.C;
                this.f = pg8Var;
                kb4Var = this.D;
                this.s = kb4Var;
                boolean z2 = this.A;
                this.t = z2;
                int i3 = this.E;
                this.u = i3;
                this.v = 1;
                if (s29Var.a(this) != xx1Var) {
                    str = str2;
                    z = z2;
                    i = i3;
                }
                return xx1Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s29Var2 = this.a;
                try {
                    e11.e0(obj);
                    s29Var2.c();
                    return heb.a;
                } catch (Throwable th2) {
                    th = th2;
                    s29Var2.c();
                    throw th;
                }
            }
            i = this.u;
            boolean z3 = this.t;
            kb4Var = this.s;
            pg8Var = this.f;
            r07Var = this.e;
            String str3 = this.d;
            pkbVar = this.c;
            yn7Var = this.b;
            s29 s29Var3 = this.a;
            e11.e0(obj);
            z = z3;
            str = str3;
            s29Var = s29Var3;
            lr3 lr3Var = hx3.a;
            lr3Var.getClass();
            yn7Var.getClass();
            if (!yn7Var.a.exists()) {
                lr3.q(lr3Var, yn7Var);
            }
            kb4 kb4Var2 = kb4Var;
            pkb pkbVar2 = pkbVar;
            dkb dkbVar = new dkb(r07Var, pg8Var, kb4Var2, i);
            this.a = s29Var;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.s = null;
            this.u = 0;
            this.v = 2;
            if (pkb.a(pkbVar2, str, yn7Var, z, dkbVar, this) != xx1Var) {
                s29Var2 = s29Var;
                s29Var2.c();
                return heb.a;
            }
            return xx1Var;
        } catch (Throwable th3) {
            s29 s29Var4 = s29Var;
            th = th3;
            s29Var2 = s29Var4;
            s29Var2.c();
            throw th;
        }
    }
}
