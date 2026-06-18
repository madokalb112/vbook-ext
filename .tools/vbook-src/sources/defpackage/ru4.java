package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ru4 extends bt7 {
    public static final uf4 g = new uf4("Before", 29);
    public static final uf4 h = new uf4("State", 29);
    public static final uf4 i = new uf4("After", 29);
    public static final uf4 j = new uf4("Before", 29);
    public static final uf4 k = new uf4("State", 29);
    public static final uf4 l = new uf4("Transform", 29);
    public static final uf4 m = new uf4("Render", 29);
    public static final uf4 n = new uf4("Send", 29);
    public static final uf4 o = new uf4("Receive", 29);
    public static final uf4 p = new uf4("Parse", 29);
    public static final uf4 q = new uf4("Transform", 29);
    public static final uf4 r = new uf4("State", 29);
    public static final uf4 s = new uf4("After", 29);
    public static final uf4 t = new uf4("Before", 29);
    public static final uf4 u = new uf4("State", 29);
    public static final uf4 v = new uf4("Monitoring", 29);
    public static final uf4 w = new uf4("Engine", 29);
    public static final uf4 x = new uf4("Receive", 29);
    public final /* synthetic */ int e;
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru4(int i2) {
        super(g, h, i);
        this.e = i2;
        switch (i2) {
            case 1:
                super(j, k, l, m, n);
                this.f = true;
                break;
            case 2:
                super(o, p, q, r, s);
                this.f = true;
                break;
            case 3:
                super(t, u, v, w, x);
                this.f = true;
                break;
            default:
                this.f = true;
                break;
        }
    }

    @Override // defpackage.bt7
    public final boolean d() {
        switch (this.e) {
        }
        return this.f;
    }
}
