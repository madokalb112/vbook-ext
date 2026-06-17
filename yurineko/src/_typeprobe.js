function execute() {
    var out = {};
    try { out.atob = typeof atob; } catch (e) { out.atob = 'ERR'; }
    try { out.btoa = typeof btoa; } catch (e2) { out.btoa = 'ERR'; }
    try { out.java = typeof java; } catch (e3) { out.java = 'ERR'; }
    try { out.Packages = typeof Packages; } catch (e4) { out.Packages = 'ERR'; }
    try { out.Java = typeof Java; } catch (e5) { out.Java = 'ERR'; }
    try { out.android = typeof android; } catch (e6) { out.android = 'ERR'; }
    return Response.success(out);
}
