package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z61 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z61(int i, e71 e71Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = i;
        this.d = e71Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        e71 e71Var = this.d;
        switch (i) {
            case 0:
                z61 z61Var = new z61(0, e71Var, jt1Var);
                z61Var.c = obj;
                return z61Var;
            default:
                z61 z61Var2 = new z61(1, e71Var, jt1Var);
                z61Var2.c = obj;
                return z61Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((z61) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object pm8Var;
        fv1 fv1Var;
        Long lN;
        Object objD;
        Object pm8Var2;
        Object value;
        Object value2;
        boolean z;
        Collection collectionValues;
        Object objB;
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        e71 e71Var = this.d;
        switch (i) {
            case 0:
                String str = e71Var.c;
                int i2 = this.b;
                try {
                } catch (Throwable th) {
                    pm8Var = new pm8(th);
                }
                if (i2 != 0) {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                        objD = obj;
                    }
                    break;
                } else {
                    e11.e0(obj);
                    if (!lc5.Q(str, "chat")) {
                        Long lN2 = iw9.N(str);
                        if (lN2 != null) {
                            long jLongValue = lN2.longValue();
                            z51 z51Var = e71Var.e;
                            this.c = null;
                            this.b = 1;
                            objD = ((p61) z51Var).d(jLongValue, this);
                            if (objD == xx1Var) {
                            }
                        }
                        break;
                    } else {
                        long jC = r95.a.k().c();
                        fv1Var = new fv1(0L, "group", "", null, "public", null, 0, 0, true, null, jC, jC);
                        e71Var.n(fv1Var);
                        if (!fv1Var.i && !lc5.Q(str, "chat") && (lN = iw9.N(str)) != null) {
                            long jLongValue2 = lN.longValue();
                            za1 za1VarA = vtb.a(e71Var);
                            aj2 aj2Var = rw2.a;
                            e71Var.g(za1VarA, nh2.c, new z(e71Var, jLongValue2, null));
                            break;
                        }
                    }
                }
                pm8Var = (fv1) objD;
                if (pm8Var instanceof pm8) {
                    pm8Var = null;
                }
                fv1Var = (fv1) pm8Var;
                if (fv1Var == null) {
                }
                e71Var.n(fv1Var);
                if (!fv1Var.i) {
                }
                break;
            default:
                fr9 fr9Var = e71Var.s;
                int i3 = this.b;
                try {
                    if (i3 == 0) {
                        e11.e0(obj);
                        e71Var.D = true;
                        aib aibVar = e71Var.d;
                        String str2 = e71Var.A;
                        int i4 = e71Var.B;
                        this.c = null;
                        this.b = 1;
                        objB = ((hib) aibVar).b(i4, 24, this, str2);
                        if (objB == xx1Var) {
                        }
                    } else if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                        objB = obj;
                    }
                    pm8Var2 = (List) objB;
                } catch (Throwable th2) {
                    pm8Var2 = new pm8(th2);
                }
                if (!(pm8Var2 instanceof pm8)) {
                    List list = (List) pm8Var2;
                    e71Var.C = list.size() == 24;
                    LinkedHashMap linkedHashMap = e71Var.E;
                    e71Var.B++;
                    Iterable iterable = (Iterable) e71Var.z.getValue();
                    ArrayList arrayList = new ArrayList(gc1.M(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((kv1) it.next()).a.a);
                    }
                    Set setE1 = fc1.e1(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (!setE1.contains(((sgb) obj2).a)) {
                            arrayList2.add(obj2);
                        }
                    }
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj3 = arrayList2.get(i5);
                        i5++;
                        sgb sgbVar = (sgb) obj3;
                        linkedHashMap.put(sgbVar.a, sgbVar);
                    }
                    if (fr9Var != null) {
                        do {
                            value2 = fr9Var.getValue();
                            z = e71Var.C;
                            collectionValues = linkedHashMap.values();
                            collectionValues.getClass();
                        } while (!fr9Var.j(value2, t61.a((t61) value2, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, false, z, fc1.Z0(collectionValues), null, null, 0, null, null, 2088763391)));
                    }
                }
                Throwable thA = qm8.a(pm8Var2);
                if (thA != null) {
                    thA.printStackTrace();
                    if (fr9Var != null) {
                        do {
                            value = fr9Var.getValue();
                        } while (!fr9Var.j(value, t61.a((t61) value, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, 0, null, null, 2139095039)));
                    }
                }
                e71Var.D = false;
                break;
        }
        return hebVar;
    }
}
