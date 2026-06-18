package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cn implements xw2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cn(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.xw2
    public final void a() {
        px5 px5VarI;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((hk9) obj3).remove(obj2);
                ((pn) obj).d.l(obj2);
                break;
            case 1:
                ((mx5) obj3).i().f((hx5) obj2);
                vx5 vx5Var = (vx5) ((rg8) obj).a;
                if (vx5Var != null) {
                    vx5Var.a();
                }
                break;
            case 2:
                mx5 mx5Var = (mx5) obj3;
                if (mx5Var != null && (px5VarI = mx5Var.i()) != null) {
                    px5VarI.f((vh8) obj2);
                }
                yk1 yk1Var = (yk1) obj;
                bx5 bx5Var = bx5.ON_DESTROY;
                yk1Var.getClass();
                yk1Var.b = bx5Var.a();
                yk1Var.a();
                break;
            case 3:
                os8 os8Var = (os8) obj3;
                us8 us8Var = (us8) obj;
                if (os8Var.b.l(obj2) == us8Var) {
                    Map map = os8Var.a;
                    Map mapD = us8Var.d();
                    if (!mapD.isEmpty()) {
                        map.put(obj2, mapD);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
            default:
                qsb qsbVar = (qsb) obj3;
                ((yb4) obj2).invoke(Long.valueOf(((Number) qsbVar.g.a.getValue()).longValue()), Long.valueOf(((Number) qsbVar.h.a.getValue()).longValue()));
                ((gqb) obj).close();
                qsbVar.d();
                break;
        }
    }
}
