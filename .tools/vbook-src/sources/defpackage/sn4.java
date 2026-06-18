package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class sn4 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m55 b;

    public /* synthetic */ sn4(m55 m55Var, int i) {
        this.a = i;
        this.b = m55Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        m55 m55Var = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                m55Var.a(list);
                break;
            default:
                ((Boolean) obj).getClass();
                m55Var.a.setValue(Boolean.FALSE);
                m55Var.b.setValue(lc3.a);
                break;
        }
        return hebVar;
    }
}
