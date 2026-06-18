package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Slot;
import org.mozilla.javascript.SlotMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class w58 implements os3, ll2, h03, zq8, eq1, SlotMap.SlotComputer, Continuation {
    public final /* synthetic */ int a;

    public static /* synthetic */ void a() {
        throw new AssertionError();
    }

    public static /* synthetic */ void f(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void g(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void h(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void i(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void k(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void l(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void n(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void o(Throwable th) {
        throw new IllegalStateException(th);
    }

    public static /* synthetic */ void p() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void q(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void r(Object obj, Object obj2, String str) {
        throw new fi1(str + obj + obj2);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public void accept(Object obj) {
        ((yr8) obj).b.getClass();
    }

    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                y91 y91VarA = b90.a();
                y91VarA.Z(cursorRawQuery.getString(1));
                y91VarA.d = t28.b(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                y91VarA.c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(y91VarA.j());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // defpackage.os3
    public ls3[] b() {
        return new ls3[]{new y58()};
    }

    @Override // org.mozilla.javascript.SlotMap.SlotComputer
    public Slot compute(Object obj, int i, Slot slot) {
        switch (this.a) {
            case 17:
                return ScriptableObject.checkSlotRemoval(obj, i, slot);
            case 18:
                return ScriptableObject.ensureLazySlot(obj, i, slot);
            case 19:
                return ScriptableObject.ensureAccessorSlot(obj, i, slot);
            default:
                return ScriptableObject.ensureLambdaSlot(obj, i, slot);
        }
    }

    @Override // defpackage.ll2
    public void e(s58 s58Var) {
        s58Var.get().getClass();
        throw new ClassCastException();
    }

    public Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            o60 o60Var = (o60) task.getResult();
            js8 js8Var = js8.f;
            js8Var.m("Crashlytics report successfully enqueued to DataTransport: " + o60Var.b);
            File file = o60Var.c;
            z = true;
            if (file.delete()) {
                js8Var.m("Deleted report file: " + file.getPath());
            } else {
                js8Var.z("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ w58(int i) {
        this.a = i;
    }

    public double c(double d) {
        return d;
    }
}
