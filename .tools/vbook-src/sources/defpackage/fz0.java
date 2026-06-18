package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class fz0 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ fz0(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.ib4
    public final Object invoke() throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        List list = this.b;
        switch (i) {
            case 0:
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
            case 1:
                Object obj2 = list.get(2);
                obj2.getClass();
                return (Integer) obj2;
            case 2:
                Object obj3 = list.get(2);
                obj3.getClass();
                return (Integer) obj3;
            case 3:
                return fc1.D0(this.b, " ", null, null, new gq2(1), 30);
            case 4:
                return fc1.D0(this.b, " ", null, null, new gq2(3), 30);
            case 5:
                return list;
            case 6:
                if (list != null && (!(list instanceof fi5) || (list instanceof hi5))) {
                    fc1.M0(list);
                }
                return hebVar;
            case 7:
                ah1.S(hc3.a, new pc(list, null, 11));
                return hebVar;
            case 8:
                return ((pi5) list.get(0)).d();
            case 9:
                return ((pi5) list.get(0)).d();
            case 10:
                return Integer.valueOf(list.size());
            case 11:
                return fc1.D0(fc1.S0(list, 5), " ", null, null, new qc9(22), 30);
            default:
                return Integer.valueOf(list.size());
        }
    }
}
