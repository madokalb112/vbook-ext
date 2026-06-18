package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lz implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AsynchronousFileChannel b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;

    public /* synthetic */ lz(AsynchronousFileChannel asynchronousFileChannel, byte[] bArr, int i, int i2, long j, int i3) {
        this.a = i3;
        this.b = asynchronousFileChannel;
        this.c = bArr;
        this.d = i;
        this.e = i2;
        this.f = j;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.e;
        int i3 = this.d;
        byte[] bArr = this.c;
        switch (i) {
            case 0:
                AsynchronousFileChannel asynchronousFileChannel = this.b;
                CompletionHandler completionHandler = (CompletionHandler) obj;
                asynchronousFileChannel.getClass();
                bArr.getClass();
                completionHandler.getClass();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i3, i2);
                long j = this.f;
                heb hebVar = heb.a;
                asynchronousFileChannel.read(byteBufferWrap, j, hebVar, completionHandler);
                return hebVar;
            default:
                AsynchronousFileChannel asynchronousFileChannel2 = this.b;
                CompletionHandler completionHandler2 = (CompletionHandler) obj;
                asynchronousFileChannel2.getClass();
                bArr.getClass();
                completionHandler2.getClass();
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i3, i2);
                long j2 = this.f;
                heb hebVar2 = heb.a;
                asynchronousFileChannel2.write(byteBufferWrap2, j2, hebVar2, completionHandler2);
                return hebVar2;
        }
    }
}
