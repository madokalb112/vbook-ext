package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hpb implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ hpb(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                list.get(((Number) obj).intValue());
                return null;
            default:
                return "extension";
        }
    }
}
