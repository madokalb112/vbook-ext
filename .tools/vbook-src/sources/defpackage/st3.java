package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class st3 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ub4 f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ st3(yh4 yh4Var, wq5 wq5Var, pj7 pj7Var, nv nvVar, kv kvVar, s04 s04Var, boolean z, kb4 kb4Var) {
        this.s = yh4Var;
        this.t = wq5Var;
        this.b = pj7Var;
        this.c = nvVar;
        this.u = kvVar;
        this.d = s04Var;
        this.e = z;
        this.f = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        ub4 ub4Var = this.f;
        Object obj3 = this.d;
        Object obj4 = this.u;
        Object obj5 = this.c;
        Object obj6 = this.b;
        Object obj7 = this.t;
        Object obj8 = this.s;
        switch (i) {
            case 0:
                yh4 yh4Var = (yh4) obj8;
                wq5 wq5Var = (wq5) obj7;
                pj7 pj7Var = (pj7) obj6;
                nv nvVar = (nv) obj5;
                kv kvVar = (kv) obj4;
                s04 s04Var = (s04) obj3;
                kb4 kb4Var = (kb4) ub4Var;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    sw1.h(yh4Var, tg9.c, wq5Var, pj7Var, nvVar, kvVar, s04Var, this.e, (ag) null, kb4Var, dd4Var, 48, 0, 512);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                y86.g((ou6) obj8, (st5) obj7, (pj7) obj6, (nv) obj5, (vf0) obj4, (s04) obj3, this.e, (kb4) ub4Var, (dd4) obj, qu1.x0(7));
                break;
            default:
                ((Integer) obj2).getClass();
                m79.s(this.e, (ib4) obj8, (ib4) obj7, (ib4) obj6, (ib4) obj5, (ib4) obj4, (ib4) obj3, (ib4) ub4Var, (dd4) obj, qu1.x0(49));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ st3(ou6 ou6Var, st5 st5Var, pj7 pj7Var, nv nvVar, vf0 vf0Var, s04 s04Var, boolean z, kb4 kb4Var, int i) {
        this.s = ou6Var;
        this.t = st5Var;
        this.b = pj7Var;
        this.c = nvVar;
        this.u = vf0Var;
        this.d = s04Var;
        this.e = z;
        this.f = kb4Var;
    }

    public /* synthetic */ st3(boolean z, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, ib4 ib4Var7, int i) {
        this.e = z;
        this.s = ib4Var;
        this.t = ib4Var2;
        this.b = ib4Var3;
        this.c = ib4Var4;
        this.u = ib4Var5;
        this.d = ib4Var6;
        this.f = ib4Var7;
    }
}
