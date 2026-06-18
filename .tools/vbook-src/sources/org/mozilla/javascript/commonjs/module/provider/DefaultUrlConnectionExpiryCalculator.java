package org.mozilla.javascript.commonjs.module.provider;

import java.io.Serializable;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class DefaultUrlConnectionExpiryCalculator implements UrlConnectionExpiryCalculator, Serializable {
    private static final long serialVersionUID = 1;
    private final long relativeExpiry;

    public DefaultUrlConnectionExpiryCalculator(long j) {
        if (j >= 0) {
            this.relativeExpiry = j;
        } else {
            gp.l("relativeExpiry < 0");
            throw null;
        }
    }

    @Override // org.mozilla.javascript.commonjs.module.provider.UrlConnectionExpiryCalculator
    public long calculateExpiry(URLConnection uRLConnection) {
        return System.currentTimeMillis() + this.relativeExpiry;
    }

    public DefaultUrlConnectionExpiryCalculator() {
        this(60000L);
    }
}
