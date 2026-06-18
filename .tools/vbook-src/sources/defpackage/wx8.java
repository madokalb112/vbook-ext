package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wx8 extends o1a implements kb4 {
    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        return new wx8(1, jt1Var);
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        wx8 wx8Var = (wx8) create((jt1) obj);
        heb hebVar = heb.a;
        wx8Var.invokeSuspend(hebVar);
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        e11.e0(obj);
        return heb.a;
    }
}
