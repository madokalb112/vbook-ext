package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a1b implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a1b(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        jt1 jt1Var;
        Object next;
        Object value;
        b1b b1bVar;
        ArrayList arrayList;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                c1b c1bVar = (c1b) obj2;
                long j = ((bp2) obj).a;
                fr9 fr9Var = c1bVar.f;
                Iterator it = ((b1b) fr9Var.getValue()).g.iterator();
                while (true) {
                    jt1Var = null;
                    if (it.hasNext()) {
                        next = it.next();
                        if (((bp2) next).a == j) {
                        }
                    } else {
                        next = null;
                    }
                }
                bp2 bp2Var = (bp2) next;
                if (bp2Var != null) {
                    if (fr9Var != null) {
                        do {
                            value = fr9Var.getValue();
                            b1bVar = (b1b) value;
                            List<bp2> list = b1bVar.g;
                            arrayList = new ArrayList(gc1.M(list, 10));
                            for (bp2 bp2VarA : list) {
                                if (bp2VarA.a == j) {
                                    boolean z = bp2Var.g;
                                    boolean z2 = !z;
                                    int i2 = bp2Var.f;
                                    bp2VarA = bp2.a(bp2VarA, z ? i2 - 1 : i2 + 1, z2, null, 927);
                                }
                                arrayList.add(bp2VarA);
                            }
                        } while (!fr9Var.j(value, b1b.a(b1bVar, false, false, false, false, false, null, arrayList, 63)));
                    }
                    za1 za1VarA = vtb.a(c1bVar);
                    aj2 aj2Var = rw2.a;
                    c1bVar.g(za1VarA, nh2.c, new em(c1bVar, j, jt1Var, 6));
                }
                break;
            case 1:
                gn2 gn2Var = (gn2) obj2;
                gn2Var.b.setValue(Long.valueOf(((bp2) obj).a));
                gn2Var.a.setValue(Boolean.TRUE);
                break;
            case 2:
                ((kb4) obj2).invoke((ihb) obj);
                break;
            default:
                ((kb4) obj2).invoke((zrb) obj);
                break;
        }
        return hebVar;
    }
}
