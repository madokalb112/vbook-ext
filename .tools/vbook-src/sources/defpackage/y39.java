package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class y39 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ y39(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                return ((pi5) arrayList.get(0)).d();
            default:
                if (arrayList.isEmpty()) {
                    return lc3.a;
                }
                if (((CharSequence) fc1.x0(arrayList)).length() == 0 && arrayList.size() > 1) {
                    i2 = 1;
                }
                return arrayList.subList(i2, ((CharSequence) fc1.E0(arrayList)).length() == 0 ? arrayList.size() - 1 : arrayList.size());
        }
    }
}
