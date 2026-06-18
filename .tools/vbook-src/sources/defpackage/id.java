package defpackage;

import android.content.res.Resources;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class id extends kc4 implements zb4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                if (obj != null) {
                    j31.j();
                } else {
                    View view = (rd) this.receiver;
                    Resources resources = view.getContext().getResources();
                }
                break;
            case 1:
                kb4 kb4Var = ((ir0) this.receiver).b;
                kb4Var.getClass();
                y86.w(kb4Var, obj2, (jx1) obj3);
                break;
            case 2:
                Object obj4 = ((y11) obj2).a;
                kb4 kb4Var2 = ((ir0) this.receiver).b;
                kb4Var2.getClass();
                Object objA = y11.a(obj4);
                objA.getClass();
                y86.w(kb4Var2, objA, (jx1) obj3);
                break;
            default:
                sl3 sl3Var = (sl3) obj;
                String str = (String) obj2;
                String str2 = (String) obj3;
                sl3Var.getClass();
                str.getClass();
                str2.getClass();
                em3 em3Var = (em3) this.receiver;
                em3Var.getClass();
                fr9 fr9Var = em3Var.s;
                int i2 = ((cm3) fr9Var.getValue()).o;
                if (i2 < 1) {
                    i2 = 1;
                }
                Integer numL = iw9.L(10, str);
                int iQ = wx1.Q(numL != null ? numL.intValue() : 1, 1, i2);
                Integer numL2 = iw9.L(10, str2);
                int iQ2 = wx1.Q(numL2 != null ? numL2.intValue() : iQ, iQ, i2);
                if (fr9Var != null) {
                    while (true) {
                        Object value = fr9Var.getValue();
                        int i3 = iQ;
                        if (!fr9Var.j(value, cm3.a((cm3) value, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, sl3Var, String.valueOf(iQ), String.valueOf(iQ2), false, false, false, false, false, false, null, null, null, 1071906815))) {
                            iQ = i3;
                        }
                    }
                }
                break;
        }
        return hebVar;
    }
}
