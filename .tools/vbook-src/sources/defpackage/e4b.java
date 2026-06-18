package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e4b {
    public static final /* synthetic */ ni5[] f = {new qz6(e4b.class, "isAutoTranslate", "isAutoTranslate()Z", 0), new qz6(e4b.class, "autoDetectLanguageMode", "getAutoDetectLanguageMode()I", 0), new qz6(e4b.class, "isShowRaw", "isShowRaw()Z", 0), new qz6(e4b.class, "engineId", "getEngineId()Ljava/lang/String;", 0)};
    public final g18 a;
    public final km0 b;
    public final x95 c;
    public final km0 d;
    public final da7 e;

    public e4b() {
        g18 g18VarW = pu1.w("translate_settings");
        this.a = g18VarW;
        this.b = new km0(g18VarW, "auto_translate", false);
        this.c = new x95(g18VarW, "auto_detect_language_mode", 1);
        this.d = new km0(g18VarW, "show_raw", true);
        this.e = new da7(g18VarW, "engine_id", "raw");
    }

    public final String a() {
        return (String) this.e.c(f[3], this);
    }
}
