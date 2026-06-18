package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class yr1 {
    public static final as1 a;

    static {
        lc3 lc3Var = lc3.a;
        new as1("multipart", "*", lc3Var);
        new as1("multipart", "mixed", lc3Var);
        new as1("multipart", "alternative", lc3Var);
        new as1("multipart", "related", lc3Var);
        a = new as1("multipart", "form-data", lc3Var);
        new as1("multipart", "signed", lc3Var);
        new as1("multipart", "encrypted", lc3Var);
        new as1("multipart", "byteranges", lc3Var);
    }
}
