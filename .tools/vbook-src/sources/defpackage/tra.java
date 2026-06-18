package defpackage;

import android.content.Context;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class tra implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;

    public /* synthetic */ tra(int i, kb4 kb4Var) {
        this.a = i;
        this.b = kb4Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.b;
        switch (i) {
            case 0:
                bi5 bi5Var = (bi5) obj;
                if (bi5Var != null) {
                    kb4Var.invoke(bi5Var);
                }
                return hebVar;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                kb4Var.invoke(bool);
                return hebVar;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                kb4Var.invoke(bool2);
                return hebVar;
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                kb4Var.invoke(bool3);
                return hebVar;
            case 4:
                Integer num = (Integer) obj;
                num.intValue();
                kb4Var.invoke(num);
                return hebVar;
            case 5:
                kra kraVar = (kra) obj;
                kraVar.getClass();
                kb4Var.invoke(kraVar);
                return hebVar;
            case 6:
                Integer num2 = (Integer) obj;
                num2.intValue();
                kb4Var.invoke(num2);
                return hebVar;
            case 7:
                Float f = (Float) obj;
                f.floatValue();
                kb4Var.invoke(f);
                return hebVar;
            case 8:
                String str = (String) obj;
                str.getClass();
                kb4Var.invoke(str);
                return hebVar;
            case 9:
                String str2 = (String) obj;
                str2.getClass();
                kb4Var.invoke(str2);
                return hebVar;
            case 10:
                String str3 = (String) obj;
                str3.getClass();
                kb4Var.invoke(str3);
                return hebVar;
            case 11:
                List list = (List) obj;
                list.getClass();
                kb4Var.invoke(list);
                return hebVar;
            default:
                Context context = (Context) obj;
                context.getClass();
                File file = (File) kb4Var.invoke(context);
                file.getClass();
                String absolutePath = file.getAbsolutePath();
                absolutePath.getClass();
                return new af(anb.b(absolutePath)).k();
        }
    }
}
