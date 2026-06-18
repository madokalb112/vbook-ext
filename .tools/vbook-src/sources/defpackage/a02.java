package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a02 {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final yx4 b;
    public final ht c;
    public final ab6 d;
    public final k80 e;

    static {
        HashMap map = new HashMap();
        f = map;
        ky0.x(5, map, "armeabi", 6, "armeabi-v7a");
        ky0.x(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.0.5";
    }

    public a02(Context context, yx4 yx4Var, ht htVar, ab6 ab6Var, k80 k80Var) {
        this.a = context;
        this.b = yx4Var;
        this.c = htVar;
        this.d = ab6Var;
        this.e = k80Var;
    }

    public static g70 c(s16 s16Var, int i) {
        String str = (String) s16Var.c;
        String str2 = (String) s16Var.b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) s16Var.d;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        s16 s16Var2 = (s16) s16Var.e;
        if (i >= 8) {
            s16 s16Var3 = s16Var2;
            while (s16Var3 != null) {
                s16Var3 = (s16) s16Var3.e;
                i2++;
            }
        }
        int i3 = i2;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            k27.n("Null frames");
            return null;
        }
        byte b = (byte) (0 | 1);
        g70 g70VarC = (s16Var2 == null || i3 != 0) ? null : c(s16Var2, i + 1);
        if (b == 1) {
            return new g70(str, str2, listD, g70VarC, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        gp.j(ky0.t("Missing required properties:", sb));
        return null;
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            j70 j70Var = new j70();
            j70Var.e = i;
            j70Var.f = (byte) (j70Var.f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            j70Var.a = jMax;
            byte b = (byte) (j70Var.f | 1);
            j70Var.b = str;
            j70Var.c = fileName;
            j70Var.d = lineNumber;
            j70Var.f = (byte) (b | 2);
            arrayList.add(j70Var.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static h70 e() {
        return new h70(0L, "0", "0");
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        ht htVar = this.c;
        String str = htVar.e;
        if (str == null) {
            k27.n("Null name");
            return null;
        }
        String str2 = htVar.b;
        if (b == 3) {
            return Collections.singletonList(new f70(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        gp.j(ky0.t("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.o70 b(int r17) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a02.b(int):o70");
    }
}
