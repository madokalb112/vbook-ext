package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class kb1 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StringBuilder b;

    public /* synthetic */ kb1(int i, StringBuilder sb) {
        this.a = i;
        this.b = sb;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        StringBuilder sb = this.b;
        switch (i) {
            case 0:
                Byte b = (Byte) obj;
                byte bByteValue = b.byteValue();
                if (bByteValue == 32) {
                    sb.append("%20");
                } else if (lb1.a.contains(b) || lb1.c.contains(b)) {
                    sb.append((char) bByteValue);
                } else {
                    sb.append(lb1.g(bByteValue));
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                sb.append(str);
                sb.append("\n");
                break;
        }
        return hebVar;
    }
}
