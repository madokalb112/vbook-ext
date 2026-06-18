package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bb8 implements nw3 {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public ab8 b;

    public bb8(File file) {
        this.a = file;
    }

    public final void a() {
        File file = this.a;
        if (this.b == null) {
            try {
                this.b = new ab8(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    @Override // defpackage.nw3
    public final void b() {
        gc1.L(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // defpackage.nw3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c() {
        /*
            r6 = this;
            java.io.File r0 = r6.a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r6 = r2
            goto L3a
        Lc:
            r6.a()
            ab8 r0 = r6.b
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r1}
            int r0 = r0.g0()
            byte[] r0 = new byte[r0]
            ab8 r6 = r6.b     // Catch: java.io.IOException -> L2b
            ab6 r4 = new ab6     // Catch: java.io.IOException -> L2b
            r5 = 20
            r4.<init>(r5, r0, r3)     // Catch: java.io.IOException -> L2b
            r6.A(r4)     // Catch: java.io.IOException -> L2b
            goto L33
        L2b:
            r6 = move-exception
            java.lang.String r4 = "A problem occurred while reading the Crashlytics log file."
            java.lang.String r5 = "FirebaseCrashlytics"
            android.util.Log.e(r5, r4, r6)
        L33:
            ts0 r6 = new ts0
            r3 = r3[r1]
            r6.<init>(r0, r3)
        L3a:
            if (r6 != 0) goto L3e
            r3 = r2
            goto L47
        L3e:
            int r0 = r6.b
            byte[] r3 = new byte[r0]
            byte[] r6 = r6.a
            java.lang.System.arraycopy(r6, r1, r3, r1, r0)
        L47:
            if (r3 == 0) goto L51
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r0 = defpackage.bb8.c
            r6.<init>(r3, r0)
            return r6
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb8.c():java.lang.String");
    }

    @Override // defpackage.nw3
    public final void f(long j, String str) {
        a();
        if (this.b == null) {
            return;
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - 16384));
            }
            this.b.p(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(c));
            while (!this.b.E() && this.b.g0() > 65536) {
                this.b.R();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }
}
