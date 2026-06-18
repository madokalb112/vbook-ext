package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f8a extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8a b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f8a(h8a h8aVar, boolean z, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = h8aVar;
        this.c = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        boolean z = this.c;
        h8a h8aVar = this.b;
        switch (i) {
            case 0:
                return new f8a(h8aVar, z, jt1Var, 0);
            case 1:
                return new f8a(h8aVar, z, jt1Var, 1);
            case 2:
                return new f8a(h8aVar, z, jt1Var, 2);
            case 3:
                return new f8a(h8aVar, z, jt1Var, 3);
            default:
                return new f8a(h8aVar, z, jt1Var, 4);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((f8a) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((f8a) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((f8a) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 3:
                ((f8a) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((f8a) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        int i = this.a;
        heb hebVar = heb.a;
        boolean z = this.c;
        h8a h8aVar = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                ((zna) h8aVar.c).a.b.e(rna.m[1], Boolean.valueOf(z));
                fr9 fr9Var = h8aVar.f;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, e8a.a((e8a) value, false, this.c, false, false, false, 0.0f, null, null, 253)));
                }
                break;
            case 1:
                e11.e0(obj);
                ((zna) h8aVar.c).a.e.e(rna.m[4], Boolean.valueOf(z));
                if (((e8b) h8aVar.d.a.getValue()).f) {
                    h8aVar.e.getClass();
                    d6a d6aVar = vg3.a;
                    vg3.a(ela.a);
                }
                fr9 fr9Var2 = h8aVar.f;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, e8a.a((e8a) value2, false, false, false, false, this.c, 0.0f, null, null, 239)));
                }
                break;
            case 2:
                e11.e0(obj);
                ((zna) h8aVar.c).a.d.e(rna.m[3], Boolean.valueOf(z));
                fr9 fr9Var3 = h8aVar.f;
                if (fr9Var3 != null) {
                    do {
                        value3 = fr9Var3.getValue();
                    } while (!fr9Var3.j(value3, e8a.a((e8a) value3, false, false, this.c, false, false, 0.0f, null, null, 251)));
                }
                break;
            case 3:
                e11.e0(obj);
                ((zna) h8aVar.c).a.c.e(rna.m[2], Boolean.valueOf(z));
                fr9 fr9Var4 = h8aVar.f;
                if (fr9Var4 != null) {
                    do {
                        value4 = fr9Var4.getValue();
                    } while (!fr9Var4.j(value4, e8a.a((e8a) value4, false, false, false, this.c, false, 0.0f, null, null, 247)));
                }
                break;
            default:
                e11.e0(obj);
                ((zna) h8aVar.c).a.j.e(rna.m[9], Boolean.valueOf(z));
                fr9 fr9Var5 = h8aVar.f;
                if (fr9Var5 != null) {
                    do {
                        value5 = fr9Var5.getValue();
                    } while (!fr9Var5.j(value5, e8a.a((e8a) value5, this.c, false, false, false, false, 0.0f, null, null, 254)));
                }
                break;
        }
        return hebVar;
    }
}
