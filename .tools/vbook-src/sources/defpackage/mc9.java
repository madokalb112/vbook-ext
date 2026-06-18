package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class mc9 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mb9 b;

    public /* synthetic */ mc9(mb9 mb9Var, int i) {
        this.a = i;
        this.b = mb9Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                return ky0.p(this.b.j.get(iIntValue), "often_read_list1_");
            case 1:
                return ky0.p(this.b.g.get(iIntValue), "recent_list1_");
            case 2:
                return ky0.p(this.b.i.get(iIntValue), "last_update_list1_");
            case 3:
                return ky0.p(this.b.i.get(iIntValue), "last_update_grid2_");
            case 4:
                return ky0.p(this.b.j.get(iIntValue), "often_read_grid2_");
            case 5:
                return ky0.p(this.b.j.get(iIntValue), "often_read_list2_");
            case 6:
                return ky0.p(this.b.g.get(iIntValue), "recent_list2_");
            case 7:
                return ky0.p(this.b.i.get(iIntValue), "last_update_list2_");
            case 8:
                return ky0.r("last_update_grid1_", ((ob9) this.b.i.get(iIntValue)).a);
            default:
                return ky0.r("often_read_grid1_", ((ob9) this.b.j.get(iIntValue)).a);
        }
    }
}
