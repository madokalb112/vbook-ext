package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uoa extends om8 implements yb4 {
    public int A;
    public float B;
    public float C;
    public float D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ i49 G;
    public final /* synthetic */ ma0 H;
    public final /* synthetic */ o39 I;
    public final /* synthetic */ fu1 J;
    public ux7 b;
    public ux7 c;
    public u1a d;
    public Object e;
    public Object f;
    public qg8 s;
    public ux7 t;
    public ux7 u;
    public boolean v;
    public long w;
    public long x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uoa(i49 i49Var, ma0 ma0Var, o39 o39Var, fu1 fu1Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.G = i49Var;
        this.H = ma0Var;
        this.I = o39Var;
        this.J = fu1Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        uoa uoaVar = new uoa(this.G, this.H, this.I, this.J, jt1Var);
        uoaVar.F = obj;
        return uoaVar;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((uoa) create((u1a) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x044a, code lost:
    
        if (r3 == r8) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x056f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0415  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0474 -> B:92:0x042e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x04b9 -> B:117:0x04bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x057b -> B:117:0x04bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x05ad -> B:119:0x04d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x063a -> B:159:0x0652). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x06aa -> B:170:0x06b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x06b5 -> B:119:0x04d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x06d9 -> B:171:0x06b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x0736 -> B:28:0x0248). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x021e -> B:80:0x03fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x02cf -> B:42:0x02d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0305 -> B:28:0x0248). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x038f -> B:69:0x0399). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x03f9 -> B:80:0x03fd). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 2092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uoa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
