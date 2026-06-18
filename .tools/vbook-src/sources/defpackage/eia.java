package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class eia implements cia {
    public final zia a;

    public eia(zia ziaVar) {
        this.a = ziaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(defpackage.kt1 r8) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eia.a(kt1):java.io.Serializable");
    }

    public final void b(List list) {
        ArrayList arrayList = new ArrayList(gc1.M(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yha yhaVar = (yha) it.next();
            arrayList.add(new bia(yhaVar.a, yhaVar.b, yhaVar.c));
        }
        this.a.z.e(zia.A[27], arrayList);
    }
}
