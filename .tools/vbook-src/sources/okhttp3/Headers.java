package okhttp3;

import defpackage.fi5;
import defpackage.fw;
import defpackage.lc3;
import defpackage.n1;
import defpackage.xl7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Headers implements Iterable<xl7>, fi5 {
    public static final Headers b = new Headers(new String[0]);
    public final String[] a;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Builder {
        public final ArrayList a = new ArrayList(20);

        public final Headers a() {
            return new Headers((String[]) this.a.toArray(new String[0]));
        }

        public final void b(String str) {
            str.getClass();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.a;
                if (i >= arrayList.size()) {
                    return;
                }
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    public Headers(String[] strArr) {
        strArr.getClass();
        this.a = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.a;
        strArr.getClass();
        int length = strArr.length - 2;
        int iO = sw1.O(length, 0, -2);
        if (iO > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iO) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String c(int i) {
        String str = (String) fw.p0(i * 2, this.a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final Builder d() {
        Builder builder = new Builder();
        ArrayList arrayList = builder.a;
        arrayList.getClass();
        String[] strArr = this.a;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        arrayList.addAll(listAsList);
        return builder;
    }

    public final String e(int i) {
        String str = (String) fw.p0((i * 2) + 1, this.a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Headers) {
            return Arrays.equals(this.a, ((Headers) obj).a);
        }
        return false;
    }

    public final List f(String str) {
        str.getClass();
        int size = size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(c(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(e(i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        }
        return listUnmodifiableList == null ? lc3.a : listUnmodifiableList;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator<xl7> iterator() {
        int size = size();
        xl7[] xl7VarArr = new xl7[size];
        for (int i = 0; i < size; i++) {
            xl7VarArr[i] = new xl7(c(i), e(i));
        }
        return new n1(xl7VarArr);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strC = c(i);
            String strE = e(i);
            sb.append(strC);
            sb.append(": ");
            if (_UtilCommonKt.k(strC)) {
                strE = "██";
            }
            sb.append(strE);
            sb.append("\n");
        }
        return sb.toString();
    }
}
