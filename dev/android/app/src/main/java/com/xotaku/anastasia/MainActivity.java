package com.xotaku.anastasia;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

import com.getcapacitor.BridgeActivity;
import com.getcapacitor.BridgeWebViewClient;

import java.util.Locale;

public class MainActivity extends BridgeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bridge.setWebViewClient(new BridgeWebViewClient(bridge) {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Uri url = request.getUrl();
                String host = url.getHost();

                if ("https".equalsIgnoreCase(url.getScheme()) && host != null) {
                    host = host.toLowerCase(Locale.ROOT);

                    if (host.equals("xotaku.com") || host.endsWith(".xotaku.com")) {
                        return false;
                    }
                }

                return super.shouldOverrideUrlLoading(view, request);
            }
        });
    }
}
