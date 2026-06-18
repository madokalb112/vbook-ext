package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rna {
    public static final /* synthetic */ ni5[] m = {new qz6(rna.class, "isAllowNetwork", "isAllowNetwork()Z", 0), new qz6(rna.class, "isAllowContinueWhenExit", "isAllowContinueWhenExit()Z", 0), new qz6(rna.class, "isSkipFocusAudio", "isSkipFocusAudio()Z", 0), new qz6(rna.class, "isHeadsetButtonControl", "isHeadsetButtonControl()Z", 0), new qz6(rna.class, "isEnableBackgroundMusic", "isEnableBackgroundMusic()Z", 0), new qz6(rna.class, "backgroundMusic", "getBackgroundMusic()Ljava/lang/String;", 0), new qz6(rna.class, "backgroundMusicVolume", "getBackgroundMusicVolume()F", 0), new qz6(rna.class, "autoOffTime", "getAutoOffTime()J", 0), new qz6(rna.class, "isSaveOffTime", "isSaveOffTime()Z", 0), new qz6(rna.class, "isAlwaysExpandTts", "isAlwaysExpandTts()Z", 0), new qz6(rna.class, "tts", "getTts()Ljava/lang/String;", 0), new qz6(rna.class, "isInsertDefaultSkipWord", "isInsertDefaultSkipWord()Z", 0)};
    public final d6a a = new d6a(new nda(11));
    public final km0 b;
    public final km0 c;
    public final km0 d;
    public final km0 e;
    public final da7 f;
    public final c14 g;
    public final q56 h;
    public final km0 i;
    public final km0 j;
    public final da7 k;
    public final km0 l;

    public rna() {
        cx1.x(b(), "allow_network", true);
        this.b = cx1.x(b(), "allow_continue_when_exit", true);
        this.c = cx1.x(b(), "skip_focus_audio", false);
        this.d = cx1.x(b(), "headset_button_control", true);
        this.e = cx1.x(b(), "enable_background_music", false);
        this.f = cx1.t0(b(), "background_music", "");
        this.g = cx1.R(b(), "background_music_volume", 0.5f);
        this.h = cx1.g0(b(), "auto_off_time", 0L);
        this.i = cx1.x(b(), "save_off_time", false);
        this.j = cx1.x(b(), "always_expand_tts", true);
        this.k = cx1.t0(b(), "tts", "system");
        this.l = cx1.x(b(), "insert_default_skip_word", false);
    }

    public final String a(String str, String str2) {
        String strH;
        str.getClass();
        g18 g18VarB = b();
        String strM = j39.m("tts_keys_", str, "_", str2);
        a91 a91VarA = ug8.a(String.class);
        if (a91VarA.equals(ug8.a(Integer.TYPE))) {
            strH = (String) g18VarB.d(strM);
        } else if (a91VarA.equals(ug8.a(Long.TYPE))) {
            strH = (String) g18VarB.e(strM);
        } else if (a91VarA.equals(ug8.a(String.class))) {
            strH = g18VarB.h(strM);
        } else if (a91VarA.equals(ug8.a(Float.TYPE))) {
            strH = (String) g18VarB.c(strM);
        } else if (a91VarA.equals(ug8.a(Double.TYPE))) {
            strH = (String) g18VarB.b(strM);
        } else {
            if (!a91VarA.equals(ug8.a(Boolean.TYPE))) {
                gp.l("Invalid type!");
                return null;
            }
            strH = (String) g18VarB.a(strM);
        }
        return strH == null ? "" : strH;
    }

    public final g18 b() {
        return (g18) this.a.getValue();
    }

    public final String c() {
        return (String) this.k.c(m[10], this);
    }
}
