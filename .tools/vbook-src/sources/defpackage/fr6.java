package defpackage;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class fr6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ fr6(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.d;
        int i3 = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((yb4) obj).invoke(Integer.valueOf(i3 - 1), Integer.valueOf(i2));
                break;
            case 1:
                ((yb4) obj).invoke(Integer.valueOf(i3 + 1), Integer.valueOf(i2));
                break;
            case 2:
                ((yb4) obj).invoke(Integer.valueOf(i3), Integer.valueOf(i2 - 1));
                break;
            case 3:
                ((yb4) obj).invoke(Integer.valueOf(i3), Integer.valueOf(i2 + 1));
                break;
            default:
                Http2Connection http2Connection = (Http2Connection) obj;
                try {
                    http2Connection.I.P(i3, i2, true);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.p(errorCode, errorCode, e);
                }
                break;
        }
        return hebVar;
    }
}
