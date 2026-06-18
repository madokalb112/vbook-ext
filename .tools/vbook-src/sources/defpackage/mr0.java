package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface mr0 extends il9, ReadableByteChannel {
    boolean H(long j, av0 av0Var);

    byte[] I();

    long N0();

    InputStream R0();

    String W(long j);

    void X(long j, xq0 xq0Var);

    xq0 b();

    boolean k();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    void skip(long j);

    void v(long j);

    String v0();

    av0 z(long j);
}
