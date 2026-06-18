package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class fhb implements xd4 {
    public static final fhb a;
    private static final m39 descriptor;

    static {
        fhb fhbVar = new fhb();
        a = fhbVar;
        hx7 hx7Var = new hx7("com.reader.data.community.api.dto.UserDto", fhbVar, 8);
        hx7Var.k("id", true);
        hx7Var.k("name", true);
        hx7Var.k("avatar", true);
        hx7Var.k("role", true);
        hx7Var.k("premium", true);
        hx7Var.k("exp", true);
        hx7Var.k("color", true);
        hx7Var.k("extra_color", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        hhb hhbVar = (hhb) obj;
        hhbVar.getClass();
        List list = hhbVar.h;
        String str = hhbVar.g;
        int i = hhbVar.f;
        boolean z = hhbVar.e;
        int i2 = hhbVar.d;
        String str2 = hhbVar.c;
        String str3 = hhbVar.b;
        String str4 = hhbVar.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        dp5[] dp5VarArr = hhb.i;
        if (md2VarV.r0(m39Var) || !lc5.Q(str4, "")) {
            md2VarV.Z(m39Var, 0, str4);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str3, "")) {
            md2VarV.Z(m39Var, 1, str3);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str2, "")) {
            md2VarV.Z(m39Var, 2, str2);
        }
        if (md2VarV.r0(m39Var) || i2 != 0) {
            md2VarV.Q(3, i2, m39Var);
        }
        if (md2VarV.r0(m39Var) || z) {
            md2VarV.F(m39Var, 4, z);
        }
        if (md2VarV.r0(m39Var) || i != 0) {
            md2VarV.Q(5, i, m39Var);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str, "")) {
            md2VarV.Z(m39Var, 6, str);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(list, lc3.a)) {
            md2VarV.V(m39Var, 7, (oi5) dp5VarArr[7].getValue(), list);
        }
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        dp5[] dp5VarArr = hhb.i;
        Object obj = null;
        boolean z = true;
        List list = null;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
        int i = 0;
        int iR = 0;
        boolean z2 = false;
        int iR2 = 0;
        while (z) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strK = am1VarT.k(m39Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strK2 = am1VarT.k(m39Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strK3 = am1VarT.k(m39Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iR = am1VarT.r(m39Var, 3);
                    i |= 8;
                    break;
                case 4:
                    z2 = am1VarT.z(m39Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iR2 = am1VarT.r(m39Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strK4 = am1VarT.k(m39Var, 6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) am1VarT.q(m39Var, 7, (oi5) dp5VarArr[7].getValue(), list);
                    i |= Token.CASE;
                    break;
                default:
                    sy3.c(iF);
                    return obj;
            }
            obj = null;
        }
        am1VarT.n(m39Var);
        return new hhb(i, strK, strK2, strK3, iR, z2, iR2, strK4, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xd4
    public final oi5[] d() {
        dp5[] dp5VarArr = hhb.i;
        tv9 tv9Var = tv9.a;
        la5 la5Var = la5.a;
        return new oi5[]{tv9Var, tv9Var, tv9Var, la5Var, mm0.a, la5Var, tv9Var, dp5VarArr[7].getValue()};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
