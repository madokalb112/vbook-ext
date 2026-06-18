package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a40 implements ja7 {
    public static final a40 a = new a40();
    public static final ru3 b = ru3.c("arch");
    public static final ru3 c = ru3.c("libraryName");
    public static final ru3 d = ru3.c("buildId");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        az1 az1Var = (az1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((r60) az1Var).a);
        r60 r60Var = (r60) az1Var;
        ka7Var.add(c, r60Var.b);
        ka7Var.add(d, r60Var.c);
    }
}
