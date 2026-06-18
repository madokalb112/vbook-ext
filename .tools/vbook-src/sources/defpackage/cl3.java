package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cl3 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ cl3(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                arrayList.get(((Number) obj).intValue());
                break;
            case 1:
                arrayList.get(((Number) obj).intValue());
                break;
            case 2:
                arrayList.get(((Number) obj).intValue());
                break;
            case 3:
                arrayList.get(((Number) obj).intValue());
                break;
            case 4:
                arrayList.get(((Number) obj).intValue());
                break;
            case 5:
                arrayList.get(((Number) obj).intValue());
                break;
            case 6:
                on8 on8Var = (on8) obj;
                on8Var.getClass();
                arrayList.add(on8Var);
                break;
            default:
                on8 on8Var2 = (on8) obj;
                on8Var2.getClass();
                arrayList.add(on8Var2);
                break;
        }
        return hebVar;
    }
}
