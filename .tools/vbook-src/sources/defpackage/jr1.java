package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jr1 extends o1a implements bc4 {
    public int a;
    public /* synthetic */ xu4 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ List d;
    public final /* synthetic */ Set e;
    public final /* synthetic */ x91 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr1(x91 x91Var, jt1 jt1Var, List list, Set set) {
        super(5, jt1Var);
        this.d = list;
        this.e = set;
        this.f = x91Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws e20 {
        xu4 xu4Var = this.b;
        Object obj2 = this.c;
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
        this.b = null;
        this.c = null;
        this.a = 1;
        Object objA = nr1.a(this.d, this.e, this.f, xu4Var, obj2, this);
        xx1 xx1Var = xx1.a;
        return objA == xx1Var ? xx1Var : objA;
    }

    @Override // defpackage.bc4
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Set set = this.e;
        jr1 jr1Var = new jr1(this.f, (jt1) obj5, this.d, set);
        jr1Var.b = (xu4) obj2;
        jr1Var.c = obj3;
        return jr1Var.invokeSuspend(heb.a);
    }
}
