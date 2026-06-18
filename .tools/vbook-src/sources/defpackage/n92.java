package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n92 extends yf1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n92(qj qjVar, int i) {
        super(qjVar);
        this.b = i;
    }

    public void I(qa2 qa2Var) {
        ((qj) ((yf1) this).a).q(-1413157652, "INSERT OR REPLACE INTO DbEmojiCategory (id, thumb, count, position)\nVALUES (?, ?, ?, ?)", new i92(qa2Var, 15));
        w(-1413157652, new q92(29));
    }

    public void J(pa2 pa2Var) {
        ((qj) ((yf1) this).a).q(-2138326534, "INSERT OR REPLACE INTO DbEmoji (id, category, url, lastUse)\nVALUES (?, ?, ?, ?)", new i92(pa2Var, 16));
        w(-2138326534, new sa2(6));
    }

    public void K() {
        ((qj) ((yf1) this).a).q(-711107012, "DELETE FROM DbDomain", (kb4) null);
        w(-711107012, new q92(15));
    }

    public void L(String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(-237541725, "DELETE FROM DbName\nWHERE bookId = ?", new e82(str, 15));
        w(-237541725, new sa2(28));
    }

    public void M(String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(266328203, "DELETE FROM DbExtensionLocalStorage\nWHERE extensionId = ?", new e82(str, 10));
        w(266328203, new sa2(12));
    }

    public void N(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((qj) ((yf1) this).a).q(-250440798, "DELETE FROM DbExtensionLocalStorage\nWHERE extensionId = ? AND key = ?", new p92(str, str2, 1));
        w(-250440798, new sa2(11));
    }

    public void O(String str) {
        str.getClass();
        ((qj) ((yf1) this).a).q(-1905429051, "DELETE FROM DbName\nWHERE word = ?", new e82(str, 13));
        w(-1905429051, new sa2(29));
    }

    public ra8 P() {
        switch (this.b) {
            case 1:
                t92 t92Var = t92.a;
                qj qjVar = (qj) ((yf1) this).a;
                q92 q92Var = new q92(3);
                qjVar.getClass();
                return new af9(486302806, new String[]{"DbCategory"}, qjVar, "DbCategory.sq", "getAll", "SELECT DbCategory.id, DbCategory.name, DbCategory.createAt\nFROM DbCategory\nORDER BY createAt", q92Var);
            case 2:
                ga2 ga2Var = ga2.a;
                qj qjVar2 = (qj) ((yf1) this).a;
                q92 q92Var2 = new q92(16);
                qjVar2.getClass();
                return new af9(-461012900, new String[]{"DbDomain"}, qjVar2, "DbDomain.sq", "getAll", "SELECT DbDomain.id, DbDomain.domain, DbDomain.replace, DbDomain.enabled, DbDomain.position, DbDomain.createAt, DbDomain.updateAt\nFROM DbDomain\nORDER BY position ASC", q92Var2);
            case 6:
                nb2 nb2Var = nb2.a;
                qj qjVar3 = (qj) ((yf1) this).a;
                sa2 sa2Var = new sa2(26);
                qjVar3.getClass();
                return new af9(-1808306124, new String[]{"DbExtensionSource"}, qjVar3, "DbExtensionSource.sq", "getAll", "SELECT DbExtensionSource.id, DbExtensionSource.path, DbExtensionSource.author, DbExtensionSource.description, DbExtensionSource.createAt\nFROM DbExtensionSource\nORDER BY createAt DESC", sa2Var);
            default:
                cc2 cc2Var = cc2.a;
                qj qjVar4 = (qj) ((yf1) this).a;
                pb2 pb2Var = new pb2(17);
                qjVar4.getClass();
                return new af9(-491902267, new String[]{"DbQtNameSkip"}, qjVar4, "DbQtNameSkip.sq", "getAll", "SELECT DbQtNameSkip.id, DbQtNameSkip.word, DbQtNameSkip.createAt, DbQtNameSkip.updateAt FROM DbQtNameSkip", pb2Var);
        }
    }

    public ra8 Q(String str) {
        str.getClass();
        sb2 sb2Var = sb2.a;
        return new qb2(this, str, new pb2(3));
    }

    public void R(o92 o92Var) {
        ((qj) ((yf1) this).a).q(551877796, "INSERT OR REPLACE INTO DbCategory (id, name, createAt)\nVALUES (?, ?, ?)", new i92(o92Var, 2));
        w(551877796, new q92(0));
    }

    public void S(fa2 fa2Var) {
        ((qj) ((yf1) this).a).q(-395437910, "INSERT OR REPLACE INTO DbDomain (id, domain, replace, enabled, position, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?, ?)", new i92(fa2Var, 11));
        w(-395437910, new q92(14));
    }

    public void T(mb2 mb2Var) {
        ((qj) ((yf1) this).a).q(-1742731134, "INSERT OR REPLACE INTO DbExtensionSource (id, path, author, description, createAt)\nVALUES (?, ?, ?, ?, ?)", new i92(mb2Var, 27));
        w(-1742731134, new sa2(23));
    }

    public void U(ob2 ob2Var) {
        ((qj) ((yf1) this).a).q(1931404657, "INSERT OR REPLACE INTO DbName (id, bookId, word, replace, ignoreCase, createAt)\nVALUES (?, ?, ?, ?, ?, ?)", new i92(ob2Var, 28));
        w(1931404657, new pb2(0));
    }

    public void V(lc2 lc2Var) {
        ((qj) ((yf1) this).a).q(708058342, "INSERT OR REPLACE INTO DbReadHistory (id, readTime, listenTime, createAt)\nVALUES (?, ?, ?, ?)", new rb2(lc2Var, 9));
        w(708058342, new pb2(25));
    }

    public void W(nc2 nc2Var) {
        ((qj) ((yf1) this).a).q(841997454, "INSERT OR REPLACE INTO DbSearch (key, createAt)\nVALUES (?, ?)", new rb2(nc2Var, 10));
        w(841997454, new pb2(26));
    }

    public void X(rc2 rc2Var) {
        ((qj) ((yf1) this).a).q(1942281253, "INSERT OR REPLACE INTO DbTTSWord (id, word, replace, ignoreCase, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?)", new rb2(rc2Var, 12));
        w(1942281253, new oc2(5));
    }

    public void Y(h92 h92Var) {
        ((qj) ((yf1) this).a).q(-105619198, "INSERT OR REPLACE INTO DbBrowserHistory (url, title, createAt)\nVALUES (?, ?, ?)", new f0(h92Var, 29));
        w(-105619198, new hu1(26));
    }

    public void Z(xa2 xa2Var) {
        ((qj) ((yf1) this).a).q(-2146593561, "INSERT OR REPLACE INTO DbExtensionLocalStorage (id, extensionId, key, content)\nVALUES (?, ?, ?, ?)", new i92(xa2Var, 19));
        w(-2146593561, new sa2(13));
    }

    public void a0(bc2 bc2Var) {
        ((qj) ((yf1) this).a).q(1756511421, "INSERT OR REPLACE INTO DbQtNameSkip (id, word, createAt, updateAt)\nVALUES (?, ?, ?, ?)", new rb2(bc2Var, 6));
        w(1756511421, new pb2(15));
    }
}
