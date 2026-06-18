package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lo3 extends o1a implements yb4 {
    public HashMap a;
    public Object b;
    public Object c;
    public gnb d;
    public te5 e;
    public String f;
    public HashMap s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ HashMap w;
    public final /* synthetic */ HashMap x;
    public final /* synthetic */ HashMap y;
    public final /* synthetic */ HashMap z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo3(HashMap map, HashMap map2, HashMap map3, HashMap map4, jt1 jt1Var) {
        super(2, jt1Var);
        this.w = map;
        this.x = map2;
        this.y = map3;
        this.z = map4;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        lo3 lo3Var = new lo3(this.w, this.x, this.y, this.z, jt1Var);
        lo3Var.v = obj;
        return lo3Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((lo3) create((gnb) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x021f, code lost:
    
        if (r14 == r6) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0 A[Catch: all -> 0x00e4, TRY_ENTER, TryCatch #0 {all -> 0x00e4, blocks: (B:11:0x0065, B:23:0x00b5, B:20:0x00a0), top: B:78:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0262  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x025a -> B:74:0x025c). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
