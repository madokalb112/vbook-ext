package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j92 extends ra8 {
    public final /* synthetic */ int b = 0;
    public final long c;
    public final /* synthetic */ yf1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j92(n92 n92Var, hu1 hu1Var) {
        super(hu1Var);
        this.d = n92Var;
        this.c = 10L;
    }

    @Override // defpackage.ra8
    public final void a(v34 v34Var) {
        int i = this.b;
        yf1 yf1Var = this.d;
        switch (i) {
            case 0:
                ((qj) ((yf1) ((n92) yf1Var)).a).p(new String[]{"DbBrowserHistory"}, v34Var);
                break;
            default:
                ((qj) ((yf1) ((n92) yf1Var)).a).p(new String[]{"DbEmoji"}, v34Var);
                break;
        }
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        int i = this.b;
        yf1 yf1Var = this.d;
        switch (i) {
            case 0:
                return ((qj) ((yf1) ((n92) yf1Var)).a).E(-2137425833, "SELECT DbBrowserHistory.url, DbBrowserHistory.title, DbBrowserHistory.createAt FROM DbBrowserHistory\nORDER BY createAt DESC\nLIMIT ?", kb4Var, 1, new i92(this, 1));
            default:
                return ((qj) ((yf1) ((n92) yf1Var)).a).E(803881866, "SELECT DbEmoji.id, DbEmoji.category, DbEmoji.url, DbEmoji.lastUse\nFROM DbEmoji\nWHERE lastUse > 0\nORDER BY lastUse DESC\nLIMIT ?", kb4Var, 1, new i92(this, 18));
        }
    }

    @Override // defpackage.ra8
    public final void f(v34 v34Var) {
        int i = this.b;
        yf1 yf1Var = this.d;
        v34Var.getClass();
        switch (i) {
            case 0:
                ((qj) ((yf1) ((n92) yf1Var)).a).R(new String[]{"DbBrowserHistory"}, v34Var);
                break;
            default:
                ((qj) ((yf1) ((n92) yf1Var)).a).R(new String[]{"DbEmoji"}, v34Var);
                break;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbBrowserHistory.sq:getHistory";
            default:
                return "DbEmoji.sq:getRecentEmoji";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j92(n92 n92Var, sa2 sa2Var) {
        super(sa2Var);
        this.d = n92Var;
        this.c = 30L;
    }
}
