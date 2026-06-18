package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f60 implements ja7 {
    public static final f60 a = new f60();
    public static final ru3 b = ru3.c("sessionId");
    public static final ru3 c = ru3.c("firstSessionId");
    public static final ru3 d = ru3.c("sessionIndex");
    public static final ru3 e = ru3.c("eventTimestampUs");
    public static final ru3 f = ru3.c("dataCollectionStatus");
    public static final ru3 g = ru3.c("firebaseInstallationId");
    public static final ru3 h = ru3.c("firebaseAuthenticationToken");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        p59 p59Var = (p59) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, p59Var.a);
        ka7Var.add(c, p59Var.b);
        ka7Var.add(d, p59Var.c);
        ka7Var.add(e, p59Var.d);
        ka7Var.add(f, p59Var.e);
        ka7Var.add(g, p59Var.f);
        ka7Var.add(h, p59Var.g);
    }
}
