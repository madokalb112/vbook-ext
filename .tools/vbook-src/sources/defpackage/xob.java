package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xob implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zob b;

    public /* synthetic */ xob(zob zobVar, int i) {
        this.a = i;
        this.b = zobVar;
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        int i = this.a;
        heb hebVar = heb.a;
        zob zobVar = this.b;
        switch (i) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                if (!((Boolean) zobVar.g.getValue()).booleanValue()) {
                    zobVar.b.i(jLongValue);
                }
                break;
            case 1:
                zobVar.c.i(((Number) obj).longValue());
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                zobVar.d.setValue(bool);
                break;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                zobVar.e.setValue(bool2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                zobVar.f.setValue(bool3);
                break;
        }
        return hebVar;
    }
}
