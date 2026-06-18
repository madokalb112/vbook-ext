package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e57 implements hu3 {
    public final d6a a;
    public final d6a b;
    public final ab6 c;
    public final d6a d;

    public e57(ib4 ib4Var) {
        av6 av6Var = new av6(3);
        d57 d57Var = d57.a;
        av6 av6Var2 = new av6(4);
        this.a = new d6a(ib4Var);
        this.b = ex1.a0(av6Var);
        ab6 ab6Var = new ab6(28, false);
        ab6Var.b = d57Var;
        ab6Var.c = lr3.C;
        this.c = ab6Var;
        this.d = ex1.a0(av6Var2);
    }

    public final iu3 a(Object obj, gh7 gh7Var, b15 b15Var) {
        dgb dgbVar = (dgb) obj;
        if (!lc5.Q(dgbVar.c, "http") && !lc5.Q(dgbVar.c, "https")) {
            return null;
        }
        String str = dgbVar.a;
        d6a d6aVar = this.a;
        d6a d6aVar2 = new d6a(new li0(b15Var, 4));
        d6a d6aVar3 = this.b;
        ab6 ab6Var = this.c;
        Context context = gh7Var.a;
        Object obj2 = ab6Var.c;
        lr3 lr3Var = lr3.C;
        if (obj2 == lr3Var) {
            synchronized (ab6Var) {
                obj2 = ab6Var.c;
                if (obj2 == lr3Var) {
                    kb4 kb4Var = (kb4) ab6Var.b;
                    kb4Var.getClass();
                    Object objInvoke = kb4Var.invoke(context);
                    ab6Var.c = objInvoke;
                    ab6Var.b = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new i57(str, gh7Var, d6aVar, d6aVar2, d6aVar3, new k75(obj2), this.d);
    }
}
