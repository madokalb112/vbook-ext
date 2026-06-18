package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s30 implements ja7 {
    public static final s30 a = new s30();
    public static final ru3 b = ru3.c("clearBlob");
    public static final ru3 c = ru3.c("encryptedBlob");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        vk3 vk3Var = (vk3) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((c80) vk3Var).a);
        ka7Var.add(c, ((c80) vk3Var).b);
    }
}
