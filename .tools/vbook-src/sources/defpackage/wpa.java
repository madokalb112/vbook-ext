package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wpa extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hra b;
    public final /* synthetic */ yia c;
    public final /* synthetic */ yia d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wpa(hra hraVar, yia yiaVar, yia yiaVar2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = hraVar;
        this.c = yiaVar;
        this.d = yiaVar2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new wpa(this.b, this.c, this.d, jt1Var, 0);
            case 1:
                return new wpa(this.b, this.c, this.d, jt1Var, 1);
            case 2:
                return new wpa(this.b, this.c, this.d, jt1Var, 2);
            case 3:
                return new wpa(this.b, this.c, this.d, jt1Var, 3);
            default:
                return new wpa(this.b, this.c, this.d, jt1Var, 4);
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
                ((wpa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((wpa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((wpa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 3:
                ((wpa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((wpa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object next;
        String str;
        String str2;
        int i = this.a;
        yia yiaVar = this.d;
        yia yiaVar2 = this.c;
        hra hraVar = this.b;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                e11.e0(obj);
                String strB0 = hraVar.b0(yiaVar2, yiaVar);
                if (strB0 != null) {
                    Iterator it = ((kba) hraVar.t0.getValue()).a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            gba gbaVar = (gba) next;
                            if (gbaVar.e != 1 || gbaVar.c != yiaVar2.a || !ri9.D(gbaVar, yiaVar2.b, yiaVar.b)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    gba gbaVar2 = (gba) next;
                    pp1 pp1Var = hraVar.i0;
                    String str3 = gbaVar2 != null ? gbaVar2.a : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    int i2 = yiaVar2.a;
                    int i3 = yiaVar2.b;
                    int i4 = yiaVar.b;
                    str = gbaVar2 != null ? gbaVar2.h : null;
                    hraVar.i(pp1Var, new bfa(str3, i2, i3, i4, strB0, str == null ? "" : str, (gbaVar2 == null || (str2 = gbaVar2.g) == null) ? "" : str2));
                }
                break;
            case 1:
                e11.e0(obj);
                String strB02 = hraVar.b0(yiaVar2, yiaVar);
                if (strB02 != null) {
                    hraVar.i(hraVar.i0, new vea(strB02));
                }
                break;
            case 2:
                e11.e0(obj);
                boolean zV = hraVar.v();
                pp1 pp1Var2 = hraVar.i0;
                if (zV && hraVar.u()) {
                    p5b p5bVar = ((u4b) hraVar.d.getValue()).f;
                    str = p5bVar != null ? p5bVar.b : null;
                    hraVar.i(pp1Var2, new rea(str != null ? str : ""));
                } else {
                    String strB03 = hraVar.b0(yiaVar2, yiaVar);
                    if (strB03 != null) {
                        hraVar.i(pp1Var2, new yea(strB03));
                    }
                }
                break;
            case 3:
                e11.e0(obj);
                String strB04 = hraVar.b0(yiaVar2, yiaVar);
                if (strB04 != null) {
                    za1 za1VarA = vtb.a(hraVar);
                    aj2 aj2Var = rw2.a;
                    hraVar.g(za1VarA, nh2.c, new pqa(null, hraVar, strB04));
                }
                break;
            default:
                e11.e0(obj);
                String strB05 = hraVar.b0(yiaVar2, yiaVar);
                if (strB05 != null) {
                    hraVar.i(hraVar.i0, new ffa(strB05));
                }
                break;
        }
        return hebVar;
    }
}
