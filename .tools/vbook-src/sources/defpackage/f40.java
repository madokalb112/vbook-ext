package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f40 implements ja7 {
    public static final f40 a = new f40();
    public static final ru3 b = ru3.c("filename");
    public static final ru3 c = ru3.c("contents");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        dz1 dz1Var = (dz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((u60) dz1Var).a);
        ka7Var.add(c, ((u60) dz1Var).b);
    }
}
