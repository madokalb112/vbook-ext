package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qs0 extends wi2 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qs0(int i, int i2) {
        super(i);
        this.f = i2;
    }

    @Override // defpackage.wi2
    public Object p(Object obj) {
        int i = 0;
        switch (this.f) {
            case 2:
                hk4 hk4Var = (hk4) obj;
                ArrayList arrayList = hk4Var.a;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    eu4.a.C0((int[]) obj2);
                }
                arrayList.clear();
                return hk4Var;
            case 3:
                int[] iArr = (int[]) obj;
                fw.e0(-1, 0, 6, iArr);
                return iArr;
            default:
                return obj;
        }
    }

    @Override // defpackage.wi2
    public final Object q() {
        switch (this.f) {
            case 0:
                return new byte[4096];
            case 1:
                return new char[2048];
            case 2:
                hk4 hk4Var = new hk4();
                hk4Var.a = new ArrayList();
                return hk4Var;
            default:
                int[] iArr = new int[768];
                for (int i = 0; i < 768; i++) {
                    iArr[i] = -1;
                }
                return iArr;
        }
    }
}
