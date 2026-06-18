package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c5b extends o1a implements cc4 {
    public /* synthetic */ Boolean a;
    public /* synthetic */ String b;
    public /* synthetic */ boolean c;
    public /* synthetic */ String d;
    public /* synthetic */ String e;
    public final /* synthetic */ n5b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5b(n5b n5bVar, jt1 jt1Var) {
        super(6, jt1Var);
        this.f = n5bVar;
    }

    @Override // defpackage.cc4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        c5b c5bVar = new c5b(this.f, (jt1) obj6);
        c5bVar.a = (Boolean) obj;
        c5bVar.b = (String) obj2;
        c5bVar.c = zBooleanValue;
        c5bVar.d = (String) obj4;
        c5bVar.e = (String) obj5;
        heb hebVar = heb.a;
        c5bVar.invokeSuspend(hebVar);
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object next;
        Object obj3;
        Boolean bool = this.a;
        String str = this.b;
        boolean z = this.c;
        String str2 = this.d;
        String str3 = this.e;
        e11.e0(obj);
        n5b n5bVar = this.f;
        List list = n5bVar.v;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list) {
            if (((r5b) obj4).c) {
                arrayList.add(obj4);
            }
        }
        List list2 = n5bVar.v;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : list2) {
            if (((r5b) obj5).d) {
                arrayList2.add(obj5);
            }
        }
        fr9 fr9Var = n5bVar.d;
        if (fr9Var != null) {
            while (true) {
                Object value = fr9Var.getValue();
                fr9 fr9Var2 = fr9Var;
                u4b u4bVar = (u4b) value;
                boolean z2 = str.length() > 0;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                String str4 = (String) n5bVar.D.getValue();
                if (str4 == null) {
                    str4 = "";
                }
                Iterator it = n5bVar.w.iterator();
                while (true) {
                    obj2 = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((p5b) next).a.equals(str)) {
                        break;
                    }
                }
                p5b p5bVar = (p5b) next;
                int size = arrayList.size();
                n5b n5bVar2 = n5bVar;
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj3 = null;
                        break;
                    }
                    obj3 = arrayList.get(i);
                    int i2 = i + 1;
                    if (((r5b) obj3).a.equals(str2)) {
                        break;
                    }
                    i = i2;
                }
                r5b r5bVar = (r5b) obj3;
                int size2 = arrayList2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    Object obj6 = arrayList2.get(i3);
                    i3++;
                    int i4 = size2;
                    if (((r5b) obj6).a.equals(str3)) {
                        obj2 = obj6;
                        break;
                    }
                    size2 = i4;
                }
                r5b r5bVar2 = (r5b) obj2;
                ArrayList arrayList3 = arrayList2;
                Boolean bool2 = bool;
                if (fr9Var2.j(value, u4b.a(u4bVar, z2, false, z, zBooleanValue, str4, p5bVar, r5bVar, r5bVar2, 2))) {
                    break;
                }
                arrayList2 = arrayList3;
                fr9Var = fr9Var2;
                n5bVar = n5bVar2;
                bool = bool2;
            }
        }
        return heb.a;
    }
}
