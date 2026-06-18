package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x78 {
    public static final /* synthetic */ ni5[] q = {new qz6(x78.class, "phienAm", "getPhienAm()Lcom/reader/data/translate/engine/qt/model/QtDicDto;", 0), new qz6(x78.class, "vietPhrase", "getVietPhrase()Lcom/reader/data/translate/engine/qt/model/QtDicDto;", 0), new qz6(x78.class, "name", "getName()Lcom/reader/data/translate/engine/qt/model/QtDicDto;", 0), new qz6(x78.class, "pronouns", "getPronouns()Lcom/reader/data/translate/engine/qt/model/QtDicDto;", 0), new qz6(x78.class, "luatNhan", "getLuatNhan()Lcom/reader/data/translate/engine/qt/model/QtDicDto;", 0), new qz6(x78.class, "maxPhraseSize", "getMaxPhraseSize()I", 0), new qz6(x78.class, "nameVietPhrasePriority", "getNameVietPhrasePriority()I", 0), new qz6(x78.class, "personalGeneralPriority", "getPersonalGeneralPriority()I", 0), new qz6(x78.class, "vietPhrasePriority", "getVietPhrasePriority()I", 0), new qz6(x78.class, "luatNhanMode", "getLuatNhanMode()I", 0), new qz6(x78.class, "splitMode", "getSplitMode()I", 0), new qz6(x78.class, "isConvertToSimplified", "isConvertToSimplified()Z", 0), new qz6(x78.class, "isNameSavePriority", "isNameSavePriority()Z", 0), new qz6(x78.class, "isPrivSavePriority", "isPrivSavePriority()Z", 0), new qz6(x78.class, "isDialogueItalicized", "isDialogueItalicized()Z", 0), new qz6(x78.class, "translateLockup", "getTranslateLockup()Ljava/util/List;", 0)};
    public final da7 a;
    public final da7 b;
    public final da7 c;
    public final da7 d;
    public final da7 e;
    public final x95 f;
    public final x95 g;
    public final x95 h;
    public final x95 i;
    public final x95 j;
    public final x95 k;
    public final km0 l;
    public final km0 m;
    public final km0 n;
    public final km0 o;
    public final da7 p;

    public x78() {
        g18 g18VarW = pu1.w("qt_settings");
        l78 l78Var = m78.Companion;
        this.a = cx1.j0(g18VarW, "phien_am", l78Var.serializer());
        this.b = cx1.j0(g18VarW, "vietphrase", l78Var.serializer());
        this.c = cx1.j0(g18VarW, "name", l78Var.serializer());
        this.d = cx1.j0(g18VarW, "pronouns", l78Var.serializer());
        this.e = cx1.j0(g18VarW, "luat_nhan", l78Var.serializer());
        this.f = new x95(g18VarW, "max_phrase_size", 12);
        this.g = new x95(g18VarW, "name_vietphrase_priority", 0);
        this.h = new x95(g18VarW, "personal_general_priority", 0);
        this.i = new x95(g18VarW, "vietphrase_priority", 1);
        this.j = new x95(g18VarW, "luat_nhan_mode", 0);
        this.k = new x95(g18VarW, "split_mode", 1);
        this.l = new km0(g18VarW, "convert_simplified", true);
        this.m = new km0(g18VarW, "name_save_priority", true);
        this.n = new km0(g18VarW, "priv_save_priority", true);
        this.o = new km0(g18VarW, "dialogue_italicized", true);
        this.p = cx1.j0(g18VarW, "translate_lockup", new wv(r78.Companion.serializer(), 0));
    }

    public final m78 a() {
        return (m78) this.e.c(q[4], this);
    }

    public final int b() {
        return ((Number) this.j.c(q[9], this)).intValue();
    }

    public final int c() {
        return ((Number) this.f.c(q[5], this)).intValue();
    }

    public final m78 d() {
        return (m78) this.c.c(q[2], this);
    }

    public final int e() {
        return ((Number) this.g.c(q[6], this)).intValue();
    }

    public final int f() {
        return ((Number) this.h.c(q[7], this)).intValue();
    }

    public final m78 g() {
        return (m78) this.a.c(q[0], this);
    }

    public final m78 h() {
        return (m78) this.d.c(q[3], this);
    }

    public final int i() {
        return ((Number) this.k.c(q[10], this)).intValue();
    }

    public final m78 j() {
        return (m78) this.b.c(q[1], this);
    }

    public final int k() {
        return ((Number) this.i.c(q[8], this)).intValue();
    }

    public final boolean l() {
        return ((Boolean) this.l.c(q[11], this)).booleanValue();
    }

    public final void m(m78 m78Var) {
        this.e.e(q[4], m78Var);
    }

    public final void n(m78 m78Var) {
        this.c.e(q[2], m78Var);
    }

    public final void o(m78 m78Var) {
        this.a.e(q[0], m78Var);
    }

    public final void p(m78 m78Var) {
        this.d.e(q[3], m78Var);
    }

    public final void q(m78 m78Var) {
        this.b.e(q[1], m78Var);
    }
}
