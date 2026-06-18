package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g17 implements vq8 {
    public final f17 a = new f17();
    public final g83 b;

    public g17() {
        new ConcurrentHashMap();
        this.b = new g83(29);
    }

    @Override // defpackage.vq8
    public final j76 a() {
        return this.b;
    }

    @Override // defpackage.vq8
    public final ow4 b() {
        return this.a;
    }

    @Override // defpackage.vq8
    public final String c() {
        return "2.0.99";
    }
}
