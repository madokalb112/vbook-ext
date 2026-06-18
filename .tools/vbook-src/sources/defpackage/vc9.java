package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vc9 implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xc9 b;

    public /* synthetic */ vc9(xc9 xc9Var, int i) {
        this.a = i;
        this.b = xc9Var;
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        Object value;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        Object value2;
        Object value3;
        ArrayList arrayList;
        Object value4;
        ArrayList arrayList2;
        Object value5;
        ArrayList arrayList3;
        int i3 = this.a;
        heb hebVar = heb.a;
        xc9 xc9Var = this.b;
        switch (i3) {
            case 0:
                Object[] objArr = (Object[]) obj;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                List list = (List) objArr[4];
                List list2 = (List) obj5;
                List list3 = (List) obj4;
                List list4 = (List) obj3;
                ac9 ac9Var = (ac9) obj2;
                fr9 fr9Var = xc9Var.f;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                        i = ac9Var.b;
                        i2 = ac9Var.c;
                        z = ac9Var.h;
                        z2 = ac9Var.g;
                        z3 = ac9Var.f;
                        ((mb9) value).getClass();
                        list4.getClass();
                        list2.getClass();
                        list3.getClass();
                        list.getClass();
                    } while (!fr9Var.j(value, new mb9(false, i, i2, z3, z2, z, list4, list2, list3, list)));
                }
                break;
            case 1:
                c4b c4bVar = (c4b) obj;
                fr9 fr9Var2 = xc9Var.w;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, c4bVar));
                }
                break;
            case 2:
                xl7 xl7Var = (xl7) obj;
                Object obj6 = xl7Var.a;
                c4b c4bVar2 = (c4b) xl7Var.b;
                List<zv5> list5 = (List) obj6;
                fr9 fr9Var3 = xc9Var.s;
                if (fr9Var3 != null) {
                    do {
                        value3 = fr9Var3.getValue();
                        arrayList = new ArrayList(gc1.M(list5, 10));
                        for (zv5 zv5Var : list5) {
                            arrayList.add(fx1.I0(zv5Var, ((j4b) xc9Var.e).g(zv5Var.b, c4bVar2.a, zv5Var.C, c4bVar2.a(zv5Var.m), c4bVar2.c)));
                        }
                    } while (!fr9Var3.j(value3, arrayList));
                }
                break;
            case 3:
                xl7 xl7Var2 = (xl7) obj;
                Object obj7 = xl7Var2.a;
                c4b c4bVar3 = (c4b) xl7Var2.b;
                List<zv5> list6 = (List) obj7;
                fr9 fr9Var4 = xc9Var.t;
                if (fr9Var4 != null) {
                    do {
                        value4 = fr9Var4.getValue();
                        arrayList2 = new ArrayList(gc1.M(list6, 10));
                        for (zv5 zv5Var2 : list6) {
                            arrayList2.add(fx1.I0(zv5Var2, ((j4b) xc9Var.e).g(zv5Var2.b, c4bVar3.a, zv5Var2.C, c4bVar3.a(zv5Var2.m), c4bVar3.c)));
                        }
                    } while (!fr9Var4.j(value4, arrayList2));
                }
                break;
            default:
                xl7 xl7Var3 = (xl7) obj;
                Object obj8 = xl7Var3.a;
                c4b c4bVar4 = (c4b) xl7Var3.b;
                List<zv5> list7 = (List) obj8;
                fr9 fr9Var5 = xc9Var.u;
                if (fr9Var5 != null) {
                    do {
                        value5 = fr9Var5.getValue();
                        arrayList3 = new ArrayList(gc1.M(list7, 10));
                        for (zv5 zv5Var3 : list7) {
                            arrayList3.add(fx1.I0(zv5Var3, ((j4b) xc9Var.e).g(zv5Var3.b, c4bVar4.a, zv5Var3.C, c4bVar4.a(zv5Var3.m), c4bVar4.c)));
                        }
                    } while (!fr9Var5.j(value5, arrayList3));
                }
                break;
        }
        return hebVar;
    }
}
