package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class a55 extends s45 implements List, RandomAccess {
    public static final w45 b = new w45(hh8.e, 0);

    public static hh8 h(int i, Object[] objArr) {
        return i == 0 ? hh8.e : new hh8(objArr, i);
    }

    public static v45 i() {
        return new v45(4);
    }

    public static v45 j(int i) {
        t1c.N(i, "expectedSize");
        return new v45(i);
    }

    public static a55 k(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return l((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return hh8.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return q(next);
        }
        v45 v45Var = new v45(4);
        v45Var.b(next);
        while (it.hasNext()) {
            v45Var.b(it.next());
        }
        return v45Var.g();
    }

    public static a55 l(Collection collection) {
        if (!(collection instanceof s45)) {
            Object[] array = collection.toArray();
            lx1.A(array.length, array);
            return h(array.length, array);
        }
        a55 a55VarA = ((s45) collection).a();
        if (!a55VarA.f()) {
            return a55VarA;
        }
        Object[] array2 = a55VarA.toArray(s45.a);
        return h(array2.length, array2);
    }

    public static hh8 m(Object[] objArr) {
        if (objArr.length == 0) {
            return hh8.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        lx1.A(objArr2.length, objArr2);
        return h(objArr2.length, objArr2);
    }

    public static hh8 o(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        lx1.A(5, objArr);
        return h(5, objArr);
    }

    public static hh8 q(Object obj) {
        Object[] objArr = {obj};
        lx1.A(1, objArr);
        return h(1, objArr);
    }

    public static hh8 r(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        lx1.A(2, objArr);
        return h(2, objArr);
    }

    public static hh8 s(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        fx1.F("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        lx1.A(length, objArr2);
        return h(length, objArr2);
    }

    public static hh8 u(Comparator comparator, List list) {
        comparator.getClass();
        if (list == null) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        lx1.A(array.length, array);
        Arrays.sort(array, comparator);
        return h(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.s45
    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.s45, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && yn2.z(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (yn2.z(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.s45
    /* JADX INFO: renamed from: g */
    public final reb iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.s45, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final w45 listIterator(int i) {
        fx1.O(i, size());
        return isEmpty() ? b : new w45(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public a55 t() {
        return size() <= 1 ? this : new x45(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public a55 subList(int i, int i2) {
        fx1.P(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? hh8.e : new y45(this, i, i3);
    }

    @Override // defpackage.s45
    public final a55 a() {
        return this;
    }
}
