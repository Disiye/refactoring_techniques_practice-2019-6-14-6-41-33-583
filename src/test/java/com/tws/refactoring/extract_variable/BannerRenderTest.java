package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BannerRenderTest {
    @Test
    public void printOwing() {
        //Given
        String mac = "Mac";
        String ie = "IE";
        BannerRender bannerRender = new BannerRender();
        //When
        String result=  bannerRender.renderBanner(mac,ie);

        //Then
        assertEquals("IE on Mac?", result);
    }
}
