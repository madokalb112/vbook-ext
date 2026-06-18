package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pt0 extends o1a implements yb4 {
    public final /* synthetic */ Long A;
    public pa7 a;
    public Object b;
    public h88 c;
    public Long d;
    public Object e;
    public byte[] f;
    public int s;
    public int t;
    public int u;
    public long v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ ut0 y;
    public final /* synthetic */ h88 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt0(ut0 ut0Var, h88 h88Var, Long l, jt1 jt1Var) {
        super(2, jt1Var);
        this.y = ut0Var;
        this.z = h88Var;
        this.A = l;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        pt0 pt0Var = new pt0(this.y, this.z, this.A, jt1Var);
        pt0Var.x = obj;
        return pt0Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((pt0) create((i3c) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00db A[Catch: all -> 0x0165, TryCatch #3 {all -> 0x0165, blocks: (B:33:0x00d5, B:35:0x00db, B:38:0x00fa, B:40:0x0102, B:56:0x016c, B:60:0x017b, B:31:0x00c5), top: B:75:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102 A[Catch: all -> 0x0165, TRY_LEAVE, TryCatch #3 {all -> 0x0165, blocks: (B:33:0x00d5, B:35:0x00db, B:38:0x00fa, B:40:0x0102, B:56:0x016c, B:60:0x017b, B:31:0x00c5), top: B:75:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016c A[Catch: all -> 0x0165, TRY_ENTER, TryCatch #3 {all -> 0x0165, blocks: (B:33:0x00d5, B:35:0x00db, B:38:0x00fa, B:40:0x0102, B:56:0x016c, B:60:0x017b, B:31:0x00c5), top: B:75:0x00c5 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0158 -> B:49:0x015d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0168 -> B:33:0x00d5). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
