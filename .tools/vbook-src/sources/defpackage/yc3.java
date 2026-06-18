package defpackage;

import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yc3 extends o1a implements yb4 {
    public ByteBuffer a;
    public ByteBuffer b;
    public Inflater c;
    public CRC32 d;
    public pg8 e;
    public pg8 f;
    public short s;
    public byte t;
    public byte u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ ut0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc3(boolean z, ut0 ut0Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.y = z;
        this.z = ut0Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        yc3 yc3Var = new yc3(this.y, this.z, jt1Var);
        yc3Var.x = obj;
        return yc3Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((yc3) create((i3c) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0194, code lost:
    
        if (defpackage.m79.B(r7, 2, r18) == r8) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01de A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:7:0x0026, B:92:0x0291, B:86:0x026c, B:88:0x0272, B:94:0x02aa, B:96:0x02b2, B:98:0x02d2, B:101:0x02d7, B:102:0x02fb, B:103:0x02fc, B:104:0x0303, B:105:0x0304, B:106:0x0327, B:107:0x0328, B:111:0x033c, B:112:0x0343, B:72:0x0211, B:74:0x0217, B:76:0x021d, B:82:0x025d, B:64:0x01d8, B:66:0x01de, B:69:0x01f7, B:71:0x01ff, B:83:0x0262, B:85:0x0268, B:113:0x0344, B:17:0x0055, B:63:0x01d1), top: B:122:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ff A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:7:0x0026, B:92:0x0291, B:86:0x026c, B:88:0x0272, B:94:0x02aa, B:96:0x02b2, B:98:0x02d2, B:101:0x02d7, B:102:0x02fb, B:103:0x02fc, B:104:0x0303, B:105:0x0304, B:106:0x0327, B:107:0x0328, B:111:0x033c, B:112:0x0343, B:72:0x0211, B:74:0x0217, B:76:0x021d, B:82:0x025d, B:64:0x01d8, B:66:0x01de, B:69:0x01f7, B:71:0x01ff, B:83:0x0262, B:85:0x0268, B:113:0x0344, B:17:0x0055, B:63:0x01d1), top: B:122:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0217 A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:7:0x0026, B:92:0x0291, B:86:0x026c, B:88:0x0272, B:94:0x02aa, B:96:0x02b2, B:98:0x02d2, B:101:0x02d7, B:102:0x02fb, B:103:0x02fc, B:104:0x0303, B:105:0x0304, B:106:0x0327, B:107:0x0328, B:111:0x033c, B:112:0x0343, B:72:0x0211, B:74:0x0217, B:76:0x021d, B:82:0x025d, B:64:0x01d8, B:66:0x01de, B:69:0x01f7, B:71:0x01ff, B:83:0x0262, B:85:0x0268, B:113:0x0344, B:17:0x0055, B:63:0x01d1), top: B:122:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0262 A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:7:0x0026, B:92:0x0291, B:86:0x026c, B:88:0x0272, B:94:0x02aa, B:96:0x02b2, B:98:0x02d2, B:101:0x02d7, B:102:0x02fb, B:103:0x02fc, B:104:0x0303, B:105:0x0304, B:106:0x0327, B:107:0x0328, B:111:0x033c, B:112:0x0343, B:72:0x0211, B:74:0x0217, B:76:0x021d, B:82:0x025d, B:64:0x01d8, B:66:0x01de, B:69:0x01f7, B:71:0x01ff, B:83:0x0262, B:85:0x0268, B:113:0x0344, B:17:0x0055, B:63:0x01d1), top: B:122:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0272 A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:7:0x0026, B:92:0x0291, B:86:0x026c, B:88:0x0272, B:94:0x02aa, B:96:0x02b2, B:98:0x02d2, B:101:0x02d7, B:102:0x02fb, B:103:0x02fc, B:104:0x0303, B:105:0x0304, B:106:0x0327, B:107:0x0328, B:111:0x033c, B:112:0x0343, B:72:0x0211, B:74:0x0217, B:76:0x021d, B:82:0x025d, B:64:0x01d8, B:66:0x01de, B:69:0x01f7, B:71:0x01ff, B:83:0x0262, B:85:0x0268, B:113:0x0344, B:17:0x0055, B:63:0x01d1), top: B:122:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01fd -> B:64:0x01d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01ff -> B:72:0x0211). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x023b -> B:80:0x0242). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0290 -> B:92:0x0291). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
