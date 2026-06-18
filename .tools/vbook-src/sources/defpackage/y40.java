package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y40 implements ja7 {
    public static final y40 a = new y40();
    public static final ru3 b = ru3.c("platform");
    public static final ru3 c = ru3.c("version");
    public static final ru3 d = ru3.c("buildVersion");
    public static final ru3 e = ru3.c("jailbroken");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        wz1 wz1Var = (wz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((v70) wz1Var).a);
        v70 v70Var = (v70) wz1Var;
        ka7Var.add(c, v70Var.b);
        ka7Var.add(d, v70Var.c);
        ka7Var.add(e, v70Var.d);
    }
}
