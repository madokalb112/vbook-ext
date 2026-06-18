package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class fc1 extends ic1 {
    public static Object A0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void B0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, kb4 kb4Var) {
        iterable.getClass();
        charSequence2.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            xg9.d(sb, obj, kb4Var);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void C0(Iterable iterable, StringBuilder sb, String str, kb4 kb4Var, int i) {
        String str2 = (i & 4) != 0 ? "" : "Errors: ";
        if ((i & 64) != 0) {
            kb4Var = null;
        }
        B0(iterable, sb, str, str2, "", "...", kb4Var);
    }

    public static String D0(Iterable iterable, CharSequence charSequence, String str, String str2, kb4 kb4Var, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            kb4Var = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        B0(iterable, sb, charSequence2, str3, str4, "...", kb4Var);
        return sb.toString();
    }

    public static Object E0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        so9.n("List is empty.");
        return null;
    }

    public static Object F0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList G0(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(gc1.M(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && lc5.Q(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList H0(x21 x21Var, x21 x21Var2) {
        if (x21Var instanceof Collection) {
            return I0((Collection) x21Var, x21Var2);
        }
        ArrayList arrayList = new ArrayList();
        p0(arrayList, x21Var);
        p0(arrayList, x21Var2);
        return arrayList;
    }

    public static ArrayList I0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            p0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList J0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static void K0(List list, kb4 kb4Var) {
        int size;
        list.getClass();
        kb4Var.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof fi5) && !(list instanceof gi5)) {
                fw.G0(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) kb4Var.invoke(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int size2 = list.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) kb4Var.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (size = list.size() - 1)) {
            return;
        }
        while (true) {
            list.remove(size);
            if (size == i) {
                return;
            } else {
                size--;
            }
        }
    }

    public static Object L0(AbstractList abstractList) {
        abstractList.getClass();
        if (!abstractList.isEmpty()) {
            return abstractList.remove(abstractList.size() - 1);
        }
        so9.n("List is empty.");
        return null;
    }

    public static Object M0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public static List N0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return Z0(iterable);
        }
        List listC1 = c1(iterable);
        Collections.reverse(listC1);
        return listC1;
    }

    public static Object O0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            so9.n("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        gp.l("List has more than one element.");
        return null;
    }

    public static Object P0(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List Q0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listC1 = c1(iterable);
            ic1.l0(listC1);
            return listC1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Z0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List R0(Comparator comparator, Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listC1 = c1(iterable);
            ic1.m0(comparator, listC1);
            return listC1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Z0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List S0(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            gp.k(xv5.k(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return lc3.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return Z0(iterable);
            }
            if (i == 1) {
                return gc1.Y(w0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return gc1.b0(arrayList);
    }

    public static List T0(int i, List list) {
        if (i < 0) {
            gp.k(xv5.k(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return lc3.a;
        }
        int size = list.size();
        if (i >= size) {
            return Z0(list);
        }
        if (i == 1) {
            return gc1.Y(E0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static byte[] U0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            bArr[i] = ((Number) obj).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void V0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] W0(List list) {
        list.getClass();
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static HashSet X0(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet(y86.O(gc1.M(iterable, 12)));
        V0(iterable, hashSet);
        return hashSet;
    }

    public static int[] Y0(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List Z0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return gc1.b0(c1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return lc3.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return gc1.Y(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] a1(List list) {
        list.getClass();
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList b1(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List c1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        V0(iterable, arrayList);
        return arrayList;
    }

    public static Set d1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        V0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set e1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return e11.d0(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(y86.O(collection.size()));
                V0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            V0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : e11.d0(linkedHashSet2.iterator().next());
            }
        }
        return sc3.a;
    }

    public static ArrayList f1(int i, List list, int i2) {
        list.getClass();
        mi9.g(i, i2);
        if (!(list instanceof RandomAccess)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            it.getClass();
            kc3 kc3VarY = !it.hasNext() ? kc3.a : ex1.Y(new li9(i, i2, it, null));
            while (kc3VarY.hasNext()) {
                arrayList.add((List) kc3VarY.next());
            }
            return arrayList;
        }
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static final int n0(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder sbU = xv5.u(i, "Element index ", " must be in range [");
        sbU.append(new ha5(0, list.size() - 1, 1));
        sbU.append("].");
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public static final int o0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbU = xv5.u(i, "Position index ", " must be in range [");
        sbU.append(new ha5(0, list.size(), 1));
        sbU.append("].");
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public static void p0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static jc1 q0(Iterable iterable) {
        iterable.getClass();
        return new jc1(iterable, 0);
    }

    public static boolean r0(Iterable iterable, Object obj) {
        int iIndexOf;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    gc1.i0();
                    throw null;
                }
                if (lc5.Q(obj, next)) {
                    iIndexOf = i;
                    break;
                }
                i++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    public static List s0(Iterable iterable) {
        iterable.getClass();
        return Z0(d1(iterable));
    }

    public static List t0(Iterable iterable, int i) {
        ArrayList arrayList;
        Object objE0;
        iterable.getClass();
        if (i < 0) {
            gp.k(xv5.k(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return Z0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return lc3.a;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    objE0 = E0((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        so9.n("Collection is empty.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    objE0 = next;
                }
                return gc1.Y(objE0);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return gc1.b0(arrayList);
    }

    public static List u0(List list) {
        list.getClass();
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return S0(list, size);
    }

    public static ArrayList v0(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object w0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return x0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        so9.n("Collection is empty.");
        return null;
    }

    public static Object x0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        so9.n("List is empty.");
        return null;
    }

    public static Object y0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object z0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
