package defpackage;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c02 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final b02 g = new b02();
    public static final di h = new di(7);
    public static final oy1 i = new oy1(2);
    public final AtomicInteger a = new AtomicInteger(0);
    public final fx3 b;
    public final k80 c;
    public final py1 d;

    public c02(fx3 fx3Var, k80 k80Var, py1 py1Var) {
        this.b = fx3Var;
        this.c = k80Var;
        this.d = py1Var;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        fx3 fx3Var = this.b;
        arrayList.addAll(fx3.f(((File) fx3Var.s).listFiles()));
        arrayList.addAll(fx3.f(((File) fx3Var.t).listFiles()));
        di diVar = h;
        Collections.sort(arrayList, diVar);
        List listF = fx3.f(((File) fx3Var.f).listFiles());
        Collections.sort(listF, diVar);
        arrayList.addAll(listF);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(fx3.f(((File) this.b.e).list())).descendingSet();
    }

    public final void d(vz1 vz1Var, String str, boolean z) {
        fx3 fx3Var = this.b;
        int i2 = this.c.c().a.b;
        g.getClass();
        try {
            f(fx3Var.c(str, xv5.p("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? "_" : "")), b02.a.p(vz1Var));
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        oy1 oy1Var = new oy1(3);
        fx3Var.getClass();
        File file = new File((File) fx3Var.e, str);
        file.mkdirs();
        List<File> listF = fx3.f(file.listFiles(oy1Var));
        Collections.sort(listF, new di(8));
        int size = listF.size();
        for (File file2 : listF) {
            if (size <= i2) {
                return;
            }
            fx3.e(file2);
            size--;
        }
    }
}
