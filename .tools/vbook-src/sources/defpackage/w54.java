package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w54 implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y54 b;

    public /* synthetic */ w54(y54 y54Var, int i) {
        this.a = i;
        this.b = y54Var;
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        Object value;
        int i = this.a;
        heb hebVar = heb.a;
        y54 y54Var = this.b;
        switch (i) {
            case 0:
                Object[] objArr = (Object[]) obj;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                c4b c4bVar = (c4b) objArr[3];
                List list = (List) obj4;
                List<zv5> list2 = (List) obj3;
                ac9 ac9Var = (ac9) obj2;
                fr9 fr9Var = y54Var.s;
                f4b f4bVar = y54Var.c;
                if (fr9Var != null) {
                    while (true) {
                        Object value2 = fr9Var.getValue();
                        v54 v54Var = (v54) value2;
                        int i2 = ac9Var.c;
                        ArrayList arrayList = new ArrayList(gc1.M(list2, 10));
                        for (zv5 zv5Var : list2) {
                            f4b f4bVar2 = f4bVar;
                            arrayList.add(new o54(zv5Var.a, ((j4b) f4bVar2).g(zv5Var.b, c4bVar.a, zv5Var.C, c4bVar.a(zv5Var.m), c4bVar.c), zv5Var.d, zv5Var.l, zv5Var.p, zv5Var.x, zv5Var.D, zv5Var.I));
                            f4bVar = f4bVar2;
                            hebVar = hebVar;
                            ac9Var = ac9Var;
                        }
                        f4b f4bVar3 = f4bVar;
                        heb hebVar2 = hebVar;
                        ac9 ac9Var2 = ac9Var;
                        ArrayList arrayList2 = new ArrayList(gc1.M(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            zv5 zv5Var2 = (zv5) it.next();
                            arrayList2.add(new o54(zv5Var2.a, ((j4b) f4bVar3).g(zv5Var2.b, c4bVar.a, zv5Var2.C, c4bVar.a(zv5Var2.m), c4bVar.c), zv5Var2.d, zv5Var2.l, zv5Var2.p, zv5Var2.x, zv5Var2.D, zv5Var2.I));
                            it = it;
                            c4bVar = c4bVar;
                        }
                        c4b c4bVar2 = c4bVar;
                        if (!fr9Var.j(value2, v54.a(v54Var, i2, false, arrayList, arrayList2, 4))) {
                            f4bVar = f4bVar3;
                            hebVar = hebVar2;
                            ac9Var = ac9Var2;
                            c4bVar = c4bVar2;
                        }
                    }
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fr9 fr9Var2 = y54Var.s;
                if (fr9Var2 != null) {
                    do {
                        value = fr9Var2.getValue();
                    } while (!fr9Var2.j(value, v54.a((v54) value, 0, zBooleanValue, null, null, 27)));
                }
                break;
        }
        return hebVar;
    }
}
