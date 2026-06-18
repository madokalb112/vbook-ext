package defpackage;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kr1 extends o1a implements bc4 {
    public int a;
    public /* synthetic */ gv4 b;
    public /* synthetic */ ut0 c;
    public /* synthetic */ bbb d;
    public final /* synthetic */ Set e;
    public final /* synthetic */ List f;
    public final /* synthetic */ x91 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr1(x91 x91Var, jt1 jt1Var, List list, Set set) {
        super(5, jt1Var);
        this.e = set;
        this.f = list;
        this.s = x91Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Charset charsetForName;
        gv4 gv4Var = this.b;
        ut0 ut0Var = this.c;
        bbb bbbVar = this.d;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return obj;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        as1 as1VarY = tu1.y(gv4Var);
        if (as1VarY == null) {
            return null;
        }
        ek4 ek4VarA = gv4Var.p0().c().a();
        Charset charset = q31.a;
        ek4VarA.getClass();
        charset.getClass();
        Iterator it = fc1.R0(new zp4(2), qu1.l0(ek4VarA.c("Accept-Charset"))).iterator();
        while (true) {
            if (!it.hasNext()) {
                charsetForName = null;
                break;
            }
            String str = ((ak4) it.next()).a;
            if (lc5.Q(str, "*")) {
                charsetForName = charset;
                break;
            }
            Charset charset2 = q31.a;
            str.getClass();
            if (Charset.isSupported(str)) {
                charsetForName = Charset.forName(str);
                charsetForName.getClass();
                break;
            }
        }
        Charset charset3 = charsetForName == null ? charset : charsetForName;
        ngb url = gv4Var.p0().c().getUrl();
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = 1;
        Object objB = nr1.b(this.e, this.f, url, bbbVar, ut0Var, as1VarY, charset3, this);
        xx1 xx1Var = xx1.a;
        return objB == xx1Var ? xx1Var : objB;
    }

    @Override // defpackage.bc4
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        List list = this.f;
        kr1 kr1Var = new kr1(this.s, (jt1) obj5, list, this.e);
        kr1Var.b = (gv4) obj2;
        kr1Var.c = (ut0) obj3;
        kr1Var.d = (bbb) obj4;
        return kr1Var.invokeSuspend(heb.a);
    }
}
