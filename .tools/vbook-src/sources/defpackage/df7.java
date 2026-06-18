package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class df7 extends kc4 implements zb4 {
    public static final df7 a = new df7(3, ef7.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        ef7 ef7Var = (ef7) obj;
        g09 g09Var = (g09) obj2;
        long j = ef7Var.a;
        heb hebVar = heb.a;
        if (j <= 0) {
            g09Var.e = hebVar;
            return hebVar;
        }
        Runnable vc6Var = new vc6(6, g09Var, ef7Var);
        g09Var.getClass();
        jx1 jx1Var = g09Var.a;
        g09Var.c = tw1.Q(jx1Var).p(j, vc6Var, jx1Var);
        return hebVar;
    }
}
