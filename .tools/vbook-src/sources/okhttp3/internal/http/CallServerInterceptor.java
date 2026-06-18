package okhttp3.internal.http;

import okhttp3.Interceptor;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class CallServerInterceptor implements Interceptor {
    public static final CallServerInterceptor a = new CallServerInterceptor();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0198 A[Catch: IOException -> 0x013d, TryCatch #7 {IOException -> 0x013d, blocks: (B:78:0x012e, B:80:0x0137, B:83:0x0140, B:95:0x018c, B:100:0x0198, B:106:0x01a6, B:107:0x01ad, B:109:0x01b0, B:112:0x01bc, B:118:0x01ca, B:120:0x01fd, B:122:0x020e, B:125:0x0218, B:132:0x022d, B:135:0x023a, B:136:0x025e, B:127:0x021e, B:119:0x01e8, B:91:0x0167, B:93:0x0170, B:94:0x0173), top: B:153:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b0 A[Catch: IOException -> 0x013d, TryCatch #7 {IOException -> 0x013d, blocks: (B:78:0x012e, B:80:0x0137, B:83:0x0140, B:95:0x018c, B:100:0x0198, B:106:0x01a6, B:107:0x01ad, B:109:0x01b0, B:112:0x01bc, B:118:0x01ca, B:120:0x01fd, B:122:0x020e, B:125:0x0218, B:132:0x022d, B:135:0x023a, B:136:0x025e, B:127:0x021e, B:119:0x01e8, B:91:0x0167, B:93:0x0170, B:94:0x0173), top: B:153:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e8 A[Catch: IOException -> 0x013d, TryCatch #7 {IOException -> 0x013d, blocks: (B:78:0x012e, B:80:0x0137, B:83:0x0140, B:95:0x018c, B:100:0x0198, B:106:0x01a6, B:107:0x01ad, B:109:0x01b0, B:112:0x01bc, B:118:0x01ca, B:120:0x01fd, B:122:0x020e, B:125:0x0218, B:132:0x022d, B:135:0x023a, B:136:0x025e, B:127:0x021e, B:119:0x01e8, B:91:0x0167, B:93:0x0170, B:94:0x0173), top: B:153:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020e A[Catch: IOException -> 0x013d, TryCatch #7 {IOException -> 0x013d, blocks: (B:78:0x012e, B:80:0x0137, B:83:0x0140, B:95:0x018c, B:100:0x0198, B:106:0x01a6, B:107:0x01ad, B:109:0x01b0, B:112:0x01bc, B:118:0x01ca, B:120:0x01fd, B:122:0x020e, B:125:0x0218, B:132:0x022d, B:135:0x023a, B:136:0x025e, B:127:0x021e, B:119:0x01e8, B:91:0x0167, B:93:0x0170, B:94:0x0173), top: B:153:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021e A[Catch: IOException -> 0x013d, TryCatch #7 {IOException -> 0x013d, blocks: (B:78:0x012e, B:80:0x0137, B:83:0x0140, B:95:0x018c, B:100:0x0198, B:106:0x01a6, B:107:0x01ad, B:109:0x01b0, B:112:0x01bc, B:118:0x01ca, B:120:0x01fd, B:122:0x020e, B:125:0x0218, B:132:0x022d, B:135:0x023a, B:136:0x025e, B:127:0x021e, B:119:0x01e8, B:91:0x0167, B:93:0x0170, B:94:0x0173), top: B:153:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022d A[Catch: IOException -> 0x013d, TryCatch #7 {IOException -> 0x013d, blocks: (B:78:0x012e, B:80:0x0137, B:83:0x0140, B:95:0x018c, B:100:0x0198, B:106:0x01a6, B:107:0x01ad, B:109:0x01b0, B:112:0x01bc, B:118:0x01ca, B:120:0x01fd, B:122:0x020e, B:125:0x0218, B:132:0x022d, B:135:0x023a, B:136:0x025e, B:127:0x021e, B:119:0x01e8, B:91:0x0167, B:93:0x0170, B:94:0x0173), top: B:153:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0267 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0170 A[Catch: IOException -> 0x013d, TryCatch #7 {IOException -> 0x013d, blocks: (B:78:0x012e, B:80:0x0137, B:83:0x0140, B:95:0x018c, B:100:0x0198, B:106:0x01a6, B:107:0x01ad, B:109:0x01b0, B:112:0x01bc, B:118:0x01ca, B:120:0x01fd, B:122:0x020e, B:125:0x0218, B:132:0x022d, B:135:0x023a, B:136:0x025e, B:127:0x021e, B:119:0x01e8, B:91:0x0167, B:93:0x0170, B:94:0x0173), top: B:153:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0195  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.CallServerInterceptor.a(okhttp3.internal.http.RealInterceptorChain):okhttp3.Response");
    }
}
