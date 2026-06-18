package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class rv3 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ a07 e;

    public /* synthetic */ rv3(a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4, int i) {
        this.a = i;
        this.b = a07Var;
        this.c = a07Var2;
        this.d = a07Var3;
        this.e = a07Var4;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        a07 a07Var = this.e;
        a07 a07Var2 = this.d;
        a07 a07Var3 = this.c;
        a07 a07Var4 = this.b;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                wx1.o0(this.b, this.c, this.d, this.e, "visual_single", uri != null ? gc1.Y(vo1.A(uri)) : null);
                break;
            case 1:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(gc1.M(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(vo1.A((Uri) it.next()));
                }
                wx1.o0(this.b, this.c, this.d, this.e, "visual_multiple", arrayList);
                break;
            case 2:
                Uri uri2 = (Uri) obj;
                wx1.o0(this.b, this.c, this.d, this.e, "file_single", uri2 != null ? gc1.Y(vo1.A(uri2)) : null);
                break;
            case 3:
                List list2 = (List) obj;
                list2.getClass();
                ArrayList arrayList2 = new ArrayList(gc1.M(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(vo1.A((Uri) it2.next()));
                }
                wx1.o0(this.b, this.c, this.d, this.e, "file_multiple", arrayList2);
                break;
            case 4:
                ((ac4) a07Var4.getValue()).g(Integer.valueOf((int) ((Float) obj).floatValue()), Integer.valueOf(((Number) a07Var3.getValue()).intValue()), Integer.valueOf(((Number) a07Var2.getValue()).intValue()), Integer.valueOf(((Number) a07Var.getValue()).intValue()));
                break;
            case 5:
                ((ac4) a07Var4.getValue()).g(Integer.valueOf(((Number) a07Var3.getValue()).intValue()), Integer.valueOf(((Number) a07Var2.getValue()).intValue()), Integer.valueOf((int) ((Float) obj).floatValue()), Integer.valueOf(((Number) a07Var.getValue()).intValue()));
                break;
            case 6:
                ((ac4) a07Var4.getValue()).g(Integer.valueOf(((Number) a07Var3.getValue()).intValue()), Integer.valueOf((int) ((Float) obj).floatValue()), Integer.valueOf(((Number) a07Var2.getValue()).intValue()), Integer.valueOf(((Number) a07Var.getValue()).intValue()));
                break;
            default:
                ((ac4) a07Var4.getValue()).g(Integer.valueOf(((Number) a07Var3.getValue()).intValue()), Integer.valueOf(((Number) a07Var2.getValue()).intValue()), Integer.valueOf(((Number) a07Var.getValue()).intValue()), Integer.valueOf((int) ((Float) obj).floatValue()));
                break;
        }
        return hebVar;
    }
}
