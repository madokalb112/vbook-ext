package defpackage;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jp8 implements k23 {
    public final /* synthetic */ a07 a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ m55 c;

    public jp8(a07 a07Var, a07 a07Var2, m55 m55Var) {
        this.a = a07Var;
        this.b = a07Var2;
        this.c = m55Var;
    }

    public final void F(h23 h23Var) {
        this.a.setValue(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [m55] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [lc3] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean O0(h23 h23Var) throws IOException {
        ?? arrayList;
        String string;
        this.a.setValue(Boolean.FALSE);
        ClipData clipData = h23Var.a.getClipData();
        if (clipData == null) {
            arrayList = lc3.a;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int itemCount = clipData.getItemCount();
            int i = 0;
            for (int i2 = 0; i2 < itemCount; i2++) {
                Uri uri = clipData.getItemAt(i2).getUri();
                if (uri != null) {
                    arrayList2.add(uri);
                }
            }
            arrayList = new ArrayList(gc1.M(arrayList2, 10));
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                Uri uri2 = (Uri) obj;
                Object slVar = null;
                if (lc5.Q(uri2.getScheme(), "content")) {
                    Context context = kl8.D;
                    context.getClass();
                    ContentResolver contentResolver = context.getContentResolver();
                    Cursor cursorQuery = contentResolver.query(uri2, new String[]{"_display_name"}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name")) : null;
                            cursorQuery.close();
                        } finally {
                        }
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        string = "";
                    }
                    if (bw9.a0(string)) {
                        string = xv5.l(System.currentTimeMillis(), "drag_");
                    }
                    File file = new File(qu1.a0(gx3.a).toFile(), "drag_and_drop");
                    file.mkdirs();
                    File file2 = new File(file, string);
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri2);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                p7c.U(inputStreamOpenInputStream, fileOutputStream);
                                fileOutputStream.close();
                                inputStreamOpenInputStream.close();
                                String str = zn7.b;
                                slVar = new fj7(xn7.e(file2));
                            } finally {
                            }
                        } finally {
                        }
                    }
                }
                if (slVar == null) {
                    String string2 = uri2.toString();
                    string2.getClass();
                    Context context2 = kl8.D;
                    context2.getClass();
                    slVar = new sl(context2, string2);
                }
                arrayList.add(slVar);
            }
        }
        this.c.a(arrayList);
        return true;
    }

    public final void l0(h23 h23Var) {
        this.b.setValue(Boolean.FALSE);
    }

    public final void s0(h23 h23Var) {
        this.a.setValue(Boolean.TRUE);
        this.b.setValue(Boolean.FALSE);
    }

    public final void v(h23 h23Var) {
        this.b.setValue(Boolean.TRUE);
    }
}
