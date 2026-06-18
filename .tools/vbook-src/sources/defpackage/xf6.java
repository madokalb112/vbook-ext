package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xf6 implements ac4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ kb4 e;
    public final /* synthetic */ kb4 f;

    public xf6(List list, boolean z, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4) {
        this.a = list;
        this.b = z;
        this.c = kb4Var;
        this.d = kb4Var2;
        this.e = kb4Var3;
        this.f = kb4Var4;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        dr5 dr5Var = (dr5) obj;
        int iIntValue = ((Number) obj2).intValue();
        dd4 dd4Var = (dd4) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (dd4Var.f(dr5Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= dd4Var.d(iIntValue) ? 32 : 16;
        }
        if (dd4Var.V(i & 1, (i & Token.EXPR_VOID) != 146)) {
            Object obj5 = this.a.get(iIntValue);
            dd4Var.f0(-226417468);
            boolean z = obj5 instanceof mx2;
            lu6 lu6Var = lu6.a;
            if (z) {
                dd4Var.f0(-226384330);
                s32.S(((mx2) obj5).a, gjb.l0(tg9.f(lu6Var, 1.0f), 4.0f), dd4Var, 48);
                dd4Var.q(false);
            } else if (obj5 instanceof y51) {
                dd4Var.f0(-226118071);
                y51 y51Var = (y51) obj5;
                ou6 ou6VarA = dr5.a(dr5Var, tg9.f(lu6Var, 1.0f));
                kb4 kb4Var = this.e;
                boolean zH = dd4Var.h(obj5) | dd4Var.f(kb4Var);
                Object objQ = dd4Var.Q();
                if (zH || objQ == vl1.a) {
                    objQ = new e7(14, kb4Var, y51Var);
                    dd4Var.p0(objQ);
                }
                s32.K(this.b, y51Var, ou6VarA, this.c, this.d, (ib4) objQ, this.f, dd4Var, 0);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-225570828);
                dd4Var.q(false);
            }
            dd4Var.q(false);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }
}
