package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h45 extends o1a implements yb4 {
    public t07 a;
    public i45 b;
    public String c;
    public int d;
    public int e;
    public int f;
    public final /* synthetic */ i45 s;
    public final /* synthetic */ String t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h45(i45 i45Var, String str, int i, int i2, jt1 jt1Var) {
        super(2, jt1Var);
        this.s = i45Var;
        this.t = str;
        this.u = i;
        this.v = i2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new h45(this.s, this.t, this.u, this.v, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((h45) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        int i2;
        t07 t07Var;
        i45 i45Var;
        Object value;
        int i3 = this.f;
        i45 i45Var2 = this.s;
        if (i3 == 0) {
            e11.e0(obj);
            t07 t07Var2 = i45Var2.x;
            this.a = t07Var2;
            this.b = i45Var2;
            str = this.t;
            this.c = str;
            i = this.u;
            this.d = i;
            i2 = this.v;
            this.e = i2;
            this.f = 1;
            Object objP = t07Var2.p(this);
            xx1 xx1Var = xx1.a;
            if (objP == xx1Var) {
                return xx1Var;
            }
            t07Var = t07Var2;
            i45Var = i45Var2;
        } else {
            if (i3 != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.e;
            i = this.d;
            str = this.c;
            i45Var = this.b;
            t07Var = this.a;
            e11.e0(obj);
        }
        int i4 = i2;
        int i5 = i;
        String str2 = str;
        try {
            i45Var.F.a(str2, new p25(i5, i4));
            List<Object> list = ((rz4) i45Var.Q.getValue()).b;
            ArrayList arrayList = new ArrayList(gc1.M(list, 10));
            for (Object j15Var : list) {
                if (j15Var instanceof j15) {
                    if (lc5.Q(((j15) j15Var).f, str2)) {
                        j15 j15Var2 = (j15) j15Var;
                        int i6 = j15Var2.c;
                        int i7 = j15Var2.d;
                        int i8 = j15Var2.e;
                        String str3 = j15Var2.f;
                        List list2 = j15Var2.g;
                        String str4 = j15Var2.j;
                        str3.getClass();
                        j15Var = new j15(i6, i7, i8, str3, list2, i5, i4, str4);
                    } else {
                        j15Var = (j15) j15Var;
                    }
                }
                arrayList.add(j15Var);
            }
            t07Var.q(null);
            fr9 fr9Var = i45Var2.Q;
            if (fr9Var != null) {
                do {
                    value = fr9Var.getValue();
                } while (!fr9Var.j(value, rz4.b((rz4) value, null, arrayList, 1)));
            }
            return heb.a;
        } catch (Throwable th) {
            t07Var.q(null);
            throw th;
        }
    }
}
