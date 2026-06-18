package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class gz4 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vx1 b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ a07 d;

    public /* synthetic */ gz4(vx1 vx1Var, a07 a07Var, a07 a07Var2) {
        this.a = 1;
        this.b = vx1Var;
        this.c = a07Var;
        this.d = a07Var2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = 0;
        jt1 jt1Var = null;
        vx1 vx1Var = this.b;
        a07 a07Var = this.d;
        a07 a07Var2 = this.c;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                st5 st5Var = ((rz4) a07Var2.getValue()).a;
                int i3 = ((o25) a07Var.getValue()).a;
                int i4 = 0;
                for (Object obj2 : ((rz4) a07Var2.getValue()).b) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        gc1.i0();
                        throw null;
                    }
                    uj7 uj7Var = (uj7) obj2;
                    if (uj7Var instanceof j15) {
                        j15 j15Var = (j15) uj7Var;
                        if (j15Var.c == i3 && j15Var.d == iIntValue - 1) {
                            ah1.J(vx1Var, null, null, new qz4(st5Var, i4, jt1Var, i2), 3);
                        }
                    }
                    i4 = i5;
                }
                return hebVar;
            case 1:
                bi5 bi5Var = (bi5) obj;
                bi5Var.getClass();
                aj2 aj2Var = rw2.a;
                ah1.J(vx1Var, nh2.c, null, new yw(bi5Var, a07Var2, a07Var, (jt1) null), 2);
                return hebVar;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                st5 st5Var2 = ((nca) a07Var2.getValue()).a;
                List list = ((nca) a07Var2.getValue()).b;
                int i6 = ((xja) a07Var.getValue()).a;
                for (Object obj3 : list) {
                    int i7 = i2 + 1;
                    if (i2 < 0) {
                        gc1.i0();
                        throw null;
                    }
                    tj7 tj7Var = (tj7) obj3;
                    if (tj7Var instanceof pia) {
                        pia piaVar = (pia) tj7Var;
                        if (piaVar.d == i6 && piaVar.g.a == iIntValue2 - 1) {
                            ah1.J(vx1Var, null, null, new qz4(st5Var2, i2, jt1Var, 5), 3);
                        }
                    }
                    i2 = i7;
                }
                return hebVar;
        }
    }

    public /* synthetic */ gz4(a07 a07Var, a07 a07Var2, vx1 vx1Var, int i) {
        this.a = i;
        this.c = a07Var;
        this.d = a07Var2;
        this.b = vx1Var;
    }
}
