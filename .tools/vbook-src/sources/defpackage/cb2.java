package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cb2 extends ra8 {
    public final /* synthetic */ int b;
    public final String c;
    public final /* synthetic */ b92 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb2(b92 b92Var, String str, bb2 bb2Var) {
        super(bb2Var);
        this.b = 1;
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }

    @Override // defpackage.ra8
    public final void a(v34 v34Var) {
        int i = this.b;
        b92 b92Var = this.d;
        switch (i) {
            case 0:
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbExtension"}, v34Var);
                break;
            case 1:
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbExtension"}, v34Var);
                break;
            case 2:
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbExtension"}, v34Var);
                break;
            case 3:
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbExtension"}, v34Var);
                break;
            default:
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbExtension"}, v34Var);
                break;
        }
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        int i = this.b;
        b92 b92Var = this.d;
        switch (i) {
            case 0:
                return ((qj) ((yf1) b92Var).a).E(1628020592, "SELECT icon\nFROM DbExtension\nWHERE id = ?\nLIMIT 1", kb4Var, 1, new i92(this, 22));
            case 1:
                return ((qj) ((yf1) b92Var).a).E(1129376456, "SELECT DbExtension.id, DbExtension.name, DbExtension.author, DbExtension.version, DbExtension.source, DbExtension.path, DbExtension.regex, DbExtension.icon, DbExtension.description, DbExtension.language, DbExtension.type, DbExtension.nsfw, DbExtension.development, DbExtension.draft, DbExtension.encrypt, DbExtension.scriptMetadata, DbExtension.settingMetadata, DbExtension.scriptData, DbExtension.settingData, DbExtension.translateData, DbExtension.pinedAt, DbExtension.lastUse, DbExtension.createAt, DbExtension.updateAt\nFROM DbExtension\nWHERE id = ?\nLIMIT 1", kb4Var, 1, new i92(this, 23));
            case 2:
                return ((qj) ((yf1) b92Var).a).E(1253800498, "SELECT settingData\nFROM DbExtension\nWHERE id = ?\nLIMIT 1", kb4Var, 1, new i92(this, 24));
            case 3:
                return ((qj) ((yf1) b92Var).a).E(-1444838985, "SELECT settingMetadata\nFROM DbExtension\nWHERE id = ?\nLIMIT 1", kb4Var, 1, new i92(this, 25));
            default:
                return ((qj) ((yf1) b92Var).a).E(623642672, "SELECT translateData\nFROM DbExtension\nWHERE id = ?\nLIMIT 1", kb4Var, 1, new i92(this, 26));
        }
    }

    @Override // defpackage.ra8
    public final void f(v34 v34Var) {
        int i = this.b;
        b92 b92Var = this.d;
        v34Var.getClass();
        switch (i) {
            case 0:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbExtension"}, v34Var);
                break;
            case 1:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbExtension"}, v34Var);
                break;
            case 2:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbExtension"}, v34Var);
                break;
            case 3:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbExtension"}, v34Var);
                break;
            default:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbExtension"}, v34Var);
                break;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbExtension.sq:getExtensionIcon";
            case 1:
                return "DbExtension.sq:get";
            case 2:
                return "DbExtension.sq:getSettingData";
            case 3:
                return "DbExtension.sq:getSettingMetadata";
            default:
                return "DbExtension.sq:getTranslateData";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb2(b92 b92Var, String str, kb4 kb4Var, int i) {
        super(kb4Var);
        this.b = i;
        this.d = b92Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb2(b92 b92Var, String str, sa2 sa2Var) {
        super(sa2Var);
        this.b = 0;
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb2(b92 b92Var, String str, bb2 bb2Var, byte b) {
        super(bb2Var);
        this.b = 2;
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }
}
