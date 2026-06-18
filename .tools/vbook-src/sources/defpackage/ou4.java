package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ou4 extends o1a implements bc4 {
    public int a;
    public /* synthetic */ gv4 b;
    public /* synthetic */ ut0 c;
    public /* synthetic */ bbb d;
    public final /* synthetic */ Charset e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou4(Charset charset, jt1 jt1Var) {
        super(5, jt1Var);
        this.e = charset;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        gv4 gv4Var = this.b;
        ut0 ut0Var = this.c;
        bbb bbbVar = this.d;
        int i = this.a;
        if (i == 0) {
            e11.e0(obj);
            if (!bbbVar.a.equals(ug8.a(String.class))) {
                return null;
            }
            this.b = gv4Var;
            this.c = null;
            this.d = null;
            this.a = 1;
            obj = m79.Q(ut0Var, this);
            xx1 xx1Var = xx1.a;
            if (obj == xx1Var) {
                return xx1Var;
            }
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e11.e0(obj);
        }
        jl9 jl9Var = (jl9) obj;
        ks4 ks4VarP0 = gv4Var.p0();
        k46 k46Var = pu4.a;
        as1 as1VarY = tu1.y(ks4VarP0.d());
        Charset charsetA = as1VarY != null ? ds1.a(as1VarY) : null;
        if (charsetA == null) {
            charsetA = this.e;
        }
        pu4.a.j("Reading response body for " + ks4VarP0.c().getUrl() + " as String with charset " + charsetA);
        return sg9.n(jl9Var, charsetA, 2);
    }

    @Override // defpackage.bc4
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ou4 ou4Var = new ou4(this.e, (jt1) obj5);
        ou4Var.b = (gv4) obj2;
        ou4Var.c = (ut0) obj3;
        ou4Var.d = (bbb) obj4;
        return ou4Var.invokeSuspend(heb.a);
    }
}
