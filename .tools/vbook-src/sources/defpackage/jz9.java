package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jz9 implements vq8 {
    public final hz9 a = new hz9();
    public final bbc b;

    public jz9() {
        new ConcurrentHashMap();
        this.b = new bbc(7);
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
        throw new UnsupportedOperationException();
    }
}
