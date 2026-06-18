package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rq1 implements b24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp1 b;
    public final /* synthetic */ Charset c;
    public final /* synthetic */ bbb d;
    public final /* synthetic */ ut0 e;

    public /* synthetic */ rq1(pp1 pp1Var, Charset charset, bbb bbbVar, ut0 ut0Var, int i) {
        this.a = i;
        this.b = pp1Var;
        this.c = charset;
        this.d = bbbVar;
        this.e = ut0Var;
    }

    @Override // defpackage.b24
    public final Object a(c24 c24Var, jt1 jt1Var) throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        pp1 pp1Var = this.b;
        switch (i) {
            case 0:
                Object objA = pp1Var.a(new qq1(c24Var, this.c, this.d, this.e, 0), jt1Var);
                return objA == xx1Var ? objA : hebVar;
            default:
                Object objA2 = pp1Var.a(new qq1(c24Var, this.c, this.d, this.e, 1), jt1Var);
                return objA2 == xx1Var ? objA2 : hebVar;
        }
    }
}
