package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ci4 implements bc4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ci4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bc4
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                int[] iArr = (int[]) obj2;
                pn2 pn2Var = (pn2) obj4;
                int[] iArr2 = (int[]) obj5;
                iArr.getClass();
                ((zm5) obj3).getClass();
                pn2Var.getClass();
                iArr2.getClass();
                ((nv) obj6).r(pn2Var, iIntValue, iArr, iArr2);
                break;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                int[] iArr3 = (int[]) obj2;
                zm5 zm5Var = (zm5) obj3;
                pn2 pn2Var2 = (pn2) obj4;
                int[] iArr4 = (int[]) obj5;
                iArr3.getClass();
                zm5Var.getClass();
                pn2Var2.getClass();
                iArr4.getClass();
                ((lv) obj6).e(pn2Var2, iIntValue2, iArr3, zm5Var, iArr4);
                break;
            case 2:
                p5a p5aVar = (p5a) obj6;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
                boolean zBooleanValue5 = ((Boolean) obj5).booleanValue();
                za1 za1VarA = vtb.a(p5aVar);
                aj2 aj2Var = rw2.a;
                p5aVar.g(za1VarA, nh2.c, new o5a(p5aVar, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, null));
                break;
            case 3:
                ehb ehbVar = (ehb) obj6;
                String str = (String) obj2;
                String str2 = (String) obj3;
                String str3 = (String) obj4;
                String str4 = (String) obj5;
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                za1 za1VarA2 = vtb.a(ehbVar);
                aj2 aj2Var2 = rw2.a;
                ehbVar.g(za1VarA2, nh2.c, new yl0(ehbVar, str2, str3, str4, str, (ky4) obj, (jt1) null, 10));
                break;
            default:
                e7c e7cVar = (e7c) obj6;
                float fFloatValue = ((Float) obj3).floatValue();
                float fFloatValue2 = ((Float) obj4).floatValue();
                int iIntValue3 = ((Integer) obj5).intValue();
                ah1.J(e7cVar.S0(), null, null, new b7c(e7cVar, iIntValue3, (eb7) obj2, fFloatValue, (eb7) obj, fFloatValue2, (jt1) null), 3);
                break;
        }
        return hebVar;
    }
}
