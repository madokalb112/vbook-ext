package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zpa extends o1a implements yb4 {
    public final /* synthetic */ int a = 0;
    public String b;
    public int c;
    public final /* synthetic */ hra d;
    public final /* synthetic */ yia e;
    public final /* synthetic */ yia f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpa(hra hraVar, yia yiaVar, yia yiaVar2, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.d = hraVar;
        this.e = yiaVar;
        this.f = yiaVar2;
        this.b = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new zpa(this.d, this.e, this.f, this.b, jt1Var);
            default:
                return new zpa(this.d, this.e, this.f, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((zpa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        String strB0;
        Object objA;
        Object value;
        int i = this.a;
        yia yiaVar = this.f;
        yia yiaVar2 = this.e;
        xx1 xx1Var = xx1.a;
        hra hraVar = this.d;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                int i2 = this.c;
                if (i2 == 0) {
                    e11.e0(obj);
                    String strB02 = hraVar.b0(yiaVar2, yiaVar);
                    if (strB02 != null) {
                        cm0 cm0Var = hraVar.O;
                        String str = hraVar.H;
                        int i3 = yiaVar2.a;
                        String strZ = hraVar.Z(i3);
                        String str2 = this.b;
                        int i4 = yiaVar2.b;
                        int i5 = yiaVar.b;
                        this.c = 1;
                        ((hm0) cm0Var).b(str, i3, strZ, strB02, "", str2, i4, i5);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            default:
                int i6 = this.c;
                if (i6 == 0) {
                    e11.e0(obj);
                    strB0 = hraVar.b0(yiaVar2, yiaVar);
                    if (strB0 != null) {
                        cia ciaVar = hraVar.Q;
                        this.b = strB0;
                        this.c = 1;
                        objA = ((eia) ciaVar).a(this);
                        if (objA == xx1Var) {
                            return xx1Var;
                        }
                    }
                    return hebVar;
                }
                if (i6 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str3 = this.b;
                e11.e0(obj);
                strB0 = str3;
                objA = obj;
                List list = (List) objA;
                if (list.isEmpty()) {
                    hraVar.i(hraVar.i0, tea.a);
                } else {
                    fr9 fr9Var = hraVar.z0;
                    if (fr9Var != null) {
                        do {
                            value = fr9Var.getValue();
                            ((fia) value).getClass();
                            strB0.getClass();
                        } while (!fr9Var.j(value, new fia(strB0, list)));
                    }
                    hraVar.i(hraVar.i0, new zea(strB0));
                }
                return hebVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpa(hra hraVar, yia yiaVar, yia yiaVar2, jt1 jt1Var) {
        super(2, jt1Var);
        this.d = hraVar;
        this.e = yiaVar;
        this.f = yiaVar2;
    }
}
