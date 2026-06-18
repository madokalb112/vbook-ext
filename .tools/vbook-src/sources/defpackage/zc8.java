package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zc8 {
    public static final /* synthetic */ ni5[] q = {new qz6(zc8.class, "currentReadingBook", "getCurrentReadingBook()Ljava/lang/String;", 0), new qz6(zc8.class, "isShowControlWhenStartRead", "isShowControlWhenStartRead()Z", 0), new qz6(zc8.class, "isAutoOpenBookLastRead", "isAutoOpenBookLastRead()Z", 0), new qz6(zc8.class, "isSaveReadHistory", "isSaveReadHistory()Z", 0), new qz6(zc8.class, "isAutoBrightness", "isAutoBrightness()Z", 0), new qz6(zc8.class, "brightness", "getBrightness()F", 0), new qz6(zc8.class, "isAlwaysScreenOn", "isAlwaysScreenOn()Z", 0), new qz6(zc8.class, "isTurnPageByVolume", "isTurnPageByVolume()Z", 0), new qz6(zc8.class, "isRevertTurnPageByVolume", "isRevertTurnPageByVolume()Z", 0), new qz6(zc8.class, "isTurnPageByKeyboard", "isTurnPageByKeyboard()Z", 0), new qz6(zc8.class, "turnPageByTouchOrientation", "getTurnPageByTouchOrientation()I", 0), new qz6(zc8.class, "turnPageTouchMode", "getTurnPageTouchMode()I", 0), new qz6(zc8.class, "isAnimationTurnPage", "isAnimationTurnPage()Z", 0), new qz6(zc8.class, "readingTimeAlert", "getReadingTimeAlert()J", 0), new qz6(zc8.class, "txtRules", "getTxtRules()Ljava/util/List;", 0)};
    public final d6a a = new d6a(new av6(17));
    public final da7 b = cx1.t0(a(), "current_reading_book", "");
    public final km0 c = cx1.x(a(), "show_control_when_start_read", false);
    public final km0 d = cx1.x(a(), "auto_open_book_last_read", true);
    public final km0 e = cx1.x(a(), "save_read_history", true);
    public final km0 f = cx1.x(a(), "auto_brightness", true);
    public final c14 g = cx1.R(a(), "brightness", 0.5f);
    public final km0 h = cx1.x(a(), "always_screen_on", true);
    public final km0 i = cx1.x(a(), "turn_page_volume", false);
    public final km0 j = cx1.x(a(), "revert_turn_page_volume", false);
    public final km0 k = cx1.x(a(), "turn_page_keyboard", true);
    public final x95 l = cx1.d0(a(), "turn_page_touch_orientation", 2);
    public final x95 m = cx1.d0(a(), "turn_page_touch_mode", 0);
    public final km0 n = cx1.x(a(), "animation_turn_page", true);
    public final q56 o = cx1.g0(a(), "reading_time_alert", 0);
    public final da7 p = cx1.j0(a(), "chapter_txt_rules", new wv(gab.Companion.serializer(), 0));

    public final g18 a() {
        return (g18) this.a.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.h.c(q[6], this)).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.c.c(q[1], this)).booleanValue();
    }
}
