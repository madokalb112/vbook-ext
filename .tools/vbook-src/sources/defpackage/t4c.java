package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t4c {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;

    public t4c(long j, int i, int i2, int i3, int i4, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        bArr.getClass();
        bArr2.getClass();
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = bArr;
        this.g = bArr2;
        this.h = bArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4c)) {
            return false;
        }
        t4c t4cVar = (t4c) obj;
        return this.a == t4cVar.a && this.b == t4cVar.b && this.c == t4cVar.c && this.d == t4cVar.d && this.e == t4cVar.e && lc5.Q(this.f, t4cVar.f) && lc5.Q(this.g, t4cVar.g) && this.h.equals(t4cVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + tw2.d(0, tw2.d(0, tw2.d(0, (Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + tw2.d(this.e, tw2.d(this.d, tw2.d(this.c, tw2.d(0, tw2.d(0, tw2.d(this.b, tw2.d(8, xv5.b(tw2.d(20, Integer.hashCode(788) * 31, 31), 31, this.a), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ZipEntry(versionMadeBy=788, extractVersion=20, headerOffset=" + this.a + ", compressionMethod=8, flags=" + this.b + ", date=0, time=0, crc32=" + this.c + ", compressedSize=" + this.d + ", uncompressedSize=" + this.e + ", nameBytes=" + Arrays.toString(this.f) + ", extraBytes=" + Arrays.toString(this.g) + ", diskNumberStart=0, internalAttributes=0, externalAttributes=0, commentBytes=" + Arrays.toString(this.h) + ')';
    }
}
