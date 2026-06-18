package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class rhb implements yb4 {
    public final /* synthetic */ int a;

    public /* synthetic */ rhb(int i) {
        this.a = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj).intValue();
                ihb ihbVar = (ihb) obj2;
                ihbVar.getClass();
                return ihbVar.a;
            case 1:
                ((r43) obj).getClass();
                return heb.a;
            case 2:
                fxb fxbVar = (fxb) obj2;
                ((ms8) obj).getClass();
                fxbVar.getClass();
                String str = (String) fxbVar.e.getValue();
                String strD = fxbVar.d();
                owb owbVarE = fxbVar.e();
                Bundle bundle = null;
                if (owbVarE != null) {
                    Bundle bundle2 = new Bundle();
                    if (owbVarE.a.saveState(bundle2) != null) {
                        bundle = bundle2;
                    }
                }
                return gc1.Z(str, strD, bundle, Integer.valueOf((int) (fxbVar.j >> 32)), Integer.valueOf((int) (fxbVar.j & 4294967295L)));
            default:
                n7c n7cVar = (n7c) obj2;
                ((ms8) obj).getClass();
                n7cVar.getClass();
                return gc1.Z(Float.valueOf(n7cVar.g()), Float.valueOf(n7cVar.h()), Float.valueOf(n7cVar.f()));
        }
    }
}
