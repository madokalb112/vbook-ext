package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class tm3 {
    public static List b(tm3 tm3Var, qha qhaVar, int i, int i2) {
        qhaVar.getClass();
        gx6 gx6Var = qhaVar.b;
        if (i == i2) {
            return lc3.a;
        }
        int iD = gx6Var.d(i);
        int iD2 = gx6Var.d(i2);
        boolean z = gx6Var.i(bw9.T(qhaVar.a.a)) == cl8.a;
        ArrayList arrayList = new ArrayList((iD2 - iD) + 1);
        if (iD <= iD2) {
            int i3 = iD;
            while (true) {
                arrayList.add(new kf8(i3 == iD ? qhaVar.f(i, z) : qhaVar.g(i3), gx6Var.g(i3), i3 == iD2 ? qhaVar.f(i2, z) : gx6Var.f(i3), gx6Var.b(i3)));
                if (i3 == iD2) {
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }

    public abstract l32 a(qha qhaVar);
}
