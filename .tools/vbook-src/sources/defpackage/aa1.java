package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class aa1 extends r91 {
    public final /* synthetic */ int b;
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa1(gv4 gv4Var, String str, int i) {
        super(gv4Var, str);
        this.b = i;
        gv4Var.getClass();
        str.getClass();
        switch (i) {
            case 1:
                super(gv4Var, str);
                this.c = "Unhandled redirect: " + gv4Var.p0().c().getMethod().a + ' ' + gv4Var.p0().c().getUrl() + ". Status: " + gv4Var.e() + ". Text: \"" + str + '\"';
                break;
            case 2:
                super(gv4Var, str);
                this.c = "Server error(" + gv4Var.p0().c().getMethod().a + ' ' + gv4Var.p0().c().getUrl() + ": " + gv4Var.e() + ". Text: \"" + str + '\"';
                break;
            default:
                this.c = "Client request(" + gv4Var.p0().c().getMethod().a + ' ' + gv4Var.p0().c().getUrl() + ") invalid: " + gv4Var.e() + ". Text: \"" + str + '\"';
                break;
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.b) {
        }
        return this.c;
    }
}
