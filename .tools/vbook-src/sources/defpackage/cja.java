package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cja implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eja b;

    public /* synthetic */ cja(eja ejaVar, int i) {
        this.a = i;
        this.b = ejaVar;
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i = this.a;
        heb hebVar = heb.a;
        eja ejaVar = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                fr9 fr9Var = ejaVar.e;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, bja.a((bja) value, 0, list.size(), 0, 0, 27)));
                }
                break;
            case 1:
                List list2 = (List) obj;
                fr9 fr9Var2 = ejaVar.e;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, bja.a((bja) value2, list2.size(), 0, 0, 0, 29)));
                }
                break;
            case 2:
                List list3 = (List) obj;
                fr9 fr9Var3 = ejaVar.e;
                if (fr9Var3 != null) {
                    do {
                        value3 = fr9Var3.getValue();
                    } while (!fr9Var3.j(value3, bja.a((bja) value3, 0, 0, 0, list3.size(), 15)));
                }
                break;
            default:
                List list4 = (List) obj;
                fr9 fr9Var4 = ejaVar.e;
                if (fr9Var4 != null) {
                    do {
                        value4 = fr9Var4.getValue();
                    } while (!fr9Var4.j(value4, bja.a((bja) value4, 0, 0, list4.size(), 0, 23)));
                }
                break;
        }
        return hebVar;
    }
}
