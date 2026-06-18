package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public enum inb {
    READ("rb", false, Token.IMPORT),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE("r+b", true, 120),
    APPEND("a+b", true, 88),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_OR_TRUNCATE("w+b", true, Token.ASSIGN_MOD),
    CREATE("w+b", true, 120),
    CREATE_NEW("w+b", true, Token.IMPORT);

    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    inb(String str, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        boolean z4 = (i & 32) == 0;
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }
}
