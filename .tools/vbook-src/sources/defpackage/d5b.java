package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d5b extends o1a implements bc4 {
    public /* synthetic */ boolean a;
    public /* synthetic */ List b;
    public /* synthetic */ Map c;
    public /* synthetic */ Map d;
    public final /* synthetic */ n5b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5b(n5b n5bVar, jt1 jt1Var) {
        super(5, jt1Var);
        this.e = n5bVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        List list = this.b;
        Map map = this.c;
        Map map2 = this.d;
        e11.e0(obj);
        this.e.w = list;
        if (!z) {
            return "";
        }
        String str = (String) map.get("engine_id");
        if (str == null) {
            str = "";
        }
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (str.equals(((p5b) it.next()).a)) {
                    break;
                }
            }
            str = "";
        } else {
            str = "";
        }
        if (str.length() == 0) {
            String str2 = (String) map2.get("engine_id");
            String str3 = str2 != null ? str2 : "";
            if (list == null || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (str3.equals(((p5b) it2.next()).a)) {
                        str = str3;
                        break;
                    }
                }
            }
        }
        return str.length() == 0 ? ((p5b) fc1.x0(list)).a : str;
    }

    @Override // defpackage.bc4
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d5b d5bVar = new d5b(this.e, (jt1) obj5);
        d5bVar.a = zBooleanValue;
        d5bVar.b = (List) obj2;
        d5bVar.c = (Map) obj3;
        d5bVar.d = (Map) obj4;
        return d5bVar.invokeSuspend(heb.a);
    }
}
