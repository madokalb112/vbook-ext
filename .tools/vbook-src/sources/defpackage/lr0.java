package defpackage;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface lr0 extends ag9, WritableByteChannel {
    lr0 Q0(av0 av0Var);

    xq0 b();

    lr0 d0(String str);

    @Override // defpackage.ag9, java.io.Flushable
    void flush();

    lr0 k0(long j);

    lr0 write(byte[] bArr);

    lr0 writeByte(int i);

    lr0 writeInt(int i);

    lr0 writeShort(int i);
}
