package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class if4 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ if4(Set set, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = set;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Set set = this.c;
        switch (i) {
            case 0:
                if4 if4Var = new if4(set, jt1Var, 0);
                if4Var.b = obj;
                return if4Var;
            default:
                if4 if4Var2 = new if4(set, jt1Var, 1);
                if4Var2.b = obj;
                return if4Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        pz6 pz6Var = (pz6) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((if4) create(pz6Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v3, types: [pz6] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.Collection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.Set] */
    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        ?? linkedHashSet;
        int i = this.a;
        Set set = this.c;
        int i2 = 0;
        z = false;
        boolean z = false;
        switch (i) {
            case 0:
                e11.e0(obj);
                pz6 pz6Var = (pz6) this.b;
                Set set2 = (Set) pz6Var.c(jf4.g);
                if (set2 == null) {
                    return pz6Var;
                }
                Set set3 = set2;
                ?? arrayList = new ArrayList();
                for (Object obj2 : set3) {
                    if (!set.contains((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return pz6Var;
                }
                ?? G = pz6Var.g();
                e18 e18Var = jf4.g;
                if (arrayList.isEmpty()) {
                    linkedHashSet = fc1.e1(set3);
                } else if (arrayList instanceof Set) {
                    linkedHashSet = new LinkedHashSet();
                    for (Object obj3 : set3) {
                        if (!((Set) arrayList).contains(obj3)) {
                            linkedHashSet.add(obj3);
                        }
                    }
                } else {
                    ?? linkedHashSet2 = new LinkedHashSet(set2);
                    linkedHashSet2.removeAll(arrayList);
                    linkedHashSet = linkedHashSet2;
                }
                G.e(e18Var, linkedHashSet);
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    jf4.d.getClass();
                    G.d(new e18("provider:" + ((String) obj4)));
                }
                return G.h();
            default:
                e11.e0(obj);
                Set setKeySet = ((pz6) this.b).a().keySet();
                ArrayList arrayList2 = new ArrayList(gc1.M(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((e18) it.next()).a);
                }
                if (set == la9.a) {
                    z = true;
                } else {
                    Set set4 = set;
                    if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                        Iterator it2 = set4.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList2.contains((String) it2.next())) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
