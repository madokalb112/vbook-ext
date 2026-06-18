package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lf2 {
    public static final lf2 a = new lf2();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.InputStream a(java.lang.String r4) {
        /*
            java.lang.String r0 = "Current AssetManager is null."
            r1 = 0
            android.content.Context r2 = org.jetbrains.compose.resources.AndroidContextProvider.a     // Catch: java.io.FileNotFoundException -> L1c
            if (r2 == 0) goto Lc
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.io.FileNotFoundException -> L1c
            goto Ld
        Lc:
            r2 = r1
        Ld:
            if (r2 == 0) goto L16
            java.io.InputStream r2 = r2.open(r4)     // Catch: java.io.FileNotFoundException -> L1c
            if (r2 == 0) goto L16
            return r2
        L16:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L1c
            r2.<init>(r0)     // Catch: java.io.FileNotFoundException -> L1c
            throw r2     // Catch: java.io.FileNotFoundException -> L1c
        L1c:
            android.content.Context r2 = defpackage.pe.b()     // Catch: java.lang.NoClassDefFoundError -> L25 java.io.FileNotFoundException -> L3c
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.lang.NoClassDefFoundError -> L25 java.io.FileNotFoundException -> L3c
            goto L2d
        L25:
            java.lang.String r2 = "ResourceReader"
            java.lang.String r3 = "Android Instrumentation context is not available."
            android.util.Log.d(r2, r3)     // Catch: java.io.FileNotFoundException -> L3c
            r2 = r1
        L2d:
            if (r2 == 0) goto L36
            java.io.InputStream r2 = r2.open(r4)     // Catch: java.io.FileNotFoundException -> L3c
            if (r2 == 0) goto L36
            goto L6a
        L36:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L3c
            r2.<init>(r0)     // Catch: java.io.FileNotFoundException -> L3c
            throw r2     // Catch: java.io.FileNotFoundException -> L3c
        L3c:
            java.lang.Class<lf2> r0 = defpackage.lf2.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 == 0) goto L6b
            java.io.InputStream r2 = r0.getResourceAsStream(r4)
            if (r2 != 0) goto L6a
            android.content.Context r0 = org.jetbrains.compose.resources.AndroidContextProvider.a
            java.lang.String r1 = "Missing resource with path: "
            if (r0 != 0) goto L60
            e20 r0 = new e20
            java.lang.String r2 = ". Android context is not initialized. If it happens in the Preview mode then call PreviewContextConfigurationEffect() function."
            java.lang.String r4 = r4.concat(r2)
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        L60:
            e20 r0 = new e20
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        L6a:
            return r2
        L6b:
            java.lang.String r4 = "Cannot find class loader"
            gp.j(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf2.a(java.lang.String):java.io.InputStream");
    }

    public static Object b(String str) {
        InputStream inputStreamA = a(str);
        try {
            byte[] bArrD0 = p7c.d0(inputStreamA);
            inputStreamA.close();
            return bArrD0;
        } finally {
        }
    }
}
