package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class dp implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ dp(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = 0;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                it7 it7Var = (it7) obj;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    it7.n(it7Var, (jt7) arrayList.get(i3), 0, 0);
                }
                break;
            case 1:
                gv4 gv4Var = (gv4) obj;
                gv4Var.getClass();
                ut0 ut0VarB = gv4Var.b();
                int size2 = arrayList.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    wq1 wq1Var = (wq1) obj2;
                    k46 k46Var = br1.a;
                    if (ww1.S(k46Var)) {
                        k46Var.j("Decoding response with " + wq1Var + " for " + gv4Var.p0().c().getUrl());
                    }
                    ut0VarB = wq1Var.q(ut0VarB, gv4Var.q());
                }
                break;
            case 2:
                it7 it7Var2 = (it7) obj;
                it7Var2.getClass();
                int size3 = arrayList.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    it7.n(it7Var2, (jt7) arrayList.get(i5), 0, 0);
                }
                break;
            case 3:
                it7 it7Var3 = (it7) obj;
                int size4 = arrayList.size();
                int i6 = 0;
                while (i6 < size4) {
                    ka6 ka6Var = (ka6) arrayList.get(i6);
                    List list = ka6Var.b;
                    boolean z = ka6Var.h;
                    if (ka6Var.l == Integer.MIN_VALUE) {
                        t75.a("position() should be called first");
                    }
                    int size5 = list.size();
                    int i7 = i2;
                    while (i7 < size5) {
                        jt7 jt7Var = (jt7) list.get(i7);
                        int[] iArr = ka6Var.j;
                        int i8 = i7 * 2;
                        int i9 = size4;
                        long jD = ea5.d((((long) iArr[i8 + 1]) & 4294967295L) | (((long) iArr[i8]) << 32), ka6Var.c);
                        if (z) {
                            it7.B(it7Var3, jt7Var, jD);
                        } else {
                            it7.p(it7Var3, jt7Var, jD);
                        }
                        i7++;
                        size4 = i9;
                    }
                    i6++;
                    i2 = 0;
                }
                break;
            default:
                it7 it7Var4 = (it7) obj;
                int size6 = arrayList.size();
                for (int i10 = 0; i10 < size6; i10++) {
                    it7.j(it7Var4, (jt7) arrayList.get(i10), 0, 0);
                }
                break;
        }
        return hebVar;
    }
}
