package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zia {
    public static final /* synthetic */ ni5[] A = {new qz6(zia.class, "scrollType", "getScrollType()I", 0), new qz6(zia.class, "isShowReadingProgress", "isShowReadingProgress()Z", 0), new qz6(zia.class, "isEnableZoomDoubleTap", "isEnableZoomDoubleTap()Z", 0), new qz6(zia.class, "isEyeProtect", "isEyeProtect()Z", 0), new qz6(zia.class, "screenOrientation", "getScreenOrientation()I", 0), new qz6(zia.class, "twoPageLayout", "getTwoPageLayout()I", 0), new qz6(zia.class, "autoScrollSpeed", "getAutoScrollSpeed()F", 0), new qz6(zia.class, "themeColorId", "getThemeColorId()Ljava/lang/String;", 0), new qz6(zia.class, "customThemes", "getCustomThemes()Ljava/lang/String;", 0), new qz6(zia.class, "textColor", "getTextColor()Ljava/lang/String;", 0), new qz6(zia.class, "backgroundColor", "getBackgroundColor()Ljava/lang/String;", 0), new qz6(zia.class, "backgroundImagePath", "getBackgroundImagePath()Ljava/lang/String;", 0), new qz6(zia.class, "darkMode", "getDarkMode()Z", 0), new qz6(zia.class, "fontFamily", "getFontFamily()Ljava/lang/String;", 0), new qz6(zia.class, "fontSize", "getFontSize()F", 0), new qz6(zia.class, "textIndent", "getTextIndent()F", 0), new qz6(zia.class, "lineSpacing", "getLineSpacing()F", 0), new qz6(zia.class, "paragraphSpacing", "getParagraphSpacing()F", 0), new qz6(zia.class, "letterSpacing", "getLetterSpacing()F", 0), new qz6(zia.class, "textAlign", "getTextAlign()I", 0), new qz6(zia.class, "leftMargin", "getLeftMargin()I", 0), new qz6(zia.class, "rightMargin", "getRightMargin()I", 0), new qz6(zia.class, "topMargin", "getTopMargin()I", 0), new qz6(zia.class, "bottomMargin", "getBottomMargin()I", 0), new qz6(zia.class, "isShowContextOneLine", "isShowContextOneLine()Z", 0), new qz6(zia.class, "isShowContextHighlight", "isShowContextHighlight()Z", 0), new qz6(zia.class, "contextMenu", "getContextMenu()Ljava/util/List;", 0), new qz6(zia.class, "textLookup", "getTextLookup()Ljava/util/List;", 0)};
    public final x95 a;
    public final km0 b;
    public final x95 c;
    public final x95 d;
    public final c14 e;
    public final da7 f;
    public final da7 g;
    public final da7 h;
    public final da7 i;
    public final da7 j;
    public final km0 k;
    public final da7 l;
    public final c14 m;
    public final c14 n;
    public final c14 o;
    public final c14 p;
    public final c14 q;
    public final x95 r;
    public final x95 s;
    public final x95 t;
    public final x95 u;
    public final x95 v;
    public final km0 w;
    public final km0 x;
    public final da7 y;
    public final da7 z;

    public zia() {
        g18 g18VarW = pu1.w("text_settings");
        this.a = new x95(g18VarW, "scroll_type", 0);
        this.b = new km0(g18VarW, "is_eye_protect", false);
        this.c = new x95(g18VarW, "screen_orientation", 0);
        this.d = new x95(g18VarW, "two_page_layout", 0);
        this.e = new c14(g18VarW, "auto_scroll_speed", 1.0f);
        this.f = new da7(g18VarW, "theme_id", "");
        this.g = new da7(g18VarW, "theme", "[]");
        this.h = new da7(g18VarW, "text_color", "");
        this.i = new da7(g18VarW, "background_color", "");
        this.j = new da7(g18VarW, "background_image_path", "");
        this.k = new km0(g18VarW, "dark_mode", false);
        this.l = new da7(g18VarW, "font_family", "font/Literata.otf");
        this.m = new c14(g18VarW, "font_size", 1.25f);
        this.n = new c14(g18VarW, "text_indent", 1.5f);
        this.o = new c14(g18VarW, "line_spacing", 1.1f);
        this.p = new c14(g18VarW, "paragraph_spacing", 0.5f);
        this.q = new c14(g18VarW, "letter_spacing", 0.0f);
        this.r = new x95(g18VarW, "text_align", 3);
        this.s = new x95(g18VarW, "left_margin", 16);
        this.t = new x95(g18VarW, "right_margin", 16);
        this.u = new x95(g18VarW, "top_margin", 16);
        this.v = new x95(g18VarW, "bottom_margin", 16);
        this.w = new km0(g18VarW, "show_context_one_line", false);
        this.x = new km0(g18VarW, "show_context_highlight", true);
        this.y = cx1.j0(g18VarW, "context_menu", new wv(ns1.Companion.serializer(), 0));
        this.z = cx1.j0(g18VarW, "text_lookup", new wv(bia.Companion.serializer(), 0));
    }
}
