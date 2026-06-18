package defpackage;

import java.nio.channels.AsynchronousFileChannel;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qz extends o1a implements kb4 {
    public final /* synthetic */ AsynchronousFileChannel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz(AsynchronousFileChannel asynchronousFileChannel, jt1 jt1Var) {
        super(1, jt1Var);
        this.a = asynchronousFileChannel;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        return new qz(this.a, jt1Var);
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        return ((qz) create((jt1) obj)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        e11.e0(obj);
        return new Long(this.a.size());
    }
}
