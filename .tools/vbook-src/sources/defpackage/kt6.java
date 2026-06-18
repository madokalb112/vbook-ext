package defpackage;

import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kt6 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kt6(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return ((ss6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 1:
                return ((ss6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 2:
                KeyEvent keyEvent = ((cj5) obj).a;
                keyEvent.getClass();
                m90 m90Var = (m90) obj3;
                cn7 cn7Var = m90Var.c;
                cn7 cn7Var2 = m90Var.a;
                cn7 cn7Var3 = m90Var.c;
                boolean zBooleanValue = ((Boolean) cn7Var.getValue()).booleanValue();
                zm7 zm7Var = m90Var.b;
                boolean z = false;
                if (zBooleanValue && vw1.E(keyEvent) == 2) {
                    long jE = cx1.e(keyEvent.getKeyCode());
                    if (aj5.a(jE, aj5.e)) {
                        if (!m90Var.a().isEmpty()) {
                            zm7Var.i((zm7Var.h() + 1) % m90Var.a().size());
                        }
                    } else if (!aj5.a(jE, aj5.d)) {
                        boolean zA = aj5.a(jE, aj5.r);
                        lc3 lc3Var = lc3.a;
                        if (zA || aj5.a(jE, aj5.t)) {
                            gi1 gi1Var = (gi1) fc1.A0(zm7Var.h(), m90Var.a());
                            if (gi1Var != null) {
                                ((hb1) obj2).c(gi1Var.c);
                                m90Var.d.getClass();
                                m90Var.e = new jua(xu6.a());
                                cn7Var3.setValue(Boolean.FALSE);
                                cn7Var2.setValue(lc3Var);
                                zm7Var.i(0);
                            }
                        } else if (aj5.a(jE, aj5.w)) {
                            cn7Var3.setValue(Boolean.FALSE);
                            cn7Var2.setValue(lc3Var);
                            zm7Var.i(0);
                        }
                    } else if (!m90Var.a().isEmpty()) {
                        zm7Var.i((zm7Var.h() > 0 ? zm7Var.h() : m90Var.a().size()) - 1);
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                int iIntValue = ((Number) obj).intValue();
                return ((qp6) obj3).invoke(Integer.valueOf(iIntValue), ((List) obj2).get(iIntValue));
            case 4:
                int iIntValue2 = ((Number) obj).intValue();
                return ((qp6) obj3).invoke(Integer.valueOf(iIntValue2), ((List) obj2).get(iIntValue2));
            case 5:
                return ((ss6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 6:
                int iIntValue3 = ((Number) obj).intValue();
                return ((qp6) obj3).invoke(Integer.valueOf(iIntValue3), ((List) obj2).get(iIntValue3));
            case 7:
                int iIntValue4 = ((Number) obj).intValue();
                return ((qp6) obj3).invoke(Integer.valueOf(iIntValue4), ((List) obj2).get(iIntValue4));
            case 8:
                int iIntValue5 = ((Number) obj).intValue();
                return ((qp6) obj3).invoke(Integer.valueOf(iIntValue5), ((List) obj2).get(iIntValue5));
            case 9:
                int iIntValue6 = ((Number) obj).intValue();
                return ((qp6) obj3).invoke(Integer.valueOf(iIntValue6), ((List) obj2).get(iIntValue6));
            case 10:
                return ((ax8) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 11:
                ((ax8) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "list1";
            case 12:
                return ((ax8) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 13:
                ((ax8) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "list2";
            case 14:
                return ((qc9) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 15:
                ((qc9) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "grid1";
            case 16:
                return ((qc9) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 17:
                ((qc9) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "grid2";
            case 18:
                return ((qc9) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 19:
                ((qc9) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "list1";
            case 20:
                return ((qc9) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 21:
                ((qc9) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "list2";
            case 22:
                zv5 zv5Var = (zv5) obj;
                zv5Var.getClass();
                c4b c4bVar = (c4b) obj2;
                return fx1.I0(zv5Var, ((j4b) ((ed9) obj3).d).g(zv5Var.b, c4bVar.a, zv5Var.C, c4bVar.a(zv5Var.m), c4bVar.c));
            case 23:
                return ((qc9) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 24:
                return ((qc9) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 25:
                return ((qc9) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 26:
                int iIntValue7 = ((Number) obj).intValue();
                return ((vw8) obj3).invoke(Integer.valueOf(iIntValue7), ((List) obj2).get(iIntValue7));
            case 27:
                int iIntValue8 = ((Number) obj).intValue();
                return ((e41) obj3).invoke(Integer.valueOf(iIntValue8), ((List) obj2).get(iIntValue8));
            case 28:
                return ((h1a) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            default:
                int iIntValue9 = ((Number) obj).intValue();
                return ((vw8) obj3).invoke(Integer.valueOf(iIntValue9), ((List) obj2).get(iIntValue9));
        }
    }
}
