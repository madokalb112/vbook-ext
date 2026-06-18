package defpackage;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lj implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lj(int i, Object obj, Object obj2, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        int i2 = 10;
        boolean z = false;
        z = false;
        z = false;
        jt1 jt1Var = null;
        heb hebVar = heb.a;
        int i3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new ii((String) obj2, ((qj) obj).N(), i3);
            case 1:
                String str = (String) obj2;
                je3 je3Var = (je3) obj;
                m39[] m39VarArr = new m39[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    m39VarArr[i4] = fx1.A(str + '.' + je3Var.e[i4], qw9.f, new m39[0]);
                }
                return m39VarArr;
            case 2:
                Http2Connection http2Connection = (Http2Connection) obj2;
                ErrorCode errorCode = (ErrorCode) obj;
                Settings settings = Http2Connection.L;
                try {
                    http2Connection.I.R(i3, errorCode);
                    break;
                } catch (IOException e) {
                    ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.p(errorCode2, errorCode2, e);
                }
                return hebVar;
            case 3:
                ah1.J((vx1) obj2, null, null, new xq6((al7) obj, i3, jt1Var, z ? 1 : 0), 3);
                return hebVar;
            case 4:
                ah1.J((vx1) obj2, null, null, new qz4((st5) obj, i3, jt1Var, 4), 3);
                return hebVar;
            case 5:
                c17 c17Var = (c17) obj2;
                String str2 = ((w78) ((a17) ((br9) obj).getValue()).b.get(i3)).a;
                str2.getClass();
                za1 za1VarA = vtb.a(c17Var);
                aj2 aj2Var = rw2.a;
                c17Var.g(za1VarA, nh2.c, new y46(c17Var, str2, jt1Var, i2));
                return hebVar;
            case 6:
                zja zjaVar = (zja) obj2;
                sia siaVar = (sia) obj;
                if (i3 == zjaVar.a && siaVar.a <= zjaVar.b && siaVar.b >= zjaVar.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                ah1.J((vx1) obj2, null, null, new gh1((zk7) obj, i3, (jt1) null, 10), 3);
                return hebVar;
        }
    }

    public /* synthetic */ lj(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ lj(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
