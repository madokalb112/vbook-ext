package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uqa extends o1a implements yb4 {
    public ng8 a;
    public hra b;
    public Iterator c;
    public int d;
    public int e;
    public final /* synthetic */ hra f;
    public final /* synthetic */ yia s;
    public final /* synthetic */ long t;
    public final /* synthetic */ o9a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqa(hra hraVar, yia yiaVar, long j, o9a o9aVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.f = hraVar;
        this.s = yiaVar;
        this.t = j;
        this.u = o9aVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new uqa(this.f, this.s, this.t, this.u, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((uqa) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0073 -> B:18:0x0076). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
