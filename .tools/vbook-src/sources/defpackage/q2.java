package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class q2 implements oi5 {
    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        obj.getClass();
        oi5 oi5VarN = tw1.N(this, md2Var, obj);
        m39 m39VarE = e();
        md2 md2VarV = md2Var.v(m39VarE);
        md2VarV.Z(e(), 0, oi5VarN.e().a());
        md2VarV.V(e(), 1, oi5VarN, obj);
        md2VarV.a0(m39VarE);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39VarE = e();
        am1 am1VarT = yd2Var.t(m39VarE);
        Object objQ = null;
        String strK = null;
        while (true) {
            int iF = am1VarT.f(e());
            if (iF == -1) {
                if (objQ != null) {
                    am1VarT.n(m39VarE);
                    return objQ;
                }
                gp.k(ky0.r("Polymorphic value has not been read for class ", strK));
                return null;
            }
            if (iF == 0) {
                strK = am1VarT.k(e(), iF);
            } else {
                if (iF != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strK == null) {
                        strK = "unknown class";
                    }
                    sb.append(strK);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iF);
                    throw new u39(sb.toString());
                }
                if (strK == null) {
                    gp.l("Cannot read polymorphic value before its type token");
                    return null;
                }
                objQ = am1VarT.q(e(), iF, tw1.M(this, am1VarT, strK), null);
            }
        }
    }

    public oi5 f(am1 am1Var, String str) {
        q32 q32VarO = am1Var.o();
        a91 a91VarH = h();
        q32VarO.getClass();
        a91VarH.getClass();
        Map map = (Map) ((Map) q32VarO.e).get(a91VarH);
        oi5 oi5Var = map != null ? (oi5) map.get(str) : null;
        if (!(oi5Var instanceof oi5)) {
            oi5Var = null;
        }
        if (oi5Var != null) {
            return oi5Var;
        }
        Object obj = ((Map) q32VarO.f).get(a91VarH);
        kb4 kb4Var = fw.v0(1, obj) ? (kb4) obj : null;
        if (kb4Var != null) {
            return (oi5) kb4Var.invoke(str);
        }
        return null;
    }

    public oi5 g(md2 md2Var, Object obj) {
        obj.getClass();
        q32 q32VarH0 = md2Var.h0();
        a91 a91VarH = h();
        q32VarH0.getClass();
        a91VarH.getClass();
        if (a91VarH.h(obj)) {
            Map map = (Map) ((Map) q32VarH0.c).get(a91VarH);
            oi5 oi5Var = map != null ? (oi5) map.get(ug8.a(obj.getClass())) : null;
            oi5 oi5Var2 = oi5Var instanceof oi5 ? oi5Var : null;
            if (oi5Var2 != null) {
                return oi5Var2;
            }
            Object obj2 = ((Map) q32VarH0.d).get(a91VarH);
            kb4 kb4Var = fw.v0(1, obj2) ? (kb4) obj2 : null;
            if (kb4Var != null) {
                return (oi5) kb4Var.invoke(obj);
            }
        }
        return null;
    }

    public abstract a91 h();
}
