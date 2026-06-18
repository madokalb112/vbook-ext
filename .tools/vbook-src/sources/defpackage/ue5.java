package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ue5 {
    public static final te5 d = new te5(new cf5(false, false, false, false, true, "    ", false, "type", false, true, false, s81.c, true), a49.a);
    public final cf5 a;
    public final q32 b;
    public final uf4 c = new uf4(18);

    public ue5(cf5 cf5Var, q32 q32Var) {
        this.a = cf5Var;
        this.b = q32Var;
    }

    public final Object a(oi5 oi5Var, String str) {
        oi5Var.getClass();
        str.getClass();
        mv9 mv9VarD = qn9.d(this, str);
        Object objD = new nt9(this, g3c.c, mv9VarD, oi5Var.e(), null).d(oi5Var);
        mv9VarD.q();
        return objD;
    }

    public final String b(oi5 oi5Var, Object obj) {
        oi5Var.getClass();
        ii1 ii1Var = new ii1((char) 0, 3);
        l21 l21Var = l21.c;
        ii1Var.c = l21Var.G(Token.CASE);
        try {
            pu1.I(this, ii1Var, oi5Var, obj);
            String string = ii1Var.toString();
            char[] cArr = (char[]) ii1Var.c;
            l21Var.getClass();
            cArr.getClass();
            l21Var.D(cArr);
            return string;
        } catch (Throwable th) {
            l21 l21Var2 = l21.c;
            char[] cArr2 = (char[]) ii1Var.c;
            l21Var2.getClass();
            cArr2.getClass();
            l21Var2.D(cArr2);
            throw th;
        }
    }

    public final mf5 c(String str) {
        str.getClass();
        return (mf5) a(pf5.a, str);
    }
}
