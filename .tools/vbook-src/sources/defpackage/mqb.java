package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mqb {
    public static final /* synthetic */ ni5[] t = {new qz6(mqb.class, "screenOrientation", "getScreenOrientation()I", 0), new qz6(mqb.class, "resizeMode", "getResizeMode()I", 0), new qz6(mqb.class, "preferredAudioLanguage", "getPreferredAudioLanguage()Ljava/lang/String;", 0), new qz6(mqb.class, "preferredSubtitleLanguage", "getPreferredSubtitleLanguage()Ljava/lang/String;", 0), new qz6(mqb.class, "isAutoPlay", "isAutoPlay()Z", 0), new qz6(mqb.class, "isAutoNextEpisode", "isAutoNextEpisode()Z", 0), new qz6(mqb.class, "isRememberLastPosition", "isRememberLastPosition()Z", 0), new qz6(mqb.class, "isAutoResumeLastPosition", "isAutoResumeLastPosition()Z", 0), new qz6(mqb.class, "isShowSubtitle", "isShowSubtitle()Z", 0), new qz6(mqb.class, "subtitleTextSize", "getSubtitleTextSize()F", 0), new qz6(mqb.class, "subtitleBackgroundOpacity", "getSubtitleBackgroundOpacity()F", 0), new qz6(mqb.class, "subtitleTextColor", "getSubtitleTextColor()J", 0), new qz6(mqb.class, "subtitleBackgroundColor", "getSubtitleBackgroundColor()J", 0), new qz6(mqb.class, "subtitleFontWeight", "getSubtitleFontWeight()I", 0), new qz6(mqb.class, "subtitlePadding", "getSubtitlePadding()F", 0), new qz6(mqb.class, "isMuted", "isMuted()Z", 0), new qz6(mqb.class, "playbackSpeed", "getPlaybackSpeed()F", 0), new qz6(mqb.class, "seekForwardSeconds", "getSeekForwardSeconds()I", 0), new qz6(mqb.class, "seekBackwardSeconds", "getSeekBackwardSeconds()I", 0), new qz6(mqb.class, "isAlwaysScreenOn", "isAlwaysScreenOn()Z", 0), new qz6(mqb.class, "isLockOrientationWhenFullscreen", "isLockOrientationWhenFullscreen()Z", 0), new qz6(mqb.class, "isContinuePlayInPip", "isContinuePlayInPip()Z", 0)};
    public final x95 a;
    public final x95 b;
    public final km0 c;
    public final km0 d;
    public final km0 e;
    public final km0 f;
    public final c14 g;
    public final c14 h;
    public final q56 i;
    public final q56 j;
    public final x95 k;
    public final c14 l;
    public final km0 m;
    public final c14 n;
    public final x95 o;
    public final x95 p;
    public final km0 q;
    public final km0 r;
    public final km0 s;

    public mqb() {
        g18 g18VarW = pu1.w("video_settings");
        this.a = new x95(g18VarW, "screen_orientation", 0);
        this.b = new x95(g18VarW, "resize_mode", 0);
        this.c = new km0(g18VarW, "auto_play", true);
        this.d = new km0(g18VarW, "auto_next_episode", true);
        this.e = new km0(g18VarW, "auto_resume_last_position", false);
        this.f = new km0(g18VarW, "show_subtitle", true);
        this.g = new c14(g18VarW, "subtitle_text_size", 1.0f);
        this.h = new c14(g18VarW, "subtitle_background_opacity", 0.35f);
        this.i = new q56(g18VarW, "subtitle_text_color", 4294967295L);
        this.j = new q56(g18VarW, "subtitle_background_color", 4278190080L);
        this.k = new x95(g18VarW, "subtitle_font_weight", 1);
        this.l = new c14(g18VarW, "subtitle_padding", 0.0f);
        this.m = new km0(g18VarW, "muted", false);
        this.n = new c14(g18VarW, "playback_speed", 1.0f);
        this.o = new x95(g18VarW, "seek_forward_seconds", 10);
        this.p = new x95(g18VarW, "seek_backward_seconds", 10);
        this.q = new km0(g18VarW, "always_screen_on", true);
        this.r = new km0(g18VarW, "lock_orientation_when_fullscreen", true);
        this.s = new km0(g18VarW, "continue_play_in_pip", true);
    }
}
