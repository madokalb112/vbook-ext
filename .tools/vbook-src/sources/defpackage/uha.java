package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class uha implements kb4 {
    public final /* synthetic */ int a;

    public /* synthetic */ uha(int i) {
        this.a = i;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 3;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((n29) obj).a(j29.B, hebVar);
                return hebVar;
            case 1:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 2:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 3:
                return Integer.valueOf((-((Integer) obj).intValue()) / 6);
            case 4:
                return Integer.valueOf((-((Integer) obj).intValue()) / 6);
            case 5:
                return Integer.valueOf((-((Integer) obj).intValue()) / 6);
            case 6:
                return Integer.valueOf((-((Integer) obj).intValue()) / 6);
            case 7:
                List list = (List) obj;
                list.getClass();
                Object obj2 = list.get(0);
                obj2.getClass();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new ija((String) obj3, zBooleanValue);
            case 8:
                return xv5.i(4, (Integer) obj);
            case 9:
                return xv5.i(4, (Integer) obj);
            case 10:
                ((String) obj).getClass();
                return "\n";
            case 11:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 12:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 13:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 14:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 15:
                return ((u5b) obj).a;
            case 16:
                return ((u5b) obj).a;
            case 17:
                bta btaVar = (bta) obj;
                btaVar.getClass();
                ja5 ja5Var = btaVar.b;
                StringBuilder sb = new StringBuilder("(");
                sb.append(ja5Var.a);
                sb.append('x');
                sb.append(ja5Var.b);
                sb.append(',');
                sb.append(ja5Var.c);
                sb.append('x');
                return tw2.p(sb, ja5Var.d, ')');
            case 18:
                ((qha) obj).getClass();
                return hebVar;
            case 19:
                return Boolean.valueOf(vv9.g(((Character) obj).charValue()));
            case 20:
                List list2 = (List) obj;
                return new e0b(((Number) list2.get(0)).floatValue(), ((Number) list2.get(1)).floatValue(), ((Number) list2.get(2)).floatValue());
            case 21:
                ((String) obj).getClass();
                return hebVar;
            case 22:
                ((pn) obj).getClass();
                vr1 vr1Var = new vr1(wd3.c(ah1.W(0.0f, 0.0f, 7, null), 2), wd3.d(ah1.W(0.0f, 0.0f, 7, null), 2));
                vr1Var.d = new ch9(false);
                return vr1Var;
            case 23:
                at5 at5Var = (at5) obj;
                at5Var.getClass();
                at5.b0(at5Var, (String) null, sdc.o, 3);
                at5.b0(at5Var, (String) null, sdc.p, 3);
                at5.d0(at5Var, 3, (kb4) null, sdc.q, 6);
                return hebVar;
            case 24:
                bp2 bp2Var = (bp2) obj;
                bp2Var.getClass();
                return Long.valueOf(bp2Var.a);
            case 25:
                cr8 cr8Var = (cr8) obj;
                cr8Var.getClass();
                return Boolean.valueOf(cr8Var.J0());
            case 26:
                iz8 iz8Var = (iz8) obj;
                long j = iz8Var.f;
                lk9 lk9Var = iz8Var.t;
                if (lk9Var != null) {
                    lk9Var.d(iz8Var, p7c.z, iz8Var.s);
                }
                long j2 = iz8Var.f;
                if (j != j2) {
                    bz8 bz8Var = iz8Var.A;
                    if (bz8Var != null) {
                        if (bz8Var.a > j2) {
                            iz8Var.N();
                        } else {
                            bz8Var.g = j2;
                            if (bz8Var.b == null) {
                                bz8Var.h = t96.N((1.0d - ((double) bz8Var.e.a(0))) * iz8Var.f);
                            }
                        }
                    } else if (j2 != 0) {
                        iz8Var.Q();
                    }
                }
                return hebVar;
            case 27:
                return Integer.valueOf((-((Integer) obj).intValue()) / 5);
            case 28:
                return Integer.valueOf((-((Integer) obj).intValue()) / 5);
            default:
                ((pn) obj).getClass();
                a22 a22Var = b83.a;
                return new vr1(wd3.k(ah1.a0(350, 0, a22Var, 2), new uha(28)).a(new be3(new q3b(new kt3(0.5f, ah1.a0(350, 0, null, 6)), (nh9) null, (f11) null, (bu8) null, (slb) null, (LinkedHashMap) null, Token.ELSE))), wd3.o(ah1.a0(350, 0, a22Var, 2), new e4(i2)));
        }
    }
}
