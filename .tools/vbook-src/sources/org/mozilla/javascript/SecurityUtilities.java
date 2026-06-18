package org.mozilla.javascript;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class SecurityUtilities {
    public static ProtectionDomain getProtectionDomain(final Class<?> cls) {
        return (ProtectionDomain) AccessController.doPrivileged(new PrivilegedAction<ProtectionDomain>() { // from class: org.mozilla.javascript.SecurityUtilities.2
            @Override // java.security.PrivilegedAction
            public ProtectionDomain run() {
                return cls.getProtectionDomain();
            }
        });
    }

    public static ProtectionDomain getScriptProtectionDomain() {
        final SecurityManager securityManager = System.getSecurityManager();
        if (securityManager instanceof RhinoSecurityManager) {
            return (ProtectionDomain) AccessController.doPrivileged(new PrivilegedAction<ProtectionDomain>() { // from class: org.mozilla.javascript.SecurityUtilities.3
                @Override // java.security.PrivilegedAction
                public ProtectionDomain run() {
                    Class<?> currentScriptClass = ((RhinoSecurityManager) securityManager).getCurrentScriptClass();
                    if (currentScriptClass == null) {
                        return null;
                    }
                    return currentScriptClass.getProtectionDomain();
                }
            });
        }
        return null;
    }

    public static String getSystemProperty(final String str) {
        return (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: org.mozilla.javascript.SecurityUtilities.1
            @Override // java.security.PrivilegedAction
            public String run() {
                return System.getProperty(str);
            }
        });
    }
}
