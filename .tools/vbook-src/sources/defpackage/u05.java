package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u05 extends rl5 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u05(String str, int i) {
        super(1);
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        String str = this.b;
        switch (i) {
            case 0:
                ((v19) obj).a.put(i29.a, gc1.Y(str));
                break;
            default:
                l29.c((n29) obj, str);
                break;
        }
        return hebVar;
    }
}
