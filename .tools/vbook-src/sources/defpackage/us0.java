package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class us0 implements il9 {
    public final /* synthetic */ int a;
    public final ByteBuffer b;
    public final int c;

    public us0(int i, ByteBuffer byteBuffer) {
        this.a = i;
        switch (i) {
            case 1:
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                this.b = byteBufferSlice;
                this.c = byteBufferSlice.capacity();
                break;
            default:
                ByteBuffer byteBufferSlice2 = byteBuffer.slice();
                this.b = byteBufferSlice2;
                this.c = byteBufferSlice2.capacity();
                break;
        }
    }

    @Override // defpackage.il9
    public final long D0(long j, xq0 xq0Var) {
        int i = this.a;
        int i2 = this.c;
        ByteBuffer byteBuffer = this.b;
        switch (i) {
            case 0:
                if (byteBuffer.position() != i2) {
                    int iPosition = (int) (((long) byteBuffer.position()) + j);
                    if (iPosition <= i2) {
                        i2 = iPosition;
                    }
                    byteBuffer.limit(i2);
                    break;
                }
                break;
            default:
                xq0Var.getClass();
                if (byteBuffer.position() != i2) {
                    int iPosition2 = (int) (((long) byteBuffer.position()) + j);
                    if (iPosition2 <= i2) {
                        i2 = iPosition2;
                    }
                    byteBuffer.limit(i2);
                    byteBuffer.getClass();
                    break;
                }
                break;
        }
        return xq0Var.write(byteBuffer);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
    }

    @Override // defpackage.il9
    public final uua l() {
        int i = this.a;
        return uua.d;
    }

    private final void p() {
    }

    private final void q() {
    }
}
