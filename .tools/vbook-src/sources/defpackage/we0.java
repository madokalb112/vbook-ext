package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class we0 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wha b;

    public /* synthetic */ we0(wha whaVar, int i) {
        this.a = i;
        this.b = whaVar;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        pha phaVar;
        int i = this.a;
        int i2 = 2;
        wha whaVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(whaVar != null ? ((Boolean) new we0(whaVar, i2).invoke()).booleanValue() : false);
            case 1:
                return Boolean.valueOf(whaVar != null ? ((Boolean) new we0(whaVar, i2).invoke()).booleanValue() : false);
            default:
                bp bpVar = whaVar.b;
                qha qhaVar = (qha) whaVar.a.getValue();
                return Boolean.valueOf(lc5.Q(bpVar, (qhaVar == null || (phaVar = qhaVar.a) == null) ? null : phaVar.a));
        }
    }
}
