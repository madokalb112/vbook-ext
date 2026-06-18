package defpackage;

import okhttp3.Request;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gc7 extends o1a implements yb4 {
    public Object a;
    public Object b;
    public br0 c;
    public int d;
    public final /* synthetic */ hc7 e;
    public final /* synthetic */ Request f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc7(hc7 hc7Var, Request request, jt1 jt1Var) {
        super(2, jt1Var);
        this.e = hc7Var;
        this.f = request;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new gc7(this.e, this.f, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((gc7) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r14 != r4) goto L24;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006c -> B:24:0x006f). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
