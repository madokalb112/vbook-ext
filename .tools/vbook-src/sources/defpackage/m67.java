package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m67 extends UnsupportedOperationException {
    public final String a;

    public m67(gv4 gv4Var, a91 a91Var, a91 a91Var2) {
        this.a = cw9.t("\n        Expected response body of the type '" + a91Var2 + "' but was '" + a91Var + "'\n        In response from `" + gv4Var.p0().c().getUrl() + "`\n        Response status `" + gv4Var.e() + "`\n        Response header `ContentType: " + gv4Var.a().c("Content-Type") + "` \n        Request header `Accept: " + gv4Var.p0().c().a().c("Accept") + "`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
