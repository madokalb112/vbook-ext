package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r90 implements ib4 {
    public static final r90 b = new r90(0);
    public static final r90 c = new r90(1);
    public static final r90 d = new r90(2);
    public static final r90 e = new r90(3);
    public static final r90 f = new r90(4);
    public final /* synthetic */ int a;

    public /* synthetic */ r90(int i) {
        this.a = i;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new lc1(ah1.j(1308617531));
            case 1:
                return new lc1(lc1.b);
            case 2:
                return null;
            case 3:
                throw new IllegalStateException("DynamicMaterialTheme not initialized");
            case 4:
                return "There is more input to consume";
            case 5:
                nc1 nc1Var = fu6.B;
                if (nc1Var == null) {
                    gp.j("KoinApplication has not been started");
                    return null;
                }
                ev8 ev8Var = (ev8) ((s16) nc1Var.d).e;
                a91 a91VarA = ug8.a(b15.class);
                ev8Var.getClass();
                return ev8Var.d(a91VarA, null);
            case 6:
                nc1 nc1Var2 = fu6.B;
                if (nc1Var2 == null) {
                    gp.j("KoinApplication has not been started");
                    return null;
                }
                ev8 ev8Var2 = (ev8) ((s16) nc1Var2.d).e;
                a91 a91VarA2 = ug8.a(zl0.class);
                ev8Var2.getClass();
                return ev8Var2.d(a91VarA2, null);
            case 7:
                nc1 nc1Var3 = fu6.B;
                if (nc1Var3 == null) {
                    gp.j("KoinApplication has not been started");
                    return null;
                }
                ev8 ev8Var3 = (ev8) ((s16) nc1Var3.d).e;
                a91 a91VarA3 = ug8.a(f4b.class);
                ev8Var3.getClass();
                return ev8Var3.d(a91VarA3, null);
            case 8:
                return new Object[6];
            default:
                return new Object[5];
        }
    }
}
