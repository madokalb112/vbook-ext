package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zvb extends th7 {
    public final ik4 a;

    public zvb() {
        new d6a(new ag0(21));
        StringBuilder sb = new StringBuilder();
        char[] cArr = x12.a;
        wq0 wq0Var = new wq0();
        while (true) {
            int i = 16;
            if (((int) wq0Var.c) >= 16) {
                sb.append(pc0.b(pc0.e, qn9.s(wq0Var, 16)));
                String string = sb.toString();
                fk4 fk4Var = new fk4(5);
                fk4Var.h("Upgrade", "websocket");
                fk4Var.h("Connection", "Upgrade");
                fk4Var.h("Sec-WebSocket-Key", string);
                fk4Var.h("Sec-WebSocket-Version", "13");
                this.a = fk4Var.I();
                return;
            }
            String str = (String) y11.a(q77.b.e());
            if (str == null) {
                q77.c.start();
                str = (String) ah1.S(hc3.a, new hc(2, i, null));
            }
            sg9.t(wq0Var, str);
        }
    }

    @Override // defpackage.wh7
    public final ek4 c() {
        return this.a;
    }

    public final String toString() {
        return "WebSocketContent";
    }
}
