package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ge8 extends OutputStream {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public ge8(FileOutputStream fileOutputStream) {
        this.b = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.a) {
            case 0:
                ((he8) this.b).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                he8 he8Var = (he8) obj;
                if (!he8Var.c) {
                    he8Var.flush();
                }
                break;
            default:
                ((FileOutputStream) obj).flush();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((he8) this.b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a;
        Object obj = this.b;
        bArr.getClass();
        switch (i3) {
            case 0:
                he8 he8Var = (he8) obj;
                if (!he8Var.c) {
                    he8Var.b.write(bArr, i, i2);
                    he8Var.p();
                } else {
                    sy3.m("closed");
                }
                break;
            default:
                ((FileOutputStream) obj).write(bArr, i, i2);
                break;
        }
    }

    public ge8(he8 he8Var) {
        this.b = he8Var;
    }

    private final void p() {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        switch (this.a) {
            case 1:
                bArr.getClass();
                ((FileOutputStream) this.b).write(bArr);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                he8 he8Var = (he8) obj;
                if (!he8Var.c) {
                    he8Var.b.O0((byte) i);
                    he8Var.p();
                } else {
                    sy3.m("closed");
                }
                break;
            default:
                ((FileOutputStream) obj).write(i);
                break;
        }
    }
}
