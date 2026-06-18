package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ws0 extends wi2 {
    public final int f;

    public ws0() {
        super(2048);
        this.f = 4098;
    }

    @Override // defpackage.wi2
    public final void E(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.getClass();
        if (byteBuffer.capacity() != this.f) {
            gp.j("Check failed.");
        } else if (byteBuffer.isDirect()) {
            gp.j("Check failed.");
        }
    }

    @Override // defpackage.wi2
    public final Object p(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    @Override // defpackage.wi2
    public final Object q() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f);
        byteBufferAllocate.getClass();
        return byteBufferAllocate;
    }
}
