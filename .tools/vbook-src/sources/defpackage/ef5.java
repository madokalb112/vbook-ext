package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ef5 implements ja7 {
    public final /* synthetic */ int a;

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new cd3("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ka7 ka7Var = (ka7) obj2;
                ka7Var.add(j58.g, entry.getKey());
                ka7Var.add(j58.h, entry.getValue());
                return;
            default:
                throw new cd3("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
