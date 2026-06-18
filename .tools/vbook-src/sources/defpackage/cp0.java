package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cp0 {
    public static final /* synthetic */ ni5[] d = {new qz6(cp0.class, "isAdBlockEnabled", "isAdBlockEnabled()Z", 0), new qz6(cp0.class, "isDesktopModeEnabled", "isDesktopModeEnabled()Z", 0), new qz6(cp0.class, "searchEngine", "getSearchEngine()Ljava/lang/String;", 0)};
    public final km0 a;
    public final km0 b;
    public final da7 c;

    public cp0() {
        g18 g18VarW = pu1.w("browser_settings");
        this.a = new km0(g18VarW, "ad_block_enabled", true);
        this.b = new km0(g18VarW, "desktop_mode_enabled", false);
        this.c = new da7(g18VarW, "search_engine", "google");
    }

    public final boolean a() {
        return ((Boolean) this.b.c(d[1], this)).booleanValue();
    }
}
