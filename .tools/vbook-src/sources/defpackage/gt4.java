package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class gt4 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HashMap b;

    public /* synthetic */ gt4(HashMap map, int i) {
        this.a = i;
        this.b = map;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        HashMap map = this.b;
        String str = (String) obj;
        List list = (List) obj2;
        switch (i) {
            case 0:
                str.getClass();
                list.getClass();
                String lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String str2 = (String) fc1.z0(list);
                map.put(lowerCase, str2 != null ? str2 : "");
                break;
            default:
                str.getClass();
                list.getClass();
                String lowerCase2 = str.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                String str3 = (String) fc1.z0(list);
                map.put(lowerCase2, str3 != null ? str3 : "");
                break;
        }
        return hebVar;
    }
}
