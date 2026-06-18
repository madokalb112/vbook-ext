package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class jca implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jca(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = vl1.a;
        lu6 lu6Var = lu6.a;
        heb hebVar = heb.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                hra hraVar = (hra) obj6;
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                str.getClass();
                ((a07) obj5).setValue(Boolean.FALSE);
                hraVar.getClass();
                za1 za1VarA = vtb.a(hraVar);
                aj2 aj2Var = rw2.a;
                hraVar.g(za1VarA, nh2.c, new m12(hraVar, zBooleanValue2, zBooleanValue, str, null));
                break;
            case 1:
                zfa zfaVar = (zfa) obj6;
                yy6 yy6Var = (yy6) obj5;
                dd4 dd4Var = (dd4) obj2;
                ((Integer) obj3).getClass();
                dd4Var.f0(-102778667);
                Object objQ = dd4Var.Q();
                if (objQ == obj4) {
                    objQ = lc5.Z(dd4Var);
                    dd4Var.p0(objQ);
                }
                vx1 vx1Var = (vx1) objQ;
                Object objQ2 = dd4Var.Q();
                if (objQ2 == obj4) {
                    objQ2 = dk9.x((Object) null);
                    dd4Var.p0(objQ2);
                }
                a07 a07Var = (a07) objQ2;
                a07 a07VarA = dk9.A(zfaVar, dd4Var);
                boolean zF = dd4Var.f(yy6Var);
                Object objQ3 = dd4Var.Q();
                if (zF || objQ3 == obj4) {
                    objQ3 = new k49(a07Var, yy6Var, 12);
                    dd4Var.p0(objQ3);
                }
                lc5.j(yy6Var, (kb4) objQ3, dd4Var);
                boolean zH = dd4Var.h(vx1Var) | dd4Var.f(yy6Var) | dd4Var.f(a07VarA);
                Object objQ4 = dd4Var.Q();
                if (zH || objQ4 == obj4) {
                    objQ4 = new s51(vx1Var, a07Var, yy6Var, a07VarA);
                    dd4Var.p0(objQ4);
                }
                ou6 ou6VarB = r1a.b(lu6Var, yy6Var, (PointerInputEventHandler) objQ4);
                dd4Var.q(false);
                break;
            case 2:
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                wn9.h((u4b) obj6, true, gjb.l0(lu6Var, 12.0f), null, (ib4) obj5, (dd4) obj2, 432, 8);
                break;
            case 3:
                m2b m2bVar = (m2b) obj6;
                kb4 kb4Var = (kb4) obj5;
                dd4 dd4Var2 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                long j = (m2bVar != null ? m2bVar.b : 0L) * 1000;
                rp8 rp8VarA = tp8.a(20.0f);
                ur9 ur9Var = s96.a;
                long jC = lc1.c(0.85f, ((q96) dd4Var2.j(ur9Var)).a.p);
                long j2 = ((q96) dd4Var2.j(ur9Var)).a.q;
                ou6 ou6VarW = t96.w(lu6Var, tp8.a(20.0f));
                boolean zF2 = dd4Var2.f(kb4Var) | dd4Var2.e(j);
                Object objQ5 = dd4Var2.Q();
                if (zF2 || objQ5 == obj4) {
                    objQ5 = new jp6(kb4Var, j, 3);
                    dd4Var2.p0(objQ5);
                }
                j1a.a(fw.J(null, (ib4) objQ5, ou6VarW, false, 15), rp8VarA, jC, j2, 0.0f, 0.0f, (wm0) null, kf0.v, dd4Var2, 12582912, Token.ASSIGN_MOD);
                break;
            default:
                n7c n7cVar = (n7c) obj6;
                vx1 vx1Var2 = (vx1) obj5;
                eb7 eb7Var = (eb7) obj;
                eb7 eb7Var2 = (eb7) obj2;
                float fFloatValue = ((Float) obj3).floatValue();
                if (n7cVar.e() == 0.0f) {
                    ah1.J(vx1Var2, null, null, new iw8(n7cVar, eb7Var, eb7Var2, fFloatValue, null), 3);
                }
                break;
        }
        return hebVar;
    }
}
