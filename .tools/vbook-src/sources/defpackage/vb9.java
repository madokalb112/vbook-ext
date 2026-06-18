package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vb9 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;

    public /* synthetic */ vb9(a07 a07Var, int i) {
        this.a = i;
        this.b = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        Object next;
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.b;
        switch (i) {
            case 0:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 1:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 2:
                a07Var.setValue(Boolean.valueOf(!((Boolean) a07Var.getValue()).booleanValue()));
                break;
            case 3:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 4:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 5:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 6:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 7:
                a07Var.setValue(Boolean.FALSE);
                break;
            case 8:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 9:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 10:
                a07Var.setValue(Boolean.valueOf(!((Boolean) a07Var.getValue()).booleanValue()));
                break;
            case 11:
                a07Var.setValue(true);
                break;
            case 12:
                ot5 ot5Var = (ot5) fc1.z0(((nca) a07Var.getValue()).a.j().k);
                if (ot5Var != null) {
                }
                break;
            case 13:
                ot5 ot5Var2 = (ot5) fc1.F0(((nca) a07Var.getValue()).a.j().k);
                if (ot5Var2 != null) {
                }
                break;
            case 14:
                Iterator it = ((nca) a07Var.getValue()).a.j().k.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((ot5) next).p >= 0) {
                        }
                    } else {
                        next = null;
                    }
                }
                ot5 ot5Var3 = (ot5) next;
                if (ot5Var3 != null) {
                }
                break;
            case 15:
                a07Var.setValue(Boolean.FALSE);
                break;
            case 16:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 17:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 18:
                a07Var.setValue(Boolean.FALSE);
                break;
            case 19:
                a07Var.setValue(Boolean.FALSE);
                break;
            case 20:
                a07Var.setValue(Boolean.FALSE);
                break;
            case 21:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 22:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 23:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 24:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 25:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 26:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 27:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 28:
                a07Var.setValue(Boolean.TRUE);
                break;
            default:
                a07Var.setValue(Boolean.TRUE);
                break;
        }
        return hebVar;
    }
}
