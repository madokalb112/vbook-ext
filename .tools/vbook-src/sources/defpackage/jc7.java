package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.Headers;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jc7 implements ek4 {
    public final /* synthetic */ Headers c;

    public jc7(Headers headers) {
        this.c = headers;
    }

    @Override // defpackage.xv9
    public final Set b() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        Headers headers = this.c;
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String strC = headers.c(i);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strC.toLowerCase(locale);
            lowerCase.getClass();
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(headers.e(i));
        }
        return treeMap.entrySet();
    }

    @Override // defpackage.xv9
    public final boolean e() {
        return true;
    }

    @Override // defpackage.xv9
    public final List f(String str) {
        str.getClass();
        List listF = this.c.f(str);
        if (listF.isEmpty()) {
            return null;
        }
        return listF;
    }

    @Override // defpackage.xv9
    public final Set names() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        Headers headers = this.c;
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(headers.c(i));
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }
}
