package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class r91 extends IllegalStateException {
    public final /* synthetic */ int a;

    public r91(gv4 gv4Var, String str) {
        this.a = 4;
        gv4Var.getClass();
        str.getClass();
        StringBuilder sb = new StringBuilder("Bad response: ");
        sb.append(gv4Var);
        sb.append(". Text: \"");
        super(xv5.s(sb, str, '\"'));
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.a) {
            case 0:
                return null;
            default:
                return super.getCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r91(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r91(String str, int i) {
        super(str);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r91(String str) {
        super("Content-Encoding: " + str + " unsupported.");
        this.a = 8;
        str.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r91(String str, Throwable th) {
        super("Concurrent " + str + " attempts", th);
        this.a = 1;
        str.getClass();
    }
}
