function execute() {
    var out = {};
    try { out.atob = typeof atob; } catch (e) { out.atob = 'ERR:' + e; }
    try { out.btoa = typeof btoa; } catch (e2) { out.btoa = 'ERR:' + e2; }
    try { out.java = typeof java; } catch (e3) { out.java = 'ERR:' + e3; }
    try { out.Packages = typeof Packages; } catch (e4) { out.Packages = 'ERR:' + e4; }
    try { out.Java = typeof Java; } catch (e5) { out.Java = 'ERR:' + e5; }
    try { out.android = typeof android; } catch (e6) { out.android = 'ERR:' + e6; }
    try { out.jBase64 = '' + java.util.Base64.getDecoder().decode('UklGRg==').length; } catch (e7) { out.jBase64 = 'ERR:' + e7; }
    try { out.aBase64 = '' + android.util.Base64.decode('UklGRg==', 0).length; } catch (e8) { out.aBase64 = 'ERR:' + e8; }
    try { out.PBase64 = '' + Packages.java.util.Base64.getDecoder().decode('UklGRg==').length; } catch (e9) { out.PBase64 = 'ERR:' + e9; }
    return Response.success(out);
}
