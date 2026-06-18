package org.mozilla.javascript;

import org.mozilla.javascript.ContextFactory;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@Deprecated
public interface ContextListener extends ContextFactory.Listener {
    @Deprecated
    void contextEntered(Context context);

    @Deprecated
    void contextExited(Context context);
}
