package defpackage;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p77 extends o1a implements yb4 {
    public h11 a;
    public ArrayList b;
    public SecureRandom c;
    public SecureRandom d;
    public byte[] e;
    public byte[] f;
    public List s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new p77(2, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((p77) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Path cross not found for [B:83:0x004f, B:19:0x0058], limit reached: 99 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0 A[Catch: all -> 0x0034, LOOP:1: B:37:0x00ce->B:38:0x00d0, LOOP_END, TryCatch #0 {all -> 0x0034, blocks: (B:6:0x0020, B:62:0x0180, B:68:0x01ad, B:70:0x01bc, B:36:0x00c6, B:38:0x00d0, B:39:0x00d9, B:41:0x00e5, B:43:0x00f6, B:45:0x0108, B:46:0x0122, B:50:0x0139, B:53:0x0144, B:59:0x0151, B:60:0x0165, B:42:0x00f3), top: B:81:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:6:0x0020, B:62:0x0180, B:68:0x01ad, B:70:0x01bc, B:36:0x00c6, B:38:0x00d0, B:39:0x00d9, B:41:0x00e5, B:43:0x00f6, B:45:0x0108, B:46:0x0122, B:50:0x0139, B:53:0x0144, B:59:0x0151, B:60:0x0165, B:42:0x00f3), top: B:81:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:6:0x0020, B:62:0x0180, B:68:0x01ad, B:70:0x01bc, B:36:0x00c6, B:38:0x00d0, B:39:0x00d9, B:41:0x00e5, B:43:0x00f6, B:45:0x0108, B:46:0x0122, B:50:0x0139, B:53:0x0144, B:59:0x0151, B:60:0x0165, B:42:0x00f3), top: B:81:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108 A[Catch: all -> 0x0034, LOOP:2: B:44:0x0106->B:45:0x0108, LOOP_END, TryCatch #0 {all -> 0x0034, blocks: (B:6:0x0020, B:62:0x0180, B:68:0x01ad, B:70:0x01bc, B:36:0x00c6, B:38:0x00d0, B:39:0x00d9, B:41:0x00e5, B:43:0x00f6, B:45:0x0108, B:46:0x0122, B:50:0x0139, B:53:0x0144, B:59:0x0151, B:60:0x0165, B:42:0x00f3), top: B:81:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0165 A[ADDED_TO_REGION, Catch: all -> 0x0034, EDGE_INSN: B:60:0x0165->B:61:0x017e BREAK  A[LOOP:3: B:51:0x0140->B:59:0x0151], TryCatch #0 {all -> 0x0034, blocks: (B:6:0x0020, B:62:0x0180, B:68:0x01ad, B:70:0x01bc, B:36:0x00c6, B:38:0x00d0, B:39:0x00d9, B:41:0x00e5, B:43:0x00f6, B:45:0x0108, B:46:0x0122, B:50:0x0139, B:53:0x0144, B:59:0x0151, B:60:0x0165, B:42:0x00f3), top: B:81:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0180 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:6:0x0020, B:62:0x0180, B:68:0x01ad, B:70:0x01bc, B:36:0x00c6, B:38:0x00d0, B:39:0x00d9, B:41:0x00e5, B:43:0x00f6, B:45:0x0108, B:46:0x0122, B:50:0x0139, B:53:0x0144, B:59:0x0151, B:60:0x0165, B:42:0x00f3), top: B:81:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01a5 -> B:66:0x01a8). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p77.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
