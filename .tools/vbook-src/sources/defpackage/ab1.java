package defpackage;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class ab1 extends IOException {
    public ab1(File file) {
        super(new StringBuilder(file.toString()).toString());
    }

    public /* synthetic */ ab1(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public ab1(Throwable th) {
        super(th != null ? th.getMessage() : null, th);
    }
}
