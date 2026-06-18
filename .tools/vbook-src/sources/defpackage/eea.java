package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class eea extends o1a implements zb4 {
    public /* synthetic */ boolean a;
    public /* synthetic */ List b;
    public final /* synthetic */ gea c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eea(gea geaVar, jt1 jt1Var) {
        super(3, jt1Var);
        this.c = geaVar;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        eea eeaVar = new eea(this.c, (jt1) obj3);
        eeaVar.a = zBooleanValue;
        eeaVar.b = (List) obj2;
        heb hebVar = heb.a;
        eeaVar.invokeSuspend(hebVar);
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        boolean z = this.a;
        List list = this.b;
        e11.e0(obj);
        gea geaVar = this.c;
        fr9 fr9Var = geaVar.e;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
                dea deaVar = (dea) value;
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (lc5.Q(((p17) obj2).b, z ? "general" : geaVar.c)) {
                        arrayList.add(obj2);
                    }
                }
                deaVar.getClass();
            } while (!fr9Var.j(value, new dea(arrayList, z)));
        }
        return heb.a;
    }
}
