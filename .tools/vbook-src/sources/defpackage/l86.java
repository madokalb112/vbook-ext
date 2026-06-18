package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l86 implements oi5 {
    public final oi5 a;
    public final oi5 b;
    public final /* synthetic */ int c;
    public final p39 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l86(oi5 oi5Var, oi5 oi5Var2, int i) {
        this(oi5Var, oi5Var2, (byte) 0);
        this.c = i;
        switch (i) {
            case 1:
                this(oi5Var, oi5Var2, (byte) 0);
                m39[] m39VarArr = new m39[0];
                if (bw9.a0("kotlin.Pair")) {
                    gp.l("Blank serial names are prohibited");
                    throw null;
                }
                b91 b91Var = new b91("kotlin.Pair");
                b91Var.a("first", oi5Var.e());
                b91Var.a("second", oi5Var2.e());
                this.d = new p39("kotlin.Pair", qw9.c, b91Var.c.size(), fw.O0(m39VarArr), b91Var);
                return;
            default:
                this.d = fx1.z("kotlin.collections.Map.Entry", qw9.e, new m39[0], new ej4(17, oi5Var, oi5Var2));
                return;
        }
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        Object key;
        Object value;
        md2 md2VarV = md2Var.v(e());
        m39 m39VarE = e();
        oi5 oi5Var = this.a;
        int i = this.c;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                xl7 xl7Var = (xl7) obj;
                xl7Var.getClass();
                key = xl7Var.a;
                break;
        }
        md2VarV.V(m39VarE, 0, oi5Var, key);
        m39 m39VarE2 = e();
        oi5 oi5Var2 = this.b;
        switch (i) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                xl7 xl7Var2 = (xl7) obj;
                xl7Var2.getClass();
                value = xl7Var2.b;
                break;
        }
        md2VarV.V(m39VarE2, 1, oi5Var2, value);
        md2VarV.a0(e());
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        Object k86Var;
        m39 m39VarE = e();
        am1 am1VarT = yd2Var.t(m39VarE);
        Object obj = gc1.C;
        Object objQ = obj;
        Object objQ2 = objQ;
        while (true) {
            int iF = am1VarT.f(e());
            if (iF == -1) {
                if (objQ == obj) {
                    throw new u39("Element 'key' is missing");
                }
                if (objQ2 == obj) {
                    throw new u39("Element 'value' is missing");
                }
                switch (this.c) {
                    case 0:
                        k86Var = new k86(objQ, objQ2);
                        break;
                    default:
                        k86Var = new xl7(objQ, objQ2);
                        break;
                }
                am1VarT.n(m39VarE);
                return k86Var;
            }
            if (iF == 0) {
                objQ = am1VarT.q(e(), 0, this.a, null);
            } else {
                if (iF != 1) {
                    throw new u39(dx1.f(iF, "Invalid index: "));
                }
                objQ2 = am1VarT.q(e(), 1, this.b, null);
            }
        }
    }

    @Override // defpackage.oi5
    public final m39 e() {
        switch (this.c) {
        }
        return this.d;
    }

    public l86(oi5 oi5Var, oi5 oi5Var2, byte b) {
        this.a = oi5Var;
        this.b = oi5Var2;
    }
}
