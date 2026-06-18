package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class jl8 {
    public static final hl8 a = new hl8();
    public static final ur9 b = new ur9(new av6(24));
    public static final il8 c = il8.a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Iterable, java.util.List] */
    public static final ql8 a(dl8 dl8Var, gl8 gl8Var) {
        dl8Var.getClass();
        gl8Var.getClass();
        List listZ0 = fc1.Z0(dl8Var.b);
        fm5 fm5Var = gl8Var.a;
        ch8 ch8Var = gl8Var.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : listZ0) {
            Set set = ((ql8) obj).a;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (lc5.Q((qa8) it.next(), fm5Var)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            Set set2 = ((ql8) obj2).a;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (lc5.Q((qa8) it2.next(), ch8Var)) {
                        arrayList2.add(obj2);
                        break;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj3 = arrayList.get(i3);
                i3++;
                Set set3 = ((ql8) obj3).a;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    Iterator it3 = set3.iterator();
                    while (it3.hasNext()) {
                        if (((qa8) it3.next()) instanceof ch8) {
                            break;
                        }
                    }
                }
                arrayList2.add(obj3);
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
                for (Object obj4 : listZ0) {
                    Set<qa8> set4 = ((ql8) obj4).a;
                    if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                        for (qa8 qa8Var : set4) {
                            if ((qa8Var instanceof fm5) || (qa8Var instanceof ch8)) {
                                break;
                            }
                        }
                    }
                    arrayList2.add(obj4);
                }
            }
        }
        if (arrayList2.size() == 1) {
            return (ql8) fc1.x0(arrayList2);
        }
        mra mraVar = gl8Var.c;
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj5 = arrayList2.get(i4);
            i4++;
            Set set5 = ((ql8) obj5).a;
            if (!(set5 instanceof Collection) || !set5.isEmpty()) {
                Iterator it4 = set5.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (lc5.Q((qa8) it4.next(), mraVar)) {
                        arrayList3.add(obj5);
                        break;
                    }
                }
            }
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = new ArrayList();
            int size4 = arrayList2.size();
            int i5 = 0;
            while (i5 < size4) {
                Object obj6 = arrayList2.get(i5);
                i5++;
                Set set6 = ((ql8) obj6).a;
                if (!(set6 instanceof Collection) || !set6.isEmpty()) {
                    Iterator it5 = set6.iterator();
                    while (it5.hasNext()) {
                        if (((qa8) it5.next()).getClass() == mra.class) {
                            break;
                        }
                    }
                }
                arrayList3.add(obj6);
            }
        }
        if (arrayList3.size() == 1) {
            return (ql8) fc1.x0(arrayList3);
        }
        int i6 = gl8Var.d.a;
        ArrayList arrayList4 = new ArrayList();
        le3 le3Var = tn2.v;
        for (Object obj7 : le3Var) {
            if (((tn2) obj7).a >= i6) {
                arrayList4.add(obj7);
            }
        }
        Iterator it6 = fc1.R0(new zp4(15), arrayList4).iterator();
        ?? arrayList5 = lc3.a;
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            tn2 tn2Var = (tn2) it6.next();
            ArrayList arrayList6 = new ArrayList();
            int size5 = arrayList3.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj8 = arrayList3.get(i7);
                i7++;
                Set set7 = ((ql8) obj8).a;
                if (!(set7 instanceof Collection) || !set7.isEmpty()) {
                    Iterator it7 = set7.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        if (((qa8) it7.next()) == tn2Var) {
                            arrayList6.add(obj8);
                            break;
                        }
                    }
                }
            }
            if (!arrayList6.isEmpty()) {
                arrayList5 = arrayList6;
                break;
            }
            arrayList5 = arrayList6;
        }
        if (arrayList5.isEmpty()) {
            tn2 tn2Var2 = tn2.c;
            ArrayList arrayListG0 = fc1.G0(le3Var, tn2Var2);
            ArrayList arrayList7 = new ArrayList();
            int size6 = arrayListG0.size();
            int i8 = 0;
            while (i8 < size6) {
                Object obj9 = arrayListG0.get(i8);
                i8++;
                if (((tn2) obj9).a < i6) {
                    arrayList7.add(obj9);
                }
            }
            for (tn2 tn2Var3 : fc1.R0(new zp4(16), arrayList7)) {
                arrayList5 = new ArrayList();
                int size7 = arrayList3.size();
                int i9 = 0;
                while (i9 < size7) {
                    Object obj10 = arrayList3.get(i9);
                    i9++;
                    Set set8 = ((ql8) obj10).a;
                    if (!(set8 instanceof Collection) || !set8.isEmpty()) {
                        Iterator it8 = set8.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                break;
                            }
                            if (((qa8) it8.next()) == tn2Var3) {
                                arrayList5.add(obj10);
                                break;
                            }
                        }
                    }
                }
                if (!arrayList5.isEmpty()) {
                    break;
                }
            }
            if (arrayList5.isEmpty()) {
                arrayList5 = new ArrayList();
                int size8 = arrayList3.size();
                int i10 = 0;
                while (i10 < size8) {
                    Object obj11 = arrayList3.get(i10);
                    i10++;
                    Set set9 = ((ql8) obj11).a;
                    if (!(set9 instanceof Collection) || !set9.isEmpty()) {
                        Iterator it9 = set9.iterator();
                        while (it9.hasNext()) {
                            if (((qa8) it9.next()) instanceof tn2) {
                                break;
                            }
                        }
                    }
                    arrayList5.add(obj11);
                }
                if (arrayList5.isEmpty()) {
                    arrayList5 = new ArrayList();
                    int size9 = arrayList3.size();
                    while (i < size9) {
                        Object obj12 = arrayList3.get(i);
                        i++;
                        Set set10 = ((ql8) obj12).a;
                        if (!(set10 instanceof Collection) || !set10.isEmpty()) {
                            Iterator it10 = set10.iterator();
                            while (true) {
                                if (!it10.hasNext()) {
                                    break;
                                }
                                if (((qa8) it10.next()) == tn2Var2) {
                                    arrayList5.add(obj12);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        ?? r8 = arrayList5;
        if (r8.size() == 1) {
            return (ql8) fc1.x0(r8);
        }
        boolean zIsEmpty = r8.isEmpty();
        String str = dl8Var.a;
        if (zIsEmpty) {
            w58.i(str, "' not found", "Resource with ID='");
            return null;
        }
        throw new IllegalStateException(("Resource with ID='" + str + "' has more than one file: " + fc1.D0(r8, null, null, null, new f48(8), 31)).toString());
    }
}
