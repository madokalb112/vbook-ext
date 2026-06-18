package defpackage;

import java.nio.charset.Charset;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nu4 extends o1a implements zb4 {
    public /* synthetic */ xu4 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Charset d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu4(String str, Charset charset, jt1 jt1Var) {
        super(3, jt1Var);
        this.c = str;
        this.d = charset;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        nu4 nu4Var = new nu4(this.c, this.d, (jt1) obj3);
        nu4Var.a = (xu4) obj;
        nu4Var.b = obj2;
        return nu4Var.invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Charset charsetA;
        xu4 xu4Var = this.a;
        Object obj2 = this.b;
        e11.e0(obj);
        k46 k46Var = pu4.a;
        String str = this.c;
        if (str != null && xu4Var.c.p("Accept-Charset") == null) {
            k46 k46Var2 = pu4.a;
            StringBuilder sbM = dx1.m("Adding Accept-Charset=", str, " to ");
            sbM.append(xu4Var.a);
            k46Var2.j(sbM.toString());
            xu4Var.c.A("Accept-Charset", str);
        }
        if (!(obj2 instanceof String)) {
            return null;
        }
        as1 as1VarZ = tu1.z(xu4Var);
        if (as1VarZ != null && !lc5.Q(as1VarZ.c, zr1.a.c)) {
            return null;
        }
        String str2 = (String) obj2;
        as1 as1Var = as1VarZ == null ? zr1.a : as1VarZ;
        if (as1VarZ == null || (charsetA = ds1.a(as1VarZ)) == null) {
            charsetA = this.d;
        }
        pu4.a.j("Sending request body to " + xu4Var.a + " as text/plain with charset " + charsetA);
        Set set = ds1.a;
        as1Var.getClass();
        charsetA.getClass();
        String strName = charsetA.name();
        strName.getClass();
        return new zba(str2, as1Var.c(strName));
    }
}
