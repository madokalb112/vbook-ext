package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m15 {
    public static final /* synthetic */ ni5[] k = {new qz6(m15.class, "scrollType", "getScrollType()I", 0), new qz6(m15.class, "scrollDirection", "getScrollDirection()I", 0), new qz6(m15.class, "autoScrollSpeed", "getAutoScrollSpeed()F", 0), new qz6(m15.class, "darkMode", "getDarkMode()I", 0), new qz6(m15.class, "screenOrientation", "getScreenOrientation()I", 0), new qz6(m15.class, "isShowCutout", "isShowCutout()Z", 0), new qz6(m15.class, "isOptimizePage", "isOptimizePage()Z", 0), new qz6(m15.class, "isDoublePage", "isDoublePage()Z", 0), new qz6(m15.class, "isShowReadingProgress", "isShowReadingProgress()Z", 0), new qz6(m15.class, "isEnableZoomDoubleTap", "isEnableZoomDoubleTap()Z", 0)};
    public final x95 a;
    public final x95 b;
    public final c14 c;
    public final x95 d;
    public final x95 e;
    public final km0 f;
    public final km0 g;
    public final km0 h;
    public final km0 i;
    public final km0 j;

    public m15() {
        g18 g18VarW = pu1.w("image_settings");
        this.a = new x95(g18VarW, "scroll_type", 0);
        this.b = new x95(g18VarW, "scroll_direction", 0);
        this.c = new c14(g18VarW, "auto_scroll_speed", 1.0f);
        this.d = new x95(g18VarW, "dark_mode", 0);
        this.e = new x95(g18VarW, "screen_orientation", 0);
        this.f = new km0(g18VarW, "show_cutout", false);
        this.g = new km0(g18VarW, "optimize_page", false);
        this.h = new km0(g18VarW, "double_page", false);
        this.i = new km0(g18VarW, "show_reading_progress", true);
        this.j = new km0(g18VarW, "double_tap_to_zoom", true);
    }
}
