package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class mu0 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mu0(long j, qg8 qg8Var, WritableByteChannel writableByteChannel) {
        this.a = 0;
        this.b = j;
        this.c = qg8Var;
        this.d = writableByteChannel;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) throws IOException {
        int iMax;
        int iMin;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                qg8 qg8Var = (qg8) obj3;
                WritableByteChannel writableByteChannel = (WritableByteChannel) obj2;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                byteBuffer.getClass();
                long j = this.b - qg8Var.a;
                if (j < byteBuffer.remaining()) {
                    int iLimit = byteBuffer.limit();
                    byteBuffer.limit(byteBuffer.position() + ((int) j));
                    while (byteBuffer.hasRemaining()) {
                        writableByteChannel.write(byteBuffer);
                    }
                    byteBuffer.limit(iLimit);
                    qg8Var.a += j;
                } else {
                    long jWrite = 0;
                    while (byteBuffer.hasRemaining()) {
                        jWrite += (long) writableByteChannel.write(byteBuffer);
                    }
                    qg8Var.a += jWrite;
                }
                return hebVar;
            case 1:
                aoa aoaVar = (aoa) obj2;
                r43 r43Var = (r43) obj;
                r43Var.getClass();
                List list = ((sia) obj3).d;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    tia tiaVar = (tia) list.get(i2);
                    if (tiaVar.h != null && (iMax = Math.max(aoaVar.d, tiaVar.d)) <= (iMin = Math.min(aoaVar.e - 1, tiaVar.e - 1))) {
                        int i3 = tiaVar.b;
                        t1c.U(r43Var, iMax - i3, iMin - i3, tiaVar.a, 0.0f, this.b, tiaVar.h);
                    }
                }
                return hebVar;
            default:
                f49 f49Var = (f49) obj3;
                ((u2b) obj).getClass();
                m62 m62Var = f49Var.b;
                b92 b92Var = m62Var.J;
                String str = f49Var.a;
                b92Var.S(str);
                int i4 = 0;
                for (Object obj4 : (List) obj2) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        gc1.i0();
                        throw null;
                    }
                    ll9 ll9Var = (ll9) obj4;
                    b92 b92Var2 = m62Var.J;
                    String strG = dx1.g(i4, str, "_");
                    String str2 = f49Var.a;
                    Map mapSingletonMap = Collections.singletonMap("raw", ll9Var.a);
                    mapSingletonMap.getClass();
                    String str3 = ll9Var.b;
                    String str4 = ll9Var.a;
                    m62 m62Var2 = m62Var;
                    long j2 = this.b;
                    b92Var2.n0(new uc2(strG, str2, mapSingletonMap, str3, str4, i4, j2, j2));
                    m62Var = m62Var2;
                    i4 = i5;
                }
                return hebVar;
        }
    }

    public /* synthetic */ mu0(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
