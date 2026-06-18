package defpackage;

import java.util.LinkedHashMap;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class t3b implements kb4 {
    public final /* synthetic */ int a;

    public /* synthetic */ t3b(fbb fbbVar) {
        this.a = 9;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((pn) obj).getClass();
                a22 a22Var = b83.a;
                return new vr1(wd3.k(ah1.a0(350, 0, a22Var, 2), new e4(3)), wd3.o(ah1.a0(350, 0, a22Var, 2), new uha(27)).a(new cj3(new q3b(new kt3(0.5f, ah1.a0(350, 0, null, 6)), (nh9) null, (f11) null, (bu8) null, (slb) null, (LinkedHashMap) null, Token.ELSE))));
            case 1:
                ((pn) obj).getClass();
                return new vr1(wd3.c(ah1.a0(350, 0, null, 6), 2), wd3.d(ah1.a0(350, 0, null, 6), 2));
            case 2:
                ((pn) obj).getClass();
                return new vr1(wd3.c(ah1.a0(350, 0, null, 6), 2), wd3.d(ah1.a0(350, 0, null, 6), 2));
            case 3:
                return xv5.i(4, (Integer) obj);
            case 4:
                return Integer.valueOf((-((Integer) obj).intValue()) / 6);
            case 5:
                return Integer.valueOf((-((Integer) obj).intValue()) / 6);
            case 6:
                return Integer.valueOf((-((Integer) obj).intValue()) / 6);
            case 7:
                return Integer.valueOf((-((Integer) obj).intValue()) / 6);
            case 8:
                cr8 cr8Var = (cr8) obj;
                cr8Var.getClass();
                k69 k69Var = new k69();
                while (cr8Var.J0()) {
                    k69Var.add(Integer.valueOf((int) cr8Var.getLong(0)));
                }
                return e11.G(k69Var);
            case 9:
                ri5 ri5Var = (ri5) obj;
                ri5Var.getClass();
                ti5 ti5Var = ri5Var.a;
                if (ti5Var == null) {
                    return "*";
                }
                pi5 pi5Var = ri5Var.b;
                fbb fbbVar = pi5Var instanceof fbb ? (fbb) pi5Var : null;
                String strC = fbbVar != null ? fbbVar.c(true) : String.valueOf(pi5Var);
                int iOrdinal = ti5Var.ordinal();
                if (iOrdinal == 0) {
                    return strC;
                }
                if (iOrdinal == 1) {
                    return "in ".concat(strC);
                }
                if (iOrdinal == 2) {
                    return "out ".concat(strC);
                }
                mn5.g();
                return null;
            case 10:
                xl7 xl7Var = (xl7) obj;
                xl7Var.getClass();
                String str = (String) xl7Var.a;
                Object obj2 = xl7Var.b;
                if (obj2 == null) {
                    return str;
                }
                return str + '=' + String.valueOf(obj2);
            case 11:
                n29 n29Var = (n29) obj;
                n29Var.getClass();
                bs1.a.getClass();
                l29.d(n29Var, xr1.c);
                return hebVar;
            case 12:
                n29 n29Var2 = (n29) obj;
                n29Var2.getClass();
                bs1.a.getClass();
                l29.d(n29Var2, xr1.b);
                return hebVar;
            case 13:
                ((qq5) obj).getClass();
                return new bi4(bx1.e(qq5.b));
            case 14:
                pib pibVar = (pib) obj;
                pibVar.getClass();
                yn2.u(pibVar, ':');
                pib.k(pibVar);
                return hebVar;
            case 15:
                pib pibVar2 = (pib) obj;
                pibVar2.getClass();
                pib.k(pibVar2);
                return hebVar;
            case 16:
                pib pibVar3 = (pib) obj;
                pibVar3.getClass();
                pibVar3.b().c(new cp1("z"));
                return hebVar;
            case 17:
                pib pibVar4 = (pib) obj;
                pibVar4.getClass();
                yn2.J(pibVar4, "Z", new t3b(20));
                return hebVar;
            case 18:
                pib pibVar5 = (pib) obj;
                pibVar5.getClass();
                pibVar5.b().c(new cp1("z"));
                return hebVar;
            case 19:
                pib pibVar6 = (pib) obj;
                pibVar6.getClass();
                yn2.J(pibVar6, "Z", new t3b(21));
                return hebVar;
            case 20:
                pib pibVar7 = (pib) obj;
                pibVar7.getClass();
                pib.i(pibVar7);
                yn2.u(pibVar7, ':');
                pib.j(pibVar7);
                yn2.J(pibVar7, "", new t3b(14));
                return hebVar;
            case 21:
                pib pibVar8 = (pib) obj;
                pibVar8.getClass();
                pib.i(pibVar8);
                yn2.J(pibVar8, "", new t3b(22));
                return hebVar;
            case 22:
                pib pibVar9 = (pib) obj;
                pibVar9.getClass();
                pib.j(pibVar9);
                yn2.J(pibVar9, "", new t3b(15));
                return hebVar;
            case 23:
                af5 af5Var = (af5) obj;
                af5Var.getClass();
                af5Var.d = true;
                af5Var.c = true;
                return hebVar;
            case 24:
                return new ro(((Float) obj).floatValue());
            case 25:
                return new ro(((Integer) obj).intValue());
            case 26:
                return Integer.valueOf((int) ((ro) obj).a);
            case 27:
                return new ro(((x13) obj).a);
            case 28:
                return new x13(((ro) obj).a);
            default:
                z13 z13Var = (z13) obj;
                return new so(z13.a(z13Var.a), z13.b(z13Var.a));
        }
    }

    public /* synthetic */ t3b(int i) {
        this.a = i;
    }
}
