package okhttp3;

import defpackage.he8;
import defpackage.tu1;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {
    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final boolean d() {
        return true;
    }

    @Override // okhttp3.RequestBody
    public final void e(he8 he8Var) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((FileDescriptor) null);
        try {
            he8Var.b.K0(tu1.l0(fileInputStream));
            fileInputStream.close();
        } finally {
        }
    }
}
