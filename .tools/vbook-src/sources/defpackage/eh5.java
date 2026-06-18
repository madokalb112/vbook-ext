package defpackage;

import java.nio.channels.AsynchronousSocketChannel;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class eh5 extends o1a implements yb4 {
    public final /* synthetic */ ih5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh5(ih5 ih5Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = ih5Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new eh5(this.a, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        eh5 eh5Var = (eh5) create((vx1) obj, (jt1) obj2);
        heb hebVar = heb.a;
        eh5Var.invokeSuspend(hebVar);
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        e11.e0(obj);
        ih5 ih5Var = this.a;
        AsynchronousSocketChannel asynchronousSocketChannel = ih5Var.a;
        if (asynchronousSocketChannel != null) {
            asynchronousSocketChannel.close();
        }
        ih5Var.a = null;
        return heb.a;
    }
}
