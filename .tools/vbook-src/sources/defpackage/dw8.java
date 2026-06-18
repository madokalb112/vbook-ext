package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class dw8 extends p6 implements kb4 {
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dw8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.t = i3;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.t;
        heb hebVar = heb.a;
        Object obj2 = this.a;
        switch (i) {
            case 0:
                ((g07) obj2).b((fw8) obj);
                return hebVar;
            default:
                Object objC = ((ct7) obj2).c((jt1) obj);
                return objC == xx1.a ? objC : hebVar;
        }
    }
}
