package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        boolean isIeOrMac = (platform.toUpperCase().contains("MAC")) &&
                (browser.toUpperCase().contains("IE"));

        if (isIeOrMac) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
